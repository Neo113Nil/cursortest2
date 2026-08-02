package com.ybsdk.widgets.common.shimmer;

import defpackage.hur0;
import defpackage.iur0;
import defpackage.jur0;
import defpackage.kur0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Llur0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.widgets.common.shimmer.ShimmerHandlerImpl$startShimmerFlow$1", f = "ShimmerHandlerImpl.kt", l = {20, 21, 23, 24, 25, 31, 32, 34, 43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShimmerHandlerImpl$startShimmerFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerHandlerImpl$startShimmerFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShimmerHandlerImpl$startShimmerFlow$1 shimmerHandlerImpl$startShimmerFlow$1 = new ShimmerHandlerImpl$startShimmerFlow$1(this.this$0, continuation);
        shimmerHandlerImpl$startShimmerFlow$1.L$0 = obj;
        return shimmerHandlerImpl$startShimmerFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShimmerHandlerImpl$startShimmerFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0132, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011d, code lost:
    
        if (kotlinx.coroutines.a.i(r3, r7) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0148, code lost:
    
        if (r5.collect(r6, r7) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (kotlinx.coroutines.a.i(r3, r7) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0160, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (kotlinx.coroutines.a.i(r3, r7) != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                vpr vprVar2 = (vpr) this.L$0;
                jur0 jur0Var = new jur0(this.this$0.a);
                this.L$0 = vprVar2;
                this.label = 1;
                if (vprVar2.emit(jur0Var, this) != coroutineSingletons) {
                    vprVar = vprVar2;
                    long delayBeforeShowShimmerMs = this.this$0.a.a.m().getDelayBeforeShowShimmerMs();
                    this.L$0 = vprVar;
                    this.label = 2;
                    break;
                }
                break;
            case 1:
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
                long delayBeforeShowShimmerMs2 = this.this$0.a.a.m().getDelayBeforeShowShimmerMs();
                this.L$0 = vprVar;
                this.label = 2;
                break;
            case 2:
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
                boolean booleanValue = ((Boolean) this.this$0.b.getValue()).booleanValue();
                b bVar = this.this$0;
                if (!booleanValue) {
                    kur0 kur0Var = new kur0(bVar.a);
                    this.L$0 = vprVar;
                    this.label = 3;
                    break;
                } else {
                    hur0 hur0Var = new hur0(bVar.a);
                    this.L$0 = null;
                    this.label = 9;
                    break;
                }
            case 3:
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
                long showShimmerVisibilityAnimationMs = this.this$0.a.a.m().getShowShimmerVisibilityAnimationMs();
                this.L$0 = vprVar;
                this.label = 4;
                break;
            case 4:
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
                iur0 iur0Var = new iur0(this.this$0.a);
                this.L$0 = vprVar;
                this.label = 5;
                break;
            case 5:
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
                long shimmerMinimumVisibleTimeMs = this.this$0.a.a.m().getShimmerMinimumVisibleTimeMs() - this.this$0.a.a.m().getShowShimmerVisibilityAnimationMs();
                if (shimmerMinimumVisibleTimeMs < 0) {
                    shimmerMinimumVisibleTimeMs = 0;
                }
                if (!((Boolean) this.this$0.b.getValue()).booleanValue()) {
                    b bVar2 = this.this$0;
                    r0 r0Var = bVar2.b;
                    a aVar = new a(shimmerMinimumVisibleTimeMs, vprVar, bVar2);
                    this.L$0 = null;
                    this.label = 8;
                    break;
                } else {
                    this.L$0 = vprVar;
                    this.label = 6;
                    break;
                }
            case 6:
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
                hur0 hur0Var2 = new hur0(this.this$0.a);
                this.L$0 = null;
                this.label = 7;
                break;
            case 7:
            case 9:
                kotlin.b.b(obj);
                break;
            case 8:
                kotlin.b.b(obj);
                ny61.A();
                break;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                break;
        }
        return null;
    }
}
