package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.CreateMarketItemReviewArguments;
import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: MarketItemReviewsNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class o410 {

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class a extends o410 {
        public final int a;
        public final int b;
        public final UserId c;
        public final long d;
        public final ListBuilder e;

        public a(int i, int i2, UserId userId, long j, ListBuilder listBuilder) {
            this.a = i;
            this.b = i2;
            this.c = userId;
            this.d = j;
            this.e = listBuilder;
        }
    }

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class b extends o410 {
        public final String a;

        public b(String str) {
            this.a = str;
        }
    }

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class c extends o410 {
        public final CreateMarketItemReviewArguments a;

        public c(CreateMarketItemReviewArguments createMarketItemReviewArguments) {
            this.a = createMarketItemReviewArguments;
        }
    }

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class d extends o410 {
        public final UserId a;
        public final int b;
        public final long c;

        public d(UserId userId, long j, int i) {
            this.a = userId;
            this.b = i;
            this.c = j;
        }
    }

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class e extends o410 {
        public final int a;
        public final UserId b;

        public e(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }
    }

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class f extends o410 {
        public final ArrayList a;
        public final int b;

        public f(ArrayList arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }
    }

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class g extends o410 {
        public final UserId a;
        public final UserId b;

        public g(UserId userId, UserId userId2) {
            this.a = userId;
            this.b = userId2;
        }
    }

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class h extends o410 {
        public final f210 a;

        public h(f210 f210Var) {
            this.a = f210Var;
        }
    }

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class i extends o410 {
        public final String a;

        public i(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ToShowAllOzonReviews(url="), this.a, ')');
        }
    }

    /* compiled from: MarketItemReviewsNavigationEvent.kt */
    public static final class j extends o410 {
        public final UserId a;

        public j(UserId userId) {
            this.a = userId;
        }
    }
}
