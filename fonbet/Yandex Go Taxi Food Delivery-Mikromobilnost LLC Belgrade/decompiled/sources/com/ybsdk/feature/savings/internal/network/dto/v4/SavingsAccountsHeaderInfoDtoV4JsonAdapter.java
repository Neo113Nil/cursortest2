package com.ybsdk.feature.savings.internal.network.dto.v4;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsAccountsHeaderInfoDtoV4JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsAccountsHeaderInfoDtoV4;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountsHeaderInfoDtoV4JsonAdapter extends JsonAdapter<SavingsAccountsHeaderInfoDtoV4> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("total_balance", "title", "title_icon", "bottom_div_data", "background_gradient", "support_url");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public SavingsAccountsHeaderInfoDtoV4JsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "totalBalance");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "titleIcon");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "bottomDivData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsAccountsHeaderInfoDtoV4 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        String str = null;
        ThemedParameter<String> themedParameter = null;
        DivDataDto divDataDto = null;
        ThemedParameter<String> themedParameter2 = null;
        String str2 = null;
        while (true) {
            Money money2 = money;
            String str3 = str;
            ThemedParameter<String> themedParameter3 = themedParameter;
            if (!jsonReader.hasNext()) {
                DivDataDto divDataDto2 = divDataDto;
                jsonReader.endObject();
                if (money2 == null) {
                    throw Util.missingProperty("totalBalance", "total_balance", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (themedParameter3 == null) {
                    throw Util.missingProperty("titleIcon", "title_icon", jsonReader);
                }
                if (divDataDto2 == null) {
                    throw Util.missingProperty("bottomDivData", "bottom_div_data", jsonReader);
                }
                if (themedParameter2 == null) {
                    throw Util.missingProperty("backgroundGradient", "background_gradient", jsonReader);
                }
                if (str2 != null) {
                    return new SavingsAccountsHeaderInfoDtoV4(money2, str3, themedParameter3, divDataDto2, themedParameter2, str2);
                }
                throw Util.missingProperty("supportUrl", "support_url", jsonReader);
            }
            DivDataDto divDataDto3 = divDataDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    divDataDto = divDataDto3;
                    money = money2;
                    str = str3;
                    themedParameter = themedParameter3;
                case 0:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("totalBalance", "total_balance", jsonReader);
                    }
                    divDataDto = divDataDto3;
                    str = str3;
                    themedParameter = themedParameter3;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    divDataDto = divDataDto3;
                    money = money2;
                    themedParameter = themedParameter3;
                case 2:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull("titleIcon", "title_icon", jsonReader);
                    }
                    divDataDto = divDataDto3;
                    money = money2;
                    str = str3;
                case 3:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("bottomDivData", "bottom_div_data", jsonReader);
                    }
                    money = money2;
                    str = str3;
                    themedParameter = themedParameter3;
                case 4:
                    themedParameter2 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter2 == null) {
                        throw Util.unexpectedNull("backgroundGradient", "background_gradient", jsonReader);
                    }
                    divDataDto = divDataDto3;
                    money = money2;
                    str = str3;
                    themedParameter = themedParameter3;
                case 5:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("supportUrl", "support_url", jsonReader);
                    }
                    divDataDto = divDataDto3;
                    money = money2;
                    str = str3;
                    themedParameter = themedParameter3;
                default:
                    divDataDto = divDataDto3;
                    money = money2;
                    str = str3;
                    themedParameter = themedParameter3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsAccountsHeaderInfoDtoV4 savingsAccountsHeaderInfoDtoV4) {
        SavingsAccountsHeaderInfoDtoV4 savingsAccountsHeaderInfoDtoV42 = savingsAccountsHeaderInfoDtoV4;
        if (savingsAccountsHeaderInfoDtoV42 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("total_balance");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountsHeaderInfoDtoV42.getTotalBalance());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountsHeaderInfoDtoV42.getTitle());
        jsonWriter.name("title_icon");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountsHeaderInfoDtoV42.getTitleIcon());
        jsonWriter.name("bottom_div_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountsHeaderInfoDtoV42.getBottomDivData());
        jsonWriter.name("background_gradient");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountsHeaderInfoDtoV42.getBackgroundGradient());
        jsonWriter.name("support_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountsHeaderInfoDtoV42.getSupportUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(SavingsAccountsHeaderInfoDtoV4)");
    }
}
