package xsna;

import android.content.Context;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto;

/* compiled from: MiniAppsCarouselItemHolderV2.kt */
/* loaded from: classes4.dex */
public final class qq20 extends vif0<AppCarouselItem> {
    public final rq20 n;
    public final gtl0 o;
    public final t9 p;
    public final x4u q;
    public final Cnew r;

    public qq20(rq20 rq20Var, gtl0 gtl0Var, t9 t9Var) {
        super(gtl0Var.itemView, gtl0Var.l);
        this.n = rq20Var;
        this.o = gtl0Var;
        this.p = t9Var;
        this.q = new x4u(this, 9);
        this.r = new Cnew(this, 5);
    }

    @Override // xsna.vif0
    public final void i6(AppCarouselItem appCarouselItem) {
        Context context = this.itemView.getContext();
        this.n.getClass();
        RecommendationsCarouselItemUiDto a = rq20.a(context, appCarouselItem);
        x4u x4uVar = this.q;
        gtl0 gtl0Var = this.o;
        gtl0Var.q6(x4uVar);
        gtl0Var.s6(this.r);
        gtl0Var.V5(a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q6() {
        Action action;
        ApiApplication apiApplication = ((AppCarouselItem) this.m).f;
        if (apiApplication != null) {
            if (gd60.J(hd60.a(), this.itemView.getContext(), apiApplication, "feed", apiApplication.zb().booleanValue() ? apiApplication.B : null, null, 4068) != null) {
                return;
            }
        }
        LinkButton linkButton = ((AppCarouselItem) this.m).d;
        if (linkButton == null || (action = linkButton.c) == null) {
            return;
        }
        hd60.a().v(action, this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
        s3q0 s3q0Var = s3q0.a;
    }
}
