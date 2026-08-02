package xsna;

import java.io.File;

/* compiled from: CipherParams.kt */
/* loaded from: classes3.dex */
public final class ncc {
    public final File a;

    public ncc(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncc) && epx.f(this.a, ((ncc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "CipherParams(filesDir=" + this.a + ", keyAlias=null)";
    }
}
