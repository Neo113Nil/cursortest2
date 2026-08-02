package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class hy01 {
    public final z7p a;
    public final sns0 b;
    public final rf9 c;
    public final tkm0 d;
    public final boolean e;
    public final Map f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map] */
    public /* synthetic */ hy01(z7p z7pVar, sns0 sns0Var, rf9 rf9Var, tkm0 tkm0Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : z7pVar, (i & 2) != 0 ? null : sns0Var, (i & 4) != 0 ? null : rf9Var, (i & 8) != 0 ? null : tkm0Var, (i & 32) == 0, (i & 64) != 0 ? b.f() : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy01)) {
            return false;
        }
        hy01 hy01Var = (hy01) obj;
        return jl40.l(this.a, hy01Var.a) && jl40.l(this.b, hy01Var.b) && jl40.l(this.c, hy01Var.c) && jl40.l(this.d, hy01Var.d) && this.e == hy01Var.e && jl40.l(this.f, hy01Var.f);
    }

    public final int hashCode() {
        z7p z7pVar = this.a;
        int hashCode = (z7pVar == null ? 0 : z7pVar.hashCode()) * 31;
        sns0 sns0Var = this.b;
        int hashCode2 = (hashCode + (sns0Var == null ? 0 : sns0Var.hashCode())) * 31;
        rf9 rf9Var = this.c;
        int hashCode3 = (hashCode2 + (rf9Var == null ? 0 : rf9Var.hashCode())) * 31;
        tkm0 tkm0Var = this.d;
        return this.f.hashCode() + unr0.e((hashCode3 + (tkm0Var != null ? tkm0Var.hashCode() : 0)) * 961, 31, this.e);
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
        return smw0.n(sb, this.f, ')');
    }

    public hy01(z7p z7pVar, sns0 sns0Var, rf9 rf9Var, tkm0 tkm0Var, boolean z, Map map) {
        this.a = z7pVar;
        this.b = sns0Var;
        this.c = rf9Var;
        this.d = tkm0Var;
        this.e = z;
        this.f = map;
    }

    public hy01() {
        this((z7p) null, (sns0) null, (rf9) null, (tkm0) null, (LinkedHashMap) null, HProv.PP_VERSION_TIMESTAMP);
    }
}
