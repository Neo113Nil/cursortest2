package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import java.util.HashSet;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: AbsFriendsAndFollowersTabFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class ib extends PropertyReference0Impl {
    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        boolean z;
        AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) this.receiver;
        int i = AbsFriendsAndFollowersTabFragment.X;
        FragmentActivity activity = absFriendsAndFollowersTabFragment.getActivity();
        if (activity != null) {
            HashSet hashSet = iah0.a;
            z = fnj.d(activity);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
