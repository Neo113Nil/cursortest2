package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;", "regularAutotopupStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;", "selectedRegularAutotopupOptionDtoAdapter", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "paymentMethodInfoDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutoTopupValidationRequestJsonAdapter extends JsonAdapter<RegularAutoTopupValidationRequest> {
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "selected_option", "agreement_id", "payment_method");
    private final JsonAdapter<PaymentMethodInfoDto> paymentMethodInfoDtoAdapter;
    private final JsonAdapter<RegularAutotopupStatusDto> regularAutotopupStatusDtoAdapter;
    private final JsonAdapter<SelectedRegularAutotopupOptionDto> selectedRegularAutotopupOptionDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public RegularAutoTopupValidationRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.regularAutotopupStatusDtoAdapter = moshi.adapter(RegularAutotopupStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.selectedRegularAutotopupOptionDtoAdapter = moshi.adapter(SelectedRegularAutotopupOptionDto.class, emptySet, "selectedOption");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.paymentMethodInfoDtoAdapter = moshi.adapter(PaymentMethodInfoDto.class, emptySet, "paymentMethod");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RegularAutoTopupValidationRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RegularAutotopupStatusDto regularAutotopupStatusDto = null;
        SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto = null;
        String str = null;
        PaymentMethodInfoDto paymentMethodInfoDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                regularAutotopupStatusDto = this.regularAutotopupStatusDtoAdapter.fromJson(jsonReader);
                if (regularAutotopupStatusDto == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                selectedRegularAutotopupOptionDto = this.selectedRegularAutotopupOptionDtoAdapter.fromJson(jsonReader);
                if (selectedRegularAutotopupOptionDto == null) {
                    throw Util.unexpectedNull("selectedOption", "selected_option", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                }
            } else if (selectName == 3 && (paymentMethodInfoDto = this.paymentMethodInfoDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentMethod", "payment_method", jsonReader);
            }
        }
        jsonReader.endObject();
        if (regularAutotopupStatusDto == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (selectedRegularAutotopupOptionDto == null) {
            throw Util.missingProperty("selectedOption", "selected_option", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
        }
        if (paymentMethodInfoDto != null) {
            return new RegularAutoTopupValidationRequest(regularAutotopupStatusDto, selectedRegularAutotopupOptionDto, str, paymentMethodInfoDto);
        }
        throw Util.missingProperty("paymentMethod", "payment_method", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RegularAutoTopupValidationRequest regularAutoTopupValidationRequest) {
        RegularAutoTopupValidationRequest regularAutoTopupValidationRequest2 = regularAutoTopupValidationRequest;
        if (regularAutoTopupValidationRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.regularAutotopupStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupValidationRequest2.getStatus());
        jsonWriter.name("selected_option");
        this.selectedRegularAutotopupOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupValidationRequest2.getSelectedOption());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupValidationRequest2.getAgreementId());
        jsonWriter.name("payment_method");
        this.paymentMethodInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupValidationRequest2.getPaymentMethod());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(RegularAutoTopupValidationRequest)");
    }
}
