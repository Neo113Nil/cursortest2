package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class j7h {
    public final zuj0 a;

    public j7h(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r12 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wi70 a(vi70 vi70Var, bj70 bj70Var) {
        String str;
        StringBuilder t;
        pex0 pex0Var = vi70Var.a.a;
        boolean z = vi70Var.e;
        String e = pex0Var.e();
        String str2 = pex0Var.p;
        String str3 = null;
        if (str2 != null) {
            if (str2.length() == 0) {
                str2 = null;
            }
        }
        str2 = ((avj0) this.a).h(kyh0.summary_confirm);
        String str4 = str2;
        String str5 = pex0Var.q;
        if (str5 != null) {
            if (str5.length() == 0) {
                str5 = null;
            }
        }
        if (e != null && z) {
            str3 = e;
        }
        if (str3 != null) {
            str = str3;
            t = qv10.t(str4);
            if (str.length() != 0) {
            }
            if (e != null) {
                t.append(Extension.FIX_SPACE);
                t.append(e);
            }
            return new wi70(str4, str, t.toString(), bj70Var, true, false, pex0Var.a != TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS);
        }
        str5 = "";
        str = str5;
        t = qv10.t(str4);
        if (str.length() != 0) {
            t.append(Extension.FIX_SPACE);
            t.append(str);
        }
        if (e != null && e.length() != 0 && !e.equals(str)) {
            t.append(Extension.FIX_SPACE);
            t.append(e);
        }
        return new wi70(str4, str, t.toString(), bj70Var, true, false, pex0Var.a != TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS);
    }

    public final wi70 b(pex0 pex0Var) {
        String str;
        String str2;
        String str3 = pex0Var.D;
        String str4 = pex0Var.E;
        if (str3 == null || str3.length() == 0) {
            str3 = pex0Var.p;
            if (str3 == null) {
                str3 = ((avj0) this.a).h(kyh0.summary_confirm);
            }
            str = "";
        } else {
            if (str4 == null) {
                str4 = "";
            }
            str = str4;
        }
        String str5 = str3;
        boolean z = pex0Var.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS;
        if (str.length() == 0) {
            str2 = str5;
        } else {
            str2 = ((Object) str5) + Extension.FIX_SPACE + ((Object) str);
        }
        return new wi70(str5, str, str2, bj70.e, false, false, z);
    }
}
