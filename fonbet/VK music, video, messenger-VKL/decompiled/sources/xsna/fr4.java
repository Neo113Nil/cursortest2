package xsna;

import android.content.Context;
import com.vk.accountmanager.di.AccountManagerComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.music.model.di.AudioModelsComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.notifications.dnd.api.di.DndComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.task.di.components.AuthBridgeComponentImpl;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.onelog.uv.composite.CompositeApiClientBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class fr4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fr4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ApiClient build;
        int i = this.b;
        ?? r3 = this.c;
        switch (i) {
            case 0:
                return ((AudioModelsComponentImpl) r3).a.q1();
            case 1:
                return ((AccountManagerComponent) ((AuthBridgeComponentImpl) r3).d.getValue()).c();
            case 2:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((VideoApiHelperComponent) r3.getValue()).N4();
            case 3:
                return Boolean.valueOf((b4k.e.a() && h320.a((Context) r3)) ? false : true);
            case 4:
                return ((VoipCallComponent) ((k7m) m7m.f((png) r3)).a(fpf0.a(VoipCallComponent.class))).a();
            case 5:
                build = ((CompositeApiClientBuilder) r3).build();
                return build;
            case 6:
                return ((DndComponent) ((gxw) r3).c().a(fpf0.a(DndComponent.class))).Ta();
            case 7:
                return ((NewsFeedComponent) ((k7m) m7m.f((pb60) r3)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 8:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new qul0(((StoriesComponentImpl) r3).w());
            case 9:
                if (((qks0) r3).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_SYSTEM;
                    videoFeatures.getClass();
                    r2 = com.vk.toggle.b.A.a(videoFeatures);
                }
                return Boolean.valueOf(r2);
            case 10:
                o2v0 o2v0Var = (o2v0) r3;
                rk8 browser = o2v0Var.getBrowser();
                StoryViewerRouter storyViewerRouter = (StoryViewerRouter) o2v0Var.c.getValue();
                pga0 pga0Var = new pga0(rwi.d(), hd60.a(), myc0.d());
                lpg0 lpg0Var = (lpg0) o2v0Var.a.getValue();
                fy9 fy9Var = (fy9) o2v0Var.b.getValue();
                ajg0 ajg0Var = (ajg0) o2v0Var.d.getValue();
                hy80 hy80Var = (hy80) o2v0Var.e.getValue();
                ?? r12 = o2v0Var.m;
                ?? r13 = o2v0Var.n;
                ?? r14 = o2v0Var.o;
                ?? r15 = o2v0Var.p;
                ?? r2 = o2v0Var.f;
                ?? r4 = o2v0Var.g;
                mh70 mh70Var = (mh70) r4.getValue();
                zb70 zb70Var = (zb70) o2v0Var.h.getValue();
                ?? r0 = o2v0Var.i;
                j2x0 j2x0Var = (j2x0) o2v0Var.j.getValue();
                n9p0 n9p0Var = (n9p0) o2v0Var.k.getValue();
                ?? r02 = o2v0Var.l;
                return new j63(new j53(browser, storyViewerRouter, pga0Var, lpg0Var, fy9Var, ajg0Var, hy80Var, r12, r13, r14, r15, r2, mh70Var, zb70Var, r0, j2x0Var, n9p0Var, (ie7) r02.getValue(), (jwn0) o2v0Var.t.getValue(), (a550) o2v0Var.u.getValue(), (qqm) o2v0Var.w.getValue(), o2v0Var.v, o2v0Var.q, (ivg) o2v0Var.r.getValue(), (rml0) o2v0Var.s.getValue(), (wnr0) o2v0Var.x.getValue(), (xqg) o2v0Var.y.getValue(), (w1h) o2v0Var.z.getValue(), (er40) o2v0Var.A.getValue(), (shb0) o2v0Var.B.getValue(), (qct) o2v0Var.C.getValue(), (wro) o2v0Var.E.getValue(), o2v0Var.D, o2v0Var.F), new ipu0((ie7) r02.getValue(), (mh70) r4.getValue()), o2v0Var.getBrowser());
            default:
                VoipCallComponentImpl voipCallComponentImpl = (VoipCallComponentImpl) r3;
                return new i1w0(voipCallComponentImpl.a.a, voipCallComponentImpl.d.M8());
        }
    }
}
