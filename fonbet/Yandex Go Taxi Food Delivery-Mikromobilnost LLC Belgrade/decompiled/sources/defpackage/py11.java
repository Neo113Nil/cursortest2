package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class py11 implements ry11 {
    public final h1p a;

    public /* synthetic */ py11(h1p h1pVar) {
        this.a = h1pVar;
    }

    public static final /* synthetic */ py11 a(h1p h1pVar) {
        return new py11(h1pVar);
    }

    public final /* synthetic */ h1p b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof py11) {
            return jl40.l(this.a, ((py11) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ExternalUnifiedService(service=" + this.a + Extension.C_BRAKE;
    }
}
