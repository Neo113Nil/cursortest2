package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cos {
    public final u8j0 a;

    public /* synthetic */ cos(int i) {
        this(new t8j0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cos) && jl40.l(this.a, ((cos) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FundDocsNoticeState(status=" + this.a + Extension.C_BRAKE;
    }

    public cos(u8j0 u8j0Var) {
        this.a = u8j0Var;
    }

    public cos() {
        this(0);
    }
}
