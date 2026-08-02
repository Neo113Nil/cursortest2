package com.ybsdk.feature.autotopup.internal.domain.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import defpackage.giq0;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/RegularAutotopupStatusEntity;", "regularAutotopupStatusEntityAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "paymentMethodInfoDtoAdapter", "Lgiq0;", "selectedRegularAutotopupOptionEntityAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutotopupEntityJsonAdapter extends JsonAdapter<RegularAutotopupEntity> {
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "paymentMethod", "selectedOption");
    private final JsonAdapter<PaymentMethodInfoDto> paymentMethodInfoDtoAdapter;
    private final JsonAdapter<RegularAutotopupStatusEntity> regularAutotopupStatusEntityAdapter;
    private final JsonAdapter<giq0> selectedRegularAutotopupOptionEntityAdapter;

    public RegularAutotopupEntityJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.regularAutotopupStatusEntityAdapter = moshi.adapter(RegularAutotopupStatusEntity.class, emptySet, ACSPConstants.STATUS);
        this.paymentMethodInfoDtoAdapter = moshi.adapter(PaymentMethodInfoDto.class, emptySet, "paymentMethod");
        this.selectedRegularAutotopupOptionEntityAdapter = moshi.adapter(giq0.class, emptySet, "selectedOption");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RegularAutotopupEntity fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RegularAutotopupStatusEntity regularAutotopupStatusEntity = null;
        PaymentMethodInfoDto paymentMethodInfoDto = null;
        giq0 giq0Var = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                regularAutotopupStatusEntity = this.regularAutotopupStatusEntityAdapter.fromJson(jsonReader);
                if (regularAutotopupStatusEntity == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                paymentMethodInfoDto = this.paymentMethodInfoDtoAdapter.fromJson(jsonReader);
                if (paymentMethodInfoDto == null) {
                    throw Util.unexpectedNull("paymentMethod", "paymentMethod", jsonReader);
                }
            } else if (selectName == 2 && (giq0Var = this.selectedRegularAutotopupOptionEntityAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("selectedOption", "selectedOption", jsonReader);
            }
        }
        jsonReader.endObject();
        if (regularAutotopupStatusEntity == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (paymentMethodInfoDto == null) {
            throw Util.missingProperty("paymentMethod", "paymentMethod", jsonReader);
        }
        if (giq0Var != null) {
            return new RegularAutotopupEntity(regularAutotopupStatusEntity, paymentMethodInfoDto, giq0Var);
        }
        throw Util.missingProperty("selectedOption", "selectedOption", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RegularAutotopupEntity regularAutotopupEntity) {
        RegularAutotopupEntity regularAutotopupEntity2 = regularAutotopupEntity;
        if (regularAutotopupEntity2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.regularAutotopupStatusEntityAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupEntity2.getStatus());
        jsonWriter.name("paymentMethod");
        this.paymentMethodInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupEntity2.getPaymentMethod());
        jsonWriter.name("selectedOption");
        this.selectedRegularAutotopupOptionEntityAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupEntity2.getSelectedOption());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(RegularAutotopupEntity)");
    }
}
