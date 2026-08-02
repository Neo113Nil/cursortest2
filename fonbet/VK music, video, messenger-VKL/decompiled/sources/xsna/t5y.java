package xsna;

import android.app.Application;
import android.content.Intent;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.LinkedHashMap;

/* compiled from: JsOpenExternalLinkRepository.kt */
/* loaded from: classes6.dex */
public final class t5y {
    public static final a e = new a();
    public static volatile t5y f;
    public final x6y a;
    public final fvv0 b;
    public final String c;
    public final LinkedHashMap d;

    /* compiled from: JsOpenExternalLinkRepository.kt */
    public static final class a {
        public static io.reactivex.rxjava3.internal.operators.completable.w a(LinkedHashMap linkedHashMap, Intent intent) {
            io.reactivex.rxjava3.core.a b1Var;
            qcl qclVar = new qcl(linkedHashMap, 21);
            t5y t5yVar = t5y.f;
            if (t5yVar != null) {
                return ((io.reactivex.rxjava3.core.a) qclVar.invoke(t5yVar)).j(new r5y());
            }
            String str = (String) linkedHashMap.get("app_id");
            Application d = dgn0.d();
            if (str == null) {
                d.startActivity(intent);
                b1Var = io.reactivex.rxjava3.internal.operators.completable.i.b;
            } else {
                String a = tdj.a(new StringBuilder("https://"), a0a.d, "/app", str);
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                io.reactivex.rxjava3.internal.operators.observable.b0 F = vdx0Var.d().X(a).F(new qs2(new hn0(16, d, intent), 21));
                wnt wntVar = new wnt(new defpackage.c(20, d, intent), 3);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                b1Var = new io.reactivex.rxjava3.internal.operators.observable.b1(F.E(wntVar, lVar, kVar, kVar));
            }
            return b1Var.j(new s5y(0));
        }
    }

    public t5y(x6y x6yVar, fvv0 fvv0Var, String str, LinkedHashMap linkedHashMap) {
        this.a = x6yVar;
        this.b = fvv0Var;
        this.c = str;
        this.d = linkedHashMap;
    }
}
