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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$CreditLimitStatus;", "creditLimitStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$PaymentMethod;", "paymentMethodAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreditLimitPaymentMethodEntityJsonAdapter extends JsonAdapter<CreditLimitPaymentMethodEntity> {
    private final JsonAdapter<CreditLimitPaymentMethodEntity.CreditLimitStatus> creditLimitStatusAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "paymentMethod");
    private final JsonAdapter<CreditLimitPaymentMethodEntity.PaymentMethod> paymentMethodAdapter;

    public CreditLimitPaymentMethodEntityJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.creditLimitStatusAdapter = moshi.adapter(CreditLimitPaymentMethodEntity.CreditLimitStatus.class, emptySet, ACSPConstants.STATUS);
        this.paymentMethodAdapter = moshi.adapter(CreditLimitPaymentMethodEntity.PaymentMethod.class, emptySet, "paymentMethod");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitPaymentMethodEntity fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CreditLimitPaymentMethodEntity.CreditLimitStatus creditLimitStatus = null;
        CreditLimitPaymentMethodEntity.PaymentMethod paymentMethod = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                creditLimitStatus = this.creditLimitStatusAdapter.fromJson(jsonReader);
                if (creditLimitStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1 && (paymentMethod = this.paymentMethodAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentMethod", "paymentMethod", jsonReader);
            }
        }
        jsonReader.endObject();
        if (creditLimitStatus == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (paymentMethod != null) {
            return new CreditLimitPaymentMethodEntity(creditLimitStatus, paymentMethod);
        }
        throw Util.missingProperty("paymentMethod", "paymentMethod", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitPaymentMethodEntity creditLimitPaymentMethodEntity) {
        CreditLimitPaymentMethodEntity creditLimitPaymentMethodEntity2 = creditLimitPaymentMethodEntity;
        if (creditLimitPaymentMethodEntity2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.creditLimitStatusAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPaymentMethodEntity2.getStatus());
        jsonWriter.name("paymentMethod");
        this.paymentMethodAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPaymentMethodEntity2.getPaymentMethod());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(CreditLimitPaymentMethodEntity)");
    }
}
