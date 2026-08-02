package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class bl60 {
    public final boolean a;
    public final String b;
    public final String c;
    public final bb1 d;

    public bl60(boolean z, String str, String str2, v060 v060Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = v060Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl60)) {
            return false;
        }
        bl60 bl60Var = (bl60) obj;
        return this.a == bl60Var.a && jl40.l(this.b, bl60Var.b) && jl40.l(this.c, bl60Var.c) && jl40.l(this.d, bl60Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        bb1 bb1Var = this.d;
        return b + (bb1Var == null ? 0 : bb1Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = ly3.v("NotificatorState(shown=", ", header=", this.b, ", description=", this.a);
        v.append(this.c);
        v.append(", failureReason=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ bl60(int i) {
        this(false, "", "", null);
    }

    public bl60() {
        this(15);
    }
}
