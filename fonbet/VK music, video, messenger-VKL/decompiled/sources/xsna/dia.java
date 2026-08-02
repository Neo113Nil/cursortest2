package xsna;

import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import com.vk.network.eventhub.impl.di.EventHubComponentImpl;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.io.File;
import java.util.Collection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dia(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ?? r0 = this.c;
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((ClipsTemplatesEditorComponent) r0.getValue()).l4();
            case 1:
                return ((BridgeComponent) ((gxw) this.c).c().a(fpf0.a(BridgeComponent.class))).ob();
            case 2:
                return ((VoipStereoRouterComponent) ((LinksBridgeComponentImpl) this.c).j.getValue()).a().a();
            case 3:
                MainActivity mainActivity = (MainActivity) this.c;
                String str = MainActivity.P;
                mainActivity.getClass();
                return new v8k0(mainActivity, q1w.a);
            case 4:
                return Boolean.valueOf(!((Collection) ((r360) this.c).e.getValue()).isEmpty());
            case 5:
                return new wf4((OfflineAudioDatabase_Impl) this.c);
            case 6:
                nwy nwyVar = ((PhotosComponentImpl) this.c).o;
                qcy<Object> qcyVar = PhotosComponentImpl.u[14];
                return new eh1((xh1) nwyVar.c());
            case 7:
                aid0 aid0Var = (aid0) this.c;
                xhd0 xhd0Var = aid0Var.b;
                return aid0Var.h(new tvz(xhd0Var.i.b(), xhd0Var.j, xhd0Var.b), new uso0[]{new LocalExifThumbnailProducer(xhd0Var.i.e(), xhd0Var.j, xhd0Var.a)});
            case 8:
                return new File((File) ((the0) this.c).a.getValue(), "notif_push_receiving_post");
            case 9:
                return Boolean.valueOf(((qks0) this.c).a);
            case 10:
                return new EventHubComponentImpl.a(((jau0) this.c).e);
            default:
                return ((VideoApiHelperComponent) ((k7m) m7m.f((kzv0) this.c)).a(fpf0.a(VideoApiHelperComponent.class))).N4();
        }
    }
}
