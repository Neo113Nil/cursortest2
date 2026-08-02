package xsna;

import android.app.ActivityManager;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class egv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ egv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((AuthBridgeComponent) ((fgv) obj).c().a(fpf0.a(AuthBridgeComponent.class))).s();
            case 1:
                return ((BridgeComponent) ((gxw) obj).c().a(fpf0.a(BridgeComponent.class))).F();
            case 2:
                return (ActivityManager) ((r7x) obj).a.getSystemService(ActivityManager.class);
            case 3:
                return ((VkClientMultiAccountComponent) ((LinksBridgeComponentImpl) obj).f.getValue()).a();
            case 4:
                aid0 aid0Var = (aid0) obj;
                xhd0 xhd0Var = aid0Var.b;
                return aid0Var.h(new muz(xhd0Var.i.b(), xhd0Var.j), new uso0[]{new LocalExifThumbnailProducer(xhd0Var.i.e(), xhd0Var.j, xhd0Var.a)});
            default:
                StoryViewerComponentImpl storyViewerComponentImpl = (StoryViewerComponentImpl) obj;
                StoriesComponent storiesComponent = storyViewerComponentImpl.a;
                lrl0 bf = storiesComponent.bf();
                nwy nwyVar = storyViewerComponentImpl.d;
                qcy<Object> qcyVar = StoryViewerComponentImpl.s[1];
                return new hnm0(bf, (nnm0) nwyVar.c(), storiesComponent.w3());
        }
    }
}
