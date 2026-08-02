package com.yandex.go.chargers.debt.screen.domain;

import com.yandex.go.chargers.debt.screen.data.model.ChargersDebtPayOffResponse;
import defpackage.c29;
import defpackage.cy9;
import defpackage.fmt;
import defpackage.m6a0;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.rp9;
import defpackage.s8o;
import defpackage.tp9;
import defpackage.vp9;
import defpackage.whb1;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final c29 a;
    public final vp9 b;

    public a(c29 c29Var, vp9 vp9Var) {
        this.a = c29Var;
        this.b = vp9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[Catch: all -> 0x0036, CancellationException -> 0x008a, TRY_ENTER, TryCatch #2 {CancellationException -> 0x008a, all -> 0x0036, blocks: (B:11:0x0032, B:12:0x005d, B:15:0x0069, B:18:0x007c, B:23:0x0042), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[Catch: all -> 0x0036, CancellationException -> 0x008a, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x008a, all -> 0x0036, blocks: (B:11:0x0032, B:12:0x005d, B:15:0x0069, B:18:0x007c, B:23:0x0042), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m6a0 m6a0Var, String str, ContinuationImpl continuationImpl) {
        ChargersDebtPayOffInteractor$payOff$1 chargersDebtPayOffInteractor$payOff$1;
        int i;
        cy9 cy9Var;
        vp9 vp9Var;
        String a;
        String str2;
        try {
            if (continuationImpl instanceof ChargersDebtPayOffInteractor$payOff$1) {
                chargersDebtPayOffInteractor$payOff$1 = (ChargersDebtPayOffInteractor$payOff$1) continuationImpl;
                int i2 = chargersDebtPayOffInteractor$payOff$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersDebtPayOffInteractor$payOff$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersDebtPayOffInteractor$payOff$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersDebtPayOffInteractor$payOff$1.label;
                    cy9Var = null;
                    vp9Var = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        r0 r0Var = vp9Var.a;
                        tp9 tp9Var = tp9.a;
                        r0Var.getClass();
                        r0Var.m(null, tp9Var);
                        c29 c29Var = this.a;
                        chargersDebtPayOffInteractor$payOff$1.L$0 = null;
                        chargersDebtPayOffInteractor$payOff$1.L$1 = null;
                        chargersDebtPayOffInteractor$payOff$1.label = 1;
                        obj = c29Var.f(str, m6a0Var, chargersDebtPayOffInteractor$payOff$1);
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
                    fmt fmtVar = (fmt) obj;
                    str2 = ((ChargersDebtPayOffResponse) fmtVar.a).a;
                    zy11 zy11Var = zy11.a;
                    if (str2 != null) {
                        vp9Var.a(new cy9(7, null, fmtVar.e.a("X-YaTraceId"), null, null));
                        return zy11Var;
                    }
                    r0 r0Var2 = vp9Var.a;
                    rp9 rp9Var = new rp9(str2);
                    r0Var2.getClass();
                    r0Var2.m(null, rp9Var);
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            fmt fmtVar2 = (fmt) obj;
            str2 = ((ChargersDebtPayOffResponse) fmtVar2.a).a;
            zy11 zy11Var2 = zy11.a;
            if (str2 != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            oeu O = s8o.O(th);
            if (O != null && (a = O.a("X-YaTraceId")) != null) {
                cy9Var = new cy9(7, null, a, null, null);
            }
            vp9Var.a(cy9Var);
            whb1.c("Error while chargers debt payment attempt", th);
            throw th;
        }
        chargersDebtPayOffInteractor$payOff$1 = new ChargersDebtPayOffInteractor$payOff$1(this, continuationImpl);
        Object obj2 = chargersDebtPayOffInteractor$payOff$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDebtPayOffInteractor$payOff$1.label;
        cy9Var = null;
        vp9Var = this.b;
    }
}
