package xsna;

import android.os.PowerManager;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class kb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return ((CommunitiesCatalogComponent) r1.getValue()).a();
            case 1:
                return ((PowerManager) ((ysa) r1).g.getValue()).newWakeLock(32, StringUtils.PROCESS_POSTFIX_DELIMITER.concat(ysa.class.getSimpleName()));
            case 2:
                return j5g.g0(((Map) r1).entrySet(), null, null, null, 0, new dlc(0), 31);
            case 3:
                return ((NewsFeedBridgeComponent) ((gxw) r1).c().a(fpf0.a(NewsFeedBridgeComponent.class))).Ad();
            case 4:
                return ((ReviewsComponent) ((LinksBridgeComponentImpl) r1).d.getValue()).Md();
            case 5:
                String str = MainActivity.P;
                ((MainActivity) r1).X1();
                return s3q0.a;
            case 6:
                return (ProductsMultipickerComponent) ((g8m) r1).a(fpf0.a(ProductsMultipickerComponent.class));
            case 7:
                nwy nwyVar = ((PhotosComponentImpl) r1).j;
                qcy<Object> qcyVar = PhotosComponentImpl.u[9];
                return new tca0((bda0) nwyVar.c());
            case 8:
                aid0 aid0Var = (aid0) r1;
                sqo0 sqo0Var = aid0Var.e;
                xhd0 xhd0Var = aid0Var.b;
                if (!lhs.d()) {
                    return new rqo0(aid0Var.j(new muz(xhd0Var.i.b(), xhd0Var.j)), sqo0Var);
                }
                lhs.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
                try {
                    return new rqo0(aid0Var.j(new muz(xhd0Var.i.b(), xhd0Var.j)), sqo0Var);
                } finally {
                    lhs.b();
                }
            default:
                qcy<Object>[] qcyVarArr2 = StoryViewerComponentImpl.s;
                return new zjc(((StoryViewerComponentImpl) r1).tb());
        }
    }
}
