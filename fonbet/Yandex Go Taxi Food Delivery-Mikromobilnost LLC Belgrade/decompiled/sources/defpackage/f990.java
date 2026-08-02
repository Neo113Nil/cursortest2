package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class f990 extends gc5 {
    public final String c;
    public final boolean d;
    public final boolean e;
    public final Throwable f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f990(int i, String str, Throwable th, boolean z) {
        super(str, 2);
        str = (i & 1) != 0 ? "PAGING_ERROR_ITEM_ID" : str;
        z = (i & 2) != 0 ? false : z;
        boolean z2 = (i & 4) != 0;
        th = (i & 8) != 0 ? null : th;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f990)) {
            return false;
        }
        f990 f990Var = (f990) obj;
        return jl40.l(this.c, f990Var.c) && this.d == f990Var.d && this.e == f990Var.e && jl40.l(this.f, f990Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        Throwable th = this.f;
        return e + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder l = oo31.l("WithThrowable(id=", this.c, ", hasBottomMargin=", ", needToAdjustHeight=", this.d);
        l.append(this.e);
        l.append(", error=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public f990() {
        this(15, null, null, false);
    }
}
