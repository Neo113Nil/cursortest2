package com.yandex.go.benefits_center.benefits.router;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wgr;
import defpackage.wls;
import defpackage.zn5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.benefits_center.benefits.router.BenefitsCenterInnerRouter$handleReloadAction$1", f = "BenefitsCenterInnerRouter.kt", l = {205, 204}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BenefitsCenterInnerRouter$handleReloadAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ zn5 $payload;
    final /* synthetic */ boolean $showPreview;
    final /* synthetic */ boolean $skippBduiNavigationAction;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsCenterInnerRouter$handleReloadAction$1(d dVar, zn5 zn5Var, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = zn5Var;
        this.$skippBduiNavigationAction = z;
        this.$showPreview = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BenefitsCenterInnerRouter$handleReloadAction$1(this.this$0, this.$payload, this.$skippBduiNavigationAction, this.$showPreview, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BenefitsCenterInnerRouter$handleReloadAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r1.a((defpackage.kr) r9, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r9 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wgr wgrVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            wgrVar = dVar.H;
            com.yandex.go.benefits_center.benefits.sdk.document.a aVar = dVar.K;
            zn5 zn5Var = this.$payload;
            boolean z = this.$skippBduiNavigationAction;
            boolean z2 = this.$showPreview;
            this.L$0 = wgrVar;
            this.label = 1;
            obj = aVar.a(zn5Var, z, z2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wgrVar = (wgr) this.L$0;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
