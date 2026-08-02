package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import com.yandex.div.core.view2.Div2View;
import com.yandex.plus.home.api.lifecycle.ActivityLifecycle;
import com.yandex.plus.home.api.lifecycle.b;
import java.util.Set;
import java.util.WeakHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final /* synthetic */ class fdy implements q {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fdy(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        WeakHashMap weakHashMap;
        Set<Div2View> keySet;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((r0) obj).l(event.a());
                return;
            case 1:
                x6f0 x6f0Var = (x6f0) ((y6f0) obj);
                x6f0Var.d(event);
                if (event == Lifecycle.Event.ON_DESTROY) {
                    x6f0Var.l(null);
                    return;
                }
                return;
            case 2:
                b bVar = (b) obj;
                switch (qey.a[event.ordinal()]) {
                    case 1:
                        bVar.b(ActivityLifecycle.LifecycleState.CREATED);
                        return;
                    case 2:
                        bVar.b(ActivityLifecycle.LifecycleState.STARTED);
                        return;
                    case 3:
                        bVar.b(ActivityLifecycle.LifecycleState.RESUMED);
                        return;
                    case 4:
                        bVar.b(ActivityLifecycle.LifecycleState.PAUSED);
                        return;
                    case 5:
                        bVar.b(ActivityLifecycle.LifecycleState.STOPPED);
                        return;
                    case 6:
                        bVar.b(ActivityLifecycle.LifecycleState.DESTROYED);
                        return;
                    case 7:
                        return;
                    default:
                        w511.b();
                        return;
                }
            case 3:
                vsi0 vsi0Var = (vsi0) obj;
                synchronized (vsi0Var.c) {
                    if (usi0.a[event.ordinal()] == 1 && (weakHashMap = (WeakHashMap) vsi0Var.b.remove(peyVar)) != null && (keySet = weakHashMap.keySet()) != null) {
                        for (Div2View div2View : keySet) {
                            div2View.cleanup();
                            vsi0Var.a.a(div2View);
                        }
                    }
                }
                return;
            default:
                i2m0 i2m0Var = (i2m0) obj;
                if (event == Lifecycle.Event.ON_START) {
                    i2m0Var.h = true;
                    return;
                } else {
                    if (event == Lifecycle.Event.ON_STOP) {
                        i2m0Var.h = false;
                        return;
                    }
                    return;
                }
        }
    }
}
