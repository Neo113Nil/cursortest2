package com.yandex.div.evaluable;

import defpackage.b64;
import defpackage.jdc;
import defpackage.kmz0;
import defpackage.qv10;
import defpackage.rg21;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public abstract class b {
    public static final String a(String str, List list) {
        return kotlin.collections.a.X(list, null, str.concat(Extension.O_BRAKE), Extension.C_BRAKE, EvaluableExceptionKt$functionToMessageFormat$1.w, 25);
    }

    public static final void b(kmz0 kmz0Var, Object obj, Object obj2) {
        EvaluableType evaluableType;
        String sb;
        EvaluableType evaluableType2;
        EvaluableType evaluableType3;
        String str = h(obj) + HexString.CHAR_SPACE + kmz0Var + HexString.CHAR_SPACE + h(obj2);
        if (obj.getClass().equals(obj2.getClass())) {
            StringBuilder sb2 = new StringBuilder();
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof com.yandex.div.evaluable.types.a) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof jdc) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof rg21) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    throw new EvaluableException(qv10.n(obj, "Unable to find type for "), null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            sb2.append(evaluableType.getTypeName());
            sb2.append(" type");
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("different types: ");
            if (obj instanceof Long) {
                evaluableType2 = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType2 = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType2 = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType2 = EvaluableType.STRING;
            } else if (obj instanceof com.yandex.div.evaluable.types.a) {
                evaluableType2 = EvaluableType.DATETIME;
            } else if (obj instanceof jdc) {
                evaluableType2 = EvaluableType.COLOR;
            } else if (obj instanceof rg21) {
                evaluableType2 = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType2 = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    throw new EvaluableException(qv10.n(obj, "Unable to find type for "), null);
                }
                evaluableType2 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType2.getTypeName());
            sb3.append(" and ");
            if (obj2 instanceof Long) {
                evaluableType3 = EvaluableType.INTEGER;
            } else if (obj2 instanceof Double) {
                evaluableType3 = EvaluableType.NUMBER;
            } else if (obj2 instanceof Boolean) {
                evaluableType3 = EvaluableType.BOOLEAN;
            } else if (obj2 instanceof String) {
                evaluableType3 = EvaluableType.STRING;
            } else if (obj2 instanceof com.yandex.div.evaluable.types.a) {
                evaluableType3 = EvaluableType.DATETIME;
            } else if (obj2 instanceof jdc) {
                evaluableType3 = EvaluableType.COLOR;
            } else if (obj2 instanceof rg21) {
                evaluableType3 = EvaluableType.URL;
            } else if (obj2 instanceof JSONObject) {
                evaluableType3 = EvaluableType.DICT;
            } else {
                if (!(obj2 instanceof JSONArray)) {
                    throw new EvaluableException(qv10.n(obj2, "Unable to find type for "), null);
                }
                evaluableType3 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType3.getTypeName());
            sb = sb3.toString();
        }
        c(null, str, "Operator '" + kmz0Var + "' cannot be applied to " + sb + '.');
        throw null;
    }

    public static final void c(Exception exc, String str, String str2) {
        throw new EvaluableException(b64.l("Failed to evaluate [", str, "]. ", str2), exc);
    }

    public static /* synthetic */ void d(String str, String str2) {
        c(null, str, str2);
        throw null;
    }

    public static final void e(String str, List list, String str2, IllegalArgumentException illegalArgumentException) {
        c(illegalArgumentException, a(str, list), str2);
        throw null;
    }

    public static /* synthetic */ void f(String str, String str2, List list) {
        e(str, list, str2, null);
        throw null;
    }

    public static final void g(String str, ArrayList arrayList, String str2, EvaluableException evaluableException) {
        String concat;
        if (arrayList.size() > 1) {
            concat = kotlin.collections.a.X(arrayList.subList(1, arrayList.size()), ",", str.concat(Extension.O_BRAKE), Extension.C_BRAKE, null, 56);
        } else {
            concat = str.concat("()");
        }
        c(evaluableException, concat, str2);
        throw null;
    }

    public static final String h(Object obj) {
        if (obj instanceof JSONArray) {
            return "<array>";
        }
        if (obj instanceof JSONObject) {
            return "<dict>";
        }
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        return "'" + obj + '\'';
    }

    public static final String i(List list) {
        return kotlin.collections.a.X(list, Extension.FIX_SPACE, null, null, EvaluableExceptionKt$toMessageFormat$1.w, 30);
    }
}
