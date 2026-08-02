package xsna;

import android.os.Handler;
import com.vk.auth.smartflow.impl.SmartflowComponentImpl;
import com.vk.cachecontrol.impl.CacheComponentImpl;
import com.vk.catalog2.common.ui.mvp.video.mvi.CatalogMviLegacyComponentImpl;
import com.vk.ecomm.verifiedseller.impl.di.VerifiedSellerComponentImpl;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.engine.di.executor.ImCmdDirectExecutorComponentImpl;
import com.vk.libvideo.di.VideoSubscriptionComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.superapp.advertisement.formats.api.AdvertisementOptionalFormatsComponent;
import com.vk.superapp.multiaccount.impl.MultiAccountComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.stereo.stub.common.di.VoipStereoRouterComponentStub;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.MenuComponentImpl;
import java.util.concurrent.ExecutorService;
import kotlin.text.Regex;
import okhttp3.o;
import ru.ok.android.externcalls.sdk.ConversationFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class yp6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ yp6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new Regex("\"type\":\"(.*?)\"");
            case 1:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return sjv0.a;
            case 2:
                qcy<Object>[] qcyVarArr2 = CacheComponentImpl.d;
                return new ix8();
            case 3:
                return new ImCmdDirectExecutorComponentImpl.a();
            case 4:
                return omg.a;
            case 5:
                qcy<Object>[] qcyVarArr3 = MenuComponentImpl.d;
                return new MenuComponentImpl.c();
            case 6:
                return new g80();
            case 7:
                qcy<Object>[] qcyVarArr4 = MultiAccountComponentImpl.e;
                r55 r55Var = r55.a;
                return new k340(r55.g());
            case 8:
                return new clb0();
            case 9:
                return new CatalogMviLegacyComponentImpl.a();
            case 10:
                ConversationFactory conversationFactory = OKVoipEngine.x;
                if (conversationFactory == null) {
                    return null;
                }
                return conversationFactory;
            case 11:
                return ((NewsFeedComponent) ((k7m) m7m.f(yzc0.b)).a(fpf0.a(NewsFeedComponent.class))).C7();
            case 12:
                AdvertisementOptionalFormatsComponent.Companion.getClass();
                return AdvertisementOptionalFormatsComponent.a.a();
            case 13:
                return new VerifiedSellerComponentImpl.a();
            case 14:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_OPEN_LIVE_AVATAR_CLCK;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 15:
                return new VideoSubscriptionComponentImpl.a();
            case 16:
                return new SmartflowComponentImpl.a();
            case 17:
                asu0.a.getClass();
                ExecutorService l = asu0.l();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(l, true);
            case 18:
                if (o25.a().b()) {
                    v9v0.b.getClass();
                    Handler handler = v9v0.c;
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(new f5m(2), 1000L);
                }
                return s3q0.a;
            case 19:
                return new VoipStereoRouterComponentStub.a();
            default:
                o260 o260Var = d260.a;
                o.a f = (o260Var != null ? o260Var : null).f(NetworkClient.ClientType.CLIENT_WEB);
                afx0 afx0Var = afx0.a;
                f.k = afx0.a(false);
                return new okhttp3.o(f);
        }
    }
}
