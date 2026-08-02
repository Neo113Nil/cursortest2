package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.svq0;

/* compiled from: UserProfileWallOnboardingController.kt */
/* loaded from: classes4.dex */
public final class wwq0 {
    public final FragmentImpl a;
    public final jaa0 b;
    public boolean d;
    public svq0.b.i f;
    public RecyclerView g;
    public lap h;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new x2j0(this, 8));
    public boolean e = true;

    public wwq0(FragmentImpl fragmentImpl, jaa0 jaa0Var) {
        this.a = fragmentImpl;
        this.b = jaa0Var;
    }

    public static boolean b(int i, View view) {
        Rect F = bwt0.F(view);
        return view.isShown() && !F.isEmpty() && F.width() == view.getWidth() && F.height() == view.getHeight() && F.bottom <= i;
    }

    public final Integer a() {
        FragmentImpl fragmentImpl;
        View view;
        Resources resources;
        if (c() && (view = (fragmentImpl = this.a).getView()) != null) {
            int i = bwt0.F(view).bottom;
            Context mo2getContext = fragmentImpl.mo2getContext();
            if (mo2getContext != null && (resources = mo2getContext.getResources()) != null) {
                return Integer.valueOf(i - resources.getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
            }
        }
        return null;
    }

    public final boolean c() {
        if (!this.e) {
            return false;
        }
        FragmentImpl fragmentImpl = this.a;
        return fragmentImpl.getView() != null && fragmentImpl.getViewLifecycleOwner().getLifecycle().getCurrentState() == Lifecycle.State.RESUMED;
    }

    public final void d() {
        RecyclerView recyclerView;
        svq0.b.i iVar = this.f;
        if (iVar == null || this.d || !c() || (recyclerView = ((vxq0) this.b.c).p().c) == null) {
            return;
        }
        this.d = true;
        lap lapVar = new lap(this, iVar, recyclerView, 3);
        this.g = recyclerView;
        this.h = lapVar;
        if (recyclerView.post(lapVar)) {
            return;
        }
        this.g = null;
        this.h = null;
        this.d = false;
    }
}
