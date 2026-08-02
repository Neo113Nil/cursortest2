package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundMoneyDto;", "nullableAutoFundMoneyDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/TextBadgeDto;", "nullableTextBadgeDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.ybsdk.feature.autotopup.internal.network.dto.AutofundDataDtoJsonAdapter, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0143AutofundDataDtoJsonAdapter extends JsonAdapter<C0142AutofundDataDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<AutoFundMoneyDto> nullableAutoFundMoneyDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TextBadgeDto> nullableTextBadgeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(BackendConfig.Restrictions.ENABLED, "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "amount", "info", "title_end_badge");
    private final JsonAdapter<String> stringAdapter;

    public C0143AutofundDataDtoJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, BackendConfig.Restrictions.ENABLED);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableAutoFundMoneyDtoAdapter = moshi.adapter(AutoFundMoneyDto.class, emptySet, "amount");
        this.nullableTextBadgeDtoAdapter = moshi.adapter(TextBadgeDto.class, emptySet, "titleEndBadge");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final C0142AutofundDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        AutoFundMoneyDto autoFundMoneyDto = null;
        String str3 = null;
        TextBadgeDto textBadgeDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    autoFundMoneyDto = this.nullableAutoFundMoneyDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    textBadgeDto = this.nullableTextBadgeDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (str != null) {
            return new C0142AutofundDataDto(booleanValue, str, str2, autoFundMoneyDto, str3, textBadgeDto);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, C0142AutofundDataDto c0142AutofundDataDto) {
        C0142AutofundDataDto c0142AutofundDataDto2 = c0142AutofundDataDto;
        if (c0142AutofundDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(c0142AutofundDataDto2.getEnabled()));
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) c0142AutofundDataDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c0142AutofundDataDto2.getDescription());
        jsonWriter.name("amount");
        this.nullableAutoFundMoneyDtoAdapter.toJson(jsonWriter, (JsonWriter) c0142AutofundDataDto2.getAmount());
        jsonWriter.name("info");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c0142AutofundDataDto2.getInfo());
        jsonWriter.name("title_end_badge");
        this.nullableTextBadgeDtoAdapter.toJson(jsonWriter, (JsonWriter) c0142AutofundDataDto2.getTitleEndBadge());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(AutofundDataDto)");
    }
}
