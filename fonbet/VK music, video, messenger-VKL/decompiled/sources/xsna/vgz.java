package xsna;

import androidx.work.DirectExecutor;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import xsna.eyx;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vgz implements ub9.c, io.reactivex.rxjava3.core.s {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ xzs d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vgz(kotlin.coroutines.d dVar, CoroutineStart coroutineStart, wzs wzsVar) {
        this.b = dVar;
        this.c = coroutineStart;
        this.d = (SuspendLambda) wzsVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) this.b;
        CoroutineStart coroutineStart = (CoroutineStart) this.c;
        ?? r2 = (SuspendLambda) this.d;
        final eyx eyxVar = (eyx) dVar.get(eyx.a.b);
        aVar.a(new Runnable() { // from class: xsna.wgz
            @Override // java.lang.Runnable
            public final void run() {
                eyx eyxVar2 = eyx.this;
                if (eyxVar2 != null) {
                    eyxVar2.b(null);
                }
            }
        }, DirectExecutor.INSTANCE);
        return myc0.h(zvj.a(dVar), null, coroutineStart, new zgz(r2, aVar, null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        Object invoke;
        Object obj;
        g03 g03Var = (g03) this.b;
        rsg0 rsg0Var = (rsg0) this.c;
        izs izsVar = (izs) this.d;
        rVar.a(g03Var);
        g03Var.d = Thread.currentThread();
        g03Var.c = true;
        try {
            try {
                rsg0Var.n();
                vx2.a.getClass();
                obj = rsg0Var.f(vx2.b());
            } finally {
                try {
                    Thread.interrupted();
                } catch (Throwable th) {
                }
            }
        } catch (VKApiExecutionException e) {
            if (izsVar == null || (invoke = izsVar.invoke(e)) == null) {
                throw e;
            }
            obj = invoke;
        } catch (IOException e2) {
            L.i(e2);
            String str = rsg0Var.b;
            vx2.a.getClass();
            throw new VKApiExecutionException(-1, str, true, vx2.d.getContext().getString(R.string.default_network_error), null, null, null, null, 0, null, null, e2, 2032);
        }
        g03Var.c = false;
        rVar.a(null);
        g03Var.d = null;
        if (!rVar.h()) {
            rVar.onNext(obj);
            rVar.onComplete();
        }
        Thread.interrupted();
    }

    public /* synthetic */ vgz(g03 g03Var, rsg0 rsg0Var, izs izsVar) {
        this.b = g03Var;
        this.c = rsg0Var;
        this.d = izsVar;
    }
}
