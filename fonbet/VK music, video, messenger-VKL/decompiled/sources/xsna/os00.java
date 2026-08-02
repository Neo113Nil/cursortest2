package xsna;

import android.text.SpannableStringBuilder;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.ecomm.reviews.impl.allreviews.domain.model.ReviewStatus;
import java.util.List;

/* compiled from: MarketAllReviewsGoodReviewItem.kt */
/* loaded from: classes18.dex */
public final class os00 implements hfz {
    public final String b;
    public final int c;
    public final BaseImageDto d;
    public final String e;
    public final int f;
    public final Object g;
    public final String h;
    public final SpannableStringBuilder i;
    public final boolean j;
    public final int k;
    public final ReviewStatus l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final int s;

    public os00() {
        throw null;
    }

    public os00(String str, int i, BaseImageDto baseImageDto, String str2, int i2, List list, SpannableStringBuilder spannableStringBuilder, boolean z, int i3, ReviewStatus reviewStatus, String str3, int i4, int i5, boolean z2, boolean z3, int i6) {
        this.b = str;
        this.c = i;
        this.d = baseImageDto;
        this.e = str2;
        this.f = i2;
        this.g = list;
        this.h = "";
        this.i = spannableStringBuilder;
        this.j = z;
        this.k = i3;
        this.l = reviewStatus;
        this.m = str3;
        this.n = "";
        this.o = i4;
        this.p = i5;
        this.q = z2;
        this.r = z3;
        this.s = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os00)) {
            return false;
        }
        os00 os00Var = (os00) obj;
        return epx.f(this.b, os00Var.b) && this.c == os00Var.c && epx.f(this.d, os00Var.d) && epx.f(this.e, os00Var.e) && this.f == os00Var.f && epx.f(this.g, os00Var.g) && epx.f(this.h, os00Var.h) && epx.f(this.i, os00Var.i) && this.j == os00Var.j && this.k == os00Var.k && this.l == os00Var.l && epx.f(this.m, os00Var.m) && epx.f(this.n, os00Var.n) && this.o == os00Var.o && this.p == os00Var.p && this.q == os00Var.q && this.r == os00Var.r && this.s == os00Var.s;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        int a = shy.a(this.c, this.b.hashCode() * 31, 31);
        BaseImageDto baseImageDto = this.d;
        int a2 = vul0.a(shy.a(this.f, urd0.a((a + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31, 31, this.e), 31), 31, this.g);
        String str = this.h;
        int hashCode = (this.l.hashCode() + shy.a(this.k, qoy.b((this.i.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.j), 31)) * 31;
        String str2 = this.m;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        return Integer.hashCode(this.s) + qoy.b(qoy.b(qoy.b(shy.a(this.p, shy.a(this.o, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31, this.q), 31, false), 31, this.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAllReviewsGoodReviewItem(fullItemReviewId=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", goodAvatar=");
        sb.append(this.d);
        sb.append(", goodDisplayName=");
        sb.append(this.e);
        sb.append(", rating=");
        sb.append(this.f);
        sb.append(", images=");
        sb.append(this.g);
        sb.append(", imagesContentDescriptionText=");
        sb.append(this.h);
        sb.append(", reviewDescription=");
        sb.append((Object) this.i);
        sb.append(", isExpanded=");
        sb.append(this.j);
        sb.append(", date=");
        sb.append(this.k);
        sb.append(", status=");
        sb.append(this.l);
        sb.append(", statusText=");
        sb.append(this.m);
        sb.append(", statusContentDescriptionText=");
        sb.append(this.n);
        sb.append(", statusColor=");
        sb.append(this.o);
        sb.append(", backgroundResId=");
        sb.append(this.p);
        sb.append(", isShowActionButton=");
        sb.append(this.q);
        sb.append(", isDeleted=false, hasGoodItemsForReview=");
        sb.append(this.r);
        sb.append(", goodReviewsCount=");
        return vu5.b(sb, this.s, ')');
    }
}
