package com.yandex.go.tariffcard.ui.recyclerview.animationmanager;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.tariffcard.ui.recyclerview.animationmanager.CombinedValueAnimator;
import defpackage.a8p;
import defpackage.dki0;
import defpackage.eki0;
import defpackage.ig2;
import defpackage.jst;
import defpackage.k4o;
import defpackage.sg2;
import defpackage.tj;
import defpackage.uo31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class RecyclerViewItemAnimationManager {
    public RecyclerView a;
    public List d;
    public tj e;
    public sg2 g;
    public Long h;
    public CombinedValueAnimator i;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c = new ArrayList();
    public AnimationPhase f = AnimationPhase.IDLE;
    public final d j = new d(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/tariffcard/ui/recyclerview/animationmanager/RecyclerViewItemAnimationManager$AnimationPhase;", "", "IDLE", "PHASE_1_ACTIVE", "PHASE_1_COMPLETE", "PHASE_2", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AnimationPhase {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AnimationPhase[] $VALUES;
        public static final AnimationPhase ERROR;
        public static final AnimationPhase IDLE;
        public static final AnimationPhase PHASE_1_ACTIVE;
        public static final AnimationPhase PHASE_1_COMPLETE;
        public static final AnimationPhase PHASE_2;

        static {
            AnimationPhase animationPhase = new AnimationPhase("IDLE", 0);
            IDLE = animationPhase;
            AnimationPhase animationPhase2 = new AnimationPhase("PHASE_1_ACTIVE", 1);
            PHASE_1_ACTIVE = animationPhase2;
            AnimationPhase animationPhase3 = new AnimationPhase("PHASE_1_COMPLETE", 2);
            PHASE_1_COMPLETE = animationPhase3;
            AnimationPhase animationPhase4 = new AnimationPhase("PHASE_2", 3);
            PHASE_2 = animationPhase4;
            AnimationPhase animationPhase5 = new AnimationPhase("ERROR", 4);
            ERROR = animationPhase5;
            AnimationPhase[] animationPhaseArr = {animationPhase, animationPhase2, animationPhase3, animationPhase4, animationPhase5};
            $VALUES = animationPhaseArr;
            $ENTRIES = kotlin.enums.a.a(animationPhaseArr);
        }

        public static AnimationPhase valueOf(String str) {
            return (AnimationPhase) Enum.valueOf(AnimationPhase.class, str);
        }

        public static AnimationPhase[] values() {
            return (AnimationPhase[]) $VALUES.clone();
        }
    }

    public final void a(RecyclerView recyclerView) {
        if (this.f == AnimationPhase.ERROR) {
            return;
        }
        this.a = recyclerView;
        recyclerView.addOnChildAttachStateChangeListener(this.j);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        }
    }

    public final void c() {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            recyclerView.removeOnChildAttachStateChangeListener(this.j);
        }
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = kotlin.collections.a.J0(linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            i((View) it.next(), true);
        }
        b();
        this.f = AnimationPhase.IDLE;
        this.a = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.i = null;
        this.h = null;
        linkedHashMap.clear();
    }

    public final dki0 d(View view) {
        RecyclerView recyclerView;
        Object findViewHolderForAdapterPosition;
        View view2;
        sg2 n;
        sg2 sg2Var = this.g;
        if (sg2Var == null || (recyclerView = this.a) == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(recyclerView.getChildAdapterPosition(view))) == null) {
            return null;
        }
        ig2 ig2Var = findViewHolderForAdapterPosition instanceof ig2 ? (ig2) findViewHolderForAdapterPosition : null;
        if (ig2Var == null || (view2 = ig2Var.y()) == null) {
            view2 = view;
        }
        if (ig2Var == null || ig2Var.v()) {
            if (ig2Var != null && (n = ig2Var.n()) != null) {
                sg2Var = n;
            }
            return new dki0(view, view2, ig2Var, sg2Var);
        }
        view2.setAlpha(1.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), 0);
        return null;
    }

    public final void e(final dki0 dki0Var, AnimationPhase animationPhase, CombinedValueAnimator combinedValueAnimator) {
        ValueAnimator b;
        sg2 sg2Var = dki0Var.d;
        View view = dki0Var.b;
        int i = b.a[animationPhase.ordinal()];
        if (i == 1) {
            b = sg2Var.b(view, new uo31(view.getAlpha(), view.getScaleX(), view.getScaleY(), view.getTranslationX(), view.getTranslationY(), view.getPaddingBottom()));
            b.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.tariffcard.ui.recyclerview.animationmanager.RecyclerViewItemAnimationManager$applyPhase1Animation$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator ignored) {
                    RecyclerViewItemAnimationManager recyclerViewItemAnimationManager = RecyclerViewItemAnimationManager.this;
                    dki0 dki0Var2 = dki0Var;
                    recyclerViewItemAnimationManager.c.add(dki0Var2.b);
                    recyclerViewItemAnimationManager.b.remove(dki0Var2.a);
                    recyclerViewItemAnimationManager.h();
                }
            });
        } else {
            if (i != 3) {
                return;
            }
            b = sg2Var.a(view);
            b.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.tariffcard.ui.recyclerview.animationmanager.RecyclerViewItemAnimationManager$applyPhase2Animation$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator ignored) {
                    RecyclerViewItemAnimationManager recyclerViewItemAnimationManager = RecyclerViewItemAnimationManager.this;
                    dki0 dki0Var2 = dki0Var;
                    recyclerViewItemAnimationManager.getClass();
                    recyclerViewItemAnimationManager.i(dki0Var2.a, true);
                    recyclerViewItemAnimationManager.h();
                }
            });
        }
        sg2Var.c(b, combinedValueAnimator.getDuration());
        b.setCurrentFraction(combinedValueAnimator.getAnimatedFraction());
        combinedValueAnimator.bindInnerAnimator(b);
        ig2 ig2Var = dki0Var.c;
        eki0 eki0Var = new eki0(view, ig2Var, b);
        if (animationPhase == AnimationPhase.PHASE_1_ACTIVE && ig2Var != null) {
            ig2Var.o();
        }
        this.b.put(dki0Var.a, eki0Var);
        h();
    }

    public final void f(a8p a8pVar, long j) {
        RecyclerView recyclerView = this.a;
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        if (this.f != AnimationPhase.IDLE) {
            return;
        }
        this.g = a8pVar;
        this.h = Long.valueOf(j);
        CombinedValueAnimator combinedValueAnimator = new CombinedValueAnimator(EmptyList.a, CombinedValueAnimator.DurationScaleMode.TOGETHER_START, j / 2);
        combinedValueAnimator.start();
        this.i = combinedValueAnimator;
        for (int i = 0; i < childCount; i++) {
            dki0 d = d(recyclerView.getChildAt(i));
            if (d != null) {
                i(d.a, false);
                e(d, AnimationPhase.PHASE_1_ACTIVE, combinedValueAnimator);
            }
        }
    }

    public final void g(String str) {
        jst.e.u(str);
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            recyclerView.setAdapter(recyclerView.getAdapter());
        }
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != null) {
            recyclerView2.setNestedScrollingEnabled(true);
        }
        c();
        this.f = AnimationPhase.ERROR;
    }

    public final void h() {
        AnimationPhase animationPhase;
        LinkedHashMap linkedHashMap = this.b;
        boolean isEmpty = linkedHashMap.values().isEmpty();
        AnimationPhase animationPhase2 = this.f;
        if (isEmpty) {
            int i = b.a[animationPhase2.ordinal()];
            if (i == 1) {
                animationPhase = AnimationPhase.PHASE_1_COMPLETE;
            } else if (i == 2) {
                animationPhase = AnimationPhase.PHASE_2;
            } else if (i != 3) {
                g("Illegal animation state in updateGlobalAnimationPhase: " + this.f);
            } else {
                animationPhase = AnimationPhase.IDLE;
            }
            this.f = animationPhase;
        } else if (animationPhase2 == AnimationPhase.IDLE) {
            this.f = AnimationPhase.PHASE_1_ACTIVE;
        }
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(this.f == AnimationPhase.IDLE);
        }
        if (this.f == AnimationPhase.PHASE_1_COMPLETE) {
            this.f = AnimationPhase.PHASE_2;
            tj tjVar = this.e;
            if (tjVar == null) {
                g("updateDataCallback is null in startSecondPhaseIfNeed");
            } else {
                List list = this.d;
                if (list == null) {
                    g("pendingItems is null in startSecondPhaseIfNeed");
                } else {
                    RecyclerView recyclerView2 = this.a;
                    if (recyclerView2 == null) {
                        g("recyclerView is null in startSecondPhaseIfNeed");
                    } else {
                        Long l = this.h;
                        if (l != null) {
                            long longValue = l.longValue();
                            tjVar.invoke(list);
                            CombinedValueAnimator combinedValueAnimator = new CombinedValueAnimator(EmptyList.a, CombinedValueAnimator.DurationScaleMode.TOGETHER_END, longValue / 2);
                            combinedValueAnimator.start();
                            this.i = combinedValueAnimator;
                            int childCount = recyclerView2.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                dki0 d = d(recyclerView2.getChildAt(i2));
                                if (d != null) {
                                    this.c.remove(d.b);
                                    e(d, AnimationPhase.PHASE_2, combinedValueAnimator);
                                }
                            }
                            b();
                        } else {
                            g("currentAnimationDuration is null in startSecondPhaseIfNeed");
                        }
                    }
                }
            }
        }
        if (this.f == AnimationPhase.IDLE) {
            this.d = null;
            this.e = null;
            this.g = null;
            this.i = null;
            this.h = null;
            linkedHashMap.clear();
        }
    }

    public final void i(View view, boolean z) {
        ValueAnimator valueAnimator;
        ArrayList<Animator.AnimatorListener> listeners;
        LinkedHashMap linkedHashMap = this.b;
        eki0 eki0Var = (eki0) linkedHashMap.get(view);
        if (eki0Var != null && (listeners = (valueAnimator = eki0Var.c).getListeners()) != null) {
            Iterator<T> it = listeners.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationCancel(valueAnimator);
            }
        }
        if (z) {
            if ((eki0Var != null ? eki0Var.a : null) != null) {
                View view2 = eki0Var.a;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), 0);
                ig2 ig2Var = eki0Var.b;
                if (ig2Var != null) {
                    ig2Var.a();
                }
                this.c.remove(eki0Var.a);
            }
        }
        linkedHashMap.remove(view);
    }
}
