package xsna;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: MediaCodecEncoderSelectorSmart.kt */
/* loaded from: classes3.dex */
public final class fq10 {
    public final f100 a;
    public final boolean b;

    public fq10(f100 f100Var, boolean z) {
        this.a = f100Var;
        this.b = z;
    }

    public static int a(int i, int i2) {
        if (i % 10 != 1) {
            return i2 * ((int) Math.rint(i / i2));
        }
        return (int) (i2 * ((float) Math.floor(i / r3)));
    }

    public static ArrayList b(List list, izs izsVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = Integer.MAX_VALUE;
        while (it.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            int intValue = ((Number) izsVar.invoke(mediaCodecInfo)).intValue();
            if (intValue != Integer.MAX_VALUE) {
                if (intValue < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = intValue;
                } else if (intValue == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return arrayList;
    }

    public static int c(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfo.getCapabilitiesForType(str).profileLevels;
        int i = -1;
        int i2 = 0;
        while (true) {
            if (!(i2 < codecProfileLevelArr.length)) {
                return i;
            }
            int i3 = i2 + 1;
            try {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i2];
                if (codecProfileLevel.profile == 8) {
                    i = Math.max(i, codecProfileLevel.level);
                }
                i2 = i3;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
    }

    public static Size d(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int a = a(i, widthAlignment);
        int a2 = a(i2, heightAlignment);
        if (e(videoCapabilities, a, a2)) {
            return new Size(a, a2);
        }
        for (float f = 0.99f; f >= 0.25f; f -= 0.01f) {
            int a3 = a((int) Math.rint(i * f), widthAlignment);
            int a4 = a((int) Math.rint(i2 * f), heightAlignment);
            if (e(videoCapabilities, a3, a4)) {
                return new Size(a3, a4);
            }
        }
        Integer clamp = videoCapabilities.getSupportedHeightsFor(videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i)).intValue()).clamp(Integer.valueOf(i2));
        if (clamp == null || clamp.intValue() != i2) {
            i = a((int) Math.rint((i * clamp.intValue()) / i2), widthAlignment);
            i2 = a(clamp.intValue(), heightAlignment);
        }
        if (e(videoCapabilities, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    public static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        if (videoCapabilities.isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080 && CamcorderProfile.hasProfile(6)) {
            return true;
        }
        return i == 3840 && i2 == 2160 && CamcorderProfile.hasProfile(8);
    }
}
