package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class on1 implements bfu0 {
    public final CharSequence a;
    public final List b;
    public final ky c;
    public final v4v d;
    public final v4v e;
    public final String f;
    public final Object g;

    public on1(CharSequence charSequence, List list, ky kyVar, ra90 ra90Var, ra90 ra90Var2, String str, Object obj) {
        this.a = charSequence;
        this.b = list;
        this.c = kyVar;
        this.d = ra90Var;
        this.e = ra90Var2;
        this.f = str;
        this.g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on1)) {
            return false;
        }
        on1 on1Var = (on1) obj;
        return jl40.l(this.a, on1Var.a) && jl40.l(this.b, on1Var.b) && this.c.equals(on1Var.c) && jl40.l(this.d, on1Var.d) && jl40.l(this.e, on1Var.e) && jl40.l(this.f, on1Var.f) && jl40.l(this.g, on1Var.g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        v4v v4vVar = this.d;
        int hashCode3 = (hashCode2 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        v4v v4vVar2 = this.e;
        int hashCode4 = (hashCode3 + (v4vVar2 == null ? 0 : v4vVar2.hashCode())) * 31;
        String str = this.f;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.g;
        return hashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiChatState(text=");
        sb.append((Object) this.a);
        sb.append(", dynamicTexts=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", leadImage=");
        sb.append(this.d);
        sb.append(", trailImage=");
        sb.append(this.e);
        sb.append(", metricaLabel=");
        sb.append(this.f);
        sb.append(", meta=");
        return x4e.h(sb, this.g, Extension.C_BRAKE);
    }
}
