package xsna;

import com.vk.ads.externalsdkstat.impl.di.AdsSdkStatTrackerComponentImpl;
import com.vk.dialogstoolbar.impl.di.VkAppDialogsToolbarInternalFeatureComponent;
import com.vk.ecomm.cart.impl.di.CartComponentImpl;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.pref.MusicPrefsComponentImpl;
import com.vk.network.di.NetworkComponent;
import com.vk.notifications.list.impl.di.NotificationListComponentImpl;
import com.vk.superapp.vibration.js.bridge.api.di.JsVibrationDelegateComponent;
import com.vk.superapp.vibration.js.bridge.impl.di.JsVibrationDelegateComponentImpl;
import com.vk.textformat.di.MsgTextFormatComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.clips.ClipsEditorComponentVkApp;
import kotlin.Result;
import xsna.asu0;
import xsna.k840;
import xsna.qh4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dw9 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ dw9(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        boolean z;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = CartComponentImpl.f;
                return new zxl();
            case 1:
                return new ClipsEditorComponentVkApp.a();
            case 2:
                return nlg.a;
            case 3:
                qcy<Object>[] qcyVarArr2 = MarketComponentImpl.l;
                return new fml0();
            case 4:
                qcy<Object>[] qcyVarArr3 = MsgTextFormatComponentImpl.c;
                return new q040();
            case 5:
                return !k840.a.i() ? qh4.a.a.getSTUB() : ((OfflineAudioComponent) k840.a.b().a(fpf0.a(OfflineAudioComponent.class))).Ae();
            case 6:
                return new MusicPrefsComponentImpl.a();
            case 7:
                FeedFeatures feedFeatures = FeedFeatures.DISABLE_PLAYLIST_ANIM;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures) && com.vk.toggle.d.j().b);
            case 8:
                return new r4e0();
            case 9:
                try {
                    failure = new JsVibrationDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsVibrationDelegateComponent.Companion.getClass();
                Object b = JsVibrationDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 10:
                VKApplication.a aVar = VKApplication.c;
                try {
                    z = ((NetworkComponent) m7m.e().a(fpf0.a(NetworkComponent.class))).vd().g().l;
                } catch (IllegalStateException unused) {
                    b260.o.getClass();
                    z = b260.p.l;
                }
                return Boolean.valueOf(!z);
            case 11:
                return new AdsSdkStatTrackerComponentImpl.a();
            case 12:
                return new NotificationListComponentImpl.a();
            case 13:
                return new VkAppDialogsToolbarInternalFeatureComponent.a();
            default:
                asu0 asu0Var = asu0.a;
                asu0.a invoke = asu0.x.invoke();
                asu0Var.getClass();
                return asu0.E(invoke, "vk-one-log-thread-");
        }
    }

    public /* synthetic */ dw9(VKApplication vKApplication) {
        this.b = 10;
    }
}
