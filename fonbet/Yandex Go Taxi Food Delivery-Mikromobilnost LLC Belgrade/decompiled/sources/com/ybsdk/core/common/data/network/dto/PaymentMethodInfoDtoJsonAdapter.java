package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "paymentMethodTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Me2MeInfo;", "nullableMe2MeInfoAdapter", "Lcom/ybsdk/core/common/data/network/dto/SavingsAccountInfo;", "nullableSavingsAccountInfoAdapter", "Lcom/ybsdk/core/common/data/network/dto/YandexAccountInfo;", "nullableYandexAccountInfoAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaymentMethodInfoDtoJsonAdapter extends JsonAdapter<PaymentMethodInfoDto> {
    private final JsonAdapter<Me2MeInfo> nullableMe2MeInfoAdapter;
    private final JsonAdapter<SavingsAccountInfo> nullableSavingsAccountInfoAdapter;
    private final JsonAdapter<YandexAccountInfo> nullableYandexAccountInfoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("paymentType", "me2me", "savings_account", "yandex_account");
    private final JsonAdapter<PaymentMethodTypeDto> paymentMethodTypeDtoAdapter;

    public PaymentMethodInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.paymentMethodTypeDtoAdapter = moshi.adapter(PaymentMethodTypeDto.class, emptySet, "paymentType");
        this.nullableMe2MeInfoAdapter = moshi.adapter(Me2MeInfo.class, emptySet, "me2meInfo");
        this.nullableSavingsAccountInfoAdapter = moshi.adapter(SavingsAccountInfo.class, emptySet, "savingsAccountInfo");
        this.nullableYandexAccountInfoAdapter = moshi.adapter(YandexAccountInfo.class, emptySet, "yandexAccountInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentMethodInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentMethodTypeDto paymentMethodTypeDto = null;
        Me2MeInfo me2MeInfo = null;
        SavingsAccountInfo savingsAccountInfo = null;
        YandexAccountInfo yandexAccountInfo = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentMethodTypeDto = this.paymentMethodTypeDtoAdapter.fromJson(jsonReader);
                if (paymentMethodTypeDto == null) {
                    throw Util.unexpectedNull("paymentType", "paymentType", jsonReader);
                }
            } else if (selectName == 1) {
                me2MeInfo = this.nullableMe2MeInfoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                savingsAccountInfo = this.nullableSavingsAccountInfoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                yandexAccountInfo = this.nullableYandexAccountInfoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (paymentMethodTypeDto != null) {
            return new PaymentMethodInfoDto(paymentMethodTypeDto, me2MeInfo, savingsAccountInfo, yandexAccountInfo);
        }
        throw Util.missingProperty("paymentType", "paymentType", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentMethodInfoDto paymentMethodInfoDto) {
        PaymentMethodInfoDto paymentMethodInfoDto2 = paymentMethodInfoDto;
        if (paymentMethodInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("paymentType");
        this.paymentMethodTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodInfoDto2.getPaymentType());
        jsonWriter.name("me2me");
        this.nullableMe2MeInfoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodInfoDto2.getMe2meInfo());
        jsonWriter.name("savings_account");
        this.nullableSavingsAccountInfoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodInfoDto2.getSavingsAccountInfo());
        jsonWriter.name("yandex_account");
        this.nullableYandexAccountInfoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodInfoDto2.getYandexAccountInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(PaymentMethodInfoDto)");
    }
}
