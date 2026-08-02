package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.mvi.core.internal.executors.ThreadType;
import xsna.fi50;
import xsna.km50;

/* compiled from: MviSubscription.kt */
/* loaded from: classes3.dex */
public final class gn50<S extends km50> {
    public final fi50<S, ? extends fm50<? extends S>> a;

    public gn50(fi50<S, ? extends fm50<? extends S>> fi50Var) {
        this.a = fi50Var;
    }

    public final void a() {
        f5z f5zVar;
        Lifecycle lifecycle;
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType threadType = ThreadType.MAIN;
        aVar.getClass();
        ThreadType.a.a(threadType);
        fi50<S, ? extends fm50<? extends S>> fi50Var = this.a;
        ThreadType.a.a(threadType);
        fi50.c<S, ? extends fm50<? extends S>> cVar = fi50Var.a;
        if (cVar.a.isInitialized()) {
            ((tj50) cVar.a.getValue()).a = null;
        }
        fi50.a<S, ? extends fm50<? extends S>> aVar2 = fi50Var.c;
        if (aVar2 != null && (f5zVar = aVar2.b) != null && (lifecycle = f5zVar.getLifecycle()) != null) {
            lifecycle.removeObserver(fi50Var.b);
        }
        fi50Var.c = null;
    }
}
