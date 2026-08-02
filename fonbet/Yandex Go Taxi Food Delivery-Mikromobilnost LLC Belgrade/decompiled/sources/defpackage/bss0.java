package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bss0 {
    public final CharSequence a;
    public final kdc b;
    public final Integer c;
    public final CharSequence d;
    public final kdc e;
    public final Integer f;
    public final ass0 g;

    public bss0(CharSequence charSequence, kdc kdcVar, Integer num, CharSequence charSequence2, kdc kdcVar2, Integer num2, ass0 ass0Var) {
        this.a = charSequence;
        this.b = kdcVar;
        this.c = num;
        this.d = charSequence2;
        this.e = kdcVar2;
        this.f = num2;
        this.g = ass0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bss0)) {
            return false;
        }
        bss0 bss0Var = (bss0) obj;
        return jl40.l(this.a, bss0Var.a) && jl40.l(this.b, bss0Var.b) && jl40.l(this.c, bss0Var.c) && jl40.l(this.d, bss0Var.d) && jl40.l(this.e, bss0Var.e) && jl40.l(this.f, bss0Var.f) && jl40.l(this.g, bss0Var.g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        kdc kdcVar2 = this.e;
        int hashCode5 = (hashCode4 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        Integer num2 = this.f;
        return this.g.hashCode() + ((hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TextColumn(text=" + ((Object) this.a) + ", textColor=" + this.b + ", textSize=" + this.c + ", subtext=" + ((Object) this.d) + ", subtextColor=" + this.e + ", subtextSize=" + this.f + ", parameters=" + this.g + Extension.C_BRAKE;
    }
}
