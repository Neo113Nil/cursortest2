package com.ybsdk.network.dto.topup;

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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupNoticeContentRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/topup/TopupNoticeContentRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopupNoticeContentRequestJsonAdapter extends JsonAdapter<TopupNoticeContentRequest> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_method_id", "purchase_amount");

    public TopupNoticeContentRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentMethodId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "purchaseAmount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TopupNoticeContentRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Money money = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1 && (money = this.moneyAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("purchaseAmount", "purchase_amount", jsonReader);
            }
        }
        jsonReader.endObject();
        if (money != null) {
            return new TopupNoticeContentRequest(str, money);
        }
        throw Util.missingProperty("purchaseAmount", "purchase_amount", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TopupNoticeContentRequest topupNoticeContentRequest) {
        TopupNoticeContentRequest topupNoticeContentRequest2 = topupNoticeContentRequest;
        if (topupNoticeContentRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_method_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) topupNoticeContentRequest2.getPaymentMethodId());
        jsonWriter.name("purchase_amount");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) topupNoticeContentRequest2.getPurchaseAmount());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(TopupNoticeContentRequest)");
    }
}
