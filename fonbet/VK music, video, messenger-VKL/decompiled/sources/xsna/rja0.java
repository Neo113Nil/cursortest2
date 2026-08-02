package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import xsna.fi20;
import xsna.vr10;

/* compiled from: PictureFrame.java */
/* loaded from: classes12.dex */
public final class rja0 implements fi20.a {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public rja0(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static rja0 d(xi90 xi90Var) {
        int p = xi90Var.p();
        String q = io20.q(xi90Var.A(xi90Var.p(), StandardCharsets.US_ASCII));
        String A = xi90Var.A(xi90Var.p(), StandardCharsets.UTF_8);
        int p2 = xi90Var.p();
        int p3 = xi90Var.p();
        int p4 = xi90Var.p();
        int p5 = xi90Var.p();
        int p6 = xi90Var.p();
        byte[] bArr = new byte[p6];
        xi90Var.n(bArr, 0, p6);
        return new rja0(p, q, A, p2, p3, p4, p5, bArr);
    }

    @Override // xsna.fi20.a
    public final void c(vr10.a aVar) {
        aVar.a(this.a, this.h);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rja0.class == obj.getClass()) {
            rja0 rja0Var = (rja0) obj;
            if (this.a == rja0Var.a && this.b.equals(rja0Var.b) && this.c.equals(rja0Var.c) && this.d == rja0Var.d && this.e == rja0Var.e && this.f == rja0Var.f && this.g == rja0Var.g && Arrays.equals(this.h, rja0Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((urd0.a(urd0.a((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
