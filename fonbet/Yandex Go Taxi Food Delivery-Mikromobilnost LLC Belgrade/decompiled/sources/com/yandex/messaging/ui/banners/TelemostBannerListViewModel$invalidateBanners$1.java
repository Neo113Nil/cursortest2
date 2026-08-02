package com.yandex.messaging.ui.banners;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.banners.TelemostBannerListViewModel$invalidateBanners$1", f = "TelemostBannerListViewModel.kt", l = {165, 167}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TelemostBannerListViewModel$invalidateBanners$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelemostBannerListViewModel$invalidateBanners$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TelemostBannerListViewModel$invalidateBanners$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TelemostBannerListViewModel$invalidateBanners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r5 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            Y = this.this$0.Y();
            r0 r0Var = this.this$0.C;
            this.L$0 = Y;
            this.label = 1;
            r0Var.emit(Y, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Y = (List) this.L$0;
            b.b(obj);
        }
        if (((Number) this.this$0.D.getValue()).intValue() >= Y.size()) {
            r0 r0Var2 = this.this$0.D;
            Integer num = new Integer(0);
            this.L$0 = null;
            this.label = 2;
            r0Var2.emit(num, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
