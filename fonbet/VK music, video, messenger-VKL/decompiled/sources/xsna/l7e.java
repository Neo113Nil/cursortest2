package xsna;

import android.view.View;
import com.vk.clips.design.view.sidecontrols.models.CounterMode;
import com.vk.clips.design.view.sidecontrols.models.VisibilityConfig;
import com.vkontakte.android.R;
import xsna.ily;

/* compiled from: ClipsFeedItemSharesLiteView.kt */
/* loaded from: classes17.dex */
public final class l7e extends wg6 {
    public final dg d;
    public final i4e e;
    public abj0 f;

    public l7e(fge fgeVar, dg dgVar, i4e i4eVar) {
        super(fgeVar);
        this.d = dgVar;
        this.e = i4eVar;
    }

    @Override // xsna.wg6
    public final void g(Object obj) {
        abj0 abj0Var = (abj0) obj;
        fge fgeVar = (fge) this.a;
        yaj0 yaj0Var = abj0Var.a;
        zaj0 zaj0Var = abj0Var.b;
        if (epx.f(this.f, abj0Var)) {
            return;
        }
        VisibilityConfig visibilityConfig = yaj0Var.d;
        CounterMode counterMode = yaj0Var.c;
        boolean h = visibilityConfig.h();
        boolean z = zaj0Var.a;
        int i = zaj0Var.c;
        View view = (View) this.c;
        fgeVar.b(new rr8(h, z, new afj(counterMode.h() ? view.getContext().getResources().getQuantityString(R.plurals.clips_accessibility_share_count, i, Integer.valueOf(i)) : view.getContext().getResources().getString(R.string.accessibility_share), 2), new ily(counterMode.h(), uqm0.f(i), new ily.a((int) iah0.y(1.0f), (int) iah0.y(2.0f))), new drv(R.drawable.vk_icon_share_alt_shadow_medium_48, 2)));
        fgeVar.a(this.d);
        if (zaj0Var.b) {
            fgeVar.c(this.e);
        } else {
            fgeVar.d();
        }
        this.f = abj0Var;
    }
}
