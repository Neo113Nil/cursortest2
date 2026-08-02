package com.yandex.quark.platform.utils.json;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.jl40;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;

/* loaded from: classes8.dex */
public final class DoubleJsonAdapterFactory implements JsonAdapter.Factory {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/quark/platform/utils/json/DoubleJsonAdapterFactory$DoubleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "<init>", "()V", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DoubleJsonAdapter extends JsonAdapter<Double> {
        @Override // com.squareup.moshi.JsonAdapter
        public final Double fromJson(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(JsonWriter jsonWriter, Double d) {
            Double d2 = d;
            if (d2 == null) {
                jsonWriter.nullValue();
                return;
            }
            double doubleValue = d2.doubleValue() % 1.0d;
            Number number = d2;
            if (doubleValue == 0.0d) {
                number = Long.valueOf((long) d2.doubleValue());
            }
            jsonWriter.value(number);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        Class<?> rawType = Types.getRawType(type);
        if (set.isEmpty() && jl40.l(rawType, Double.class)) {
            return new DoubleJsonAdapter();
        }
        return null;
    }
}
