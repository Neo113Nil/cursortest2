package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositPageResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositPageResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "paymentMethodSheetItemDtoAdapter", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditPaymentMethodListDto;", "creditPaymentMethodListDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;", "nullablePageInfoBottomSheetDtoAdapter", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoButtonDto;", "nullablePageInfoButtonDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/SuggestDto;", "nullableListOfSuggestDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "", "booleanAdapter", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditDepositPageResponseJsonAdapter extends JsonAdapter<CreditDepositPageResponse> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CreditDepositPageResponse> constructorRef;
    private final JsonAdapter<CreditPaymentMethodListDto> creditPaymentMethodListDtoAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<List<SuggestDto>> nullableListOfSuggestDtoAdapter;
    private final JsonAdapter<PageInfoBottomSheetDto> nullablePageInfoBottomSheetDtoAdapter;
    private final JsonAdapter<PageInfoButtonDto> nullablePageInfoButtonDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "payment_methods_deeplink", "payment_methods_sheet_title", "default_payment_method", "payment_method_list", "default_amount_value", "amount_comment", "page_info_bottom_sheet", "page_info_button", "tooltip", "tooltip_amount", "tooltip_position", "tooltip_action_text", "tooltip_action", "tooltip_action_image", "suggests", "divkit_data", "is_payment_allowed", "is_num_pad_visible", "button_text");
    private final JsonAdapter<PaymentMethodSheetItemDto> paymentMethodSheetItemDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public CreditDepositPageResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentMethodsDeeplink");
        this.paymentMethodSheetItemDtoAdapter = moshi.adapter(PaymentMethodSheetItemDto.class, emptySet, "defaultPaymentMethod");
        this.creditPaymentMethodListDtoAdapter = moshi.adapter(CreditPaymentMethodListDto.class, emptySet, "paymentMethodList");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "defaultAmountValue");
        this.nullablePageInfoBottomSheetDtoAdapter = moshi.adapter(PageInfoBottomSheetDto.class, emptySet, "pageInfoBottomSheet");
        this.nullablePageInfoButtonDtoAdapter = moshi.adapter(PageInfoButtonDto.class, emptySet, "pageInfoButton");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "tooltipActionImage");
        this.nullableListOfSuggestDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SuggestDto.class), emptySet, "suggests");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitData");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isPaymentAllowed");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isNumPadVisible");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditDepositPageResponse fromJson(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        Boolean bool = null;
        int i = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        PaymentMethodSheetItemDto paymentMethodSheetItemDto = null;
        CreditPaymentMethodListDto creditPaymentMethodListDto = null;
        Money money = null;
        String str5 = null;
        PageInfoBottomSheetDto pageInfoBottomSheetDto = null;
        PageInfoButtonDto pageInfoButtonDto = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Themes<String> themes = null;
        List<SuggestDto> list = null;
        DivDataDto divDataDto = null;
        Boolean bool2 = null;
        String str11 = null;
        while (true) {
            Boolean bool3 = bool;
            String str12 = str2;
            String str13 = str3;
            String str14 = str4;
            PaymentMethodSheetItemDto paymentMethodSheetItemDto2 = paymentMethodSheetItemDto;
            CreditPaymentMethodListDto creditPaymentMethodListDto2 = creditPaymentMethodListDto;
            Money money2 = money;
            String str15 = str5;
            PageInfoBottomSheetDto pageInfoBottomSheetDto2 = pageInfoBottomSheetDto;
            PageInfoButtonDto pageInfoButtonDto2 = pageInfoButtonDto;
            if (!jsonReader.hasNext()) {
                String str16 = str6;
                jsonReader.endObject();
                if (i == -449) {
                    if (str12 == null) {
                        throw Util.missingProperty("title", "title", jsonReader);
                    }
                    if (str14 == null) {
                        throw Util.missingProperty("paymentMethodsSheetTitle", "payment_methods_sheet_title", jsonReader);
                    }
                    if (paymentMethodSheetItemDto2 == null) {
                        throw Util.missingProperty("defaultPaymentMethod", "default_payment_method", jsonReader);
                    }
                    if (creditPaymentMethodListDto2 == null) {
                        throw Util.missingProperty("paymentMethodList", "payment_method_list", jsonReader);
                    }
                    if (money2 == null) {
                        throw Util.missingProperty("defaultAmountValue", "default_amount_value", jsonReader);
                    }
                    if (bool3 == null) {
                        throw Util.missingProperty("isPaymentAllowed", "is_payment_allowed", jsonReader);
                    }
                    return new CreditDepositPageResponse(str12, str13, str14, paymentMethodSheetItemDto2, creditPaymentMethodListDto2, money2, str15, pageInfoBottomSheetDto2, pageInfoButtonDto2, str16, str7, str8, str9, str10, themes, list, divDataDto, bool3.booleanValue(), bool2, str11);
                }
                Boolean bool4 = bool2;
                DivDataDto divDataDto2 = divDataDto;
                String str17 = str11;
                int i2 = i;
                Constructor<CreditDepositPageResponse> constructor = this.constructorRef;
                if (constructor == null) {
                    str = str12;
                    constructor = CreditDepositPageResponse.class.getDeclaredConstructor(String.class, String.class, String.class, PaymentMethodSheetItemDto.class, CreditPaymentMethodListDto.class, Money.class, String.class, PageInfoBottomSheetDto.class, PageInfoButtonDto.class, String.class, String.class, String.class, String.class, String.class, Themes.class, List.class, DivDataDto.class, Boolean.TYPE, Boolean.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    str = str12;
                }
                if (str == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str14 == null) {
                    throw Util.missingProperty("paymentMethodsSheetTitle", "payment_methods_sheet_title", jsonReader);
                }
                if (paymentMethodSheetItemDto2 == null) {
                    throw Util.missingProperty("defaultPaymentMethod", "default_payment_method", jsonReader);
                }
                if (creditPaymentMethodListDto2 == null) {
                    throw Util.missingProperty("paymentMethodList", "payment_method_list", jsonReader);
                }
                if (money2 == null) {
                    throw Util.missingProperty("defaultAmountValue", "default_amount_value", jsonReader);
                }
                if (bool3 == null) {
                    throw Util.missingProperty("isPaymentAllowed", "is_payment_allowed", jsonReader);
                }
                return constructor.newInstance(str, str13, str14, paymentMethodSheetItemDto2, creditPaymentMethodListDto2, money2, str15, pageInfoBottomSheetDto2, pageInfoButtonDto2, str16, str7, str8, str9, str10, themes, list, divDataDto2, bool3, bool4, str17, Integer.valueOf(i2), null);
            }
            String str18 = str6;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    bool = bool3;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 1:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 2:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("paymentMethodsSheetTitle", "payment_methods_sheet_title", jsonReader);
                    }
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 3:
                    paymentMethodSheetItemDto = this.paymentMethodSheetItemDtoAdapter.fromJson(jsonReader);
                    if (paymentMethodSheetItemDto == null) {
                        throw Util.unexpectedNull("defaultPaymentMethod", "default_payment_method", jsonReader);
                    }
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 4:
                    CreditPaymentMethodListDto fromJson = this.creditPaymentMethodListDtoAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("paymentMethodList", "payment_method_list", jsonReader);
                    }
                    creditPaymentMethodListDto = fromJson;
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 5:
                    Money fromJson2 = this.moneyAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("defaultAmountValue", "default_amount_value", jsonReader);
                    }
                    money = fromJson2;
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 7:
                    pageInfoBottomSheetDto = this.nullablePageInfoBottomSheetDtoAdapter.fromJson(jsonReader);
                    i &= -129;
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 8:
                    pageInfoButtonDto = this.nullablePageInfoButtonDtoAdapter.fromJson(jsonReader);
                    i &= -257;
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    str6 = str18;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 11:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 12:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 13:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 14:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 15:
                    list = this.nullableListOfSuggestDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 16:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 17:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isPaymentAllowed", "is_payment_allowed", jsonReader);
                    }
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 18:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                case 19:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
                default:
                    bool = bool3;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    paymentMethodSheetItemDto = paymentMethodSheetItemDto2;
                    creditPaymentMethodListDto = creditPaymentMethodListDto2;
                    money = money2;
                    str5 = str15;
                    pageInfoBottomSheetDto = pageInfoBottomSheetDto2;
                    pageInfoButtonDto = pageInfoButtonDto2;
                    str6 = str18;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditDepositPageResponse creditDepositPageResponse) {
        CreditDepositPageResponse creditDepositPageResponse2 = creditDepositPageResponse;
        if (creditDepositPageResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getTitle());
        jsonWriter.name("payment_methods_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getPaymentMethodsDeeplink());
        jsonWriter.name("payment_methods_sheet_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getPaymentMethodsSheetTitle());
        jsonWriter.name("default_payment_method");
        this.paymentMethodSheetItemDtoAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getDefaultPaymentMethod());
        jsonWriter.name("payment_method_list");
        this.creditPaymentMethodListDtoAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getPaymentMethodList());
        jsonWriter.name("default_amount_value");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getDefaultAmountValue());
        jsonWriter.name("amount_comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getAmountComment());
        jsonWriter.name("page_info_bottom_sheet");
        this.nullablePageInfoBottomSheetDtoAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getPageInfoBottomSheet());
        jsonWriter.name("page_info_button");
        this.nullablePageInfoButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getPageInfoButton());
        jsonWriter.name("tooltip");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getTooltip());
        jsonWriter.name("tooltip_amount");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getTooltipAmount());
        jsonWriter.name("tooltip_position");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getTooltipPosition());
        jsonWriter.name("tooltip_action_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getTooltipActionText());
        jsonWriter.name("tooltip_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getTooltipAction());
        jsonWriter.name("tooltip_action_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getTooltipActionImage());
        jsonWriter.name("suggests");
        this.nullableListOfSuggestDtoAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getSuggests());
        jsonWriter.name("divkit_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getDivkitData());
        jsonWriter.name("is_payment_allowed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(creditDepositPageResponse2.isPaymentAllowed()));
        jsonWriter.name("is_num_pad_visible");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.isNumPadVisible());
        jsonWriter.name("button_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositPageResponse2.getButtonText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(CreditDepositPageResponse)");
    }
}
