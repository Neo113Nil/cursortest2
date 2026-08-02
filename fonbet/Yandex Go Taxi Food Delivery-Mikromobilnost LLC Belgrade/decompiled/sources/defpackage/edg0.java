package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class edg0 implements fdg0 {
    public final lfv a;

    public edg0(lfv lfvVar) {
        this.a = lfvVar;
    }

    public final lfv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edg0) && this.a.equals(((edg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.a + Extension.C_BRAKE;
    }
}
