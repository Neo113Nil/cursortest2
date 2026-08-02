package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\fR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\fR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\fR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\fR \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\fR\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\f¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountTypeDto;", "nullableAccountTypeDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "", "nullableBooleanAdapter", "nullableMoneyAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonGroupDto;", "nullableAccountActionButtonGroupDtoAdapter", "", "listOfStringAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountDetailsDataDto;", "nullableAccountDetailsDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/DocumentsWidgetDto;", "nullableDocumentsWidgetDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/CloseAccountButtonDto;", "nullableCloseAccountButtonDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/DivkitWidgetDto;", "listOfDivkitWidgetDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/InterestDataDto;", "nullableInterestDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomeWidgetDto;", "nullableSavingsIncomeWidgetDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomeDto;", "nullableFundsIncomeDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountThemeDto;", "listOfSavingsAccountThemeDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/PlusSubscriptionStatusDto;", "nullablePlusSubscriptionStatusDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountInfoResponseJsonAdapter extends JsonAdapter<SavingsAccountInfoResponse> {
    private final JsonAdapter<List<DivkitWidgetDto>> listOfDivkitWidgetDtoAdapter;
    private final JsonAdapter<List<SavingsAccountThemeDto>> listOfSavingsAccountThemeDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<AccountActionButtonGroupDto> nullableAccountActionButtonGroupDtoAdapter;
    private final JsonAdapter<AccountDetailsDataDto> nullableAccountDetailsDataDtoAdapter;
    private final JsonAdapter<AccountTypeDto> nullableAccountTypeDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<CloseAccountButtonDto> nullableCloseAccountButtonDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<DocumentsWidgetDto> nullableDocumentsWidgetDtoAdapter;
    private final JsonAdapter<FundsIncomeDto> nullableFundsIncomeDtoAdapter;
    private final JsonAdapter<InterestDataDto> nullableInterestDataDtoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<PlusSubscriptionStatusDto> nullablePlusSubscriptionStatusDtoAdapter;
    private final JsonAdapter<SavingsIncomeWidgetDto> nullableSavingsIncomeWidgetDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "div_subtitle", "account_type", "balance", "interest", "interest_hint", "interest_locked", "interest_payment_term", "target", "button_group", "layout", "details_data", "documents", "close_account", "divkit_widgets", "interest_data", "theme_id", "support_url", "income_data", "fund_income_data", "themes", "plus_subscription_status");
    private final JsonAdapter<String> stringAdapter;

    public SavingsAccountInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divSubtitle");
        this.nullableAccountTypeDtoAdapter = moshi.adapter(AccountTypeDto.class, emptySet, "accountType");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "balance");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "interestLocked");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "target");
        this.nullableAccountActionButtonGroupDtoAdapter = moshi.adapter(AccountActionButtonGroupDto.class, emptySet, "buttonGroup");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "layout");
        this.nullableAccountDetailsDataDtoAdapter = moshi.adapter(AccountDetailsDataDto.class, emptySet, "detailsDataWidget");
        this.nullableDocumentsWidgetDtoAdapter = moshi.adapter(DocumentsWidgetDto.class, emptySet, "documentsWidget");
        this.nullableCloseAccountButtonDtoAdapter = moshi.adapter(CloseAccountButtonDto.class, emptySet, "closeAccountWidget");
        this.listOfDivkitWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DivkitWidgetDto.class), emptySet, "divkitWidgets");
        this.nullableInterestDataDtoAdapter = moshi.adapter(InterestDataDto.class, emptySet, "interestDataWidget");
        this.nullableSavingsIncomeWidgetDtoAdapter = moshi.adapter(SavingsIncomeWidgetDto.class, emptySet, "incomeWidget");
        this.nullableFundsIncomeDtoAdapter = moshi.adapter(FundsIncomeDto.class, emptySet, "fundIncomeWidget");
        this.listOfSavingsAccountThemeDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SavingsAccountThemeDto.class), emptySet, "themes");
        this.nullablePlusSubscriptionStatusDtoAdapter = moshi.adapter(PlusSubscriptionStatusDto.class, emptySet, "plusSubscriptionStatus");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsAccountInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        DivDataDto divDataDto = null;
        AccountTypeDto accountTypeDto = null;
        Money money = null;
        Money money2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        Money money3 = null;
        AccountActionButtonGroupDto accountActionButtonGroupDto = null;
        List<String> list = null;
        AccountDetailsDataDto accountDetailsDataDto = null;
        DocumentsWidgetDto documentsWidgetDto = null;
        CloseAccountButtonDto closeAccountButtonDto = null;
        List<DivkitWidgetDto> list2 = null;
        InterestDataDto interestDataDto = null;
        String str5 = null;
        String str6 = null;
        SavingsIncomeWidgetDto savingsIncomeWidgetDto = null;
        FundsIncomeDto fundsIncomeDto = null;
        List<SavingsAccountThemeDto> list3 = null;
        PlusSubscriptionStatusDto plusSubscriptionStatusDto = null;
        while (true) {
            String str7 = str;
            String str8 = str2;
            DivDataDto divDataDto2 = divDataDto;
            AccountTypeDto accountTypeDto2 = accountTypeDto;
            Money money4 = money;
            Money money5 = money2;
            String str9 = str3;
            if (!jsonReader.hasNext()) {
                Boolean bool2 = bool;
                jsonReader.endObject();
                if (str7 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (money4 == null) {
                    throw Util.missingProperty("balance", "balance", jsonReader);
                }
                if (money5 == null) {
                    throw Util.missingProperty("interest", "interest", jsonReader);
                }
                if (list == null) {
                    throw Util.missingProperty("layout", "layout", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty("divkitWidgets", "divkit_widgets", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("selectedThemeId", "theme_id", jsonReader);
                }
                if (list3 != null) {
                    return new SavingsAccountInfoResponse(str7, str8, divDataDto2, accountTypeDto2, money4, money5, str9, bool2, str4, money3, accountActionButtonGroupDto, list, accountDetailsDataDto, documentsWidgetDto, closeAccountButtonDto, list2, interestDataDto, str5, str6, savingsIncomeWidgetDto, fundsIncomeDto, list3, plusSubscriptionStatusDto);
                }
                throw Util.missingProperty("themes", "themes", jsonReader);
            }
            Boolean bool3 = bool;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    bool = bool3;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 2:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 3:
                    accountTypeDto = this.nullableAccountTypeDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 4:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("balance", "balance", jsonReader);
                    }
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money2 = money5;
                    str3 = str9;
                case 5:
                    money2 = this.moneyAdapter.fromJson(jsonReader);
                    if (money2 == null) {
                        throw Util.unexpectedNull("interest", "interest", jsonReader);
                    }
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    str3 = str9;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 9:
                    money3 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 10:
                    accountActionButtonGroupDto = this.nullableAccountActionButtonGroupDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 11:
                    list = this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("layout", "layout", jsonReader);
                    }
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 12:
                    accountDetailsDataDto = this.nullableAccountDetailsDataDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 13:
                    documentsWidgetDto = this.nullableDocumentsWidgetDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 14:
                    closeAccountButtonDto = this.nullableCloseAccountButtonDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 15:
                    list2 = this.listOfDivkitWidgetDtoAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("divkitWidgets", "divkit_widgets", jsonReader);
                    }
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 16:
                    interestDataDto = this.nullableInterestDataDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 17:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("selectedThemeId", "theme_id", jsonReader);
                    }
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 18:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 19:
                    savingsIncomeWidgetDto = this.nullableSavingsIncomeWidgetDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 20:
                    fundsIncomeDto = this.nullableFundsIncomeDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 21:
                    list3 = this.listOfSavingsAccountThemeDtoAdapter.fromJson(jsonReader);
                    if (list3 == null) {
                        throw Util.unexpectedNull("themes", "themes", jsonReader);
                    }
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                case 22:
                    plusSubscriptionStatusDto = this.nullablePlusSubscriptionStatusDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
                default:
                    bool = bool3;
                    str = str7;
                    str2 = str8;
                    divDataDto = divDataDto2;
                    accountTypeDto = accountTypeDto2;
                    money = money4;
                    money2 = money5;
                    str3 = str9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsAccountInfoResponse savingsAccountInfoResponse) {
        SavingsAccountInfoResponse savingsAccountInfoResponse2 = savingsAccountInfoResponse;
        if (savingsAccountInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getSubtitle());
        jsonWriter.name("div_subtitle");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getDivSubtitle());
        jsonWriter.name("account_type");
        this.nullableAccountTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getAccountType());
        jsonWriter.name("balance");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getBalance());
        jsonWriter.name("interest");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getInterest());
        jsonWriter.name("interest_hint");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getInterestHint());
        jsonWriter.name("interest_locked");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getInterestLocked());
        jsonWriter.name("interest_payment_term");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getInterestPaymentTerm());
        jsonWriter.name("target");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getTarget());
        jsonWriter.name("button_group");
        this.nullableAccountActionButtonGroupDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getButtonGroup());
        jsonWriter.name("layout");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getLayout());
        jsonWriter.name("details_data");
        this.nullableAccountDetailsDataDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getDetailsDataWidget());
        jsonWriter.name("documents");
        this.nullableDocumentsWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getDocumentsWidget());
        jsonWriter.name("close_account");
        this.nullableCloseAccountButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getCloseAccountWidget());
        jsonWriter.name("divkit_widgets");
        this.listOfDivkitWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getDivkitWidgets());
        jsonWriter.name("interest_data");
        this.nullableInterestDataDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getInterestDataWidget());
        jsonWriter.name("theme_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getSelectedThemeId());
        jsonWriter.name("support_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getSupportUrl());
        jsonWriter.name("income_data");
        this.nullableSavingsIncomeWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getIncomeWidget());
        jsonWriter.name("fund_income_data");
        this.nullableFundsIncomeDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getFundIncomeWidget());
        jsonWriter.name("themes");
        this.listOfSavingsAccountThemeDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getThemes());
        jsonWriter.name("plus_subscription_status");
        this.nullablePlusSubscriptionStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountInfoResponse2.getPlusSubscriptionStatus());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(SavingsAccountInfoResponse)");
    }
}
