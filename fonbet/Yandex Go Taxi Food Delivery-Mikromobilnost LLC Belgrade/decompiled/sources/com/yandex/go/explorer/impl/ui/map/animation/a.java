package com.yandex.go.explorer.impl.ui.map.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import defpackage.bvf0;
import defpackage.dvo;
import defpackage.dvw;
import defpackage.i18;
import defpackage.j18;
import defpackage.juo;
import defpackage.loj;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.ym11;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final ArrayList a = new ArrayList();
    public boolean b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final a aVar, final int i, final wls wlsVar, final tls tlsVar, ContinuationImpl continuationImpl) {
        ExplorerUnviewedHexAnimator$fadeOutSingle$1 explorerUnviewedHexAnimator$fadeOutSingle$1;
        int i2;
        aVar.getClass();
        if (continuationImpl instanceof ExplorerUnviewedHexAnimator$fadeOutSingle$1) {
            explorerUnviewedHexAnimator$fadeOutSingle$1 = (ExplorerUnviewedHexAnimator$fadeOutSingle$1) continuationImpl;
            int i3 = explorerUnviewedHexAnimator$fadeOutSingle$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                explorerUnviewedHexAnimator$fadeOutSingle$1.label = i3 - Integer.MIN_VALUE;
                Object obj = explorerUnviewedHexAnimator$fadeOutSingle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = explorerUnviewedHexAnimator$fadeOutSingle$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    explorerUnviewedHexAnimator$fadeOutSingle$1.L$0 = wlsVar;
                    explorerUnviewedHexAnimator$fadeOutSingle$1.L$1 = tlsVar;
                    explorerUnviewedHexAnimator$fadeOutSingle$1.I$0 = i;
                    explorerUnviewedHexAnimator$fadeOutSingle$1.label = 1;
                    final j18 j18Var = new j18(1, dvw.b(explorerUnviewedHexAnimator$fadeOutSingle$1));
                    j18Var.u();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.8f, 0.0f);
                    ofFloat.setDuration(450L);
                    ofFloat.setInterpolator(new AccelerateInterpolator());
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.go.explorer.impl.ui.map.animation.ExplorerUnviewedHexAnimator$fadeOutSingle$2$animator$1$1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            wls.this.invoke(Integer.valueOf(i), (Float) valueAnimator.getAnimatedValue());
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.explorer.impl.ui.map.animation.ExplorerUnviewedHexAnimator$fadeOutSingle$2$animator$1$2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animation) {
                            tls.this.invoke(Integer.valueOf(i));
                            ym11.a(aVar.a).remove(animation);
                            a aVar2 = aVar;
                            i18 i18Var = j18Var;
                            aVar2.getClass();
                            if (i18Var.isActive()) {
                                i18Var.resumeWith(zy11.a);
                            }
                        }
                    });
                    aVar.a.add(ofFloat);
                    j18Var.w(new dvo(ofFloat, aVar, 0));
                    ofFloat.start();
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        explorerUnviewedHexAnimator$fadeOutSingle$1 = new ExplorerUnviewedHexAnimator$fadeOutSingle$1(aVar, continuationImpl);
        Object obj2 = explorerUnviewedHexAnimator$fadeOutSingle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = explorerUnviewedHexAnimator$fadeOutSingle$1.label;
        if (i2 != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(final a aVar, final int i, final wls wlsVar, ContinuationImpl continuationImpl) {
        ExplorerUnviewedHexAnimator$flashSingle$1 explorerUnviewedHexAnimator$flashSingle$1;
        int i2;
        aVar.getClass();
        if (continuationImpl instanceof ExplorerUnviewedHexAnimator$flashSingle$1) {
            explorerUnviewedHexAnimator$flashSingle$1 = (ExplorerUnviewedHexAnimator$flashSingle$1) continuationImpl;
            int i3 = explorerUnviewedHexAnimator$flashSingle$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                explorerUnviewedHexAnimator$flashSingle$1.label = i3 - Integer.MIN_VALUE;
                Object obj = explorerUnviewedHexAnimator$flashSingle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = explorerUnviewedHexAnimator$flashSingle$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    explorerUnviewedHexAnimator$flashSingle$1.L$0 = wlsVar;
                    explorerUnviewedHexAnimator$flashSingle$1.I$0 = i;
                    explorerUnviewedHexAnimator$flashSingle$1.label = 1;
                    final j18 j18Var = new j18(1, dvw.b(explorerUnviewedHexAnimator$flashSingle$1));
                    j18Var.u();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.8f);
                    ofFloat.setDuration(85L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.go.explorer.impl.ui.map.animation.ExplorerUnviewedHexAnimator$flashSingle$2$animator$1$1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            wls.this.invoke(Integer.valueOf(i), (Float) valueAnimator.getAnimatedValue());
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.explorer.impl.ui.map.animation.ExplorerUnviewedHexAnimator$flashSingle$2$animator$1$2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animation) {
                            ym11.a(a.this.a).remove(animation);
                            a aVar2 = a.this;
                            i18 i18Var = j18Var;
                            aVar2.getClass();
                            if (i18Var.isActive()) {
                                i18Var.resumeWith(zy11.a);
                            }
                        }
                    });
                    aVar.a.add(ofFloat);
                    j18Var.w(new dvo(ofFloat, aVar, 1));
                    ofFloat.start();
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        explorerUnviewedHexAnimator$flashSingle$1 = new ExplorerUnviewedHexAnimator$flashSingle$1(aVar, continuationImpl);
        Object obj2 = explorerUnviewedHexAnimator$flashSingle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = explorerUnviewedHexAnimator$flashSingle$1.label;
        if (i2 != 0) {
        }
        return zy11.a;
    }

    public final Object c(int i, wls wlsVar, loj lojVar, juo juoVar, Continuation continuation) {
        this.b = false;
        Object n = bvf0.n(new ExplorerUnviewedHexAnimator$animateSequentially$2(i, this, wlsVar, lojVar, juoVar, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
