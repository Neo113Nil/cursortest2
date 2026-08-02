package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.eq0;
import xsna.izs;
import xsna.j5g;
import xsna.v1v;
import xsna.zr;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class ArrayFunctionsKt {
    private static final void checkIndexOfBoundException(String str, List<? extends Object> list, boolean z) {
        int length = ((JSONArray) list.get(0)).length();
        long longValue = ((Long) list.get(1)).longValue();
        if (longValue < length) {
            return;
        }
        StringBuilder a = eq0.a(length, "Requested index (", ") out of bounds array size (", longValue);
        a.append(").");
        throwArrayException(str, list, a.toString(), z);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void checkIndexOfBoundException$default(String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        checkIndexOfBoundException(str, list, z);
    }

    public static final Object evaluateArray(String str, List<? extends Object> list, boolean z) {
        checkIndexOfBoundException(str, list, z);
        return ((JSONArray) list.get(0)).get((int) ((Long) list.get(1)).longValue());
    }

    public static /* synthetic */ Object evaluateArray$default(String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return evaluateArray(str, list, z);
    }

    public static final Object evaluateSafe(String str, List<? extends Object> list) {
        Object failure;
        try {
            checkIndexOfBoundException$default(str, list, false, 4, null);
            failure = ((JSONArray) list.get(0)).get((int) ((Long) list.get(1)).longValue());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }

    public static final Color safeConvertToColor(String str) {
        Object failure;
        if (str == null) {
            return null;
        }
        try {
            failure = Color.m184boximpl(Color.Companion.m194parseC4zCDoM(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Color) (failure instanceof Result.Failure ? null : failure);
    }

    public static final String safeConvertToUrl(String str) {
        Object failure;
        if (str == null) {
            return null;
        }
        try {
            failure = Url.m195boximpl(Url.Companion.m202fromVcSV9u8(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Url url = (Url) failure;
        if (url != null) {
            return url.m201unboximpl();
        }
        return null;
    }

    public static final Void throwArrayException(String str, List<? extends Object> list, String str2, boolean z) {
        throwException("array", str, list, str2, z);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwArrayException$default(String str, List list, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return throwArrayException(str, list, str2, z);
    }

    public static final void throwArrayWrongTypeException(String str, List<? extends Object> list, EvaluableType evaluableType, Object obj, boolean z) {
        throwArrayException(str, list, "Incorrect value type: expected " + evaluableType.getTypeName$div_evaluable() + ", got " + (!obj.equals(JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + JwtParser.SEPARATOR_CHAR, z);
        throw new KotlinNothingValueException();
    }

    public static final Void throwException(String str, String str2, List<? extends Object> list, String str3, boolean z) {
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(j5g.g0(list.subList(1, list.size()), null, v1v.a('(', str2, z ? "" : zr.a("<", str, ">, ")), ")", 0, new izs<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.ArrayFunctionsKt$throwException$signature$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.izs
            public final CharSequence invoke(Object obj) {
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25), str3, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwException$default(String str, String str2, List list, String str3, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return throwException(str, str2, list, str3, z);
    }
}
