package xsna;

import com.vk.mvi.core.internal.executors.ThreadType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.ao50;
import xsna.fi50;
import xsna.km50;
import xsna.tj50;
import xsna.xl50;

/* compiled from: MviReducerBase.kt */
/* loaded from: classes3.dex */
public abstract class dm50<VS extends ao50, P extends xl50, S extends km50> implements cm50<VS, P, S> {
    public final bo50 a = new bo50();
    public final VS b = d();
    public volatile S c;

    public dm50(S s) {
        this.c = s;
    }

    @Override // xsna.cm50
    public void a(P p) {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType threadType = ThreadType.STATE;
        aVar.getClass();
        ThreadType.a.a(threadType);
        m200.h.getClass();
        S c = c(this.c, p);
        this.c = c;
        ThreadType.a.a(threadType);
        h(c, this.b);
    }

    @Override // xsna.cm50
    public final S b() {
        return this.c;
    }

    public abstract S c(S s, P p);

    public abstract VS d();

    @Override // xsna.cm50
    public void destroy() {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType threadType = ThreadType.MAIN;
        aVar.getClass();
        ThreadType.a.a(threadType);
        bo50 bo50Var = this.a;
        bo50Var.getClass();
        ThreadType.a.a(threadType);
        if (bo50Var.a.compareAndSet(false, true)) {
            Iterator it = j5g.O0(bo50Var.b.values()).iterator();
            while (it.hasNext()) {
                ((gn50) it.next()).a();
            }
        }
    }

    public final fi50 e(izs izsVar) {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType threadType = ThreadType.MAIN;
        aVar.getClass();
        ThreadType.a.a(threadType);
        bo50 bo50Var = this.a;
        bo50Var.getClass();
        ThreadType.a.a(threadType);
        tj50.a aVar2 = new tj50.a();
        fi50 fi50Var = new fi50(new fi50.c(new bpn0(new r010(aVar2, 11)), new bpn0(new fg1(19, izsVar, aVar2))));
        AtomicBoolean atomicBoolean = bo50Var.a;
        if (!atomicBoolean.get()) {
            gn50<? extends km50> gn50Var = new gn50<>(fi50Var);
            bo50Var.b.put(fi50Var, gn50Var);
            if (atomicBoolean.get()) {
                gn50Var.a();
            }
        }
        return fi50Var;
    }

    public final <S extends km50, R extends fm50<S>> void f(n0u0<R> n0u0Var, S s) {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType threadType = ThreadType.STATE;
        aVar.getClass();
        ThreadType.a.a(threadType);
        bo50 bo50Var = this.a;
        bo50Var.getClass();
        ThreadType.a.a(threadType);
        gn50<? extends km50> gn50Var = bo50Var.a.get() ? null : bo50Var.b.get(n0u0Var);
        if (gn50Var != null) {
            ThreadType.a.a(threadType);
            fi50<? extends km50, ? extends fm50<? extends Object>> fi50Var = gn50Var.a;
            ThreadType.a.a(threadType);
            fi50.c<? extends km50, ? extends fm50<? extends Object>> cVar = fi50Var.a;
            if (!cVar.b.isInitialized()) {
                cVar.b.getValue();
            }
            tj50 tj50Var = (tj50) cVar.a.getValue();
            tj50Var.getClass();
            ThreadType.a.a(threadType);
            ArrayList arrayList = tj50Var.a;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((izs) it.next()).invoke(s);
                }
            }
            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
            io.reactivex.rxjava3.android.schedulers.a.b().c(new qo2(6, fi50Var, s));
        }
    }

    @Override // xsna.cm50
    public final VS g() {
        return this.b;
    }

    public abstract void h(S s, VS vs);
}
