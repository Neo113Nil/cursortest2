package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.qr.payments.internal.network.common.GetPaymentInfoStatusDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/qr/payments/internal/network/common/GetPaymentInfoStatusDto;", "getPaymentInfoStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RefreshPageInfoDto;", "nullableRefreshPageInfoDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/SuccessInfoDto;", "nullableSuccessInfoDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RedirectInfoDto;", "nullableRedirectInfoDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPaymentInfoDtoJsonAdapter extends JsonAdapter<GetPaymentInfoDto> {
    private final JsonAdapter<GetPaymentInfoStatusDto> getPaymentInfoStatusDtoAdapter;
    private final JsonAdapter<RedirectInfoDto> nullableRedirectInfoDtoAdapter;
    private final JsonAdapter<RefreshPageInfoDto> nullableRefreshPageInfoDtoAdapter;
    private final JsonAdapter<SuccessInfoDto> nullableSuccessInfoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "refresh_info", "success_info", "redirect_info");

    public GetPaymentInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.getPaymentInfoStatusDtoAdapter = moshi.adapter(GetPaymentInfoStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.nullableRefreshPageInfoDtoAdapter = moshi.adapter(RefreshPageInfoDto.class, emptySet, "refreshInfo");
        this.nullableSuccessInfoDtoAdapter = moshi.adapter(SuccessInfoDto.class, emptySet, "successInfo");
        this.nullableRedirectInfoDtoAdapter = moshi.adapter(RedirectInfoDto.class, emptySet, "redirectInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetPaymentInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        GetPaymentInfoStatusDto getPaymentInfoStatusDto = null;
        RefreshPageInfoDto refreshPageInfoDto = null;
        SuccessInfoDto successInfoDto = null;
        RedirectInfoDto redirectInfoDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                getPaymentInfoStatusDto = this.getPaymentInfoStatusDtoAdapter.fromJson(jsonReader);
                if (getPaymentInfoStatusDto == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                refreshPageInfoDto = this.nullableRefreshPageInfoDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                successInfoDto = this.nullableSuccessInfoDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                redirectInfoDto = this.nullableRedirectInfoDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (getPaymentInfoStatusDto != null) {
            return new GetPaymentInfoDto(getPaymentInfoStatusDto, refreshPageInfoDto, successInfoDto, redirectInfoDto);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetPaymentInfoDto getPaymentInfoDto) {
        GetPaymentInfoDto getPaymentInfoDto2 = getPaymentInfoDto;
        if (getPaymentInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.getPaymentInfoStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDto2.getStatus());
        jsonWriter.name("refresh_info");
        this.nullableRefreshPageInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDto2.getRefreshInfo());
        jsonWriter.name("success_info");
        this.nullableSuccessInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDto2.getSuccessInfo());
        jsonWriter.name("redirect_info");
        this.nullableRedirectInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDto2.getRedirectInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(GetPaymentInfoDto)");
    }
}
