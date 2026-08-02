package com.yandex.go.profile.domain.divkit.variables;

import defpackage.ak4;
import defpackage.co4;
import defpackage.d29;
import defpackage.e29;
import defpackage.hky0;
import defpackage.kj;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.vqd0;
import defpackage.w511;
import defpackage.xj4;
import defpackage.zj4;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ vqd0 b;

    public d(vpr vprVar, vqd0 vqd0Var) {
        this.a = vprVar;
        this.b = vqd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusVariableHandler$init$$inlined$map$1$2$1 plusVariableHandler$init$$inlined$map$1$2$1;
        int i;
        String str;
        if (continuation instanceof PlusVariableHandler$init$$inlined$map$1$2$1) {
            plusVariableHandler$init$$inlined$map$1$2$1 = (PlusVariableHandler$init$$inlined$map$1$2$1) continuation;
            int i2 = plusVariableHandler$init$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusVariableHandler$init$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusVariableHandler$init$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusVariableHandler$init$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ak4 ak4Var = (ak4) obj;
                    zj4 zj4Var = ak4Var instanceof zj4 ? (zj4) ak4Var : null;
                    xj4 xj4Var = zj4Var != null ? zj4Var.a : null;
                    if (xj4Var == null) {
                        str = null;
                    } else if (xj4Var instanceof hky0) {
                        str = ((hky0) xj4Var).a();
                    } else {
                        if (!(xj4Var instanceof co4)) {
                            w511.b();
                            return null;
                        }
                        vqd0 vqd0Var = this.b;
                        kj Ig = ((ru.yandex.taxi.am.g) vqd0Var.e.get()).a.Ig();
                        if (Ig == null || !Ig.d) {
                            str = ((e29) ((d29) vqd0Var.c.get())).a().b;
                        } else {
                            str = vqd0.f.a.format(new Double(((co4) xj4Var).f));
                        }
                    }
                    plusVariableHandler$init$$inlined$map$1$2$1.L$0 = null;
                    plusVariableHandler$init$$inlined$map$1$2$1.L$1 = null;
                    plusVariableHandler$init$$inlined$map$1$2$1.L$2 = null;
                    plusVariableHandler$init$$inlined$map$1$2$1.L$3 = null;
                    plusVariableHandler$init$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, plusVariableHandler$init$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        plusVariableHandler$init$$inlined$map$1$2$1 = new PlusVariableHandler$init$$inlined$map$1$2$1(this, continuation);
        Object obj22 = plusVariableHandler$init$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusVariableHandler$init$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
