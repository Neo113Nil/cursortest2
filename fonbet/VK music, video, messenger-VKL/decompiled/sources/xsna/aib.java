package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.channels.ChannelsRecommendation;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeChannelItem;
import com.vk.stat.scheme.SchemeStat$TypeChannelSource;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import com.vk.toggle.data.RecommendationsItemSizeStyle;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import xsna.bwy;
import xsna.tcf0;

/* compiled from: ChannelsRecommendationsAdapter.kt */
/* loaded from: classes4.dex */
public final class aib extends zoj0<Object, vif0<?>> {
    public final io.reactivex.rxjava3.disposables.b e;
    public final tcf0.c f;
    public final h170 g;
    public boolean h;
    public bwy i = bwy.d.a;
    public final ecf0 j = new ecf0();
    public final a k = new a();

    /* compiled from: ChannelsRecommendationsAdapter.kt */
    public static final class a implements lbf0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.lbf0
        public final void a(kbf0 kbf0Var, vif0<?> vif0Var, int i) {
            kcf0 kcf0Var = vif0Var instanceof kcf0 ? (kcf0) vif0Var : null;
            if (kcf0Var != null) {
                ChannelsRecommendation channelsRecommendation = (ChannelsRecommendation) ((kcf0) vif0Var).m;
                if (!kbf0Var.equals(jcr.c)) {
                    if (kbf0Var.equals(xus.c)) {
                        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CHANNEL, null, null, null, channelsRecommendation.f, null, 46, null), new SchemeStat$TypeChannelItem(SchemeStat$TypeChannelSource.FEED_RECOMM), 2);
                        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FEED;
                        uzp0 uzp0Var = UiTracker.h;
                        uzp0Var.getClass();
                        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, b, uzp0Var.a).q();
                        xyv.i(g2v.c().a(), kcf0Var.itemView.getContext(), channelsRecommendation.b, null, ChannelEntryPoint.FeedRecommendations.b, 4);
                        return;
                    }
                    return;
                }
                if (channelsRecommendation.g) {
                    return;
                }
                channelsRecommendation.h = true;
                kcf0Var.o6();
                oib oibVar = new oib();
                long j = channelsRecommendation.b;
                gzs<s3q0> gzsVar = fkq0.a;
                io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(oibVar.h(new UserId(j), null, channelsRecommendation.f, "feed_recomm_plus", null)), null, null, 3);
                qk8 qk8Var = new qk8(1, channelsRecommendation, kcf0Var);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                kcf0Var.o.b(y0.E(lVar, lVar, io.reactivex.rxjava3.internal.functions.a.c, qk8Var).subscribe(new xk30(new d2y(channelsRecommendation, 26), 16)));
            }
        }
    }

    public aib(io.reactivex.rxjava3.disposables.b bVar, tcf0.c cVar, h170 h170Var) {
        this.e = bVar;
        this.f = cVar;
        this.g = h170Var;
    }

    public final boolean K0() {
        return epx.f(this.i, bwy.c.a) || epx.f(this.i, bwy.a.a);
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.h || K0()) {
            return 20;
        }
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (this.h || K0()) {
            return -1L;
        }
        Object c = this.c.c(i);
        jeb jebVar = c instanceof jeb ? (jeb) c : null;
        if (jebVar == null) {
            return 0L;
        }
        return jebVar.a.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (this.h || K0()) {
            return 1;
        }
        return this.c.c(i) instanceof keb ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        Object c = this.c.c(i);
        jeb jebVar = c instanceof jeb ? (jeb) c : null;
        if (jebVar != null && (vif0Var instanceof kcf0)) {
            ((kcf0) vif0Var).V5(jebVar.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        gtl0 obf0Var;
        sbf0 a2 = sbf0.a(sbf0.e, RecommendationsItemImageStyle.SQUARE);
        if (i != 0) {
            return i != 2 ? new ubf0(viewGroup, ActionButtonStyle.PrimaryWithNoShadow, a2.c, a2.d, RecommendationsItemSizeStyle.LARGE) : new tbf0(viewGroup, new ra0(this, 18), a2, true);
        }
        if (this.g.d()) {
            obf0Var = new pbf0(viewGroup, this.k, ActionButtonStyle.PrimaryWithNoShadow, a2.b, a2.a, a2.c, RecommendationsItemSizeStyle.LARGE);
        } else {
            obf0Var = new obf0(viewGroup, this.k, ActionButtonStyle.PrimaryWithNoShadow, a2.b, a2.a, a2.c, a2.d, RecommendationsItemSizeStyle.LARGE);
        }
        return new kcf0(this.j, this.e, obf0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        vif0 vif0Var = (vif0) e0Var;
        d3m.b(vif0Var.itemView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        super.onViewDetachedFromWindow(vif0Var);
    }
}
