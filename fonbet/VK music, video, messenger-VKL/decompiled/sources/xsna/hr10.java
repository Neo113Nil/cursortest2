package xsna;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: MediaFormatUtil.java */
/* loaded from: classes12.dex */
public final class hr10 {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r1 != 22) goto L32;
     */
    @SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaFormat a(androidx.media3.common.a aVar) {
        int i;
        MediaFormat mediaFormat = new MediaFormat();
        c(mediaFormat, BadConnectionSignaling.KEY_BAD_NET_BITRATE, aVar.j);
        c(mediaFormat, "max-bitrate", aVar.i);
        int i2 = aVar.F;
        c(mediaFormat, "channel-count", i2);
        int t = y2r0.t(i2);
        if (t != 0) {
            mediaFormat.setInteger("channel-mask", t);
        }
        b(mediaFormat, aVar.D);
        String str = aVar.n;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = aVar.k;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        float f = aVar.y;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        c(mediaFormat, "width", aVar.u);
        c(mediaFormat, "height", aVar.v);
        d(mediaFormat, aVar.q);
        int i3 = aVar.H;
        if (i3 != -1) {
            c(mediaFormat, "exo-pcm-encoding-int", i3);
            if (i3 == 0) {
                i = 0;
            } else if (i3 != 2) {
                i = 3;
                if (i3 != 3) {
                    i = 4;
                    if (i3 != 4) {
                        i = 21;
                        if (i3 != 21) {
                            i = 22;
                        }
                    }
                }
            } else {
                i = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i);
        }
        String str3 = aVar.d;
        if (str3 != null) {
            mediaFormat.setString("language", str3);
        }
        c(mediaFormat, "max-input-size", aVar.o);
        c(mediaFormat, "sample-rate", aVar.G);
        c(mediaFormat, "caption-service-number", aVar.K);
        mediaFormat.setInteger("rotation-degrees", aVar.z);
        int i4 = aVar.e;
        int i5 = 1;
        mediaFormat.setInteger("is-autoselect", (i4 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i4 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i4 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", aVar.I);
        mediaFormat.setInteger("encoder-padding", aVar.J);
        float f2 = aVar.A;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f2);
        int i6 = 1073741824;
        if (f2 < 1.0f) {
            i5 = (int) (f2 * 1073741824);
        } else if (f2 > 1.0f) {
            i5 = 1073741824;
            i6 = (int) (1073741824 / f2);
        } else {
            i6 = 1;
        }
        mediaFormat.setInteger("sar-width", i5);
        mediaFormat.setInteger("sar-height", i6);
        String str4 = aVar.a;
        if (str4 != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str4));
            } catch (NumberFormatException unused) {
            }
        }
        return mediaFormat;
    }

    public static void b(MediaFormat mediaFormat, @Nullable m6g m6gVar) {
        if (m6gVar != null) {
            c(mediaFormat, "color-transfer", m6gVar.c);
            c(mediaFormat, "color-standard", m6gVar.a);
            c(mediaFormat, "color-range", m6gVar.b);
            byte[] bArr = m6gVar.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void c(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void d(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(lhg.a(i, "csd-"), ByteBuffer.wrap(list.get(i)));
        }
    }
}
