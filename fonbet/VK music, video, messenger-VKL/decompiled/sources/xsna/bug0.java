package xsna;

import android.app.Activity;
import android.content.Context;

/* compiled from: RxExt.kt */
/* loaded from: classes6.dex */
public final class bug0 {
    public static final <T> T a(io.reactivex.rxjava3.core.x<T> xVar) {
        try {
            return xVar.c();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> T b(io.reactivex.rxjava3.core.q<T> qVar) {
        try {
            return qVar.a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void c(io.reactivex.rxjava3.disposables.c cVar) {
        c63 c63Var = c63.a;
        c63.a(new wtg0(cVar));
    }

    public static io.reactivex.rxjava3.core.q d(io.reactivex.rxjava3.core.q qVar, Context context, e750 e750Var, int i) {
        Activity b;
        Object obj = e750Var;
        if ((i & 4) != 0) {
            obj = new k990(15);
        }
        if (context == null || (b = gnj.b(context)) == null) {
            return qVar;
        }
        a2e0 a2e0Var = new a2e0(new a94(15, obj, b));
        rt10 rt10Var = new rt10(new rtg0(a2e0Var, 0), 13);
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, rt10Var, io.reactivex.rxjava3.internal.functions.a.c).C(new vdq(a2e0Var, 5)).F(new afs(new xc50(a2e0Var, 15), 22)), io.reactivex.rxjava3.internal.functions.a.d, new j8w(a2e0Var, 2));
    }

    public static io.reactivex.rxjava3.core.x e(io.reactivex.rxjava3.core.x xVar, Context context, e750 e750Var, int i) {
        Object obj = e750Var;
        if ((i & 4) != 0) {
            obj = new z410(19);
        }
        if (context == null) {
            return xVar;
        }
        a2e0 a2e0Var = new a2e0(new lb6(25, obj, context));
        qg60 qg60Var = new qg60(new fa00(a2e0Var, 21), 13);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, qg60Var), new x150(new q130(a2e0Var, 24), 11)).h(new ksb0(new d410(a2e0Var, 29), 7)), new rz(a2e0Var, 5));
    }
}
