package xsna;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.dto.common.data.Subscription;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.notifications.subscription.MusicBuyMusicSubscriptionFragment;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import io.appmetrica.analytics.impl.L2;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph6 implements izs {
    public final /* synthetic */ String b;
    public final /* synthetic */ AppCompatActivity c;
    public final /* synthetic */ String d;
    public final /* synthetic */ com.vk.music.notifications.restriction.d e;
    public final /* synthetic */ MusicRestrictionPopupDisplayer.SubscriptionPopupType f;

    public /* synthetic */ ph6(String str, AppCompatActivity appCompatActivity, String str2, com.vk.music.notifications.restriction.d dVar, MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType) {
        this.b = str;
        this.c = appCompatActivity;
        this.d = str2;
        this.e = dVar;
        this.f = subscriptionPopupType;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Set set;
        zym0 zym0Var = crx0.x;
        Subscription subscription = (Subscription) obj;
        bn40.f("canShowAlternativePaymentMethod=" + subscription.D);
        String str = this.b;
        boolean equals = str.equals("miniapp");
        boolean z = BuildInfo.u() && BuildInfo.n() && !MusicFeatures.AUDIO_RUSTORE_SUBSCRIPTION.h();
        AppCompatActivity appCompatActivity = this.c;
        String str2 = this.d;
        if (equals || !(subscription.D || z)) {
            com.vk.music.notifications.restriction.d dVar = this.e;
            dVar.b.e(str, subscription.t);
            boolean z2 = subscription.t;
            iy2 iy2Var = new iy2(6);
            MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType = this.f;
            rh6 rh6Var = new rh6(dVar, str, subscriptionPopupType, appCompatActivity, 0);
            th4 th4Var = new th4(1, dVar, str);
            if (appCompatActivity.getResources().getBoolean(R.bool.music_buy_music_suscription_tabled_layout_allowed)) {
                b920 tc40Var = subscriptionPopupType == MusicRestrictionPopupDisplayer.SubscriptionPopupType.WINK_UPGRADE ? new tc40() : subscriptionPopupType == MusicRestrictionPopupDisplayer.SubscriptionPopupType.COMBO_UPGRADE ? new tc40() : new uc40();
                switch (str.hashCode()) {
                    case -1332194002:
                        if (str.equals(L2.g)) {
                            set = rl3.y0(new zym0[]{crx0.s, zym0Var});
                            break;
                        }
                        set = EmptySet.b;
                        break;
                    case 96432:
                        if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                            set = rl3.y0(new zym0[]{crx0.r, crx0.z});
                            break;
                        }
                        set = EmptySet.b;
                        break;
                    case 102225:
                        if (str.equals("geo")) {
                            set = rl3.y0(new zym0[]{crx0.q, zym0Var});
                            break;
                        }
                        set = EmptySet.b;
                        break;
                    case 1427818632:
                        if (str.equals("download")) {
                            set = rl3.y0(new zym0[]{crx0.p, crx0.A});
                            break;
                        }
                        set = EmptySet.b;
                        break;
                    default:
                        set = EmptySet.b;
                        break;
                }
                com.vk.music.notifications.inapp.b.f(new wc40(tc40Var, set, iy2Var, rh6Var, th4Var), null, null, 14);
            } else {
                int i = MusicBuyMusicSubscriptionFragment.V;
                int i2 = CustomisableBottomSheetFragment.S;
                MusicBuyMusicSubscriptionFragment musicBuyMusicSubscriptionFragment = new MusicBuyMusicSubscriptionFragment();
                Bundle bundle = new Bundle();
                bundle.putString("MUSIC_SUBSCRIPTION_TYPE", subscriptionPopupType.h());
                bundle.putString("MUSIC_SUBSCRIPTION_POPUP_SOURCE", str);
                bundle.putBoolean("MUSIC_SUBSCRIPTION_IS_TRIAL", z2);
                bundle.putString("MUSIC_SUBSCRIPTION_STATUS", str2);
                musicBuyMusicSubscriptionFragment.setArguments(bundle);
                s3q0 s3q0Var = s3q0.a;
                CustomisableBottomSheetFragment.b.a(appCompatActivity, musicBuyMusicSubscriptionFragment, "MusicBuyMusicSubscriptionFragment");
            }
        } else {
            maz e = xwk.d().e();
            String str3 = vm40.a;
            maz.c(e, appCompatActivity, vm40.c(str, str2), LaunchContext.A, null, null, 24);
        }
        return s3q0.a;
    }
}
