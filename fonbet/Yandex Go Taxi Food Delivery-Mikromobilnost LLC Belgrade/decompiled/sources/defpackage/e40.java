package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes7.dex */
public final class e40 implements r30, oey {
    public final LinkedHashSet a = new LinkedHashSet();
    public Lifecycle b;

    @w(Lifecycle.Event.ON_START)
    private final void onStart() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gey) it.next()).onStart();
        }
    }

    @w(Lifecycle.Event.ON_STOP)
    private final void onStop() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gey) it.next()).onStop();
        }
    }

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        Lifecycle lifecycle = ((HiddenLifecycleReference) ((wrr) l40Var).c).getLifecycle();
        this.b = lifecycle;
        if (lifecycle != null) {
            lifecycle.a(this);
        }
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        Lifecycle lifecycle = this.b;
        if (lifecycle != null) {
            lifecycle.d(this);
        }
        this.b = null;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        onAttachedToActivity(l40Var);
    }
}
