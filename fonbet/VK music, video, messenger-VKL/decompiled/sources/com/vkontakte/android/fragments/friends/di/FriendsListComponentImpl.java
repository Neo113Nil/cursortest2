package com.vkontakte.android.fragments.friends.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.friends.impl.friends.di.FriendsListComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import xsna.c8m;
import xsna.fpf0;
import xsna.fqs;
import xsna.g8m;
import xsna.pwj0;

/* compiled from: FriendsListComponentImpl.kt */
/* loaded from: classes7.dex */
public final class FriendsListComponentImpl implements FriendsListComponent {
    public final ProfileFragmentProviderComponent a;

    /* compiled from: FriendsListComponentImpl.kt */
    public static final class a implements c8m<FriendsListComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new FriendsListComponentImpl((ProfileFragmentProviderComponent) g8mVar.a(fpf0.a(ProfileFragmentProviderComponent.class)));
        }
    }

    public FriendsListComponentImpl(ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = profileFragmentProviderComponent;
    }

    @Override // com.vk.friends.impl.friends.di.FriendsListComponent
    public final fqs b9() {
        return new fqs(this.a);
    }
}
