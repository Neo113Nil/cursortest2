package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.PagerViewBottomSheetBehavior;
import com.vk.attachpicker.b;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.attachpicker.widget.ContentViewPager;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import xsna.sw50;

/* compiled from: CommonAttachPickerImpl.kt */
/* loaded from: classes7.dex */
public final class ghg implements sw50.a {
    @Override // xsna.sw50.a
    public final j34 a(Fragment fragment) {
        return c(fragment.getActivity());
    }

    @Override // xsna.sw50.a
    public final void b(AttachVideoFragment attachVideoFragment) {
        FragmentActivity activity = attachVideoFragment.getActivity();
        ContentViewPager contentViewPager = activity != null ? (ContentViewPager) activity.findViewById(R.id.pager) : null;
        ViewGroup.LayoutParams layoutParams = contentViewPager != null ? contentViewPager.getLayoutParams() : null;
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        Object obj = fVar != null ? fVar.a : null;
        PagerViewBottomSheetBehavior pagerViewBottomSheetBehavior = obj instanceof PagerViewBottomSheetBehavior ? (PagerViewBottomSheetBehavior) obj : null;
        if (pagerViewBottomSheetBehavior != null) {
            pagerViewBottomSheetBehavior.X(3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sw50.a
    public final j34 c(Activity activity) {
        if (activity instanceof j34) {
            return (j34) activity;
        }
        return null;
    }

    @Override // xsna.sw50.a
    public final boolean d(FragmentImpl fragmentImpl) {
        return fragmentImpl.getActivity() instanceof f44;
    }

    @Override // xsna.sw50.a
    public final b.InterfaceC0381b e(FragmentImpl fragmentImpl) {
        LayoutInflater.Factory activity = fragmentImpl.getActivity();
        if (activity instanceof b.InterfaceC0381b) {
            return (b.InterfaceC0381b) activity;
        }
        return null;
    }

    @Override // xsna.sw50.a
    public final d1m0 f(StoryFragment storyFragment) {
        LayoutInflater.Factory activity = storyFragment.getActivity();
        if (activity instanceof d1m0) {
            return (d1m0) activity;
        }
        return null;
    }
}
