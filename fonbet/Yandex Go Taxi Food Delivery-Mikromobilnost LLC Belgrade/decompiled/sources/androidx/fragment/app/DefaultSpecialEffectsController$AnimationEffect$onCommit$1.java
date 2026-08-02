package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import defpackage.iot0;
import defpackage.p7h;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect$onCommit$1", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Lzy11;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DefaultSpecialEffectsController$AnimationEffect$onCommit$1 implements Animation.AnimationListener {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ iot0 $operation;
    final /* synthetic */ View $viewToAnimate;
    final /* synthetic */ b this$0;

    public DefaultSpecialEffectsController$AnimationEffect$onCommit$1(iot0 iot0Var, ViewGroup viewGroup, View view, b bVar) {
        this.$operation = iot0Var;
        this.$container = viewGroup;
        this.$viewToAnimate = view;
        this.this$0 = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0(ViewGroup viewGroup, View view, b bVar) {
        viewGroup.endViewTransition(view);
        bVar.c.a.c(bVar);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.$container;
        viewGroup.post(new p7h(1, viewGroup, this.$viewToAnimate, this.this$0));
        if (FragmentManager.O(2)) {
            Objects.toString(this.$operation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (FragmentManager.O(2)) {
            Objects.toString(this.$operation);
        }
    }
}
