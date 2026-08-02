package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes12.dex */
public final class tcs extends FragmentManager.m {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;

    public tcs(scs scsVar, Fragment fragment, FrameLayout frameLayout) {
        this.a = fragment;
        this.b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public final void k(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view) {
        if (fragment == this.a) {
            fragmentManager.r0(this);
            scs.x0(view, this.b);
        }
    }
}
