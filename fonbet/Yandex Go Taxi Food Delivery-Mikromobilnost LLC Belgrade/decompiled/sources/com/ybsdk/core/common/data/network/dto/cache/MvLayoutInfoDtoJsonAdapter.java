package com.ybsdk.core.common.data.network.dto.cache;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.dac;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/cache/MvLayoutInfoDtoJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/cache/MvLayoutInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "tNullableAnyAdapter", "", "intAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MvLayoutInfoDtoJsonAdapter<T> extends JsonAdapter<MvLayoutInfoDto<T>> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<T> tNullableAnyAdapter;

    public MvLayoutInfoDtoJsonAdapter(Moshi moshi, Type[] typeArr) {
        if (typeArr.length != 1) {
            dac.e(typeArr.length, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received ");
            throw null;
        }
        this.options = JsonReader.Options.of("ttl", "hash", "info", "version");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "ttl");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "hash");
        this.tNullableAnyAdapter = moshi.adapter(typeArr[0], emptySet, "info");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "version");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Integer num = null;
        String str = null;
        T t = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("ttl", "ttl", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("hash", "hash", jsonReader);
                }
            } else if (selectName == 2) {
                t = this.tNullableAnyAdapter.fromJson(jsonReader);
                if (t == null) {
                    throw Util.unexpectedNull("info", "info", jsonReader);
                }
            } else if (selectName == 3 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("version", "version", jsonReader);
            }
        }
        jsonReader.endObject();
        Integer num2 = num;
        if (l == null) {
            throw Util.missingProperty("ttl", "ttl", jsonReader);
        }
        long longValue = l.longValue();
        if (str == null) {
            throw Util.missingProperty("hash", "hash", jsonReader);
        }
        if (t == null) {
            throw Util.missingProperty("info", "info", jsonReader);
        }
        if (num2 != null) {
            return new MvLayoutInfoDto(longValue, str, t, num2.intValue());
        }
        throw Util.missingProperty("version", "version", jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        MvLayoutInfoDto mvLayoutInfoDto = (MvLayoutInfoDto) obj;
        if (mvLayoutInfoDto == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ttl");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(mvLayoutInfoDto.getTtl()));
        jsonWriter.name("hash");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) mvLayoutInfoDto.getHash());
        jsonWriter.name("info");
        this.tNullableAnyAdapter.toJson(jsonWriter, (JsonWriter) mvLayoutInfoDto.getInfo());
        jsonWriter.name("version");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(mvLayoutInfoDto.getVersion()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(MvLayoutInfoDto)");
    }
}
