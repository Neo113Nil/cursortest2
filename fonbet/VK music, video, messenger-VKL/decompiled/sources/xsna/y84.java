package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import androidx.fragment.app.FragmentActivity;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.dto.VkOptionalNativeAdType;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.im.notification.settings.impl.MessengerNotificationSettingsComponentImpl;
import com.vk.im.ui.views.StencilLayout;
import com.vk.log.L;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.music.di.StickyPlayerComponent;
import com.vk.overlaymenu.launcher.OverlayMenuActivity;
import com.vk.poll.fragments.PollUserListFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import kotlin.Pair;
import ru.ok.android.onelog.uv.UVApiClientBuilder;
import xsna.a5g0;
import xsna.lk70;
import xsna.ls50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class y84 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ y84(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String userIdProvider$lambda$0;
        switch (this.b) {
            case 0:
                return new akc0();
            case 1:
                Pair pair = new Pair(Integer.valueOf(R.id.menu_messages), Integer.valueOf(TabMenuItemUiData.IM.h()));
                Pair pair2 = new Pair(Integer.valueOf(R.id.menu_newsfeed), Integer.valueOf(TabMenuItemUiData.HOME.h()));
                Pair pair3 = new Pair(Integer.valueOf(R.id.menu_clips), Integer.valueOf(TabMenuItemUiData.CLIPS.h()));
                Pair pair4 = new Pair(Integer.valueOf(R.id.menu_friends), Integer.valueOf(TabMenuItemUiData.FRIENDS.h()));
                Pair pair5 = new Pair(Integer.valueOf(R.id.menu_groups), Integer.valueOf(TabMenuItemUiData.GROUPS.h()));
                Pair pair6 = new Pair(Integer.valueOf(R.id.menu_videos), Integer.valueOf(TabMenuItemUiData.VIDEO.h()));
                Pair pair7 = new Pair(Integer.valueOf(R.id.menu_superapp), Integer.valueOf(TabMenuItemUiData.HUB.h()));
                Pair pair8 = new Pair(Integer.valueOf(R.id.menu_feedback), Integer.valueOf(TabMenuItemUiData.FEEDBACK.h()));
                Integer valueOf = Integer.valueOf(R.id.menu_audios);
                TabMenuItemUiData tabMenuItemUiData = TabMenuItemUiData.MUSIC;
                return pn00.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(valueOf, Integer.valueOf(tabMenuItemUiData.h())), new Pair(Integer.valueOf(R.id.menu_profile), Integer.valueOf(TabMenuItemUiData.PROFILE.h())), new Pair(Integer.valueOf(R.id.menu_search), Integer.valueOf(TabMenuItemUiData.OVERVIEW.h())), new Pair(Integer.valueOf(R.id.menu_games), Integer.valueOf(TabMenuItemUiData.GAMES.h())), new Pair(Integer.valueOf(R.id.menu_podcasts), Integer.valueOf(tabMenuItemUiData.h())));
            case 2:
                L.e("CanCallUseCase", "call attempt submitted");
                return s3q0.a;
            case 3:
                return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.getDefault());
            case 4:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                HashSet hashSet = iah0.a;
                boolean b = fnj.b(context);
                int i = iah0.f().widthPixels;
                if (b) {
                    Context context2 = e43.a;
                    i -= gjf0.a(context2 != null ? context2 : null, true);
                }
                return Integer.valueOf(i);
            case 5:
                bpn0 bpn0Var = u8r.a;
                return "uploadFileProvider";
            case 6:
                return s3q0.a;
            case 7:
                return s3q0.a;
            case 8:
                return new oos();
            case 9:
                qcy<Object>[] qcyVarArr = MessengerNotificationSettingsComponentImpl.e;
                a1w a1wVar = q1w.a;
                if (a1wVar != null) {
                    return a1wVar;
                }
                return null;
            case 10:
                return s3q0.a;
            case 11:
                return s3q0.a;
            case 12:
                int i2 = cr30.n;
                return Boolean.TRUE;
            case 13:
                q0m q0mVar = new q0m();
                UiTracker uiTracker = UiTracker.a;
                UiTracker.c();
                UiTracker.j.b();
                return q0mVar;
            case 14:
                FeedFeatures feedFeatures = FeedFeatures.FEED_OPEN_POST_LINK;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 15:
                String str = ((BridgeComponent) ((k7m) m7m.f(new lk70.a())).a(fpf0.a(BridgeComponent.class))).s().o().c;
                return str == null ? "" : str;
            case 16:
                return new no10();
            case 17:
                x290 x290Var = x290.a;
                Activity b2 = x290.b();
                if (b2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (b2 instanceof FragmentActivity) {
                    new a5g0.a(b2, null, 6).u0(dhr0.C().b ? R.style.OverlayMenuActivityThemeLight : R.style.OverlayMenuActivityThemeDark).I0("ReportBottomSheetDialog");
                } else {
                    int i3 = OverlayMenuActivity.m;
                    b2.startActivity(new Intent(b2, (Class<?>) OverlayMenuActivity.class).addFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING).addFlags(1073741824).addFlags(SQLiteDatabase.OPEN_PRIVATECACHE));
                }
                return s3q0.a;
            case 18:
                int i4 = PollUserListFragment.U0;
                return new kub0();
            case 19:
                yzc0 yzc0Var = yzc0.b;
                return Boolean.valueOf(((NewsfeedOptionalAdsComponent) yzc0.c.getValue()).T1(VkOptionalNativeAdType.APPLOVIN));
            case 20:
                return new b8u();
            case 21:
                return Boolean.valueOf(p1p0.a(com.vk.toggle.b.A.i(CoreFeatures.QUEUE_NEW_SUBSCRIBE)));
            case 22:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.CAPTCHA, null, null, null, 30);
                return s3q0.a;
            case 23:
                com.vk.voip.ui.a.a.getClass();
                com.vk.voip.ui.a.f();
                return s3q0.a;
            case 24:
                return new ffj0();
            case 25:
                return new ks50(ls50.b.a);
            case 26:
                int i5 = StencilLayout.i;
                return new Matrix();
            case 27:
                qcy<Object>[] qcyVarArr2 = StickyPlayerComponent.c;
                return new oel0();
            case 28:
                StoriesFeatures storiesFeatures = StoriesFeatures.SAFE_UPDATE;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            default:
                userIdProvider$lambda$0 = UVApiClientBuilder.userIdProvider$lambda$0();
                return userIdProvider$lambda$0;
        }
    }
}
