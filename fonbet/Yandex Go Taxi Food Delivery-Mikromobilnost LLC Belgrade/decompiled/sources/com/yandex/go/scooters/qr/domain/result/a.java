package com.yandex.go.scooters.qr.domain.result;

import com.yandex.go.scooters.qr.domain.c;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qoo0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.q;

/* loaded from: classes13.dex */
public final class a {
    public final po21 a;
    public final qoo0 b;
    public final c c;
    public final q d;

    public a(po21 po21Var, qoo0 qoo0Var, c cVar, q qVar) {
        this.a = po21Var;
        this.b = qoo0Var;
        this.c = cVar;
        this.d = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersScanResultHandlingInteractorFactory$create$1 scootersScanResultHandlingInteractorFactory$create$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersScanResultHandlingInteractorFactory$create$1) {
            scootersScanResultHandlingInteractorFactory$create$1 = (ScootersScanResultHandlingInteractorFactory$create$1) continuationImpl;
            int i2 = scootersScanResultHandlingInteractorFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersScanResultHandlingInteractorFactory$create$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersScanResultHandlingInteractorFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersScanResultHandlingInteractorFactory$create$1.label;
                c cVar = this.c;
                qoo0 qoo0Var = this.b;
                po21 po21Var = this.a;
                q qVar = this.d;
                if (i != 0) {
                    b.b(obj);
                    scootersScanResultHandlingInteractorFactory$create$1.label = 1;
                    obj = qVar.j(scootersScanResultHandlingInteractorFactory$create$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            return new com.yandex.go.scooters.qr.domain.result.handler.a(po21Var, qoo0Var, cVar);
                        }
                        return new com.yandex.go.scooters.qr.domain.result.handler.b(po21Var, qoo0Var, cVar);
                    }
                    b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    scootersScanResultHandlingInteractorFactory$create$1.label = 2;
                    obj = qVar.k(scootersScanResultHandlingInteractorFactory$create$1);
                }
                return new com.yandex.go.scooters.qr.domain.result.handler.b(po21Var, qoo0Var, cVar);
            }
        }
        scootersScanResultHandlingInteractorFactory$create$1 = new ScootersScanResultHandlingInteractorFactory$create$1(this, continuationImpl);
        obj = scootersScanResultHandlingInteractorFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersScanResultHandlingInteractorFactory$create$1.label;
        c cVar2 = this.c;
        qoo0 qoo0Var2 = this.b;
        po21 po21Var2 = this.a;
        q qVar2 = this.d;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return new com.yandex.go.scooters.qr.domain.result.handler.b(po21Var2, qoo0Var2, cVar2);
    }
}
