package xsna;

import com.vk.ecomm.reviews.api.communites.ReviewsDialogType;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CreateMarketItemReviewNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class r8k {

    /* compiled from: CreateMarketItemReviewNavigationEvent.kt */
    public static final class a extends r8k {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: CreateMarketItemReviewNavigationEvent.kt */
    public static final class b extends r8k {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    /* compiled from: CreateMarketItemReviewNavigationEvent.kt */
    public static final class c extends r8k {
        public final tlo0.f a;
        public final tlo0 b;
        public final int c;
        public final int d;
        public final Integer e;
        public final Integer f;
        public final ReviewsDialogType g;
        public final boolean h;

        public c(tlo0.f fVar, tlo0 tlo0Var, ReviewsDialogType reviewsDialogType, int i) {
            Integer valueOf = Integer.valueOf(R.string.market_item_reviews_cancel);
            Integer valueOf2 = Integer.valueOf(R.string.market_item_reviews_close);
            valueOf = (i & 16) != 0 ? null : valueOf;
            valueOf2 = (i & 32) != 0 ? Integer.valueOf(R.string.market_item_reviews_back) : valueOf2;
            reviewsDialogType = (i & 64) != 0 ? ReviewsDialogType.DEFAULT : reviewsDialogType;
            boolean z = (i & 128) != 0;
            this.a = fVar;
            this.b = tlo0Var;
            this.c = R.drawable.vk_icon_error_outline_56;
            this.d = R.attr.vk_legacy_accent;
            this.e = valueOf;
            this.f = valueOf2;
            this.g = reviewsDialogType;
            this.h = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && this.g == cVar.g && this.h == cVar.h;
        }

        public final int hashCode() {
            int a = shy.a(this.d, shy.a(this.c, com.vk.movika.sdk.base.model.history.b.a(Integer.hashCode(this.a.a) * 31, 31, this.b), 31), 31);
            Integer num = this.e;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f;
            return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToBottomSheet(title=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", imageRes=");
            sb.append(this.c);
            sb.append(", imageTint=");
            sb.append(this.d);
            sb.append(", blueButtonText=");
            sb.append(this.e);
            sb.append(", grayButtonText=");
            sb.append(this.f);
            sb.append(", dialogType=");
            sb.append(this.g);
            sb.append(", isDismissButtonVisible=");
            return defpackage.q0.a(sb, this.h, ')');
        }
    }
}
