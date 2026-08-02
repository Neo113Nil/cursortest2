package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppCustomEventItem;
import xsna.gp20;

/* compiled from: MiniAppCardHolder.kt */
/* loaded from: classes4.dex */
public final class fp20 extends vif0<gp20.a> {
    public final gtl0 n;
    public final m1k o;
    public final hvz p;
    public final foi q;
    public final bpn0 r;

    public fp20(gtl0 gtl0Var, m1k m1kVar) {
        super(gtl0Var.itemView, gtl0Var.l);
        this.n = gtl0Var;
        this.o = m1kVar;
        this.p = new hvz(this, 8);
        this.q = new foi(this, 24);
        this.r = new bpn0(new zq3(19));
    }

    @Override // xsna.vif0
    public final void i6(gp20.a aVar) {
        hvz hvzVar = this.p;
        gtl0 gtl0Var = this.n;
        gtl0Var.q6(hvzVar);
        gtl0Var.s6(this.q);
        gtl0Var.V5(aVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q6() {
        UserId userId;
        String l;
        AppCarouselItem appCarouselItem = ((gp20.a) this.m).a;
        LinkButton linkButton = appCarouselItem.d;
        Action action = linkButton != null ? linkButton.c : null;
        ApiApplication apiApplication = appCarouselItem.f;
        if (!(action instanceof ActionOpenUrl)) {
            if (apiApplication != null) {
                if (gd60.J(hd60.a(), this.itemView.getContext(), apiApplication, "feed", apiApplication.zb().booleanValue() ? apiApplication.B : null, null, 4068) != null) {
                    return;
                }
            }
            if (action != null) {
                hd60.a().v(action, this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            return;
        }
        afq0 afq0Var = (afq0) this.r.getValue();
        String str = ((ActionOpenUrl) action).c;
        afq0Var.getClass();
        String a = afq0.a(str);
        Integer m = (apiApplication == null || (userId = apiApplication.b) == null || (l = Long.valueOf(userId.b).toString()) == null) ? null : arm0.m(10, l);
        String str2 = apiApplication != null ? apiApplication.B : null;
        long currentTimeMillis = System.currentTimeMillis();
        int intValue = m != null ? m.intValue() : 0;
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMiniAppCustomEventItem("", currentTimeMillis, intValue, a, "feed_recommended_games_carousel_action_url_click", UiTracker.c().name(), SchemeStat$TypeMiniAppCustomEventItem.Type.TYPE_CLICK, null, str2, null, null, 1664, null), 3)).q();
        hd60.a().v(new ActionOpenUrl(a, null, 2, null), this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
        s3q0 s3q0Var2 = s3q0.a;
    }
}
