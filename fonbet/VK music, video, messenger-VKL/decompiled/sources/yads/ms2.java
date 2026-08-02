package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class ms2 {
    public final WeakReference a;

    public ms2(WeakReference weakReference) {
        this.a = weakReference;
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
