package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes4.dex */
public final class nc90 extends d6z {
    public final /* synthetic */ int f;
    public final Method g;
    public final int h;
    public final zme i;
    public final boolean j;

    public /* synthetic */ nc90(Method method, int i, zme zmeVar, boolean z, int i2) {
        this.f = i2;
        this.g = method;
        this.h = i;
        this.i = zmeVar;
        this.j = z;
    }

    @Override // defpackage.d6z
    public final void c(q5j0 q5j0Var, Object obj) {
        int i = this.f;
        boolean z = this.j;
        Method method = this.g;
        int i2 = this.h;
        zme zmeVar = this.i;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw udq0.J(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw udq0.J(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw udq0.J(method, i2, oyr.p("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String str2 = (String) zmeVar.l(value);
                    if (str2 == null) {
                        throw udq0.J(method, i2, "Field map value '" + value + "' converted to null by " + zmeVar.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    l3s l3sVar = q5j0Var.j;
                    if (z) {
                        l3sVar.b(str, str2);
                    } else {
                        l3sVar.a(str, str2);
                    }
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw udq0.J(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (str3 == null) {
                        throw udq0.J(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw udq0.J(method, i2, oyr.p("Header map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    q5j0Var.a(str3, (String) zmeVar.l(value2), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw udq0.J(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str4 = (String) entry3.getKey();
                    if (str4 == null) {
                        throw udq0.J(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw udq0.J(method, i2, oyr.p("Query map contained null value for key '", str4, "'."), new Object[0]);
                    }
                    String str5 = (String) zmeVar.l(value3);
                    if (str5 == null) {
                        throw udq0.J(method, i2, "Query map value '" + value3 + "' converted to null by " + zmeVar.getClass().getName() + " for key '" + str4 + "'.", new Object[0]);
                    }
                    q5j0Var.b(str4, str5, z);
                }
                return;
        }
    }
}
