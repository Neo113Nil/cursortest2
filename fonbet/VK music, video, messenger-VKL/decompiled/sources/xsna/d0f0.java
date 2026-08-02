package xsna;

import com.vk.im.reactions.api.BigReactionAnimationsView;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vk.rlottie.RLottieDrawable;
import java.lang.ref.WeakReference;

/* compiled from: ReactionBigAnimationDrawable.kt */
/* loaded from: classes2.dex */
public final class d0f0 implements RLottieDrawable.a {
    public final /* synthetic */ g0f0 a;
    public final /* synthetic */ mh40 b;

    public d0f0(g0f0 g0f0Var, mh40 mh40Var) {
        this.a = g0f0Var;
        this.b = mh40Var;
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void b() {
        BigReactionAnimationsView bigReactionAnimationsView;
        g0f0 g0f0Var = this.a;
        WeakReference<BigReactionAnimationsView> weakReference = g0f0Var.f;
        if (weakReference != null && (bigReactionAnimationsView = weakReference.get()) != null) {
            bigReactionAnimationsView.b.remove(new f0f0(g0f0Var));
            RLottieDrawable rLottieDrawable = g0f0Var.d;
            if (rLottieDrawable != null) {
                g5g.D(rLottieDrawable.i, true, new k5p(bigReactionAnimationsView, 1));
            }
            bigReactionAnimationsView.invalidate();
        }
        ReactionAssetDrawable reactionAssetDrawable = (ReactionAssetDrawable) this.b.c;
        fal falVar = reactionAssetDrawable.a;
        if (falVar != null) {
            falVar.a();
        }
        reactionAssetDrawable.a = null;
        RLottieDrawable rLottieDrawable2 = reactionAssetDrawable.c;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.k.q = 1;
        }
        reactionAssetDrawable.f = ReactionAssetDrawable.Stage.ANIMATION;
        reactionAssetDrawable.invalidateSelf();
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void a() {
    }
}
