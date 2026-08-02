package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class em1 implements zf0 {
    public final y00 a;
    public final c02 b;

    public em1(y00 y00Var, c02 c02Var) {
        this.a = y00Var;
        this.b = c02Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.b.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        if (extendedViewContainer != null) {
            y00 y00Var = this.a;
            if (y00Var.d == null && y00Var.a == null) {
                extendedViewContainer.setVisibility(8);
            }
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
