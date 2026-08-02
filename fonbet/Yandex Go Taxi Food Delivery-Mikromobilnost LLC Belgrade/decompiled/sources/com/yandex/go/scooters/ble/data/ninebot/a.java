package com.yandex.go.scooters.ble.data.ninebot;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Context;
import com.yandex.go.scooters.ble.api.exceptions.ScootersBleConnectionFailureException;
import com.yandex.go.scooters.ble.api.exceptions.ScootersBleResponseTimeoutException;
import defpackage.d1n0;
import defpackage.dvw;
import defpackage.ffx;
import defpackage.g1b1;
import defpackage.h1b1;
import defpackage.hoo0;
import defpackage.hst;
import defpackage.i18;
import defpackage.j1;
import defpackage.j18;
import defpackage.j73;
import defpackage.jst;
import defpackage.k1n0;
import defpackage.k2o0;
import defpackage.lz40;
import defpackage.ny61;
import defpackage.umm0;
import defpackage.zom0;
import defpackage.zy11;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final BluetoothAdapter b;
    public final k1n0 c;
    public zom0 d;

    public a(Context context, BluetoothAdapter bluetoothAdapter, k1n0 k1n0Var) {
        this.a = context;
        this.b = bluetoothAdapter;
        this.c = k1n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersBleNinebotRepository$connectScooter$1 scootersBleNinebotRepository$connectScooter$1;
        int i;
        if (continuationImpl instanceof ScootersBleNinebotRepository$connectScooter$1) {
            scootersBleNinebotRepository$connectScooter$1 = (ScootersBleNinebotRepository$connectScooter$1) continuationImpl;
            int i2 = scootersBleNinebotRepository$connectScooter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBleNinebotRepository$connectScooter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBleNinebotRepository$connectScooter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBleNinebotRepository$connectScooter$1.label;
                if (i != 0) {
                    b.b(obj);
                    BluetoothDevice remoteDevice = this.b.getRemoteDevice(str);
                    final UUID a = k2o0.c().b().a();
                    final UUID e = k2o0.c().b().e();
                    final UUID b = k2o0.c().b().b();
                    final UUID a2 = hoo0.c().b().a();
                    scootersBleNinebotRepository$connectScooter$1.L$0 = null;
                    scootersBleNinebotRepository$connectScooter$1.label = 1;
                    final j18 j18Var = new j18(1, dvw.b(scootersBleNinebotRepository$connectScooter$1));
                    j18Var.u();
                    final Context context = this.a;
                    h1b1.j(context);
                    BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
                    final n0 b2 = ffx.b(0, 1, bufferOverflow);
                    final n0 b3 = ffx.b(0, 1, bufferOverflow);
                    j18Var.w(new j1(24, remoteDevice.connectGatt(context, false, new BluetoothGattCallback() { // from class: com.yandex.go.scooters.ble.utils.ScootersBleConnectExtensionsKt$awaitConnect$2$bluetoothGatt$1
                        @Override // android.bluetooth.BluetoothGattCallback
                        public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
                            b2.g(characteristic.getValue());
                        }

                        @Override // android.bluetooth.BluetoothGattCallback
                        public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
                            b3.g(zy11.a);
                        }

                        @Override // android.bluetooth.BluetoothGattCallback
                        public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
                            Context context2 = context;
                            i18 i18Var = j18Var;
                            if (i18Var.isActive()) {
                                h1b1.j(context2);
                                if (status != 0) {
                                    g1b1.b(context2, gatt, i18Var);
                                    return;
                                }
                                if (newState == 0) {
                                    gatt.close();
                                    i18Var.resumeWith(new Result.Failure(new ScootersBleConnectionFailureException()));
                                } else {
                                    if (newState != 2) {
                                        return;
                                    }
                                    gatt.discoverServices();
                                }
                            }
                        }

                        @Override // android.bluetooth.BluetoothGattCallback
                        public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
                            Context context2 = context;
                            i18 i18Var = j18Var;
                            lz40 lz40Var = b2;
                            lz40 lz40Var2 = b3;
                            UUID uuid = a;
                            UUID uuid2 = e;
                            if (i18Var.isActive()) {
                                if (status == 0) {
                                    i18Var.resumeWith(new zom0(gatt, gatt.getService(uuid).getCharacteristic(uuid2), lz40Var2, lz40Var));
                                } else {
                                    g1b1.b(context2, gatt, i18Var);
                                }
                            }
                        }

                        @Override // android.bluetooth.BluetoothGattCallback
                        public void onServicesDiscovered(BluetoothGatt gatt, int status) {
                            Context context2 = context;
                            i18 i18Var = j18Var;
                            UUID uuid = a;
                            UUID uuid2 = b;
                            UUID uuid3 = a2;
                            if (i18Var.isActive()) {
                                h1b1.j(context2);
                                if (status != 0) {
                                    g1b1.b(context2, gatt, i18Var);
                                    return;
                                }
                                BluetoothGattCharacteristic characteristic = gatt.getService(uuid).getCharacteristic(uuid2);
                                BluetoothGattDescriptor descriptor = characteristic.getDescriptor(uuid3);
                                gatt.setCharacteristicNotification(characteristic, true);
                                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                                gatt.writeDescriptor(descriptor);
                            }
                        }
                    }, 2)));
                    obj = j18Var.s();
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
                this.d = (zom0) obj;
                return zy11.a;
            }
        }
        scootersBleNinebotRepository$connectScooter$1 = new ScootersBleNinebotRepository$connectScooter$1(this, continuationImpl);
        Object obj2 = scootersBleNinebotRepository$connectScooter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBleNinebotRepository$connectScooter$1.label;
        if (i != 0) {
        }
        this.d = (zom0) obj2;
        return zy11.a;
    }

    public final Object b(d1n0 d1n0Var, boolean z, ContinuationImpl continuationImpl) {
        Object u;
        h1b1.j(this.a);
        zom0 zom0Var = this.d;
        if (zom0Var == null) {
            ny61.r("Scooter is not connected");
            return null;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = zom0Var.b;
        hst hstVar = jst.e;
        j73.K(d1n0Var.a(), null, new umm0(29), 31);
        hstVar.getClass();
        byte[] a = d1n0Var.a();
        this.c.getClass();
        bluetoothGattCharacteristic.setValue(k2o0.c().b().f(a));
        zom0Var.a.writeCharacteristic(bluetoothGattCharacteristic);
        return (z && (u = kotlinx.coroutines.a.u(1000L, new ScootersBleNinebotRepository$sendCommand$3(zom0Var, null), continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? u : zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v5, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(d1n0 d1n0Var, ContinuationImpl continuationImpl) {
        ScootersBleNinebotRepository$sendCommandWaitingResponse$1 scootersBleNinebotRepository$sendCommandWaitingResponse$1;
        int i;
        String str;
        zom0 zom0Var;
        if (continuationImpl instanceof ScootersBleNinebotRepository$sendCommandWaitingResponse$1) {
            scootersBleNinebotRepository$sendCommandWaitingResponse$1 = (ScootersBleNinebotRepository$sendCommandWaitingResponse$1) continuationImpl;
            int i2 = scootersBleNinebotRepository$sendCommandWaitingResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBleNinebotRepository$sendCommandWaitingResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBleNinebotRepository$sendCommandWaitingResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBleNinebotRepository$sendCommandWaitingResponse$1.label;
                if (i != 0) {
                    b.b(obj);
                    zom0 zom0Var2 = this.d;
                    if (zom0Var2 == null) {
                        str = "Scooter is not connected";
                        ny61.r(str);
                        return null;
                    }
                    scootersBleNinebotRepository$sendCommandWaitingResponse$1.L$0 = null;
                    scootersBleNinebotRepository$sendCommandWaitingResponse$1.L$1 = zom0Var2;
                    scootersBleNinebotRepository$sendCommandWaitingResponse$1.label = 1;
                    if (b(d1n0Var, false, scootersBleNinebotRepository$sendCommandWaitingResponse$1) != coroutineSingletons) {
                        zom0Var = zom0Var2;
                        ScootersBleNinebotRepository$sendCommandWaitingResponse$response$1 scootersBleNinebotRepository$sendCommandWaitingResponse$response$1 = new ScootersBleNinebotRepository$sendCommandWaitingResponse$response$1(zom0Var, null);
                        scootersBleNinebotRepository$sendCommandWaitingResponse$1.L$0 = null;
                        scootersBleNinebotRepository$sendCommandWaitingResponse$1.L$1 = null;
                        scootersBleNinebotRepository$sendCommandWaitingResponse$1.label = 2;
                        obj = kotlinx.coroutines.a.w(5000L, scootersBleNinebotRepository$sendCommandWaitingResponse$response$1, scootersBleNinebotRepository$sendCommandWaitingResponse$1);
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        str = "call to 'resume' before 'invoke' with coroutine";
                        ny61.r(str);
                        return null;
                    }
                    b.b(obj);
                    ?? r8 = (byte[]) obj;
                    if (r8 == 0) {
                        throw new ScootersBleResponseTimeoutException();
                    }
                    hst hstVar = jst.e;
                    j73.K(r8, null, new umm0(28), 31);
                    hstVar.getClass();
                    return r8;
                }
                zom0Var = (zom0) scootersBleNinebotRepository$sendCommandWaitingResponse$1.L$1;
                b.b(obj);
                ScootersBleNinebotRepository$sendCommandWaitingResponse$response$1 scootersBleNinebotRepository$sendCommandWaitingResponse$response$12 = new ScootersBleNinebotRepository$sendCommandWaitingResponse$response$1(zom0Var, null);
                scootersBleNinebotRepository$sendCommandWaitingResponse$1.L$0 = null;
                scootersBleNinebotRepository$sendCommandWaitingResponse$1.L$1 = null;
                scootersBleNinebotRepository$sendCommandWaitingResponse$1.label = 2;
                obj = kotlinx.coroutines.a.w(5000L, scootersBleNinebotRepository$sendCommandWaitingResponse$response$12, scootersBleNinebotRepository$sendCommandWaitingResponse$1);
            }
        }
        scootersBleNinebotRepository$sendCommandWaitingResponse$1 = new ScootersBleNinebotRepository$sendCommandWaitingResponse$1(this, continuationImpl);
        Object obj2 = scootersBleNinebotRepository$sendCommandWaitingResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBleNinebotRepository$sendCommandWaitingResponse$1.label;
        if (i != 0) {
        }
    }
}
