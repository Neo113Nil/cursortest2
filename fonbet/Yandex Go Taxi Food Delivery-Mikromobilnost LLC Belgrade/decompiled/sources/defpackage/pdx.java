package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.a;
import com.yandex.div.json.expressions.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pdx {
    public static final kbs a = new kbs(18);
    public static final t6e b = new t6e(Collections.EMPTY_LIST);

    public static Expression a(JSONObject jSONObject, String str, tls tlsVar, r131 r131Var, vm11 vm11Var) {
        Object opt = jSONObject.opt(str);
        Object obj = (opt == null || opt == JSONObject.NULL) ? null : opt;
        if (obj != null) {
            boolean z = obj instanceof String;
            dg90 dg90Var = eg90.a;
            if (z && evu0.y((CharSequence) obj, "@{", false)) {
                return new a(str, obj.toString(), tlsVar, r131Var, dg90Var, vm11Var, null);
            }
            try {
                Object invoke = tlsVar.invoke(obj);
                if (invoke == null) {
                    fg90.f(jSONObject, str, obj);
                    return null;
                }
                if (!vm11Var.t(invoke)) {
                    fg90.m(jSONObject, str, obj);
                    return null;
                }
                try {
                    if (r131Var.l(invoke)) {
                        return invoke instanceof String ? new lvo(dg90Var, (String) invoke) : new kvo(invoke);
                    }
                    fg90.f(jSONObject, str, obj);
                    return null;
                } catch (ClassCastException unused) {
                    fg90.m(jSONObject, str, obj);
                }
            } catch (ClassCastException unused2) {
                fg90.m(jSONObject, str, obj);
            } catch (Exception e) {
                fg90.g(jSONObject, str, obj, e);
            }
        }
        return null;
    }

    public static pvo b(JSONObject jSONObject, String str, tls tlsVar, sty styVar, r131 r131Var, u2l u2lVar, vm11 vm11Var) {
        dg90 dg90Var;
        Object invoke;
        t6e t6eVar = b;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            fg90.h(str, jSONObject);
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List list = Collections.EMPTY_LIST;
            try {
                if (!styVar.b(list)) {
                    fg90.f(jSONObject, str, list);
                }
                return t6eVar;
            } catch (ClassCastException unused) {
                fg90.m(jSONObject, str, list);
                return t6eVar;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        boolean z = false;
        while (true) {
            dg90Var = eg90.a;
            if (i >= length) {
                break;
            }
            Object opt = optJSONArray.opt(i);
            Object obj = (opt == null || opt == JSONObject.NULL) ? null : opt;
            if (obj != null) {
                if ((obj instanceof String) && evu0.y((CharSequence) obj, "@{", false)) {
                    arrayList.add(new a(str + "[" + i + "]", obj.toString(), tlsVar, r131Var, dg90Var, vm11Var, null));
                    z = true;
                    i++;
                } else {
                    Object obj2 = obj;
                    try {
                        invoke = tlsVar.invoke(obj2);
                    } catch (ClassCastException unused2) {
                        fg90.l(optJSONArray, str, i, obj2);
                    } catch (Exception e) {
                        fg90.e(optJSONArray, str, i, obj2, e);
                    }
                    if (invoke != null) {
                        if (vm11Var.t(invoke)) {
                            try {
                                if (r131Var.l(invoke)) {
                                    arrayList.add(invoke);
                                } else {
                                    fg90.d(optJSONArray, str, i, invoke);
                                }
                            } catch (ClassCastException unused3) {
                                fg90.l(optJSONArray, str, i, invoke);
                            }
                        } else {
                            fg90.l(optJSONArray, str, i, obj2);
                        }
                        i++;
                    }
                }
            }
            i++;
        }
        if (!z) {
            try {
            } catch (ClassCastException unused4) {
                fg90.m(jSONObject, str, arrayList);
            }
            if (styVar.b(arrayList)) {
                return new t6e(arrayList);
            }
            fg90.f(jSONObject, str, arrayList);
            return null;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj3 = arrayList.get(i2);
            if (!(obj3 instanceof Expression)) {
                arrayList.set(i2, obj3 instanceof String ? new lvo(dg90Var, (String) obj3) : new kvo(obj3));
            }
        }
        return new b(str, arrayList, styVar, u2lVar.a);
    }
}
