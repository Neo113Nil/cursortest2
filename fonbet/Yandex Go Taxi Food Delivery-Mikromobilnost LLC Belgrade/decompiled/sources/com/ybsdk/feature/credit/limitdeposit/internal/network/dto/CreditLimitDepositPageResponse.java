package com.ybsdk.feature.credit.limitdeposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PageInfoBottomSheetDto;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PaymentMethodSheetItemDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u00104\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0012\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006;"}, d2 = {"Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageResponse;", "", "title", "", "paymentMethodsSheetTitle", "paymentMethodsDeeplink", "defaultPaymentMethod", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "paymentMethodList", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitPaymentMethodListDto;", "defaultAmountValue", "Lcom/ybsdk/core/common/data/network/dto/Money;", "amountComment", "pageInfoBottomSheet", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;", "isPaymentAllowed", "", "tooltip", "isNumPadVisible", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitPaymentMethodListDto;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPaymentMethodsSheetTitle", "getPaymentMethodsDeeplink", "getDefaultPaymentMethod", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "getPaymentMethodList", "()Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitPaymentMethodListDto;", "getDefaultAmountValue", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getAmountComment", "getPageInfoBottomSheet", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;", "()Z", "getTooltip", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitPaymentMethodListDto;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageResponse;", "equals", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitDepositPageResponse {
    private final String amountComment;
    private final String buttonText;
    private final Money defaultAmountValue;
    private final PaymentMethodSheetItemDto defaultPaymentMethod;
    private final Boolean isNumPadVisible;
    private final boolean isPaymentAllowed;
    private final PageInfoBottomSheetDto pageInfoBottomSheet;
    private final CreditLimitPaymentMethodListDto paymentMethodList;
    private final String paymentMethodsDeeplink;
    private final String paymentMethodsSheetTitle;
    private final String title;
    private final String tooltip;

    public CreditLimitDepositPageResponse(@Json(name = "title") String str, @Json(name = "payment_methods_sheet_title") String str2, @Json(name = "payment_methods_deeplink") String str3, @Json(name = "default_payment_method") PaymentMethodSheetItemDto paymentMethodSheetItemDto, @Json(name = "payment_method_list") CreditLimitPaymentMethodListDto creditLimitPaymentMethodListDto, @Json(name = "default_amount_value") Money money, @Json(name = "amount_comment") String str4, @Json(name = "page_info_bottom_sheet") PageInfoBottomSheetDto pageInfoBottomSheetDto, @Json(name = "is_payment_allowed") boolean z, @Json(name = "tooltip") String str5, @Json(name = "is_num_pad_visible") Boolean bool, @Json(name = "button_text") String str6) {
        this.title = str;
        this.paymentMethodsSheetTitle = str2;
        this.paymentMethodsDeeplink = str3;
        this.defaultPaymentMethod = paymentMethodSheetItemDto;
        this.paymentMethodList = creditLimitPaymentMethodListDto;
        this.defaultAmountValue = money;
        this.amountComment = str4;
        this.pageInfoBottomSheet = pageInfoBottomSheetDto;
        this.isPaymentAllowed = z;
        this.tooltip = str5;
        this.isNumPadVisible = bool;
        this.buttonText = str6;
    }

    public static /* synthetic */ CreditLimitDepositPageResponse copy$default(CreditLimitDepositPageResponse creditLimitDepositPageResponse, String str, String str2, String str3, PaymentMethodSheetItemDto paymentMethodSheetItemDto, CreditLimitPaymentMethodListDto creditLimitPaymentMethodListDto, Money money, String str4, PageInfoBottomSheetDto pageInfoBottomSheetDto, boolean z, String str5, Boolean bool, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitDepositPageResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = creditLimitDepositPageResponse.paymentMethodsSheetTitle;
        }
        if ((i & 4) != 0) {
            str3 = creditLimitDepositPageResponse.paymentMethodsDeeplink;
        }
        if ((i & 8) != 0) {
            paymentMethodSheetItemDto = creditLimitDepositPageResponse.defaultPaymentMethod;
        }
        if ((i & 16) != 0) {
            creditLimitPaymentMethodListDto = creditLimitDepositPageResponse.paymentMethodList;
        }
        if ((i & 32) != 0) {
            money = creditLimitDepositPageResponse.defaultAmountValue;
        }
        if ((i & 64) != 0) {
            str4 = creditLimitDepositPageResponse.amountComment;
        }
        if ((i & 128) != 0) {
            pageInfoBottomSheetDto = creditLimitDepositPageResponse.pageInfoBottomSheet;
        }
        if ((i & 256) != 0) {
            z = creditLimitDepositPageResponse.isPaymentAllowed;
        }
        if ((i & 512) != 0) {
            str5 = creditLimitDepositPageResponse.tooltip;
        }
        if ((i & 1024) != 0) {
            bool = creditLimitDepositPageResponse.isNumPadVisible;
        }
        if ((i & 2048) != 0) {
            str6 = creditLimitDepositPageResponse.buttonText;
        }
        Boolean bool2 = bool;
        String str7 = str6;
        boolean z2 = z;
        String str8 = str5;
        String str9 = str4;
        PageInfoBottomSheetDto pageInfoBottomSheetDto2 = pageInfoBottomSheetDto;
        CreditLimitPaymentMethodListDto creditLimitPaymentMethodListDto2 = creditLimitPaymentMethodListDto;
        Money money2 = money;
        return creditLimitDepositPageResponse.copy(str, str2, str3, paymentMethodSheetItemDto, creditLimitPaymentMethodListDto2, money2, str9, pageInfoBottomSheetDto2, z2, str8, bool2, str7);
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
    public final Boolean getIsNumPadVisible() {
        return this.isNumPadVisible;
    }

    /* renamed from: component12, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodsSheetTitle() {
        return this.paymentMethodsSheetTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentMethodsDeeplink() {
        return this.paymentMethodsDeeplink;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentMethodSheetItemDto getDefaultPaymentMethod() {
        return this.defaultPaymentMethod;
    }

    /* renamed from: component5, reason: from getter */
    public final CreditLimitPaymentMethodListDto getPaymentMethodList() {
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
    public final boolean getIsPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    public final CreditLimitDepositPageResponse copy(@Json(name = "title") String title, @Json(name = "payment_methods_sheet_title") String paymentMethodsSheetTitle, @Json(name = "payment_methods_deeplink") String paymentMethodsDeeplink, @Json(name = "default_payment_method") PaymentMethodSheetItemDto defaultPaymentMethod, @Json(name = "payment_method_list") CreditLimitPaymentMethodListDto paymentMethodList, @Json(name = "default_amount_value") Money defaultAmountValue, @Json(name = "amount_comment") String amountComment, @Json(name = "page_info_bottom_sheet") PageInfoBottomSheetDto pageInfoBottomSheet, @Json(name = "is_payment_allowed") boolean isPaymentAllowed, @Json(name = "tooltip") String tooltip, @Json(name = "is_num_pad_visible") Boolean isNumPadVisible, @Json(name = "button_text") String buttonText) {
        return new CreditLimitDepositPageResponse(title, paymentMethodsSheetTitle, paymentMethodsDeeplink, defaultPaymentMethod, paymentMethodList, defaultAmountValue, amountComment, pageInfoBottomSheet, isPaymentAllowed, tooltip, isNumPadVisible, buttonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitDepositPageResponse)) {
            return false;
        }
        CreditLimitDepositPageResponse creditLimitDepositPageResponse = (CreditLimitDepositPageResponse) other;
        return jl40.l(this.title, creditLimitDepositPageResponse.title) && jl40.l(this.paymentMethodsSheetTitle, creditLimitDepositPageResponse.paymentMethodsSheetTitle) && jl40.l(this.paymentMethodsDeeplink, creditLimitDepositPageResponse.paymentMethodsDeeplink) && jl40.l(this.defaultPaymentMethod, creditLimitDepositPageResponse.defaultPaymentMethod) && jl40.l(this.paymentMethodList, creditLimitDepositPageResponse.paymentMethodList) && jl40.l(this.defaultAmountValue, creditLimitDepositPageResponse.defaultAmountValue) && jl40.l(this.amountComment, creditLimitDepositPageResponse.amountComment) && jl40.l(this.pageInfoBottomSheet, creditLimitDepositPageResponse.pageInfoBottomSheet) && this.isPaymentAllowed == creditLimitDepositPageResponse.isPaymentAllowed && jl40.l(this.tooltip, creditLimitDepositPageResponse.tooltip) && jl40.l(this.isNumPadVisible, creditLimitDepositPageResponse.isNumPadVisible) && jl40.l(this.buttonText, creditLimitDepositPageResponse.buttonText);
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

    public final PageInfoBottomSheetDto getPageInfoBottomSheet() {
        return this.pageInfoBottomSheet;
    }

    public final CreditLimitPaymentMethodListDto getPaymentMethodList() {
        return this.paymentMethodList;
    }

    public final String getPaymentMethodsDeeplink() {
        return this.paymentMethodsDeeplink;
    }

    public final String getPaymentMethodsSheetTitle() {
        return this.paymentMethodsSheetTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int b = unr0.b(this.title.hashCode() * 31, 31, this.paymentMethodsSheetTitle);
        String str = this.paymentMethodsDeeplink;
        int c = tse0.c(this.defaultAmountValue, (this.paymentMethodList.hashCode() + ((this.defaultPaymentMethod.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31);
        String str2 = this.amountComment;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        PageInfoBottomSheetDto pageInfoBottomSheetDto = this.pageInfoBottomSheet;
        int e = unr0.e((hashCode + (pageInfoBottomSheetDto == null ? 0 : pageInfoBottomSheetDto.hashCode())) * 31, 31, this.isPaymentAllowed);
        String str3 = this.tooltip;
        int hashCode2 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isNumPadVisible;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.buttonText;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean isNumPadVisible() {
        return this.isNumPadVisible;
    }

    public final boolean isPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.paymentMethodsSheetTitle;
        String str3 = this.paymentMethodsDeeplink;
        PaymentMethodSheetItemDto paymentMethodSheetItemDto = this.defaultPaymentMethod;
        CreditLimitPaymentMethodListDto creditLimitPaymentMethodListDto = this.paymentMethodList;
        Money money = this.defaultAmountValue;
        String str4 = this.amountComment;
        PageInfoBottomSheetDto pageInfoBottomSheetDto = this.pageInfoBottomSheet;
        boolean z = this.isPaymentAllowed;
        String str5 = this.tooltip;
        Boolean bool = this.isNumPadVisible;
        String str6 = this.buttonText;
        StringBuilder v = b64.v("CreditLimitDepositPageResponse(title=", str, ", paymentMethodsSheetTitle=", str2, ", paymentMethodsDeeplink=");
        v.append(str3);
        v.append(", defaultPaymentMethod=");
        v.append(paymentMethodSheetItemDto);
        v.append(", paymentMethodList=");
        v.append(creditLimitPaymentMethodListDto);
        v.append(", defaultAmountValue=");
        v.append(money);
        v.append(", amountComment=");
        v.append(str4);
        v.append(", pageInfoBottomSheet=");
        v.append(pageInfoBottomSheetDto);
        v.append(", isPaymentAllowed=");
        unr0.A(", tooltip=", str5, ", isNumPadVisible=", v, z);
        v.append(bool);
        v.append(", buttonText=");
        v.append(str6);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ CreditLimitDepositPageResponse(String str, String str2, String str3, PaymentMethodSheetItemDto paymentMethodSheetItemDto, CreditLimitPaymentMethodListDto creditLimitPaymentMethodListDto, Money money, String str4, PageInfoBottomSheetDto pageInfoBottomSheetDto, boolean z, String str5, Boolean bool, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, paymentMethodSheetItemDto, creditLimitPaymentMethodListDto, money, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : pageInfoBottomSheetDto, z, (i & 512) != 0 ? null : str5, bool, str6);
    }
}
