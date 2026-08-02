package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.transfer.utils.domain.dto.CashbackDto;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;", "transferStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;", "transferResultPageDtoAdapter", "", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "nullableListOfAutoTopupWidgetDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "nullableCashbackDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequired3dsDto;", "nullableTransferRequired3dsDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferGetResultDtoJsonAdapter extends JsonAdapter<TransferGetResultDto> {
    private final JsonAdapter<CashbackDto> nullableCashbackDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<List<AutoTopupWidgetDto>> nullableListOfAutoTopupWidgetDtoAdapter;
    private final JsonAdapter<TransferRequired3dsDto> nullableTransferRequired3dsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "result_page", "widgets", "divkit_widget", "cashback", "required_3ds");
    private final JsonAdapter<TransferResultPageDto> transferResultPageDtoAdapter;
    private final JsonAdapter<TransferStatusDto> transferStatusDtoAdapter;

    public TransferGetResultDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.transferStatusDtoAdapter = moshi.adapter(TransferStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.transferResultPageDtoAdapter = moshi.adapter(TransferResultPageDto.class, emptySet, "resultPage");
        this.nullableListOfAutoTopupWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoTopupWidgetDto.class), emptySet, "widgets");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitWidget");
        this.nullableCashbackDtoAdapter = moshi.adapter(CashbackDto.class, emptySet, "cashback");
        this.nullableTransferRequired3dsDtoAdapter = moshi.adapter(TransferRequired3dsDto.class, emptySet, "required3ds");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferGetResultDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TransferStatusDto transferStatusDto = null;
        TransferResultPageDto transferResultPageDto = null;
        List<AutoTopupWidgetDto> list = null;
        DivDataDto divDataDto = null;
        CashbackDto cashbackDto = null;
        TransferRequired3dsDto transferRequired3dsDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    transferStatusDto = this.transferStatusDtoAdapter.fromJson(jsonReader);
                    if (transferStatusDto == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    break;
                case 1:
                    transferResultPageDto = this.transferResultPageDtoAdapter.fromJson(jsonReader);
                    if (transferResultPageDto == null) {
                        throw Util.unexpectedNull("resultPage", "result_page", jsonReader);
                    }
                    break;
                case 2:
                    list = this.nullableListOfAutoTopupWidgetDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    cashbackDto = this.nullableCashbackDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    transferRequired3dsDto = this.nullableTransferRequired3dsDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (transferStatusDto == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (transferResultPageDto != null) {
            return new TransferGetResultDto(transferStatusDto, transferResultPageDto, list, divDataDto, cashbackDto, transferRequired3dsDto);
        }
        throw Util.missingProperty("resultPage", "result_page", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferGetResultDto transferGetResultDto) {
        TransferGetResultDto transferGetResultDto2 = transferGetResultDto;
        if (transferGetResultDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.transferStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) transferGetResultDto2.getStatus());
        jsonWriter.name("result_page");
        this.transferResultPageDtoAdapter.toJson(jsonWriter, (JsonWriter) transferGetResultDto2.getResultPage());
        jsonWriter.name("widgets");
        this.nullableListOfAutoTopupWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) transferGetResultDto2.getWidgets());
        jsonWriter.name("divkit_widget");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) transferGetResultDto2.getDivkitWidget());
        jsonWriter.name("cashback");
        this.nullableCashbackDtoAdapter.toJson(jsonWriter, (JsonWriter) transferGetResultDto2.getCashback());
        jsonWriter.name("required_3ds");
        this.nullableTransferRequired3dsDtoAdapter.toJson(jsonWriter, (JsonWriter) transferGetResultDto2.getRequired3ds());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(TransferGetResultDto)");
    }
}
