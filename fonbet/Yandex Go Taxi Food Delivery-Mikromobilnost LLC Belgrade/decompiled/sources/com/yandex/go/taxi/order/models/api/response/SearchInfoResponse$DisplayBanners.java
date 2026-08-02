package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/SearchInfoResponse$DisplayBanners", "Lcom/yandex/go/taxi/order/models/api/response/r7;", "Companion", "Banner", "$serializer", "com/yandex/go/taxi/order/models/api/response/f7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SearchInfoResponse$DisplayBanners extends r7 {
    public static final f7 Companion = new f7();
    public final String a;
    public final Banner b;
    public final SearchInfoResponse$DisplaySettings c;

    public SearchInfoResponse$DisplayBanners(int i, String str, Banner banner, SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new Banner(0);
        } else {
            this.b = banner;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = searchInfoResponse$DisplaySettings;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInfoResponse$DisplayBanners)) {
            return false;
        }
        SearchInfoResponse$DisplayBanners searchInfoResponse$DisplayBanners = (SearchInfoResponse$DisplayBanners) obj;
        return jl40.l(this.a, searchInfoResponse$DisplayBanners.a) && jl40.l(this.b, searchInfoResponse$DisplayBanners.b) && jl40.l(this.c, searchInfoResponse$DisplayBanners.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings = this.c;
        return hashCode + (searchInfoResponse$DisplaySettings == null ? 0 : searchInfoResponse$DisplaySettings.hashCode());
    }

    public final String toString() {
        return "DisplayBanners(title=" + this.a + ", banner=" + this.b + ", displaySettings=" + this.c + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$DisplayBanners$Banner;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/e7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Banner {
        public static final e7 Companion = new e7();
        public final String a;
        public final String b;

        public /* synthetic */ Banner(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return jl40.l(this.a, banner.a) && jl40.l(this.b, banner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("Banner(title=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
        }

        public Banner(int i) {
            this.a = "";
            this.b = "";
        }

        public Banner() {
            this(0);
        }
    }

    public SearchInfoResponse$DisplayBanners() {
        Banner banner = new Banner(0);
        this.a = "";
        this.b = banner;
        this.c = null;
    }
}
