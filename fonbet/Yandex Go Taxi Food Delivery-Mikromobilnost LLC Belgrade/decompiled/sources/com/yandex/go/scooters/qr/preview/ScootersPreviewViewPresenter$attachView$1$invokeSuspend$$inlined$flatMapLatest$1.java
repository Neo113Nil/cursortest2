package com.yandex.go.scooters.qr.preview;

import android.graphics.drawable.Drawable;
import defpackage.bno0;
import defpackage.hmo0;
import defpackage.imo0;
import defpackage.jl40;
import defpackage.jmo0;
import defpackage.kmo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.preview.ScootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ScootersPreviewViewPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ Drawable $shadowBg$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ bno0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, bno0 bno0Var, Drawable drawable) {
        super(3, continuation);
        this.this$0 = bno0Var;
        this.$shadowBg$inlined = drawable;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 scootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 = new ScootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$shadowBg$inlined);
        scootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return scootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr tprVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            jmo0 jmo0Var = (jmo0) obj2;
            bno0 bno0Var = this.this$0;
            Drawable drawable = this.$shadowBg$inlined;
            if (jmo0Var instanceof imo0) {
                ((kmo0) bno0Var.Dg()).o5(drawable);
                tprVar = ((imo0) jmo0Var).a;
            } else {
                bno0Var.getClass();
                if (!jl40.l(jmo0Var, hmo0.a)) {
                    w511.b();
                    return null;
                }
                ((kmo0) bno0Var.Dg()).hide();
                tprVar = pvn.a;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(tprVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
