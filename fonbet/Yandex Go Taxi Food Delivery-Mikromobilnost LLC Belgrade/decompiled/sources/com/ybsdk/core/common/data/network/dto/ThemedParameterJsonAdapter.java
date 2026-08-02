package com.ybsdk.core.common.data.network.dto;

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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ThemedParameterJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "tNullableAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThemedParameterJsonAdapter<T> extends JsonAdapter<ThemedParameter<T>> {
    private final JsonReader.Options options;
    private final JsonAdapter<T> tNullableAnyAdapter;

    public ThemedParameterJsonAdapter(Moshi moshi, Type[] typeArr) {
        if (typeArr.length != 1) {
            dac.e(typeArr.length, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received ");
            throw null;
        }
        this.options = JsonReader.Options.of("light", "dark");
        this.tNullableAnyAdapter = moshi.adapter(typeArr[0], EmptySet.a, "light");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        T t = null;
        T t2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                t = this.tNullableAnyAdapter.fromJson(jsonReader);
                if (t == null) {
                    throw Util.unexpectedNull("light", "light", jsonReader);
                }
            } else if (selectName == 1 && (t2 = this.tNullableAnyAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("dark", "dark", jsonReader);
            }
        }
        jsonReader.endObject();
        if (t == null) {
            throw Util.missingProperty("light", "light", jsonReader);
        }
        if (t2 != null) {
            return new ThemedParameter(t, t2);
        }
        throw Util.missingProperty("dark", "dark", jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        ThemedParameter themedParameter = (ThemedParameter) obj;
        if (themedParameter == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("light");
        this.tNullableAnyAdapter.toJson(jsonWriter, (JsonWriter) themedParameter.getLight());
        jsonWriter.name("dark");
        this.tNullableAnyAdapter.toJson(jsonWriter, (JsonWriter) themedParameter.getDark());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(ThemedParameter)");
    }
}
