package com.vkontakte.android.fragments.friends.lists;

import com.vk.api.users.UsersSearch;
import com.vkontakte.android.fragments.friends.FriendsFragment;

/* compiled from: GroupInviteFriendsFragment.kt */
/* loaded from: classes7.dex */
public final class GroupInviteFriendsFragment extends FriendsFragment {
    public final UsersSearch.Entrypoint r0 = UsersSearch.Entrypoint.InviteToGroup;

    /* compiled from: GroupInviteFriendsFragment.kt */
    public static final class a extends FriendsFragment.a {
    }

    @Override // com.vkontakte.android.fragments.friends.FriendsFragment
    public final UsersSearch.Entrypoint eo() {
        return this.r0;
    }
}
