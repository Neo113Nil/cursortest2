package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.AppBarShadowView;
import com.vk.profile.community.impl.ui.members.GroupMembersFragment;

/* compiled from: GroupMembersSearchDelegateCallbackImpl.kt */
/* loaded from: classes5.dex */
public final class qlu {
    public final GroupMembersFragment a;
    public final View b;
    public final Toolbar c;
    public final AppBarShadowView d;
    public final int e;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qlu(GroupMembersFragment groupMembersFragment, View view) {
        AppBarShadowView appBarShadowView;
        this.a = groupMembersFragment;
        this.b = view;
        this.c = groupMembersFragment.ho();
        View requireView = groupMembersFragment.requireView();
        ViewGroup viewGroup = requireView instanceof ViewGroup ? (ViewGroup) requireView : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                appBarShadowView = childAt instanceof AppBarShadowView ? (AppBarShadowView) childAt : null;
                if (appBarShadowView != null) {
                    break;
                } else {
                    i = i2;
                }
            }
            this.d = appBarShadowView;
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
            this.e = dVar != null ? dVar.a : 0;
        }
        appBarShadowView = null;
        this.d = appBarShadowView;
        ViewGroup.LayoutParams layoutParams2 = this.c.getLayoutParams();
        if (layoutParams2 instanceof AppBarLayout.d) {
        }
        this.e = dVar != null ? dVar.a : 0;
    }
}
