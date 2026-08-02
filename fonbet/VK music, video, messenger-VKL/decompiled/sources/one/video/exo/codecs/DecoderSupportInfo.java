package one.video.exo.codecs;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Log;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;
import xsna.asp;
import xsna.b1h;
import xsna.bpn0;
import xsna.brm0;
import xsna.dof;
import xsna.epx;
import xsna.mnh0;
import xsna.ncg;
import xsna.pce;
import xsna.shy;
import xsna.sl9;
import xsna.zrp;

/* compiled from: DecoderSupportInfo.kt */
/* loaded from: classes8.dex */
public final class DecoderSupportInfo {
    public final String a;
    public final bpn0 b = new bpn0(new pce(this, 17));
    public final bpn0 c = new bpn0(new dof(this, 15));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DecoderSupportInfo.kt */
    public static final class CodecFormat {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CodecFormat[] $VALUES;
        public static final CodecFormat AV1;
        public static final a Companion;
        public static final CodecFormat H264;
        public static final CodecFormat UNKNOWN;
        public static final CodecFormat VP9;
        private final String[] mimeType;

        /* compiled from: DecoderSupportInfo.kt */
        public static final class a {
        }

        static {
            CodecFormat codecFormat = new CodecFormat("AV1", 0, PeerVideoSettingsBitrateTable.CODEC_AV1);
            AV1 = codecFormat;
            CodecFormat codecFormat2 = new CodecFormat("VP9", 1, PeerVideoSettingsBitrateTable.CODEC_VP9);
            VP9 = codecFormat2;
            CodecFormat codecFormat3 = new CodecFormat(PeerConnectionClient.VIDEO_CODEC_H264, 2, "h264", "avc");
            H264 = codecFormat3;
            CodecFormat codecFormat4 = new CodecFormat(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, new String[0]);
            UNKNOWN = codecFormat4;
            CodecFormat[] codecFormatArr = {codecFormat, codecFormat2, codecFormat3, codecFormat4};
            $VALUES = codecFormatArr;
            $ENTRIES = new asp(codecFormatArr);
            Companion = new a();
        }

        public CodecFormat(String str, int i, String... strArr) {
            this.mimeType = strArr;
        }

        public static zrp<CodecFormat> h() {
            return $ENTRIES;
        }

        public static CodecFormat valueOf(String str) {
            return (CodecFormat) Enum.valueOf(CodecFormat.class, str);
        }

        public static CodecFormat[] values() {
            return (CodecFormat[]) $VALUES.clone();
        }

        public final String[] i() {
            return this.mimeType;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DecoderSupportInfo.kt */
    public static final class CodecType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CodecType[] $VALUES;
        public static final CodecType HW;
        public static final CodecType SW;
        public static final CodecType UNKNOWN;

        static {
            CodecType codecType = new CodecType("HW", 0);
            HW = codecType;
            CodecType codecType2 = new CodecType("SW", 1);
            SW = codecType2;
            CodecType codecType3 = new CodecType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            UNKNOWN = codecType3;
            CodecType[] codecTypeArr = {codecType, codecType2, codecType3};
            $VALUES = codecTypeArr;
            $ENTRIES = new asp(codecTypeArr);
        }

        public CodecType() {
            throw null;
        }

        public static CodecType valueOf(String str) {
            return (CodecType) Enum.valueOf(CodecType.class, str);
        }

        public static CodecType[] values() {
            return (CodecType[]) $VALUES.clone();
        }
    }

    /* compiled from: DecoderSupportInfo.kt */
    public static final class a {
        public final String a;
        public final CodecType b;
        public final CodecFormat c;
        public final int d;
        public final ArrayList e;

        public a(String str, CodecType codecType, CodecFormat codecFormat, int i, ArrayList arrayList) {
            this.a = str;
            this.b = codecType;
            this.c = codecFormat;
            this.d = i;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        }

        public final String toString() {
            return "DecoderInfo(name=" + this.a + ", type=" + this.b + ", codecFormat=" + this.c + ", maxSupportedHeight=" + this.d + ", profileLevels=" + this.e + ")";
        }
    }

    /* compiled from: DecoderSupportInfo.kt */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return sl9.c(this.a, this.b, "DecoderProfileLevel(profile=", ", level=", ")");
        }
    }

    /* compiled from: DecoderSupportInfo.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CodecType.values().length];
            try {
                iArr[CodecType.SW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CodecType.HW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DecoderSupportInfo(String str) {
        this.a = str;
        new bpn0(new b1h(this, 7));
        new bpn0(new ncg(this, 14));
    }

    public static boolean b(String str, CodecType codecType) {
        boolean z;
        boolean z2;
        try {
            z = !MediaCodecUtil.e(str, false, false).isEmpty();
        } catch (MediaCodecUtil.DecoderQueryException e) {
            String concat = "DecoderSupportInfo for mime type : ".concat(str);
            String message = e.getMessage();
            if (message == null) {
                message = mnh0.A(e);
            }
            Log.e(concat, message);
            z = false;
        }
        if (z) {
            int i = codecType == null ? -1 : c.$EnumSwitchMapping$0[codecType.ordinal()];
            if (i == 1) {
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    if (!mediaCodecInfo.isEncoder()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            if (brm0.w(supportedTypes[i2], str, true)) {
                                arrayList.add(mediaCodecInfo);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (Build.VERSION.SDK_INT >= 29 ? ((MediaCodecInfo) it.next()).isSoftwareOnly() : false) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
            } else if (i != 2) {
                MediaCodecInfo[] codecInfos2 = new MediaCodecList(0).getCodecInfos();
                ArrayList arrayList2 = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo2 : codecInfos2) {
                    if (!mediaCodecInfo2.isEncoder()) {
                        String[] supportedTypes2 = mediaCodecInfo2.getSupportedTypes();
                        int length2 = supportedTypes2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                break;
                            }
                            if (brm0.w(supportedTypes2[i3], str, true)) {
                                arrayList2.add(mediaCodecInfo2);
                                break;
                            }
                            i3++;
                        }
                    }
                }
                z2 = !arrayList2.isEmpty();
            } else {
                MediaCodecInfo[] codecInfos3 = new MediaCodecList(0).getCodecInfos();
                ArrayList arrayList3 = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo3 : codecInfos3) {
                    if (!mediaCodecInfo3.isEncoder()) {
                        String[] supportedTypes3 = mediaCodecInfo3.getSupportedTypes();
                        int length3 = supportedTypes3.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length3) {
                                break;
                            }
                            if (brm0.w(supportedTypes3[i4], str, true)) {
                                arrayList3.add(mediaCodecInfo3);
                                break;
                            }
                            i4++;
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        if (Build.VERSION.SDK_INT >= 29 ? ((MediaCodecInfo) it2.next()).isHardwareAccelerated() : false) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
