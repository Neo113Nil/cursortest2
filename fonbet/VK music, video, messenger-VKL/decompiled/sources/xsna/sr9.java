package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: CaptionHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class sr9 extends ol60 {
    public final CharSequence h;
    public final boolean i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final Integer p;
    public final NewsEntry q;

    public sr9(CharSequence charSequence, boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, NewsEntry newsEntry) {
        super(356, 0, 0, 0, null);
        this.h = charSequence;
        this.i = z;
        this.j = str;
        this.k = str2;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = num;
        this.q = newsEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr9)) {
            return false;
        }
        sr9 sr9Var = (sr9) obj;
        return epx.f(this.h, sr9Var.h) && this.i == sr9Var.i && epx.f(this.j, sr9Var.j) && epx.f(this.k, sr9Var.k) && this.l == sr9Var.l && this.m == sr9Var.m && this.n == sr9Var.n && this.o == sr9Var.o && epx.f(this.p, sr9Var.p) && epx.f(this.q, sr9Var.q);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(urd0.a(qoy.b(this.h.hashCode() * 31, 31, this.i), 31, this.j), 31, this.k), 31, false), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        Integer num = this.p;
        return Integer.hashCode(0) + e630.b((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.q);
    }

    public final String toString() {
        return "CaptionHolderUiDto(text=" + ((Object) this.h) + ", isActionVisible=" + this.i + ", actionUrl=" + this.j + ", actionTitle=" + this.k + ", isChevronVisible=false, isClickable=" + this.l + ", isHideButtonVisible=" + this.m + ", isHideAdsToBlockEnabled=" + this.n + ", shouldHideAsLegacyBlock=" + this.o + ", iconResId=" + this.p + ", entry=" + this.q + ", seqId=0)";
    }
}
