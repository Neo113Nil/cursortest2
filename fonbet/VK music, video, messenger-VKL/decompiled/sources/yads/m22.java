package yads;

import android.view.View;
import java.util.Map;

/* loaded from: classes10.dex */
public final class m22 {
    public final iv a;
    public final yf0 b;
    public final z22 c;
    public final Map d;

    public m22(yf0 yf0Var, z22 z22Var, Map map) {
        this.a = iv.a;
        this.b = yf0Var;
        this.c = z22Var;
        this.d = map;
    }

    public final void a() {
        for (pi piVar : this.d.values()) {
            if (piVar != null) {
                piVar.a();
            }
        }
    }

    public final View b() {
        return this.c.a();
    }

    public final pi a(oi oiVar) {
        if (oiVar != null) {
            return (pi) this.d.get(oiVar.a);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m22(a32 a32Var, d4 d4Var, ov2 ov2Var, nj2 nj2Var, a61 a61Var, y02 y02Var, cj cjVar, e52 e52Var, i42 i42Var, v9 v9Var, n82 n82Var, g02 g02Var, bp1 bp1Var, qz2 qz2Var, t20 t20Var, yf0 yf0Var) {
        this(yf0Var, r1, new ri(r1, nj2Var, new uo1(cjVar, d4Var, a61Var, y02Var.c(), g02Var, bp1Var, new uo3(r1), qz2Var), e52Var, i42Var, v9Var, n82Var, ((mv3) ov2Var).a(), t20Var).a());
        z22 a = a32Var.a();
    }
}
