package com.yandex.go.promocodes.referral.api.net.dto;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vci0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "", "Companion", "com/yandex/go/promocodes/referral/api/net/dto/b", "PromoBanner", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ReferralCode {
    public static final b Companion = new b();
    public static final i3y[] m;
    public static final ReferralCode n;
    public static final ReferralCode o;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public final ief f;
    public final PromoBanner g;
    public final ReferralOverrides h;
    public final ReferralService i;
    public final String j;
    public final FormattedText k;
    public final List l;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new i3y[]{null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new vci0(2)), null, null, kotlin.a.b(lazyThreadSafetyMode, new vci0(3))};
        n = new ReferralCode(4095);
        o = new ReferralCode(4079);
    }

    public /* synthetic */ ReferralCode(int i, String str, int i2, String str2, String str3, boolean z, ief iefVar, PromoBanner promoBanner, ReferralOverrides referralOverrides, ReferralService referralService, String str4, FormattedText formattedText, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = iefVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = promoBanner;
        }
        if ((i & 128) == 0) {
            this.h = ReferralOverrides.f;
        } else {
            this.h = referralOverrides;
        }
        if ((i & 256) == 0) {
            this.i = ReferralService.UNKNOWN;
        } else {
            this.i = referralService;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = formattedText;
        }
        if ((i & 2048) == 0) {
            this.l = EmptyList.a;
        } else {
            this.l = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralCode)) {
            return false;
        }
        ReferralCode referralCode = (ReferralCode) obj;
        return jl40.l(this.a, referralCode.a) && this.b == referralCode.b && jl40.l(this.c, referralCode.c) && jl40.l(this.d, referralCode.d) && this.e == referralCode.e && jl40.l(this.f, referralCode.f) && jl40.l(this.g, referralCode.g) && jl40.l(this.h, referralCode.h) && this.i == referralCode.i && jl40.l(this.j, referralCode.j) && jl40.l(this.k, referralCode.k) && jl40.l(this.l, referralCode.l);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b(oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
        String str2 = this.d;
        int e = unr0.e((b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        ief iefVar = this.f;
        int hashCode = (e + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
        PromoBanner promoBanner = this.g;
        int hashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((hashCode + (promoBanner == null ? 0 : promoBanner.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.j;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FormattedText formattedText = this.k;
        int hashCode4 = (hashCode3 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        List list = this.l;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "ReferralCode(promocode=", this.a, ", ridesLeft=", ", descr=");
        g8e.D(u, this.c, ", message=", this.d, ", isError=");
        u.append(this.e);
        u.append(", currencyRulesDto=");
        u.append(this.f);
        u.append(", promoBanner=");
        u.append(this.g);
        u.append(", overrides=");
        u.append(this.h);
        u.append(", referralService=");
        u.append(this.i);
        u.append(", imageTag=");
        u.append(this.j);
        u.append(", attributedTitles=");
        u.append(this.k);
        u.append(", descriptionItems=");
        u.append(this.l);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode$PromoBanner;", "", "Companion", "$serializer", "com/yandex/go/promocodes/referral/api/net/dto/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PromoBanner {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ PromoBanner(int i, String str, String str2, String str3, String str4) {
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
            if (!(obj instanceof PromoBanner)) {
                return false;
            }
            PromoBanner promoBanner = (PromoBanner) obj;
            return jl40.l(this.a, promoBanner.a) && jl40.l(this.b, promoBanner.b) && jl40.l(this.c, promoBanner.c) && jl40.l(this.d, promoBanner.d);
        }

        public final int hashCode() {
            int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return g8e.r(b64.v("PromoBanner(title=", this.a, ", text=", this.b, ", image="), this.c, ", discount=", this.d, Extension.C_BRAKE);
        }

        public PromoBanner(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public PromoBanner() {
            this("", "", null, null);
        }
    }

    public ReferralCode() {
        this(4095);
    }

    public ReferralCode(String str, int i, String str2, String str3, boolean z, ief iefVar, PromoBanner promoBanner, ReferralOverrides referralOverrides, ReferralService referralService, String str4, FormattedText formattedText, List list) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = iefVar;
        this.g = promoBanner;
        this.h = referralOverrides;
        this.i = referralService;
        this.j = str4;
        this.k = formattedText;
        this.l = list;
    }

    public /* synthetic */ ReferralCode(int i) {
        this(null, 0, "", null, (i & 16) == 0, null, null, ReferralOverrides.f, ReferralService.UNKNOWN, null, null, EmptyList.a);
    }
}
