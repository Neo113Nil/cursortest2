package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import flex.engine.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class j3k implements DefaultLifecycleObserver {
    public final b3k a;
    public final l3k b;
    public final w0j c;
    public final int w;
    public final int x;
    public boolean y;
    public final HashMap z = new HashMap();
    public final LinkedList A = new LinkedList();

    public j3k(b3k b3kVar, l3k l3kVar, w0j w0jVar, int i, int i2) {
        this.a = b3kVar;
        this.b = l3kVar;
        this.c = w0jVar;
        this.w = i;
        this.x = i2;
    }

    public final HashMap a() {
        if (!this.y) {
            ((a) this.c.b).m().a(this);
            this.y = true;
        }
        return this.z;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            for (gd7 gd7Var : (LinkedList) it.next()) {
                gd7Var.b.setActionHandler(null);
                gd7Var.b.cleanup();
            }
        }
        a().clear();
        this.A.clear();
        this.y = false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
    }
}
