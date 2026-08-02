package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class te0 implements bd2 {
    public final j13 a;
    public final WeakReference b;

    public te0(View view, j13 j13Var) {
        this.a = j13Var;
        this.b = new WeakReference(view);
    }

    @Override // yads.bd2
    public final void a() {
        View view = (View) this.b.get();
        if (view != null) {
            this.a.b(view);
        }
    }
}
