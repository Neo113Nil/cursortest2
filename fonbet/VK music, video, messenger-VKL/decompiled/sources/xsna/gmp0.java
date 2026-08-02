package xsna;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class gmp0 {
    public final ciq a;
    public final b0k0 b;
    public final vsa c;
    public final h4h0 d;
    public final boolean e;
    public final Map<Object, Object> f;

    public gmp0() {
        this((ciq) null, (b0k0) null, (vsa) null, (h4h0) null, (LinkedHashMap) null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmp0)) {
            return false;
        }
        gmp0 gmp0Var = (gmp0) obj;
        return epx.f(this.a, gmp0Var.a) && epx.f(this.b, gmp0Var.b) && epx.f(this.c, gmp0Var.c) && epx.f(this.d, gmp0Var.d) && this.e == gmp0Var.e && epx.f(this.f, gmp0Var.f);
    }

    public final int hashCode() {
        ciq ciqVar = this.a;
        int hashCode = (ciqVar == null ? 0 : ciqVar.hashCode()) * 31;
        b0k0 b0k0Var = this.b;
        int hashCode2 = (hashCode + (b0k0Var == null ? 0 : b0k0Var.hashCode())) * 31;
        vsa vsaVar = this.c;
        int hashCode3 = (hashCode2 + (vsaVar == null ? 0 : vsaVar.hashCode())) * 31;
        h4h0 h4h0Var = this.d;
        return this.f.hashCode() + qoy.b((hashCode3 + (h4h0Var != null ? h4h0Var.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionData(fade=");
        sb.append(this.a);
        sb.append(", slide=");
        sb.append(this.b);
        sb.append(", changeSize=");
        sb.append(this.c);
        sb.append(", scale=");
        sb.append(this.d);
        sb.append(", veil=null, hold=");
        sb.append(this.e);
        sb.append(", effectsMap=");
        return cjl0.a(sb, this.f, ')');
    }

    public gmp0(ciq ciqVar, b0k0 b0k0Var, vsa vsaVar, h4h0 h4h0Var, boolean z, Map map) {
        this.a = ciqVar;
        this.b = b0k0Var;
        this.c = vsaVar;
        this.d = h4h0Var;
        this.e = z;
        this.f = map;
    }

    public /* synthetic */ gmp0(ciq ciqVar, b0k0 b0k0Var, vsa vsaVar, h4h0 h4h0Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : ciqVar, (i & 2) != 0 ? null : b0k0Var, (i & 4) != 0 ? null : vsaVar, (i & 8) != 0 ? null : h4h0Var, (i & 32) == 0, (i & 64) != 0 ? jgp.b : linkedHashMap);
    }
}
