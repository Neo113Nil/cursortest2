package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class pbq0 extends rbq0 {
    public final s4f a;

    public pbq0(s4f s4fVar) {
        this.a = s4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbq0) && this.a.equals(((pbq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NavigateToCreateFolder(args=" + this.a + Extension.C_BRAKE;
    }
}
