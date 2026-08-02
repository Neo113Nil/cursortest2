package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAtRawJsonStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionStatusRequestJsonAdapter extends JsonAdapter<TransactionStatusRequest> {
    private final JsonReader.Options options = JsonReader.Options.of("transaction_parameters");
    private final JsonAdapter<String> stringAtRawJsonStringAdapter;

    public TransactionStatusRequestJsonAdapter(Moshi moshi) {
        this.stringAtRawJsonStringAdapter = moshi.adapter(String.class, Collections.singleton(new RawJsonString() { // from class: com.ybsdk.feature.split.deposit.internal.data.network.dto.TransactionStatusRequestJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return RawJsonString.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof RawJsonString;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.ybsdk.core.common.data.network.adapters.RawJsonString()";
            }
        }), "transactionParameters");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransactionStatusRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (str = this.stringAtRawJsonStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("transactionParameters", "transaction_parameters", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new TransactionStatusRequest(str);
        }
        throw Util.missingProperty("transactionParameters", "transaction_parameters", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransactionStatusRequest transactionStatusRequest) {
        TransactionStatusRequest transactionStatusRequest2 = transactionStatusRequest;
        if (transactionStatusRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("transaction_parameters");
        this.stringAtRawJsonStringAdapter.toJson(jsonWriter, (JsonWriter) transactionStatusRequest2.getTransactionParameters());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(TransactionStatusRequest)");
    }
}
