package yads;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class xm1 {
    public final UUID a;
    public final Uri b;
    public final v51 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final s51 g;
    public final byte[] h;

    public xm1(wm1 wm1Var) {
        ni.b((wm1Var.f && wm1Var.b == null) ? false : true);
        this.a = (UUID) ni.a(wm1Var.a);
        this.b = wm1Var.b;
        this.c = wm1Var.c;
        this.d = wm1Var.d;
        this.f = wm1Var.f;
        this.e = wm1Var.e;
        this.g = wm1Var.g;
        byte[] bArr = wm1Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final byte[] a() {
        byte[] bArr = this.h;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm1)) {
            return false;
        }
        xm1 xm1Var = (xm1) obj;
        return this.a.equals(xm1Var.a) && mc3.a(this.b, xm1Var.b) && mc3.a(this.c, xm1Var.c) && this.d == xm1Var.d && this.f == xm1Var.f && this.e == xm1Var.e && this.g.equals(xm1Var.g) && Arrays.equals(this.h, xm1Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((pz2.a(this.c.entrySet()) + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
