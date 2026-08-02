package xsna;

import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.topics.api.di.TopicsComponent;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.task.di.components.AuthBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q12 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q12(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                return ((w12) r1).b.h;
            case 1:
                return ((ImEngineLifecycleComponent) ((AuthBridgeComponentImpl) r1).g.getValue()).N();
            case 2:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((VideoAdFreeSubscriptionComponent) r1.getValue()).G1();
            case 3:
                return ((nig) r1).b;
            case 4:
                return ((ClipsConfigAuthorsComponent) ((gxw) r1).c().a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 5:
                return (TopicsComponent) ((g8m) r1).a(fpf0.a(TopicsComponent.class));
            case 6:
                return ((ny70) r1).a.a();
            case 7:
                return new lss0(fxc0.B().Y(), ((k6v0) r1).a);
            default:
                return new ad9(((VoipCallComponentImpl) r1).g);
        }
    }
}
