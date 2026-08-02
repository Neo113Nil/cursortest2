package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferStatusDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;", "transferStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullWidgetDto;", "nullableMe2MeDebitAutoPullWidgetDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitResultDtoJsonAdapter extends JsonAdapter<Me2MeDebitResultDto> {
    private final JsonAdapter<Me2MeDebitAutoPullWidgetDto> nullableMe2MeDebitAutoPullWidgetDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "me2me_debit_auto_pull_widget");
    private final JsonAdapter<TransferStatusDto> transferStatusDtoAdapter;

    public Me2MeDebitResultDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.transferStatusDtoAdapter = moshi.adapter(TransferStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableMe2MeDebitAutoPullWidgetDtoAdapter = moshi.adapter(Me2MeDebitAutoPullWidgetDto.class, emptySet, "widget");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeDebitResultDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TransferStatusDto transferStatusDto = null;
        String str = null;
        String str2 = null;
        Me2MeDebitAutoPullWidgetDto me2MeDebitAutoPullWidgetDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                transferStatusDto = this.transferStatusDtoAdapter.fromJson(jsonReader);
                if (transferStatusDto == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                me2MeDebitAutoPullWidgetDto = this.nullableMe2MeDebitAutoPullWidgetDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (transferStatusDto != null) {
            return new Me2MeDebitResultDto(transferStatusDto, str, str2, me2MeDebitAutoPullWidgetDto);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeDebitResultDto me2MeDebitResultDto) {
        Me2MeDebitResultDto me2MeDebitResultDto2 = me2MeDebitResultDto;
        if (me2MeDebitResultDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.transferStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitResultDto2.getStatus());
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitResultDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitResultDto2.getDescription());
        jsonWriter.name("me2me_debit_auto_pull_widget");
        this.nullableMe2MeDebitAutoPullWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitResultDto2.getWidget());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(Me2MeDebitResultDto)");
    }
}
