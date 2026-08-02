package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class dl2 {
    public final String a;
    public final String b;
    public final boolean c;

    public dl2(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl2)) {
            return false;
        }
        dl2 dl2Var = (dl2) obj;
        return jl40.l(this.a, dl2Var.a) && jl40.l(this.b, dl2Var.b) && this.c == dl2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("AnswerModel(id=", this.a, ", text=", this.b, ", isSelected="), this.c, Extension.C_BRAKE);
    }
}
