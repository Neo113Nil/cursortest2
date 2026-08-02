package com.ybsdk.screens.upgrade.domain.interactors;

import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import defpackage.aes0;
import defpackage.bes0;
import defpackage.db21;
import defpackage.des0;
import defpackage.ja21;
import defpackage.ny61;
import defpackage.pb21;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public b(vpr vprVar, c cVar) {
        this.b = cVar;
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0119, code lost:
    
        if (r13.emit(r14, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x011b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0108, code lost:
    
        if (r14 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
    
        if (r13.emit(defpackage.ob21.a, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        if (r13.emit(defpackage.qb21.a, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpgradeInteractorImpl$special$$inlined$transform$1$1$1 upgradeInteractorImpl$special$$inlined$transform$1$1$1;
        int i;
        ja21 ja21Var;
        vpr vprVar;
        List list;
        Object b;
        if (continuation instanceof UpgradeInteractorImpl$special$$inlined$transform$1$1$1) {
            upgradeInteractorImpl$special$$inlined$transform$1$1$1 = (UpgradeInteractorImpl$special$$inlined$transform$1$1$1) continuation;
            int i2 = upgradeInteractorImpl$special$$inlined$transform$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeInteractorImpl$special$$inlined$transform$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = upgradeInteractorImpl$special$$inlined$transform$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeInteractorImpl$special$$inlined$transform$1$1$1.label;
                c cVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ja21Var = (ja21) obj;
                    des0 des0Var = cVar.c;
                    boolean validationEnabled = des0Var.a.getValidationEnabled();
                    vprVar = this.a;
                    if (validationEnabled) {
                        SimpleIdFormFieldEntity.Companion.getClass();
                        list = SimpleIdFormFieldEntity.sorted;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (((SimpleIdFormFieldEntity) obj3) != SimpleIdFormFieldEntity.INN_OR_SNILS) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            SimpleIdFormFieldEntity simpleIdFormFieldEntity = (SimpleIdFormFieldEntity) it.next();
                            arrayList2.add(des0Var.e(simpleIdFormFieldEntity, ja21Var.b(simpleIdFormFieldEntity)));
                        }
                        if (!arrayList2.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (!(((bes0) it2.next()) instanceof aes0)) {
                                    upgradeInteractorImpl$special$$inlined$transform$1$1$1.label = 4;
                                }
                            }
                        }
                    }
                    upgradeInteractorImpl$special$$inlined$transform$1$1$1.L$0 = ja21Var;
                    upgradeInteractorImpl$special$$inlined$transform$1$1$1.L$1 = vprVar;
                    upgradeInteractorImpl$special$$inlined$transform$1$1$1.label = 1;
                } else if (i == 1) {
                    vprVar = (vpr) upgradeInteractorImpl$special$$inlined$transform$1$1$1.L$1;
                    ja21Var = (ja21) upgradeInteractorImpl$special$$inlined$transform$1$1$1.L$0;
                    kotlin.b.b(obj2);
                    cVar.d.s0.a.a("upgrade.data.search_inn.initiated", null);
                    db21 db21Var = cVar.a;
                    upgradeInteractorImpl$special$$inlined$transform$1$1$1.L$0 = vprVar;
                    upgradeInteractorImpl$special$$inlined$transform$1$1$1.L$1 = null;
                    upgradeInteractorImpl$special$$inlined$transform$1$1$1.label = 2;
                    b = ((com.ybsdk.screens.upgrade.data.a) db21Var).b(ja21Var, upgradeInteractorImpl$special$$inlined$transform$1$1$1);
                } else if (i == 2) {
                    vprVar = (vpr) upgradeInteractorImpl$special$$inlined$transform$1$1$1.L$0;
                    kotlin.b.b(obj2);
                    b = ((Result) obj2).getValue();
                    if (b instanceof Result.Failure) {
                        b = pb21.a;
                    }
                    upgradeInteractorImpl$special$$inlined$transform$1$1$1.L$0 = null;
                    upgradeInteractorImpl$special$$inlined$transform$1$1$1.label = 3;
                } else {
                    if (i != 3 && i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        upgradeInteractorImpl$special$$inlined$transform$1$1$1 = new UpgradeInteractorImpl$special$$inlined$transform$1$1$1(this, continuation);
        Object obj22 = upgradeInteractorImpl$special$$inlined$transform$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeInteractorImpl$special$$inlined$transform$1$1$1.label;
        c cVar2 = this.b;
        if (i != 0) {
        }
        return zy11.a;
    }
}
