package xsna;

import com.ironsource.X3;
import com.vk.log.L;
import java.util.HashSet;
import one.video.streaming.oktp.PublisherLogger;

/* compiled from: PublisherLoggerImplL.kt */
/* loaded from: classes3.dex */
public final class jfe0 implements PublisherLogger {
    public static axi b;
    public final axi a;

    public jfe0(axi axiVar) {
        this.a = axiVar;
    }

    public final boolean a(int i, String str) {
        axi axiVar = this.a;
        if (i >= 0) {
            boolean[] zArr = axiVar.a;
            if (zArr == null) {
                zArr = null;
            }
            int length = zArr.length;
        }
        if (i < 0) {
            return false;
        }
        boolean[] zArr2 = axiVar.a;
        if (i >= (zArr2 != null ? zArr2 : null).length) {
            return false;
        }
        if (!(zArr2 != null ? zArr2 : null)[i]) {
            return false;
        }
        HashSet<String> hashSet = axiVar.b;
        if (hashSet == null || hashSet.isEmpty()) {
            return true;
        }
        return !hashSet.contains(str);
    }

    public final void b(int i, String str, int i2, String str2, String str3, String str4) {
        if (a(i, str)) {
            L.LogType logType = i != 0 ? i != 1 ? i != 2 ? (i == 3 || i == 4) ? L.LogType.e : L.LogType.e : L.LogType.w : L.LogType.i : L.LogType.d;
            int P = drm0.P(str2, '/', 0, 6);
            if (P >= str2.length() - 1) {
                P = -1;
            }
            if (-1 != P) {
                str2 = str2.substring(P + 1);
            }
            StringBuilder sb = new StringBuilder(X3.j.d);
            sb.append(str2);
            sb.append(':');
            sb.append(i2);
            sb.append(", ");
            L.r(logType, str, tdj.a(sb, str3, "] ", str4));
        }
    }
}
