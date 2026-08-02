package xsna;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.ads.DisclaimerBannerData;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: SdkClipsFeedItem.kt */
/* loaded from: classes17.dex */
public interface wih0 {

    /* compiled from: SdkClipsFeedItem.kt */
    public static final class a implements wih0 {
        public final SdkVideoFile a;
        public final wp50 b;

        public a(SdkVideoFile sdkVideoFile, aq50 aq50Var) {
            this.a = sdkVideoFile;
            this.b = aq50Var;
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
            int hashCode = this.a.hashCode() * 31;
            wp50 wp50Var = this.b;
            return hashCode + (wp50Var == null ? 0 : wp50Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Clip(video=");
            sb.append(this.a);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.b, ')');
        }
    }

    /* compiled from: SdkClipsFeedItem.kt */
    public static final class b implements wih0 {
        public final String a;
        public final ArrayList b;
        public final ImageUrl c;
        public final a d;
        public final SdkActionLink e;
        public final String f;
        public final String g;
        public final wp50 h;

        /* compiled from: SdkClipsFeedItem.kt */
        public static final class a {
            public final String a;
            public final String b;
            public final DisclaimerBannerData c;
            public final String d;
            public final SdkOwner e;
            public final String f;
            public final String g;
            public final String h;
            public final SdkImages i;
            public final String j;
            public final Object k;
            public final SdkAdsChoices l;

            public a(String str, String str2, DisclaimerBannerData disclaimerBannerData, String str3, SdkOwner sdkOwner, String str4, String str5, String str6, SdkImages sdkImages, String str7, Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map, SdkAdsChoices sdkAdsChoices) {
                this.a = str;
                this.b = str2;
                this.c = disclaimerBannerData;
                this.d = str3;
                this.e = sdkOwner;
                this.f = str4;
                this.g = str5;
                this.h = str6;
                this.i = sdkImages;
                this.j = str7;
                this.k = map;
                this.l = sdkAdsChoices;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && this.k.equals(aVar.k) && epx.f(this.l, aVar.l);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                DisclaimerBannerData disclaimerBannerData = this.c;
                int hashCode3 = (hashCode2 + (disclaimerBannerData == null ? 0 : disclaimerBannerData.hashCode())) * 31;
                String str3 = this.d;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                SdkOwner sdkOwner = this.e;
                int a = urd0.a((hashCode4 + (sdkOwner == null ? 0 : sdkOwner.hashCode())) * 31, 31, this.f);
                String str4 = this.g;
                int hashCode5 = (a + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.h;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                SdkImages sdkImages = this.i;
                int hashCode7 = (hashCode6 + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
                String str6 = this.j;
                int a2 = vul0.a((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.k);
                SdkAdsChoices sdkAdsChoices = this.l;
                return a2 + (sdkAdsChoices != null ? sdkAdsChoices.hashCode() : 0);
            }

            public final String toString() {
                return "AdInfo(title=" + this.a + ", disclaimer=" + this.b + ", disclaimerBannerData=" + this.c + ", ageRestrictions=" + this.d + ", owner=" + this.e + ", ownerTitle=" + this.f + ", advertiserInfoUrl=" + this.g + ", adMarker=" + this.h + ", photoIcon=" + this.i + ", actionLinkUrl=" + this.j + ", adsStatPixels=" + this.k + ", adsChoices=" + this.l + ')';
            }
        }

        public b(String str, ArrayList arrayList, ImageUrl imageUrl, a aVar, SdkActionLink sdkActionLink, String str2, String str3, aq50 aq50Var) {
            this.a = str;
            this.b = arrayList;
            this.c = imageUrl;
            this.d = aVar;
            this.e = sdkActionLink;
            this.f = str2;
            this.g = str3;
            this.h = aq50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c) && this.d.equals(bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h);
        }

        public final int hashCode() {
            int a2 = qr.a(this.b, this.a.hashCode() * 31, 31);
            ImageUrl imageUrl = this.c;
            int hashCode = (this.d.hashCode() + ((a2 + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31)) * 31;
            SdkActionLink sdkActionLink = this.e;
            int a3 = urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.f);
            String str = this.g;
            int hashCode2 = (a3 + (str == null ? 0 : str.hashCode())) * 31;
            wp50 wp50Var = this.h;
            return hashCode2 + (wp50Var != null ? wp50Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketAd(id=");
            sb.append(this.a);
            sb.append(", cards=");
            sb.append(this.b);
            sb.append(", image=");
            sb.append(this.c);
            sb.append(", adInfo=");
            sb.append(this.d);
            sb.append(", actionLink=");
            sb.append(this.e);
            sb.append(", description=");
            sb.append(this.f);
            sb.append(", trackCode=");
            sb.append(this.g);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.h, ')');
        }
    }

    /* compiled from: SdkClipsFeedItem.kt */
    public static final class c implements wih0 {
        public final String a;
        public final ArrayList b;
        public final String c;
        public final String d;

        public c(String str, String str2, String str3, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b.equals(cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int a = qr.a(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShopsGridItems(id=");
            sb.append(this.a);
            sb.append(", items=");
            sb.append(this.b);
            sb.append(", trackCode=");
            sb.append(this.c);
            sb.append(", nextFrom=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: SdkClipsFeedItem.kt */
    public static final class d implements wih0 {
        public final String a;
        public final ImageUrl b;
        public final a c;
        public final SdkActionLink d;
        public final String e;
        public final String f;
        public final wp50 g;

        /* compiled from: SdkClipsFeedItem.kt */
        public static final class a {
            public final String a;
            public final String b;
            public final String c;
            public final SdkOwner d;
            public final String e;
            public final String f;
            public final String g;
            public final SdkImages h;
            public final Map<AdStatPixel.Type, List<AdStatPixel>> i;
            public final String j;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, String str2, String str3, SdkOwner sdkOwner, String str4, String str5, String str6, SdkImages sdkImages, Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map, String str7) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = sdkOwner;
                this.e = str4;
                this.f = str5;
                this.g = str6;
                this.h = sdkImages;
                this.i = map;
                this.j = str7;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                SdkOwner sdkOwner = this.d;
                int a = urd0.a((hashCode3 + (sdkOwner == null ? 0 : sdkOwner.hashCode())) * 31, 31, this.e);
                String str4 = this.f;
                int hashCode4 = (a + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.g;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                SdkImages sdkImages = this.h;
                int a2 = v11.a((hashCode5 + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31, 31, this.i);
                String str6 = this.j;
                return a2 + (str6 != null ? str6.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AdInfo(title=");
                sb.append(this.a);
                sb.append(", disclaimer=");
                sb.append(this.b);
                sb.append(", ageRestrictions=");
                sb.append(this.c);
                sb.append(", owner=");
                sb.append(this.d);
                sb.append(", ownerTitle=");
                sb.append(this.e);
                sb.append(", advertiserInfoUrl=");
                sb.append(this.f);
                sb.append(", adMarker=");
                sb.append(this.g);
                sb.append(", photoIcon=");
                sb.append(this.h);
                sb.append(", adsStatPixels=");
                sb.append(this.i);
                sb.append(", actionLinkUrl=");
                return ho8.a(sb, this.j, ')');
            }
        }

        public d(String str, ImageUrl imageUrl, a aVar, SdkActionLink sdkActionLink, String str2, String str3, aq50 aq50Var) {
            this.a = str;
            this.b = imageUrl;
            this.c = aVar;
            this.d = sdkActionLink;
            this.e = str2;
            this.f = str3;
            this.g = aq50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            SdkActionLink sdkActionLink = this.d;
            int a2 = urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.e);
            String str = this.f;
            int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            wp50 wp50Var = this.g;
            return hashCode2 + (wp50Var != null ? wp50Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StaticAd(id=");
            sb.append(this.a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", adInfo=");
            sb.append(this.c);
            sb.append(", actionLink=");
            sb.append(this.d);
            sb.append(", description=");
            sb.append(this.e);
            sb.append(", trackCode=");
            sb.append(this.f);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.g, ')');
        }
    }
}
