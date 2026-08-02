package com.lightside.animations;

import android.animation.Animator;
import android.animation.ValueAnimator;
import defpackage.ak2;
import defpackage.jl51;
import defpackage.sls;
import defpackage.spb1;
import defpackage.xg2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\r\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000e\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010%R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010%R$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/lightside/animations/DslAnimator;", "Landroid/animation/ValueAnimator;", "<init>", "()V", "animator", "Lzy11;", "onUpdate", "(Landroid/animation/ValueAnimator;)V", "Lkotlin/Function0;", "block", "onStart", "(Lsls;)V", "onEnd", "onCancel", "onRepeat", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "listener", "addUpdateListener", "(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V", "Landroid/animation/Animator$AnimatorListener;", "addListener", "(Landroid/animation/Animator$AnimatorListener;)V", "start", "Lxg2;", "actor", "accumulate", "(Lxg2;)V", "externalListener", "Landroid/animation/Animator$AnimatorListener;", "externalUpdateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "", "animationActors", "[Lxg2;", "", "animationActorAccumulator", "Ljava/util/List;", "Lsls;", "", "value", "getDurationTime-qQO1QMc", "()J", "setDurationTime-bAIjdkI", "(J)V", "durationTime", "AnimatorListenerImpl", "graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DslAnimator extends ValueAnimator {
    private final List<xg2> animationActorAccumulator = new ArrayList();
    private xg2[] animationActors;
    private Animator.AnimatorListener externalListener;
    private ValueAnimator.AnimatorUpdateListener externalUpdateListener;
    private sls onCancel;
    private sls onEnd;
    private sls onRepeat;
    private sls onStart;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/lightside/animations/DslAnimator$AnimatorListenerImpl;", "Landroid/animation/Animator$AnimatorListener;", "<init>", "(Lcom/lightside/animations/DslAnimator;)V", "Landroid/animation/Animator;", "animator", "Lzy11;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationRepeat", "onAnimationCancel", "graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AnimatorListenerImpl implements Animator.AnimatorListener {
        public AnimatorListenerImpl() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Animator.AnimatorListener animatorListener = DslAnimator.this.externalListener;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
            sls slsVar = DslAnimator.this.onCancel;
            if (slsVar != null) {
                slsVar.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Animator.AnimatorListener animatorListener = DslAnimator.this.externalListener;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
            sls slsVar = DslAnimator.this.onEnd;
            if (slsVar != null) {
                slsVar.invoke();
            }
            xg2[] xg2VarArr = DslAnimator.this.animationActors;
            if (xg2VarArr == null) {
                xg2VarArr = null;
            }
            for (xg2 xg2Var : xg2VarArr) {
                xg2Var.getClass();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Animator.AnimatorListener animatorListener = DslAnimator.this.externalListener;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
            sls slsVar = DslAnimator.this.onRepeat;
            if (slsVar != null) {
                slsVar.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Animator.AnimatorListener animatorListener = DslAnimator.this.externalListener;
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
            sls slsVar = DslAnimator.this.onStart;
            if (slsVar != null) {
                slsVar.invoke();
            }
            xg2[] xg2VarArr = DslAnimator.this.animationActors;
            if (xg2VarArr == null) {
                xg2VarArr = null;
            }
            for (xg2 xg2Var : xg2VarArr) {
                xg2Var.getClass();
            }
        }
    }

    public DslAnimator() {
        setFloatValues(0.0f, 1.0f);
        super.addUpdateListener(new jl51(1, this));
        super.addListener(new AnimatorListenerImpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdate(ValueAnimator animator) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.externalUpdateListener;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(animator);
        }
        Float f = (Float) animator.getAnimatedValue();
        xg2[] xg2VarArr = this.animationActors;
        if (xg2VarArr == null) {
            xg2VarArr = null;
        }
        for (xg2 xg2Var : xg2VarArr) {
            ((ak2) xg2Var).a.invoke(f);
        }
    }

    public final void accumulate(xg2 actor) {
        this.animationActorAccumulator.add(actor);
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener listener) {
        this.externalListener = listener;
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener listener) {
        this.externalUpdateListener = listener;
    }

    /* renamed from: getDurationTime-qQO1QMc, reason: not valid java name */
    public final long m127getDurationTimeqQO1QMc() {
        return spb1.h(0L, 0L, 0L, 0L, getDuration());
    }

    public final void onCancel(sls block) {
        this.onCancel = block;
    }

    public final void onEnd(sls block) {
        this.onEnd = block;
    }

    public final void onRepeat(sls block) {
        this.onRepeat = block;
    }

    public final void onStart(sls block) {
        this.onStart = block;
    }

    /* renamed from: setDurationTime-bAIjdkI, reason: not valid java name */
    public final void m128setDurationTimebAIjdkI(long j) {
        setDuration(j);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void start() {
        this.animationActors = (xg2[]) this.animationActorAccumulator.toArray(new xg2[0]);
        super.start();
    }
}
