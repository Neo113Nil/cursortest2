package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.transfer.version2.api.dto.AgreementPrerequisiteDto;
import com.ybsdk.feature.transfer.version2.api.dto.TransferButtonDto;
import defpackage.gf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AgreementInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AgreementInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "", "Lcom/ybsdk/feature/transfer/version2/api/dto/TransferButtonDto;", "listOfTransferButtonDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/AgreementPrerequisiteDto;", "nullableAgreementPrerequisiteDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SuggestDto;", "nullableListOfSuggestDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AgreementInfoDtoJsonAdapter extends JsonAdapter<AgreementInfoDto> {
    private final JsonAdapter<List<TransferButtonDto>> listOfTransferButtonDtoAdapter;
    private final JsonAdapter<AgreementPrerequisiteDto> nullableAgreementPrerequisiteDtoAdapter;
    private final JsonAdapter<List<SuggestDto>> nullableListOfSuggestDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public AgreementInfoDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = gf91.f;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ gf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("id", "type", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "agreement_sheet_description", "image", "buttons", "prerequisite", "suggests", "action", "on_selected_action", "info_text", new String(bArr2, uza.a), "fee", "info_subtitle");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "themedImage");
        this.listOfTransferButtonDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, TransferButtonDto.class), emptySet, "buttons");
        this.nullableAgreementPrerequisiteDtoAdapter = moshi.adapter(AgreementPrerequisiteDto.class, emptySet, "prerequisite");
        this.nullableListOfSuggestDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SuggestDto.class), emptySet, "suggests");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AgreementInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Themes<String> themes = null;
        List<TransferButtonDto> list = null;
        AgreementPrerequisiteDto agreementPrerequisiteDto = null;
        List<SuggestDto> list2 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            String str12 = str;
            if (!jsonReader.hasNext()) {
                String str13 = str2;
                jsonReader.endObject();
                if (str12 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (list != null) {
                    return new AgreementInfoDto(str12, str13, str3, str4, str5, themes, list, agreementPrerequisiteDto, list2, str6, str7, str8, str9, str10, str11);
                }
                throw Util.missingProperty("buttons", "buttons", jsonReader);
            }
            String str14 = str2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str2 = str14;
                    str = str12;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    str2 = str14;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str12;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str2 = str14;
                    str = str12;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 5:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 6:
                    list = this.listOfTransferButtonDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("buttons", "buttons", jsonReader);
                    }
                    str2 = str14;
                    str = str12;
                case 7:
                    agreementPrerequisiteDto = this.nullableAgreementPrerequisiteDtoAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 8:
                    list2 = this.nullableListOfSuggestDtoAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 11:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 12:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 13:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                case 14:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str14;
                    str = str12;
                default:
                    str2 = str14;
                    str = str12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AgreementInfoDto agreementInfoDto) {
        AgreementInfoDto agreementInfoDto2 = agreementInfoDto;
        if (agreementInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getId());
        jsonWriter.name("type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getType());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getDescription());
        jsonWriter.name("agreement_sheet_description");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getAgreementSheetDescription());
        jsonWriter.name("image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getThemedImage());
        jsonWriter.name("buttons");
        this.listOfTransferButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getButtons());
        jsonWriter.name("prerequisite");
        this.nullableAgreementPrerequisiteDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getPrerequisite());
        jsonWriter.name("suggests");
        this.nullableListOfSuggestDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getSuggests());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getAction());
        jsonWriter.name("on_selected_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getOnSelectedAction());
        jsonWriter.name("info_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getInfoText());
        byte[] bArr = new byte[31];
        for (int i = 0; i < 31; i++) {
            bArr[i] = (byte) (gf91.f[i] ^ gf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getOnNewM2mBankSelectedAction());
        jsonWriter.name("fee");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getFee());
        jsonWriter.name("info_subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) agreementInfoDto2.getInfoSubtitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(AgreementInfoDto)");
    }
}
