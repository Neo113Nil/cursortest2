package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.internal.Util;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.lang.Enum;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
    final T[] constants;
    final Class<T> enumType;
    final T fallbackValue;
    final String[] nameStrings;
    final JsonReader.Options options;
    final boolean useFallbackValue;

    public EnumJsonAdapter(Class<T> cls, T t, boolean z) {
        this.enumType = cls;
        this.fallbackValue = t;
        this.useFallbackValue = z;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.constants = enumConstants;
            this.nameStrings = new String[enumConstants.length];
            int i = 0;
            while (true) {
                T[] tArr = this.constants;
                if (i >= tArr.length) {
                    this.options = JsonReader.Options.of(this.nameStrings);
                    return;
                } else {
                    String name = tArr[i].name();
                    this.nameStrings[i] = Util.jsonName(name, cls.getField(name));
                    i++;
                }
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    public static <T extends Enum<T>> EnumJsonAdapter<T> create(Class<T> cls) {
        return new EnumJsonAdapter<>(cls, null, false);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader jsonReader) throws IOException {
        int selectString = jsonReader.selectString(this.options);
        if (selectString != -1) {
            return this.constants[selectString];
        }
        String path = jsonReader.getPath();
        if (this.useFallbackValue) {
            if (jsonReader.peek() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                return this.fallbackValue;
            }
            kbs.k("Expected a string but was ", jsonReader.peek(), " at path ", path);
            return null;
        }
        String nextString = jsonReader.nextString();
        StringBuilder sb = new StringBuilder("Expected one of ");
        oyr.D(" but was ", nextString, " at path ", sb, Arrays.asList(this.nameStrings));
        sb.append(path);
        throw new JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, T t) throws IOException {
        if (t != null) {
            jsonWriter.value(this.nameStrings[t.ordinal()]);
        } else {
            ny61.t("value was null! Wrap in .nullSafe() to write nullable values.");
        }
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.enumType.getName() + Extension.C_BRAKE;
    }

    public EnumJsonAdapter<T> withUnknownFallback(T t) {
        return new EnumJsonAdapter<>(this.enumType, t, true);
    }
}
