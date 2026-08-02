package xsna;

import android.util.Base64;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.asset.manager.impl.di.VkAssetManagerComponentImpl;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.com.vk.donut.popup.impl.di.DonutPopupComponentImpl;
import com.vk.ecomm.verifiedseller.impl.di.VerifiedSellerComponentImpl;
import com.vk.im.chat.clips.decoration.impl.di.ImChatClipsDecorationScopedComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.music.subscription.impl.bridge.di.MiniAppSubscriptionComponentImpl;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.registration.funnels.di.SakAnalyticsComponentImpl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.voip.stereo.stub.join.di.VoipStereoJoinRouterComponentStub;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p5m implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ p5m(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                gzs<Boolean> gzsVar = q5m.a;
                r5m r5mVar = new r5m();
                r5mVar.a = gzsVar;
                return r5mVar;
            case 1:
                return new ImChatClipsDecorationScopedComponentImpl.a();
            case 2:
                return Base64.encodeToString((byte[]) uiw.a.getValue(), 2);
            case 3:
                return new CatalogVideoViewComponentImpl.a();
            case 4:
                return (NewsfeedOptionalAdsComponent) ((k7m) m7m.f(ce60.b)).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class));
            case 5:
                qcy<Object>[] qcyVarArr = PhotosComponentImpl.u;
                return new npn0(new es());
            case 6:
                qcy<Object>[] qcyVarArr2 = SakAnalyticsComponentImpl.f;
                return new e2a0();
            case 7:
                return new VerifiedSellerComponentImpl.a();
            case 8:
                qcy<Object>[] qcyVarArr3 = StoryViewerComponentImpl.s;
                return new knm0();
            case 9:
                return new q2n0(VkmSuccessRateEventBuilder.EventName.MSG_SEND);
            case 10:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 11:
                return Boolean.valueOf(fxc0.B().J().J());
            case 12:
                return new MiniAppSubscriptionComponentImpl.a();
            case 13:
                return new DonutPopupComponentImpl.a();
            case 14:
                return new VkAssetManagerComponentImpl.a();
            case 15:
                asu0.a.getClass();
                ExecutorService executorService = (ExecutorService) asu0.m0.getValue();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
            default:
                return new VoipStereoJoinRouterComponentStub.a();
        }
    }

    public /* synthetic */ p5m(VKApplication vKApplication) {
        this.b = 10;
    }
}
