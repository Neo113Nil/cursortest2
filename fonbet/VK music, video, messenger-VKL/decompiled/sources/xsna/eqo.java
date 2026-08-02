package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.dynamic_loader.DynamicLib;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.dynamic_loader.b;
import com.vk.device.store.AppStore;
import com.vk.masks.dynamic.DynamicMasksUseCase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import xsna.eqo;
import xsna.hqo;

/* compiled from: DynamicLibPresenter.kt */
/* loaded from: classes18.dex */
public final class eqo<UseCase extends hqo> {
    public final Context a;
    public final DynamicTask b;
    public final jqo<UseCase> c;
    public final boolean d;
    public final boolean e;
    public io.reactivex.rxjava3.disposables.c f;
    public a<UseCase> g;

    public eqo(Context context, DynamicTask dynamicTask, vdl vdlVar, boolean z, boolean z2) {
        this.a = context;
        this.b = dynamicTask;
        this.c = vdlVar;
        this.d = z;
        this.e = z2;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
        this.c.g();
    }

    public final boolean b() {
        boolean z;
        boolean o = BuildInfo.o();
        DynamicTask dynamicTask = this.b;
        if (!o) {
            LinkedHashSet linkedHashSet = com.vk.core.dynamic_loader.a.a;
            return com.vk.core.dynamic_loader.a.b.containsKey(dynamicTask);
        }
        vpo vpoVar = com.vk.core.dynamic_loader.b.a;
        if (!com.vk.core.dynamic_loader.b.g.containsKey(dynamicTask)) {
            ReentrantLock reentrantLock = com.vk.core.dynamic_loader.b.l;
            reentrantLock.lock();
            try {
                sk3<b.a> sk3Var = com.vk.core.dynamic_loader.b.k;
                if (sk3Var == null || !sk3Var.isEmpty()) {
                    Iterator<b.a> it = sk3Var.iterator();
                    while (it.hasNext()) {
                        if (it.next().a == dynamicTask) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    return false;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return true;
    }

    public final boolean c() {
        if (!BuildInfo.k()) {
            boolean z = BuildInfo.h;
            boolean z2 = this.d;
            if (z && !dy2.g(this.a, AppStore.GOOGLE) && !z2) {
                this.c.a(new DynamicException.GooglePlay("isStubState store check is violated", 0));
                return true;
            }
            if (BuildInfo.h || z2) {
                return false;
            }
        }
        return true;
    }

    public final void d(final UseCase usecase) {
        io.reactivex.rxjava3.core.q h;
        if (c()) {
            a<UseCase> aVar = this.g;
            if (aVar != null) {
                aVar.b(usecase);
                return;
            }
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        jqo<UseCase> jqoVar = this.c;
        if (cVar == null) {
            jqoVar.g();
            boolean o = BuildInfo.o();
            DynamicTask dynamicTask = this.b;
            if (o) {
                h = com.vk.core.dynamic_loader.b.h(dynamicTask);
            } else {
                LinkedHashSet linkedHashSet = com.vk.core.dynamic_loader.a.a;
                h = com.vk.core.dynamic_loader.a.a(dynamicTask, this.d && this.e);
            }
            this.f = h.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new da(new gmj(this, usecase), 25), new ea(new na7(15, this, usecase), 27), new io.reactivex.rxjava3.functions.a() { // from class: xsna.dqo
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    eqo eqoVar = eqo.this;
                    eqoVar.g();
                    eqo.a<UseCase> aVar2 = eqoVar.g;
                    if (aVar2 != 0) {
                        aVar2.b(usecase);
                    }
                }
            });
            return;
        }
        if (BuildInfo.o()) {
            vpo vpoVar = com.vk.core.dynamic_loader.b.a;
            com.vk.core.utils.newtork.b.a.getClass();
            r1 = com.vk.core.utils.newtork.b.d();
        }
        if (!r1) {
            jqoVar.h(null, new xg2(4, this, usecase));
        } else if (b()) {
            jqoVar.f(usecase, new com.vk.movika.sdk.base.ui.r(8, this, usecase));
        } else {
            g();
        }
    }

    public final void e() {
        boolean d;
        boolean b = b();
        jqo<UseCase> jqoVar = this.c;
        if (!b) {
            jqoVar.e();
            return;
        }
        if (BuildInfo.o()) {
            vpo vpoVar = com.vk.core.dynamic_loader.b.a;
            com.vk.core.utils.newtork.b.a.getClass();
            d = com.vk.core.utils.newtork.b.d();
        } else {
            d = true;
        }
        jqoVar.b(d);
    }

    public final void f(DynamicMasksUseCase dynamicMasksUseCase) {
        boolean g;
        if (c()) {
            a<UseCase> aVar = this.g;
            if (aVar != null) {
                aVar.b(dynamicMasksUseCase);
                return;
            }
            return;
        }
        boolean o = BuildInfo.o();
        DynamicTask dynamicTask = this.b;
        if (o) {
            g = com.vk.core.dynamic_loader.b.g(dynamicTask);
        } else {
            LinkedHashSet linkedHashSet = com.vk.core.dynamic_loader.a.a;
            Set<DynamicLib> i = dynamicTask.i();
            ArrayList arrayList = new ArrayList(c5g.u(i, 10));
            Iterator<T> it = i.iterator();
            while (it.hasNext()) {
                arrayList.add(((DynamicLib) it.next()).i());
            }
            g = com.vk.core.dynamic_loader.a.a.containsAll(arrayList);
        }
        if (g || b()) {
            d(dynamicMasksUseCase);
        } else {
            this.c.i(dynamicMasksUseCase, new rh4(13, this, dynamicMasksUseCase));
        }
    }

    public final void g() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
        jqo<UseCase> jqoVar = this.c;
        jqoVar.g();
        jqoVar.e();
        a<UseCase> aVar = this.g;
        if (aVar != null) {
            aVar.a(b());
        }
    }

    public final void h(a<UseCase> aVar) {
        this.g = aVar;
        aVar.a(b());
    }

    /* compiled from: DynamicLibPresenter.kt */
    public interface a<UseCase extends hqo> {
        default void a(boolean z) {
        }

        default void b(UseCase usecase) {
        }

        default void c(UseCase usecase) {
        }

        default void d(UseCase usecase, Throwable th) {
        }
    }
}
