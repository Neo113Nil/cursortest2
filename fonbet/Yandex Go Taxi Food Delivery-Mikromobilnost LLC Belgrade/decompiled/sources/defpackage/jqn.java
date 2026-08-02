package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jqn implements lqn {
    public final vhf a;

    public final /* synthetic */ Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jqn) {
            return this.a == ((jqn) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Right(value=" + this.a + Extension.C_BRAKE;
    }
}
