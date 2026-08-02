package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: ClipsFeedItemMoreLiteView.kt */
/* loaded from: classes17.dex */
public final class g7e extends wg6 {
    public final zx d;
    public t930 e;

    public g7e(fge fgeVar, zx zxVar) {
        super(fgeVar);
        this.d = zxVar;
    }

    @Override // xsna.wg6
    public final void g(Object obj) {
        t930 t930Var = (t930) obj;
        fge fgeVar = (fge) this.a;
        if (epx.f(this.e, t930Var)) {
            return;
        }
        fgeVar.b(new rr8(t930Var.a.c.h(), t930Var.b.a, new afj(((View) this.c).getContext().getString(R.string.clips_accessibility_more), 2), new ily(6), new drv(R.drawable.vk_icon_more_horizontal_shadow_medium_48, 2)));
        fgeVar.a(this.d);
        this.e = t930Var;
    }
}
