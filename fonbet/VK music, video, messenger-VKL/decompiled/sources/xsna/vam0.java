package xsna;

import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;

/* compiled from: StoryReactionDelegate.kt */
/* loaded from: classes16.dex */
public final class vam0 extends wyl0 {
    public final u76 f;
    public final v3l0 g;
    public final px0 h;
    public iz8 i;

    /* compiled from: StoryReactionDelegate.kt */
    public static final class a {
        public final /* synthetic */ abm0 b;
        public final /* synthetic */ y0f0 c;
        public final /* synthetic */ Boolean d;

        public a(abm0 abm0Var, y0f0 y0f0Var, Boolean bool) {
            this.b = abm0Var;
            this.c = y0f0Var;
            this.d = bool;
        }

        public final void a() {
            if (this.c == null) {
                vam0.this.f.o5().h();
            }
        }
    }

    public vam0(StickersDrawingViewGroup stickersDrawingViewGroup, b96 b96Var, u76 u76Var, v3l0 v3l0Var, px0 px0Var) {
        super(stickersDrawingViewGroup, b96Var);
        this.f = u76Var;
        this.g = v3l0Var;
        this.h = px0Var;
    }

    @Override // xsna.wyl0
    public final tyl0<?> f() {
        abm0 abm0Var = (abm0) this.e;
        a aVar = new a(abm0Var, abm0Var.getReaction(), abm0Var.getWithBlackBackground());
        iz8 iz8Var = this.i;
        y0f0 reaction = abm0Var.getReaction();
        return new xam0(this.b, aVar, iz8Var, abm0Var.getWithBlackBackground(), this.h, reaction, this.g);
    }
}
