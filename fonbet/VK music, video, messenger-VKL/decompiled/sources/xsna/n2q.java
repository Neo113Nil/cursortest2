package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.clips.design.view.timeline.TimelineBottomActionsView;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.newsfeed.common.views.SnackbarGroupSubscriptionView;
import com.vk.superapp.api.dto.auth.UserItem;
import xsna.bqr0;
import xsna.g2s0;
import xsna.jgz0;
import xsna.kkz0;
import xsna.lru;
import xsna.ydz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class n2q implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n2q(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m6a m6aVar;
        kkz0.a aVar;
        switch (this.b) {
            case 0:
                ((o2q) this.c).m.c((UserItem) this.d);
                break;
            case 1:
                ((azr) this.c).l.c((yyr) this.d);
                break;
            case 2:
                ((izs) this.c).invoke(((lru.a) this.d).m);
                break;
            case 3:
                ((SearchQueryVh) this.c).f.a3(((ModernSearchView) this.d).getQuery());
                break;
            case 4:
                SnackbarGroupSubscriptionView snackbarGroupSubscriptionView = (SnackbarGroupSubscriptionView) this.c;
                Activity activity = (Activity) this.d;
                yzm0 yzm0Var = snackbarGroupSubscriptionView.c;
                if (yzm0Var != null) {
                    NewsEntry.TrackData trackData = snackbarGroupSubscriptionView.b;
                    Owner owner = yzm0Var.a;
                    if (!owner.i(4)) {
                        yzm0Var.b.b(o0r0.i(xwk.e(), owner.b, false, trackData != null ? trackData.b : null, false, trackData != null ? trackData.h : null, 96).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new b0y(new u2k0(yzm0Var, 8), 27)));
                        break;
                    } else {
                        e4h.l(xwk.e().h0(), activity, owner.b, new k22(25, yzm0Var, activity), null, 24);
                        break;
                    }
                }
                break;
            case 5:
                TimelineBottomActionsView.a aVar2 = (TimelineBottomActionsView.a) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                pg pgVar = aVar2.l;
                iwo0 iwo0Var = aVar2.o;
                if (iwo0Var == null) {
                    iwo0Var = null;
                }
                pgVar.invoke(iwo0Var, viewGroup);
                break;
            case 6:
                ((izs) this.c).invoke(Integer.valueOf(((bqr0.a) this.d).getAbsoluteAdapterPosition()));
                break;
            case 7:
                g2s0.a aVar3 = (g2s0.a) this.c;
                g2s0 g2s0Var = (g2s0) this.d;
                HistoryAttach historyAttach = aVar3.x;
                if (historyAttach != null && (m6aVar = g2s0Var.a) != null) {
                    m6aVar.a(aVar3.r, historyAttach);
                    break;
                }
                break;
            default:
                acz0 acz0Var = (acz0) this.c;
                ydz0.a aVar4 = (ydz0.a) this.d;
                Button button = acz0Var.c;
                int i = view == button ? 2 : 1;
                viy0 viy0Var = new viy0(view == button ? 64 : view == acz0Var.d ? 128 : 2048, acz0Var.i);
                ydz0 ydz0Var = (ydz0) ((bj50) aVar4).c;
                if (view.isEnabled() && (aVar = ydz0Var.t) != null) {
                    ((jgz0.b) aVar).a(i, viy0Var);
                    break;
                }
                break;
        }
    }
}
