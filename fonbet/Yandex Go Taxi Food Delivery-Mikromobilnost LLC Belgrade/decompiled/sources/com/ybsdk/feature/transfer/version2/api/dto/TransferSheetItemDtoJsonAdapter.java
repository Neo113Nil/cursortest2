package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/TransferSheetItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/TransferSheetItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "nullableSelfTransferPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "nullableSelfTopupPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "nullableMe2MeTopupPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;", "nullableAftTopupPayloadDtoAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferSheetItemDtoJsonAdapter extends JsonAdapter<TransferSheetItemDto> {
    private final JsonAdapter<AftTopupPayloadDto> nullableAftTopupPayloadDtoAdapter;
    private final JsonAdapter<Me2MeTopupPayloadDto> nullableMe2MeTopupPayloadDtoAdapter;
    private final JsonAdapter<SelfTopupPayloadDto> nullableSelfTopupPayloadDtoAdapter;
    private final JsonAdapter<SelfTransferPayloadDto> nullableSelfTransferPayloadDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "action", "on_selected_action", "self_transfer_payload", "self_topup_payload", "me2me_topup_payload", "aft_topup_payload");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public TransferSheetItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "themedImage");
        this.nullableSelfTransferPayloadDtoAdapter = moshi.adapter(SelfTransferPayloadDto.class, emptySet, "selfTransferPayload");
        this.nullableSelfTopupPayloadDtoAdapter = moshi.adapter(SelfTopupPayloadDto.class, emptySet, "selfTopupPayload");
        this.nullableMe2MeTopupPayloadDtoAdapter = moshi.adapter(Me2MeTopupPayloadDto.class, emptySet, "me2meTopupPayload");
        this.nullableAftTopupPayloadDtoAdapter = moshi.adapter(AftTopupPayloadDto.class, emptySet, "aftTopupPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferSheetItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Themes<String> themes = null;
        String str4 = null;
        String str5 = null;
        SelfTransferPayloadDto selfTransferPayloadDto = null;
        SelfTopupPayloadDto selfTopupPayloadDto = null;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto = null;
        AftTopupPayloadDto aftTopupPayloadDto = null;
        while (jsonReader.hasNext()) {
            String str6 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("themedImage", "image", jsonReader);
                    }
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    selfTransferPayloadDto = this.nullableSelfTransferPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    selfTopupPayloadDto = this.nullableSelfTopupPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    me2MeTopupPayloadDto = this.nullableMe2MeTopupPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    aftTopupPayloadDto = this.nullableAftTopupPayloadDtoAdapter.fromJson(jsonReader);
                    break;
            }
            str = str6;
        }
        String str7 = str;
        jsonReader.endObject();
        if (str7 == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (themes != null) {
            return new TransferSheetItemDto(str7, str2, str3, themes, str4, str5, selfTransferPayloadDto, selfTopupPayloadDto, me2MeTopupPayloadDto, aftTopupPayloadDto);
        }
        throw Util.missingProperty("themedImage", "image", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferSheetItemDto transferSheetItemDto) {
        TransferSheetItemDto transferSheetItemDto2 = transferSheetItemDto;
        if (transferSheetItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getDescription());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getThemedImage());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getAction());
        jsonWriter.name("on_selected_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getOnSelectedAction());
        jsonWriter.name("self_transfer_payload");
        this.nullableSelfTransferPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getSelfTransferPayload());
        jsonWriter.name("self_topup_payload");
        this.nullableSelfTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getSelfTopupPayload());
        jsonWriter.name("me2me_topup_payload");
        this.nullableMe2MeTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getMe2meTopupPayload());
        jsonWriter.name("aft_topup_payload");
        this.nullableAftTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferSheetItemDto2.getAftTopupPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(TransferSheetItemDto)");
    }
}
