package com.yandex.go.tariffcard.ui.recyclerview.animationmanager;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import defpackage.bjc;
import defpackage.k4o;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0019B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/tariffcard/ui/recyclerview/animationmanager/CombinedValueAnimator;", "Landroid/animation/ValueAnimator;", "", "animators", "Lcom/yandex/go/tariffcard/ui/recyclerview/animationmanager/CombinedValueAnimator$DurationScaleMode;", "durationScaleMode", "", "generalDuration", "<init>", "(Ljava/util/List;Lcom/yandex/go/tariffcard/ui/recyclerview/animationmanager/CombinedValueAnimator$DurationScaleMode;J)V", "Lzy11;", "initDuration", "()V", "start", "bindInnerAnimators", "innerAnimator", "bindInnerAnimator", "(Landroid/animation/ValueAnimator;)V", "Ljava/util/List;", "getAnimators", "()Ljava/util/List;", "Lcom/yandex/go/tariffcard/ui/recyclerview/animationmanager/CombinedValueAnimator$DurationScaleMode;", "getDurationScaleMode", "()Lcom/yandex/go/tariffcard/ui/recyclerview/animationmanager/CombinedValueAnimator$DurationScaleMode;", "J", "DurationScaleMode", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CombinedValueAnimator extends ValueAnimator {
    private final List<ValueAnimator> animators;
    private final DurationScaleMode durationScaleMode;
    private final long generalDuration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/tariffcard/ui/recyclerview/animationmanager/CombinedValueAnimator$DurationScaleMode;", "", "TOGETHER_START", "TOGETHER_END", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DurationScaleMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DurationScaleMode[] $VALUES;
        public static final DurationScaleMode TOGETHER_END;
        public static final DurationScaleMode TOGETHER_START;

        static {
            DurationScaleMode durationScaleMode = new DurationScaleMode("TOGETHER_START", 0);
            TOGETHER_START = durationScaleMode;
            DurationScaleMode durationScaleMode2 = new DurationScaleMode("TOGETHER_END", 1);
            TOGETHER_END = durationScaleMode2;
            DurationScaleMode[] durationScaleModeArr = {durationScaleMode, durationScaleMode2};
            $VALUES = durationScaleModeArr;
            $ENTRIES = kotlin.enums.a.a(durationScaleModeArr);
        }

        public static DurationScaleMode valueOf(String str) {
            return (DurationScaleMode) Enum.valueOf(DurationScaleMode.class, str);
        }

        public static DurationScaleMode[] values() {
            return (DurationScaleMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CombinedValueAnimator(List<? extends ValueAnimator> list, DurationScaleMode durationScaleMode, long j) {
        this.animators = list;
        this.durationScaleMode = durationScaleMode;
        this.generalDuration = j;
        setFloatValues(0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindInnerAnimator$lambda$0(float f, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        valueAnimator.setCurrentFraction(Math.min(valueAnimator2.getAnimatedFraction() * f, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindInnerAnimator$lambda$1(float f, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        valueAnimator.setCurrentFraction(Math.max(((valueAnimator2.getAnimatedFraction() - 1.0f) * f) + 1.0f, 0.0f));
    }

    private final void initDuration() {
        Long l;
        Iterator<T> it = this.animators.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((ValueAnimator) it.next()).getDuration());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ValueAnimator) it.next()).getDuration());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        setDuration(Math.max(l != null ? l.longValue() : 0L, this.generalDuration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator$AnimatorListener, com.yandex.go.tariffcard.ui.recyclerview.animationmanager.CombinedValueAnimator$bindInnerAnimator$provideEndingListener$1] */
    public final void bindInnerAnimator(final ValueAnimator innerAnimator) {
        final bjc bjcVar;
        float duration = getDuration() / innerAnimator.getDuration();
        int i = a.a[this.durationScaleMode.ordinal()];
        int i2 = 1;
        if (i == 1) {
            bjcVar = new bjc(duration, innerAnimator, 0);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            bjcVar = new bjc(duration, innerAnimator, i2);
        }
        final ?? r0 = new AnimatorListenerAdapter() { // from class: com.yandex.go.tariffcard.ui.recyclerview.animationmanager.CombinedValueAnimator$bindInnerAnimator$provideEndingListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator ignored) {
                innerAnimator.end();
            }
        };
        addUpdateListener(bjcVar);
        addListener(r0);
        innerAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.tariffcard.ui.recyclerview.animationmanager.CombinedValueAnimator$bindInnerAnimator$cancelProvidingListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator ignored) {
                CombinedValueAnimator.this.removeListener(r0);
                CombinedValueAnimator.this.removeUpdateListener(bjcVar);
            }
        });
    }

    public final void bindInnerAnimators() {
        initDuration();
        Iterator<T> it = this.animators.iterator();
        while (it.hasNext()) {
            bindInnerAnimator((ValueAnimator) it.next());
        }
    }

    public final List<ValueAnimator> getAnimators() {
        return this.animators;
    }

    public final DurationScaleMode getDurationScaleMode() {
        return this.durationScaleMode;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void start() {
        bindInnerAnimators();
        super.start();
    }

    public /* synthetic */ CombinedValueAnimator(List list, DurationScaleMode durationScaleMode, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? DurationScaleMode.TOGETHER_START : durationScaleMode, (i & 4) != 0 ? 0L : j);
    }
}
