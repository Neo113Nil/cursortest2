package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class fof extends hof {
    public final smk a;

    public fof(smk smkVar) {
        this.a = smkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fof) && this.a.equals(((fof) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(divDataForRendering=" + this.a + Extension.C_BRAKE;
    }
}
