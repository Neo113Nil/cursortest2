package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;

/* loaded from: classes6.dex */
public final class npu0 {
    public final x3 a;
    public final String b;
    public final Float c;
    public final boolean d;
    public final RetryPolicy e;

    public /* synthetic */ npu0(x3 x3Var, String str, Float f, boolean z, int i) {
        this(x3Var, str, (i & 4) != 0 ? null : f, (i & 8) != 0 ? true : z, RetryPolicy.DEFAULT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npu0)) {
            return false;
        }
        npu0 npu0Var = (npu0) obj;
        return jl40.l(this.a, npu0Var.a) && jl40.l(this.b, npu0Var.b) && jl40.l(this.c, npu0Var.c) && this.d == npu0Var.d && this.e == npu0Var.e;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Float f = this.c;
        return this.e.hashCode() + unr0.e(unr0.e(unr0.e((b + (f == null ? 0 : f.hashCode())) * 31, 31, this.d), 31, false), 31, false);
    }

    public final String toString() {
        return "StoryPayload(mode=" + this.a + ", screenName=" + this.b + ", cornersRadius=" + this.c + ", isDismissible=" + this.d + ", markStoryViewed=false, darkStatusBar=false, retryPolicy=" + this.e + Extension.C_BRAKE;
    }

    public npu0(x3 x3Var, String str, Float f, boolean z, RetryPolicy retryPolicy) {
        this.a = x3Var;
        this.b = str;
        this.c = f;
        this.d = z;
        this.e = retryPolicy;
    }
}
