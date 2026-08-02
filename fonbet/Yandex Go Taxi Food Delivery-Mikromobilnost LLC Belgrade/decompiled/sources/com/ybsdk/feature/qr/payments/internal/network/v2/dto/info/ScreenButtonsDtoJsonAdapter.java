package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/ScreenButtonsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/ScreenButtonsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "actionButtonDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenButtonsDtoJsonAdapter extends JsonAdapter<ScreenButtonsDto> {
    private final JsonAdapter<ActionButtonDto> actionButtonDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("select_agreement_button", "payment_button");

    public ScreenButtonsDtoJsonAdapter(Moshi moshi) {
        this.actionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, EmptySet.a, "selectAgreementButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScreenButtonsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ActionButtonDto actionButtonDto = null;
        ActionButtonDto actionButtonDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                actionButtonDto = this.actionButtonDtoAdapter.fromJson(jsonReader);
                if (actionButtonDto == null) {
                    throw Util.unexpectedNull("selectAgreementButton", "select_agreement_button", jsonReader);
                }
            } else if (selectName == 1 && (actionButtonDto2 = this.actionButtonDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentButton", "payment_button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (actionButtonDto == null) {
            throw Util.missingProperty("selectAgreementButton", "select_agreement_button", jsonReader);
        }
        if (actionButtonDto2 != null) {
            return new ScreenButtonsDto(actionButtonDto, actionButtonDto2);
        }
        throw Util.missingProperty("paymentButton", "payment_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScreenButtonsDto screenButtonsDto) {
        ScreenButtonsDto screenButtonsDto2 = screenButtonsDto;
        if (screenButtonsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("select_agreement_button");
        this.actionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) screenButtonsDto2.getSelectAgreementButton());
        jsonWriter.name("payment_button");
        this.actionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) screenButtonsDto2.getPaymentButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ScreenButtonsDto)");
    }
}
