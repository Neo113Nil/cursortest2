package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nhq0 {
    public final int a;
    public final boolean b;

    public nhq0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhq0)) {
            return false;
        }
        nhq0 nhq0Var = (nhq0) obj;
        return this.a == nhq0Var.a && this.b == nhq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectedPageInfo(position=" + this.a + ", shouldForceSelectPosition=" + this.b + Extension.C_BRAKE;
    }
}
