package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class hn1 implements zf0 {
    public final c02 a;
    public final rk1 b;

    public hn1(c02 c02Var, rk1 rk1Var) {
        this.a = c02Var;
        this.b = rk1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        Float a = this.b.a();
        if (extendedViewContainer == null || a == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new oy(new pl2(Math.min(Math.max(a.floatValue(), 1.0f), 1.7777778f), new ik1()), new ek1(viewGroup, 0.5f, viewGroup.getContext().getApplicationContext())));
    }

    @Override // yads.zf0
    public final void c() {
    }
}
