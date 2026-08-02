package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u0012\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001e\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010\"J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\u000bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017HÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010R\u001a\u00020\u001eHÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jþ\u0001\u0010U\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00172\u0010\b\u0003\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0003\u0010\u001d\u001a\u00020\u001e2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020\u001e2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020ZHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010=R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010?\u001a\u0004\b\u001f\u0010>R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010$¨\u0006\\"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositPageResponse;", "", "title", "", "paymentMethodsDeeplink", "paymentMethodsSheetTitle", "defaultPaymentMethod", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "paymentMethodList", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditPaymentMethodListDto;", "defaultAmountValue", "Lcom/ybsdk/core/common/data/network/dto/Money;", "amountComment", "pageInfoBottomSheet", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;", "pageInfoButton", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoButtonDto;", "tooltip", "tooltipAmount", "tooltipPosition", "tooltipActionText", "tooltipAction", "tooltipActionImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "suggests", "", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/SuggestDto;", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "isPaymentAllowed", "", "isNumPadVisible", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditPaymentMethodListDto;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoButtonDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;ZLjava/lang/Boolean;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPaymentMethodsDeeplink", "getPaymentMethodsSheetTitle", "getDefaultPaymentMethod", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "getPaymentMethodList", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditPaymentMethodListDto;", "getDefaultAmountValue", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getAmountComment", "getPageInfoBottomSheet", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;", "getPageInfoButton", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoButtonDto;", "getTooltip", "getTooltipAmount", "getTooltipPosition", "getTooltipActionText", "getTooltipAction", "getTooltipActionImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getSuggests", "()Ljava/util/List;", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditPaymentMethodListDto;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoButtonDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;ZLjava/lang/Boolean;Ljava/lang/String;)Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositPageResponse;", "equals", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditDepositPageResponse {
    private final String amountComment;
    private final String buttonText;
    private final Money defaultAmountValue;
    private final PaymentMethodSheetItemDto defaultPaymentMethod;
    private final DivDataDto divkitData;
    private final Boolean isNumPadVisible;
    private final boolean isPaymentAllowed;
    private final PageInfoBottomSheetDto pageInfoBottomSheet;
    private final PageInfoButtonDto pageInfoButton;
    private final CreditPaymentMethodListDto paymentMethodList;
    private final String paymentMethodsDeeplink;
    private final String paymentMethodsSheetTitle;
    private final List<SuggestDto> suggests;
    private final String title;
    private final String tooltip;
    private final String tooltipAction;
    private final Themes<String> tooltipActionImage;
    private final String tooltipActionText;
    private final String tooltipAmount;
    private final String tooltipPosition;

    public /* synthetic */ CreditDepositPageResponse(String str, String str2, String str3, PaymentMethodSheetItemDto paymentMethodSheetItemDto, CreditPaymentMethodListDto creditPaymentMethodListDto, Money money, String str4, PageInfoBottomSheetDto pageInfoBottomSheetDto, PageInfoButtonDto pageInfoButtonDto, String str5, String str6, String str7, String str8, String str9, Themes themes, List list, DivDataDto divDataDto, boolean z, Boolean bool, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, paymentMethodSheetItemDto, creditPaymentMethodListDto, money, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : pageInfoBottomSheetDto, (i & 256) != 0 ? null : pageInfoButtonDto, str5, str6, str7, str8, str9, themes, list, divDataDto, z, bool, str10);
    }

    public static /* synthetic */ CreditDepositPageResponse copy$default(CreditDepositPageResponse creditDepositPageResponse, String str, String str2, String str3, PaymentMethodSheetItemDto paymentMethodSheetItemDto, CreditPaymentMethodListDto creditPaymentMethodListDto, Money money, String str4, PageInfoBottomSheetDto pageInfoBottomSheetDto, PageInfoButtonDto pageInfoButtonDto, String str5, String str6, String str7, String str8, String str9, Themes themes, List list, DivDataDto divDataDto, boolean z, Boolean bool, String str10, int i, Object obj) {
        String str11;
        Boolean bool2;
        String str12 = (i & 1) != 0 ? creditDepositPageResponse.title : str;
        String str13 = (i & 2) != 0 ? creditDepositPageResponse.paymentMethodsDeeplink : str2;
        String str14 = (i & 4) != 0 ? creditDepositPageResponse.paymentMethodsSheetTitle : str3;
        PaymentMethodSheetItemDto paymentMethodSheetItemDto2 = (i & 8) != 0 ? creditDepositPageResponse.defaultPaymentMethod : paymentMethodSheetItemDto;
        CreditPaymentMethodListDto creditPaymentMethodListDto2 = (i & 16) != 0 ? creditDepositPageResponse.paymentMethodList : creditPaymentMethodListDto;
        Money money2 = (i & 32) != 0 ? creditDepositPageResponse.defaultAmountValue : money;
        String str15 = (i & 64) != 0 ? creditDepositPageResponse.amountComment : str4;
        PageInfoBottomSheetDto pageInfoBottomSheetDto2 = (i & 128) != 0 ? creditDepositPageResponse.pageInfoBottomSheet : pageInfoBottomSheetDto;
        PageInfoButtonDto pageInfoButtonDto2 = (i & 256) != 0 ? creditDepositPageResponse.pageInfoButton : pageInfoButtonDto;
        String str16 = (i & 512) != 0 ? creditDepositPageResponse.tooltip : str5;
        String str17 = (i & 1024) != 0 ? creditDepositPageResponse.tooltipAmount : str6;
        String str18 = (i & 2048) != 0 ? creditDepositPageResponse.tooltipPosition : str7;
        String str19 = (i & 4096) != 0 ? creditDepositPageResponse.tooltipActionText : str8;
        String str20 = (i & 8192) != 0 ? creditDepositPageResponse.tooltipAction : str9;
        String str21 = str12;
        Themes themes2 = (i & 16384) != 0 ? creditDepositPageResponse.tooltipActionImage : themes;
        List list2 = (i & 32768) != 0 ? creditDepositPageResponse.suggests : list;
        DivDataDto divDataDto2 = (i & 65536) != 0 ? creditDepositPageResponse.divkitData : divDataDto;
        boolean z2 = (i & 131072) != 0 ? creditDepositPageResponse.isPaymentAllowed : z;
        Boolean bool3 = (i & 262144) != 0 ? creditDepositPageResponse.isNumPadVisible : bool;
        if ((i & 524288) != 0) {
            bool2 = bool3;
            str11 = creditDepositPageResponse.buttonText;
        } else {
            str11 = str10;
            bool2 = bool3;
        }
        return creditDepositPageResponse.copy(str21, str13, str14, paymentMethodSheetItemDto2, creditPaymentMethodListDto2, money2, str15, pageInfoBottomSheetDto2, pageInfoButtonDto2, str16, str17, str18, str19, str20, themes2, list2, divDataDto2, z2, bool2, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTooltipAmount() {
        return this.tooltipAmount;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTooltipPosition() {
        return this.tooltipPosition;
    }

    /* renamed from: component13, reason: from getter */
    public final String getTooltipActionText() {
        return this.tooltipActionText;
    }

    /* renamed from: component14, reason: from getter */
    public final String getTooltipAction() {
        return this.tooltipAction;
    }

    public final Themes<String> component15() {
        return this.tooltipActionImage;
    }

    public final List<SuggestDto> component16() {
        return this.suggests;
    }

    /* renamed from: component17, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    /* renamed from: component19, reason: from getter */
    public final Boolean getIsNumPadVisible() {
        return this.isNumPadVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodsDeeplink() {
        return this.paymentMethodsDeeplink;
    }

    /* renamed from: component20, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentMethodsSheetTitle() {
        return this.paymentMethodsSheetTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentMethodSheetItemDto getDefaultPaymentMethod() {
        return this.defaultPaymentMethod;
    }

    /* renamed from: component5, reason: from getter */
    public final CreditPaymentMethodListDto getPaymentMethodList() {
        return this.paymentMethodList;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getDefaultAmountValue() {
        return this.defaultAmountValue;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAmountComment() {
        return this.amountComment;
    }

    /* renamed from: component8, reason: from getter */
    public final PageInfoBottomSheetDto getPageInfoBottomSheet() {
        return this.pageInfoBottomSheet;
    }

    /* renamed from: component9, reason: from getter */
    public final PageInfoButtonDto getPageInfoButton() {
        return this.pageInfoButton;
    }

    public final CreditDepositPageResponse copy(@Json(name = "title") String title, @Json(name = "payment_methods_deeplink") String paymentMethodsDeeplink, @Json(name = "payment_methods_sheet_title") String paymentMethodsSheetTitle, @Json(name = "default_payment_method") PaymentMethodSheetItemDto defaultPaymentMethod, @Json(name = "payment_method_list") CreditPaymentMethodListDto paymentMethodList, @Json(name = "default_amount_value") Money defaultAmountValue, @Json(name = "amount_comment") String amountComment, @Json(name = "page_info_bottom_sheet") PageInfoBottomSheetDto pageInfoBottomSheet, @Json(name = "page_info_button") PageInfoButtonDto pageInfoButton, @Json(name = "tooltip") String tooltip, @Json(name = "tooltip_amount") String tooltipAmount, @Json(name = "tooltip_position") String tooltipPosition, @Json(name = "tooltip_action_text") String tooltipActionText, @Json(name = "tooltip_action") String tooltipAction, @Json(name = "tooltip_action_image") Themes<String> tooltipActionImage, @Json(name = "suggests") List<SuggestDto> suggests, @Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "is_payment_allowed") boolean isPaymentAllowed, @Json(name = "is_num_pad_visible") Boolean isNumPadVisible, @Json(name = "button_text") String buttonText) {
        return new CreditDepositPageResponse(title, paymentMethodsDeeplink, paymentMethodsSheetTitle, defaultPaymentMethod, paymentMethodList, defaultAmountValue, amountComment, pageInfoBottomSheet, pageInfoButton, tooltip, tooltipAmount, tooltipPosition, tooltipActionText, tooltipAction, tooltipActionImage, suggests, divkitData, isPaymentAllowed, isNumPadVisible, buttonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditDepositPageResponse)) {
            return false;
        }
        CreditDepositPageResponse creditDepositPageResponse = (CreditDepositPageResponse) other;
        return jl40.l(this.title, creditDepositPageResponse.title) && jl40.l(this.paymentMethodsDeeplink, creditDepositPageResponse.paymentMethodsDeeplink) && jl40.l(this.paymentMethodsSheetTitle, creditDepositPageResponse.paymentMethodsSheetTitle) && jl40.l(this.defaultPaymentMethod, creditDepositPageResponse.defaultPaymentMethod) && jl40.l(this.paymentMethodList, creditDepositPageResponse.paymentMethodList) && jl40.l(this.defaultAmountValue, creditDepositPageResponse.defaultAmountValue) && jl40.l(this.amountComment, creditDepositPageResponse.amountComment) && jl40.l(this.pageInfoBottomSheet, creditDepositPageResponse.pageInfoBottomSheet) && jl40.l(this.pageInfoButton, creditDepositPageResponse.pageInfoButton) && jl40.l(this.tooltip, creditDepositPageResponse.tooltip) && jl40.l(this.tooltipAmount, creditDepositPageResponse.tooltipAmount) && jl40.l(this.tooltipPosition, creditDepositPageResponse.tooltipPosition) && jl40.l(this.tooltipActionText, creditDepositPageResponse.tooltipActionText) && jl40.l(this.tooltipAction, creditDepositPageResponse.tooltipAction) && jl40.l(this.tooltipActionImage, creditDepositPageResponse.tooltipActionImage) && jl40.l(this.suggests, creditDepositPageResponse.suggests) && jl40.l(this.divkitData, creditDepositPageResponse.divkitData) && this.isPaymentAllowed == creditDepositPageResponse.isPaymentAllowed && jl40.l(this.isNumPadVisible, creditDepositPageResponse.isNumPadVisible) && jl40.l(this.buttonText, creditDepositPageResponse.buttonText);
    }

    public final String getAmountComment() {
        return this.amountComment;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Money getDefaultAmountValue() {
        return this.defaultAmountValue;
    }

    public final PaymentMethodSheetItemDto getDefaultPaymentMethod() {
        return this.defaultPaymentMethod;
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final PageInfoBottomSheetDto getPageInfoBottomSheet() {
        return this.pageInfoBottomSheet;
    }

    public final PageInfoButtonDto getPageInfoButton() {
        return this.pageInfoButton;
    }

    public final CreditPaymentMethodListDto getPaymentMethodList() {
        return this.paymentMethodList;
    }

    public final String getPaymentMethodsDeeplink() {
        return this.paymentMethodsDeeplink;
    }

    public final String getPaymentMethodsSheetTitle() {
        return this.paymentMethodsSheetTitle;
    }

    public final List<SuggestDto> getSuggests() {
        return this.suggests;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTooltip() {
        return this.tooltip;
    }

    public final String getTooltipAction() {
        return this.tooltipAction;
    }

    public final Themes<String> getTooltipActionImage() {
        return this.tooltipActionImage;
    }

    public final String getTooltipActionText() {
        return this.tooltipActionText;
    }

    public final String getTooltipAmount() {
        return this.tooltipAmount;
    }

    public final String getTooltipPosition() {
        return this.tooltipPosition;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.paymentMethodsDeeplink;
        int c = tse0.c(this.defaultAmountValue, (this.paymentMethodList.hashCode() + ((this.defaultPaymentMethod.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.paymentMethodsSheetTitle)) * 31)) * 31, 31);
        String str2 = this.amountComment;
        int hashCode2 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        PageInfoBottomSheetDto pageInfoBottomSheetDto = this.pageInfoBottomSheet;
        int hashCode3 = (hashCode2 + (pageInfoBottomSheetDto == null ? 0 : pageInfoBottomSheetDto.hashCode())) * 31;
        PageInfoButtonDto pageInfoButtonDto = this.pageInfoButton;
        int hashCode4 = (hashCode3 + (pageInfoButtonDto == null ? 0 : pageInfoButtonDto.hashCode())) * 31;
        String str3 = this.tooltip;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tooltipAmount;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tooltipPosition;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tooltipActionText;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tooltipAction;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Themes<String> themes = this.tooltipActionImage;
        int hashCode10 = (hashCode9 + (themes == null ? 0 : themes.hashCode())) * 31;
        List<SuggestDto> list = this.suggests;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitData;
        int e = unr0.e((hashCode11 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31, 31, this.isPaymentAllowed);
        Boolean bool = this.isNumPadVisible;
        int hashCode12 = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.buttonText;
        return hashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    public final Boolean isNumPadVisible() {
        return this.isNumPadVisible;
    }

    public final boolean isPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.paymentMethodsDeeplink;
        String str3 = this.paymentMethodsSheetTitle;
        PaymentMethodSheetItemDto paymentMethodSheetItemDto = this.defaultPaymentMethod;
        CreditPaymentMethodListDto creditPaymentMethodListDto = this.paymentMethodList;
        Money money = this.defaultAmountValue;
        String str4 = this.amountComment;
        PageInfoBottomSheetDto pageInfoBottomSheetDto = this.pageInfoBottomSheet;
        PageInfoButtonDto pageInfoButtonDto = this.pageInfoButton;
        String str5 = this.tooltip;
        String str6 = this.tooltipAmount;
        String str7 = this.tooltipPosition;
        String str8 = this.tooltipActionText;
        String str9 = this.tooltipAction;
        Themes<String> themes = this.tooltipActionImage;
        List<SuggestDto> list = this.suggests;
        DivDataDto divDataDto = this.divkitData;
        boolean z = this.isPaymentAllowed;
        Boolean bool = this.isNumPadVisible;
        String str10 = this.buttonText;
        StringBuilder v = b64.v("CreditDepositPageResponse(title=", str, ", paymentMethodsDeeplink=", str2, ", paymentMethodsSheetTitle=");
        v.append(str3);
        v.append(", defaultPaymentMethod=");
        v.append(paymentMethodSheetItemDto);
        v.append(", paymentMethodList=");
        v.append(creditPaymentMethodListDto);
        v.append(", defaultAmountValue=");
        v.append(money);
        v.append(", amountComment=");
        v.append(str4);
        v.append(", pageInfoBottomSheet=");
        v.append(pageInfoBottomSheetDto);
        v.append(", pageInfoButton=");
        v.append(pageInfoButtonDto);
        v.append(", tooltip=");
        v.append(str5);
        v.append(", tooltipAmount=");
        g8e.D(v, str6, ", tooltipPosition=", str7, ", tooltipActionText=");
        g8e.D(v, str8, ", tooltipAction=", str9, ", tooltipActionImage=");
        v.append(themes);
        v.append(", suggests=");
        v.append(list);
        v.append(", divkitData=");
        v.append(divDataDto);
        v.append(", isPaymentAllowed=");
        v.append(z);
        v.append(", isNumPadVisible=");
        v.append(bool);
        v.append(", buttonText=");
        v.append(str10);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CreditDepositPageResponse(@Json(name = "title") String str, @Json(name = "payment_methods_deeplink") String str2, @Json(name = "payment_methods_sheet_title") String str3, @Json(name = "default_payment_method") PaymentMethodSheetItemDto paymentMethodSheetItemDto, @Json(name = "payment_method_list") CreditPaymentMethodListDto creditPaymentMethodListDto, @Json(name = "default_amount_value") Money money, @Json(name = "amount_comment") String str4, @Json(name = "page_info_bottom_sheet") PageInfoBottomSheetDto pageInfoBottomSheetDto, @Json(name = "page_info_button") PageInfoButtonDto pageInfoButtonDto, @Json(name = "tooltip") String str5, @Json(name = "tooltip_amount") String str6, @Json(name = "tooltip_position") String str7, @Json(name = "tooltip_action_text") String str8, @Json(name = "tooltip_action") String str9, @Json(name = "tooltip_action_image") Themes<String> themes, @Json(name = "suggests") List<SuggestDto> list, @Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "is_payment_allowed") boolean z, @Json(name = "is_num_pad_visible") Boolean bool, @Json(name = "button_text") String str10) {
        this.title = str;
        this.paymentMethodsDeeplink = str2;
        this.paymentMethodsSheetTitle = str3;
        this.defaultPaymentMethod = paymentMethodSheetItemDto;
        this.paymentMethodList = creditPaymentMethodListDto;
        this.defaultAmountValue = money;
        this.amountComment = str4;
        this.pageInfoBottomSheet = pageInfoBottomSheetDto;
        this.pageInfoButton = pageInfoButtonDto;
        this.tooltip = str5;
        this.tooltipAmount = str6;
        this.tooltipPosition = str7;
        this.tooltipActionText = str8;
        this.tooltipAction = str9;
        this.tooltipActionImage = themes;
        this.suggests = list;
        this.divkitData = divDataDto;
        this.isPaymentAllowed = z;
        this.isNumPadVisible = bool;
        this.buttonText = str10;
    }
}
