package xsna;

import android.app.Activity;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StoryCreateQuestionDelegate.kt */
/* loaded from: classes16.dex */
public final class x0m0 extends wyl0 {
    public final Activity f;
    public final u76 g;
    public final v3l0 h;
    public final Object i;

    public x0m0(Activity activity, StickersDrawingViewGroup stickersDrawingViewGroup, u76 u76Var, b96 b96Var, v3l0 v3l0Var) {
        super(stickersDrawingViewGroup, b96Var);
        this.f = activity;
        this.g = u76Var;
        this.h = v3l0Var;
        this.i = msy.a(LazyThreadSafetyMode.NONE, new avj0(this, 7));
    }

    @Override // xsna.wyl0
    public final tyl0<?> f() {
        b1m0 b1m0Var = new b1m0(this.b.getContext(), this, this.h);
        b1m0Var.u = this.g.b7();
        b1m0Var.h();
        return b1m0Var;
    }
}
