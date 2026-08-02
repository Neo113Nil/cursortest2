package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import defpackage.jdc;
import defpackage.oyr;
import defpackage.rg21;
import defpackage.wwg;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class b {
    public static final void a(String str, List list, boolean z) {
        int length = ((JSONArray) list.get(0)).length();
        long longValue = ((Long) list.get(1)).longValue();
        if (longValue < length) {
            return;
        }
        h(list, "array", str, "Requested index (" + longValue + ") out of bounds array size (" + length + ").", z);
        throw null;
    }

    public static final Object b(String str, List list, boolean z) {
        a(str, list, z);
        return ((JSONArray) list.get(0)).get((int) ((Long) list.get(1)).longValue());
    }

    public static final Object c(String str, List list) {
        Object failure;
        try {
            a(str, list, false);
            failure = ((JSONArray) list.get(0)).get((int) ((Long) list.get(1)).longValue());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }

    public static final jdc d(String str) {
        Object failure;
        if (str == null) {
            return null;
        }
        try {
            failure = new jdc(wwg.B(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (jdc) (failure instanceof Result.Failure ? null : failure);
    }

    public static final String e(String str) {
        Object failure;
        if (str == null) {
            return null;
        }
        try {
            try {
                new URL(str);
                failure = new rg21(str);
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid url ".concat(str));
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        rg21 rg21Var = (rg21) failure;
        if (rg21Var != null) {
            return rg21Var.a;
        }
        return null;
    }

    public static void f(String str, String str2, List list) {
        h(list, "array", str, str2, false);
        throw null;
    }

    public static final void g(String str, List list, EvaluableType evaluableType, Object obj, boolean z) {
        h(list, "array", str, "Incorrect value type: expected " + evaluableType.getTypeName() + ", got " + (!obj.equals(JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.', z);
        throw null;
    }

    public static final void h(List list, String str, String str2, String str3, boolean z) {
        com.yandex.div.evaluable.b.c(null, kotlin.collections.a.X(list.subList(1, list.size()), null, oyr.f('(', str2, z ? "" : oyr.p("<", str, ">, ")), Extension.C_BRAKE, ArrayFunctionsKt$throwException$signature$1.w, 25), str3);
        throw null;
    }

    public static /* synthetic */ void i(String str, String str2, List list) {
        h(list, "dict", str, str2, false);
        throw null;
    }
}
