package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferHeaderDto;", "transferHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageButtonDto;", "nullableTransferResultPageButtonDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/StatusIconTypeDto;", "nullableStatusIconTypeDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferQuickActionDto;", "nullableListOfTransferQuickActionDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferResultPageDtoJsonAdapter extends JsonAdapter<TransferResultPageDto> {
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<List<TransferQuickActionDto>> nullableListOfTransferQuickActionDtoAdapter;
    private final JsonAdapter<StatusIconTypeDto> nullableStatusIconTypeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonAdapter<TransferResultPageButtonDto> nullableTransferResultPageButtonDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", Constants.KEY_MESSAGE, "image", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "comment", "primary_button", "secondary_button", "status_icon_type", "divkit_widget", "close_action", "quick_actions");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TransferHeaderDto> transferHeaderDtoAdapter;

    public TransferResultPageDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.transferHeaderDtoAdapter = moshi.adapter(TransferHeaderDto.class, emptySet, "header");
        this.stringAdapter = moshi.adapter(String.class, emptySet, Constants.KEY_MESSAGE);
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "comment");
        this.nullableTransferResultPageButtonDtoAdapter = moshi.adapter(TransferResultPageButtonDto.class, emptySet, "primaryButton");
        this.nullableStatusIconTypeDtoAdapter = moshi.adapter(StatusIconTypeDto.class, emptySet, "statusIconType");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitWidget");
        this.nullableListOfTransferQuickActionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, TransferQuickActionDto.class), emptySet, "quickActions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferResultPageDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TransferHeaderDto transferHeaderDto = null;
        String str = null;
        Themes<String> themes = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        TransferResultPageButtonDto transferResultPageButtonDto = null;
        TransferResultPageButtonDto transferResultPageButtonDto2 = null;
        StatusIconTypeDto statusIconTypeDto = null;
        DivDataDto divDataDto = null;
        String str5 = null;
        List<TransferQuickActionDto> list = null;
        while (true) {
            TransferHeaderDto transferHeaderDto2 = transferHeaderDto;
            String str6 = str;
            Themes<String> themes2 = themes;
            if (!jsonReader.hasNext()) {
                String str7 = str2;
                jsonReader.endObject();
                if (transferHeaderDto2 == null) {
                    throw Util.missingProperty("header_", "header", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str3 != null) {
                    return new TransferResultPageDto(transferHeaderDto2, str6, themes2, str7, str3, str4, transferResultPageButtonDto, transferResultPageButtonDto2, statusIconTypeDto, divDataDto, str5, list);
                }
                throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
            }
            String str8 = str2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                case 0:
                    transferHeaderDto = this.transferHeaderDtoAdapter.fromJson(jsonReader);
                    if (transferHeaderDto == null) {
                        throw Util.unexpectedNull("header_", "header", jsonReader);
                    }
                    str2 = str8;
                    str = str6;
                    themes = themes2;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, jsonReader);
                    }
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    themes = themes2;
                case 2:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                case 3:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                case 4:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                case 6:
                    transferResultPageButtonDto = this.nullableTransferResultPageButtonDtoAdapter.fromJson(jsonReader);
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                case 7:
                    transferResultPageButtonDto2 = this.nullableTransferResultPageButtonDtoAdapter.fromJson(jsonReader);
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                case 8:
                    statusIconTypeDto = this.nullableStatusIconTypeDtoAdapter.fromJson(jsonReader);
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                case 9:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                case 10:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                case 11:
                    list = this.nullableListOfTransferQuickActionDtoAdapter.fromJson(jsonReader);
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
                default:
                    str2 = str8;
                    transferHeaderDto = transferHeaderDto2;
                    str = str6;
                    themes = themes2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferResultPageDto transferResultPageDto) {
        TransferResultPageDto transferResultPageDto2 = transferResultPageDto;
        if (transferResultPageDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.transferHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getHeader());
        jsonWriter.name(Constants.KEY_MESSAGE);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getMessage());
        jsonWriter.name("image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getImage());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getDescription());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getComment());
        jsonWriter.name("primary_button");
        this.nullableTransferResultPageButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getPrimaryButton());
        jsonWriter.name("secondary_button");
        this.nullableTransferResultPageButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getSecondaryButton());
        jsonWriter.name("status_icon_type");
        this.nullableStatusIconTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getStatusIconType());
        jsonWriter.name("divkit_widget");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getDivkitWidget());
        jsonWriter.name("close_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getCloseAction());
        jsonWriter.name("quick_actions");
        this.nullableListOfTransferQuickActionDtoAdapter.toJson(jsonWriter, (JsonWriter) transferResultPageDto2.getQuickActions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(TransferResultPageDto)");
    }
}
