package xsna;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: FirstFrameWaiter.java */
/* loaded from: classes12.dex */
public final class ilr implements hgs {
    public final Set<Activity> b = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean c;

    @Override // xsna.hgs
    public final void d(FragmentActivity fragmentActivity) {
        if (!this.c && this.b.add(fragmentActivity)) {
            View decorView = fragmentActivity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new hlr(this, decorView));
        }
    }
}
