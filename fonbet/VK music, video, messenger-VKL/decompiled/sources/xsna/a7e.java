package xsna;

import android.view.View;
import com.vk.clips.design.view.sidecontrols.models.CounterMode;
import com.vk.clips.design.view.sidecontrols.models.VisibilityConfig;
import com.vkontakte.android.R;
import xsna.ily;

/* compiled from: ClipsFeedItemCommentsLiteView.kt */
/* loaded from: classes17.dex */
public final class a7e extends wg6 {
    public final eqd d;
    public ggg e;

    public a7e(fge fgeVar, eqd eqdVar) {
        super(fgeVar);
        this.d = eqdVar;
    }

    @Override // xsna.wg6
    public final void g(Object obj) {
        ggg gggVar = (ggg) obj;
        fge fgeVar = (fge) this.a;
        deg degVar = gggVar.b;
        ceg cegVar = gggVar.a;
        if (epx.f(this.e, gggVar)) {
            return;
        }
        VisibilityConfig visibilityConfig = cegVar.d;
        CounterMode counterMode = cegVar.c;
        boolean h = visibilityConfig.h();
        boolean z = degVar.a;
        int i = degVar.b;
        View view = (View) this.c;
        fgeVar.b(new rr8(h, z, new afj(counterMode.h() ? view.getContext().getResources().getQuantityString(R.plurals.clips_accessibility_comment_count, i, Integer.valueOf(i)) : view.getContext().getResources().getString(R.string.accessibility_comments), 2), new ily(counterMode.h(), uqm0.f(i), new ily.a((int) iah0.y(1.0f), (int) iah0.y(2.0f))), new drv(R.drawable.vk_icon_comment_outline_shadow_medium_48, 2)));
        fgeVar.a(this.d);
        this.e = gggVar;
    }
}
