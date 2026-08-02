package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bcb0 implements ccb0 {
    public final zcb0 a;

    public bcb0(zcb0 zcb0Var) {
        this.a = zcb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcb0) && this.a.equals(((bcb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Single(text=" + this.a + Extension.C_BRAKE;
    }
}
