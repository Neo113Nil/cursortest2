package xsna;

import com.vk.ecomm.reviews.impl.pinnedreview.domain.CardType;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionAction;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionStatus;

/* compiled from: PinReviewSubscriptionDetails.kt */
/* loaded from: classes18.dex */
public final class kna0 {
    public final int a;
    public final SubscriptionStatus b;
    public final c c;
    public final int d;
    public final String e;
    public final a f;
    public final b g;
    public final SubscriptionAction h;

    /* compiled from: PinReviewSubscriptionDetails.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdditionalInfo(title=");
            sb.append(this.a);
            sb.append(", description=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: PinReviewSubscriptionDetails.kt */
    public static final class b {
        public final String a;
        public final CardType b;

        public b(String str, CardType cardType) {
            this.a = str;
            this.b = cardType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            CardType cardType = this.b;
            return hashCode + (cardType != null ? cardType.hashCode() : 0);
        }

        public final String toString() {
            return "PaymentCard(number=" + this.a + ", type=" + this.b + ')';
        }
    }

    /* compiled from: PinReviewSubscriptionDetails.kt */
    public static final class c {
        public final int a;
        public final String b;

        public c(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Price(amount=");
            sb.append(this.a);
            sb.append(", amountText=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public kna0(int i, SubscriptionStatus subscriptionStatus, c cVar, int i2, String str, a aVar, b bVar, SubscriptionAction subscriptionAction) {
        this.a = i;
        this.b = subscriptionStatus;
        this.c = cVar;
        this.d = i2;
        this.e = str;
        this.f = aVar;
        this.g = bVar;
        this.h = subscriptionAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kna0)) {
            return false;
        }
        kna0 kna0Var = (kna0) obj;
        return this.a == kna0Var.a && this.b == kna0Var.b && epx.f(this.c, kna0Var.c) && this.d == kna0Var.d && epx.f(this.e, kna0Var.e) && epx.f(this.f, kna0Var.f) && epx.f(this.g, kna0Var.g) && this.h == kna0Var.h;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + urd0.a(shy.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31, 31), 31, this.e)) * 31;
        b bVar = this.g;
        return this.h.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        return "PinReviewSubscriptionDetails(payerId=" + this.a + ", status=" + this.b + ", price=" + this.c + ", nextPaidAt=" + this.d + ", subscriptionName=" + this.e + ", additionalInfo=" + this.f + ", paymentMethod=" + this.g + ", nextAction=" + this.h + ')';
    }
}
