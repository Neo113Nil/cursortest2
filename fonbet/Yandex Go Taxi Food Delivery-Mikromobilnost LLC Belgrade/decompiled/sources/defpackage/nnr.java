package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nnr {
    public final i3y a;
    public final i3y b;

    public nnr(i3y i3yVar, i3y i3yVar2) {
        this.a = i3yVar;
        this.b = i3yVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnr)) {
            return false;
        }
        nnr nnrVar = (nnr) obj;
        return this.a == nnrVar.a && this.b == nnrVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrientationHolder(primaryOrientation=" + this.a + ", secondaryOrientation=" + this.b + Extension.C_BRAKE;
    }
}
