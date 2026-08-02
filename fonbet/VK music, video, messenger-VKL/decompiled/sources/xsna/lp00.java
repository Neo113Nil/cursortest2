package xsna;

import com.vk.clips.sdk.models.ads.SdkAdsChoices;

/* compiled from: MarketAdsItemEvent.kt */
/* loaded from: classes17.dex */
public interface lp00 {

    /* compiled from: MarketAdsItemEvent.kt */
    public static final class a implements lp00 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -436417774;
        }

        public final String toString() {
            return "DisableCinemaMode";
        }
    }

    /* compiled from: MarketAdsItemEvent.kt */
    public static final class b implements lp00 {
        public final String a;
        public final SdkAdsChoices b;
        public final boolean c;

        public b(String str, SdkAdsChoices sdkAdsChoices, boolean z) {
            this.a = str;
            this.b = sdkAdsChoices;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SdkAdsChoices sdkAdsChoices = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (sdkAdsChoices == null ? 0 : sdkAdsChoices.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotInterestedClickedEvent(adUniqueKey=");
            sb.append(this.a);
            sb.append(", adChoices=");
            sb.append(this.b);
            sb.append(", mtSdkBehaviour=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
