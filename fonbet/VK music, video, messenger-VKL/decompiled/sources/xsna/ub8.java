package xsna;

import com.vk.api.sdk.VKApiConfig;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.ecomm.contentproducts.di.ContentProductsComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.protect.di.ProtectAppComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.ArrayList;
import xsna.eil0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ub8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ub8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        ?? r2 = this.c;
        switch (i) {
            case 0:
                return (PhotosComponent) ((g8m) r2).a(fpf0.a(PhotosComponent.class));
            case 1:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((AppContextDiComponent) r2.getValue()).a;
            case 2:
                return ((m9r) r2).a.invoke();
            case 3:
                return ((ContentProductsComponent) ((LinksBridgeComponentImpl) r2).B.getValue()).a();
            case 4:
                qcy<Object>[] qcyVarArr2 = ProtectAppComponentImpl.i;
                return new bpn0(new n66((ProtectAppComponentImpl) r2, 6));
            case 5:
                return new eil0.g(((eil0) r2).a);
            case 6:
                rmk0 rmk0Var = new rmk0(2);
                rmk0Var.b(((VKApiConfig) r2).K.toArray(new cpm0[0]));
                rmk0Var.a(new xml());
                ArrayList<Object> arrayList = rmk0Var.a;
                return new mbg0(e43.l(arrayList.toArray(new cpm0[arrayList.size()])));
            default:
                if (((qks0) r2).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_SUPERAPP_INTERNAL_PHOTO_PICKER;
                    videoFeatures.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures);
                }
                return Boolean.valueOf(z);
        }
    }
}
