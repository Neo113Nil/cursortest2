package com.yandex.go.overdraft.ui;

import defpackage.dug;
import defpackage.edi0;
import defpackage.ez80;
import defpackage.lea0;
import defpackage.ny61;
import defpackage.rhq0;
import defpackage.vpr;
import defpackage.yy51;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ dug b;

    public a(vpr vprVar, dug dugVar) {
        this.a = vprVar;
        this.b = dugVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if (r9.emit(r11, r6) != r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r11 == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1 debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        edi0 edi0Var;
        if (continuation instanceof DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1) {
            debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1 = (DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1 debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12 = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1;
                Object obj2 = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ez80 ez80Var = (ez80) obj;
                    com.yandex.go.overdraft.domain.e eVar = this.b.E;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$0 = null;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$1 = null;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$2 = null;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$3 = null;
                    vprVar = this.a;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$4 = vprVar;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$5 = null;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$6 = null;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.label = 1;
                    eVar.getClass();
                    rhq0 rhq0Var = ez80Var.a.b;
                    lea0 lea0Var = (rhq0Var == null || (edi0Var = rhq0Var.a) == null) ? null : edi0Var.a;
                    yy51 yy51Var = lea0Var instanceof yy51 ? (yy51) lea0Var : null;
                    obj2 = eVar.b(ez80Var.b, lea0Var, yy51Var != null ? eVar.g.a(yy51Var) : null, ez80Var.a, debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj2);
                }
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$0 = null;
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$1 = null;
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$2 = null;
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$3 = null;
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$4 = null;
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$5 = null;
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.L$6 = null;
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$12.label = 2;
            }
        }
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1 = new DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1 debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122 = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$1;
        Object obj22 = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.L$0 = null;
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.L$1 = null;
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.L$2 = null;
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.L$3 = null;
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.L$4 = null;
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.L$5 = null;
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.L$6 = null;
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$2$122.label = 2;
    }
}
