package com.yandex.go.masstransit.sdk.ble.impl.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import defpackage.ar5;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.f73;
import defpackage.gci0;
import defpackage.gkn;
import defpackage.gvu0;
import defpackage.ike;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jse;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.q2v;
import defpackage.t16;
import defpackage.tje;
import defpackage.u26;
import defpackage.w26;
import defpackage.wsr0;
import defpackage.x26;
import defpackage.xby;
import defpackage.xsr0;
import defpackage.y26;
import defpackage.y6i0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class f {
    public final t16 a;
    public final y26 b;
    public final ike c;
    public volatile List d;
    public BluetoothLeScanner e;
    public final r0 f;
    public final r0 g;
    public final gci0 h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public u26 k;
    public pzt0 l;
    public pzt0 m;
    public final MtBleScannerRepositoryV2$scanCallback$1 n;

    /* JADX WARN: Type inference failed for: r2v7, types: [com.yandex.go.masstransit.sdk.ble.impl.ble.MtBleScannerRepositoryV2$scanCallback$1] */
    public f(jse jseVar, t16 t16Var, y26 y26Var) {
        this.a = t16Var;
        this.b = y26Var;
        ike a = bvf0.a(cvw.U(jl40.a(), jseVar));
        this.c = a;
        this.d = EmptyList.a;
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) t16Var.a.b.getValue();
        this.e = bluetoothAdapter != null ? bluetoothAdapter.getBluetoothLeScanner() : null;
        r0 c = bvf0.c(null);
        this.f = c;
        this.g = c;
        e eVar = new e(c);
        xsr0.a.getClass();
        this.h = kotlinx.coroutines.flow.e.R(eVar, a, wsr0.b, null);
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = u26.h;
        this.n = new ScanCallback() { // from class: com.yandex.go.masstransit.sdk.ble.impl.ble.MtBleScannerRepositoryV2$scanCallback$1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int errorCode) {
                super.onScanFailed(errorCode);
                xby.d.k(new IOException(), "Scan failed with error code: " + errorCode);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x017e  */
            /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
            @Override // android.bluetooth.le.ScanCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScanResult(int callbackType, ScanResult result) {
                long j;
                double d;
                double d2;
                double d3;
                f fVar;
                int i;
                String q;
                w26 w26Var;
                Collection collection;
                super.onScanResult(callbackType, result);
                ScanRecord scanRecord = result.getScanRecord();
                byte[] bytes = scanRecord != null ? scanRecord.getBytes() : null;
                f fVar2 = f.this;
                boolean z = false;
                if (fVar2.k.f) {
                    int rssi = result.getRssi();
                    boolean z2 = fVar2.i.isEmpty() && fVar2.j.isEmpty();
                    x26 a2 = y26.a(bytes);
                    if (a2 != null) {
                        d = 1.0d;
                        if (fVar2.d.contains(a2.a)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            d3 = 0.3d;
                            q2v q2vVar = (q2v) fVar2.i.get(a2);
                            if (q2vVar == null) {
                                j = 0;
                                d2 = 1000.0d;
                            } else {
                                d2 = 1000.0d;
                                long j2 = currentTimeMillis - q2vVar.a;
                                if (j2 < 0) {
                                    j2 = 0;
                                }
                                double b = y6i0.b((j2 / 1000.0d) * 0.3d, 0.0d, 1.0d);
                                j = 0;
                                rssi = (int) (((1.0d - b) * q2vVar.b) + (rssi * b));
                            }
                            fVar2.i.put(a2, new q2v(System.currentTimeMillis(), rssi, a2));
                            xby.d.getClass();
                            pzt0 pzt0Var = fVar2.l;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            if (z2 && ((collection = (Collection) fVar2.f.getValue()) == null || collection.isEmpty())) {
                                fVar2.c();
                            }
                            fVar = f.this;
                            if (!fVar.k.g) {
                            }
                        } else {
                            j = 0;
                            d3 = 0.3d;
                            d2 = 1000.0d;
                            fVar = f.this;
                            if (!fVar.k.g) {
                                return;
                            }
                            int rssi2 = result.getRssi();
                            ConcurrentHashMap concurrentHashMap = fVar.j;
                            if (bytes != null) {
                                Iterator it = y26.d.iterator();
                                loop0: while (true) {
                                    if (!it.hasNext()) {
                                        i = -1;
                                        break;
                                    }
                                    byte[] bArr = (byte[]) it.next();
                                    int length = bytes.length - bArr.length;
                                    if (length >= 0) {
                                        i = 0;
                                        while (!Arrays.equals(f73.m(i, bArr.length + i, bytes), bArr)) {
                                            if (i != length) {
                                                i++;
                                            }
                                        }
                                        break loop0;
                                    }
                                }
                                if (i >= 2 && bytes.length > i + 15 && y26.e.contains(Integer.valueOf(bytes[i - 2] & 255)) && (bytes[i - 1] & 255) == 255) {
                                    byte[] r = f73.r(f73.m(i + 4, i + 12, bytes), new byte[8]);
                                    if (r.length < 16) {
                                        q = null;
                                    } else {
                                        String K = j73.K(f73.m(0, 16, r), "", new ar5(17), 30);
                                        q = oyr.q(gvu0.A0(8, K), "-", K.substring(8, 12), "-", K.substring(12, 16));
                                    }
                                    if (q != null) {
                                        w26Var = new w26(q, bytes[i + 13] & 255);
                                        if (w26Var != null) {
                                            return;
                                        }
                                        String str = w26Var.a;
                                        if (fVar.i.isEmpty() && fVar.j.isEmpty()) {
                                            z = true;
                                        }
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        gkn gknVar = (gkn) concurrentHashMap.get(str);
                                        if (gknVar != null) {
                                            double b2 = y6i0.b(((currentTimeMillis2 - gknVar.a < j ? j : r8) / d2) * d3, 0.0d, 1.0d);
                                            rssi2 = (int) (((d - b2) * gknVar.b) + (rssi2 * b2));
                                        }
                                        concurrentHashMap.put(str, new gkn(System.currentTimeMillis(), rssi2, w26Var));
                                        xby.d.getClass();
                                        pzt0 pzt0Var2 = fVar.l;
                                        if (pzt0Var2 != null) {
                                            pzt0Var2.a(null);
                                        }
                                        if (z) {
                                            Collection collection2 = (Collection) fVar.f.getValue();
                                            if (collection2 == null || collection2.isEmpty()) {
                                                fVar.c();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            w26Var = null;
                            if (w26Var != null) {
                            }
                        }
                    }
                }
                j = 0;
                d = 1.0d;
                d3 = 0.3d;
                d2 = 1000.0d;
                fVar = f.this;
                if (!fVar.k.g) {
                }
            }
        };
    }

    public final void a() {
        BluetoothLeScanner bluetoothLeScanner;
        this.i.clear();
        this.j.clear();
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.m;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.m = null;
        if (((com.yandex.go.permission.b) this.b.a.a).a(11) && (bluetoothLeScanner = this.e) != null) {
            bluetoothLeScanner.stopScan(this.n);
        }
    }

    public final void b(List list, u26 u26Var) {
        Object value;
        Object value2;
        BluetoothAdapter bluetoothAdapter;
        Object value3;
        this.i.clear();
        this.j.clear();
        r0 r0Var = this.f;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, null));
        EmptyList emptyList = EmptyList.a;
        if (((BluetoothAdapter) this.a.a.b.getValue()) == null || (bluetoothAdapter = (BluetoothAdapter) this.a.a.b.getValue()) == null || !bluetoothAdapter.isEnabled() || !((com.yandex.go.permission.b) this.b.a.a).a(11) || list.isEmpty()) {
            r0 r0Var2 = this.f;
            do {
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, emptyList));
            a();
            return;
        }
        if (!u26Var.f && !u26Var.g) {
            r0 r0Var3 = this.f;
            do {
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, emptyList));
            a();
            return;
        }
        this.l = tje.N(this.c, null, null, new MtBleScannerRepositoryV2$startStopScanningJob$1(this, null), 3);
        this.k = u26Var;
        this.d = list;
        if (this.e == null) {
            BluetoothAdapter bluetoothAdapter2 = (BluetoothAdapter) this.a.a.b.getValue();
            this.e = bluetoothAdapter2 != null ? bluetoothAdapter2.getBluetoothLeScanner() : null;
        }
        try {
            BluetoothLeScanner bluetoothLeScanner = this.e;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.n);
            }
        } catch (Throwable unused) {
        }
        BluetoothLeScanner bluetoothLeScanner2 = this.e;
        if (bluetoothLeScanner2 != null) {
            bluetoothLeScanner2.startScan((List<ScanFilter>) null, this.b.b, this.n);
        }
    }

    public final void c() {
        pzt0 pzt0Var = this.m;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.m = tje.N(this.c, null, null, new MtBleScannerRepositoryV2$startSnapshotJob$1(this, null), 3);
    }
}
