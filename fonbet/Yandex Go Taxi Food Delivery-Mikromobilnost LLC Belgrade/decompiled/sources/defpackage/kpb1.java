package defpackage;

import androidx.compose.animation.a;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class kpb1 {
    public static final void a(int i, u510 u510Var, tls tlsVar, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(374486835);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2 | (btsVar.k(u510Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            Integer valueOf = Integer.valueOf(i);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new pi30(29);
                btsVar.o0(Q);
            }
            a.b(valueOf, null, (tls) Q, null, null, null, wwg.S(364913193, true, new l0(23, u510Var, tlsVar), btsVar), btsVar, (i3 & 14) | 1573248, 58);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(i, u510Var, tlsVar, i2);
        }
    }

    public static final void b(Throwable th, sls slsVar) {
        d(th, slsVar);
    }

    public static String c(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r1.isEmpty() == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(Throwable th, sls slsVar) {
        DiagnosticComposeException diagnosticComposeException;
        zgd zgdVar;
        List b = ovc0.a.b(th);
        int size = b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) b.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            zgdVar = (zgd) slsVar.invoke();
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (zgdVar != null) {
            boolean z2 = zgdVar.b;
            List list = zgdVar.a;
            if (z2) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (((bhd) list.get(i2)).b != null) {
                        z = true;
                        break;
                    }
                }
            }
            diagnosticComposeException = th2;
            if (diagnosticComposeException != null) {
                ljo.a(th, diagnosticComposeException);
            }
            return z;
        }
        diagnosticComposeException = z ? new DiagnosticComposeException(zgdVar) : null;
        if (diagnosticComposeException != null) {
        }
        return z;
    }
}
