package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jkb0 implements lkb0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public jkb0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.lkb0
    public final String a() {
        return this.b;
    }

    @Override // defpackage.lkb0
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkb0)) {
            return false;
        }
        jkb0 jkb0Var = (jkb0) obj;
        return jl40.l(this.a, jkb0Var.a) && jl40.l(this.b, jkb0Var.b) && jl40.l(this.c, jkb0Var.c) && jl40.l(this.d, jkb0Var.d);
    }

    @Override // defpackage.mkb0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("Local(id=", this.a, ", uploadedImagePath=", this.b, ", downloadLink="), this.c, ", imageLocalPath=", this.d, Extension.C_BRAKE);
    }
}
