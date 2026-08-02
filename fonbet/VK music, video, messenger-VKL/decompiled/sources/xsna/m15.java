package xsna;

import android.os.Build;
import com.vk.auth.main.AuthActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.topics.api.di.TopicsComponent;
import com.vk.video.ui.smartcrop.api.di.SmartCropComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.ruo;
import xsna.z9o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m15 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m15(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 4;
        ?? r3 = this.c;
        switch (i) {
            case 0:
                int i3 = AuthActivity.W;
                return new d75((AuthActivity) r3);
            case 1:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((CatalogInteractorComponent) r3.getValue()).z0();
            case 2:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ral(new ew3(7, (sal) r3, new AtomicInteger(1))));
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                scheduledThreadPoolExecutor.setKeepAliveTime(30L, TimeUnit.SECONDS);
                return scheduledThreadPoolExecutor;
            case 3:
                ruo ruoVar = (ruo) r3;
                return new xuo(new ruo.a(ruoVar), new cbb(new ivo(blk.E(), new uuo(), ruoVar.b), i2));
            case 4:
                return ((BridgeComponent) ((gxw) r3).c().a(fpf0.a(BridgeComponent.class))).id();
            case 5:
                return ((TopicsComponent) ((LinksBridgeComponentImpl) r3).k.getValue()).n8();
            case 6:
                return e43.l(new so50(new pr6(21)), new l950(), new wdr0((md40) ((s750) r3).d.getValue(), new y8m(18)), new sd40(), new l550());
            case 7:
                return new fb50((OfflineAudioDatabase_Impl) r3);
            case 8:
                return (List) r3;
            case 9:
                PhotosComponentImpl photosComponentImpl = (PhotosComponentImpl) r3;
                qcy<Object>[] qcyVarArr2 = PhotosComponentImpl.u;
                aha0 d = f9t.d();
                ysg0<m7a0> a = photosComponentImpl.p7().a();
                nwy nwyVar = photosComponentImpl.g;
                qcy<Object> qcyVar = PhotosComponentImpl.u[6];
                return new com.vk.photos.root.common.b(d, a, (up1) nwyVar.c());
            case 10:
                aid0 aid0Var = (aid0) r3;
                if (Build.VERSION.SDK_INT < 29) {
                    throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                }
                xhd0 xhd0Var = aid0Var.b;
                return aid0Var.f(new xvz(xhd0Var.i.a(), xhd0Var.a));
            case 11:
                return new the0((VKApplication) r3);
            case 12:
                StoriesComponent storiesComponent = ((StoryViewerComponentImpl) r3).a;
                return new yrl0(storiesComponent.eb(), storiesComponent.w());
            case 13:
                return new z9o0.b((z9o0) r3);
            default:
                return ((SmartCropComponent) ((k7m) m7m.f((kzv0) r3)).a(fpf0.a(SmartCropComponent.class))).a();
        }
    }
}
