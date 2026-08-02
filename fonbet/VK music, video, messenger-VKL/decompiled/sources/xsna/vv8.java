package xsna;

import android.webkit.CookieManager;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.ecomm.product_list.di.ProductListComponentImpl;
import com.vk.im.engine.di.ImReportersScopedComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.network.eventhub.impl.di.EventHubApiComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.assistant.api.di.AiAssistantComponent;
import com.vkontakte.android.VKApplication;
import xsna.tzp0;
import xsna.z7v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vv8 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vv8(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                CookieManager.getInstance().removeAllCookies(null);
                return s3q0.a;
            case 1:
                return new wv9();
            case 2:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return new qzv0();
            case 3:
                return z7v.a.a;
            case 4:
                return new ImReportersScopedComponentImpl.a();
            case 5:
                return new cib();
            case 6:
                return new ProductListComponentImpl.a();
            case 7:
                return new t2n0(VkmSuccessRateEventBuilder.EventName.PUSH_OPEN);
            case 8:
                return "en";
            case 9:
                VKApplication.a aVar = VKApplication.c;
                return (QueueSyncComponent) m7m.e().a(fpf0.a(QueueSyncComponent.class));
            case 10:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_AI_PLAYLIST_CARD;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 11:
                return new EventHubApiComponent.a();
            case 12:
                return new AiAssistantComponent.a();
            case 13:
                return new SilentAuthByLoginComponentImpl.a(new bpn0(new z58(16)));
            case 14:
                asu0.a.getClass();
                return asu0.y() ? asu0.n() : asu0.E(asu0.B.invoke(), "vk-fresco-computation-pool-thread-");
            default:
                return new tzp0.a();
        }
    }

    public /* synthetic */ vv8(VKApplication vKApplication) {
        this.b = 9;
    }
}
