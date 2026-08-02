package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ct40 implements et40 {
    public final fao a;

    public ct40(fao faoVar) {
        this.a = faoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct40) && jl40.l(this.a, ((ct40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + Extension.C_BRAKE;
    }
}
