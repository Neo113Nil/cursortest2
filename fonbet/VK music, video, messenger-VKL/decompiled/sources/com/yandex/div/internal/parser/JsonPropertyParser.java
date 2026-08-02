package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.izs;

/* loaded from: classes7.dex */
public class JsonPropertyParser {
    @Nullable
    private static JSONObject nullable(@Nullable JSONObject jSONObject) {
        if (jSONObject == null || jSONObject == JSONObject.NULL) {
            return null;
        }
        return jSONObject;
    }

    @Nullable
    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t = (T) jSONObject.opt(str);
        if (t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy<Deserializer<JSONObject, V>> lazy) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject nullable = nullable(optJSONArray.optJSONObject(i));
            if (nullable != null) {
                try {
                    V deserialize = lazy.getValue().deserialize(parsingContext, nullable);
                    if (deserialize != null) {
                        arrayList.add(deserialize);
                    }
                } catch (Exception e) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i, e));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull izs<R, V> izsVar, @NonNull ListValidator<V> listValidator) {
        return readOptionalList(parsingContext, jSONObject, str, izsVar, listValidator, JsonParsers.alwaysValid());
    }

    @Nullable
    public static String readOptionalString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        try {
            return (String) optSafe;
        } catch (ClassCastException unused) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e));
            return null;
        }
    }

    @NonNull
    public static String readString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            return (String) optSafe;
        } catch (ClassCastException unused) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
        } catch (Exception e) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e);
        }
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v) {
        write(parsingContext, jSONObject, str, v, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable List<V> list, @NonNull izs<V, R> izsVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < size; i++) {
            jSONArray.put(izsVar.invoke(list.get(i)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e) {
            parsingContext.getLogger().logError(e);
        }
    }

    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull izs<R, V> izsVar) {
        return (V) read(parsingContext, jSONObject, str, izsVar, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull izs<R, V> izsVar) {
        return (V) readOptional(parsingContext, jSONObject, str, izsVar, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull izs<R, V> izsVar, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                List<V> list = Collections.EMPTY_LIST;
                try {
                    if (listValidator.isValid(list)) {
                        return list;
                    }
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                Object optSafe = optSafe(optJSONArray, i);
                if (optSafe != null) {
                    try {
                        V invoke = izsVar.invoke(optSafe);
                        if (invoke != null) {
                            try {
                                if (valueValidator.isValid(invoke)) {
                                    arrayList.add(invoke);
                                } else {
                                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                                }
                            } catch (ClassCastException unused2) {
                                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                            }
                        }
                    } catch (ClassCastException unused3) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                    } catch (Exception e) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, optSafe, e));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            } catch (ClassCastException unused4) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }

    public static <R, V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v, @NonNull izs<V, R> izsVar) {
        if (v != null) {
            try {
                jSONObject.put(str, izsVar.invoke(v));
            } catch (JSONException e) {
                parsingContext.getLogger().logError(e);
            }
        }
    }

    @Nullable
    private static <T> T optSafe(JSONArray jSONArray, int i) {
        T t = (T) jSONArray.opt(i);
        if (t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull izs<R, V> izsVar, @NonNull ValueValidator<V> valueValidator) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe != null) {
            try {
                V v = (V) izsVar.invoke(optSafe);
                if (v != null) {
                    try {
                        if (valueValidator.isValid(v)) {
                            return v;
                        }
                        throw ParsingExceptionKt.invalidValue(jSONObject, str, v);
                    } catch (ClassCastException unused) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject, str, v);
                    }
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
            } catch (Exception e) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull izs<R, V> izsVar, @NonNull ValueValidator<V> valueValidator) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        try {
            V v = (V) izsVar.invoke(optSafe);
            if (v == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            }
            try {
                if (valueValidator.isValid(v)) {
                    return v;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e));
            return null;
        }
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v, @NonNull Lazy<Serializer<JSONObject, V>> lazy) {
        if (v != null) {
            try {
                jSONObject.put(str, lazy.getValue().serialize(parsingContext, v));
            } catch (JSONException e) {
                parsingContext.getLogger().logError(e);
            }
        }
    }

    public static <V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable List<V> list, @NonNull Lazy<Serializer<JSONObject, V>> lazy) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < size; i++) {
            jSONArray.put(lazy.getValue().serialize(parsingContext, list.get(i)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e) {
            parsingContext.getLogger().logError(e);
        }
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy<Deserializer<JSONObject, V>> lazy, @NonNull ListValidator<V> listValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                List<V> list = Collections.EMPTY_LIST;
                try {
                    if (!listValidator.isValid(list)) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    }
                    return list;
                } catch (ClassCastException unused) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return list;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject nullable = nullable(optJSONArray.optJSONObject(i));
                if (nullable != null) {
                    try {
                        V deserialize = lazy.getValue().deserialize(parsingContext, nullable);
                        if (deserialize != null) {
                            arrayList.add(deserialize);
                        }
                    } catch (Exception e) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i, e));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy<Deserializer<JSONObject, V>> lazy) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return lazy.getValue().deserialize(parsingContext, optJSONObject);
        } catch (Exception e) {
            parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONObject, str, e));
            return null;
        }
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy<Deserializer<JSONObject, V>> lazy) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            try {
                V deserialize = lazy.getValue().deserialize(parsingContext, optJSONObject);
                if (deserialize != null) {
                    return deserialize;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, (Object) null);
            } catch (Exception e) {
                throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy<Deserializer<JSONObject, V>> lazy) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject nullable = nullable(optJSONArray.optJSONObject(i));
            if (nullable != null) {
                try {
                    V deserialize = lazy.getValue().deserialize(parsingContext, nullable);
                    if (deserialize != null) {
                        arrayList.add(deserialize);
                    }
                } catch (Exception e) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i, e));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy<Deserializer<JSONObject, V>> lazy, @NonNull ListValidator<V> listValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                List<V> list = Collections.EMPTY_LIST;
                try {
                    if (listValidator.isValid(list)) {
                        return list;
                    }
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject nullable = nullable(optJSONArray.optJSONObject(i));
                if (nullable != null) {
                    try {
                        V deserialize = lazy.getValue().deserialize(parsingContext, nullable);
                        if (deserialize != null) {
                            arrayList.add(deserialize);
                        }
                    } catch (Exception e) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i, e));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            } catch (ClassCastException unused2) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }
}
