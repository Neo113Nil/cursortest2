package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ft3 implements et3 {
    public final fwn a;

    public ft3(fwn fwnVar) {
        this.a = fwnVar;
    }

    public final fwn a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ft3) && this.a.equals(((ft3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Empty(entity=" + this.a + Extension.C_BRAKE;
    }
}
