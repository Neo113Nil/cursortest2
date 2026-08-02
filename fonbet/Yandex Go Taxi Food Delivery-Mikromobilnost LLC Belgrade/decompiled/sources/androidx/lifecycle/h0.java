package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public final class h0 implements Runnable {
    public final t a;
    public final Lifecycle.Event b;
    public boolean c;

    public h0(t tVar, Lifecycle.Event event) {
        this.a = tVar;
        this.b = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.g(this.b);
        this.c = true;
    }
}
