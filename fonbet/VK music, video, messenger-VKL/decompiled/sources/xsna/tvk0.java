package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;

/* compiled from: StaticAdsItemMviViewHolder.kt */
/* loaded from: classes17.dex */
public final class tvk0 extends vfz<FeedItem.m> {
    public final gxp0 l;
    public final kvk0 m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tvk0(Context context, int i, ClipFeedTab clipFeedTab, pb pbVar, ibr0 ibr0Var, q20 q20Var, yof yofVar, gxp0 gxp0Var, nvk0 nvk0Var, ki0 ki0Var, uvx uvxVar, emi emiVar) {
        super(r15);
        com.vk.clips.sdk.shared.item.static_ads.c cVar = new com.vk.clips.sdk.shared.item.static_ads.c(context, pbVar, uvxVar, emiVar, yofVar, fzc.b(clipFeedTab), i, ibr0Var, q20Var, gxp0Var, nvk0Var, ki0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(cVar);
        this.l = gxp0Var;
        this.m = cVar;
    }

    @Override // xsna.vfz
    public final void V5() {
        this.l.b(this.m.getUiVisibilityConfigChangedListener());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(FeedItem.m mVar) {
        FeedItem.m mVar2 = mVar;
        this.m.h(new bvk0(mVar2.c, mVar2.e, mVar2.f, mVar2.F(), mVar2.g, mVar2.h, mVar2.d));
    }

    @Override // xsna.vfz
    public final void a6() {
        this.l.d(this.m.getUiVisibilityConfigChangedListener());
    }

    @Override // xsna.vfz
    public final void g6() {
        this.m.a();
    }

    public final void h6(boolean z) {
        this.m.c(z);
    }
}
