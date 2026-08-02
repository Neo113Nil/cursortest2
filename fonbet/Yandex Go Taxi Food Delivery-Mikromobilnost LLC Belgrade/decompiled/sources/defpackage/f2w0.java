package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class f2w0 {
    public static final f2w0 c = new f2w0(false, 0);
    public final boolean a;
    public final int b;

    public f2w0(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2w0)) {
            return false;
        }
        f2w0 f2w0Var = (f2w0) obj;
        return this.a == f2w0Var.a && this.b == f2w0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SuperAppMainScreenHeaderState(isClarifyAddressViewVisible=" + this.a + ", height=" + this.b + Extension.C_BRAKE;
    }
}
