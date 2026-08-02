package com.yandex.go.scooters.ble.domain.ninebot;

import android.bluetooth.BluetoothGatt;
import com.yandex.go.scooters.ble.api.exceptions.ScootersBleConnectionFailureException;
import com.yandex.go.scooters.ble.api.exceptions.ScootersCableUnlockFailedException;
import com.yandex.go.scooters.ble.api.exceptions.ScootersLockFailedException;
import com.yandex.go.scooters.ble.api.exceptions.ScootersSoundFailedException;
import com.yandex.go.scooters.ble.domain.model.ScootersBleCommandType;
import com.yandex.go.scooters.ble.domain.model.ninebot.Result;
import defpackage.dso0;
import defpackage.e1n0;
import defpackage.g0c;
import defpackage.g6p0;
import defpackage.h1b1;
import defpackage.iwo0;
import defpackage.ixn0;
import defpackage.jst;
import defpackage.n1n0;
import defpackage.ny61;
import defpackage.o1n0;
import defpackage.p1n0;
import defpackage.qoi0;
import defpackage.rzm0;
import defpackage.szm0;
import defpackage.t3n0;
import defpackage.u3n0;
import defpackage.w511;
import defpackage.zom0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements o1n0 {
    public final com.yandex.go.scooters.ble.data.ninebot.a a;
    public final p1n0 b;

    public a(dso0 dso0Var, com.yandex.go.scooters.ble.data.ninebot.a aVar, p1n0 p1n0Var) {
        this.a = aVar;
        this.b = p1n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.o1n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersBleCommandType scootersBleCommandType, e1n0 e1n0Var, ContinuationImpl continuationImpl) {
        ScootersBleNinebotProtocolInteractor$executeCommand$1 scootersBleNinebotProtocolInteractor$executeCommand$1;
        String str;
        Object obj = zy11.a;
        if (continuationImpl instanceof ScootersBleNinebotProtocolInteractor$executeCommand$1) {
            scootersBleNinebotProtocolInteractor$executeCommand$1 = (ScootersBleNinebotProtocolInteractor$executeCommand$1) continuationImpl;
            int i = scootersBleNinebotProtocolInteractor$executeCommand$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scootersBleNinebotProtocolInteractor$executeCommand$1.label = i - Integer.MIN_VALUE;
                Object obj2 = scootersBleNinebotProtocolInteractor$executeCommand$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (scootersBleNinebotProtocolInteractor$executeCommand$1.label) {
                    case 0:
                        b.b(obj2);
                        switch (n1n0.a[scootersBleCommandType.ordinal()]) {
                            case 1:
                                if (e1n0Var == null || (str = e1n0Var.a) == null) {
                                    throw new ScootersBleConnectionFailureException();
                                }
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$0 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$1 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$2 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.label = 1;
                                return c(str, scootersBleNinebotProtocolInteractor$executeCommand$1) == obj3 ? obj3 : obj;
                            case 2:
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$0 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$1 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.label = 2;
                                Object d = d(scootersBleNinebotProtocolInteractor$executeCommand$1);
                                if (d != obj3) {
                                    return d;
                                }
                                break;
                            case 3:
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$0 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$1 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.label = 3;
                                Object g = g(scootersBleNinebotProtocolInteractor$executeCommand$1);
                                if (g != obj3) {
                                    return g;
                                }
                                break;
                            case 4:
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$0 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$1 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.label = 4;
                                Object e = e(scootersBleNinebotProtocolInteractor$executeCommand$1);
                                if (e != obj3) {
                                    return e;
                                }
                                break;
                            case 5:
                                boolean z = e1n0Var != null ? e1n0Var.b : false;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$0 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$1 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.label = 5;
                                Object f = f(z, scootersBleNinebotProtocolInteractor$executeCommand$1);
                                if (f != obj3) {
                                    return f;
                                }
                                break;
                            case 6:
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$0 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.L$1 = null;
                                scootersBleNinebotProtocolInteractor$executeCommand$1.label = 6;
                                Byte b = this.b.a;
                                if (b != null) {
                                    obj = this.a.b(new t3n0(b.byteValue(), 4), true, scootersBleNinebotProtocolInteractor$executeCommand$1);
                                }
                                if (obj != obj3) {
                                    return obj;
                                }
                                break;
                            default:
                                w511.b();
                                return null;
                        }
                    case 1:
                        b.b(obj2);
                        return obj;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        b.b(obj2);
                        return obj2;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersBleNinebotProtocolInteractor$executeCommand$1 = new ScootersBleNinebotProtocolInteractor$executeCommand$1(this, continuationImpl);
        Object obj22 = scootersBleNinebotProtocolInteractor$executeCommand$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (scootersBleNinebotProtocolInteractor$executeCommand$1.label) {
        }
    }

    @Override // defpackage.o1n0
    public final Object b(String str, Continuation continuation) {
        return this.a.a(str, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ScootersBleNinebotProtocolInteractor$authCommand$1 scootersBleNinebotProtocolInteractor$authCommand$1;
        int i;
        g0c a;
        Object iwo0Var;
        if (continuationImpl instanceof ScootersBleNinebotProtocolInteractor$authCommand$1) {
            scootersBleNinebotProtocolInteractor$authCommand$1 = (ScootersBleNinebotProtocolInteractor$authCommand$1) continuationImpl;
            int i2 = scootersBleNinebotProtocolInteractor$authCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBleNinebotProtocolInteractor$authCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBleNinebotProtocolInteractor$authCommand$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBleNinebotProtocolInteractor$authCommand$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.go.scooters.ble.data.ninebot.a aVar = this.a;
                    rzm0 rzm0Var = new rzm0(str);
                    scootersBleNinebotProtocolInteractor$authCommand$1.L$0 = null;
                    scootersBleNinebotProtocolInteractor$authCommand$1.label = 1;
                    obj = aVar.c(rzm0Var, scootersBleNinebotProtocolInteractor$authCommand$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                byte[] bArr = (byte[]) obj;
                p1n0 p1n0Var = this.b;
                a = qoi0.a(szm0.class);
                if (!a.equals(qoi0.a(szm0.class))) {
                    iwo0Var = new szm0(bArr);
                } else if (a.equals(qoi0.a(ixn0.class))) {
                    iwo0Var = new ixn0(bArr);
                } else if (a.equals(qoi0.a(g6p0.class))) {
                    iwo0Var = new g6p0(bArr);
                } else if (a.equals(qoi0.a(u3n0.class))) {
                    iwo0Var = new u3n0(bArr);
                } else {
                    if (!a.equals(qoi0.a(iwo0.class))) {
                        ny61.g("Unknown scooters ble response type");
                        return null;
                    }
                    iwo0Var = new iwo0(bArr);
                }
                p1n0Var.a = Byte.valueOf(((szm0) iwo0Var).a);
                return zy11.a;
            }
        }
        scootersBleNinebotProtocolInteractor$authCommand$1 = new ScootersBleNinebotProtocolInteractor$authCommand$1(this, continuationImpl);
        Object obj3 = scootersBleNinebotProtocolInteractor$authCommand$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBleNinebotProtocolInteractor$authCommand$1.label;
        if (i != 0) {
        }
        byte[] bArr2 = (byte[]) obj3;
        p1n0 p1n0Var2 = this.b;
        a = qoi0.a(szm0.class);
        if (!a.equals(qoi0.a(szm0.class))) {
        }
        p1n0Var2.a = Byte.valueOf(((szm0) iwo0Var).a);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0064, code lost:
    
        if (r11 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersBleNinebotProtocolInteractor$lockScooter$1 scootersBleNinebotProtocolInteractor$lockScooter$1;
        Object obj;
        int i;
        Byte b;
        g0c a;
        Object iwo0Var;
        com.yandex.go.scooters.ble.data.ninebot.a aVar;
        t3n0 t3n0Var;
        ixn0 ixn0Var;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ScootersBleNinebotProtocolInteractor$lockScooter$1) {
            scootersBleNinebotProtocolInteractor$lockScooter$1 = (ScootersBleNinebotProtocolInteractor$lockScooter$1) continuationImpl;
            int i2 = scootersBleNinebotProtocolInteractor$lockScooter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBleNinebotProtocolInteractor$lockScooter$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersBleNinebotProtocolInteractor$lockScooter$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBleNinebotProtocolInteractor$lockScooter$1.label;
                if (i != 0) {
                    b.b(obj2);
                    b = this.b.a;
                    if (b != null) {
                        com.yandex.go.scooters.ble.data.ninebot.a aVar2 = this.a;
                        t3n0 t3n0Var2 = new t3n0(b.byteValue(), 1);
                        scootersBleNinebotProtocolInteractor$lockScooter$1.L$0 = b;
                        scootersBleNinebotProtocolInteractor$lockScooter$1.label = 1;
                        obj2 = aVar2.c(t3n0Var2, scootersBleNinebotProtocolInteractor$lockScooter$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixn0Var = (ixn0) scootersBleNinebotProtocolInteractor$lockScooter$1.L$2;
                    b.b(obj2);
                    if (ixn0Var.a == Result.FAILURE) {
                        throw new ScootersLockFailedException();
                    }
                    return zy11Var;
                }
                b = (Byte) scootersBleNinebotProtocolInteractor$lockScooter$1.L$0;
                b.b(obj2);
                byte[] bArr = (byte[]) obj2;
                a = qoi0.a(ixn0.class);
                if (!a.equals(qoi0.a(szm0.class))) {
                    iwo0Var = new szm0(bArr);
                } else if (a.equals(qoi0.a(ixn0.class))) {
                    iwo0Var = new ixn0(bArr);
                } else if (a.equals(qoi0.a(g6p0.class))) {
                    iwo0Var = new g6p0(bArr);
                } else if (a.equals(qoi0.a(u3n0.class))) {
                    iwo0Var = new u3n0(bArr);
                } else {
                    if (!a.equals(qoi0.a(iwo0.class))) {
                        ny61.g("Unknown scooters ble response type");
                        return null;
                    }
                    iwo0Var = new iwo0(bArr);
                }
                ixn0 ixn0Var2 = (ixn0) iwo0Var;
                aVar = this.a;
                t3n0Var = new t3n0(b.byteValue(), 2);
                scootersBleNinebotProtocolInteractor$lockScooter$1.L$0 = null;
                scootersBleNinebotProtocolInteractor$lockScooter$1.L$1 = null;
                scootersBleNinebotProtocolInteractor$lockScooter$1.L$2 = ixn0Var2;
                scootersBleNinebotProtocolInteractor$lockScooter$1.label = 2;
                if (aVar.b(t3n0Var, true, scootersBleNinebotProtocolInteractor$lockScooter$1) != obj) {
                    ixn0Var = ixn0Var2;
                    if (ixn0Var.a == Result.FAILURE) {
                    }
                    return zy11Var;
                }
                return obj;
            }
        }
        scootersBleNinebotProtocolInteractor$lockScooter$1 = new ScootersBleNinebotProtocolInteractor$lockScooter$1(this, continuationImpl);
        Object obj22 = scootersBleNinebotProtocolInteractor$lockScooter$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBleNinebotProtocolInteractor$lockScooter$1.label;
        if (i != 0) {
        }
        byte[] bArr2 = (byte[]) obj22;
        a = qoi0.a(ixn0.class);
        if (!a.equals(qoi0.a(szm0.class))) {
        }
        ixn0 ixn0Var22 = (ixn0) iwo0Var;
        aVar = this.a;
        t3n0Var = new t3n0(b.byteValue(), 2);
        scootersBleNinebotProtocolInteractor$lockScooter$1.L$0 = null;
        scootersBleNinebotProtocolInteractor$lockScooter$1.L$1 = null;
        scootersBleNinebotProtocolInteractor$lockScooter$1.L$2 = ixn0Var22;
        scootersBleNinebotProtocolInteractor$lockScooter$1.label = 2;
        if (aVar.b(t3n0Var, true, scootersBleNinebotProtocolInteractor$lockScooter$1) != obj) {
        }
        return obj;
    }

    @Override // defpackage.o1n0
    public final void disconnect() {
        this.b.a = null;
        com.yandex.go.scooters.ble.data.ninebot.a aVar = this.a;
        h1b1.j(aVar.a);
        zom0 zom0Var = aVar.d;
        if (zom0Var == null) {
            return;
        }
        BluetoothGatt bluetoothGatt = zom0Var.a;
        bluetoothGatt.close();
        bluetoothGatt.disconnect();
        aVar.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ScootersBleNinebotProtocolInteractor$makeSound$1 scootersBleNinebotProtocolInteractor$makeSound$1;
        int i;
        g0c a;
        Object iwo0Var;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ScootersBleNinebotProtocolInteractor$makeSound$1) {
            scootersBleNinebotProtocolInteractor$makeSound$1 = (ScootersBleNinebotProtocolInteractor$makeSound$1) continuationImpl;
            int i2 = scootersBleNinebotProtocolInteractor$makeSound$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBleNinebotProtocolInteractor$makeSound$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBleNinebotProtocolInteractor$makeSound$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBleNinebotProtocolInteractor$makeSound$1.label;
                if (i != 0) {
                    b.b(obj);
                    Byte b = this.b.a;
                    if (b != null) {
                        com.yandex.go.scooters.ble.data.ninebot.a aVar = this.a;
                        t3n0 t3n0Var = new t3n0(b.byteValue(), 3);
                        scootersBleNinebotProtocolInteractor$makeSound$1.L$0 = null;
                        scootersBleNinebotProtocolInteractor$makeSound$1.label = 1;
                        obj = aVar.c(t3n0Var, scootersBleNinebotProtocolInteractor$makeSound$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                byte[] bArr = (byte[]) obj;
                a = qoi0.a(iwo0.class);
                if (!a.equals(qoi0.a(szm0.class))) {
                    iwo0Var = new szm0(bArr);
                } else if (a.equals(qoi0.a(ixn0.class))) {
                    iwo0Var = new ixn0(bArr);
                } else if (a.equals(qoi0.a(g6p0.class))) {
                    iwo0Var = new g6p0(bArr);
                } else if (a.equals(qoi0.a(u3n0.class))) {
                    iwo0Var = new u3n0(bArr);
                } else {
                    if (!a.equals(qoi0.a(iwo0.class))) {
                        ny61.g("Unknown scooters ble response type");
                        return null;
                    }
                    iwo0Var = new iwo0(bArr);
                }
                if (((iwo0) iwo0Var).a == Result.FAILURE) {
                    throw new ScootersSoundFailedException();
                }
                return zy11Var;
            }
        }
        scootersBleNinebotProtocolInteractor$makeSound$1 = new ScootersBleNinebotProtocolInteractor$makeSound$1(this, continuationImpl);
        Object obj3 = scootersBleNinebotProtocolInteractor$makeSound$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBleNinebotProtocolInteractor$makeSound$1.label;
        if (i != 0) {
        }
        byte[] bArr2 = (byte[]) obj3;
        a = qoi0.a(iwo0.class);
        if (!a.equals(qoi0.a(szm0.class))) {
        }
        if (((iwo0) iwo0Var).a == Result.FAILURE) {
        }
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, ContinuationImpl continuationImpl) {
        ScootersBleNinebotProtocolInteractor$unlockCable$1 scootersBleNinebotProtocolInteractor$unlockCable$1;
        int i;
        g0c a;
        Object iwo0Var;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ScootersBleNinebotProtocolInteractor$unlockCable$1) {
            scootersBleNinebotProtocolInteractor$unlockCable$1 = (ScootersBleNinebotProtocolInteractor$unlockCable$1) continuationImpl;
            int i2 = scootersBleNinebotProtocolInteractor$unlockCable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBleNinebotProtocolInteractor$unlockCable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBleNinebotProtocolInteractor$unlockCable$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBleNinebotProtocolInteractor$unlockCable$1.label;
                if (i != 0) {
                    b.b(obj);
                    Byte b = this.b.a;
                    if (b != null) {
                        com.yandex.go.scooters.ble.data.ninebot.a aVar = this.a;
                        t3n0 t3n0Var = new t3n0(b.byteValue(), 0);
                        scootersBleNinebotProtocolInteractor$unlockCable$1.L$0 = null;
                        scootersBleNinebotProtocolInteractor$unlockCable$1.Z$0 = z;
                        scootersBleNinebotProtocolInteractor$unlockCable$1.label = 1;
                        obj = aVar.c(t3n0Var, scootersBleNinebotProtocolInteractor$unlockCable$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = scootersBleNinebotProtocolInteractor$unlockCable$1.Z$0;
                b.b(obj);
                byte[] bArr = (byte[]) obj;
                a = qoi0.a(u3n0.class);
                if (!a.equals(qoi0.a(szm0.class))) {
                    iwo0Var = new szm0(bArr);
                } else if (a.equals(qoi0.a(ixn0.class))) {
                    iwo0Var = new ixn0(bArr);
                } else if (a.equals(qoi0.a(g6p0.class))) {
                    iwo0Var = new g6p0(bArr);
                } else if (a.equals(qoi0.a(u3n0.class))) {
                    iwo0Var = new u3n0(bArr);
                } else {
                    if (!a.equals(qoi0.a(iwo0.class))) {
                        ny61.g("Unknown scooters ble response type");
                        return null;
                    }
                    iwo0Var = new iwo0(bArr);
                }
                if (((u3n0) iwo0Var).a == Result.FAILURE) {
                    ScootersCableUnlockFailedException scootersCableUnlockFailedException = new ScootersCableUnlockFailedException();
                    jst.e.k(scootersCableUnlockFailedException, "Cable unlock failure by ble. Is failure ignored? -> " + z);
                    if (!z) {
                        throw scootersCableUnlockFailedException;
                    }
                }
                return zy11Var;
            }
        }
        scootersBleNinebotProtocolInteractor$unlockCable$1 = new ScootersBleNinebotProtocolInteractor$unlockCable$1(this, continuationImpl);
        Object obj3 = scootersBleNinebotProtocolInteractor$unlockCable$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBleNinebotProtocolInteractor$unlockCable$1.label;
        if (i != 0) {
        }
        byte[] bArr2 = (byte[]) obj3;
        a = qoi0.a(u3n0.class);
        if (!a.equals(qoi0.a(szm0.class))) {
        }
        if (((u3n0) iwo0Var).a == Result.FAILURE) {
        }
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0065, code lost:
    
        if (r11 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ScootersBleNinebotProtocolInteractor$unlockScooter$1 scootersBleNinebotProtocolInteractor$unlockScooter$1;
        Object obj;
        int i;
        Byte b;
        g0c a;
        Object iwo0Var;
        com.yandex.go.scooters.ble.data.ninebot.a aVar;
        t3n0 t3n0Var;
        g6p0 g6p0Var;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ScootersBleNinebotProtocolInteractor$unlockScooter$1) {
            scootersBleNinebotProtocolInteractor$unlockScooter$1 = (ScootersBleNinebotProtocolInteractor$unlockScooter$1) continuationImpl;
            int i2 = scootersBleNinebotProtocolInteractor$unlockScooter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBleNinebotProtocolInteractor$unlockScooter$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersBleNinebotProtocolInteractor$unlockScooter$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBleNinebotProtocolInteractor$unlockScooter$1.label;
                if (i != 0) {
                    b.b(obj2);
                    b = this.b.a;
                    if (b != null) {
                        com.yandex.go.scooters.ble.data.ninebot.a aVar2 = this.a;
                        t3n0 t3n0Var2 = new t3n0(b.byteValue(), 5);
                        scootersBleNinebotProtocolInteractor$unlockScooter$1.L$0 = b;
                        scootersBleNinebotProtocolInteractor$unlockScooter$1.label = 1;
                        obj2 = aVar2.c(t3n0Var2, scootersBleNinebotProtocolInteractor$unlockScooter$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g6p0Var = (g6p0) scootersBleNinebotProtocolInteractor$unlockScooter$1.L$2;
                    b.b(obj2);
                    if (g6p0Var.a == Result.FAILURE) {
                        throw new ScootersLockFailedException();
                    }
                    return zy11Var;
                }
                b = (Byte) scootersBleNinebotProtocolInteractor$unlockScooter$1.L$0;
                b.b(obj2);
                byte[] bArr = (byte[]) obj2;
                a = qoi0.a(g6p0.class);
                if (!a.equals(qoi0.a(szm0.class))) {
                    iwo0Var = new szm0(bArr);
                } else if (a.equals(qoi0.a(ixn0.class))) {
                    iwo0Var = new ixn0(bArr);
                } else if (a.equals(qoi0.a(g6p0.class))) {
                    iwo0Var = new g6p0(bArr);
                } else if (a.equals(qoi0.a(u3n0.class))) {
                    iwo0Var = new u3n0(bArr);
                } else {
                    if (!a.equals(qoi0.a(iwo0.class))) {
                        ny61.g("Unknown scooters ble response type");
                        return null;
                    }
                    iwo0Var = new iwo0(bArr);
                }
                g6p0 g6p0Var2 = (g6p0) iwo0Var;
                aVar = this.a;
                t3n0Var = new t3n0(b.byteValue(), 6);
                scootersBleNinebotProtocolInteractor$unlockScooter$1.L$0 = null;
                scootersBleNinebotProtocolInteractor$unlockScooter$1.L$1 = null;
                scootersBleNinebotProtocolInteractor$unlockScooter$1.L$2 = g6p0Var2;
                scootersBleNinebotProtocolInteractor$unlockScooter$1.label = 2;
                if (aVar.b(t3n0Var, true, scootersBleNinebotProtocolInteractor$unlockScooter$1) != obj) {
                    g6p0Var = g6p0Var2;
                    if (g6p0Var.a == Result.FAILURE) {
                    }
                    return zy11Var;
                }
                return obj;
            }
        }
        scootersBleNinebotProtocolInteractor$unlockScooter$1 = new ScootersBleNinebotProtocolInteractor$unlockScooter$1(this, continuationImpl);
        Object obj22 = scootersBleNinebotProtocolInteractor$unlockScooter$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBleNinebotProtocolInteractor$unlockScooter$1.label;
        if (i != 0) {
        }
        byte[] bArr2 = (byte[]) obj22;
        a = qoi0.a(g6p0.class);
        if (!a.equals(qoi0.a(szm0.class))) {
        }
        g6p0 g6p0Var22 = (g6p0) iwo0Var;
        aVar = this.a;
        t3n0Var = new t3n0(b.byteValue(), 6);
        scootersBleNinebotProtocolInteractor$unlockScooter$1.L$0 = null;
        scootersBleNinebotProtocolInteractor$unlockScooter$1.L$1 = null;
        scootersBleNinebotProtocolInteractor$unlockScooter$1.L$2 = g6p0Var22;
        scootersBleNinebotProtocolInteractor$unlockScooter$1.label = 2;
        if (aVar.b(t3n0Var, true, scootersBleNinebotProtocolInteractor$unlockScooter$1) != obj) {
        }
        return obj;
    }
}
