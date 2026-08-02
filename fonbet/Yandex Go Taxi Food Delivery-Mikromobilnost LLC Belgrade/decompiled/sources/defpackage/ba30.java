package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ba30 implements ea30 {
    public final f930 a;

    public ba30(f930 f930Var) {
        this.a = f930Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba30) && this.a.equals(((ba30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(errorContentState=" + this.a + Extension.C_BRAKE;
    }
}
