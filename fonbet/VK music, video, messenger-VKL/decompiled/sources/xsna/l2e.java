package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import xsna.f9j0;
import xsna.kyh;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class l2e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l2e(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final q2e q2eVar = (q2e) this.c;
                final f9j0.c cVar = (f9j0.c) this.d;
                final VideoFile videoFile = (VideoFile) this.e;
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    break;
                }
            case 1:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) this.c;
                wk50.a aVar2 = (wk50.a) this.d;
                UserId userId = (UserId) this.e;
                lna0 lna0Var = (lna0) obj;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d(aVar2, false);
                aVar.c.b(new kyh.a.p(userId.b, lna0Var.a, lna0Var.b));
                break;
            case 2:
                List list = (List) this.c;
                String str = (String) this.d;
                izs izsVar = (izs) this.e;
                nvy nvyVar = (nvy) obj;
                nvyVar.h("search", "search", new jai(-1496420577, new rd00(0, str, izsVar), true));
                if (list.isEmpty()) {
                    nvyVar.h("empty", "empty", bhi.a);
                } else {
                    wow wowVar = new wow(list);
                    nvyVar.e(list.size(), new xd00(new tr0(24), wowVar), new b98(new quz(1), wowVar), new jai(802480018, new yd00(wowVar, izsVar), true));
                }
                break;
            case 3:
                ClipsRouter clipsRouter = (ClipsRouter) this.c;
                Context context = (Context) this.d;
                yp80 yp80Var = (yp80) this.e;
                L.g("MonotopicGridLink", (Throwable) obj);
                ClipsRouter.b(clipsRouter, context, new ClipFeedTab.TopVideo(null, null, null, null, null, 31, null), null, null, null, null, false, 252);
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                break;
            case 4:
                break;
            case 5:
                wzs wzsVar = (wzs) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                com.vk.photos.root.photoflow.presentation.b bVar = (com.vk.photos.root.photoflow.presentation.b) this.e;
                wzsVar.invoke(Integer.valueOf(arrayList.size()), (Integer) obj);
                bVar.X();
                break;
            case 6:
                MarketFavable marketFavable = (MarketFavable) obj;
                ((io.reactivex.rxjava3.core.y) this.c).onSuccess(((lml0) this.d).c((List) this.e, marketFavable.f, marketFavable));
                break;
            default:
                mtk0 mtk0Var = (mtk0) this.d;
                wh50 wh50Var = (wh50) this.e;
                mxj0 mxj0Var = (mxj0) obj;
                float floatValue = ((Number) mtk0Var.getValue()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (mxj0Var.a >> 32)) * floatValue;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (mxj0Var.a & 4294967295L)) * floatValue;
                if (Float.intBitsToFloat((int) (((mxj0) wh50Var.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((mxj0) wh50Var.getValue()).a & 4294967295L)) != intBitsToFloat2) {
                    wh50Var.setValue(new mxj0((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ l2e(n830 n830Var, ClipsRouter clipsRouter, Context context, yp80 yp80Var) {
        this.b = 3;
        this.c = clipsRouter;
        this.d = context;
        this.e = yp80Var;
    }
}
