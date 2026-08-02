package com.yandex.go.overdraft.domain;

import com.yandex.go.yb.data.u;
import defpackage.edi0;
import defpackage.ez80;
import defpackage.jug;
import defpackage.lea0;
import defpackage.mt;
import defpackage.mug;
import defpackage.ny61;
import defpackage.rhq0;
import defpackage.uv51;
import defpackage.yy51;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class o {
    public final h a;
    public final e b;
    public final u c;

    public o(h hVar, e eVar, u uVar) {
        this.a = hVar;
        this.b = eVar;
        this.c = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, ez80 ez80Var, ContinuationImpl continuationImpl) {
        OverdraftPaymentMainButtonInteractor$convertActionButtonUiState$1 overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1;
        int i;
        uv51 uv51Var;
        edi0 edi0Var;
        mt mtVar;
        e eVar = oVar.b;
        if (continuationImpl instanceof OverdraftPaymentMainButtonInteractor$convertActionButtonUiState$1) {
            overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1 = (OverdraftPaymentMainButtonInteractor$convertActionButtonUiState$1) continuationImpl;
            int i2 = overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rhq0 rhq0Var = ez80Var.a.b;
                    lea0 lea0Var = (rhq0Var == null || (edi0Var = rhq0Var.a) == null) ? null : edi0Var.a;
                    if (lea0Var instanceof yy51) {
                        yy51 yy51Var = (yy51) lea0Var;
                        uv51Var = oVar.c.c().B.W(yy51Var.a, yy51Var.c);
                    } else {
                        uv51Var = null;
                    }
                    mug mugVar = ez80Var.b.b;
                    overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.L$0 = null;
                    overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.L$1 = null;
                    overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.L$2 = null;
                    overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.label = 1;
                    obj = eVar.a(mugVar, lea0Var, uv51Var, overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                jug jugVar = (jug) obj;
                mtVar = jugVar.a;
                if (mtVar == null) {
                    return mtVar;
                }
                mt mtVar2 = jugVar.b;
                return mtVar2 == null ? eVar.c() : mtVar2;
            }
        }
        overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1 = new OverdraftPaymentMainButtonInteractor$convertActionButtonUiState$1(oVar, continuationImpl);
        Object obj2 = overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentMainButtonInteractor$convertActionButtonUiState$1.label;
        if (i != 0) {
        }
        jug jugVar2 = (jug) obj2;
        mtVar = jugVar2.a;
        if (mtVar == null) {
        }
    }
}
