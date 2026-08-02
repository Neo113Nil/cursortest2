package com.yandex.go.ble.connection;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import defpackage.ar5;
import defpackage.b64;
import defpackage.c26;
import defpackage.cia1;
import defpackage.fyc;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.jst;
import defpackage.ke00;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.z16;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/yandex/go/ble/connection/BleConnectionImpl$gattCallback$1", "Landroid/bluetooth/BluetoothGattCallback;", "Landroid/bluetooth/BluetoothGatt;", "Lzy11;", "startHeartbeat", "(Landroid/bluetooth/BluetoothGatt;)V", "gatt", "", ACSPConstants.STATUS, "newState", "onConnectionStateChange", "(Landroid/bluetooth/BluetoothGatt;II)V", "onServicesDiscovered", "(Landroid/bluetooth/BluetoothGatt;I)V", "rssi", "onReadRemoteRssi", "mtu", "onMtuChanged", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "onCharacteristicWrite", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BleConnectionImpl$gattCallback$1 extends BluetoothGattCallback {
    final /* synthetic */ a this$0;

    public BleConnectionImpl$gattCallback$1(a aVar) {
        this.this$0 = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onServicesDiscovered$lambda$8$0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic.getUuid().toString();
    }

    private final void startHeartbeat(BluetoothGatt bluetoothGatt) {
        pzt0 pzt0Var = this.this$0.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        a aVar = this.this$0;
        aVar.h = hbp0.e(aVar.f, null, null, new BleConnectionImpl$gattCallback$1$startHeartbeat$1(aVar, bluetoothGatt, null), 3);
        hst hstVar = jst.e;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
        if (status == 0) {
            hst hstVar = jst.e;
            fyc fycVar = this.this$0.j;
            if (fycVar != null) {
                fycVar.T(Boolean.TRUE);
                return;
            }
            return;
        }
        hst hstVar2 = jst.e;
        ke00 a = hstVar2.b.a();
        if (a != null && a.b(15)) {
            a.a(15, null, null, "Failed to get characteristic " + characteristic.getUuid() + " write response", hstVar2.a);
        }
        fyc fycVar2 = this.this$0.j;
        if (fycVar2 != null) {
            fycVar2.T(Boolean.FALSE);
        }
        if (a.a(this.this$0, status)) {
            this.this$0.c();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
        Object value;
        z16 z16Var;
        hst hstVar = jst.e;
        if (status != 0) {
            ke00 a = hstVar.b.a();
            if (a != null && a.b(15)) {
                a.a(15, null, null, "GATT error", hstVar.a);
            }
            this.this$0.c();
            if (cia1.f(this.this$0.a)) {
                gatt.close();
                return;
            }
            return;
        }
        if (newState == 0) {
            this.this$0.c();
            if (cia1.f(this.this$0.a)) {
                gatt.close();
                return;
            }
            return;
        }
        if (newState != 2) {
            return;
        }
        r0 r0Var = this.this$0.c;
        do {
            value = r0Var.getValue();
            c26 c26Var = (c26) value;
            z16Var = c26Var instanceof z16 ? (z16) c26Var : null;
            if (z16Var == null) {
                z16Var = new z16(0);
            }
        } while (!r0Var.k(value, z16Var));
        hst hstVar2 = jst.e;
        this.this$0.d(gatt);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
        Object value;
        Object obj;
        if (status == 0) {
            hst hstVar = jst.e;
            r0 r0Var = this.this$0.c;
            do {
                value = r0Var.getValue();
                obj = (c26) value;
                z16 z16Var = obj instanceof z16 ? (z16) obj : null;
                if (z16Var != null) {
                    obj = z16.a(z16Var, mtu, null, 5);
                }
            } while (!r0Var.k(value, obj));
            return;
        }
        hst hstVar2 = jst.e;
        ke00 a = hstVar2.b.a();
        if (a != null && a.b(15)) {
            a.a(15, null, null, oyr.i(status, "Failed to get MTU with status: "), hstVar2.a);
        }
        if (a.a(this.this$0, status)) {
            this.this$0.c();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onReadRemoteRssi(BluetoothGatt gatt, int rssi, int status) {
        Object value;
        Object obj;
        if (status == 0) {
            hst hstVar = jst.e;
            r0 r0Var = this.this$0.c;
            do {
                value = r0Var.getValue();
                obj = (c26) value;
                z16 z16Var = obj instanceof z16 ? (z16) obj : null;
                if (z16Var != null) {
                    obj = z16.a(z16Var, 0, Integer.valueOf(rssi), 3);
                }
            } while (!r0Var.k(value, obj));
            return;
        }
        hst hstVar2 = jst.e;
        ke00 a = hstVar2.b.a();
        if (a != null && a.b(15)) {
            a.a(15, null, null, b64.d(status, rssi, "Failed to get RSSI with status: ", "; ignored value: ", "dBm"), hstVar2.a);
        }
        if (a.a(this.this$0, status)) {
            this.this$0.c();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(BluetoothGatt gatt, int status) {
        Object value;
        Object obj;
        if (status != 0) {
            hst hstVar = jst.e;
            ke00 a = hstVar.b.a();
            if (a != null && a.b(15)) {
                a.a(15, null, null, "Service discovery failed", hstVar.a);
            }
            this.this$0.c();
            return;
        }
        List<BluetoothGattService> services = gatt.getServices();
        if (services.isEmpty()) {
            hst hstVar2 = jst.e;
            ke00 a2 = hstVar2.b.a();
            if (a2 != null && a2.b(15)) {
                a2.a(15, null, null, "Discovered services list is empty", hstVar2.a);
            }
            this.this$0.c();
            return;
        }
        hst hstVar3 = jst.e;
        Iterator<T> it = services.iterator();
        while (it.hasNext()) {
            kotlin.collections.a.X(((BluetoothGattService) it.next()).getCharacteristics(), null, null, null, new ar5(16), 31);
            hst hstVar4 = jst.e;
        }
        r0 r0Var = this.this$0.c;
        do {
            value = r0Var.getValue();
            obj = (c26) value;
            z16 z16Var = obj instanceof z16 ? (z16) obj : null;
            if (z16Var != null) {
                obj = z16.a(z16Var, 0, null, 6);
            }
        } while (!r0Var.k(value, obj));
        startHeartbeat(gatt);
        if (cia1.f(this.this$0.a)) {
            gatt.requestMtu(128);
        }
    }
}
