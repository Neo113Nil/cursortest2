package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class hzx {
    public final lkn a;

    public hzx(lkn lknVar) {
        this.a = lknVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzx) && jl40.l(this.a, ((hzx) obj).a);
    }

    public final int hashCode() {
        lkn lknVar = this.a;
        if (lknVar == null) {
            return 0;
        }
        return lknVar.hashCode();
    }

    public final String toString() {
        return "Layout(paddings=" + this.a + Extension.C_BRAKE;
    }
}
