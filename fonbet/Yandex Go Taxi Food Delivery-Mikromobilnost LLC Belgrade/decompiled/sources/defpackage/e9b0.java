package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e9b0 {
    public final ycb0 a;
    public final zcb0 b;

    public e9b0(ycb0 ycb0Var, zcb0 zcb0Var) {
        this.a = ycb0Var;
        this.b = zcb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9b0)) {
            return false;
        }
        e9b0 e9b0Var = (e9b0) obj;
        return this.a.equals(e9b0Var.a) && this.b.equals(e9b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExpandedCategoryHeader(note=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
    }
}
