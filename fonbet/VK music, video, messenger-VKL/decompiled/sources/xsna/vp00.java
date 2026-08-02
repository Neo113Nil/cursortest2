package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import java.util.ArrayList;

/* compiled from: MarketAdsItemMviViewHolder.kt */
/* loaded from: classes17.dex */
public final class vp00 extends vfz<FeedItem.j> {
    public final gxp0 l;
    public final ip00 m;

    public vp00() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vp00(Context context, int i, ClipFeedTab clipFeedTab, yof yofVar, ibr0 ibr0Var, gxp0 gxp0Var, q20 q20Var, kp00 kp00Var, ki0 ki0Var, uvx uvxVar, emi emiVar, mxc mxcVar) {
        super(r15);
        com.vk.clips.sdk.shared.item.market_ads.b bVar = new com.vk.clips.sdk.shared.item.market_ads.b(context, fzc.b(clipFeedTab), i, uvxVar, emiVar, yofVar, ibr0Var, gxp0Var, q20Var, kp00Var, ki0Var, mxcVar);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(bVar);
        this.l = gxp0Var;
        this.m = bVar;
    }

    @Override // xsna.vfz
    public final void V5() {
        this.l.b(this.m.getUiVisibilityConfigChangedListener());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(FeedItem.j jVar) {
        FeedItem.j jVar2 = jVar;
        ArrayList arrayList = jVar2.c;
        this.m.e(new vo00(jVar2.d, jVar2.f, jVar2.g, jVar2.F(), jVar2.h, arrayList, jVar2.i, jVar2.e));
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
