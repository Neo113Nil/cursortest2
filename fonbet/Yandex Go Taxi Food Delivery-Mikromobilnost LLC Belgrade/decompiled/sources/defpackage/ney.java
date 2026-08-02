package defpackage;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class ney {
    public final Lifecycle a;
    public final ycs0 b = new ycs0(0);

    public ney(Lifecycle lifecycle) {
        this.a = lifecycle;
    }

    public final void a(iey ieyVar, View view) {
        c(view, ieyVar, new o58(1, ieyVar, view));
    }

    public final void b(Object obj, iey ieyVar) {
        c(obj, ieyVar, new uyi(1, ieyVar));
    }

    public final void c(Object obj, iey ieyVar, Supplier supplier) {
        vez0.i0("LifecycleObservable should be used only from UiThread");
        ycs0 ycs0Var = this.b;
        ley leyVar = (ley) ycs0Var.get(obj);
        if (leyVar != null) {
            if (leyVar.a == ieyVar) {
                return;
            } else {
                e(leyVar);
            }
        }
        ley leyVar2 = (ley) supplier.get();
        Lifecycle lifecycle = this.a;
        lifecycle.a(leyVar2);
        ycs0Var.put(obj, leyVar2);
        if (leyVar2.a() || lifecycle.b() != Lifecycle.State.RESUMED) {
            return;
        }
        ieyVar.onResume();
    }

    public final void d(Object obj) {
        vez0.i0("LifecycleObservable should be used only from UiThread");
        e((ley) this.b.remove(obj));
    }

    public final void e(ley leyVar) {
        if (leyVar == null) {
            return;
        }
        iey ieyVar = leyVar.a;
        boolean a = leyVar.a();
        Lifecycle lifecycle = this.a;
        lifecycle.d(leyVar);
        if (a) {
            return;
        }
        Lifecycle.State b = lifecycle.b();
        if (b == Lifecycle.State.RESUMED) {
            ieyVar.onPause();
            b = Lifecycle.State.STARTED;
        }
        if (b == Lifecycle.State.STARTED) {
            ieyVar.onStop();
            b = Lifecycle.State.CREATED;
        }
        if (b == Lifecycle.State.CREATED) {
            ieyVar.onDestroy();
        }
    }
}
