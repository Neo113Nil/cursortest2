package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_PfmMoney_Currency_LoyaltyCurrencyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$Currency$LoyaltyCurrency;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$CurrencyType;", "currencyTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$LoyaltyCurrencyType;", "loyaltyCurrencyTypeAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "nullableThemesOfStringAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_PfmMoney_Currency_LoyaltyCurrencyJsonAdapter extends JsonAdapter<PfmResponse$PfmMoney$Currency$LoyaltyCurrency> {
    private final JsonAdapter<PfmResponse.PfmMoney.CurrencyType> currencyTypeAdapter;
    private final JsonAdapter<PfmResponse.PfmMoney.LoyaltyCurrencyType> loyaltyCurrencyTypeAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("currency_type", "type", "icon");

    public PfmResponse_PfmMoney_Currency_LoyaltyCurrencyJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.currencyTypeAdapter = moshi.adapter(PfmResponse.PfmMoney.CurrencyType.class, emptySet, "currencyType");
        this.loyaltyCurrencyTypeAdapter = moshi.adapter(PfmResponse.PfmMoney.LoyaltyCurrencyType.class, emptySet, "type");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "icon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$PfmMoney$Currency$LoyaltyCurrency fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.PfmMoney.CurrencyType currencyType = null;
        PfmResponse.PfmMoney.LoyaltyCurrencyType loyaltyCurrencyType = null;
        Themes<String> themes = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                currencyType = this.currencyTypeAdapter.fromJson(jsonReader);
                if (currencyType == null) {
                    throw Util.unexpectedNull("currencyType", "currency_type", jsonReader);
                }
            } else if (selectName == 1) {
                loyaltyCurrencyType = this.loyaltyCurrencyTypeAdapter.fromJson(jsonReader);
                if (loyaltyCurrencyType == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 2) {
                themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (currencyType == null) {
            throw Util.missingProperty("currencyType", "currency_type", jsonReader);
        }
        if (loyaltyCurrencyType != null) {
            return new PfmResponse$PfmMoney$Currency$LoyaltyCurrency(currencyType, loyaltyCurrencyType, themes);
        }
        throw Util.missingProperty("type", "type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$PfmMoney$Currency$LoyaltyCurrency pfmResponse$PfmMoney$Currency$LoyaltyCurrency) {
        PfmResponse$PfmMoney$Currency$LoyaltyCurrency pfmResponse$PfmMoney$Currency$LoyaltyCurrency2 = pfmResponse$PfmMoney$Currency$LoyaltyCurrency;
        if (pfmResponse$PfmMoney$Currency$LoyaltyCurrency2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("currency_type");
        this.currencyTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmMoney$Currency$LoyaltyCurrency2.getCurrencyType());
        jsonWriter.name("type");
        this.loyaltyCurrencyTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmMoney$Currency$LoyaltyCurrency2.getType());
        jsonWriter.name("icon");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmMoney$Currency$LoyaltyCurrency2.getIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(67, "GeneratedJsonAdapter(PfmResponse.PfmMoney.Currency.LoyaltyCurrency)");
    }
}
