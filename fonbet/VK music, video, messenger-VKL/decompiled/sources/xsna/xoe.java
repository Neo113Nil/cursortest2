package xsna;

import android.app.Activity;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;

/* compiled from: ClipsOwnerSwipeNavigationTrackingDelegate.kt */
/* loaded from: classes17.dex */
public final class xoe {
    public final ClipsOwnerSwipeFragment.e a;
    public final ClipsOwnerSwipeFragment.f b;
    public boolean c;

    public xoe(ClipsOwnerSwipeFragment.e eVar, ClipsOwnerSwipeFragment.f fVar) {
        this.a = eVar;
        this.b = fVar;
    }

    public final void a() {
        this.c = false;
    }

    public final void b() {
        this.c = true;
    }

    public final void c() {
        FragmentImpl fragmentImpl;
        if (this.c || (fragmentImpl = (FragmentImpl) this.b.invoke()) == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        UiTracker.f((Activity) this.a.invoke()).a(null, fragmentImpl, true);
    }
}
