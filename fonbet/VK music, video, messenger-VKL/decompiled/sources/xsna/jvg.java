package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.catalog.info.popup.api.di.CatalogInfoPopupComponent;
import com.vk.core.telemetry.VideoOpenTelemetryComponentImpl;
import com.vk.music.di.DefaultPlayerUIComponentImpl;
import com.vk.music.player.api.PlayerBottomSheetStateHolder;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.superapp.auth.js.bridge.api.di.JsAuthDelegateComponent;
import com.vk.superapp.auth.js.bridge.impl.di.JsAuthDelegateComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.task.di.components.SuperAppPip2Component;
import java.util.concurrent.ExecutorService;
import kotlin.Result;
import xsna.rrw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class jvg implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jvg(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        switch (this.b) {
            case 0:
                return new zqu();
            case 1:
                return new Handler(Looper.getMainLooper());
            case 2:
                qcy<Object>[] qcyVarArr = DefaultPlayerUIComponentImpl.h;
                wza0 wza0Var = new wza0();
                wza0Var.a = PlayerBottomSheetStateHolder.State.STATE_HIDDEN;
                return wza0Var;
            case 3:
                return new rrw.b();
            case 4:
                return ljg.a;
            case 5:
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                a1wVar.a.getClass();
                return Long.valueOf(z4g.g(vdw.a.a()));
            case 6:
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                return nbc0.a;
            case 7:
                FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 8:
                return new g90();
            case 9:
                try {
                    failure = new JsAuthDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsAuthDelegateComponent.Companion.getClass();
                Object b = JsAuthDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 10:
                qcy<Object>[] qcyVarArr3 = SuperAppPip2Component.f;
                return new io.reactivex.rxjava3.subjects.f();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.FIRST_AUTOPLAY_ZONE;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                CatalogInfoPopupComponent.Companion.getClass();
                return CatalogInfoPopupComponent.Companion.a();
            case 13:
                return new VideoOpenTelemetryComponentImpl.a();
            case 14:
                asu0.a.getClass();
                ExecutorService executorService = (ExecutorService) asu0.W.getValue();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
            default:
                return Boolean.valueOf(com.vk.toggle.d.O());
        }
    }
}
