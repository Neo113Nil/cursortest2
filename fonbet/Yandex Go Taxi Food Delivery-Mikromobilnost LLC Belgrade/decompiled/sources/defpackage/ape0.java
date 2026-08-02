package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ape0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ ape0(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, false, (i & 4) != 0 ? false : z2);
    }

    public static ape0 a(ape0 ape0Var, int i) {
        boolean z = (i & 2) != 0 ? ape0Var.b : true;
        boolean z2 = (i & 4) != 0 ? ape0Var.c : true;
        ape0Var.getClass();
        return new ape0(true, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ape0)) {
            return false;
        }
        ape0 ape0Var = (ape0) obj;
        return this.a == ape0Var.a && this.b == ape0Var.b && this.c == ape0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("PreloadState(canCloseSplash=", ", splashClosed=", ", preloadCompleted=", this.a, this.b), this.c, Extension.C_BRAKE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ape0() {
        this(r0, r0, 7);
        boolean z = false;
    }

    public ape0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
