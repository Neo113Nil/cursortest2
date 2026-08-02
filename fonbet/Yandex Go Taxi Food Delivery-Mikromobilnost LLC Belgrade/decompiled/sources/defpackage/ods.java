package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes10.dex */
public final class ods extends FragmentManager.a {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;

    public ods(yds ydsVar, Fragment fragment, FrameLayout frameLayout) {
        this.a = fragment;
        this.b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (fragment == this.a) {
            fragmentManager.r0(this);
            yds.f(view, this.b);
        }
    }
}
