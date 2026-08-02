package com.yandex.go.design.compose.ratingbar;

import defpackage.ck11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tse;
import defpackage.wls;
import defpackage.yp5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.ratingbar.RatingBarKt$SelectedStar$1$1", f = "RatingBar.kt", l = {237, 246}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RatingBarKt$SelectedStar$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $scale;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingBarKt$SelectedStar$1$1(androidx.compose.animation.core.a aVar, Continuation continuation) {
        super(2, continuation);
        this.$scale = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RatingBarKt$SelectedStar$1$1(this.$scale, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RatingBarKt$SelectedStar$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (androidx.compose.animation.core.a.d(r6, r7, r8, null, null, r11, 12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (androidx.compose.animation.core.a.d(r6, r7, r8, null, null, r11, 12) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RatingBarKt$SelectedStar$1$1 ratingBarKt$SelectedStar$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            androidx.compose.animation.core.a aVar = this.$scale;
            Float f = new Float(1.2f);
            ck11 K = sb2.K(175, 0, new yp5(3), 2);
            this.label = 1;
            ratingBarKt$SelectedStar$1$1 = this;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            ratingBarKt$SelectedStar$1$1 = this;
        }
        androidx.compose.animation.core.a aVar2 = ratingBarKt$SelectedStar$1$1.$scale;
        Float f2 = new Float(1.0f);
        ck11 K2 = sb2.K(175, 0, new yp5(4), 2);
        ratingBarKt$SelectedStar$1$1.label = 2;
    }
}
