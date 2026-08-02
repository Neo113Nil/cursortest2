package com.yandex.payment.sdk.model.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.payment.sdk.core.data.AppInfo;
import com.yandex.payment.sdk.core.data.BrowserCard;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.core.data.GooglePayAllowedCardNetworks;
import com.yandex.payment.sdk.core.data.GooglePayData;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.xplat.payment.sdk.XTheme;
import defpackage.jxi;
import defpackage.nzs;
import defpackage.te91;
import defpackage.vfc;
import defpackage.x4e;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bG\b\u0007\u0018\u00002\u00020\u0001:\u0001{B\u0097\u0002\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\r\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010%\u001a\u00020\r\u0012\u0006\u0010&\u001a\u00020\r\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u001b¢\u0006\u0004\b0\u00101J\u001d\u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001b¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010@R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bR\u0010QR\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bS\u0010KR\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\bT\u0010KR \u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010I\u0012\u0004\bV\u0010W\u001a\u0004\bU\u0010KR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u0010ZR$\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010O\u001a\u0004\b[\u0010Q\"\u0004\b\\\u0010]R$\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010O\u001a\u0004\b^\u0010Q\"\u0004\b_\u0010]R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010`\u001a\u0004\ba\u00101R\u0017\u0010\u001d\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010I\u001a\u0004\bb\u0010KR\u0017\u0010\u001e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010I\u001a\u0004\bc\u0010KR\"\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010I\u001a\u0004\bd\u0010K\"\u0004\be\u0010fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010\"\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010I\u001a\u0004\bj\u0010KR\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010%\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b%\u0010I\u001a\u0004\bn\u0010KR \u0010&\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010I\u0012\u0004\bo\u0010W\u001a\u0004\b&\u0010KR\u0019\u0010'\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b'\u0010p\u001a\u0004\bq\u0010rR\u0019\u0010(\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b(\u0010O\u001a\u0004\bs\u0010QR%\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010t\u001a\u0004\bu\u0010vR\u0019\u0010+\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b+\u0010O\u001a\u0004\bw\u0010QR\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010x\u001a\u0004\by\u0010z¨\u0006|"}, d2 = {"Lcom/yandex/payment/sdk/model/data/AdditionalSettings;", "Landroid/os/Parcelable;", "Lcom/yandex/payment/sdk/core/data/CardValidationConfig;", "cardValidationConfig", "Lcom/yandex/payment/sdk/core/data/PaymentMethodsFilter;", "paymentMethodsFilter", "", "Lcom/yandex/payment/sdk/core/data/BrowserCard;", "browserCards", "Lcom/yandex/payment/sdk/core/data/AppInfo;", "appInfo", "Lcom/yandex/payment/sdk/model/data/ResultScreenClosing;", "resultScreenClosing", "", "forceCVV", "Lcom/yandex/payment/sdk/model/data/PersonalInfoConfig;", "personalInfoConfig", "", "passportToken", "partition", "enableCashPayments", "exchangeOauthToken", "disallowHidingOnTouchOutsideDuringPay", "Lcom/yandex/payment/sdk/core/data/GooglePayData;", "googlePayData", "currency", "pos", "", "regionId", "showCharityLabel", "useNewCardInputForm", "showSBPTokens", "Lcom/yandex/payment/sdk/core/data/GooglePayAllowedCardNetworks;", "allowedCardNetworks", "forceCloseFeatureOn", "Lcom/yandex/payment/sdk/model/data/WidthOnLargeScreen;", "widthOnLargeScreen", "useVerificationStatusPolling", "isTelemetryEnabled", "enableDebranding", "paymentTo", "", "legalUrlsMap", "integrationProfileId", "Lcom/yandex/xplat/payment/sdk/XTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "<init>", "(Lcom/yandex/payment/sdk/core/data/CardValidationConfig;Lcom/yandex/payment/sdk/core/data/PaymentMethodsFilter;Ljava/util/List;Lcom/yandex/payment/sdk/core/data/AppInfo;Lcom/yandex/payment/sdk/model/data/ResultScreenClosing;ZLcom/yandex/payment/sdk/model/data/PersonalInfoConfig;Ljava/lang/String;Ljava/lang/String;ZZZLcom/yandex/payment/sdk/core/data/GooglePayData;Ljava/lang/String;Ljava/lang/String;IZZZLcom/yandex/payment/sdk/core/data/GooglePayAllowedCardNetworks;ZLcom/yandex/payment/sdk/model/data/WidthOnLargeScreen;ZZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/yandex/xplat/payment/sdk/XTheme;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/payment/sdk/core/data/CardValidationConfig;", "getCardValidationConfig", "()Lcom/yandex/payment/sdk/core/data/CardValidationConfig;", "Lcom/yandex/payment/sdk/core/data/PaymentMethodsFilter;", "getPaymentMethodsFilter", "()Lcom/yandex/payment/sdk/core/data/PaymentMethodsFilter;", "Ljava/util/List;", "getBrowserCards", "()Ljava/util/List;", "Lcom/yandex/payment/sdk/core/data/AppInfo;", "getAppInfo", "()Lcom/yandex/payment/sdk/core/data/AppInfo;", "setAppInfo", "(Lcom/yandex/payment/sdk/core/data/AppInfo;)V", "Lcom/yandex/payment/sdk/model/data/ResultScreenClosing;", "getResultScreenClosing", "()Lcom/yandex/payment/sdk/model/data/ResultScreenClosing;", "Z", "getForceCVV", "()Z", "Lcom/yandex/payment/sdk/model/data/PersonalInfoConfig;", "getPersonalInfoConfig", "()Lcom/yandex/payment/sdk/model/data/PersonalInfoConfig;", "Ljava/lang/String;", "getPassportToken", "()Ljava/lang/String;", "getPartition", "getEnableCashPayments", "getExchangeOauthToken", "getDisallowHidingOnTouchOutsideDuringPay", "getDisallowHidingOnTouchOutsideDuringPay$annotations", "()V", "Lcom/yandex/payment/sdk/core/data/GooglePayData;", "getGooglePayData", "()Lcom/yandex/payment/sdk/core/data/GooglePayData;", "getCurrency", "setCurrency", "(Ljava/lang/String;)V", "getPos", "setPos", CA20Status.STATUS_USER_I, "getRegionId", "getShowCharityLabel", "getUseNewCardInputForm", "getShowSBPTokens", "setShowSBPTokens", "(Z)V", "Lcom/yandex/payment/sdk/core/data/GooglePayAllowedCardNetworks;", "getAllowedCardNetworks", "()Lcom/yandex/payment/sdk/core/data/GooglePayAllowedCardNetworks;", "getForceCloseFeatureOn", "Lcom/yandex/payment/sdk/model/data/WidthOnLargeScreen;", "getWidthOnLargeScreen", "()Lcom/yandex/payment/sdk/model/data/WidthOnLargeScreen;", "getUseVerificationStatusPolling", "isTelemetryEnabled$annotations", "Ljava/lang/Boolean;", "getEnableDebranding", "()Ljava/lang/Boolean;", "getPaymentTo", "Ljava/util/Map;", "getLegalUrlsMap", "()Ljava/util/Map;", "getIntegrationProfileId", "Lcom/yandex/xplat/payment/sdk/XTheme;", "getTheme", "()Lcom/yandex/xplat/payment/sdk/XTheme;", "a", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdditionalSettings implements Parcelable {
    public static final Parcelable.Creator<AdditionalSettings> CREATOR = new Creator();
    private final GooglePayAllowedCardNetworks allowedCardNetworks;
    private AppInfo appInfo;
    private final List<BrowserCard> browserCards;
    private final CardValidationConfig cardValidationConfig;
    private String currency;
    private final boolean disallowHidingOnTouchOutsideDuringPay;
    private final boolean enableCashPayments;
    private final Boolean enableDebranding;
    private final boolean exchangeOauthToken;
    private final boolean forceCVV;
    private final boolean forceCloseFeatureOn;
    private final GooglePayData googlePayData;
    private final String integrationProfileId;
    private final boolean isTelemetryEnabled;
    private final Map<String, String> legalUrlsMap;
    private final String partition;
    private final String passportToken;
    private final PaymentMethodsFilter paymentMethodsFilter;
    private final String paymentTo;
    private final PersonalInfoConfig personalInfoConfig;
    private String pos;
    private final int regionId;
    private final ResultScreenClosing resultScreenClosing;
    private final boolean showCharityLabel;
    private boolean showSBPTokens;
    private final XTheme theme;
    private final boolean useNewCardInputForm;
    private final boolean useVerificationStatusPolling;
    private final WidthOnLargeScreen widthOnLargeScreen;

    public static final class a {
        public CardValidationConfig a;
        public PaymentMethodsFilter b;
        public final EmptyList c;
        public AppInfo d;
        public ResultScreenClosing e;
        public PersonalInfoConfig f;
        public String g;
        public boolean h;
        public String i;
        public String j;
        public int k;
        public boolean l;
        public final GooglePayAllowedCardNetworks m;
        public WidthOnLargeScreen n;
        public boolean o;
        public final boolean p;
        public Map q;
        public String r;
        public final XTheme s;

        public a() {
            CardValidationConfig cardValidationConfig;
            AppInfo appInfo;
            PersonalInfoConfig personalInfoConfig;
            GooglePayAllowedCardNetworks googlePayAllowedCardNetworks;
            CardValidationConfig.Companion.getClass();
            cardValidationConfig = CardValidationConfig.Default;
            this.a = cardValidationConfig;
            this.b = new PaymentMethodsFilter();
            this.c = EmptyList.a;
            AppInfo.Companion.getClass();
            appInfo = AppInfo.Default;
            this.d = appInfo;
            this.e = new ResultScreenClosing(false, 0L, 3, null);
            PersonalInfoConfig.Companion.getClass();
            personalInfoConfig = PersonalInfoConfig.DEFAULT;
            this.f = personalInfoConfig;
            this.k = 225;
            GooglePayAllowedCardNetworks.Companion.getClass();
            googlePayAllowedCardNetworks = GooglePayAllowedCardNetworks.DEFAULT;
            this.m = googlePayAllowedCardNetworks;
            this.p = true;
            this.s = XTheme.light;
        }

        public final AdditionalSettings a() {
            return new AdditionalSettings(this.a, te91.c(this.b), this.c, this.d, this.e, false, this.f, null, this.g, false, this.h, false, null, this.i, this.j, this.k, false, this.l, false, this.m, false, this.n, this.o, this.p, null, null, this.q, this.r, this.s);
        }

        public final void b(AppInfo appInfo) {
            this.d = appInfo;
        }

        public final void c(CardValidationConfig cardValidationConfig) {
            this.a = cardValidationConfig;
        }

        public final void d(String str) {
            this.i = str;
        }

        public final void e() {
            this.h = true;
        }

        public final void f(String str) {
            this.g = str;
        }

        public final void g(PaymentMethodsFilter paymentMethodsFilter) {
            this.b = paymentMethodsFilter;
        }

        public final void h(PersonalInfoConfig personalInfoConfig) {
            this.f = personalInfoConfig;
        }

        public final void i(String str) {
            this.j = str;
        }

        public final void j(ResultScreenClosing resultScreenClosing) {
            this.e = resultScreenClosing;
        }

        public final void k() {
            this.l = true;
        }

        public final void l() {
            this.o = true;
        }

        public final void m(WidthOnLargeScreen widthOnLargeScreen) {
            this.n = widthOnLargeScreen;
        }
    }

    public AdditionalSettings(CardValidationConfig cardValidationConfig, PaymentMethodsFilter paymentMethodsFilter, List<BrowserCard> list, AppInfo appInfo, ResultScreenClosing resultScreenClosing, boolean z, PersonalInfoConfig personalInfoConfig, String str, String str2, boolean z2, boolean z3, boolean z4, GooglePayData googlePayData, String str3, String str4, int i, boolean z5, boolean z6, boolean z7, GooglePayAllowedCardNetworks googlePayAllowedCardNetworks, boolean z8, WidthOnLargeScreen widthOnLargeScreen, boolean z9, boolean z10, Boolean bool, String str5, Map<String, String> map, String str6, XTheme xTheme) {
        this.cardValidationConfig = cardValidationConfig;
        this.paymentMethodsFilter = paymentMethodsFilter;
        this.browserCards = list;
        this.appInfo = appInfo;
        this.resultScreenClosing = resultScreenClosing;
        this.forceCVV = z;
        this.personalInfoConfig = personalInfoConfig;
        this.passportToken = str;
        this.partition = str2;
        this.enableCashPayments = z2;
        this.exchangeOauthToken = z3;
        this.disallowHidingOnTouchOutsideDuringPay = z4;
        this.googlePayData = googlePayData;
        this.currency = str3;
        this.pos = str4;
        this.regionId = i;
        this.showCharityLabel = z5;
        this.useNewCardInputForm = z6;
        this.showSBPTokens = z7;
        this.allowedCardNetworks = googlePayAllowedCardNetworks;
        this.forceCloseFeatureOn = z8;
        this.widthOnLargeScreen = widthOnLargeScreen;
        this.useVerificationStatusPolling = z9;
        this.isTelemetryEnabled = z10;
        this.enableDebranding = bool;
        this.paymentTo = str5;
        this.legalUrlsMap = map;
        this.integrationProfileId = str6;
        this.theme = xTheme;
    }

    @jxi
    public static /* synthetic */ void getDisallowHidingOnTouchOutsideDuringPay$annotations() {
    }

    @jxi
    public static /* synthetic */ void isTelemetryEnabled$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GooglePayAllowedCardNetworks getAllowedCardNetworks() {
        return this.allowedCardNetworks;
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final List<BrowserCard> getBrowserCards() {
        return this.browserCards;
    }

    public final CardValidationConfig getCardValidationConfig() {
        return this.cardValidationConfig;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getDisallowHidingOnTouchOutsideDuringPay() {
        return this.disallowHidingOnTouchOutsideDuringPay;
    }

    public final boolean getEnableCashPayments() {
        return this.enableCashPayments;
    }

    public final Boolean getEnableDebranding() {
        return this.enableDebranding;
    }

    public final boolean getExchangeOauthToken() {
        return this.exchangeOauthToken;
    }

    public final boolean getForceCVV() {
        return this.forceCVV;
    }

    public final boolean getForceCloseFeatureOn() {
        return this.forceCloseFeatureOn;
    }

    public final GooglePayData getGooglePayData() {
        return this.googlePayData;
    }

    public final String getIntegrationProfileId() {
        return this.integrationProfileId;
    }

    public final Map<String, String> getLegalUrlsMap() {
        return this.legalUrlsMap;
    }

    public final String getPartition() {
        return this.partition;
    }

    public final String getPassportToken() {
        return this.passportToken;
    }

    public final PaymentMethodsFilter getPaymentMethodsFilter() {
        return this.paymentMethodsFilter;
    }

    public final String getPaymentTo() {
        return this.paymentTo;
    }

    public final PersonalInfoConfig getPersonalInfoConfig() {
        return this.personalInfoConfig;
    }

    public final String getPos() {
        return this.pos;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public final ResultScreenClosing getResultScreenClosing() {
        return this.resultScreenClosing;
    }

    public final boolean getShowCharityLabel() {
        return this.showCharityLabel;
    }

    public final boolean getShowSBPTokens() {
        return this.showSBPTokens;
    }

    public final XTheme getTheme() {
        return this.theme;
    }

    public final boolean getUseNewCardInputForm() {
        return this.useNewCardInputForm;
    }

    public final boolean getUseVerificationStatusPolling() {
        return this.useVerificationStatusPolling;
    }

    public final WidthOnLargeScreen getWidthOnLargeScreen() {
        return this.widthOnLargeScreen;
    }

    /* renamed from: isTelemetryEnabled, reason: from getter */
    public final boolean getIsTelemetryEnabled() {
        return this.isTelemetryEnabled;
    }

    public final void setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setPos(String str) {
        this.pos = str;
    }

    public final void setShowSBPTokens(boolean z) {
        this.showSBPTokens = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.cardValidationConfig, flags);
        dest.writeParcelable(this.paymentMethodsFilter, flags);
        Iterator t = vfc.t(dest, this.browserCards);
        while (t.hasNext()) {
            dest.writeParcelable((Parcelable) t.next(), flags);
        }
        dest.writeParcelable(this.appInfo, flags);
        this.resultScreenClosing.writeToParcel(dest, flags);
        dest.writeInt(this.forceCVV ? 1 : 0);
        this.personalInfoConfig.writeToParcel(dest, flags);
        dest.writeString(this.passportToken);
        dest.writeString(this.partition);
        dest.writeInt(this.enableCashPayments ? 1 : 0);
        dest.writeInt(this.exchangeOauthToken ? 1 : 0);
        dest.writeInt(this.disallowHidingOnTouchOutsideDuringPay ? 1 : 0);
        dest.writeParcelable(this.googlePayData, flags);
        dest.writeString(this.currency);
        dest.writeString(this.pos);
        dest.writeInt(this.regionId);
        dest.writeInt(this.showCharityLabel ? 1 : 0);
        dest.writeInt(this.useNewCardInputForm ? 1 : 0);
        dest.writeInt(this.showSBPTokens ? 1 : 0);
        dest.writeParcelable(this.allowedCardNetworks, flags);
        dest.writeInt(this.forceCloseFeatureOn ? 1 : 0);
        WidthOnLargeScreen widthOnLargeScreen = this.widthOnLargeScreen;
        if (widthOnLargeScreen == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(widthOnLargeScreen.name());
        }
        dest.writeInt(this.useVerificationStatusPolling ? 1 : 0);
        dest.writeInt(this.isTelemetryEnabled ? 1 : 0);
        Boolean bool = this.enableDebranding;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeString(this.paymentTo);
        Map<String, String> map = this.legalUrlsMap;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator s = x4e.s(dest, 1, map);
            while (s.hasNext()) {
                Map.Entry entry = (Map.Entry) s.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        dest.writeString(this.integrationProfileId);
        dest.writeString(this.theme.name());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdditionalSettings createFromParcel(Parcel parcel) {
            Boolean valueOf;
            CardValidationConfig cardValidationConfig = (CardValidationConfig) parcel.readParcelable(AdditionalSettings.class.getClassLoader());
            PaymentMethodsFilter paymentMethodsFilter = (PaymentMethodsFilter) parcel.readParcelable(AdditionalSettings.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = vfc.e(AdditionalSettings.class, parcel, arrayList, i, 1);
            }
            AppInfo appInfo = (AppInfo) parcel.readParcelable(AdditionalSettings.class.getClassLoader());
            ResultScreenClosing createFromParcel = ResultScreenClosing.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            PersonalInfoConfig createFromParcel2 = PersonalInfoConfig.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            GooglePayData googlePayData = (GooglePayData) parcel.readParcelable(AdditionalSettings.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt2 = parcel.readInt();
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            GooglePayAllowedCardNetworks googlePayAllowedCardNetworks = (GooglePayAllowedCardNetworks) parcel.readParcelable(AdditionalSettings.class.getClassLoader());
            boolean z8 = parcel.readInt() != 0;
            LinkedHashMap linkedHashMap = null;
            WidthOnLargeScreen valueOf2 = parcel.readInt() == 0 ? null : WidthOnLargeScreen.valueOf(parcel.readString());
            boolean z9 = parcel.readInt() != 0;
            boolean z10 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = xvz.b(parcel, linkedHashMap, parcel.readString(), i2, 1);
                    readInt3 = readInt3;
                    createFromParcel = createFromParcel;
                }
            }
            return new AdditionalSettings(cardValidationConfig, paymentMethodsFilter, arrayList, appInfo, createFromParcel, z, createFromParcel2, readString, readString2, z2, z3, z4, googlePayData, readString3, readString4, readInt2, z5, z6, z7, googlePayAllowedCardNetworks, z8, valueOf2, z9, z10, valueOf, readString5, linkedHashMap, parcel.readString(), XTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdditionalSettings[] newArray(int i) {
            return new AdditionalSettings[i];
        }
    }
}
