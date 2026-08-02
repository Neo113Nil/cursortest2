package xsna;

import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.state.MarketInfoBlockModel;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchMarketCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.x1t0;

/* compiled from: BaseUserViewHolder.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class cq6 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        MarketInfoBlockModel marketInfoBlockModel;
        MarketItemLabelActionDto marketItemLabelActionDto;
        VideoRestriction O;
        switch (this.b) {
            case 0:
                ((bq6) this.receiver).h0();
                return s3q0.a;
            case 1:
                ((x8d) this.receiver).p();
                return s3q0.a;
            case 2:
                kih kihVar = (kih) this.receiver;
                int i = kih.O;
                p8u p8uVar = (p8u) kihVar.t;
                if (p8uVar != null && (marketInfoBlockModel = p8uVar.r) != null && (marketItemLabelActionDto = marketInfoBlockModel.d) != null) {
                    kihVar.E.a.l.invoke(new CommunityProfileAction.f.g(new utb(p8uVar, marketItemLabelActionDto)));
                }
                return s3q0.a;
            case 3:
                ((GlobalSearchMarketCatalogRootVh) this.receiver).getClass();
                return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MARKET;
            case 4:
                ((pew) this.receiver).a();
                return s3q0.a;
            case 5:
                return (Boolean) ((mcy) this.receiver).get();
            default:
                g3t0 g3t0Var = (g3t0) this.receiver;
                VideoFile videoFile = g3t0Var.n;
                if (videoFile != null && ((O = videoFile.O()) == null || O.f)) {
                    g3t0Var.l.Vh(new x1t0.d.c(videoFile));
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq6(Object obj) {
        super(0, obj, bq6.class, "resetScroll", "resetScroll()V", 0);
        this.b = 0;
    }
}
