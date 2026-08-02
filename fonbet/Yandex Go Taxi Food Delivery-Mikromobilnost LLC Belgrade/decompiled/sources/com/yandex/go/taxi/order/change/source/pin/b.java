package com.yandex.go.taxi.order.change.source.pin;

import defpackage.an8;
import defpackage.g6u;
import defpackage.gcc0;
import defpackage.gg9;
import defpackage.kgx;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.qdx;
import defpackage.rme0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wh70;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class b {
    public final tt2 a;
    public final com.yandex.go.navigation.screen.c b;
    public final n20 c;
    public final an8 d;
    public final com.yandex.go.taxi.order.change.source.data.e e;
    public final gcc0 f;

    public b(tt2 tt2Var, com.yandex.go.navigation.screen.c cVar, n20 n20Var, an8 an8Var, com.yandex.go.taxi.order.change.source.data.e eVar, gcc0 gcc0Var) {
        this.a = tt2Var;
        this.b = cVar;
        this.c = n20Var;
        this.d = an8Var;
        this.e = eVar;
        this.f = gcc0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (defpackage.tje.k0(r9, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        ChangeSourcePointPinEntryInteractorImpl$onClicked$1 changeSourcePointPinEntryInteractorImpl$onClicked$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ChangeSourcePointPinEntryInteractorImpl$onClicked$1) {
            changeSourcePointPinEntryInteractorImpl$onClicked$1 = (ChangeSourcePointPinEntryInteractorImpl$onClicked$1) continuationImpl;
            int i2 = changeSourcePointPinEntryInteractorImpl$onClicked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointPinEntryInteractorImpl$onClicked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeSourcePointPinEntryInteractorImpl$onClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointPinEntryInteractorImpl$onClicked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (o2y0Var == null) {
                        return Boolean.FALSE;
                    }
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    ChangeSourcePointPinEntryInteractorImpl$onClicked$2 changeSourcePointPinEntryInteractorImpl$onClicked$2 = new ChangeSourcePointPinEntryInteractorImpl$onClicked$2(this, null);
                    changeSourcePointPinEntryInteractorImpl$onClicked$1.L$0 = o2y0Var;
                    changeSourcePointPinEntryInteractorImpl$onClicked$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o2y0Var = (o2y0) changeSourcePointPinEntryInteractorImpl$onClicked$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            z = true;
                            if (z) {
                                String str = o2y0Var.b().a;
                                gg9 gg9Var = (gg9) this.d.c;
                                rme0 rme0Var = gg9Var.b;
                                qdx qdxVar = gg9Var.a;
                                kgx[] kgxVarArr = gg9.e;
                                List list = (List) rme0Var.getValue(gg9Var, kgxVarArr[1]);
                                if (!list.contains(str)) {
                                    qdxVar.setValue(gg9Var, kgxVarArr[0], Integer.valueOf(((Number) qdxVar.getValue(gg9Var, kgxVarArr[0])).intValue() + 1));
                                    rme0Var.setValue(gg9Var, kgxVarArr[1], kotlin.collections.a.m0(Collections.singletonList(str), kotlin.collections.a.B0(10, list)));
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                        z = false;
                        if (z) {
                        }
                        return Boolean.valueOf(z);
                    }
                    o2y0Var = (o2y0) changeSourcePointPinEntryInteractorImpl$onClicked$1.L$0;
                    kotlin.b.b(obj);
                }
                if (new wh70(o2y0Var.b()).b()) {
                    changeSourcePointPinEntryInteractorImpl$onClicked$1.L$0 = o2y0Var;
                    changeSourcePointPinEntryInteractorImpl$onClicked$1.label = 2;
                    obj = this.e.c(changeSourcePointPinEntryInteractorImpl$onClicked$1);
                }
                z = false;
                if (z) {
                }
                return Boolean.valueOf(z);
            }
        }
        changeSourcePointPinEntryInteractorImpl$onClicked$1 = new ChangeSourcePointPinEntryInteractorImpl$onClicked$1(this, continuationImpl);
        Object obj2 = changeSourcePointPinEntryInteractorImpl$onClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointPinEntryInteractorImpl$onClicked$1.label;
        if (i != 0) {
        }
        if (new wh70(o2y0Var.b()).b()) {
        }
        z = false;
        if (z) {
        }
        return Boolean.valueOf(z);
    }

    public final tpr b(tpr tprVar, DriveState driveState) {
        tpr t = kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.change.source.data.d(this.e.a.a(), driveState));
        com.yandex.go.navigation.screen.b c = this.b.c();
        com.yandex.go.taxi.order.provider.a aVar = (com.yandex.go.taxi.order.provider.a) this.c;
        g a = aVar.a();
        r0 v = aVar.v();
        an8 an8Var = this.d;
        tpr t2 = kotlinx.coroutines.flow.e.t(new a(new tpr[]{t, c, a, v, tprVar, new d(((com.yandex.go.coroutines.g) an8Var.x).c, an8Var), new f(((com.yandex.go.coroutines.g) an8Var.b).c, an8Var)}, this, driveState));
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(t2, uyj.a);
    }
}
