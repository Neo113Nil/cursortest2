package defpackage;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.types.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mdo {
    public final cxq0 a;

    public mdo(cxq0 cxq0Var) {
        this.a = cxq0Var;
    }

    public static ArrayList a(c cVar, ArrayList arrayList) {
        EvaluableType evaluableType;
        List b = cVar.b();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            int f = scc.f(b);
            if (i > f) {
                i = f;
            }
            EvaluableType evaluableType2 = ((kms) b.get(i)).a;
            boolean z = obj instanceof Long;
            if (z) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof a) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof jdc) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof rg21) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        kbs.n("Unable to find type for null", null);
                        return null;
                    }
                    kbs.n(qv10.n(obj, "Unable to find type for "), null);
                    return null;
                }
                evaluableType = EvaluableType.ARRAY;
            }
            if (evaluableType2 != evaluableType && z && ldo.a[evaluableType2.ordinal()] == 1) {
                obj = Double.valueOf(((Number) obj).longValue());
            }
            arrayList2.add(obj);
            i = i2;
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        if (r4.compareTo(r5) <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r4.compareTo(r5) >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r4.compareTo(r5) > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r4.compareTo(r5) < 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        return java.lang.Boolean.valueOf(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean c(vlz0 vlz0Var, Comparable comparable, Comparable comparable2) {
        boolean z = false;
        if (!(vlz0Var instanceof tlz0)) {
            if (!(vlz0Var instanceof ulz0)) {
                if (!(vlz0Var instanceof slz0)) {
                    if (!(vlz0Var instanceof rlz0)) {
                        w511.b();
                        return null;
                    }
                }
            }
        }
    }

    public final Object b(jdo jdoVar) {
        try {
            return jdoVar.a(this);
        } catch (EvaluableException e) {
            throw e;
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            throw new EvaluableException(message, e2);
        }
    }
}
