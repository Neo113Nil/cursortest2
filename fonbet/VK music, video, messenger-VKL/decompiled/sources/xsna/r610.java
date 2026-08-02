package xsna;

import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.ecomm.market.good.linkedcontent.mvi2.MarketLinkedContentState;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.q610;
import xsna.s710;
import xsna.t610;

/* compiled from: MarketLinkedContentActor.kt */
/* loaded from: classes18.dex */
public final class r610 extends al50<MarketLinkedContentState, q610, on50, s710, u610, t610> {
    public final g7s0 c;
    public final hc10 d;
    public final sj50<MarketLinkedContentState, on50, s710, u610, t610> e;
    public io.reactivex.rxjava3.disposables.c f;

    public r610(g7s0 g7s0Var, hc10 hc10Var, sj50<MarketLinkedContentState, on50, s710, u610, t610> sj50Var) {
        super(sj50Var);
        this.c = g7s0Var;
        this.d = hc10Var;
        this.e = sj50Var;
    }

    @Override // xsna.qj50
    public final sj50<MarketLinkedContentState, on50, s710, u610, t610> W() {
        throw null;
    }

    @Override // xsna.al50, xsna.qj50
    public final void init() {
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        a(new s710.a(0, ((MarketLinkedContentState) sj50Var.getCurrentState()).b, ((MarketLinkedContentState) sj50Var.getCurrentState()).c, true));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        q610 q610Var = (q610) lj50Var;
        if (q610Var instanceof q610.a) {
            q610.a aVar = (q610.a) q610Var;
            a(new s710.a(aVar.d, aVar.c, aVar.b, aVar.e));
            return;
        }
        if (q610Var instanceof q610.d) {
            MediaContentItem mediaContentItem = ((q610.d) q610Var).c;
            if (mediaContentItem.b.d() == MarketProductLinkedContentItemDto.ContentTypeDto.VIDEO) {
                VideoVideoFullDto g = mediaContentItem.b.g();
                if ((g != null ? g.G2() : null) != null) {
                    io.reactivex.rxjava3.disposables.c cVar = this.f;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f = wjs0.b.b0(ayr0.class).subscribe(new g600(new g22(18, this, mediaContentItem), 1));
                }
            }
            c(new t610.b(mediaContentItem));
            return;
        }
        if (q610Var instanceof q610.b) {
            c(t610.a.a);
            return;
        }
        if (!(q610Var instanceof q610.e)) {
            if (!(q610Var instanceof q610.c)) {
                throw new NoWhenBranchMatchedException();
            }
            io.reactivex.rxjava3.disposables.c cVar2 = this.f;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            this.f = null;
            return;
        }
        MarketLinkedContentState currentState = this.e.getCurrentState();
        MediaContentItem mediaContentItem2 = ((q610.e) q610Var).b;
        LinkedContentAnalyticsParams linkedContentAnalyticsParams = currentState.k;
        if (linkedContentAnalyticsParams != null) {
            List<MediaContentItem> list = currentState.h;
            if (list == null || !list.contains(mediaContentItem2)) {
                this.d.getClass();
                hc10.f(mediaContentItem2, linkedContentAnalyticsParams);
            }
        }
    }
}
