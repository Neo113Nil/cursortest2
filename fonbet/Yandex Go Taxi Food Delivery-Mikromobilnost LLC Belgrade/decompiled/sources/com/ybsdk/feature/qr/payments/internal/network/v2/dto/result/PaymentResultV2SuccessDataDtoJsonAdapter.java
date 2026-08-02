package com.ybsdk.feature.qr.payments.internal.network.v2.dto.result;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.SubscriptionWidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2SuccessDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2SuccessDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionWidgetDto;", "nullableSubscriptionWidgetDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "nullableActionButtonDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentResultV2SuccessDataDtoJsonAdapter extends JsonAdapter<PaymentResultV2SuccessDataDto> {
    private final JsonAdapter<ActionButtonDto> nullableActionButtonDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<SubscriptionWidgetDto> nullableSubscriptionWidgetDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("subscription_widget", "redirect_link", "divkit_data", "button", "funding");

    public PaymentResultV2SuccessDataDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableSubscriptionWidgetDtoAdapter = moshi.adapter(SubscriptionWidgetDto.class, emptySet, "subscriptionWidget");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "redirectLink");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divData");
        this.nullableActionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "button");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentResultV2SuccessDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SubscriptionWidgetDto subscriptionWidgetDto = null;
        String str = null;
        DivDataDto divDataDto = null;
        ActionButtonDto actionButtonDto = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                subscriptionWidgetDto = this.nullableSubscriptionWidgetDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                actionButtonDto = this.nullableActionButtonDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PaymentResultV2SuccessDataDto(subscriptionWidgetDto, str, divDataDto, actionButtonDto, str2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto) {
        PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto2 = paymentResultV2SuccessDataDto;
        if (paymentResultV2SuccessDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("subscription_widget");
        this.nullableSubscriptionWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentResultV2SuccessDataDto2.getSubscriptionWidget());
        jsonWriter.name("redirect_link");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentResultV2SuccessDataDto2.getRedirectLink());
        jsonWriter.name("divkit_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentResultV2SuccessDataDto2.getDivData());
        jsonWriter.name("button");
        this.nullableActionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentResultV2SuccessDataDto2.getButton());
        jsonWriter.name("funding");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentResultV2SuccessDataDto2.getFunding());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(PaymentResultV2SuccessDataDto)");
    }
}
