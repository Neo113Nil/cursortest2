package com.yandex.go.ble.domain;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.os.ParcelUuid;
import defpackage.d26;
import defpackage.e26;
import defpackage.jx81;
import defpackage.lu5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qje;
import defpackage.qke;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lf26;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ble.domain.BleScanningInteractorImpl$listenBleDevicesScanning$1", f = "BleScanningInteractorImpl.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BleScanningInteractorImpl$listenBleDevicesScanning$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $serviceUuid;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleScanningInteractorImpl$listenBleDevicesScanning$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$serviceUuid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BleScanningInteractorImpl$listenBleDevicesScanning$1 bleScanningInteractorImpl$listenBleDevicesScanning$1 = new BleScanningInteractorImpl$listenBleDevicesScanning$1(this.this$0, this.$serviceUuid, continuation);
        bleScanningInteractorImpl$listenBleDevicesScanning$1.L$0 = obj;
        return bleScanningInteractorImpl$listenBleDevicesScanning$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BleScanningInteractorImpl$listenBleDevicesScanning$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return zy11Var;
        }
        b.b(obj);
        Context context = this.this$0.a;
        if (!jx81.e() ? qke.h(context, "android.permission.BLUETOOTH") == 0 && qke.h(context, "android.permission.BLUETOOTH_ADMIN") == 0 && qke.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0 : qke.h(context, "android.permission.BLUETOOTH_SCAN") == 0) {
            x6f0 x6f0Var = (x6f0) y6f0Var;
            x6f0Var.d(d26.c);
            x6f0Var.l(null);
            return zy11Var;
        }
        ScanCallback scanCallback = new ScanCallback() { // from class: com.yandex.go.ble.domain.BleScanningInteractorImpl$listenBleDevicesScanning$1$scanCallback$1
            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<ScanResult> results) {
                y6f0 y6f0Var2 = y6f0.this;
                List<ScanResult> list = results;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ScanResult) it.next()).getDevice().getAddress());
                }
                ((x6f0) y6f0Var2).d(new e26(arrayList));
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int errorCode) {
                ((x6f0) y6f0.this).l(new IllegalStateException(oyr.i(errorCode, "BLE scanning failed with error: ")));
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int callbackType, ScanResult result) {
                ((x6f0) y6f0.this).d(new e26(Collections.singletonList(result.getDevice().getAddress())));
            }
        };
        BluetoothAdapter r = qje.r(this.this$0.a);
        if (r == null || !r.isEnabled()) {
            x6f0 x6f0Var2 = (x6f0) y6f0Var;
            x6f0Var2.d(d26.a);
            x6f0Var2.l(null);
            return zy11Var;
        }
        BluetoothLeScanner bluetoothLeScanner = r.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            x6f0 x6f0Var3 = (x6f0) y6f0Var;
            x6f0Var3.d(d26.d);
            x6f0Var3.l(null);
            return zy11Var;
        }
        try {
            a aVar = this.this$0;
            String str = this.$serviceUuid;
            aVar.getClass();
            ListBuilder a = rcc.a();
            if (str != null) {
                a.add(new ScanFilter.Builder().setServiceUuid(new ParcelUuid(UUID.fromString(str))).build());
            }
            try {
                bluetoothLeScanner.startScan(a.j(), this.this$0.b, scanCallback);
                lu5 lu5Var = new lu5(8, bluetoothLeScanner, scanCallback);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                return kotlinx.coroutines.channels.b.a(y6f0Var, lu5Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            } catch (Throwable th) {
                ((x6f0) y6f0Var).l(th);
                return zy11Var;
            }
        } catch (Throwable unused) {
            x6f0 x6f0Var4 = (x6f0) y6f0Var;
            x6f0Var4.d(d26.b);
            x6f0Var4.l(null);
            return zy11Var;
        }
    }
}
