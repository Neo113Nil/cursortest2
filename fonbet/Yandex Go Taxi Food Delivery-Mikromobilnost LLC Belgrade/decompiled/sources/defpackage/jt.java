package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jt implements kt {
    public final ix41 a;

    public jt(ix41 ix41Var) {
        this.a = ix41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt) && jl40.l(this.a, ((jt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSchedule(datePickerData=" + this.a + Extension.C_BRAKE;
    }
}
