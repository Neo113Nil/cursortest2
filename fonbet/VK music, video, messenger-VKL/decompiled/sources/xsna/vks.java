package xsna;

import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.e;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FriendsAndFollowersRootFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class vks implements e.d, g0t {
    public final /* synthetic */ FriendsAndFollowersRootFragment b;

    public vks(FriendsAndFollowersRootFragment friendsAndFollowersRootFragment) {
        this.b = friendsAndFollowersRootFragment;
    }

    @Override // com.vk.core.view.components.tabs.e.d
    public final void a(VkTabs.c cVar, int i) {
        FriendsAndFollowersRootFragment.fo(this.b, cVar, i);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e.d) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.b, FriendsAndFollowersRootFragment.class, "configureTab", "configureTab(Lcom/vk/core/view/components/tabs/VkTabs$Tab;I)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
