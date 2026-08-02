package com.yandex.go.taxi.summary.verticalsummary.repository;

import defpackage.ffx;
import defpackage.ny61;
import defpackage.oev0;
import defpackage.pev0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class a implements pev0 {
    public final n0 a;
    public final n0 b;

    public a() {
        n0 b = ffx.b(0, 1, BufferOverflow.SUSPEND);
        this.a = b;
        this.b = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (com.yandex.go.coroutines.b.n(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.pev0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oev0 oev0Var, Continuation continuation) {
        VerticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1 verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1;
        int i;
        if (continuation instanceof VerticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1) {
            verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1 = (VerticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1) continuation;
            int i2 = verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.label;
                n0 n0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.L$0 = oev0Var;
                    verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    oev0Var = (oev0) verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.L$0;
                    kotlin.b.b(obj);
                }
                verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.L$0 = null;
                verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.label = 2;
                Object emit = n0Var.emit(oev0Var, verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1);
                return emit != coroutineSingletons ? coroutineSingletons : emit;
            }
        }
        verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1 = new VerticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1(this, continuation);
        Object obj2 = verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.label;
        n0 n0Var2 = this.a;
        if (i != 0) {
        }
        verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.L$0 = null;
        verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1.label = 2;
        Object emit2 = n0Var2.emit(oev0Var, verticalSummaryActionRepositoryImpl$sendSummaryComposeAction$1);
        if (emit2 != coroutineSingletons2) {
        }
    }

    @Override // defpackage.pev0
    public final n0 b() {
        return this.b;
    }
}
