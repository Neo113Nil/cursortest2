package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.transition.ClipsWrapperTransitionState;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import xsna.a5u;
import xsna.bf10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nuf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nuf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ouf oufVar = (ouf) this.c;
                androidx.fragment.app.d dVar = (androidx.fragment.app.d) this.d;
                g5 g5Var = (g5) this.e;
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.f;
                oufVar.g = ClipsWrapperTransitionState.HIDE_FINISHED;
                io2 io2Var = oufVar.e;
                if (io2Var != null) {
                    io2Var.C();
                }
                fcn fcnVar = dVar instanceof fcn ? (fcn) dVar : null;
                if (fcnVar != null) {
                    i0q0.f(new com.vk.movika.sdk.base.ui.k(4, clipsWrapperFragment, fcnVar));
                }
                if (dVar != 0) {
                    dVar.tn();
                }
                g5Var.invoke();
                break;
            case 1:
                ((q3n0) this.c).a((GroupSuggestion) this.d, (Group) this.e, null, (io.reactivex.rxjava3.disposables.g) this.f);
                break;
            default:
                cxo cxoVar = (cxo) this.c;
                a5u.a aVar = (a5u.a) this.d;
                y4u y4uVar = (y4u) this.e;
                String str = (String) this.f;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = aVar.c;
                h010 h010Var = cxoVar.f;
                Long valueOf = h010Var != null ? Long.valueOf(h010Var.b) : null;
                h010 h010Var2 = cxoVar.f;
                UserId userId = h010Var2 != null ? h010Var2.c : null;
                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
                bf10.a(new bf10.a(valueOf, userId, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null, commonMarketStat$TypeRefSource, cxoVar.h, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.c : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.d : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.e : null));
                ((gwh0) y4uVar.h0.getValue()).a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_MARKET_OUT);
                maz.c(y4uVar.b(), aVar.f, str, LaunchContext.A, null, null, 24);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ nuf(vzp0 vzp0Var, cxo cxoVar, a5u.a aVar, y4u y4uVar, String str) {
        this.b = 2;
        this.c = cxoVar;
        this.d = aVar;
        this.e = y4uVar;
        this.f = str;
    }
}
