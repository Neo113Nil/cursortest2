package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.Agreement;
import com.ybsdk.network.dto.common.Product;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/AgreementJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/Agreement;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/common/Product;", "nullableProductAdapter", "", "Lcom/ybsdk/network/dto/Agreement$Accessor;", "listOfAccessorAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AgreementJsonAdapter extends JsonAdapter<Agreement> {
    private final JsonAdapter<List<Agreement.Accessor>> listOfAccessorAdapter;
    private final JsonAdapter<Product> nullableProductAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", CreateApplicationWithProductJsonAdapter.productKey, "accessors");
    private final JsonAdapter<String> stringAdapter;

    public AgreementJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.nullableProductAdapter = moshi.adapter(Product.class, emptySet, CreateApplicationWithProductJsonAdapter.productKey);
        this.listOfAccessorAdapter = moshi.adapter(Types.newParameterizedType(List.class, Agreement.Accessor.class), emptySet, "accessors");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Agreement fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Product product = null;
        List<Agreement.Accessor> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                }
            } else if (selectName == 1) {
                product = this.nullableProductAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (list = this.listOfAccessorAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("accessors", "accessors", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
        }
        if (list != null) {
            return new Agreement(str, product, list);
        }
        throw Util.missingProperty("accessors", "accessors", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Agreement agreement) {
        Agreement agreement2 = agreement;
        if (agreement2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) agreement2.getAgreementId());
        jsonWriter.name(CreateApplicationWithProductJsonAdapter.productKey);
        this.nullableProductAdapter.toJson(jsonWriter, (JsonWriter) agreement2.getProduct());
        jsonWriter.name("accessors");
        this.listOfAccessorAdapter.toJson(jsonWriter, (JsonWriter) agreement2.getAccessors());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(Agreement)");
    }
}
