package xsna;

import android.media.MediaCodec;
import com.ironsource.X3;

/* compiled from: Utils.kt */
/* loaded from: classes3.dex */
public final class k3r0 {
    public static String a(int i, int i2, int i3, long j) {
        StringBuilder sb = new StringBuilder(X3.j.d);
        if ((i3 & 1) != 0) {
            sb.append("kf");
        }
        if ((i3 & 8) != 0) {
            sb.append("pf");
        }
        if ((i3 & 2) != 0) {
            sb.append(sb.length() > 1 ? ",cc" : "cc");
        }
        if ((i3 & 4) != 0) {
            sb.append(sb.length() > 1 ? ",eos" : "eos");
        }
        sb.append(']');
        return "BufferInfo{o=" + i + "|sz=" + i2 + "|pts=" + j + "|f=" + ((Object) sb) + '}';
    }

    public static String b(MediaCodec.BufferInfo bufferInfo) {
        return a(bufferInfo.offset, bufferInfo.size, bufferInfo.flags, bufferInfo.presentationTimeUs);
    }
}
