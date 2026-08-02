package com.ybsdk.rconfig;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gr51;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012J\u008a\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b2\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b3\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b4\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b5\u0010\u0012¨\u00066"}, d2 = {"Lcom/ybsdk/rconfig/YbCommonUrlsImpl;", "Lgr51;", "", "accountStatusUrl", "accountTariffUrl", "faqUrl", "taxServiceUrl", "ybUrl", "documentsUrl", "mirPayManual", "ybFrontendUrl", "helpCenter", "helpCenterPlusCard", "agreementUrl", "simplifiedIdentificationInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/YbCommonUrlsImpl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountStatusUrl", "getAccountTariffUrl", "getFaqUrl", "getTaxServiceUrl", "getYbUrl", "getDocumentsUrl", "getMirPayManual", "getYbFrontendUrl", "getHelpCenter", "getHelpCenterPlusCard", "getAgreementUrl", "getSimplifiedIdentificationInfo", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class YbCommonUrlsImpl implements gr51 {

    @Json(name = "account_status")
    private final String accountStatusUrl;

    @Json(name = "account_tariff")
    private final String accountTariffUrl;

    @Json(name = "app_legal")
    private final String agreementUrl;

    @Json(name = "documents")
    private final String documentsUrl;

    @Json(name = "faq")
    private final String faqUrl;

    @Json(name = "help_center")
    private final String helpCenter;

    @Json(name = "help_center-plus_card")
    private final String helpCenterPlusCard;

    @Json(name = "mir_pay_manual")
    private final String mirPayManual;

    @Json(name = "simplified_identification_info")
    private final String simplifiedIdentificationInfo;

    @Json(name = "federal_tax_service")
    private final String taxServiceUrl;

    @Json(name = "bank_frontend_url")
    private final String ybFrontendUrl;

    @Json(name = "bank")
    private final String ybUrl;

    public YbCommonUrlsImpl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.accountStatusUrl = str;
        this.accountTariffUrl = str2;
        this.faqUrl = str3;
        this.taxServiceUrl = str4;
        this.ybUrl = str5;
        this.documentsUrl = str6;
        this.mirPayManual = str7;
        this.ybFrontendUrl = str8;
        this.helpCenter = str9;
        this.helpCenterPlusCard = str10;
        this.agreementUrl = str11;
        this.simplifiedIdentificationInfo = str12;
    }

    public static /* synthetic */ YbCommonUrlsImpl copy$default(YbCommonUrlsImpl ybCommonUrlsImpl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybCommonUrlsImpl.accountStatusUrl;
        }
        if ((i & 2) != 0) {
            str2 = ybCommonUrlsImpl.accountTariffUrl;
        }
        if ((i & 4) != 0) {
            str3 = ybCommonUrlsImpl.faqUrl;
        }
        if ((i & 8) != 0) {
            str4 = ybCommonUrlsImpl.taxServiceUrl;
        }
        if ((i & 16) != 0) {
            str5 = ybCommonUrlsImpl.ybUrl;
        }
        if ((i & 32) != 0) {
            str6 = ybCommonUrlsImpl.documentsUrl;
        }
        if ((i & 64) != 0) {
            str7 = ybCommonUrlsImpl.mirPayManual;
        }
        if ((i & 128) != 0) {
            str8 = ybCommonUrlsImpl.ybFrontendUrl;
        }
        if ((i & 256) != 0) {
            str9 = ybCommonUrlsImpl.helpCenter;
        }
        if ((i & 512) != 0) {
            str10 = ybCommonUrlsImpl.helpCenterPlusCard;
        }
        if ((i & 1024) != 0) {
            str11 = ybCommonUrlsImpl.agreementUrl;
        }
        if ((i & 2048) != 0) {
            str12 = ybCommonUrlsImpl.simplifiedIdentificationInfo;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return ybCommonUrlsImpl.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountStatusUrl() {
        return this.accountStatusUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final String getHelpCenterPlusCard() {
        return this.helpCenterPlusCard;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAgreementUrl() {
        return this.agreementUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSimplifiedIdentificationInfo() {
        return this.simplifiedIdentificationInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountTariffUrl() {
        return this.accountTariffUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTaxServiceUrl() {
        return this.taxServiceUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getYbUrl() {
        return this.ybUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDocumentsUrl() {
        return this.documentsUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMirPayManual() {
        return this.mirPayManual;
    }

    /* renamed from: component8, reason: from getter */
    public final String getYbFrontendUrl() {
        return this.ybFrontendUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getHelpCenter() {
        return this.helpCenter;
    }

    public final YbCommonUrlsImpl copy(String accountStatusUrl, String accountTariffUrl, String faqUrl, String taxServiceUrl, String ybUrl, String documentsUrl, String mirPayManual, String ybFrontendUrl, String helpCenter, String helpCenterPlusCard, String agreementUrl, String simplifiedIdentificationInfo) {
        return new YbCommonUrlsImpl(accountStatusUrl, accountTariffUrl, faqUrl, taxServiceUrl, ybUrl, documentsUrl, mirPayManual, ybFrontendUrl, helpCenter, helpCenterPlusCard, agreementUrl, simplifiedIdentificationInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCommonUrlsImpl)) {
            return false;
        }
        YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) other;
        return jl40.l(this.accountStatusUrl, ybCommonUrlsImpl.accountStatusUrl) && jl40.l(this.accountTariffUrl, ybCommonUrlsImpl.accountTariffUrl) && jl40.l(this.faqUrl, ybCommonUrlsImpl.faqUrl) && jl40.l(this.taxServiceUrl, ybCommonUrlsImpl.taxServiceUrl) && jl40.l(this.ybUrl, ybCommonUrlsImpl.ybUrl) && jl40.l(this.documentsUrl, ybCommonUrlsImpl.documentsUrl) && jl40.l(this.mirPayManual, ybCommonUrlsImpl.mirPayManual) && jl40.l(this.ybFrontendUrl, ybCommonUrlsImpl.ybFrontendUrl) && jl40.l(this.helpCenter, ybCommonUrlsImpl.helpCenter) && jl40.l(this.helpCenterPlusCard, ybCommonUrlsImpl.helpCenterPlusCard) && jl40.l(this.agreementUrl, ybCommonUrlsImpl.agreementUrl) && jl40.l(this.simplifiedIdentificationInfo, ybCommonUrlsImpl.simplifiedIdentificationInfo);
    }

    public String getAccountStatusUrl() {
        return this.accountStatusUrl;
    }

    public String getAccountTariffUrl() {
        return this.accountTariffUrl;
    }

    public String getAgreementUrl() {
        return this.agreementUrl;
    }

    public String getDocumentsUrl() {
        return this.documentsUrl;
    }

    public String getFaqUrl() {
        return this.faqUrl;
    }

    public String getHelpCenter() {
        return this.helpCenter;
    }

    public String getHelpCenterPlusCard() {
        return this.helpCenterPlusCard;
    }

    public String getMirPayManual() {
        return this.mirPayManual;
    }

    public String getSimplifiedIdentificationInfo() {
        return this.simplifiedIdentificationInfo;
    }

    @Override // defpackage.gr51
    public String getTaxServiceUrl() {
        return this.taxServiceUrl;
    }

    public String getYbFrontendUrl() {
        return this.ybFrontendUrl;
    }

    public String getYbUrl() {
        return this.ybUrl;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.accountStatusUrl.hashCode() * 31, 31, this.accountTariffUrl), 31, this.faqUrl), 31, this.taxServiceUrl), 31, this.ybUrl), 31, this.documentsUrl), 31, this.mirPayManual), 31, this.ybFrontendUrl), 31, this.helpCenter), 31, this.helpCenterPlusCard), 31, this.agreementUrl);
        String str = this.simplifiedIdentificationInfo;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.accountStatusUrl;
        String str2 = this.accountTariffUrl;
        String str3 = this.faqUrl;
        String str4 = this.taxServiceUrl;
        String str5 = this.ybUrl;
        String str6 = this.documentsUrl;
        String str7 = this.mirPayManual;
        String str8 = this.ybFrontendUrl;
        String str9 = this.helpCenter;
        String str10 = this.helpCenterPlusCard;
        String str11 = this.agreementUrl;
        String str12 = this.simplifiedIdentificationInfo;
        StringBuilder v = b64.v("YbCommonUrlsImpl(accountStatusUrl=", str, ", accountTariffUrl=", str2, ", faqUrl=");
        g8e.D(v, str3, ", taxServiceUrl=", str4, ", ybUrl=");
        g8e.D(v, str5, ", documentsUrl=", str6, ", mirPayManual=");
        g8e.D(v, str7, ", ybFrontendUrl=", str8, ", helpCenter=");
        g8e.D(v, str9, ", helpCenterPlusCard=", str10, ", agreementUrl=");
        return g8e.r(v, str11, ", simplifiedIdentificationInfo=", str12, Extension.C_BRAKE);
    }
}
