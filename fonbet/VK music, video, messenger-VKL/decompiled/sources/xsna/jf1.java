package xsna;

import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.dto.VkOptionalNativeAdType;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.profile.user.impl.ui.b;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.bb4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jf1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jf1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((gg1) obj).p.b(i.e.a);
                return;
            case 1:
                bb4 bb4Var = (bb4) obj;
                long j = bb4Var.g.get();
                Iterator<Map.Entry<NewsEntry, bb4.a>> it = bb4Var.h.entrySet().iterator();
                while (it.hasNext()) {
                    bb4.a value = it.next().getValue();
                    if (value.a.get() != j) {
                        value.a();
                        it.remove();
                    }
                }
                return;
            case 2:
                ((dsh) obj).i = false;
                return;
            case 3:
                psm psmVar = (psm) obj;
                psmVar.x = null;
                psmVar.w.onNext(Boolean.TRUE);
                return;
            case 4:
                hv50 hv50Var = (hv50) obj;
                if (((NewsfeedOptionalAdsComponent) hv50Var.c.getValue()).m5(VkOptionalNativeAdType.APPLOVIN) == null || ((AuthBridgeComponent) hv50Var.b.getValue()).s().Z() == null) {
                    return;
                }
                ce60 ce60Var = ce60.b;
                ce60.k(ce60Var, ce60Var.i());
                int i2 = ((owq) hv50Var.e.getValue()).a;
                EmptyList emptyList = EmptyList.b;
                throw null;
            case 5:
                io.reactivex.rxjava3.disposables.c cVar = ((tca0) obj).d;
                if (cVar != null) {
                    cVar.dispose();
                    return;
                }
                return;
            case 6:
                na60.i((NewsEntry) obj, true);
                return;
            case 7:
                ((m3g0) obj).n = true;
                return;
            default:
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = ((rlq0) obj).j;
                (izsVar != null ? izsVar : null).invoke(b.k.AbstractC1712b.a.b);
                return;
        }
    }
}
