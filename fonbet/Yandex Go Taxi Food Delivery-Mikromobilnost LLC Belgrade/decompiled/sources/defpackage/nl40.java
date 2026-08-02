package defpackage;

import android.graphics.Color;
import java.util.List;

/* loaded from: classes.dex */
public final class nl40 implements yp2 {
    public final yp2 a;

    public nl40(yp2 yp2Var) {
        this.a = yp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    @Override // defpackage.yp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wp2 a(String str, wp2 wp2Var) {
        List W;
        ldc ldcVar;
        ldc ldcVar2 = null;
        yp2 yp2Var = this.a;
        if (str == null) {
            return yp2Var.a(null, wp2Var);
        }
        W = evu0.W(str, new String[]{":"}, (r2 & 4) != 0 ? 0 : 2);
        if (W.size() != 2) {
            return yp2Var.a(str, wp2Var);
        }
        String str2 = (String) W.get(0);
        String str3 = (String) W.get(1);
        if (cvu0.x(str2, "l:#", false)) {
            try {
                ldcVar = new ldc(rzo.d(Color.parseColor(evu0.Q("l:#", str2))));
            } catch (IllegalArgumentException unused) {
            }
            if (ldcVar != null) {
                return yp2Var.a(str, wp2Var);
            }
            long j = ldcVar.a;
            if (cvu0.x(str3, "d:#", false)) {
                try {
                    ldcVar2 = new ldc(rzo.d(Color.parseColor(evu0.Q("d:#", str3))));
                } catch (IllegalArgumentException unused2) {
                }
            }
            return ldcVar2 != null ? new vp2(j, ldcVar2.a) : yp2Var.a(str, wp2Var);
        }
        ldcVar = null;
        if (ldcVar != null) {
        }
    }

    public nl40() {
        this(xp2.a);
    }
}
