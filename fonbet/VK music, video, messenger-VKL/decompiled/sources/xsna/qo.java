package xsna;

import android.content.Context;
import com.vk.ads.yandex.impl.di.YandexAdFeatureComponentImpl;
import com.vk.companion.provider.AccountInfoContentProvider;
import com.vk.ecomm.cart.impl.di.CartComponentImpl;
import com.vk.folders.impl.di.FoldersComponentImpl;
import com.vk.music.di.VkAppPlayerUIComponentImpl;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.notifications.di.NotificationsComponentImpl;
import com.vk.superapp.dating.sdk.js.bridge.api.di.JsDatingSdkDelegateComponent;
import com.vk.superapp.dating.sdk.js.bridge.impl.di.JsDatingSdkDelegateComponentImpl;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import kotlin.Result;
import xsna.abo;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qo implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qo(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        switch (this.b) {
            case 0:
                int i = AccountInfoContentProvider.c;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return new po(context.getPackageName());
            case 1:
                return Boolean.valueOf(o25.a().b());
            case 2:
                qcy<Object>[] qcyVarArr = CartComponentImpl.f;
                return new f8c();
            case 3:
                qcy<Object>[] qcyVarArr2 = FoldersComponentImpl.e;
                return new b2s();
            case 4:
                return !k840.a.i() ? abo.a.a.getSTUB() : ((OfflineAudioComponent) k840.a.b().a(fpf0.a(OfflineAudioComponent.class))).l8();
            case 5:
                return new VkAppPlayerUIComponentImpl.a();
            case 6:
                qcy<Object>[] qcyVarArr3 = NewsFeedComponentImpl.D;
                return odg0.a;
            case 7:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 8:
                return (NewsFeedComponent) ((k7m) m7m.f(yzc0.b)).a(fpf0.a(NewsFeedComponent.class));
            case 9:
                try {
                    failure = new JsDatingSdkDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsDatingSdkDelegateComponent.Companion.getClass();
                Object b = JsDatingSdkDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 10:
                return new YandexAdFeatureComponentImpl.a();
            case 11:
                return new NotificationsComponentImpl.a();
            case 12:
                return (SessionManagementComponent) m7m.e().a(fpf0.a(SessionManagementComponent.class));
            default:
                asu0.a.getClass();
                return asu0.y() ? asu0.n() : asu0.E(asu0.w.invoke(), "vk-network-thread-");
        }
    }

    public /* synthetic */ qo(VKApplication vKApplication) {
        this.b = 12;
    }
}
