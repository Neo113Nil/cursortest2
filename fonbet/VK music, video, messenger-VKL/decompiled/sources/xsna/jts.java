package xsna;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: FriendsSelectionFragment.kt */
/* loaded from: classes15.dex */
public final class jts implements ActionMode.Callback {
    public final /* synthetic */ FriendsSelectionFragment a;

    public jts(FriendsSelectionFragment friendsSelectionFragment) {
        this.a = friendsSelectionFragment;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.ActionMode, java.lang.Object] */
    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        FriendsSelectionFragment friendsSelectionFragment = this.a;
        VkTopBar vkTopBar = new VkTopBar(friendsSelectionFragment.requireContext(), null, 6, 0);
        vkTopBar.setBack(new VkTopBar.b(new ocg(friendsSelectionFragment, 24), tq.h(tlo0.Companion, R.string.back), null, null, null, 28));
        Object obj = friendsSelectionFragment.h0;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0.a.c(R.string.friends_selection_title, Integer.valueOf(((md6) obj2).m.size())), null, null, null, null, 30), null, false ? 1 : 0, false ? 1 : 0, 14));
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new eko(dhr0.t.b(R.drawable.vk_icon_done_24, R.attr.toolbarIconsColor)), new tlo0.f(R.string.done), new k75(7, friendsSelectionFragment, actionMode), null, false ? 1 : 0, null, 56), null, 6));
        friendsSelectionFragment.m0 = vkTopBar;
        g7p0 g7p0Var = new g7p0(friendsSelectionFragment.requireContext());
        g7p0Var.addView(friendsSelectionFragment.m0);
        actionMode.setCustomView(g7p0Var);
        friendsSelectionFragment.o0 = this;
        friendsSelectionFragment.n0 = actionMode;
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        FriendsSelectionFragment friendsSelectionFragment = this.a;
        friendsSelectionFragment.n0 = null;
        gzs<s3q0> gzsVar = friendsSelectionFragment.p0;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
