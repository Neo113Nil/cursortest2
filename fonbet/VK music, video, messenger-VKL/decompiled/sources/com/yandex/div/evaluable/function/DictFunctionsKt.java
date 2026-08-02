package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.v1v;
import xsna.zr;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class DictFunctionsKt {
    public static final Object evaluate(String str, List<? extends Object> list, boolean z) {
        Object failure;
        Object failure2;
        JSONObject jSONObject = (JSONObject) j5g.Y(list);
        int size = list.size() - 1;
        for (int i = 1; i < size; i++) {
            String str2 = (String) list.get(i);
            try {
                Object opt = jSONObject.opt(str2);
                jSONObject = opt instanceof JSONObject ? (JSONObject) opt : null;
                failure2 = s3q0.a;
            } catch (Throwable th) {
                failure2 = new Result.Failure(th);
            }
            if (Result.a(failure2) != null) {
                throwMissingPropertyException(str, list, str2, z);
                throw new KotlinNothingValueException();
            }
        }
        String str3 = (String) j5g.i0(list);
        try {
            failure = jSONObject.get(str3);
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        if (Result.a(failure) == null) {
            return failure;
        }
        throwMissingPropertyException(str, list, str3, z);
        throw new KotlinNothingValueException();
    }

    public static final Object evaluateSafe(List<? extends Object> list, Object obj, boolean z) {
        int i = !z ? 1 : 0;
        Object obj2 = list.get(i);
        JSONObject jSONObject = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
        if (jSONObject != null) {
            int size = list.size() - 1;
            for (int i2 = i + 1; i2 < size; i2++) {
                jSONObject = jSONObject.optJSONObject((String) list.get(i2));
                if (jSONObject != null) {
                }
            }
            return jSONObject.opt((String) j5g.i0(list));
        }
        return obj;
    }

    public static /* synthetic */ Object evaluateSafe$default(List list, Object obj, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        return evaluateSafe(list, obj, z);
    }

    public static final Void throwDictException(String str, List<? extends Object> list, String str2) {
        ArrayFunctionsKt.throwException$default("dict", str, list, str2, false, 16, null);
        throw new KotlinNothingValueException();
    }

    public static final Void throwException(String str, List<? extends Object> list, String str2, boolean z) {
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(j5g.g0(list.subList(1, list.size()), null, v1v.a('(', str, z ? "" : "<dict>, "), ")", 0, new izs<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.DictFunctionsKt$throwException$signature$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.izs
            public final CharSequence invoke(Object obj) {
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25), str2, null, 4, null);
        throw new KotlinNothingValueException();
    }

    private static final Void throwMissingPropertyException(String str, List<? extends Object> list, String str2, boolean z) {
        throwException(str, list, zr.a("Missing property \"", str2, "\" in the dict."), z);
        throw new KotlinNothingValueException();
    }

    public static final Void throwWrongTypeException(String str, List<? extends Object> list, EvaluableType evaluableType, Object obj, boolean z) {
        throwException(str, list, "Incorrect value type: expected " + evaluableType.getTypeName$div_evaluable() + ", got " + (!obj.equals(JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + JwtParser.SEPARATOR_CHAR, z);
        throw new KotlinNothingValueException();
    }
}
