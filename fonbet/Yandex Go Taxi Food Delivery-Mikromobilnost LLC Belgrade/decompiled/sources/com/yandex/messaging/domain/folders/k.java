package com.yandex.messaging.domain.folders;

import defpackage.gxr;
import defpackage.hwr;
import defpackage.ny61;
import defpackage.q7t;
import defpackage.r7t;
import defpackage.s7t;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.x400;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetFoldersUseCase$run$lambda$3$$inlined$map$1$2$1 getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetFoldersUseCase$run$lambda$3$$inlined$map$1$2$1) {
            getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1 = (GetFoldersUseCase$run$lambda$3$$inlined$map$1$2$1) continuation;
            int i2 = getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gxr gxrVar = (gxr) obj;
                    x400 x400Var = gxrVar.a;
                    s7t s7tVar = x400Var != null ? new s7t(x400Var.a) : null;
                    List<hwr> list = gxrVar.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (hwr hwrVar : list) {
                        arrayList.add(new q7t(hwrVar.a, hwrVar.b, hwrVar.d, hwrVar.c));
                    }
                    r7t r7tVar = new r7t(s7tVar, arrayList);
                    getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(r7tVar, getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1 = new GetFoldersUseCase$run$lambda$3$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getFoldersUseCase$run$lambda$3$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
