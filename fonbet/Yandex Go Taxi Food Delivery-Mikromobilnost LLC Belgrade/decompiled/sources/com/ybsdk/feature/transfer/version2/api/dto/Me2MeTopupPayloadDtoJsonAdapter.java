package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.kf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/AutoTopupWidgetDto;", "nullableAutoTopupWidgetDtoAdapter", "nullableStringAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeTopupPayloadDtoJsonAdapter extends JsonAdapter<Me2MeTopupPayloadDto> {
    private final JsonAdapter<AutoTopupWidgetDto> nullableAutoTopupWidgetDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public Me2MeTopupPayloadDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = kf91.c;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ kf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "description_spoiler_enabled", "image", new String(bArr2, uza.a), "autotopup_widget_data", "on_m2m_selected_action");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "descriptionSpoilerEnabled");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
        this.nullableAutoTopupWidgetDtoAdapter = moshi.adapter(AutoTopupWidgetDto.class, emptySet, "autoTopupWidgetData");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "onM2mSelectedAction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeTopupPayloadDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        Themes<String> themes = null;
        String str3 = null;
        AutoTopupWidgetDto autoTopupWidgetDto = null;
        String str4 = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = kf91.a;
            byte[] bArr2 = kf91.c;
            if (!hasNext) {
                jsonReader.endObject();
                if (str == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (themes == null) {
                    throw Util.missingProperty("image", "image", jsonReader);
                }
                if (str3 != null) {
                    return new Me2MeTopupPayloadDto(str, str2, bool, themes, str3, autoTopupWidgetDto, str4);
                }
                byte[] bArr3 = new byte[7];
                for (int i = 0; i < 7; i++) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                }
                throw Util.missingProperty("ybId", new String(bArr3, uza.a), jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    break;
                case 4:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        byte[] bArr4 = new byte[7];
                        int i2 = 0;
                        for (int i3 = 7; i2 < i3; i3 = 7) {
                            bArr4[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                            i2++;
                        }
                        throw Util.unexpectedNull("ybId", new String(bArr4, uza.a), jsonReader);
                    }
                    break;
                case 5:
                    autoTopupWidgetDto = this.nullableAutoTopupWidgetDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeTopupPayloadDto me2MeTopupPayloadDto) {
        Me2MeTopupPayloadDto me2MeTopupPayloadDto2 = me2MeTopupPayloadDto;
        if (me2MeTopupPayloadDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupPayloadDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupPayloadDto2.getDescription());
        jsonWriter.name("description_spoiler_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupPayloadDto2.getDescriptionSpoilerEnabled());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupPayloadDto2.getImage());
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (kf91.c[i] ^ kf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupPayloadDto2.getYbId());
        jsonWriter.name("autotopup_widget_data");
        this.nullableAutoTopupWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupPayloadDto2.getAutoTopupWidgetData());
        jsonWriter.name("on_m2m_selected_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupPayloadDto2.getOnM2mSelectedAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(Me2MeTopupPayloadDto)");
    }
}
