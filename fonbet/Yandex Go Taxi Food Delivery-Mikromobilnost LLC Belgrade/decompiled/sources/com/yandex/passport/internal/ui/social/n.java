package com.yandex.passport.internal.ui.social;

import android.os.Bundle;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import defpackage.wwg;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class n {
    public static SocialFragment a(AuthTrack authTrack, SocialConfiguration socialConfiguration, boolean z, ModernAccount modernAccount) {
        SocialFragment socialFragment = new SocialFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(BaseTrack.KEY_TRACK, authTrack);
        bundle.putParcelable("social-type", socialConfiguration);
        bundle.putParcelable("uid", null);
        bundle.putBoolean("use-native", z);
        if (modernAccount != null) {
            bundle.putAll(wwg.g(new Pair("master-account", modernAccount)));
        }
        socialFragment.setArguments(bundle);
        return socialFragment;
    }
}
