package com.ybsdk.feature.qr.payments.internal.network.dto.info;

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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoDtoV3JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoDtoV3;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrcSystemType;", "qrcSystemTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/common/GetPaymentInfoStatusDto;", "getPaymentInfoStatusDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/ProcessingInfoDto;", "nullableProcessingInfoDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/RefreshPageInformationDto;", "nullableRefreshPageInformationDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SberPaymentInfoDto;", "nullableSberPaymentInfoDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrSbpPaymentInfoDto;", "nullableQrSbpPaymentInfoDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPaymentInfoDtoV3JsonAdapter extends JsonAdapter<GetPaymentInfoDtoV3> {
    private final JsonAdapter<GetPaymentInfoStatusDto> getPaymentInfoStatusDtoAdapter;
    private final JsonAdapter<ProcessingInfoDto> nullableProcessingInfoDtoAdapter;
    private final JsonAdapter<QrSbpPaymentInfoDto> nullableQrSbpPaymentInfoDtoAdapter;
    private final JsonAdapter<RefreshPageInformationDto> nullableRefreshPageInformationDtoAdapter;
    private final JsonAdapter<SberPaymentInfoDto> nullableSberPaymentInfoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("qrc_system_type", ACSPConstants.STATUS, "processing_info", "refresh_info", "sber_payment_info", "sbp_payment_info");
    private final JsonAdapter<QrcSystemType> qrcSystemTypeAdapter;

    public GetPaymentInfoDtoV3JsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.qrcSystemTypeAdapter = moshi.adapter(QrcSystemType.class, emptySet, "qrcType");
        this.getPaymentInfoStatusDtoAdapter = moshi.adapter(GetPaymentInfoStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.nullableProcessingInfoDtoAdapter = moshi.adapter(ProcessingInfoDto.class, emptySet, "processingInfo");
        this.nullableRefreshPageInformationDtoAdapter = moshi.adapter(RefreshPageInformationDto.class, emptySet, "refreshInfo");
        this.nullableSberPaymentInfoDtoAdapter = moshi.adapter(SberPaymentInfoDto.class, emptySet, "sberPaymentInfo");
        this.nullableQrSbpPaymentInfoDtoAdapter = moshi.adapter(QrSbpPaymentInfoDto.class, emptySet, "sbpPaymentInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetPaymentInfoDtoV3 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        QrcSystemType qrcSystemType = null;
        GetPaymentInfoStatusDto getPaymentInfoStatusDto = null;
        ProcessingInfoDto processingInfoDto = null;
        RefreshPageInformationDto refreshPageInformationDto = null;
        SberPaymentInfoDto sberPaymentInfoDto = null;
        QrSbpPaymentInfoDto qrSbpPaymentInfoDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    qrcSystemType = this.qrcSystemTypeAdapter.fromJson(jsonReader);
                    if (qrcSystemType == null) {
                        throw Util.unexpectedNull("qrcType", "qrc_system_type", jsonReader);
                    }
                    break;
                case 1:
                    getPaymentInfoStatusDto = this.getPaymentInfoStatusDtoAdapter.fromJson(jsonReader);
                    if (getPaymentInfoStatusDto == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    break;
                case 2:
                    processingInfoDto = this.nullableProcessingInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    refreshPageInformationDto = this.nullableRefreshPageInformationDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    sberPaymentInfoDto = this.nullableSberPaymentInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    qrSbpPaymentInfoDto = this.nullableQrSbpPaymentInfoDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (qrcSystemType == null) {
            throw Util.missingProperty("qrcType", "qrc_system_type", jsonReader);
        }
        if (getPaymentInfoStatusDto != null) {
            return new GetPaymentInfoDtoV3(qrcSystemType, getPaymentInfoStatusDto, processingInfoDto, refreshPageInformationDto, sberPaymentInfoDto, qrSbpPaymentInfoDto);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetPaymentInfoDtoV3 getPaymentInfoDtoV3) {
        GetPaymentInfoDtoV3 getPaymentInfoDtoV32 = getPaymentInfoDtoV3;
        if (getPaymentInfoDtoV32 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("qrc_system_type");
        this.qrcSystemTypeAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDtoV32.getQrcType());
        jsonWriter.name(ACSPConstants.STATUS);
        this.getPaymentInfoStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDtoV32.getStatus());
        jsonWriter.name("processing_info");
        this.nullableProcessingInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDtoV32.getProcessingInfo());
        jsonWriter.name("refresh_info");
        this.nullableRefreshPageInformationDtoAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDtoV32.getRefreshInfo());
        jsonWriter.name("sber_payment_info");
        this.nullableSberPaymentInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDtoV32.getSberPaymentInfo());
        jsonWriter.name("sbp_payment_info");
        this.nullableQrSbpPaymentInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoDtoV32.getSbpPaymentInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(GetPaymentInfoDtoV3)");
    }
}
