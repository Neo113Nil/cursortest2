package defpackage;

import android.view.View;

/* loaded from: classes14.dex */
public final class adv {
    public final View a;
    public final zcv b;
    public final Runnable c;
    public long d;
    public long e;
    public boolean f;
    public long g;
    public final i8m h = new i8m(21, this);

    public adv(View view, zcv zcvVar, Runnable runnable) {
        this.a = view;
        this.b = zcvVar;
        this.c = runnable;
    }

    public final void a() {
        this.f = true;
        this.g = this.b.uptimeMillis();
        this.h.run();
    }
}
