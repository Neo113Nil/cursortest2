package com.yandex.go.superapp.biometrics.data;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.superapp.biometrics.data.models.BiometricsBleReceiverDisconnectReason;
import defpackage.ac51;
import defpackage.bvf0;
import defpackage.c26;
import defpackage.dc51;
import defpackage.g050;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rol0;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uza;
import defpackage.vy5;
import defpackage.w511;
import defpackage.wy5;
import defpackage.x16;
import defpackage.xy5;
import defpackage.yb51;
import defpackage.z16;
import defpackage.zb51;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final Lifecycle a;
    public final hbp0 b;
    public int e;
    public final r0 c = bvf0.c(vy5.a);
    public final AtomicReference d = new AtomicReference(null);
    public final kotlinx.coroutines.sync.a f = gtq0.a();

    public a(tt2 tt2Var, Lifecycle lifecycle) {
        this.a = lifecycle;
        this.b = new hbp0(new BiometricsBleReceiverConnectionRepository$scope$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
    }

    public final void a(x16 x16Var) {
        r0 r0Var;
        Object value;
        xy5 xy5Var;
        do {
            r0Var = this.c;
            value = r0Var.getValue();
            xy5Var = (xy5) value;
        } while (!r0Var.k(value, vy5.a));
        if (xy5Var instanceof wy5) {
            com.yandex.go.ble.connection.a aVar = ((wy5) xy5Var).b;
            if (aVar == x16Var || x16Var == null) {
                aVar.c();
                this.b.b();
                this.d.set(null);
                this.e = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(Integer num, long j, ContinuationImpl continuationImpl) {
        BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1 biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1;
        int i;
        if (continuationImpl instanceof BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1) {
            biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1 = (BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1) continuationImpl;
            int i2 = biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.label;
                if (i != 0) {
                    b.b(obj);
                    h K = e.K(new rol0(new BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation8Mi8wO0$$inlined$transform$1(this.c, null, num)), new rol0(new BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1(j, null)));
                    biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.L$0 = null;
                    biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.L$1 = null;
                    biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.L$2 = null;
                    biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.J$0 = j;
                    biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.label = 1;
                    obj = e.y(K, biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                BiometricsBleReceiverDisconnectReason biometricsBleReceiverDisconnectReason = (BiometricsBleReceiverDisconnectReason) obj;
                a(null);
                return biometricsBleReceiverDisconnectReason;
            }
        }
        biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1 = new BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1(this, continuationImpl);
        Object obj2 = biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1.label;
        if (i != 0) {
        }
        BiometricsBleReceiverDisconnectReason biometricsBleReceiverDisconnectReason2 = (BiometricsBleReceiverDisconnectReason) obj2;
        a(null);
        return biometricsBleReceiverDisconnectReason2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:27:0x006f, B:30:0x007e, B:32:0x0084, B:33:0x0091, B:35:0x009c), top: B:26:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #1 {all -> 0x008c, blocks: (B:27:0x006f, B:30:0x007e, B:32:0x0084, B:33:0x0091, B:35:0x009c), top: B:26:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, com.yandex.go.ble.connection.a aVar, ContinuationImpl continuationImpl) {
        BiometricsBleReceiverConnectionRepository$establishNewConnection$1 biometricsBleReceiverConnectionRepository$establishNewConnection$1;
        int i;
        String str2;
        g050 g050Var;
        Object obj;
        Throwable th;
        g050 g050Var2;
        Object value;
        xy5 xy5Var;
        com.yandex.go.ble.connection.a aVar2;
        boolean z;
        hbp0 hbp0Var = this.b;
        r0 r0Var = this.c;
        if (continuationImpl instanceof BiometricsBleReceiverConnectionRepository$establishNewConnection$1) {
            biometricsBleReceiverConnectionRepository$establishNewConnection$1 = (BiometricsBleReceiverConnectionRepository$establishNewConnection$1) continuationImpl;
            int i2 = biometricsBleReceiverConnectionRepository$establishNewConnection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricsBleReceiverConnectionRepository$establishNewConnection$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = biometricsBleReceiverConnectionRepository$establishNewConnection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricsBleReceiverConnectionRepository$establishNewConnection$1.label;
                if (i != 0) {
                    b.b(obj2);
                    biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$0 = str;
                    biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$1 = aVar;
                    kotlinx.coroutines.sync.a aVar3 = this.f;
                    biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$2 = aVar3;
                    biometricsBleReceiverConnectionRepository$establishNewConnection$1.label = 1;
                    if (aVar3.a(biometricsBleReceiverConnectionRepository$establishNewConnection$1) != coroutineSingletons) {
                        str2 = str;
                        g050Var = aVar3;
                        obj = aVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var2 = (g050) biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$2;
                    try {
                        b.b(obj2);
                        z = ((c26) obj2) instanceof z16;
                        Boolean valueOf = Boolean.valueOf(z);
                        g050Var2.d(null);
                        return valueOf;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var2.d(null);
                        throw th;
                    }
                }
                g050Var = (g050) biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$2;
                Object obj3 = (x16) biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$1;
                str2 = (String) biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$0;
                b.b(obj2);
                obj = obj3;
                do {
                    try {
                        value = r0Var.getValue();
                    } catch (Throwable th3) {
                        g050 g050Var3 = g050Var;
                        th = th3;
                        g050Var2 = g050Var3;
                        g050Var2.d(null);
                        throw th;
                    }
                } while (!r0Var.k(value, vy5.a));
                xy5Var = (xy5) value;
                if (xy5Var instanceof wy5) {
                    ((wy5) xy5Var).b.c();
                }
                hbp0Var.f();
                aVar2 = (com.yandex.go.ble.connection.a) obj;
                if (aVar2.b()) {
                    g050 g050Var4 = g050Var;
                    z = false;
                    g050Var2 = g050Var4;
                    Boolean valueOf2 = Boolean.valueOf(z);
                    g050Var2.d(null);
                    return valueOf2;
                }
                wy5 wy5Var = new wy5(str2, aVar2);
                r0Var.getClass();
                r0Var.m(null, wy5Var);
                hbp0.e(hbp0Var, null, null, new BiometricsBleReceiverConnectionRepository$disconnectOnDeviceUnavailable$1(aVar2, this, null), 3);
                gci0 gci0Var = aVar2.d;
                BiometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1 biometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1 = new BiometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1(2, null);
                biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$0 = null;
                biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$1 = null;
                biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$2 = g050Var;
                biometricsBleReceiverConnectionRepository$establishNewConnection$1.L$3 = null;
                biometricsBleReceiverConnectionRepository$establishNewConnection$1.label = 2;
                obj2 = e.x(gci0Var, biometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1, biometricsBleReceiverConnectionRepository$establishNewConnection$1);
                if (obj2 != coroutineSingletons) {
                    g050Var2 = g050Var;
                    z = ((c26) obj2) instanceof z16;
                    Boolean valueOf22 = Boolean.valueOf(z);
                    g050Var2.d(null);
                    return valueOf22;
                }
                return coroutineSingletons;
            }
        }
        biometricsBleReceiverConnectionRepository$establishNewConnection$1 = new BiometricsBleReceiverConnectionRepository$establishNewConnection$1(this, continuationImpl);
        Object obj22 = biometricsBleReceiverConnectionRepository$establishNewConnection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricsBleReceiverConnectionRepository$establishNewConnection$1.label;
        if (i != 0) {
        }
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, vy5.a));
        xy5Var = (xy5) value;
        if (xy5Var instanceof wy5) {
        }
        hbp0Var.f();
        aVar2 = (com.yandex.go.ble.connection.a) obj;
        if (aVar2.b()) {
        }
    }

    public final void d() {
        AtomicReference atomicReference;
        pzt0 e = hbp0.e(this.b, null, CoroutineStart.LAZY, new BiometricsBleReceiverConnectionRepository$startConnectionHeartbeat$job$1(this, null), 1);
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(null, e)) {
                e.start();
                return;
            }
        } while (atomicReference.get() == null);
        e.a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, dc51 dc51Var, tls tlsVar, ContinuationImpl continuationImpl) {
        BiometricsBleReceiverConnectionRepository$writeCharacteristic$1 biometricsBleReceiverConnectionRepository$writeCharacteristic$1;
        int i;
        ac51 ac51Var;
        if (continuationImpl instanceof BiometricsBleReceiverConnectionRepository$writeCharacteristic$1) {
            biometricsBleReceiverConnectionRepository$writeCharacteristic$1 = (BiometricsBleReceiverConnectionRepository$writeCharacteristic$1) continuationImpl;
            int i2 = biometricsBleReceiverConnectionRepository$writeCharacteristic$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricsBleReceiverConnectionRepository$writeCharacteristic$1.label = i2 - Integer.MIN_VALUE;
                BiometricsBleReceiverConnectionRepository$writeCharacteristic$1 biometricsBleReceiverConnectionRepository$writeCharacteristic$12 = biometricsBleReceiverConnectionRepository$writeCharacteristic$1;
                Object obj = biometricsBleReceiverConnectionRepository$writeCharacteristic$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricsBleReceiverConnectionRepository$writeCharacteristic$12.label;
                if (i != 0) {
                    b.b(obj);
                    xy5 xy5Var = (xy5) this.c.getValue();
                    if (xy5Var instanceof vy5) {
                        return yb51.b;
                    }
                    if (!(xy5Var instanceof wy5)) {
                        w511.b();
                        return null;
                    }
                    wy5 wy5Var = (wy5) xy5Var;
                    com.yandex.go.ble.connection.a aVar = wy5Var.b;
                    String str2 = wy5Var.a;
                    byte[] bytes = ((String) tlsVar.invoke(str2)).getBytes(uza.a);
                    biometricsBleReceiverConnectionRepository$writeCharacteristic$12.L$0 = null;
                    biometricsBleReceiverConnectionRepository$writeCharacteristic$12.L$1 = null;
                    biometricsBleReceiverConnectionRepository$writeCharacteristic$12.L$2 = null;
                    biometricsBleReceiverConnectionRepository$writeCharacteristic$12.L$3 = null;
                    biometricsBleReceiverConnectionRepository$writeCharacteristic$12.label = 1;
                    obj = aVar.g(str2, str, bytes, dc51Var, biometricsBleReceiverConnectionRepository$writeCharacteristic$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ac51Var = (ac51) obj;
                if (!(ac51Var instanceof zb51)) {
                    a(null);
                }
                return ac51Var;
            }
        }
        biometricsBleReceiverConnectionRepository$writeCharacteristic$1 = new BiometricsBleReceiverConnectionRepository$writeCharacteristic$1(this, continuationImpl);
        BiometricsBleReceiverConnectionRepository$writeCharacteristic$1 biometricsBleReceiverConnectionRepository$writeCharacteristic$122 = biometricsBleReceiverConnectionRepository$writeCharacteristic$1;
        Object obj2 = biometricsBleReceiverConnectionRepository$writeCharacteristic$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricsBleReceiverConnectionRepository$writeCharacteristic$122.label;
        if (i != 0) {
        }
        ac51Var = (ac51) obj2;
        if (!(ac51Var instanceof zb51)) {
        }
        return ac51Var;
    }
}
