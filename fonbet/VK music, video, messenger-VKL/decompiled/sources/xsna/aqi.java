package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.core.preference.Preference;
import com.vk.libvideo.video.queue.impl.di.VideoQueueComponentImpl;
import com.vk.music.di.DefaultPlayerUIComponentImpl;
import com.vk.superapp.common.js.bridge.api.di.JsCommonDelegateComponent;
import com.vk.superapp.common.js.bridge.impl.di.JsCommonDelegateComponentImpl;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.StickersBridgeComponentImpl;
import com.vkontakte.android.task.di.components.SuperAppPip2Component;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.Result;
import xsna.mgn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class aqi implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ aqi(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        switch (this.b) {
            case 0:
                return androidx.compose.runtime.k.b(Boolean.valueOf(bqi.a));
            case 1:
                qcy<Object>[] qcyVarArr = DefaultPlayerUIComponentImpl.h;
                return new e5b0(UUID.randomUUID());
            case 2:
                return ylg.a;
            case 3:
                MenuApiApplicationsCache menuApiApplicationsCache = MenuApiApplicationsCache.b;
                return MenuApiApplicationsCache.c(MenuApiApplicationsCache.AppsType.GAME);
            case 4:
                a1w a1wVar = q1w.a;
                if (a1wVar != null) {
                    return a1wVar;
                }
                return null;
            case 5:
                Preference.a.getClass();
                return (ExecutorService) Preference.d.getValue();
            case 6:
                return ((BridgeComponent) ((k7m) m7m.f(yzc0.b)).a(fpf0.a(BridgeComponent.class))).s();
            case 7:
                try {
                    failure = new JsCommonDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsCommonDelegateComponent.Companion.getClass();
                Object b = JsCommonDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 8:
                mgn0 mgn0Var = dgn0.a;
                mgn0 mgn0Var2 = dgn0.a;
                return mgn0.h.a.a((mgn0.h) (mgn0Var2 != null ? mgn0Var2 : null).j.getValue(), "sak_session_repository_thread", 10, 4);
            case 9:
                qcy<Object>[] qcyVarArr2 = SuperAppPip2Component.f;
                return new SuperAppPip2Component.b();
            case 10:
                VKApplication.a aVar = VKApplication.c;
                k720 k720Var = k720.a;
                io.reactivex.rxjava3.core.q l = wmi0.a.l("key_supper_app_menu_cache_serialization", io.reactivex.rxjava3.android.schedulers.a.b());
                asu0 asu0Var = asu0.a;
                l.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new a1v(new z0v(1), 1));
                return s3q0.a;
            case 11:
                return new VideoQueueComponentImpl.a();
            case 12:
                return new StickersBridgeComponentImpl.a();
            case 13:
                asu0.a.getClass();
                ExecutorService h = asu0.h();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(h, true);
            default:
                return jfv0.k ? new fof0() : new pfv0(new ufm0(9), (rfv0) jfv0.p.getValue());
        }
    }
}
