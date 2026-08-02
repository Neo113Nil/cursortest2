package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c7v0 implements d7v0 {
    public final CharSequence a;
    public final l6v0 b;
    public final String c;

    public c7v0(CharSequence charSequence, l6v0 l6v0Var, String str) {
        this.a = charSequence;
        this.b = l6v0Var;
        this.c = str;
    }

    @Override // defpackage.d7v0
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7v0)) {
            return false;
        }
        c7v0 c7v0Var = (c7v0) obj;
        return jl40.l(this.a, c7v0Var.a) && jl40.l(this.b, c7v0Var.b) && this.c.equals(c7v0Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = charSequence == null ? 0 : charSequence.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "Loading(containerHeaderTitle=" + ((Object) this.a) + ", mapState=" + this.b + ", loadingContentDescription=" + ((Object) this.c) + Extension.C_BRAKE;
    }
}
