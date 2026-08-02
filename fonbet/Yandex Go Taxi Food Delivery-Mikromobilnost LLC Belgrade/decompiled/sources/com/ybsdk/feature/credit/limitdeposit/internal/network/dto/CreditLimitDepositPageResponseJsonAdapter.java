package com.ybsdk.feature.credit.limitdeposit.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PageInfoBottomSheetDto;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PaymentMethodSheetItemDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "paymentMethodSheetItemDtoAdapter", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitPaymentMethodListDto;", "creditLimitPaymentMethodListDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;", "nullablePageInfoBottomSheetDtoAdapter", "", "booleanAdapter", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitDepositPageResponseJsonAdapter extends JsonAdapter<CreditLimitDepositPageResponse> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CreditLimitDepositPageResponse> constructorRef;
    private final JsonAdapter<CreditLimitPaymentMethodListDto> creditLimitPaymentMethodListDtoAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<PageInfoBottomSheetDto> nullablePageInfoBottomSheetDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "payment_methods_sheet_title", "payment_methods_deeplink", "default_payment_method", "payment_method_list", "default_amount_value", "amount_comment", "page_info_bottom_sheet", "is_payment_allowed", "tooltip", "is_num_pad_visible", "button_text");
    private final JsonAdapter<PaymentMethodSheetItemDto> paymentMethodSheetItemDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public CreditLimitDepositPageResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentMethodsDeeplink");
        this.paymentMethodSheetItemDtoAdapter = moshi.adapter(PaymentMethodSheetItemDto.class, emptySet, "defaultPaymentMethod");
        this.creditLimitPaymentMethodListDtoAdapter = moshi.adapter(CreditLimitPaymentMethodListDto.class, emptySet, "paymentMethodList");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "defaultAmountValue");
        this.nullablePageInfoBottomSheetDtoAdapter = moshi.adapter(PageInfoBottomSheetDto.class, emptySet, "pageInfoBottomSheet");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isPaymentAllowed");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isNumPadVisible");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitDepositPageResponse fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        PaymentMethodSheetItemDto paymentMethodSheetItemDto = null;
        CreditLimitPaymentMethodListDto creditLimitPaymentMethodListDto = null;
        Money money = null;
        String str4 = null;
        PageInfoBottomSheetDto pageInfoBottomSheetDto = null;
        Boolean bool = null;
        String str5 = null;
        Boolean bool2 = null;
        String str6 = null;
        while (true) {
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            PaymentMethodSheetItemDto paymentMethodSheetItemDto2 = paymentMethodSheetItemDto;
            CreditLimitPaymentMethodListDto creditLimitPaymentMethodListDto2 = creditLimitPaymentMethodListDto;
            Money money2 = money;
            String str10 = str4;
            PageInfoBottomSheetDto pageInfoBottomSheetDto2 = pageInfoBottomSheetDto;
            Boolean bool3 = bool;
            if (!jsonReader.hasNext()) {
                String str11 = str5;
                jsonReader.endObject();
                if (i2 == -709) {
                    if (str7 == null) {
                        throw Util.missingProperty("title", "title", jsonReader);
                    }
                    if (str8 == null) {
                        throw Util.missingProperty("paymentMethodsSheetTitle", "payment_methods_sheet_title", jsonReader);
                    }
                    if (paymentMethodSheetItemDto2 == null) {
                        throw Util.missingProperty("defaultPaymentMethod", "default_payment_method", jsonReader);
                    }
                    if (creditLimitPaymentMethodListDto2 == null) {
                        throw Util.missingProperty("paymentMethodList", "payment_method_list", jsonReader);
                    }
                    if (money2 == null) {
                        throw Util.missingProperty("defaultAmountValue", "default_amount_value", jsonReader);
                    }
                    if (bool3 != null) {
                        return new CreditLimitDepositPageResponse(str7, str8, str9, paymentMethodSheetItemDto2, creditLimitPaymentMethodListDto2, money2, str10, pageInfoBottomSheetDto2, bool3.booleanValue(), str11, bool2, str6);
                    }
                    throw Util.missingProperty("isPaymentAllowed", "is_payment_allowed", jsonReader);
                }
                Constructor<CreditLimitDepositPageResponse> constructor = this.constructorRef;
                if (constructor == null) {
                    i = i2;
                    constructor = CreditLimitDepositPageResponse.class.getDeclaredConstructor(String.class, String.class, String.class, PaymentMethodSheetItemDto.class, CreditLimitPaymentMethodListDto.class, Money.class, String.class, PageInfoBottomSheetDto.class, Boolean.TYPE, String.class, Boolean.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<CreditLimitDepositPageResponse> constructor2 = constructor;
                if (str7 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("paymentMethodsSheetTitle", "payment_methods_sheet_title", jsonReader);
                }
                if (paymentMethodSheetItemDto2 == null) {
                    throw Util.missingProperty("defaultPaymentMethod", "default_payment_method", jsonReader);
                }
                if (creditLimitPaymentMethodListDto2 == null) {
                    throw Util.missingProperty("paymentMethodList", "payment_method_list", jsonReader);
                }
                if (money2 == null) {
                    throw Util.missingProperty("defaultAmountValue", "default_amount_value", jsonReader);
                }
                if (bool3 == null) {
                    throw Util.missingProperty("isPaymentAllowed", "is_payment_allowed", jsonReader);
                }
                return constructor2.newInstance(str7, str8, str9, paymentMethodSheetItemDto2, creditLimitPaymentMethodListDto2, money2, str10, pageInfoBottomSheetDto2, bool3, str11, bool2, str6, Integer.valueOf(i), null);
            }
            String str12 = str5;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str5 = str12;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("paymentMethodsSheetTitle", "payment_methods_sheet_title", jsonReader);
                    }
                    str5 = str12;
                    str = str7;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 3:
                    paymentMethodSheetItemDto = this.paymentMethodSheetItemDtoAdapter.fromJson(jsonReader);
                    if (paymentMethodSheetItemDto == null) {
                        throw Util.unexpectedNull("defaultPaymentMethod", "default_payment_method", jsonReader);
                    }
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 4:
                    creditLimitPaymentMethodListDto = this.creditLimitPaymentMethodListDtoAdapter.fromJson(jsonReader);
                    if (creditLimitPaymentMethodListDto == null) {
                        throw Util.unexpectedNull("paymentMethodList", "payment_method_list", jsonReader);
                    }
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 5:
                    Money fromJson = this.moneyAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("defaultAmountValue", "default_amount_value", jsonReader);
                    }
                    money = fromJson;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 7:
                    pageInfoBottomSheetDto = this.nullablePageInfoBottomSheetDtoAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    bool = bool3;
                case 8:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isPaymentAllowed", "is_payment_allowed", jsonReader);
                    }
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 10:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                case 11:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
                default:
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditLimitPaymentMethodListDto = creditLimitPaymentMethodListDto2;
                    money = money2;
                    str4 = str10;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    bool = bool3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitDepositPageResponse creditLimitDepositPageResponse) {
        CreditLimitDepositPageResponse creditLimitDepositPageResponse2 = creditLimitDepositPageResponse;
        if (creditLimitDepositPageResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getTitle());
        jsonWriter.name("payment_methods_sheet_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getPaymentMethodsSheetTitle());
        jsonWriter.name("payment_methods_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getPaymentMethodsDeeplink());
        jsonWriter.name("default_payment_method");
        this.paymentMethodSheetItemDtoAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getDefaultPaymentMethod());
        jsonWriter.name("payment_method_list");
        this.creditLimitPaymentMethodListDtoAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getPaymentMethodList());
        jsonWriter.name("default_amount_value");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getDefaultAmountValue());
        jsonWriter.name("amount_comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getAmountComment());
        jsonWriter.name("page_info_bottom_sheet");
        this.nullablePageInfoBottomSheetDtoAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getPageInfoBottomSheet());
        jsonWriter.name("is_payment_allowed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(creditLimitDepositPageResponse2.isPaymentAllowed()));
        jsonWriter.name("tooltip");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getTooltip());
        jsonWriter.name("is_num_pad_visible");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.isNumPadVisible());
        jsonWriter.name("button_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageResponse2.getButtonText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(CreditLimitDepositPageResponse)");
    }
}
