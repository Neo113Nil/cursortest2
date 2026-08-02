package com.yandex.go.summary.interactor.anchored.state.content;

import defpackage.evu0;
import defpackage.f9u;
import defpackage.i4u;
import defpackage.jl40;
import defpackage.mja1;
import defpackage.ny61;
import defpackage.qau;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wdu;
import defpackage.wgv0;
import defpackage.xgv0;
import defpackage.ygv0;
import defpackage.zgv0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;

    public o(vpr vprVar, i4u i4uVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        HeaderUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1 headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1;
        int i;
        wdu wduVar;
        if (continuation instanceof HeaderUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1) {
            headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1 = (HeaderUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1) continuation;
            int i2 = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zgv0 zgv0Var = (zgv0) obj;
                    if (jl40.l(zgv0Var, wgv0.a)) {
                        wduVar = null;
                    } else if (zgv0Var instanceof xgv0) {
                        xgv0 xgv0Var = (xgv0) zgv0Var;
                        String str = xgv0Var.a;
                        wduVar = new wdu(null, new f9u(str), i4u.i(xgv0Var.b), str);
                    } else {
                        if (!(zgv0Var instanceof ygv0)) {
                            w511.b();
                            return null;
                        }
                        ygv0 ygv0Var = (ygv0) zgv0Var;
                        int i3 = ygv0Var.c;
                        Integer valueOf = Integer.valueOf(i3);
                        if (i3 == 0) {
                            valueOf = null;
                        }
                        String str2 = ygv0Var.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        wduVar = new wdu((evu0.J(str2) && valueOf == null) ? null : new qau(mja1.b(str2, null, 6), valueOf), new f9u(ygv0Var.a), i4u.i(ygv0Var.d), ygv0Var.e);
                    }
                    headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.L$0 = null;
                    headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.L$1 = null;
                    headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.L$2 = null;
                    headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.L$3 = null;
                    headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(wduVar, headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1 = new HeaderUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
