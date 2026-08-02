package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hqn implements lqn {
    public final uhf a;

    @Override // defpackage.lqn
    public final /* bridge */ Object a() {
        return (Void) super.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hqn) {
            return this.a == ((hqn) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Left(value=" + this.a + Extension.C_BRAKE;
    }
}
