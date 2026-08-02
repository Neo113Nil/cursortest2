package com.ybsdk.core.common.data.network.dto.cache;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.dac;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/cache/CacheableResponseDtoJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/cache/CacheableResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/cache/MvLayoutInfoDto;", "nullableMvLayoutInfoDtoOfTNullableAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDto;", "mapOfStringDataEntryDtoAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CacheableResponseDtoJsonAdapter<T> extends JsonAdapter<CacheableResponseDto<T>> {
    private final JsonAdapter<Map<String, DataEntryDto>> mapOfStringDataEntryDtoAdapter;
    private final JsonAdapter<MvLayoutInfoDto<T>> nullableMvLayoutInfoDtoOfTNullableAnyAdapter;
    private final JsonReader.Options options;

    public CacheableResponseDtoJsonAdapter(Moshi moshi, Type[] typeArr) {
        if (typeArr.length != 1) {
            dac.e(typeArr.length, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received ");
            throw null;
        }
        this.options = JsonReader.Options.of("layout_info", "common_data");
        ParameterizedType newParameterizedType = Types.newParameterizedType(MvLayoutInfoDto.class, typeArr[0]);
        EmptySet emptySet = EmptySet.a;
        this.nullableMvLayoutInfoDtoOfTNullableAnyAdapter = moshi.adapter(newParameterizedType, emptySet, "layoutInfo");
        this.mapOfStringDataEntryDtoAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, DataEntryDto.class), emptySet, "commonData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        MvLayoutInfoDto<T> mvLayoutInfoDto = null;
        Map<String, DataEntryDto> map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                mvLayoutInfoDto = this.nullableMvLayoutInfoDtoOfTNullableAnyAdapter.fromJson(jsonReader);
            } else if (selectName == 1 && (map = this.mapOfStringDataEntryDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("commonData", "common_data", jsonReader);
            }
        }
        jsonReader.endObject();
        if (map != null) {
            return new CacheableResponseDto(mvLayoutInfoDto, map);
        }
        throw Util.missingProperty("commonData", "common_data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        CacheableResponseDto cacheableResponseDto = (CacheableResponseDto) obj;
        if (cacheableResponseDto == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("layout_info");
        this.nullableMvLayoutInfoDtoOfTNullableAnyAdapter.toJson(jsonWriter, (JsonWriter) cacheableResponseDto.getLayoutInfo());
        jsonWriter.name("common_data");
        this.mapOfStringDataEntryDtoAdapter.toJson(jsonWriter, (JsonWriter) cacheableResponseDto.getCommonData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(CacheableResponseDto)");
    }
}
