package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fv7 {
    public final String a;
    public final String b;
    public final String c;

    public fv7(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv7)) {
            return false;
        }
        fv7 fv7Var = (fv7) obj;
        if (!jl40.l(this.a, fv7Var.a) || !this.b.equals(fv7Var.b) || !jl40.l(this.c, fv7Var.c)) {
            return false;
        }
        cv7 cv7Var = cv7.a;
        return cv7Var.equals(cv7Var);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return ((b + (str2 != null ? str2.hashCode() : 0)) * 31) + 1272913872;
    }

    public final String toString() {
        StringBuilder v = b64.v("CancelCommentUiState(title=", this.a, ", currentComment=", this.b, ", doneButtonTitle=");
        v.append(this.c);
        v.append(", backClickedAction=");
        v.append(cv7.a);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
