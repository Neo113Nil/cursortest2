package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class fc0 implements bd2 {
    public final cw a;
    public final z30 b;
    public final WeakReference c;

    public fc0(View view, cw cwVar, z30 z30Var) {
        this.a = cwVar;
        this.b = z30Var;
        this.c = new WeakReference(view);
    }

    @Override // yads.bd2
    public final void a() {
        View view = (View) this.c.get();
        if (view != null) {
            this.a.b(view);
            this.b.a(y30.e);
        }
    }
}
