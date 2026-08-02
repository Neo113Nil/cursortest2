package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class k8e0 implements m8e0 {
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ k8e0(String str, int i) {
        this("", (i & 2) != 0 ? "" : str, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8e0)) {
            return false;
        }
        k8e0 k8e0Var = (k8e0) obj;
        return jl40.l(this.a, k8e0Var.a) && jl40.l(this.b, k8e0Var.b) && this.c == k8e0Var.c;
    }

    @Override // defpackage.m8e0
    public final String getTag() {
        return this.b;
    }

    @Override // defpackage.m8e0
    public final String getUrl() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("Default(url=", this.a, ", tag=", this.b, ", isBig="), this.c, Extension.C_BRAKE);
    }

    public k8e0() {
        this(null, 7);
    }

    public k8e0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
