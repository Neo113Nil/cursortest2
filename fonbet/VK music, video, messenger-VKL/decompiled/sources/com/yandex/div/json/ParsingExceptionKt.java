package com.yandex.div.json;

import com.yandex.div.internal.util.JsonArray;
import com.yandex.div.internal.util.JsonObject;
import com.yandex.div.internal.util.JsonUtilsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.erm0;
import xsna.go9;
import xsna.gq;
import xsna.h5s;
import xsna.ho8;
import xsna.i5s;
import xsna.ji;
import xsna.k73;
import xsna.kh10;
import xsna.n6j;
import xsna.nyh0;
import xsna.ss9;
import xsna.t33;
import xsna.xe9;
import xsna.zr;

/* compiled from: ParsingException.kt */
/* loaded from: classes7.dex */
public final class ParsingExceptionKt {
    private static final ParsingException SILENT_PARSING_EXCEPTION = new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "", null, null, null, 28, null);

    public static final ParsingException dependencyFailed(JSONObject jSONObject, String str, ParsingException parsingException) {
        return dependencyFailed(jSONObject, str, (Exception) parsingException);
    }

    public static final ParsingException getSILENT_PARSING_EXCEPTION() {
        return SILENT_PARSING_EXCEPTION;
    }

    public static final <T> ParsingException invalidValue(JSONObject jSONObject, String str, T t) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, h5s.d(new StringBuilder("Value '"), trimLength(t), "' for key '", str, "' is not valid"), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static final ParsingException missingValue(JSONObject jSONObject, String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, zr.a("Value for key '", str, "' is missing"), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static final ParsingException missingVariable(String str, String str2, String str3, Throwable th) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, ho8.a(xe9.a("Undefined variable '", str3, "' at \"", str, "\": \""), str2, '\"'), th, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException missingVariable$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return missingVariable(str, th);
    }

    public static final <T> ParsingException resolveFailed(String str, T t, Throwable th) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, h5s.d(new StringBuilder("Value '"), trimLength(t), "' for key '", str, "' could not be resolved"), th, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException resolveFailed$default(String str, Object obj, Throwable th, int i, Object obj2) {
        if ((i & 4) != 0) {
            th = null;
        }
        return resolveFailed(str, obj, th);
    }

    public static final ParsingException templateNotFound(JSONObject jSONObject, String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_TEMPLATE, zr.a("Template '", str, "' is missing!"), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    private static final String trimLength(Object obj) {
        String valueOf = String.valueOf(obj);
        return valueOf.length() > 100 ? erm0.D0(97, valueOf).concat("...") : valueOf;
    }

    public static final ParsingException typeMismatch(JSONObject jSONObject, String str, Object obj) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        StringBuilder a = t33.a("Value for key '", str, "' has wrong type ");
        a.append(obj.getClass().getName());
        return new ParsingException(parsingExceptionReason, a.toString(), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static /* synthetic */ ParsingException typeMismatch$default(String str, String str2, Object obj, Throwable th, int i, Object obj2) {
        if ((i & 8) != 0) {
            th = null;
        }
        return typeMismatch(str, str2, obj, th);
    }

    public static final ParsingException dependencyFailed(JSONObject jSONObject, String str, Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, zr.a("Value for key '", str, "' is failed to create"), exc, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null));
    }

    public static final ParsingException invalidValue(String str, String str2, Object obj, Throwable th) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, k73.c(xe9.a("Field '", str, "' with expression '", str2, "' received wrong value: '"), obj, '\''), th, null, null, 24, null);
    }

    public static final ParsingException missingValue(String str, String str2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, ss9.a("Value for key '", str, "' at path '", str2, "' is missing"), null, null, null, 28, null);
    }

    public static final ParsingException typeMismatch(JSONArray jSONArray, String str, int i, Object obj) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        StringBuilder a = kh10.a(i, "Value at ", " position of '", str, "' has wrong type ");
        a.append(obj.getClass().getName());
        return new ParsingException(parsingExceptionReason, a.toString(), null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    public static final ParsingException dependencyFailed(JSONArray jSONArray, String str, int i, Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, gq.b(i, "Value at ", " position of '", str, "' is failed to create"), exc, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null));
    }

    public static final ParsingException missingVariable(String str, Throwable th) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, go9.b("No variable could be resolved for '", str), th, null, null, 24, null);
    }

    public static final ParsingException typeMismatch(String str, String str2, Object obj, Throwable th) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, k73.c(xe9.a("Expression '", str, "': '", str2, "' received value of wrong type: '"), obj, '\''), th, null, null, 24, null);
    }

    public static final <T> ParsingException invalidValue(JSONObject jSONObject, String str, T t, Throwable th) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, h5s.d(new StringBuilder("Value '"), trimLength(t), "' for key '", str, "' is not valid"), th, new JsonObject(jSONObject), null, 16, null);
    }

    public static final <T> ParsingException invalidValue(JSONArray jSONArray, String str, int i, T t, Throwable th) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder sb = new StringBuilder("Value '");
        nyh0.a(i, trimLength(t), "' at ", " position of '", sb);
        return new ParsingException(parsingExceptionReason, i5s.a(sb, str, "' is not valid"), th, new JsonArray(jSONArray), null, 16, null);
    }

    public static final ParsingException typeMismatch(int i, Object obj) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        StringBuilder b = ji.b(i, "Item builder data at ", " position has wrong type: ");
        b.append(obj.getClass().getName());
        return new ParsingException(parsingExceptionReason, b.toString(), null, null, null, 28, null);
    }

    public static final <T> ParsingException invalidValue(JSONArray jSONArray, String str, int i, T t) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder sb = new StringBuilder("Value '");
        nyh0.a(i, trimLength(t), "' at ", " position of '", sb);
        return new ParsingException(parsingExceptionReason, i5s.a(sb, str, "' is not valid"), null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    public static final <T> ParsingException invalidValue(String str, T t) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, h5s.d(new StringBuilder("Value '"), trimLength(t), "' at path '", str, "' is not valid"), null, null, null, 28, null);
    }

    public static final <T> ParsingException invalidValue(String str, String str2, T t) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder sb = new StringBuilder("Value '");
        n6j.b(sb, trimLength(t), "' for key '", str, "' at path '");
        return new ParsingException(parsingExceptionReason, i5s.a(sb, str2, "' is not valid"), null, null, null, 28, null);
    }
}
