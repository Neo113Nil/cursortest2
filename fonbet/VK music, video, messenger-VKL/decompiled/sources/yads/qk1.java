package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class qk1 implements zf0 {
    public final c02 a;
    public final rk1 b;

    public /* synthetic */ qk1(y00 y00Var) {
        this(new c02(), new rk1(y00Var));
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        Float a = this.b.a();
        if (extendedViewContainer == null || a == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new pl2(a.floatValue(), new ik1()));
    }

    public qk1(c02 c02Var, rk1 rk1Var) {
        this.a = c02Var;
        this.b = rk1Var;
    }

    @Override // yads.zf0
    public final void c() {
    }
}
