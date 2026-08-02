package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mjw0 implements e6v {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public mjw0(ijw0 ijw0Var) {
        String str = ijw0Var.a;
        String str2 = ijw0Var.b;
        String str3 = ijw0Var.c;
        String str4 = ijw0Var.d;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjw0)) {
            return false;
        }
        mjw0 mjw0Var = (mjw0) obj;
        return jl40.l(this.a, mjw0Var.a) && jl40.l(this.b, mjw0Var.b) && jl40.l(this.c, mjw0Var.c) && jl40.l(this.d, mjw0Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(b64.v("SupportMenuActionItemUiState(id=", this.a, ", title=", this.b, ", subtitle="), this.c, ", iconUrl=", this.d, Extension.C_BRAKE);
    }
}
