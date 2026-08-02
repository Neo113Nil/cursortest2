package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.donut.impl.PaidSubscriptionsFragment;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.subscriptions.SubscriptionFragment;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.toggle.features.MusicFeatures;
import com.vk.webapp.fragments.SubscriptionsFragment;
import xsna.sw50;

/* compiled from: PaidSubscriptionsNavBridge.kt */
/* loaded from: classes7.dex */
public final class cg90 implements sw50.m {
    @Override // xsna.sw50.m
    public final void a(FragmentImpl fragmentImpl, GameSubscription gameSubscription) {
        SubscriptionFragment.a aVar = new SubscriptionFragment.a(SubscriptionFragment.class, null, null);
        aVar.j.putParcelable("extra_game_subscription", gameSubscription);
        aVar.g(422, fragmentImpl);
    }

    @Override // xsna.sw50.m
    public final void b(PaidSubscriptionsFragment paidSubscriptionsFragment) {
        boolean j;
        boolean z = false;
        if (BuildInfo.u()) {
            j = BuildInfo.j() || BuildInfo.k() || (BuildInfo.n() && MusicFeatures.AUDIO_RUSTORE_SUBSCRIPTION.h());
        } else {
            j = BuildInfo.j();
        }
        if (j && !BuildInfo.e()) {
            z = true;
        }
        if (z) {
            new MusicSubscriptionControlFragment.a().l(paidSubscriptionsFragment);
            return;
        }
        int i = SubscriptionsFragment.a0;
        Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
        int i2 = VKSuperAppBrowserFragment.Y;
        new SubscriptionsFragment.a(a.authority(VKSuperAppBrowserFragment.a.a()).appendEncodedPath("account/#/subs").build().toString(), InternalMiniApps.ACCOUNT.h().a, SubscriptionsFragment.class, false, 20).l(paidSubscriptionsFragment);
    }
}
