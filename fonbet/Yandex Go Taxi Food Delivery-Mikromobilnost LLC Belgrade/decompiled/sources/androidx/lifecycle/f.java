package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.ny61;
import defpackage.pey;
import defpackage.w511;

/* loaded from: classes.dex */
public final class f implements q {
    public final DefaultLifecycleObserver a;
    public final q b;

    public f(DefaultLifecycleObserver defaultLifecycleObserver, q qVar) {
        this.a = defaultLifecycleObserver;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        int i = e.a[event.ordinal()];
        DefaultLifecycleObserver defaultLifecycleObserver = this.a;
        switch (i) {
            case 1:
                defaultLifecycleObserver.onCreate(peyVar);
                break;
            case 2:
                defaultLifecycleObserver.onStart(peyVar);
                break;
            case 3:
                defaultLifecycleObserver.onResume(peyVar);
                break;
            case 4:
                defaultLifecycleObserver.onPause(peyVar);
                break;
            case 5:
                defaultLifecycleObserver.onStop(peyVar);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(peyVar);
                break;
            case 7:
                ny61.g("ON_ANY must not been send by anybody");
                return;
            default:
                w511.b();
                return;
        }
        q qVar = this.b;
        if (qVar != null) {
            qVar.M1(peyVar, event);
        }
    }
}
