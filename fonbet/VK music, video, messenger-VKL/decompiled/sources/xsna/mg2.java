package xsna;

import android.graphics.drawable.Drawable;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: AnimatedBlockHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class mg2 extends ol60 {
    public final CharSequence h;
    public final boolean i;
    public final CharSequence j;
    public final boolean k;
    public final CharSequence l;
    public final boolean m;
    public final boolean n;
    public final Drawable o;
    public final String p;
    public final int q;
    public final int r;
    public final int s;

    public mg2(CharSequence charSequence, boolean z, CharSequence charSequence2, boolean z2, String str, boolean z3, boolean z4, Drawable drawable, String str2, int i, int i2, int i3) {
        super(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, 0, 0, 0, null);
        this.h = charSequence;
        this.i = z;
        this.j = charSequence2;
        this.k = z2;
        this.l = str;
        this.m = z3;
        this.n = z4;
        this.o = drawable;
        this.p = str2;
        this.q = i;
        this.r = i2;
        this.s = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg2)) {
            return false;
        }
        mg2 mg2Var = (mg2) obj;
        return epx.f(this.h, mg2Var.h) && this.i == mg2Var.i && epx.f(this.j, mg2Var.j) && this.k == mg2Var.k && epx.f(this.l, mg2Var.l) && this.m == mg2Var.m && this.n == mg2Var.n && epx.f(this.o, mg2Var.o) && epx.f(this.p, mg2Var.p) && this.q == mg2Var.q && this.r == mg2Var.r && this.s == mg2Var.s;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        CharSequence charSequence = this.h;
        int b = qoy.b((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.i);
        CharSequence charSequence2 = this.j;
        int b2 = qoy.b((b + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.k);
        CharSequence charSequence3 = this.l;
        int b3 = qoy.b(qoy.b((b2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31, 31, this.m), 31, this.n);
        Drawable drawable = this.o;
        return Integer.hashCode(0) + shy.a(this.s, shy.a(this.r, shy.a(this.q, urd0.a((b3 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.p), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatedBlockHolderUiDto(text=");
        sb.append((Object) this.h);
        sb.append(", isTextVisible=");
        sb.append(this.i);
        sb.append(", subtitleText=");
        sb.append((Object) this.j);
        sb.append(", isSubtitleTextVisible=");
        sb.append(this.k);
        sb.append(", buttonText=");
        sb.append((Object) this.l);
        sb.append(", isButtonVisible=");
        sb.append(this.m);
        sb.append(", isHideVisible=");
        sb.append(this.n);
        sb.append(", background=");
        sb.append(this.o);
        sb.append(", animationUrl=");
        sb.append(this.p);
        sb.append(", animationWidth=");
        sb.append(this.q);
        sb.append(", animationHeight=");
        sb.append(this.r);
        sb.append(", animationPlayCount=");
        return h5s.c(this.s, ", seqId=0)", sb);
    }
}
