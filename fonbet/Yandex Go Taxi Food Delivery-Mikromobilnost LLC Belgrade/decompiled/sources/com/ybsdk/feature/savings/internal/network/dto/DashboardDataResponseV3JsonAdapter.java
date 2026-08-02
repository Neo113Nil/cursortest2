package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DashboardDataResponseV3JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/DashboardDataResponseV3;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsInterestHintResponse;", "listOfSavingsInterestHintResponseAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountsInfoResponseV3;", "savingsAccountsInfoResponseV3Adapter", "listOfStringAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/DivkitWidgetDto;", "listOfDivkitWidgetDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardDataResponseV3JsonAdapter extends JsonAdapter<DashboardDataResponseV3> {
    private final JsonAdapter<List<DivkitWidgetDto>> listOfDivkitWidgetDtoAdapter;
    private final JsonAdapter<List<SavingsInterestHintResponse>> listOfSavingsInterestHintResponseAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("total_balance", "title", "icon", "interest_hints", "support_url", "savings_accounts_info", "layout", "divkit_widgets");
    private final JsonAdapter<SavingsAccountsInfoResponseV3> savingsAccountsInfoResponseV3Adapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public DashboardDataResponseV3JsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "totalBalance");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "icon");
        this.listOfSavingsInterestHintResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, SavingsInterestHintResponse.class), emptySet, "interestHints");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "supportUrl");
        this.savingsAccountsInfoResponseV3Adapter = moshi.adapter(SavingsAccountsInfoResponseV3.class, emptySet, "savingsAccountsInfo");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "layout");
        this.listOfDivkitWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DivkitWidgetDto.class), emptySet, "divkitWidgets");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardDataResponseV3 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        String str = null;
        Themes<String> themes = null;
        List<SavingsInterestHintResponse> list = null;
        String str2 = null;
        SavingsAccountsInfoResponseV3 savingsAccountsInfoResponseV3 = null;
        List<String> list2 = null;
        List<DivkitWidgetDto> list3 = null;
        while (true) {
            Money money2 = money;
            String str3 = str;
            Themes<String> themes2 = themes;
            List<SavingsInterestHintResponse> list4 = list;
            String str4 = str2;
            if (!jsonReader.hasNext()) {
                SavingsAccountsInfoResponseV3 savingsAccountsInfoResponseV32 = savingsAccountsInfoResponseV3;
                jsonReader.endObject();
                if (money2 == null) {
                    throw Util.missingProperty("totalBalance", "total_balance", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (themes2 == null) {
                    throw Util.missingProperty("icon", "icon", jsonReader);
                }
                if (list4 == null) {
                    throw Util.missingProperty("interestHints", "interest_hints", jsonReader);
                }
                if (savingsAccountsInfoResponseV32 == null) {
                    throw Util.missingProperty("savingsAccountsInfo", "savings_accounts_info", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty("layout", "layout", jsonReader);
                }
                if (list3 != null) {
                    return new DashboardDataResponseV3(money2, str3, themes2, list4, str4, savingsAccountsInfoResponseV32, list2, list3);
                }
                throw Util.missingProperty("divkitWidgets", "divkit_widgets", jsonReader);
            }
            SavingsAccountsInfoResponseV3 savingsAccountsInfoResponseV33 = savingsAccountsInfoResponseV3;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    savingsAccountsInfoResponseV3 = savingsAccountsInfoResponseV33;
                    money = money2;
                    str = str3;
                    themes = themes2;
                    list = list4;
                    str2 = str4;
                case 0:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("totalBalance", "total_balance", jsonReader);
                    }
                    savingsAccountsInfoResponseV3 = savingsAccountsInfoResponseV33;
                    str = str3;
                    themes = themes2;
                    list = list4;
                    str2 = str4;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    savingsAccountsInfoResponseV3 = savingsAccountsInfoResponseV33;
                    money = money2;
                    themes = themes2;
                    list = list4;
                    str2 = str4;
                case 2:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("icon", "icon", jsonReader);
                    }
                    savingsAccountsInfoResponseV3 = savingsAccountsInfoResponseV33;
                    money = money2;
                    str = str3;
                    list = list4;
                    str2 = str4;
                case 3:
                    list = this.listOfSavingsInterestHintResponseAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("interestHints", "interest_hints", jsonReader);
                    }
                    savingsAccountsInfoResponseV3 = savingsAccountsInfoResponseV33;
                    money = money2;
                    str = str3;
                    themes = themes2;
                    str2 = str4;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    savingsAccountsInfoResponseV3 = savingsAccountsInfoResponseV33;
                    money = money2;
                    str = str3;
                    themes = themes2;
                    list = list4;
                case 5:
                    savingsAccountsInfoResponseV3 = this.savingsAccountsInfoResponseV3Adapter.fromJson(jsonReader);
                    if (savingsAccountsInfoResponseV3 == null) {
                        throw Util.unexpectedNull("savingsAccountsInfo", "savings_accounts_info", jsonReader);
                    }
                    money = money2;
                    str = str3;
                    themes = themes2;
                    list = list4;
                    str2 = str4;
                case 6:
                    list2 = this.listOfStringAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("layout", "layout", jsonReader);
                    }
                    savingsAccountsInfoResponseV3 = savingsAccountsInfoResponseV33;
                    money = money2;
                    str = str3;
                    themes = themes2;
                    list = list4;
                    str2 = str4;
                case 7:
                    list3 = this.listOfDivkitWidgetDtoAdapter.fromJson(jsonReader);
                    if (list3 == null) {
                        throw Util.unexpectedNull("divkitWidgets", "divkit_widgets", jsonReader);
                    }
                    savingsAccountsInfoResponseV3 = savingsAccountsInfoResponseV33;
                    money = money2;
                    str = str3;
                    themes = themes2;
                    list = list4;
                    str2 = str4;
                default:
                    savingsAccountsInfoResponseV3 = savingsAccountsInfoResponseV33;
                    money = money2;
                    str = str3;
                    themes = themes2;
                    list = list4;
                    str2 = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardDataResponseV3 dashboardDataResponseV3) {
        DashboardDataResponseV3 dashboardDataResponseV32 = dashboardDataResponseV3;
        if (dashboardDataResponseV32 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("total_balance");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) dashboardDataResponseV32.getTotalBalance());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dashboardDataResponseV32.getTitle());
        jsonWriter.name("icon");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardDataResponseV32.getIcon());
        jsonWriter.name("interest_hints");
        this.listOfSavingsInterestHintResponseAdapter.toJson(jsonWriter, (JsonWriter) dashboardDataResponseV32.getInterestHints());
        jsonWriter.name("support_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardDataResponseV32.getSupportUrl());
        jsonWriter.name("savings_accounts_info");
        this.savingsAccountsInfoResponseV3Adapter.toJson(jsonWriter, (JsonWriter) dashboardDataResponseV32.getSavingsAccountsInfo());
        jsonWriter.name("layout");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardDataResponseV32.getLayout());
        jsonWriter.name("divkit_widgets");
        this.listOfDivkitWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardDataResponseV32.getDivkitWidgets());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(DashboardDataResponseV3)");
    }
}
