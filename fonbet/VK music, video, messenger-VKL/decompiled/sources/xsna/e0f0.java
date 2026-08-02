package xsna;

import android.graphics.Canvas;
import com.vk.im.reactions.api.BigReactionAnimationsView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ReactionBigAnimationDrawable.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class e0f0 implements BigReactionAnimationsView.a, g0t {
    public final /* synthetic */ g0f0 b;

    public e0f0(g0f0 g0f0Var) {
        this.b = g0f0Var;
    }

    @Override // com.vk.im.reactions.api.BigReactionAnimationsView.a
    public final void a(Canvas canvas) {
        this.b.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof BigReactionAnimationsView.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, g0f0.class, "draw", "draw(Landroid/graphics/Canvas;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
