package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/UpToBalanceSettingsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/UpToBalanceSettingsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpToBalanceSettingsDtoJsonAdapter extends JsonAdapter<UpToBalanceSettingsDto> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("amount", "threshold");

    public UpToBalanceSettingsDtoJsonAdapter(Moshi moshi) {
        this.moneyAdapter = moshi.adapter(Money.class, EmptySet.a, "amount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UpToBalanceSettingsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        Money money2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("amount", "amount", jsonReader);
                }
            } else if (selectName == 1 && (money2 = this.moneyAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("threshold", "threshold", jsonReader);
            }
        }
        jsonReader.endObject();
        if (money == null) {
            throw Util.missingProperty("amount", "amount", jsonReader);
        }
        if (money2 != null) {
            return new UpToBalanceSettingsDto(money, money2);
        }
        throw Util.missingProperty("threshold", "threshold", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UpToBalanceSettingsDto upToBalanceSettingsDto) {
        UpToBalanceSettingsDto upToBalanceSettingsDto2 = upToBalanceSettingsDto;
        if (upToBalanceSettingsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("amount");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) upToBalanceSettingsDto2.getAmount());
        jsonWriter.name("threshold");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) upToBalanceSettingsDto2.getThreshold());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(UpToBalanceSettingsDto)");
    }
}
