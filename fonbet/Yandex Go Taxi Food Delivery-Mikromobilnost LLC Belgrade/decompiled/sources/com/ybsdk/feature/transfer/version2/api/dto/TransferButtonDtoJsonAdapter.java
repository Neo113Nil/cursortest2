package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/TransferButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/TransferButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "nullableSelfTransferPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "nullableSelfTopupPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/BottomSheetPayloadDto;", "nullableBottomSheetPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/SectionsSheetPayloadDto;", "nullableSectionsSheetPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesPersonTransferPayloadDto;", "nullableRequisitesPersonTransferPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalTransferPayloadDto;", "nullableRequisitesLegalTransferPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferPayloadDto;", "nullableRequisitesHcsTransferPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "nullableMe2MeTopupPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;", "nullableAftTopupPayloadDtoAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferButtonDtoJsonAdapter extends JsonAdapter<TransferButtonDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<AftTopupPayloadDto> nullableAftTopupPayloadDtoAdapter;
    private final JsonAdapter<BottomSheetPayloadDto> nullableBottomSheetPayloadDtoAdapter;
    private final JsonAdapter<Me2MeTopupPayloadDto> nullableMe2MeTopupPayloadDtoAdapter;
    private final JsonAdapter<RequisitesHcsTransferPayloadDto> nullableRequisitesHcsTransferPayloadDtoAdapter;
    private final JsonAdapter<RequisitesLegalTransferPayloadDto> nullableRequisitesLegalTransferPayloadDtoAdapter;
    private final JsonAdapter<RequisitesPersonTransferPayloadDto> nullableRequisitesPersonTransferPayloadDtoAdapter;
    private final JsonAdapter<SectionsSheetPayloadDto> nullableSectionsSheetPayloadDtoAdapter;
    private final JsonAdapter<SelfTopupPayloadDto> nullableSelfTopupPayloadDtoAdapter;
    private final JsonAdapter<SelfTransferPayloadDto> nullableSelfTransferPayloadDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "title", "type", "is_comment_field_enabled", "hint", "image", BackendConfig.Restrictions.ENABLED, "action", "self_transfer_payload", "self_topup_payload", "items_sheet_payload", "sections_sheet_payload", "requisites_person_transfer_payload", "requisites_legal_transfer_payload", "requisites_hcs_transfer_payload", "me2me_topup_payload", "aft_topup_payload");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public TransferButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "transferType");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isCommentFieldEnabled");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "themedImage");
        this.nullableSelfTransferPayloadDtoAdapter = moshi.adapter(SelfTransferPayloadDto.class, emptySet, "selfTransferPayload");
        this.nullableSelfTopupPayloadDtoAdapter = moshi.adapter(SelfTopupPayloadDto.class, emptySet, "selfTopupPayload");
        this.nullableBottomSheetPayloadDtoAdapter = moshi.adapter(BottomSheetPayloadDto.class, emptySet, "itemsSheetPayload");
        this.nullableSectionsSheetPayloadDtoAdapter = moshi.adapter(SectionsSheetPayloadDto.class, emptySet, "sectionsSheetPayload");
        this.nullableRequisitesPersonTransferPayloadDtoAdapter = moshi.adapter(RequisitesPersonTransferPayloadDto.class, emptySet, "requisitesPersonTransferPayload");
        this.nullableRequisitesLegalTransferPayloadDtoAdapter = moshi.adapter(RequisitesLegalTransferPayloadDto.class, emptySet, "requisitesLegalTransferPayload");
        this.nullableRequisitesHcsTransferPayloadDtoAdapter = moshi.adapter(RequisitesHcsTransferPayloadDto.class, emptySet, "requisitesHcsTransferPayload");
        this.nullableMe2MeTopupPayloadDtoAdapter = moshi.adapter(Me2MeTopupPayloadDto.class, emptySet, "me2meTopupPayload");
        this.nullableAftTopupPayloadDtoAdapter = moshi.adapter(AftTopupPayloadDto.class, emptySet, "aftTopupPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Themes<String> themes = null;
        String str5 = null;
        SelfTransferPayloadDto selfTransferPayloadDto = null;
        SelfTopupPayloadDto selfTopupPayloadDto = null;
        BottomSheetPayloadDto bottomSheetPayloadDto = null;
        SectionsSheetPayloadDto sectionsSheetPayloadDto = null;
        RequisitesPersonTransferPayloadDto requisitesPersonTransferPayloadDto = null;
        RequisitesLegalTransferPayloadDto requisitesLegalTransferPayloadDto = null;
        RequisitesHcsTransferPayloadDto requisitesHcsTransferPayloadDto = null;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto = null;
        AftTopupPayloadDto aftTopupPayloadDto = null;
        while (true) {
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            if (!jsonReader.hasNext()) {
                String str9 = str4;
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (bool3 == null) {
                    throw Util.missingProperty("isCommentFieldEnabled", "is_comment_field_enabled", jsonReader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (themes == null) {
                    throw Util.missingProperty("themedImage", "image", jsonReader);
                }
                if (bool4 != null) {
                    return new TransferButtonDto(str6, str7, str8, booleanValue, str9, themes, bool4.booleanValue(), str5, selfTransferPayloadDto, selfTopupPayloadDto, bottomSheetPayloadDto, sectionsSheetPayloadDto, requisitesPersonTransferPayloadDto, requisitesLegalTransferPayloadDto, requisitesHcsTransferPayloadDto, me2MeTopupPayloadDto, aftTopupPayloadDto);
                }
                throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
            }
            String str10 = str4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str3 = str8;
                    str4 = str10;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str4 = str10;
                case 3:
                    Boolean fromJson = this.booleanAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("isCommentFieldEnabled", "is_comment_field_enabled", jsonReader);
                    }
                    bool = fromJson;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 5:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("themedImage", "image", jsonReader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                    }
                    bool = bool3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 8:
                    selfTransferPayloadDto = this.nullableSelfTransferPayloadDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 9:
                    selfTopupPayloadDto = this.nullableSelfTopupPayloadDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 10:
                    bottomSheetPayloadDto = this.nullableBottomSheetPayloadDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 11:
                    sectionsSheetPayloadDto = this.nullableSectionsSheetPayloadDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 12:
                    requisitesPersonTransferPayloadDto = this.nullableRequisitesPersonTransferPayloadDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 13:
                    requisitesLegalTransferPayloadDto = this.nullableRequisitesLegalTransferPayloadDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 14:
                    requisitesHcsTransferPayloadDto = this.nullableRequisitesHcsTransferPayloadDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 15:
                    me2MeTopupPayloadDto = this.nullableMe2MeTopupPayloadDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                case 16:
                    aftTopupPayloadDto = this.nullableAftTopupPayloadDtoAdapter.fromJson(jsonReader);
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
                default:
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str10;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferButtonDto transferButtonDto) {
        TransferButtonDto transferButtonDto2 = transferButtonDto;
        if (transferButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getTitle());
        jsonWriter.name("type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getTransferType());
        jsonWriter.name("is_comment_field_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(transferButtonDto2.isCommentFieldEnabled()));
        jsonWriter.name("hint");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getHint());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getThemedImage());
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(transferButtonDto2.getEnabled()));
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getAction());
        jsonWriter.name("self_transfer_payload");
        this.nullableSelfTransferPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getSelfTransferPayload());
        jsonWriter.name("self_topup_payload");
        this.nullableSelfTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getSelfTopupPayload());
        jsonWriter.name("items_sheet_payload");
        this.nullableBottomSheetPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getItemsSheetPayload());
        jsonWriter.name("sections_sheet_payload");
        this.nullableSectionsSheetPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getSectionsSheetPayload());
        jsonWriter.name("requisites_person_transfer_payload");
        this.nullableRequisitesPersonTransferPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getRequisitesPersonTransferPayload());
        jsonWriter.name("requisites_legal_transfer_payload");
        this.nullableRequisitesLegalTransferPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getRequisitesLegalTransferPayload());
        jsonWriter.name("requisites_hcs_transfer_payload");
        this.nullableRequisitesHcsTransferPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getRequisitesHcsTransferPayload());
        jsonWriter.name("me2me_topup_payload");
        this.nullableMe2MeTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getMe2meTopupPayload());
        jsonWriter.name("aft_topup_payload");
        this.nullableAftTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) transferButtonDto2.getAftTopupPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(TransferButtonDto)");
    }
}
