package xsna;

import android.text.TextUtils;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* compiled from: CarouselFlexLayoutStrategyProvider.kt */
/* loaded from: classes4.dex */
public final class su9 implements ppr, iz20 {
    public final Object b;
    public final Object c;

    public /* synthetic */ su9(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.ppr
    public int a() {
        return 10;
    }

    @Override // xsna.ppr
    public npr b(int i) {
        return i == 1 ? (vh8) this.c : (qu9) this.b;
    }

    public int c(String str) {
        ooy0 ooy0Var = (ooy0) this.c;
        JSONObject jSONObject = (JSONObject) this.b;
        if (!jSONObject.has(str)) {
            ooy0Var.a(str).g(3006);
            return -1;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt == -1) {
            ooy0Var.a(str).g(3007);
        }
        return optInt;
    }

    public String d(String str) {
        ooy0 ooy0Var = (ooy0) this.c;
        JSONObject jSONObject = (JSONObject) this.b;
        if (!jSONObject.has(str)) {
            ooy0Var.a(str).g(3006);
            return null;
        }
        String optString = jSONObject.optString(str, "D00DC568-C315-4A5C-AE45-3C177B095B35-2165462B-6EC5-49BA-AD28-F48420D9A7DA");
        if (!"D00DC568-C315-4A5C-AE45-3C177B095B35-2165462B-6EC5-49BA-AD28-F48420D9A7DA".equals(optString) && !TextUtils.isEmpty(optString)) {
            return optString;
        }
        ooy0Var.a(str).g(3007);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object, xsna.xo80] */
    @Override // xsna.iz20
    public void n(dw20 dw20Var) {
        jmm0 jmm0Var = (jmm0) this.b;
        ?? xo80Var = new xo80(dw20Var, 1);
        ((Ref$ObjectRef) this.c).element = xo80Var;
        t9 t9Var = jmm0Var.e;
        if (t9Var != 0) {
            t9Var.invoke(xo80Var);
        }
    }

    public su9(gzs gzsVar) {
        this.b = new qu9(gzsVar);
        this.c = new vh8(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public su9(lrt lrtVar, izs izsVar) {
        this.b = lrtVar;
        this.c = (FunctionReferenceImpl) izsVar;
    }
}
