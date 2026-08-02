package com.yandex.messaging.domain.personal;

import defpackage.lqo;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tz10;
import defpackage.vpr;
import defpackage.w4b0;
import defpackage.x4b0;
import defpackage.zrm;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zrm b;

    public b(vpr vprVar, zrm zrmVar) {
        this.a = vprVar;
        this.b = zrmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1 getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1) {
            getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1 = (GetPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1) continuation;
            int i2 = getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    w4b0[] w4b0VarArr = ((x4b0) obj).j;
                    ArrayList arrayList = new ArrayList();
                    for (w4b0 w4b0Var : w4b0VarArr) {
                        if (!w4b0Var.d) {
                            arrayList.add(w4b0Var);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        w4b0 w4b0Var2 = (w4b0) it.next();
                        if (!((lqo) this.b.c).a(tz10.L)) {
                            w4b0Var2 = new w4b0(w4b0Var2.a, w4b0Var2.g, w4b0Var2.b, w4b0Var2.c, w4b0Var2.d, w4b0Var2.e, false);
                        }
                        arrayList2.add(w4b0Var2);
                    }
                    getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList2, getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1 = new GetPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getPersonalOrganizationsUseCase$execute$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
