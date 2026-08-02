package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ih9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ih9(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih9)) {
            return false;
        }
        ih9 ih9Var = (ih9) obj;
        return this.a.equals(ih9Var.a) && this.b.equals(ih9Var.b) && this.c.equals(ih9Var.c) && this.d.equals(ih9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("ChangeToYbWalletViewModel(title=", this.a, ", description=", this.b, ", changeButtonText="), this.c, ", closeButtonText=", this.d, Extension.C_BRAKE);
    }
}
