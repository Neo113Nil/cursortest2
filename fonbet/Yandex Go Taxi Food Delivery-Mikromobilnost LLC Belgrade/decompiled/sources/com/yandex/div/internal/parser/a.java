package com.yandex.div.internal.parser;

import com.yandex.div.json.expressions.Expression;
import defpackage.eg90;
import defpackage.evu0;
import defpackage.fg90;
import defpackage.kbs;
import defpackage.kvo;
import defpackage.lvo;
import defpackage.pvo;
import defpackage.q5z;
import defpackage.r131;
import defpackage.rvo;
import defpackage.sty;
import defpackage.t6e;
import defpackage.tls;
import defpackage.vm11;
import defpackage.wm11;
import defpackage.yf90;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {
    public static final t6e a = new t6e(Collections.EMPTY_LIST);

    public static Expression a(yf90 yf90Var, JSONObject jSONObject, String str, vm11 vm11Var) {
        return b(yf90Var, jSONObject, str, vm11Var, q5z.c, q5z.b);
    }

    public static Expression b(yf90 yf90Var, JSONObject jSONObject, String str, vm11 vm11Var, tls tlsVar, r131 r131Var) {
        Object opt = jSONObject.opt(str);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        Object obj = opt;
        if (obj == null) {
            throw fg90.h(str, jSONObject);
        }
        if ((obj instanceof String) && evu0.y((CharSequence) obj, "@{", false)) {
            return new com.yandex.div.json.expressions.a(str, obj.toString(), tlsVar, r131Var, yf90Var.a(), vm11Var, null);
        }
        try {
            Object invoke = tlsVar.invoke(obj);
            if (invoke == null) {
                throw fg90.f(jSONObject, str, obj);
            }
            if (!vm11Var.t(invoke)) {
                throw fg90.m(jSONObject, str, obj);
            }
            try {
                if (r131Var.l(invoke)) {
                    return invoke instanceof String ? new lvo(yf90Var.a(), (String) invoke) : new kvo(invoke);
                }
                throw fg90.f(jSONObject, str, obj);
            } catch (ClassCastException unused) {
                throw fg90.m(jSONObject, str, obj);
            }
        } catch (ClassCastException unused2) {
            throw fg90.m(jSONObject, str, obj);
        } catch (Exception e) {
            throw fg90.g(jSONObject, str, obj, e);
        }
    }

    public static Expression c(yf90 yf90Var, JSONObject jSONObject, String str) {
        return e(yf90Var, jSONObject, str, wm11.c, q5z.c, q5z.b, null);
    }

    public static Expression d(yf90 yf90Var, JSONObject jSONObject, String str, vm11 vm11Var, tls tlsVar) {
        return e(yf90Var, jSONObject, str, vm11Var, tlsVar, q5z.b, null);
    }

    public static Expression e(yf90 yf90Var, JSONObject jSONObject, String str, vm11 vm11Var, tls tlsVar, r131 r131Var, Expression expression) {
        Object opt = jSONObject.opt(str);
        Object obj = opt == JSONObject.NULL ? null : opt;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof String) && evu0.y((CharSequence) obj, "@{", false)) {
            return new com.yandex.div.json.expressions.a(str, obj.toString(), tlsVar, r131Var, yf90Var.a(), vm11Var, expression);
        }
        try {
            Object invoke = tlsVar.invoke(obj);
            if (invoke == null) {
                yf90Var.a().a(fg90.f(jSONObject, str, obj));
                return null;
            }
            if (!vm11Var.t(invoke)) {
                yf90Var.a().a(fg90.m(jSONObject, str, obj));
                return null;
            }
            try {
                if (r131Var.l(invoke)) {
                    return invoke instanceof String ? new lvo(yf90Var.a(), (String) invoke) : new kvo(invoke);
                }
                yf90Var.a().a(fg90.f(jSONObject, str, obj));
                return null;
            } catch (ClassCastException unused) {
                yf90Var.a().a(fg90.m(jSONObject, str, obj));
                return null;
            }
        } catch (ClassCastException unused2) {
            yf90Var.a().a(fg90.m(jSONObject, str, obj));
            return null;
        } catch (Exception e) {
            yf90Var.a().a(fg90.g(jSONObject, str, obj, e));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static pvo f(yf90 yf90Var, JSONObject jSONObject, String str, vm11 vm11Var, sty styVar) {
        eg90 eg90Var;
        boolean z;
        int i;
        Object obj;
        eg90 eg90Var2;
        kbs kbsVar = q5z.b;
        t6e t6eVar = a;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List list = Collections.EMPTY_LIST;
            try {
                if (!styVar.b(list)) {
                    yf90Var.a().a(fg90.f(jSONObject, str, list));
                }
                return t6eVar;
            } catch (ClassCastException unused) {
                yf90Var.a().a(fg90.m(jSONObject, str, list));
                return t6eVar;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        boolean z2 = 0;
        int i2 = 0;
        boolean z3 = false;
        eg90 eg90Var3 = null;
        while (i2 < length) {
            Object opt = optJSONArray.opt(i2);
            Object obj2 = opt == JSONObject.NULL ? null : opt;
            if (obj2 == null) {
                z = z2;
                i = i2;
                eg90Var = eg90Var3;
            } else {
                boolean z4 = obj2 instanceof String;
                eg90Var = eg90Var3;
                ParsingConvertersKt$STRING_TO_COLOR_INT$1 parsingConvertersKt$STRING_TO_COLOR_INT$1 = ParsingConvertersKt$STRING_TO_COLOR_INT$1.w;
                if (z4 && evu0.y((CharSequence) obj2, "@{", z2)) {
                    if (eg90Var == null) {
                        obj = obj2;
                        eg90Var2 = yf90Var.a();
                    } else {
                        obj = obj2;
                        eg90Var2 = eg90Var;
                    }
                    i = i2;
                    z = z2;
                    arrayList.add(new com.yandex.div.json.expressions.a(str + "[" + i2 + "]", obj.toString(), parsingConvertersKt$STRING_TO_COLOR_INT$1, kbsVar, eg90Var2, vm11Var, null));
                    z3 = true;
                    eg90Var3 = eg90Var2;
                    i2 = i + 1;
                    z2 = z;
                } else {
                    z = z2;
                    i = i2;
                    Object obj3 = obj2;
                    try {
                        Object invoke = parsingConvertersKt$STRING_TO_COLOR_INT$1.invoke(obj3);
                        if (vm11Var.t(invoke)) {
                            arrayList.add(invoke);
                        } else {
                            yf90Var.a().a(fg90.l(optJSONArray, str, i, obj3));
                        }
                    } catch (ClassCastException unused2) {
                        yf90Var.a().a(fg90.l(optJSONArray, str, i, obj3));
                    } catch (Exception e) {
                        yf90Var.a().a(fg90.e(optJSONArray, str, i, obj3, e));
                    }
                }
            }
            eg90Var3 = eg90Var;
            i2 = i + 1;
            z2 = z;
        }
        int i3 = z2;
        if (!z3) {
            try {
                if (styVar.b(arrayList)) {
                    return new t6e(arrayList);
                }
                yf90Var.a().a(fg90.f(jSONObject, str, arrayList));
                return null;
            } catch (ClassCastException unused3) {
                yf90Var.a().a(fg90.m(jSONObject, str, arrayList));
                return null;
            }
        }
        int size = arrayList.size();
        for (int i4 = i3; i4 < size; i4++) {
            Object obj4 = arrayList.get(i4);
            if (!(obj4 instanceof Expression)) {
                arrayList.set(i4, obj4 instanceof String ? new lvo(yf90Var.a(), (String) obj4) : new kvo(obj4));
            }
        }
        return new com.yandex.div.json.expressions.b(str, arrayList, styVar, yf90Var.a());
    }

    public static void g(yf90 yf90Var, JSONObject jSONObject, String str, Expression expression) {
        if (expression == null) {
            return;
        }
        Object b = expression.b();
        try {
            if (expression instanceof com.yandex.div.json.expressions.a) {
                jSONObject.put(str, b);
            } else {
                jSONObject.put(str, b);
            }
        } catch (JSONException e) {
            yf90Var.a().a(e);
        }
    }

    public static void h(yf90 yf90Var, JSONObject jSONObject, String str, Expression expression, tls tlsVar) {
        if (expression == null) {
            return;
        }
        Object b = expression.b();
        try {
            if (expression instanceof com.yandex.div.json.expressions.a) {
                jSONObject.put(str, b);
            } else {
                jSONObject.put(str, tlsVar.invoke(b));
            }
        } catch (JSONException e) {
            yf90Var.a().a(e);
        }
    }

    public static void i(yf90 yf90Var, JSONObject jSONObject, pvo pvoVar) {
        if (pvoVar == null) {
            return;
        }
        boolean z = pvoVar instanceof t6e;
        ParsingConvertersKt$COLOR_INT_TO_STRING$1 parsingConvertersKt$COLOR_INT_TO_STRING$1 = ParsingConvertersKt$COLOR_INT_TO_STRING$1.w;
        int i = 0;
        if (z) {
            List list = ((t6e) pvoVar).a;
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            while (i < size) {
                jSONArray.put(parsingConvertersKt$COLOR_INT_TO_STRING$1.invoke(list.get(i)));
                i++;
            }
            try {
                jSONObject.put("colors", jSONArray);
                return;
            } catch (JSONException e) {
                yf90Var.a().a(e);
                return;
            }
        }
        if (pvoVar instanceof com.yandex.div.json.expressions.b) {
            ArrayList arrayList = ((com.yandex.div.json.expressions.b) pvoVar).b;
            if (arrayList.isEmpty()) {
                return;
            }
            int size2 = arrayList.size();
            JSONArray jSONArray2 = new JSONArray();
            while (i < size2) {
                Expression expression = (Expression) arrayList.get(i);
                if (expression instanceof kvo) {
                    jSONArray2.put(parsingConvertersKt$COLOR_INT_TO_STRING$1.invoke(expression.a(rvo.a)));
                } else {
                    jSONArray2.put(expression.b());
                }
                i++;
            }
            try {
                jSONObject.put("colors", jSONArray2);
            } catch (JSONException e2) {
                yf90Var.a().a(e2);
            }
        }
    }
}
