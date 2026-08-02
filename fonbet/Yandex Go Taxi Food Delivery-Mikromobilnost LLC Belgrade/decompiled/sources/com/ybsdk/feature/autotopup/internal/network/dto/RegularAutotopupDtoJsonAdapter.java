package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutotopupStatusDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.SelectedRegularAutotopupOptionDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/RegularAutotopupDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/RegularAutotopupDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;", "regularAutotopupStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "paymentMethodInfoDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;", "selectedRegularAutotopupOptionDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutotopupDtoJsonAdapter extends JsonAdapter<RegularAutotopupDto> {
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "payment_method", "selected_option");
    private final JsonAdapter<PaymentMethodInfoDto> paymentMethodInfoDtoAdapter;
    private final JsonAdapter<RegularAutotopupStatusDto> regularAutotopupStatusDtoAdapter;
    private final JsonAdapter<SelectedRegularAutotopupOptionDto> selectedRegularAutotopupOptionDtoAdapter;

    public RegularAutotopupDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.regularAutotopupStatusDtoAdapter = moshi.adapter(RegularAutotopupStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.paymentMethodInfoDtoAdapter = moshi.adapter(PaymentMethodInfoDto.class, emptySet, "paymentMethod");
        this.selectedRegularAutotopupOptionDtoAdapter = moshi.adapter(SelectedRegularAutotopupOptionDto.class, emptySet, "selectedOption");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RegularAutotopupDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RegularAutotopupStatusDto regularAutotopupStatusDto = null;
        PaymentMethodInfoDto paymentMethodInfoDto = null;
        SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto = null;
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
                paymentMethodInfoDto = this.paymentMethodInfoDtoAdapter.fromJson(jsonReader);
                if (paymentMethodInfoDto == null) {
                    throw Util.unexpectedNull("paymentMethod", "payment_method", jsonReader);
                }
            } else if (selectName == 2 && (selectedRegularAutotopupOptionDto = this.selectedRegularAutotopupOptionDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("selectedOption", "selected_option", jsonReader);
            }
        }
        jsonReader.endObject();
        if (regularAutotopupStatusDto == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (paymentMethodInfoDto == null) {
            throw Util.missingProperty("paymentMethod", "payment_method", jsonReader);
        }
        if (selectedRegularAutotopupOptionDto != null) {
            return new RegularAutotopupDto(regularAutotopupStatusDto, paymentMethodInfoDto, selectedRegularAutotopupOptionDto);
        }
        throw Util.missingProperty("selectedOption", "selected_option", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RegularAutotopupDto regularAutotopupDto) {
        RegularAutotopupDto regularAutotopupDto2 = regularAutotopupDto;
        if (regularAutotopupDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.regularAutotopupStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupDto2.getStatus());
        jsonWriter.name("payment_method");
        this.paymentMethodInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupDto2.getPaymentMethod());
        jsonWriter.name("selected_option");
        this.selectedRegularAutotopupOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupDto2.getSelectedOption());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(RegularAutotopupDto)");
    }
}
