package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transactions.api.entities.TransactionEntity;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionInfoResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse_UsedCardInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedCardInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;", "paymentSystemAdapter", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionInfoResponse_UsedCardInfoJsonAdapter extends JsonAdapter<TransactionInfoResponse.UsedCardInfo> {
    private final JsonReader.Options options = JsonReader.Options.of("last_digits", "payment_system");
    private final JsonAdapter<TransactionEntity.PaymentSystem> paymentSystemAdapter;
    private final JsonAdapter<String> stringAdapter;

    public TransactionInfoResponse_UsedCardInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "lastDigits");
        this.paymentSystemAdapter = moshi.adapter(TransactionEntity.PaymentSystem.class, emptySet, "paymentSystem");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransactionInfoResponse.UsedCardInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        TransactionEntity.PaymentSystem paymentSystem = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("lastDigits", "last_digits", jsonReader);
                }
            } else if (selectName == 1 && (paymentSystem = this.paymentSystemAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentSystem", "payment_system", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("lastDigits", "last_digits", jsonReader);
        }
        if (paymentSystem != null) {
            return new TransactionInfoResponse.UsedCardInfo(str, paymentSystem);
        }
        throw Util.missingProperty("paymentSystem", "payment_system", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransactionInfoResponse.UsedCardInfo usedCardInfo) {
        TransactionInfoResponse.UsedCardInfo usedCardInfo2 = usedCardInfo;
        if (usedCardInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("last_digits");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) usedCardInfo2.getLastDigits());
        jsonWriter.name("payment_system");
        this.paymentSystemAdapter.toJson(jsonWriter, (JsonWriter) usedCardInfo2.getPaymentSystem());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(58, "GeneratedJsonAdapter(TransactionInfoResponse.UsedCardInfo)");
    }
}
