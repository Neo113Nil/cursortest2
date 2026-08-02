package xsna;

import android.util.Range;
import android.util.TypedValue;
import com.vk.accountmanager.di.AccountManagerComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerAdapterComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.draftslist.impl.di.DraftsListComponentImpl;
import com.vk.friends.impl.di.FeedFriendsComponentImpl;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.music.bottomsheets.audiobook.di.AudioBookBottomSheetComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class hu2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ hu2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new iu2());
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(newSingleThreadExecutor, true);
            case 1:
                return new wir();
            case 2:
                return new ClipsViewerAdapterComponentImpl.a();
            case 3:
                TypedValue typedValue = krv0.a;
                return krv0.b;
            case 4:
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                return new l9t();
            case 5:
                wjy wjyVar = wjy.a;
                return 8;
            case 6:
                return ((BridgeComponent) ((k7m) m7m.f(f620.b)).a(fpf0.a(BridgeComponent.class))).s();
            case 7:
                o2l.a.getClass();
                return Boolean.valueOf(BuildInfo.h() && o2l.b("__dbg_simulate_cmd_unrecoverable_errors", false));
            case 8:
                return new AudioBookBottomSheetComponentImpl.a();
            case 9:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                FeedFeatures feedFeatures = FeedFeatures.REDESIGN_INTERNAL_LINK;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 10:
                OKVoipEngine.b.getClass();
                return Boolean.valueOf(OKVoipEngine.q);
            case 11:
                return new ncl0(t6g0.c);
            case 12:
                VKApplication.a aVar = VKApplication.c;
                return Integer.valueOf(com.vk.toggle.d.m().c);
            case 13:
                return ((AccountManagerComponent) ((k7m) m7m.f(i9r0.a)).a(fpf0.a(AccountManagerComponent.class))).c();
            case 14:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_TOPBAR_VKUI;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 15:
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return new Range(Long.valueOf(timeUnit.toSeconds(1000L)), Long.valueOf(timeUnit.toSeconds(ynd.a() - 1)));
            case 16:
                return new FeedFriendsComponentImpl.a();
            case 17:
                return new DraftsListComponentImpl.a();
            default:
                asu0.a.getClass();
                bsu0 bsu0Var = (bsu0) asu0.E.getValue();
                return Boolean.valueOf(bsu0Var != null ? bsu0Var.b : false);
        }
    }
}
