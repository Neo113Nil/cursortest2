package xsna;

import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.core.deviceid.contentprovider.DeviceIdContentProvider;
import com.vk.feed.blacklist.api.di.BlacklistComponent;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.io.File;
import xsna.eil0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class eia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eia(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((ClipsTemplatesEditorComponent) r1.getValue()).l5();
            case 1:
                int i2 = DeviceIdContentProvider.c;
                return new y5m(((DeviceIdContentProvider) r1).getContext().getPackageName());
            case 2:
                ruo ruoVar = (ruo) r1;
                return new gvo((xuo) ruoVar.c.getValue(), (svo) ruoVar.e.getValue(), (suo) ruoVar.d.getValue());
            case 3:
                return ((BlacklistComponent) ((LinksBridgeComponentImpl) r1).l.getValue()).B5();
            case 4:
                return new elb((OfflineAudioDatabase_Impl) r1);
            case 5:
                aid0 aid0Var = (aid0) r1;
                xhd0 xhd0Var = aid0Var.b;
                return aid0Var.h(new ytz(xhd0Var.i.b(), xhd0Var.j, xhd0Var.c), new uso0[]{new LocalExifThumbnailProducer(xhd0Var.i.e(), xhd0Var.j, xhd0Var.a)});
            case 6:
                return new File((File) ((the0) r1).a.getValue(), "notif_push_pipeline_analytic");
            default:
                return new eil0.f(((eil0) r1).a);
        }
    }
}
