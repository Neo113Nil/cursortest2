package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_PfmMoneyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/a;", "currencyAdapter", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$SignType;", "signTypeAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_PfmMoneyJsonAdapter extends JsonAdapter<PfmResponse.PfmMoney> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<a> currencyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("amount", "currency", "sign_type");
    private final JsonAdapter<PfmResponse.PfmMoney.SignType> signTypeAdapter;

    public PfmResponse_PfmMoneyJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.bigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "amount");
        this.currencyAdapter = moshi.adapter(a.class, emptySet, "currency");
        this.signTypeAdapter = moshi.adapter(PfmResponse.PfmMoney.SignType.class, emptySet, "signType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse.PfmMoney fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        BigDecimal bigDecimal = null;
        a aVar = null;
        PfmResponse.PfmMoney.SignType signType = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bigDecimal = this.bigDecimalAdapter.fromJson(jsonReader);
                if (bigDecimal == null) {
                    throw Util.unexpectedNull("amount", "amount", jsonReader);
                }
            } else if (selectName == 1) {
                aVar = this.currencyAdapter.fromJson(jsonReader);
                if (aVar == null) {
                    throw Util.unexpectedNull("currency", "currency", jsonReader);
                }
            } else if (selectName == 2 && (signType = this.signTypeAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("signType", "sign_type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bigDecimal == null) {
            throw Util.missingProperty("amount", "amount", jsonReader);
        }
        if (aVar == null) {
            throw Util.missingProperty("currency", "currency", jsonReader);
        }
        if (signType != null) {
            return new PfmResponse.PfmMoney(bigDecimal, aVar, signType);
        }
        throw Util.missingProperty("signType", "sign_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse.PfmMoney pfmMoney) {
        PfmResponse.PfmMoney pfmMoney2 = pfmMoney;
        if (pfmMoney2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("amount");
        this.bigDecimalAdapter.toJson(jsonWriter, (JsonWriter) pfmMoney2.getAmount());
        jsonWriter.name("currency");
        this.currencyAdapter.toJson(jsonWriter, (JsonWriter) pfmMoney2.getCurrency());
        jsonWriter.name("sign_type");
        this.signTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmMoney2.getSignType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(PfmResponse.PfmMoney)");
    }
}
