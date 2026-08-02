package com.yandex.mobile.drive.scan.ui;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import defpackage.dvw;
import defpackage.i18;
import defpackage.j1;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.scan.ui.ScanPresenter$takePreviewImage$image$1", f = "ScanPresenter.kt", l = {391}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ScanPresenter$takePreviewImage$image$1 extends SuspendLambda implements tls {
    final /* synthetic */ c $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanPresenter$takePreviewImage$image$1(c cVar, Continuation continuation) {
        super(1, continuation);
        this.$view = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScanPresenter$takePreviewImage$image$1(this.$view, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScanPresenter$takePreviewImage$image$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.$view;
        this.label = 1;
        cVar.o.animate().alpha(0.0f);
        cVar.m.animate().alpha(0.0f);
        ViewPropertyAnimator alpha = cVar.l.animate().alpha(0.0f);
        final j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        j18Var.w(new j1(3, alpha));
        alpha.setListener(new Animator.AnimatorListener() { // from class: com.yandex.mobile.drive.extensions.AnimatorKt$awaitEnd$2$2
            private boolean endedSuccessfully = true;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                this.endedSuccessfully = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                animation.removeListener(this);
                if (i18.this.isActive()) {
                    boolean z = this.endedSuccessfully;
                    i18 i18Var = i18.this;
                    if (z) {
                        i18Var.resumeWith(zy11.a);
                    } else {
                        i18Var.b(null);
                    }
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                this.endedSuccessfully = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                this.endedSuccessfully = true;
            }
        });
        Object s = j18Var.s();
        if (s != coroutineSingletons) {
            s = zy11Var;
        }
        if (s != coroutineSingletons) {
            s = zy11Var;
        }
        return s == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
