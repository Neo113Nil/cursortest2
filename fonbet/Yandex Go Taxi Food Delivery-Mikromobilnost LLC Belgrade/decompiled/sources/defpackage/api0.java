package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class api0 extends nl11 {
    public final cpi0 a;

    public api0(cpi0 cpi0Var) {
        this.a = cpi0Var;
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract void c(Object obj, wdx wdxVar, zoi0 zoi0Var);

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        Object a = a();
        Map map = this.a.a;
        try {
            wdxVar.c();
            while (wdxVar.hasNext()) {
                zoi0 zoi0Var = (zoi0) map.get(wdxVar.nextName());
                if (zoi0Var == null) {
                    wdxVar.skipValue();
                } else {
                    c(a, wdxVar, zoi0Var);
                }
            }
            wdxVar.n();
            return b(a);
        } catch (IllegalAccessException e) {
            lia1 lia1Var = xoi0.a;
            ny61.n("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        if (obj == null) {
            afxVar.w();
            return;
        }
        afxVar.d();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((zoi0) it.next()).a(afxVar, obj);
            }
            afxVar.n();
        } catch (IllegalAccessException e) {
            lia1 lia1Var = xoi0.a;
            ny61.n("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }
}
