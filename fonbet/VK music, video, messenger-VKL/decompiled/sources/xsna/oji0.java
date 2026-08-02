package xsna;

import com.vk.catalog.mvi.block.video.api.CatalogVideoViewComponent;
import com.vk.log.L;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class oji0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oji0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((qji0) obj2).getClass();
                L.j((Throwable) obj, "SendTogglesToDevNull", "FeatureManager sync error.");
                break;
            default:
                VKApplication.a aVar = VKApplication.c;
                ((CatalogVideoViewComponent) obj2).L5((cg50) obj);
                break;
        }
        return s3q0.a;
    }
}
