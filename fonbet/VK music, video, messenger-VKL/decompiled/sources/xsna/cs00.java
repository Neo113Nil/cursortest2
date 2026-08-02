package xsna;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.allreviews.presentation.MarketAllReviewsTabTypes;

/* compiled from: MarketAllReviewsEvent.kt */
/* loaded from: classes18.dex */
public abstract class cs00 {

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class a extends cs00 {
        public final long a;
        public final UserId b;
        public final float c;

        public a(long j, UserId userId, float f) {
            this.a = j;
            this.b = userId;
            this.c = f;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class b extends cs00 {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class c extends cs00 {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class d extends cs00 {
        public final int a;
        public final View b;

        public d(int i, View view) {
            this.a = i;
            this.b = view;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class e extends cs00 {
        public final int a;
        public final View b;

        public e(int i, View view) {
            this.a = i;
            this.b = view;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class f extends cs00 {
        public final int a;

        public f(int i) {
            this.a = i;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class g extends cs00 {
        public final int a;
        public final String b;

        public g(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class h extends cs00 {
        public final String a;

        public h(String str) {
            this.a = str;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class i extends cs00 {
        public final String a;
        public final View b;

        public i(View view, String str) {
            this.a = str;
            this.b = view;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class j extends cs00 {
        public final String a;

        public j(String str) {
            this.a = str;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class k extends cs00 {
        public final int a;

        public k(int i) {
            this.a = i;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class l extends cs00 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -779623199;
        }

        public final String toString() {
            return "OnPaginationErrorRetryButtonClick";
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class m extends cs00 {
        public final int a;

        public m(int i) {
            this.a = i;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class n extends cs00 {
        public final String a;

        public n(String str) {
            this.a = str;
        }
    }

    /* compiled from: MarketAllReviewsEvent.kt */
    public static final class o extends cs00 {
        public final MarketAllReviewsTabTypes a;

        public o(MarketAllReviewsTabTypes marketAllReviewsTabTypes) {
            this.a = marketAllReviewsTabTypes;
        }
    }
}
