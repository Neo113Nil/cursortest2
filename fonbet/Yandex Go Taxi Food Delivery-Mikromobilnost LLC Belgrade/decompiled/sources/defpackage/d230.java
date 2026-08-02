package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class d230 implements e230 {
    public final int a;

    public d230(int i) {
        this.a = i;
    }

    @Override // defpackage.e230
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d230) && this.a == ((d230) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "StatusBarOnly(consume=", Extension.C_BRAKE);
    }

    public d230() {
        this(0);
    }
}
