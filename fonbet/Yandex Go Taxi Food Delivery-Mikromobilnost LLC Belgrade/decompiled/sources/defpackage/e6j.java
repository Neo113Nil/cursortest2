package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class e6j extends f6j {
    public final CharSequence a;
    public final String b;
    public final x5j c;
    public final mb4 d;
    public final String e;
    public final boolean f;

    public e6j(CharSequence charSequence, String str, x5j x5jVar, mb4 mb4Var, String str2, boolean z) {
        this.a = charSequence;
        this.b = str;
        this.c = x5jVar;
        this.d = mb4Var;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6j)) {
            return false;
        }
        e6j e6jVar = (e6j) obj;
        return jl40.l(this.a, e6jVar.a) && jl40.l(this.b, e6jVar.b) && jl40.l(this.c, e6jVar.c) && jl40.l(this.d, e6jVar.d) && jl40.l(this.e, e6jVar.e) && this.f == e6jVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaitingCandidateResponse(title=");
        sb.append((Object) this.a);
        sb.append(", driverDescription=");
        sb.append(this.b);
        sb.append(", carIconState=");
        sb.append(this.c);
        sb.append(", avatarState=");
        sb.append(this.d);
        sb.append(", candidateId=");
        return nnm.i(this.e, ", candidateChanged=", Extension.C_BRAKE, sb, this.f);
    }
}
