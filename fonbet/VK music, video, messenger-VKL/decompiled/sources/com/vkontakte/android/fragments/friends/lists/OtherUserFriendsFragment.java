package com.vkontakte.android.fragments.friends.lists;

import com.vk.api.users.UsersSearch;
import com.vkontakte.android.fragments.friends.FriendsFragment;

/* compiled from: OtherUserFriendsFragment.kt */
/* loaded from: classes11.dex */
public final class OtherUserFriendsFragment extends FriendsFragment {
    public final UsersSearch.Entrypoint r0 = UsersSearch.Entrypoint.OtherPersonFriends;

    /* compiled from: OtherUserFriendsFragment.kt */
    /* loaded from: classes7.dex */
    public static final class a extends FriendsFragment.a {
        public a() {
            super(OtherUserFriendsFragment.class, null, null);
        }
    }

    @Override // com.vkontakte.android.fragments.friends.FriendsFragment
    public final UsersSearch.Entrypoint eo() {
        return this.r0;
    }
}
