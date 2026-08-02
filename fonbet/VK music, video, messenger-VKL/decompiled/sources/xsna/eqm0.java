package xsna;

import com.ironsource.C4217a2;
import kotlin.text.Regex;
import xsna.hl10;

/* compiled from: StringFileNameExt.kt */
/* loaded from: classes17.dex */
public final class eqm0 {
    public static final bpn0 a = new bpn0(new dqm0(0));

    public static final String a(String str) {
        hl10.b bVar;
        uk10 uk10Var;
        hl10 b = ((Regex) a.getValue()).b(str);
        k9x k9xVar = (b == null || (bVar = b.c) == null || (uk10Var = (uk10) j5g.j0(bVar)) == null) ? null : uk10Var.b;
        Integer valueOf = k9xVar != null ? Integer.valueOf(k9xVar.b) : null;
        if (valueOf == null || valueOf.intValue() <= 0) {
            return str.concat(C4217a2.f);
        }
        Integer m = arm0.m(10, b.a.group().substring(1));
        return str.substring(0, valueOf.intValue()) + '-' + ((m != null ? m.intValue() : 0) + 1);
    }

    public static final String b(String str) {
        int O = drm0.O(0, 6, str, ".");
        if (O <= 0) {
            return a(str);
        }
        return a(str.substring(0, O)) + str.substring(O);
    }
}
