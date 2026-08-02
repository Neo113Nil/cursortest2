package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class b95 implements t5j0 {
    public final l8x a;

    public /* synthetic */ b95(l8x l8xVar) {
        this.a = l8xVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b95) {
            return this.a.equals(((b95) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + Extension.C_BRAKE;
    }
}
