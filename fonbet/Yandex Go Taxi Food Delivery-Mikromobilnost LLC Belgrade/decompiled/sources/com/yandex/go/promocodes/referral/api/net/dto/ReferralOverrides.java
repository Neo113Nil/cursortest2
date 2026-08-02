package com.yandex.go.promocodes.referral.api.net.dto;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides;", "", "Companion", "com/yandex/go/promocodes/referral/api/net/dto/d", "ReferralScreen", "PromocodeScreen", "OrderCard", "Map", "OrderBanner", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ReferralOverrides {
    public static final d Companion = new d();
    public static final ReferralOverrides f = new ReferralOverrides(0);
    public final ReferralScreen a;
    public final PromocodeScreen b;
    public final OrderCard c;
    public final Map d;
    public final OrderBanner e;

    public /* synthetic */ ReferralOverrides(int i, ReferralScreen referralScreen, PromocodeScreen promocodeScreen, OrderCard orderCard, Map map, OrderBanner orderBanner) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = referralScreen;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = promocodeScreen;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = orderCard;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = orderBanner;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralOverrides)) {
            return false;
        }
        ReferralOverrides referralOverrides = (ReferralOverrides) obj;
        return jl40.l(this.a, referralOverrides.a) && jl40.l(this.b, referralOverrides.b) && jl40.l(this.c, referralOverrides.c) && jl40.l(this.d, referralOverrides.d) && jl40.l(this.e, referralOverrides.e);
    }

    public final int hashCode() {
        ReferralScreen referralScreen = this.a;
        int hashCode = (referralScreen == null ? 0 : referralScreen.hashCode()) * 31;
        PromocodeScreen promocodeScreen = this.b;
        int hashCode2 = (hashCode + (promocodeScreen == null ? 0 : promocodeScreen.hashCode())) * 31;
        OrderCard orderCard = this.c;
        int hashCode3 = (hashCode2 + (orderCard == null ? 0 : orderCard.hashCode())) * 31;
        Map map = this.d;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        OrderBanner orderBanner = this.e;
        return hashCode4 + (orderBanner != null ? orderBanner.hashCode() : 0);
    }

    public final String toString() {
        return "ReferralOverrides(referralScreen=" + this.a + ", promocodeScreen=" + this.b + ", orderCard=" + this.c + ", map=" + this.d + ", orderBanner=" + this.e + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides$Map;", "", "Companion", "$serializer", "com/yandex/go/promocodes/referral/api/net/dto/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Map {
        public static final e Companion = new e();
        public final String a;

        public /* synthetic */ Map(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Map) && jl40.l(this.a, ((Map) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("Map(giftImage=", this.a, Extension.C_BRAKE);
        }

        public Map() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides$OrderCard;", "", "Companion", "$serializer", "com/yandex/go/promocodes/referral/api/net/dto/g", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OrderCard {
        public static final g Companion = new g();
        public final String a;
        public final String b;

        public /* synthetic */ OrderCard(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderCard)) {
                return false;
            }
            OrderCard orderCard = (OrderCard) obj;
            return jl40.l(this.a, orderCard.a) && jl40.l(this.b, orderCard.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("OrderCard(giftImage=", this.a, ", openReferralText=", this.b, Extension.C_BRAKE);
        }

        public OrderCard() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides$OrderBanner;", "", "Companion", "$serializer", "com/yandex/go/promocodes/referral/api/net/dto/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OrderBanner {
        public static final f Companion = new f();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ OrderBanner(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderBanner)) {
                return false;
            }
            OrderBanner orderBanner = (OrderBanner) obj;
            return jl40.l(this.a, orderBanner.a) && jl40.l(this.b, orderBanner.b) && jl40.l(this.c, orderBanner.c) && jl40.l(this.d, orderBanner.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return g8e.r(b64.v("OrderBanner(backgroundColor=", this.a, ", titleTextColor=", this.b, ", detailsTextColor="), this.c, ", discountTextColor=", this.d, Extension.C_BRAKE);
        }

        public OrderBanner() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides$PromocodeScreen;", "", "Companion", "$serializer", "com/yandex/go/promocodes/referral/api/net/dto/h", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PromocodeScreen {
        public static final h Companion = new h();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ PromocodeScreen(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromocodeScreen)) {
                return false;
            }
            PromocodeScreen promocodeScreen = (PromocodeScreen) obj;
            return jl40.l(this.a, promocodeScreen.a) && jl40.l(this.b, promocodeScreen.b) && jl40.l(this.c, promocodeScreen.c) && jl40.l(this.d, promocodeScreen.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return g8e.r(b64.v("PromocodeScreen(openReferralListItemText=", this.a, ", openReferralListItemImage=", this.b, ", openReferralImage="), this.c, ", openReferralBottomButtonText=", this.d, Extension.C_BRAKE);
        }

        public PromocodeScreen() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    public ReferralOverrides(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public ReferralOverrides() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides$ReferralScreen;", "", "Companion", "$serializer", "com/yandex/go/promocodes/referral/api/net/dto/i", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ReferralScreen {
        public static final i Companion = new i();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public /* synthetic */ ReferralScreen(int i, String str, String str2, String str3, String str4, String str5, String str6) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str6;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReferralScreen)) {
                return false;
            }
            ReferralScreen referralScreen = (ReferralScreen) obj;
            return jl40.l(this.a, referralScreen.a) && jl40.l(this.b, referralScreen.b) && jl40.l(this.c, referralScreen.c) && jl40.l(this.d, referralScreen.d) && jl40.l(this.e, referralScreen.e) && jl40.l(this.f, referralScreen.f);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("ReferralScreen(ridesLeftText=", this.a, ", sendReferralCodeText=", this.b, ", imageTag=");
            g8e.D(v, this.c, ", backgroundColor=", this.d, ", referralCodeColor=");
            return g8e.r(v, this.e, ", inviteCodeSubtitle=", this.f, Extension.C_BRAKE);
        }

        public ReferralScreen() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }
}
