package xsna;

import android.content.Context;
import com.vk.api.sdk.VKApiConfig;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.ArrayList;
import xsna.c5g0;
import xsna.eil0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class tb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        ?? r2 = this.c;
        switch (i) {
            case 0:
                return (SearchUiComponent) ((g8m) r2).a(fpf0.a(SearchUiComponent.class));
            case 1:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((VideoRestrictionManagerComponent) r2.getValue()).n2();
            case 2:
                a1w a1wVar = (a1w) r2;
                dhr0.a.getClass();
                return cvk.j(dhr0.E(), new caw(a1wVar), new daw(a1wVar));
            case 3:
                return new rgg(new bpn0(new z3i((gxw) r2, 21)));
            case 4:
                return ((OnlineBookingComponent) ((LinksBridgeComponentImpl) r2).o.getValue()).M4();
            case 5:
                return new vf5((OfflineAudioDatabase_Impl) r2);
            case 6:
                return dwx0.h((Context) r2);
            case 7:
                return new c5g0.a((c5g0) r2);
            case 8:
                return new eil0.b(((eil0) r2).a);
            case 9:
                rmk0 rmk0Var = new rmk0(2);
                rmk0Var.b(((VKApiConfig) r2).D.toArray(new nay[0]));
                rmk0Var.a(new jhl());
                ArrayList<Object> arrayList = rmk0Var.a;
                return new lbg0(e43.l(arrayList.toArray(new nay[arrayList.size()])));
            default:
                if (((qks0) r2).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIPS_PIN_ACTION;
                    videoFeatures.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures);
                }
                return Boolean.valueOf(z);
        }
    }
}
