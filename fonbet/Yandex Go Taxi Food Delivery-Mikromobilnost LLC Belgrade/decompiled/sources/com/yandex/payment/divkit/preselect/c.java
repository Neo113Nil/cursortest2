package com.yandex.payment.divkit.preselect;

import defpackage.aq4;
import defpackage.cq4;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.sv90;
import defpackage.tje;
import defpackage.tyh0;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.y22;
import defpackage.yp4;
import defpackage.zp4;
import defpackage.zve0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class c implements vpr {
    public final /* synthetic */ f a;

    public c(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        cq4 cq4Var = (cq4) obj;
        boolean l = jl40.l(cq4Var, zp4.a);
        zy11 zy11Var = zy11.a;
        f fVar = this.a;
        if (l) {
            rwo rwoVar = fVar.c;
            qv90.a.getClass();
            ((y22) rwoVar).a(sv90.R());
            Object emit = fVar.F.emit(new zve0(tyh0.paymentsdk_error, tyh0.paymentsdk_error_top_up), continuation);
            if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return emit;
            }
        } else {
            if (!jl40.l(cq4Var, aq4.a)) {
                if (jl40.l(cq4Var, yp4.b)) {
                    rwo rwoVar2 = fVar.c;
                    qv90.a.getClass();
                    ((y22) rwoVar2).a(sv90.Q());
                    return zy11Var;
                }
                if (jl40.l(cq4Var, yp4.d)) {
                    rwo rwoVar3 = fVar.c;
                    qv90.a.getClass();
                    ((y22) rwoVar3).a(sv90.U());
                    return zy11Var;
                }
                if (jl40.l(cq4Var, yp4.a)) {
                    rwo rwoVar4 = fVar.c;
                    qv90.a.getClass();
                    ((y22) rwoVar4).a(sv90.P());
                    return zy11Var;
                }
                if (!jl40.l(cq4Var, yp4.c)) {
                    jl40.l(cq4Var, yp4.e);
                    return zy11Var;
                }
                rwo rwoVar5 = fVar.c;
                qv90.a.getClass();
                ((y22) rwoVar5).a(sv90.T());
                return zy11Var;
            }
            rwo rwoVar6 = fVar.c;
            qv90.a.getClass();
            ((y22) rwoVar6).a(sv90.S());
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new DKPreselectViewModel$startPlusCardTopUpSyncing$2(fVar, null), continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return k0;
            }
        }
        return zy11Var;
    }
}
