package com.yandex.div.evaluable;

import defpackage.bb1;
import defpackage.cxq0;
import defpackage.jdc;
import defpackage.jdo;
import defpackage.kbs;
import defpackage.kms;
import defpackage.nls;
import defpackage.ols;
import defpackage.pls;
import defpackage.qls;
import defpackage.qv10;
import defpackage.rg21;
import defpackage.rls;
import defpackage.scc;
import defpackage.wls;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        new nls();
    }

    public abstract Object a(cxq0 cxq0Var, jdo jdoVar, List list);

    public abstract List b();

    public abstract String c();

    public abstract EvaluableType d();

    public final Object e(cxq0 cxq0Var, jdo jdoVar, List list) {
        EvaluableType evaluableType;
        EvaluableType evaluableType2;
        Object a2 = a(cxq0Var, jdoVar, list);
        boolean z = a2 instanceof Long;
        if (z) {
            evaluableType = EvaluableType.INTEGER;
        } else if (a2 instanceof Double) {
            evaluableType = EvaluableType.NUMBER;
        } else if (a2 instanceof Boolean) {
            evaluableType = EvaluableType.BOOLEAN;
        } else if (a2 instanceof String) {
            evaluableType = EvaluableType.STRING;
        } else if (a2 instanceof com.yandex.div.evaluable.types.a) {
            evaluableType = EvaluableType.DATETIME;
        } else if (a2 instanceof jdc) {
            evaluableType = EvaluableType.COLOR;
        } else if (a2 instanceof rg21) {
            evaluableType = EvaluableType.URL;
        } else if (a2 instanceof JSONObject) {
            evaluableType = EvaluableType.DICT;
        } else {
            if (!(a2 instanceof JSONArray)) {
                if (a2 == null) {
                    kbs.n("Unable to find type for null", null);
                    return null;
                }
                kbs.n(qv10.n(a2, "Unable to find type for "), null);
                return null;
            }
            evaluableType = EvaluableType.ARRAY;
        }
        if (evaluableType == d()) {
            return a2;
        }
        StringBuilder sb = new StringBuilder("Function ");
        sb.append(this);
        sb.append(" returned ");
        if (z) {
            evaluableType2 = EvaluableType.INTEGER;
        } else if (a2 instanceof Double) {
            evaluableType2 = EvaluableType.NUMBER;
        } else if (a2 instanceof Boolean) {
            evaluableType2 = EvaluableType.BOOLEAN;
        } else if (a2 instanceof String) {
            evaluableType2 = EvaluableType.STRING;
        } else if (a2 instanceof com.yandex.div.evaluable.types.a) {
            evaluableType2 = EvaluableType.DATETIME;
        } else if (a2 instanceof jdc) {
            evaluableType2 = EvaluableType.COLOR;
        } else if (a2 instanceof rg21) {
            evaluableType2 = EvaluableType.URL;
        } else if (a2 instanceof JSONObject) {
            evaluableType2 = EvaluableType.DICT;
        } else {
            if (!(a2 instanceof JSONArray)) {
                if (a2 == null) {
                    kbs.n("Unable to find type for null", null);
                    return null;
                }
                kbs.n(qv10.n(a2, "Unable to find type for "), null);
                return null;
            }
            evaluableType2 = EvaluableType.ARRAY;
        }
        sb.append(evaluableType2);
        sb.append(", but ");
        sb.append(d());
        sb.append(" was expected.");
        throw new EvaluableException(sb.toString(), null);
    }

    public abstract boolean f();

    public final bb1 g(List list, wls wlsVar) {
        int size = b().size();
        kms kmsVar = (kms) kotlin.collections.a.b0(b());
        int size2 = kmsVar != null ? kmsVar.b : false ? Integer.MAX_VALUE : b().size();
        if (list.size() < size || list.size() > size2) {
            return new ols(size);
        }
        int size3 = list.size();
        for (int i = 0; i < size3; i++) {
            List b = b();
            int f = scc.f(b());
            if (i <= f) {
                f = i;
            }
            EvaluableType evaluableType = ((kms) b.get(f)).a;
            if (!((Boolean) wlsVar.invoke(list.get(i), evaluableType)).booleanValue()) {
                return new pls(evaluableType, (EvaluableType) list.get(i));
            }
        }
        return qls.f;
    }

    public final bb1 h(ArrayList arrayList) {
        return g(arrayList, Function$matchesArguments$1.w);
    }

    public final bb1 i(List list) {
        return g(list, new wls() { // from class: com.yandex.div.evaluable.Function$matchesArgumentsWithCast$1
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                EvaluableType evaluableType = (EvaluableType) obj;
                EvaluableType evaluableType2 = (EvaluableType) obj2;
                boolean z = true;
                if (evaluableType != evaluableType2) {
                    c cVar = c.this;
                    int i = c.a;
                    cVar.getClass();
                    if (evaluableType != EvaluableType.INTEGER || rls.a[evaluableType2.ordinal()] != 1) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final String toString() {
        return kotlin.collections.a.X(b(), null, c() + '(', Extension.C_BRAKE, Function$toString$1.w, 25);
    }
}
