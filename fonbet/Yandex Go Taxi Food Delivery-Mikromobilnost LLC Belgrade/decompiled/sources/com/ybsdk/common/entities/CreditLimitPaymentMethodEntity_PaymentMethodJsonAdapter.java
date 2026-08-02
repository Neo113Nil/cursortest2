package com.ybsdk.common.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.common.entities.CreditLimitPaymentMethodEntity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity_PaymentMethodJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$PaymentMethod;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreditLimitPaymentMethodEntity_PaymentMethodJsonAdapter extends JsonAdapter<CreditLimitPaymentMethodEntity.PaymentMethod> {
    private final JsonReader.Options options = JsonReader.Options.of("paymentMethodType", "title", "logo");
    private final JsonAdapter<String> stringAdapter;

    public CreditLimitPaymentMethodEntity_PaymentMethodJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "paymentMethodType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitPaymentMethodEntity.PaymentMethod fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("paymentMethodType", "paymentMethodType", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("logo", "logo", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("paymentMethodType", "paymentMethodType", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str3 != null) {
            return new CreditLimitPaymentMethodEntity.PaymentMethod(str, str2, str3);
        }
        throw Util.missingProperty("logo", "logo", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitPaymentMethodEntity.PaymentMethod paymentMethod) {
        CreditLimitPaymentMethodEntity.PaymentMethod paymentMethod2 = paymentMethod;
        if (paymentMethod2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("paymentMethodType");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethod2.getPaymentMethodType());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethod2.getTitle());
        jsonWriter.name("logo");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethod2.getLogo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(66, "GeneratedJsonAdapter(CreditLimitPaymentMethodEntity.PaymentMethod)");
    }
}
