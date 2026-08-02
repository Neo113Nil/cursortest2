package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation;

import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferByDetailsEnterResultResult;
import defpackage.ch90;
import defpackage.gr01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.tq01;
import defpackage.tse;
import defpackage.wls;
import defpackage.zq01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteViewModel$onConfirmButtonClick$1", f = "TransferRequisiteViewModel.kt", l = {191, 193, 194}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferRequisiteViewModel$onConfirmButtonClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ tq01 $currentForm;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequisiteViewModel$onConfirmButtonClick$1(b bVar, tq01 tq01Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$currentForm = tq01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequisiteViewModel$onConfirmButtonClick$1(this.this$0, this.$currentForm, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequisiteViewModel$onConfirmButtonClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r13.c0(true, r12) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        if (r13.e0(true, r12) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0052, code lost:
    
        if (r13.u0(r12) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        boolean b0;
        TransferRequisiteResultEntity g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40 Y2 = this.this$0.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zq01.a((zq01) value, null, null, true, false, 11)));
            pzt0 pzt0Var = this.this$0.I;
            if (pzt0Var != null) {
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    if (((zq01) this.this$0.X()).d) {
                        b bVar = this.this$0;
                        this.label = 3;
                    }
                    b0 = b.b0(this.this$0);
                    this.this$0.d0().a((((zq01) this.this$0.X()).d && (((zq01) this.this$0.X()).a instanceof ch90)) ? !b0 ? TransferEvents$TransferByDetailsEnterResultResult.ERROR : TransferEvents$TransferByDetailsEnterResultResult.OK : TransferEvents$TransferByDetailsEnterResultResult.UNKNOWN, this.$currentForm);
                    if (b0) {
                        b bVar2 = this.this$0;
                        bVar2.L = true;
                        g = bVar2.N.n().g();
                        if (g != null) {
                        }
                    }
                    Y = this.this$0.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, zq01.a((zq01) value2, null, null, false, false, 11)));
                    return zy11.a;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b0 = b.b0(this.this$0);
                this.this$0.d0().a((((zq01) this.this$0.X()).d && (((zq01) this.this$0.X()).a instanceof ch90)) ? !b0 ? TransferEvents$TransferByDetailsEnterResultResult.ERROR : TransferEvents$TransferByDetailsEnterResultResult.OK : TransferEvents$TransferByDetailsEnterResultResult.UNKNOWN, this.$currentForm);
                if (b0 && !((zq01) this.this$0.X()).d) {
                    b bVar22 = this.this$0;
                    bVar22.L = true;
                    g = bVar22.N.n().g();
                    if (g != null) {
                        bVar22.Z(new gr01(g));
                    }
                }
                Y = this.this$0.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, zq01.a((zq01) value2, null, null, false, false, 11)));
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        boolean b02 = b.b0(this.this$0);
        b bVar3 = this.this$0;
        if (!b02) {
            bVar3.d0().a(TransferEvents$TransferByDetailsEnterResultResult.ERROR, this.$currentForm);
            Y = this.this$0.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, zq01.a((zq01) value2, null, null, false, false, 11)));
            return zy11.a;
        }
        if (!(((zq01) bVar3.X()).a instanceof ch90)) {
            b bVar4 = this.this$0;
            this.label = 2;
        }
        if (((zq01) this.this$0.X()).d) {
        }
        b0 = b.b0(this.this$0);
        this.this$0.d0().a((((zq01) this.this$0.X()).d && (((zq01) this.this$0.X()).a instanceof ch90)) ? !b0 ? TransferEvents$TransferByDetailsEnterResultResult.ERROR : TransferEvents$TransferByDetailsEnterResultResult.OK : TransferEvents$TransferByDetailsEnterResultResult.UNKNOWN, this.$currentForm);
        if (b0) {
        }
        Y = this.this$0.Y();
        do {
            r0Var2 = (r0) Y;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, zq01.a((zq01) value2, null, null, false, false, 11)));
        return zy11.a;
    }
}
