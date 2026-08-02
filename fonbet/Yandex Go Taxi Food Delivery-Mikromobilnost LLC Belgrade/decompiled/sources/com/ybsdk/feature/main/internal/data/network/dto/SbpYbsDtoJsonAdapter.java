package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.cg91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/SbpYbsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/SbpYbsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/feature/main/internal/data/network/dto/SbpYbYBPayloadDto;", "nullableSbpYbYBPayloadDtoAdapter", "Lcom/ybsdk/feature/main/internal/data/network/dto/BindAccountSheetOverridesDto;", "nullableBindAccountSheetOverridesDtoAdapter", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbpYbsDtoJsonAdapter extends JsonAdapter<SbpYbsDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<BindAccountSheetOverridesDto> nullableBindAccountSheetOverridesDtoAdapter;
    private final JsonAdapter<SbpYbYBPayloadDto> nullableSbpYbYBPayloadDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public SbpYbsDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = cg91.e;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ cg91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("is_enabled", "nspk_id", "title", "subtitle", "image", new String(bArr2, uza.a), "bind_account_sheet_overrides");
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "nspkId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
        this.nullableSbpYbYBPayloadDtoAdapter = moshi.adapter(SbpYbYBPayloadDto.class, emptySet, "ybPayload");
        this.nullableBindAccountSheetOverridesDtoAdapter = moshi.adapter(BindAccountSheetOverridesDto.class, emptySet, "bindAccountSheetOverrides");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SbpYbsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Themes<String> themes = null;
        SbpYbYBPayloadDto sbpYbYBPayloadDto = null;
        BindAccountSheetOverridesDto bindAccountSheetOverridesDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("nspkId", "nspk_id", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    break;
                case 5:
                    sbpYbYBPayloadDto = this.nullableSbpYbYBPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bindAccountSheetOverridesDto = this.nullableBindAccountSheetOverridesDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (str == null) {
            throw Util.missingProperty("nspkId", "nspk_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (themes != null) {
            return new SbpYbsDto(booleanValue, str, str2, str3, themes, sbpYbYBPayloadDto, bindAccountSheetOverridesDto);
        }
        throw Util.missingProperty("image", "image", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SbpYbsDto sbpYbsDto) {
        SbpYbsDto sbpYbsDto2 = sbpYbsDto;
        if (sbpYbsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(sbpYbsDto2.isEnabled()));
        jsonWriter.name("nspk_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) sbpYbsDto2.getNspkId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) sbpYbsDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) sbpYbsDto2.getSubtitle());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) sbpYbsDto2.getImage());
        byte[] bArr = new byte[19];
        for (int i = 0; i < 19; i++) {
            bArr[i] = (byte) (cg91.e[i] ^ cg91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.nullableSbpYbYBPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) sbpYbsDto2.getYbPayload());
        jsonWriter.name("bind_account_sheet_overrides");
        this.nullableBindAccountSheetOverridesDtoAdapter.toJson(jsonWriter, (JsonWriter) sbpYbsDto2.getBindAccountSheetOverrides());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(SbpYbsDto)");
    }
}
