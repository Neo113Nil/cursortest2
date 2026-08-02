package xsna;

import android.content.Intent;

/* compiled from: MarketAdsItemNavigationEvent.kt */
/* loaded from: classes17.dex */
public interface xp00 {

    /* compiled from: MarketAdsItemNavigationEvent.kt */
    public static final class a implements xp00 {
        public final Intent a;

        public a(Intent intent) {
            this.a = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenDeeplink(intent=" + this.a + ')';
        }
    }

    /* compiled from: MarketAdsItemNavigationEvent.kt */
    public static final class b implements xp00 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenHashtagGrid(hashtag="), this.a, ')');
        }
    }

    /* compiled from: MarketAdsItemNavigationEvent.kt */
    public static final class c implements xp00 {
    }

    /* compiled from: MarketAdsItemNavigationEvent.kt */
    public static final class d implements xp00 {
        public final String a;
        public final int b;

        public d(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenLinkWithTarget(url=");
            sb.append(this.a);
            sb.append(", linkTarget=");
            return vu5.b(sb, this.b, ')');
        }
    }
}
