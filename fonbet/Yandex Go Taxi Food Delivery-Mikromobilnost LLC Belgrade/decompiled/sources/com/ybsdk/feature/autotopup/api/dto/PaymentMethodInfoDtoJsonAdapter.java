package com.ybsdk.feature.autotopup.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import defpackage.wf91;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "paymentMethodTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethodInfoDtoJsonAdapter extends JsonAdapter<PaymentMethodInfoDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<PaymentMethodTypeDto> paymentMethodTypeDtoAdapter;

    public PaymentMethodInfoDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (wf91.b[i] ^ wf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("type", "payment_method_id", new String(bArr, uza.a));
        EmptySet emptySet = EmptySet.a;
        this.paymentMethodTypeDtoAdapter = moshi.adapter(PaymentMethodTypeDto.class, emptySet, "type");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentMethodId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentMethodInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentMethodTypeDto paymentMethodTypeDto = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentMethodTypeDto = this.paymentMethodTypeDtoAdapter.fromJson(jsonReader);
                if (paymentMethodTypeDto == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (paymentMethodTypeDto != null) {
            return new PaymentMethodInfoDto(paymentMethodTypeDto, str, str2);
        }
        throw Util.missingProperty("type", "type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentMethodInfoDto paymentMethodInfoDto) {
        PaymentMethodInfoDto paymentMethodInfoDto2 = paymentMethodInfoDto;
        if (paymentMethodInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.paymentMethodTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodInfoDto2.getType());
        jsonWriter.name("payment_method_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodInfoDto2.getPaymentMethodId());
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (wf91.b[i] ^ wf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodInfoDto2.getYbId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(PaymentMethodInfoDto)");
    }
}
