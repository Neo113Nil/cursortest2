package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_PfmTextContent_AmountJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Amount;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;", "textTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney;", "pfmMoneyAdapter", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Spoiler;", "spoilerAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_PfmTextContent_AmountJsonAdapter extends JsonAdapter<PfmResponse$PfmTextContent$Amount> {
    private final JsonReader.Options options = JsonReader.Options.of("content_type", "money", "spoiler");
    private final JsonAdapter<PfmResponse.PfmMoney> pfmMoneyAdapter;
    private final JsonAdapter<PfmResponse.Spoiler> spoilerAdapter;
    private final JsonAdapter<PfmResponse.TextType> textTypeAdapter;

    public PfmResponse_PfmTextContent_AmountJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.textTypeAdapter = moshi.adapter(PfmResponse.TextType.class, emptySet, "contentType");
        this.pfmMoneyAdapter = moshi.adapter(PfmResponse.PfmMoney.class, emptySet, "money");
        this.spoilerAdapter = moshi.adapter(PfmResponse.Spoiler.class, emptySet, "spoiler");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$PfmTextContent$Amount fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.TextType textType = null;
        PfmResponse.PfmMoney pfmMoney = null;
        PfmResponse.Spoiler spoiler = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                textType = this.textTypeAdapter.fromJson(jsonReader);
                if (textType == null) {
                    throw Util.unexpectedNull("contentType", "content_type", jsonReader);
                }
            } else if (selectName == 1) {
                pfmMoney = this.pfmMoneyAdapter.fromJson(jsonReader);
                if (pfmMoney == null) {
                    throw Util.unexpectedNull("money", "money", jsonReader);
                }
            } else if (selectName == 2 && (spoiler = this.spoilerAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("spoiler", "spoiler", jsonReader);
            }
        }
        jsonReader.endObject();
        if (textType == null) {
            throw Util.missingProperty("contentType", "content_type", jsonReader);
        }
        if (pfmMoney == null) {
            throw Util.missingProperty("money", "money", jsonReader);
        }
        if (spoiler != null) {
            return new PfmResponse$PfmTextContent$Amount(textType, pfmMoney, spoiler);
        }
        throw Util.missingProperty("spoiler", "spoiler", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$PfmTextContent$Amount pfmResponse$PfmTextContent$Amount) {
        PfmResponse$PfmTextContent$Amount pfmResponse$PfmTextContent$Amount2 = pfmResponse$PfmTextContent$Amount;
        if (pfmResponse$PfmTextContent$Amount2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content_type");
        this.textTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmTextContent$Amount2.getContentType());
        jsonWriter.name("money");
        this.pfmMoneyAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmTextContent$Amount2.getMoney());
        jsonWriter.name("spoiler");
        this.spoilerAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmTextContent$Amount2.getSpoiler());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(PfmResponse.PfmTextContent.Amount)");
    }
}
