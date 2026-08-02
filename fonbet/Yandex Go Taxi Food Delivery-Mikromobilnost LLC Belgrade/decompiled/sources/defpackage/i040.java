package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class i040 implements v040 {
    public final f140 a;

    public i040(f140 f140Var) {
        this.a = f140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i040) && jl40.l(this.a, ((i040) obj).a);
    }

    public final int hashCode() {
        f140 f140Var = this.a;
        if (f140Var == null) {
            return 0;
        }
        return f140Var.hashCode();
    }

    public final String toString() {
        return "OnButtonClicked(buttonAction=" + this.a + Extension.C_BRAKE;
    }
}
