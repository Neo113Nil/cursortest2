package com.yandex.go.masstransit.sdk.ble.impl.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import com.yandex.go.masstransit.sdk.ble.impl.network.MtVehiclesParam;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.gci0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.l8x;
import defpackage.pzt0;
import defpackage.t16;
import defpackage.tje;
import defpackage.v4r0;
import defpackage.wsr0;
import defpackage.x26;
import defpackage.xby;
import defpackage.xsr0;
import defpackage.y26;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c {
    public final t16 a;
    public final y26 b;
    public final ike c;
    public BluetoothLeScanner d;
    public final r0 e;
    public final gci0 f;
    public volatile List g;
    public final ConcurrentHashMap h;
    public pzt0 i;
    public final MtBleScannerRepository$scanCallback$1 j;

    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.go.masstransit.sdk.ble.impl.ble.MtBleScannerRepository$scanCallback$1] */
    public c(jse jseVar, t16 t16Var, y26 y26Var) {
        this.a = t16Var;
        this.b = y26Var;
        ike a = bvf0.a(cvw.U(jl40.a(), jseVar));
        this.c = a;
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) t16Var.a.b.getValue();
        this.d = bluetoothAdapter != null ? bluetoothAdapter.getBluetoothLeScanner() : null;
        r0 c = bvf0.c(null);
        this.e = c;
        b bVar = new b(c);
        xsr0.a.getClass();
        this.f = kotlinx.coroutines.flow.e.R(bVar, a, wsr0.b, null);
        this.g = EmptyList.a;
        this.h = new ConcurrentHashMap();
        this.j = new ScanCallback() { // from class: com.yandex.go.masstransit.sdk.ble.impl.ble.MtBleScannerRepository$scanCallback$1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int errorCode) {
                super.onScanFailed(errorCode);
                xby.d.k(new IOException(), "Scan failed with error code: " + errorCode);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int callbackType, ScanResult result) {
                Object value;
                Set set;
                super.onScanResult(callbackType, result);
                ScanRecord scanRecord = result.getScanRecord();
                y26 y26Var2 = c.this.b;
                x26 a2 = y26.a(scanRecord != null ? scanRecord.getBytes() : null);
                MtVehiclesParam.BleInfo bleInfo = a2 != null ? new MtVehiclesParam.BleInfo(a2.a, a2.b, a2.c) : null;
                if (bleInfo == null || !c.this.g.contains(bleInfo.a)) {
                    return;
                }
                Set set2 = (Set) c.this.e.getValue();
                if (set2 != null && set2.contains(bleInfo)) {
                    l8x l8xVar = (l8x) c.this.h.get(bleInfo);
                    if (l8xVar != null) {
                        l8xVar.a(null);
                    }
                    c.this.h.remove(bleInfo);
                    pzt0 pzt0Var = c.this.i;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                }
                r0 r0Var = c.this.e;
                do {
                    value = r0Var.getValue();
                    set = (Set) value;
                } while (!r0Var.k(value, set != null ? v4r0.i(set, bleInfo) : Collections.singleton(bleInfo)));
                c cVar = c.this;
                cVar.h.put(bleInfo, tje.N(cVar.c, null, null, new MtBleScannerRepository$startRemoveBeaconJob$1(cVar, bleInfo, null), 3));
            }
        };
    }

    public final void a() {
        BluetoothLeScanner bluetoothLeScanner;
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ConcurrentHashMap concurrentHashMap = this.h;
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        concurrentHashMap.clear();
        if (((com.yandex.go.permission.b) this.b.a.a).a(11) && (bluetoothLeScanner = this.d) != null) {
            bluetoothLeScanner.stopScan(this.j);
        }
    }

    public final pzt0 b() {
        return tje.N(this.c, null, null, new MtBleScannerRepository$startStopScanningJob$1(this, null), 3);
    }
}
