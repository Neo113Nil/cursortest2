package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import java.util.HashSet;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: AbsFollowersListFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class xa extends PropertyReference0Impl {
    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        boolean z;
        AbsFollowersListFragment absFollowersListFragment = (AbsFollowersListFragment) this.receiver;
        int i = AbsFollowersListFragment.Y;
        FragmentActivity activity = absFollowersListFragment.getActivity();
        if (activity != null) {
            HashSet hashSet = iah0.a;
            z = fnj.d(activity);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
