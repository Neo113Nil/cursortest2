package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import defpackage.oyr;
import defpackage.zy11;
import java.util.List;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class k {
    public static final Object a(String str, List list, boolean z) {
        Object failure;
        Object failure2;
        JSONObject jSONObject = (JSONObject) kotlin.collections.a.P(list);
        int size = list.size() - 1;
        for (int i = 1; i < size; i++) {
            String str2 = (String) list.get(i);
            try {
                Object opt = jSONObject.opt(str2);
                jSONObject = opt instanceof JSONObject ? (JSONObject) opt : null;
                failure2 = zy11.a;
            } catch (Throwable th) {
                failure2 = new Result.Failure(th);
            }
            if (Result.a(failure2) != null) {
                c(str, oyr.p("Missing property \"", str2, "\" in the dict."), list, z);
                throw null;
            }
        }
        String str3 = (String) kotlin.collections.a.Z(list);
        try {
            failure = jSONObject.get(str3);
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        if (Result.a(failure) == null) {
            return failure;
        }
        c(str, oyr.p("Missing property \"", str3, "\" in the dict."), list, z);
        throw null;
    }

    public static final Object b(List list, Object obj, boolean z) {
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
            return jSONObject.opt((String) kotlin.collections.a.Z(list));
        }
        return obj;
    }

    public static final void c(String str, String str2, List list, boolean z) {
        com.yandex.div.evaluable.b.d(kotlin.collections.a.X(list.subList(1, list.size()), null, oyr.f('(', str, z ? "" : "<dict>, "), Extension.C_BRAKE, DictFunctionsKt$throwException$signature$1.w, 25), str2);
        throw null;
    }

    public static final void d(String str, List list, EvaluableType evaluableType, Object obj, boolean z) {
        c(str, "Incorrect value type: expected " + evaluableType.getTypeName() + ", got " + (!obj.equals(JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.', list, z);
        throw null;
    }
}
