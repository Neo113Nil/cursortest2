package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.common.Product;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/network/dto/CashbackStatusRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/CashbackStatusRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/common/Product;", "productAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CashbackStatusRequestJsonAdapter extends JsonAdapter<CashbackStatusRequest> {
    private final JsonReader.Options options = JsonReader.Options.of("product_type");
    private final JsonAdapter<Product> productAdapter;

    public CashbackStatusRequestJsonAdapter(Moshi moshi) {
        this.productAdapter = moshi.adapter(Product.class, EmptySet.a, "productType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CashbackStatusRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Product product = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (product = this.productAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("productType", "product_type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (product != null) {
            return new CashbackStatusRequest(product);
        }
        throw Util.missingProperty("productType", "product_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CashbackStatusRequest cashbackStatusRequest) {
        CashbackStatusRequest cashbackStatusRequest2 = cashbackStatusRequest;
        if (cashbackStatusRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("product_type");
        this.productAdapter.toJson(jsonWriter, (JsonWriter) cashbackStatusRequest2.getProductType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(CashbackStatusRequest)");
    }
}
