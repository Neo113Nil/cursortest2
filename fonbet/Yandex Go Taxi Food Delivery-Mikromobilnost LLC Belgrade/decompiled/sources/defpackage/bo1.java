package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bo1 implements do1 {
    public final String a;
    public final String b;
    public final wp2 c;
    public final String d;
    public final String e;
    public final Map f;
    public final int g;

    public bo1(String str, String str2, wp2 wp2Var, String str3, String str4, Map map, int i) {
        this.a = str;
        this.b = str2;
        this.c = wp2Var;
        this.d = str3;
        this.e = str4;
        this.f = map;
        this.g = i;
    }

    @Override // defpackage.do1
    public final wp2 a() {
        return this.c;
    }

    @Override // defpackage.do1
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo1)) {
            return false;
        }
        bo1 bo1Var = (bo1) obj;
        return jl40.l(this.a, bo1Var.a) && jl40.l(this.b, bo1Var.b) && jl40.l(this.c, bo1Var.c) && jl40.l(this.d, bo1Var.d) && jl40.l(this.e, bo1Var.e) && jl40.l(this.f, bo1Var.f) && this.g == bo1Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(n.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f;
        return Integer.hashCode(this.g) + ((hashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Evaluation(creativeId=", this.a, ", uiKey=", this.b, ", color=");
        v.append(this.c);
        v.append(", text=");
        v.append(this.d);
        v.append(", shortcutText=");
        v.append(this.e);
        v.append(", analyticsPayload=");
        v.append(this.f);
        v.append(", evaluationPosition=");
        return oyr.m(this.g, Extension.C_BRAKE, v);
    }
}
