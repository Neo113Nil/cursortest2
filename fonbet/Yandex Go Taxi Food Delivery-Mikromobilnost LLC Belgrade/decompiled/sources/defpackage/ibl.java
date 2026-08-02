package defpackage;

import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.state.a;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class ibl {
    public final a a;
    public final igy0 b;
    public final w53 c = new w53();
    public final LinkedHashMap d = new LinkedHashMap();

    public ibl(a aVar, igy0 igy0Var) {
        this.a = aVar;
        this.b = igy0Var;
    }

    public final opl a(zmk zmkVar) {
        opl oplVar;
        synchronized (this.c) {
            try {
                oplVar = (opl) this.c.get(zmkVar);
                if (oplVar == null) {
                    String str = (String) this.a.b.get(zmkVar.a);
                    oplVar = str != null ? new opl(Long.parseLong(str)) : null;
                    this.c.put(zmkVar, oplVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oplVar;
    }

    public final String b(dbl dblVar, Div2View div2View, rvo rvoVar, String str) {
        Object d;
        String str2 = div2View.getDivTag().a;
        String str3 = dblVar.H;
        if (str3 != null) {
            c231 variable = rvoVar.getVariable(str3);
            String obj = (variable == null || (d = variable.d()) == null) ? null : d.toString();
            if (obj != null) {
                return obj;
            }
        }
        String a = this.b.a(str2, str);
        if (a != null) {
            return a;
        }
        String str4 = (String) this.a.a.get(new Pair(str2, str));
        if (str4 == null) {
            Expression expression = dblVar.n;
            str4 = expression != null ? (String) expression.a(rvoVar) : null;
            if (str4 == null) {
                cbl cblVar = (cbl) kotlin.collections.a.R(dblVar.I);
                if (cblVar != null) {
                    return cblVar.d;
                }
                return null;
            }
        }
        return str4;
    }

    public final void c(zmk zmkVar, long j, boolean z) {
        if (zmk.b.equals(zmkVar)) {
            return;
        }
        synchronized (this.c) {
            try {
                opl a = a(zmkVar);
                this.c.put(zmkVar, a != null ? new opl(j, a.b) : new opl(j));
                this.b.b(zmkVar.a, "/", String.valueOf(j));
                if (!z) {
                    this.a.b.put(zmkVar.a, String.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str, b bVar, boolean z) {
        b6u0 b6u0Var;
        zy11 zy11Var;
        tls tlsVar;
        String d = bVar.d();
        String c = bVar.c();
        if (d == null || c == null) {
            return;
        }
        synchronized (this.c) {
            try {
                this.b.b(str, d, c);
                if (!z) {
                    this.a.a.put(new Pair(str, d), c);
                }
                Map map = (Map) this.d.get(str);
                if (map != null && (b6u0Var = (b6u0) map.get(d)) != null) {
                    WeakReference weakReference = b6u0Var.b;
                    if (weakReference == null || (tlsVar = (tls) weakReference.get()) == null) {
                        zy11Var = null;
                    } else {
                        tlsVar.invoke(c);
                        zy11Var = zy11.a;
                    }
                    if (zy11Var == null) {
                        b6u0Var.a.g(c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
