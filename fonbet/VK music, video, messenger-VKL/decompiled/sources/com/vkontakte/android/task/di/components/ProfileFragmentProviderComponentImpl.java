package com.vkontakte.android.task.di.components;

import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.id.UserId;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import xsna.c8m;
import xsna.fkq0;
import xsna.g8m;
import xsna.npq0;
import xsna.pwd0;
import xsna.pwj0;
import xsna.voh;

/* compiled from: ProfileFragmentProviderComponentImpl.kt */
/* loaded from: classes11.dex */
public final class ProfileFragmentProviderComponentImpl implements ProfileFragmentProviderComponent {

    /* compiled from: ProfileFragmentProviderComponentImpl.kt */
    public static final class a implements c8m<ProfileFragmentProviderComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ProfileFragmentProviderComponentImpl();
        }
    }

    @Override // com.vk.profile.provider.di.ProfileFragmentProviderComponent
    public final pwd0 ye(UserId userId, String str) {
        return (fkq0.d(userId) || userId.equals(UserId.d)) ? new npq0(userId, str) : new voh(userId, str);
    }
}
