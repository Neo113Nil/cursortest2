package xsna;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vge implements io.reactivex.rxjava3.core.n, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.s {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vge(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        lrg0 lrg0Var = (lrg0) this.b;
        arg0 arg0Var = (arg0) this.c;
        kiz0 kiz0Var = lrg0Var.a;
        kiz0Var.getClass();
        ntj0 ntj0Var = new ntj0(new ru.rustore.sdk.review.t(kiz0Var));
        bpn0 bpn0Var = adn.a;
        d5o0 a = tiy0.a(new gwj0(ntj0Var, adn.a()));
        a.b(new xqg0(0, arg0Var, yVar), null);
        a.b(null, new yqg0(arg0Var, yVar));
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) this.b;
        ksr ksrVar = (ksr) this.c;
        rVar.a(new zsg0(myc0.g(q1u.b, bdn.c.plus(dVar), CoroutineStart.ATOMIC, new dtg0(ksrVar, rVar, null))));
    }

    @Override // io.reactivex.rxjava3.core.n
    public void subscribe(io.reactivex.rxjava3.core.l lVar) {
        xge xgeVar = (xge) this.b;
        Context context = (Context) this.c;
        com.vk.movika.sdk.base.logic.processor.actions.h hVar = new com.vk.movika.sdk.base.logic.processor.actions.h(lVar, 24);
        wja wjaVar = new wja(1, lVar, xgeVar);
        WeakReference weakReference = new WeakReference(context);
        ix3 ix3Var = xgeVar.b;
        ix3Var.getClass();
        io.reactivex.rxjava3.disposables.c i = hg1.i(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.c(new gx3(ix3Var)).m(asu0.a.d()), new v29(hVar, 1)), new ya(11, weakReference, wjaVar));
        if (context instanceof Activity) {
            ((Activity) context).getApplication().registerActivityLifecycleCallbacks(new wge(context, i));
        }
    }
}
