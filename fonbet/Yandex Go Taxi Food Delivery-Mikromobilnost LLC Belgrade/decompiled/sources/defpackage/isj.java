package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes12.dex */
public final class isj {
    public final ah00 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final b01 c = new b01(4, this);
    public Runnable d = new d82(1);
    public Runnable e = new d82(1);
    public uxh f;
    public boolean g;

    public isj(ah00 ah00Var) {
        this.a = ah00Var;
    }

    public final void a() {
        ((gh00) this.a).u(this.c);
        this.d = new d82(1);
        this.e = new d82(1);
    }
}
