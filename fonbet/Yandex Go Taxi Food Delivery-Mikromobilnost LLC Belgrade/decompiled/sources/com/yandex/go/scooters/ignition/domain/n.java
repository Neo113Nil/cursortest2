package com.yandex.go.scooters.ignition.domain;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.yandex.go.scooters.domain.model.ScootersNotificationType;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.a60;
import defpackage.c1n0;
import defpackage.k0b0;
import defpackage.m2o0;
import defpackage.ny61;
import defpackage.o2o0;
import defpackage.qwo0;
import defpackage.v7j0;
import defpackage.y50;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class n {
    public final y50 a;
    public final k0b0 b;
    public final ru.yandex.taxi.activity.g c;
    public final c1n0 d;
    public final qwo0 e;
    public final v7j0 f;
    public final ru.yandex.taxi.systemrequeirements.location.n g;
    public final m2o0 h;

    public n(y50 y50Var, k0b0 k0b0Var, ru.yandex.taxi.activity.g gVar, c1n0 c1n0Var, qwo0 qwo0Var, v7j0 v7j0Var, ru.yandex.taxi.systemrequeirements.location.n nVar, m2o0 m2o0Var) {
        this.a = y50Var;
        this.b = k0b0Var;
        this.c = gVar;
        this.d = c1n0Var;
        this.e = qwo0Var;
        this.f = v7j0Var;
        this.g = nVar;
        this.h = m2o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ScootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1 scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1;
        int i;
        if (continuation instanceof ScootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1) {
            scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1 = (ScootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1) continuation;
            int i2 = scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                com.yandex.go.permission.b bVar = (com.yandex.go.permission.b) this.f;
                boolean f = bVar.f(11);
                qwo0 qwo0Var = this.e;
                if (!f && ((Boolean) qwo0Var.r.getValue(qwo0Var, qwo0.B[16])).booleanValue()) {
                    ((a60) this.a).d();
                    return zy11Var;
                }
                qwo0Var.r.setValue(qwo0Var, qwo0.B[16], Boolean.TRUE);
                scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1.label = 1;
                return bVar.d(11, scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1 = new ScootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1(this, continuation);
        Object obj2 = scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequirementsRequestInteractor$requestBluetoothPermission$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        ScootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1 scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1;
        int i;
        if (continuation instanceof ScootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1) {
            scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1 = (ScootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1) continuation;
            int i2 = scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                com.yandex.go.permission.b bVar = (com.yandex.go.permission.b) this.f;
                if (bVar.f(15)) {
                    scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1.label = 1;
                    return bVar.d(15, scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                ((a60) this.a).d();
                return zy11Var;
            }
        }
        scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1 = new ScootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1(this, continuation);
        Object obj2 = scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequirementsRequestInteractor$requestGeolocationPermission$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        ScootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1 scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1;
        int i;
        if (continuation instanceof ScootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1) {
            scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1 = (ScootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1) continuation;
            int i2 = scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                com.yandex.go.permission.b bVar = (com.yandex.go.permission.b) this.f;
                if (bVar.f(12)) {
                    scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1.label = 1;
                    return bVar.d(12, scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                ((a60) this.a).d();
                return zy11Var;
            }
        }
        scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1 = new ScootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1(this, continuation);
        Object obj2 = scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequirementsRequestInteractor$requestNotificationPermission$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (a(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Continuation continuation) {
        ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1 scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1;
        int i;
        if (continuation instanceof ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1) {
            scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1 = (ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1) continuation;
            int i2 = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (this.b.h() || this.d.a()) {
                    return zy11.a;
                }
                scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1.label = 2;
                Object g = g(scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1);
                return g == obj2 ? obj2 : g;
            }
        }
        scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1 = new ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1(this, continuation);
        Object obj3 = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableBluetooth$1.label;
        if (i != 0) {
        }
        if (this.b.h()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (b(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Continuation continuation) {
        ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1 scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1;
        int i;
        if (continuation instanceof ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1) {
            scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1 = (ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1) continuation;
            int i2 = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (this.b.g() || !this.g.c()) {
                    return zy11.a;
                }
                scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1.label = 2;
                Object h = h(scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1);
                return h == obj2 ? obj2 : h;
            }
        }
        scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1 = new ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1(this, continuation);
        Object obj3 = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableGeolocation$1.label;
        if (i != 0) {
        }
        if (this.b.g()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (c(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Continuation continuation) {
        ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1 scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1;
        int i;
        if (continuation instanceof ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1) {
            scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1 = (ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1) continuation;
            int i2 = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (this.b.f()) {
                    return zy11.a;
                }
                scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1.label = 2;
                Object i3 = i(scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1);
                return i3 == obj2 ? obj2 : i3;
            }
        }
        scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1 = new ScootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1(this, continuation);
        Object obj3 = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequirementsRequestInteractor$requestPermissionAndTryToEnableNotification$1.label;
        if (i != 0) {
        }
        if (this.b.f()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Continuation continuation) {
        ScootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1 scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1;
        int i;
        if (continuation instanceof ScootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1) {
            scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1 = (ScootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1) continuation;
            int i2 = scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a60 a60Var = (a60) this.a;
                    a60Var.getClass();
                    try {
                        try {
                            a60Var.e(139, new Intent("android.settings.BLUETOOTH_SETTINGS"));
                        } catch (Exception unused) {
                            a60Var.e(PollMessageDraft.MAX_ANSWER_LENGTH, new Intent("android.settings.WIRELESS_SETTINGS"));
                        }
                    } catch (Exception unused2) {
                        try {
                            a60Var.e(141, new Intent("android.settings.SETTINGS"));
                        } catch (ActivityNotFoundException unused3) {
                        }
                    }
                    n0 n0Var = this.c.b;
                    scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(n0Var, scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1 = new ScootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1(this, continuation);
        Object obj2 = scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequirementsRequestInteractor$tryToEnableBluetooth$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        defpackage.jst.e.i("ScootersIgnition", r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Continuation continuation) {
        ScootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1 scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1;
        int i;
        if (continuation instanceof ScootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1) {
            scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1 = (ScootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1) continuation;
            int i2 = scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.systemrequeirements.location.n nVar = this.g;
                    scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1.label = 1;
                    if (nVar.d(scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1 = new ScootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1(this, continuation);
        Object obj2 = scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cc, code lost:
    
        if (kotlinx.coroutines.flow.e.y(r13, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        if (kotlinx.coroutines.flow.e.y(r13, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (kotlinx.coroutines.flow.e.y(r13, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Continuation continuation) {
        ScootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1 scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1;
        int i;
        o2o0 o2o0Var;
        ScootersNotificationType scootersNotificationType;
        o2o0 o2o0Var2;
        ScootersNotificationType scootersNotificationType2;
        o2o0 o2o0Var3;
        if (continuation instanceof ScootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1) {
            scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1 = (ScootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1) continuation;
            int i2 = scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.label;
                zy11 zy11Var = zy11.a;
                ru.yandex.taxi.activity.g gVar = this.c;
                y50 y50Var = this.a;
                m2o0 m2o0Var = this.h;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!((o2o0) m2o0Var).c.b()) {
                        a60 a60Var = (a60) y50Var;
                        a60Var.getClass();
                        try {
                            a60Var.e(142, new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", a60Var.a.getApplication().getPackageName()));
                        } catch (ActivityNotFoundException unused) {
                        }
                        n0 n0Var = gVar.b;
                        scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            scootersNotificationType = ScootersNotificationType.DEFAULT;
                            o2o0Var2 = (o2o0) m2o0Var;
                            if (!o2o0Var2.e(scootersNotificationType)) {
                                ((a60) y50Var).a(o2o0Var2.g(scootersNotificationType));
                                n0 n0Var2 = gVar.b;
                                scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.label = 3;
                            }
                            scootersNotificationType2 = ScootersNotificationType.IMPORTANT;
                            o2o0Var3 = (o2o0) m2o0Var;
                            if (!o2o0Var3.e(scootersNotificationType2)) {
                            }
                            return zy11Var;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                kotlin.b.b(obj);
                                return zy11Var;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        scootersNotificationType2 = ScootersNotificationType.IMPORTANT;
                        o2o0Var3 = (o2o0) m2o0Var;
                        if (!o2o0Var3.e(scootersNotificationType2)) {
                            ((a60) y50Var).a(o2o0Var3.g(scootersNotificationType2));
                            n0 n0Var3 = gVar.b;
                            scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.label = 4;
                            if (kotlinx.coroutines.flow.e.y(n0Var3, scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                o2o0Var = (o2o0) m2o0Var;
                if (o2o0Var.c.b()) {
                    ScootersNotificationType scootersNotificationType3 = ScootersNotificationType.SYSTEM;
                    if (!o2o0Var.e(scootersNotificationType3)) {
                        ((a60) y50Var).a(o2o0Var.g(scootersNotificationType3));
                        n0 n0Var4 = gVar.b;
                        scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.label = 2;
                    }
                    scootersNotificationType = ScootersNotificationType.DEFAULT;
                    o2o0Var2 = (o2o0) m2o0Var;
                    if (!o2o0Var2.e(scootersNotificationType)) {
                    }
                    scootersNotificationType2 = ScootersNotificationType.IMPORTANT;
                    o2o0Var3 = (o2o0) m2o0Var;
                    if (!o2o0Var3.e(scootersNotificationType2)) {
                    }
                }
                return zy11Var;
            }
        }
        scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1 = new ScootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1(this, continuation);
        Object obj2 = scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequirementsRequestInteractor$tryToEnableNotification$1.label;
        zy11 zy11Var2 = zy11.a;
        ru.yandex.taxi.activity.g gVar2 = this.c;
        y50 y50Var2 = this.a;
        m2o0 m2o0Var2 = this.h;
        if (i != 0) {
        }
        o2o0Var = (o2o0) m2o0Var2;
        if (o2o0Var.c.b()) {
        }
        return zy11Var2;
    }
}
