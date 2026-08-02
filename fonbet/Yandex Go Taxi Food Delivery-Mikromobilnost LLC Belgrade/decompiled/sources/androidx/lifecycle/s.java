package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.pey;

/* loaded from: classes.dex */
public final class s {
    public Lifecycle.State a;
    public q b;

    public final void a(pey peyVar, Lifecycle.Event event) {
        Lifecycle.State a = event.a();
        Lifecycle.State state = this.a;
        if (a != null && a.compareTo(state) < 0) {
            state = a;
        }
        this.a = state;
        this.b.M1(peyVar, event);
        this.a = a;
    }
}
