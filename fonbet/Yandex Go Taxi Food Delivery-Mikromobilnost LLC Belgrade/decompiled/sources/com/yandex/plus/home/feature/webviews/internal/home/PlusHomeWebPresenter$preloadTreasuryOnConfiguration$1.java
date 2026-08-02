package com.yandex.plus.home.feature.webviews.internal.home;

import defpackage.ef41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebPresenter$preloadTreasuryOnConfiguration$1", f = "PlusHomeWebPresenter.kt", l = {605, 608}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusHomeWebPresenter$preloadTreasuryOnConfiguration$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeWebPresenter$preloadTreasuryOnConfiguration$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusHomeWebPresenter$preloadTreasuryOnConfiguration$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusHomeWebPresenter$preloadTreasuryOnConfiguration$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r6.c(r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = this.this$0.N.b;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.A(n0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        ef41 ef41Var = (ef41) obj;
        if (ef41Var != null && ef41Var.d && (r6 = (com.yandex.plus.home.feature.webviews.internal.treasury.c) this.this$0.a0.getValue()) != null) {
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
