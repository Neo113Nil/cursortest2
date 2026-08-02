package com.yandex.go.ble.connection;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.a26;
import defpackage.ac51;
import defpackage.b26;
import defpackage.bc51;
import defpackage.bvf0;
import defpackage.c26;
import defpackage.cc51;
import defpackage.cia1;
import defpackage.czo0;
import defpackage.dc51;
import defpackage.e3n;
import defpackage.fyc;
import defpackage.g050;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.gwk0;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jx81;
import defpackage.ke00;
import defpackage.kp50;
import defpackage.lu5;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.qoh;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.x16;
import defpackage.yb51;
import defpackage.z16;
import defpackage.zb51;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final class a implements x16 {
    public static final long p;
    public static final long q;
    public final Context a;
    public final BluetoothDevice b;
    public final r0 c;
    public final gci0 d;
    public BluetoothGatt e;
    public final hbp0 f;
    public qoh g;
    public pzt0 h;
    public final kotlinx.coroutines.sync.a i;
    public fyc j;
    public final Object k;
    public boolean l;
    public final BleConnectionImpl$bluetoothTurnedOffReceiver$1 m;
    public final BleConnectionImpl$aclDisconnectedReceiver$1 n;
    public final BleConnectionImpl$gattCallback$1 o;

    static {
        o430 o430Var = e3n.b;
        p = kp50.U(300, DurationUnit.MILLISECONDS);
        q = kp50.U(1, DurationUnit.SECONDS);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [com.yandex.go.ble.connection.BleConnectionImpl$bluetoothTurnedOffReceiver$1] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.yandex.go.ble.connection.BleConnectionImpl$aclDisconnectedReceiver$1] */
    public a(Context context, BluetoothDevice bluetoothDevice) {
        this.a = context;
        this.b = bluetoothDevice;
        r0 c = bvf0.c(b26.a);
        this.c = c;
        this.d = e.d(c);
        this.f = new hbp0(new czo0(14), "", null);
        this.i = gtq0.a();
        this.k = new Object();
        this.m = new BroadcastReceiver() { // from class: com.yandex.go.ble.connection.BleConnectionImpl$bluetoothTurnedOffReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (jl40.l(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    if (intExtra == 10 || intExtra == 13) {
                        hst hstVar = jst.e;
                        a aVar = a.this;
                        BluetoothGatt bluetoothGatt = aVar.e;
                        aVar.c();
                        if (bluetoothGatt == null || !cia1.f(a.this.a)) {
                            return;
                        }
                        bluetoothGatt.close();
                    }
                }
            }
        };
        this.n = new BroadcastReceiver() { // from class: com.yandex.go.ble.connection.BleConnectionImpl$aclDisconnectedReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                BluetoothDevice bluetoothDevice2;
                Object parcelableExtra;
                if (jl40.l(intent.getAction(), "android.bluetooth.device.action.ACL_DISCONNECTED")) {
                    if (jx81.f()) {
                        parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
                        bluetoothDevice2 = (BluetoothDevice) parcelableExtra;
                    } else {
                        bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    }
                    if (bluetoothDevice2 != null && jl40.l(bluetoothDevice2.getAddress(), a.this.b.getAddress())) {
                        hst hstVar = jst.e;
                        a.this.c();
                    }
                }
            }
        };
        this.o = new BleConnectionImpl$gattCallback$1(this);
    }

    public static final boolean a(a aVar, int i) {
        aVar.getClass();
        return scc.g(1, 257, Integer.valueOf(HProv.PP_SECURITY_LEVEL), Integer.valueOf(HProv.PP_ENUM_CONTAINER_EXTENSION)).contains(Integer.valueOf(i));
    }

    public final boolean b() {
        synchronized (this.k) {
            boolean z = true;
            if (!this.l) {
                if (!cia1.f(this.a)) {
                    return false;
                }
                this.l = true;
                r0 r0Var = this.c;
                a26 a26Var = a26.a;
                r0Var.getClass();
                r0Var.m(null, a26Var);
                try {
                    this.f.a();
                    BleConnectionImpl$bluetoothTurnedOffReceiver$1 bleConnectionImpl$bluetoothTurnedOffReceiver$1 = this.m;
                    IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
                    boolean f = jx81.f();
                    Context context = this.a;
                    if (f) {
                        context.registerReceiver(bleConnectionImpl$bluetoothTurnedOffReceiver$1, intentFilter, 4);
                    } else {
                        context.registerReceiver(bleConnectionImpl$bluetoothTurnedOffReceiver$1, intentFilter);
                    }
                    BleConnectionImpl$aclDisconnectedReceiver$1 bleConnectionImpl$aclDisconnectedReceiver$1 = this.n;
                    IntentFilter intentFilter2 = new IntentFilter("android.bluetooth.device.action.ACL_DISCONNECTED");
                    boolean f2 = jx81.f();
                    Context context2 = this.a;
                    if (f2) {
                        context2.registerReceiver(bleConnectionImpl$aclDisconnectedReceiver$1, intentFilter2, 4);
                    } else {
                        context2.registerReceiver(bleConnectionImpl$aclDisconnectedReceiver$1, intentFilter2);
                    }
                    BluetoothGatt connectGatt = this.b.connectGatt(this.a, false, this.o, 2);
                    this.e = connectGatt;
                    if (connectGatt == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } catch (Throwable unused) {
                    c();
                    z = false;
                }
            }
            return z;
        }
    }

    public final void c() {
        BluetoothGatt bluetoothGatt;
        synchronized (this.k) {
            try {
                if (this.l) {
                    this.l = false;
                    try {
                        this.a.unregisterReceiver(this.n);
                    } catch (Throwable unused) {
                    }
                    try {
                        this.a.unregisterReceiver(this.m);
                    } catch (Throwable unused2) {
                    }
                    fyc fycVar = this.j;
                    if (fycVar != null) {
                        fycVar.T(Boolean.FALSE);
                    }
                    this.f.b();
                    this.h = null;
                    this.g = null;
                    this.j = null;
                    if (cia1.f(this.a) && (bluetoothGatt = this.e) != null) {
                        bluetoothGatt.disconnect();
                    }
                    this.e = null;
                    r0 r0Var = this.c;
                    b26 b26Var = b26.a;
                    r0Var.getClass();
                    r0Var.m(null, b26Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final noh d(BluetoothGatt bluetoothGatt) {
        synchronized (this.k) {
            qoh qohVar = this.g;
            if (qohVar != null) {
                return qohVar;
            }
            qoh h = tje.h(this.f, null, null, new BleConnectionImpl$discoverServices$1$2(this, bluetoothGatt, null), 3);
            this.g = h;
            return h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(BluetoothGatt bluetoothGatt, sls slsVar, ContinuationImpl continuationImpl) {
        BleConnectionImpl$getDataOnServiceDiscovery$1 bleConnectionImpl$getDataOnServiceDiscovery$1;
        int i;
        Object invoke;
        sls slsVar2;
        Object obj;
        boolean booleanValue;
        Object obj2;
        sls slsVar3;
        if (continuationImpl instanceof BleConnectionImpl$getDataOnServiceDiscovery$1) {
            bleConnectionImpl$getDataOnServiceDiscovery$1 = (BleConnectionImpl$getDataOnServiceDiscovery$1) continuationImpl;
            int i2 = bleConnectionImpl$getDataOnServiceDiscovery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bleConnectionImpl$getDataOnServiceDiscovery$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = bleConnectionImpl$getDataOnServiceDiscovery$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bleConnectionImpl$getDataOnServiceDiscovery$1.label;
                if (i != 0) {
                    b.b(obj3);
                    invoke = slsVar.invoke();
                    if (invoke == null && (this.d.a.getValue() instanceof z16)) {
                        hst hstVar = jst.e;
                        ke00 a = hstVar.b.a();
                        if (a != null && a.b(15)) {
                            a.a(15, null, null, "Unable to get service data, trying to discover services...", hstVar.a);
                        }
                        noh d = d(bluetoothGatt);
                        bleConnectionImpl$getDataOnServiceDiscovery$1.L$0 = null;
                        slsVar2 = slsVar;
                        bleConnectionImpl$getDataOnServiceDiscovery$1.L$1 = slsVar2;
                        bleConnectionImpl$getDataOnServiceDiscovery$1.L$2 = invoke;
                        bleConnectionImpl$getDataOnServiceDiscovery$1.label = 1;
                        Object s = ((qoh) d).s(bleConnectionImpl$getDataOnServiceDiscovery$1);
                        if (s != obj4) {
                            obj = invoke;
                            obj3 = s;
                        }
                        return obj4;
                    }
                    if (invoke == null) {
                    }
                    return invoke;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = bleConnectionImpl$getDataOnServiceDiscovery$1.L$2;
                    slsVar3 = (sls) bleConnectionImpl$getDataOnServiceDiscovery$1.L$1;
                    b.b(obj3);
                    invoke = !((Boolean) obj3).booleanValue() ? slsVar3.invoke() : obj2;
                    if (invoke == null) {
                        hst hstVar2 = jst.e;
                        ke00 a2 = hstVar2.b.a();
                        if (a2 != null && a2.b(15)) {
                            a2.a(15, null, null, "Unable to get service data after services discovery; disconnecting...", hstVar2.a);
                        }
                        c();
                    }
                    return invoke;
                }
                obj = bleConnectionImpl$getDataOnServiceDiscovery$1.L$2;
                slsVar2 = (sls) bleConnectionImpl$getDataOnServiceDiscovery$1.L$1;
                b.b(obj3);
                booleanValue = ((Boolean) obj3).booleanValue();
                if (booleanValue) {
                    invoke = obj;
                    if (invoke == null) {
                    }
                    return invoke;
                }
                o430 o430Var = e3n.b;
                long U = kp50.U(1, DurationUnit.SECONDS);
                bleConnectionImpl$getDataOnServiceDiscovery$1.L$0 = null;
                bleConnectionImpl$getDataOnServiceDiscovery$1.L$1 = slsVar2;
                bleConnectionImpl$getDataOnServiceDiscovery$1.L$2 = obj;
                bleConnectionImpl$getDataOnServiceDiscovery$1.Z$0 = booleanValue;
                bleConnectionImpl$getDataOnServiceDiscovery$1.label = 2;
                obj3 = f(U, bleConnectionImpl$getDataOnServiceDiscovery$1);
                if (obj3 != obj4) {
                    obj2 = obj;
                    slsVar3 = slsVar2;
                    if (!((Boolean) obj3).booleanValue()) {
                    }
                    if (invoke == null) {
                    }
                    return invoke;
                }
                return obj4;
            }
        }
        bleConnectionImpl$getDataOnServiceDiscovery$1 = new BleConnectionImpl$getDataOnServiceDiscovery$1(this, continuationImpl);
        Object obj32 = bleConnectionImpl$getDataOnServiceDiscovery$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bleConnectionImpl$getDataOnServiceDiscovery$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj32).booleanValue();
        if (booleanValue) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27))|12|13|(1:15)|(1:17)|18|19))|30|6|7|(0)(0)|12|13|(0)|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        r8 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j, ContinuationImpl continuationImpl) {
        BleConnectionImpl$waitServiceDiscovered$1 bleConnectionImpl$waitServiceDiscovered$1;
        int i;
        if (continuationImpl instanceof BleConnectionImpl$waitServiceDiscovered$1) {
            bleConnectionImpl$waitServiceDiscovered$1 = (BleConnectionImpl$waitServiceDiscovered$1) continuationImpl;
            int i2 = bleConnectionImpl$waitServiceDiscovered$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bleConnectionImpl$waitServiceDiscovered$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bleConnectionImpl$waitServiceDiscovered$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bleConnectionImpl$waitServiceDiscovered$1.label;
                if (i != 0) {
                    b.b(obj);
                    BleConnectionImpl$waitServiceDiscovered$2$1 bleConnectionImpl$waitServiceDiscovered$2$1 = new BleConnectionImpl$waitServiceDiscovered$2$1(this, null);
                    bleConnectionImpl$waitServiceDiscovered$1.L$0 = null;
                    bleConnectionImpl$waitServiceDiscovered$1.J$0 = j;
                    bleConnectionImpl$waitServiceDiscovered$1.label = 1;
                    obj = kotlinx.coroutines.a.v(j, bleConnectionImpl$waitServiceDiscovered$2$1, bleConnectionImpl$waitServiceDiscovered$1);
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
                Object failure = (c26) obj;
                return Boolean.valueOf((failure instanceof Result.Failure ? null : failure) != null);
            }
        }
        bleConnectionImpl$waitServiceDiscovered$1 = new BleConnectionImpl$waitServiceDiscovered$1(this, continuationImpl);
        Object obj2 = bleConnectionImpl$waitServiceDiscovered$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bleConnectionImpl$waitServiceDiscovered$1.label;
        if (i != 0) {
        }
        Object failure2 = (c26) obj2;
        return Boolean.valueOf((failure2 instanceof Result.Failure ? null : failure2) != null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(7:(2:3|(10:5|6|7|(1:(1:(1:(2:12|(13:14|15|16|17|18|19|(1:21)(1:29)|22|23|24|25|26|27)(2:48|49))(8:50|51|52|53|(1:55)(6:56|(3:58|(1:60)|61)|62|63|(4:65|(1:67)(2:95|(1:97)(2:98|99))|68|(1:70)(1:94))(3:100|(1:102)(2:104|(1:106)(2:107|108))|103)|(3:72|(1:76)|77)(2:78|(4:85|86|(7:89|18|19|(0)(0)|22|23|24)|88)(2:80|(1:82)(2:83|84))))|25|26|27))(5:109|110|111|112|(6:114|115|116|25|26|27)(3:117|(6:119|53|(0)(0)|25|26|27)|88)))(1:120))(3:164|(1:166)|88)|121|122|(1:124)(2:125|(1:158)(2:129|(1:131)(8:132|133|134|135|(1:137)|138|(8:140|141|142|143|(1:145)|146|(2:148|(2:150|88)(3:151|112|(0)(0)))|115)|116)))|25|26|27))|121|122|(0)(0)|25|26|27)|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0133, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0134, code lost:
    
        r14 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #2 {all -> 0x0133, blocks: (B:112:0x01aa, B:117:0x01af, B:124:0x012e, B:127:0x013d, B:129:0x0144, B:131:0x0148, B:135:0x0157, B:138:0x015c, B:143:0x016e, B:146:0x0173, B:148:0x0179, B:154:0x0169, B:157:0x0152, B:133:0x014b, B:141:0x0162), top: B:7:0x0034, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x012e A[Catch: all -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0133, blocks: (B:112:0x01aa, B:117:0x01af, B:124:0x012e, B:127:0x013d, B:129:0x0144, B:131:0x0148, B:135:0x0157, B:138:0x015c, B:143:0x016e, B:146:0x0173, B:148:0x0179, B:154:0x0169, B:157:0x0152, B:133:0x014b, B:141:0x0162), top: B:7:0x0034, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0137 A[Catch: all -> 0x0329, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0329, blocks: (B:122:0x0128, B:125:0x0137, B:158:0x0321), top: B:121:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d0 A[Catch: all -> 0x02bf, TryCatch #11 {all -> 0x02bf, blocks: (B:19:0x02a8, B:32:0x02c6, B:34:0x02d0, B:36:0x02d8), top: B:18:0x02a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e2 A[Catch: all -> 0x00ae, TryCatch #9 {all -> 0x00ae, blocks: (B:51:0x00a2, B:53:0x01d9, B:56:0x01e2, B:58:0x01e6, B:60:0x01ea, B:61:0x01ef, B:62:0x01f5, B:65:0x01fd, B:68:0x020a, B:72:0x0235, B:74:0x0242, B:76:0x024a, B:78:0x0279, B:80:0x0309, B:82:0x030f, B:83:0x0315, B:84:0x031a, B:95:0x0203, B:98:0x0216, B:99:0x021b, B:100:0x021c, B:103:0x022c, B:104:0x0225, B:107:0x031b, B:108:0x0320, B:110:0x00d5), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.yandex.go.ble.connection.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, byte[] bArr, dc51 dc51Var, ContinuationImpl continuationImpl) {
        BleConnectionImpl$writeCharacteristic$1 bleConnectionImpl$writeCharacteristic$1;
        int i;
        ?? r14;
        ?? r15;
        Object obj;
        g050 g050Var;
        byte[] bArr2;
        String str3;
        dc51 dc51Var2;
        String str4;
        ac51 ac51Var;
        Object failure;
        UUID uuid;
        Object failure2;
        ac51 ac51Var2;
        UUID uuid2;
        Object obj2;
        BluetoothGatt bluetoothGatt;
        dc51 dc51Var3;
        byte[] bArr3;
        g050 g050Var2;
        g050 g050Var3;
        g050 g050Var4;
        BluetoothGattService bluetoothGattService;
        ac51 ac51Var3;
        Object e;
        UUID uuid3;
        g050 g050Var5;
        byte[] bArr4;
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        int i2;
        ?? r152;
        g050 g050Var6;
        g050 g050Var7;
        int i3;
        int writeCharacteristic;
        fyc fycVar;
        hst hstVar;
        ke00 a;
        Context context = this.a;
        ac51 ac51Var4 = yb51.e;
        ac51 ac51Var5 = yb51.d;
        try {
            try {
                try {
                    if (continuationImpl instanceof BleConnectionImpl$writeCharacteristic$1) {
                        bleConnectionImpl$writeCharacteristic$1 = (BleConnectionImpl$writeCharacteristic$1) continuationImpl;
                        int i4 = bleConnectionImpl$writeCharacteristic$1.label;
                        if ((i4 & Integer.MIN_VALUE) != 0) {
                            bleConnectionImpl$writeCharacteristic$1.label = i4 - Integer.MIN_VALUE;
                            Object obj3 = bleConnectionImpl$writeCharacteristic$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = bleConnectionImpl$writeCharacteristic$1.label;
                            ac51 ac51Var6 = zb51.a;
                            r14 = 2;
                            r15 = 1;
                            if (i != 0) {
                                b.b(obj3);
                                bleConnectionImpl$writeCharacteristic$1.L$0 = str;
                                bleConnectionImpl$writeCharacteristic$1.L$1 = str2;
                                bArr2 = bArr;
                                bleConnectionImpl$writeCharacteristic$1.L$2 = bArr2;
                                bleConnectionImpl$writeCharacteristic$1.L$3 = dc51Var;
                                kotlinx.coroutines.sync.a aVar = this.i;
                                bleConnectionImpl$writeCharacteristic$1.L$4 = aVar;
                                bleConnectionImpl$writeCharacteristic$1.label = 1;
                                if (aVar.a(bleConnectionImpl$writeCharacteristic$1) != coroutineSingletons) {
                                    str3 = str2;
                                    dc51Var2 = dc51Var;
                                    r15 = aVar;
                                    str4 = str;
                                }
                                return coroutineSingletons;
                            }
                            if (i != 1) {
                                if (i == 2) {
                                    UUID uuid4 = (UUID) bleConnectionImpl$writeCharacteristic$1.L$7;
                                    UUID uuid5 = (UUID) bleConnectionImpl$writeCharacteristic$1.L$6;
                                    BluetoothGatt bluetoothGatt2 = (BluetoothGatt) bleConnectionImpl$writeCharacteristic$1.L$5;
                                    g050 g050Var8 = (g050) bleConnectionImpl$writeCharacteristic$1.L$4;
                                    dc51Var3 = (dc51) bleConnectionImpl$writeCharacteristic$1.L$3;
                                    byte[] bArr5 = (byte[]) bleConnectionImpl$writeCharacteristic$1.L$2;
                                    b.b(obj3);
                                    bluetoothGatt = bluetoothGatt2;
                                    bArr3 = bArr5;
                                    g050Var4 = g050Var8;
                                    uuid = uuid5;
                                    uuid2 = uuid4;
                                    obj2 = obj3;
                                    ac51Var2 = ac51Var4;
                                    bluetoothGattService = (BluetoothGattService) obj2;
                                    if (bluetoothGattService != null) {
                                        g050Var3 = g050Var4;
                                        g050Var2 = g050Var3;
                                        ac51Var = ac51Var5;
                                        g050Var7 = g050Var2;
                                        g050Var7.d(null);
                                        return ac51Var;
                                    }
                                    ac51Var3 = ac51Var5;
                                    lu5 lu5Var = new lu5(7, bluetoothGattService, uuid2);
                                    bleConnectionImpl$writeCharacteristic$1.L$0 = null;
                                    bleConnectionImpl$writeCharacteristic$1.L$1 = null;
                                    bleConnectionImpl$writeCharacteristic$1.L$2 = bArr3;
                                    bleConnectionImpl$writeCharacteristic$1.L$3 = dc51Var3;
                                    bleConnectionImpl$writeCharacteristic$1.L$4 = g050Var4;
                                    bleConnectionImpl$writeCharacteristic$1.L$5 = bluetoothGatt;
                                    bleConnectionImpl$writeCharacteristic$1.L$6 = uuid;
                                    bleConnectionImpl$writeCharacteristic$1.L$7 = null;
                                    bleConnectionImpl$writeCharacteristic$1.L$8 = uuid2;
                                    bleConnectionImpl$writeCharacteristic$1.label = 3;
                                    e = e(bluetoothGatt, lu5Var, bleConnectionImpl$writeCharacteristic$1);
                                    if (e != coroutineSingletons) {
                                        uuid3 = uuid;
                                        g050Var5 = g050Var4;
                                        bArr4 = bArr3;
                                        bluetoothGattCharacteristic = (BluetoothGattCharacteristic) e;
                                        if (bluetoothGattCharacteristic != null) {
                                        }
                                        g050Var7.d(null);
                                        return ac51Var;
                                    }
                                    return coroutineSingletons;
                                }
                                if (i != 3) {
                                    if (i != 4) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    uuid2 = (UUID) bleConnectionImpl$writeCharacteristic$1.L$9;
                                    uuid3 = (UUID) bleConnectionImpl$writeCharacteristic$1.L$6;
                                    g050Var6 = (g050) bleConnectionImpl$writeCharacteristic$1.L$4;
                                    try {
                                        b.b(obj3);
                                        ac51Var2 = ac51Var4;
                                        try {
                                            try {
                                                boolean booleanValue = ((Boolean) obj3).booleanValue();
                                                hst hstVar2 = jst.e;
                                                ac51Var = !booleanValue ? ac51Var6 : ac51Var2;
                                                this.j = null;
                                            } catch (TimeoutCancellationException unused) {
                                                hstVar = jst.e;
                                                a = hstVar.b.a();
                                                if (a != null && a.b(15)) {
                                                    a.a(15, null, null, "Failed to get response on service " + uuid3 + " characteristic " + uuid2 + " data write...", hstVar.a);
                                                }
                                                this.j = null;
                                                ac51Var = ac51Var2;
                                                g050Var7 = g050Var6;
                                                g050Var7.d(null);
                                                return ac51Var;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            fycVar = null;
                                            this.j = fycVar;
                                            throw th;
                                        }
                                    } catch (TimeoutCancellationException unused2) {
                                        ac51Var2 = ac51Var4;
                                        hstVar = jst.e;
                                        a = hstVar.b.a();
                                        if (a != null) {
                                        }
                                        this.j = null;
                                        ac51Var = ac51Var2;
                                        g050Var7 = g050Var6;
                                        g050Var7.d(null);
                                        return ac51Var;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fycVar = null;
                                        this.j = fycVar;
                                        throw th;
                                    }
                                    g050Var7 = g050Var6;
                                    g050Var7.d(null);
                                    return ac51Var;
                                }
                                uuid2 = (UUID) bleConnectionImpl$writeCharacteristic$1.L$8;
                                UUID uuid6 = (UUID) bleConnectionImpl$writeCharacteristic$1.L$6;
                                bluetoothGatt = (BluetoothGatt) bleConnectionImpl$writeCharacteristic$1.L$5;
                                g050Var5 = (g050) bleConnectionImpl$writeCharacteristic$1.L$4;
                                dc51Var3 = (dc51) bleConnectionImpl$writeCharacteristic$1.L$3;
                                bArr4 = (byte[]) bleConnectionImpl$writeCharacteristic$1.L$2;
                                b.b(obj3);
                                ac51Var3 = ac51Var5;
                                uuid3 = uuid6;
                                e = obj3;
                                ac51Var2 = ac51Var4;
                                bluetoothGattCharacteristic = (BluetoothGattCharacteristic) e;
                                if (bluetoothGattCharacteristic != null) {
                                    g050Var7 = g050Var5;
                                    ac51Var = ac51Var3;
                                } else {
                                    if (dc51Var3 instanceof bc51) {
                                        fyc fycVar2 = this.j;
                                        if (fycVar2 != null) {
                                            fycVar2.T(Boolean.FALSE);
                                        }
                                        this.j = gwk0.b();
                                    }
                                    boolean f = jx81.f();
                                    cc51 cc51Var = cc51.a;
                                    if (f) {
                                        if (dc51Var3 instanceof bc51) {
                                            i3 = 2;
                                        } else {
                                            if (!jl40.l(dc51Var3, cc51Var)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i3 = 1;
                                        }
                                        writeCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr4, i3);
                                        hst hstVar3 = jst.e;
                                        r152 = writeCharacteristic == 0 ? 1 : 0;
                                    } else {
                                        bluetoothGattCharacteristic.setValue(bArr4);
                                        if (dc51Var3 instanceof bc51) {
                                            i2 = 2;
                                        } else {
                                            if (!jl40.l(dc51Var3, cc51Var)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i2 = 1;
                                        }
                                        bluetoothGattCharacteristic.setWriteType(i2);
                                        r152 = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                                    }
                                    if (r152 == 0) {
                                        this.j = null;
                                        hst hstVar4 = jst.e;
                                        ke00 a2 = hstVar4.b.a();
                                        if (a2 != null && a2.b(15)) {
                                            a2.a(15, null, null, "Failed to write service " + uuid3 + " characteristic " + uuid2 + " data...", hstVar4.a);
                                        }
                                        g050Var7 = g050Var5;
                                        ac51Var = ac51Var2;
                                    } else {
                                        if (dc51Var3 instanceof bc51) {
                                            try {
                                                long j = ((bc51) dc51Var3).a;
                                                BleConnectionImpl$writeCharacteristic$2$result$response$1 bleConnectionImpl$writeCharacteristic$2$result$response$1 = new BleConnectionImpl$writeCharacteristic$2$result$response$1(this, null);
                                                bleConnectionImpl$writeCharacteristic$1.L$0 = null;
                                                bleConnectionImpl$writeCharacteristic$1.L$1 = null;
                                                bleConnectionImpl$writeCharacteristic$1.L$2 = null;
                                                bleConnectionImpl$writeCharacteristic$1.L$3 = null;
                                                bleConnectionImpl$writeCharacteristic$1.L$4 = g050Var5;
                                                bleConnectionImpl$writeCharacteristic$1.L$5 = null;
                                                bleConnectionImpl$writeCharacteristic$1.L$6 = uuid3;
                                                bleConnectionImpl$writeCharacteristic$1.L$7 = null;
                                                bleConnectionImpl$writeCharacteristic$1.L$8 = null;
                                                bleConnectionImpl$writeCharacteristic$1.L$9 = uuid2;
                                                bleConnectionImpl$writeCharacteristic$1.I$0 = r152;
                                                bleConnectionImpl$writeCharacteristic$1.label = 4;
                                                obj3 = kotlinx.coroutines.a.v(j, bleConnectionImpl$writeCharacteristic$2$result$response$1, bleConnectionImpl$writeCharacteristic$1);
                                            } catch (TimeoutCancellationException unused3) {
                                                g050Var6 = g050Var5;
                                                hstVar = jst.e;
                                                a = hstVar.b.a();
                                                if (a != null) {
                                                    a.a(15, null, null, "Failed to get response on service " + uuid3 + " characteristic " + uuid2 + " data write...", hstVar.a);
                                                }
                                                this.j = null;
                                                ac51Var = ac51Var2;
                                                g050Var7 = g050Var6;
                                                g050Var7.d(null);
                                                return ac51Var;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                fycVar = null;
                                                this.j = fycVar;
                                                throw th;
                                            }
                                            if (obj3 != coroutineSingletons) {
                                                g050Var6 = g050Var5;
                                                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                                                hst hstVar22 = jst.e;
                                                if (!booleanValue2) {
                                                }
                                                this.j = null;
                                                g050Var7 = g050Var6;
                                            }
                                            return coroutineSingletons;
                                        }
                                        if (!jl40.l(dc51Var3, cc51Var)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        hst hstVar5 = jst.e;
                                        ac51Var = ac51Var6;
                                        g050Var7 = g050Var5;
                                    }
                                }
                                g050Var7.d(null);
                                return ac51Var;
                            }
                            g050 g050Var9 = (g050) bleConnectionImpl$writeCharacteristic$1.L$4;
                            dc51Var2 = (dc51) bleConnectionImpl$writeCharacteristic$1.L$3;
                            bArr2 = (byte[]) bleConnectionImpl$writeCharacteristic$1.L$2;
                            str3 = (String) bleConnectionImpl$writeCharacteristic$1.L$1;
                            str4 = (String) bleConnectionImpl$writeCharacteristic$1.L$0;
                            b.b(obj3);
                            r15 = g050Var9;
                            if (cia1.f(context)) {
                                ac51Var = yb51.c;
                                g050Var7 = r15;
                            } else {
                                BluetoothAdapter r = qje.r(context);
                                if (r == null || !r.isEnabled()) {
                                    ac51Var = yb51.a;
                                    g050Var7 = r15;
                                } else {
                                    BluetoothGatt bluetoothGatt3 = this.e;
                                    if (bluetoothGatt3 == null) {
                                        ac51Var = yb51.b;
                                        g050Var7 = r15;
                                    } else {
                                        try {
                                            failure = UUID.fromString(str4);
                                        } catch (Throwable th4) {
                                            failure = new Result.Failure(th4);
                                        }
                                        if (failure instanceof Result.Failure) {
                                            failure = null;
                                        }
                                        uuid = (UUID) failure;
                                        g050Var2 = r15;
                                        if (uuid != null) {
                                            try {
                                                failure2 = UUID.fromString(str3);
                                            } catch (Throwable th5) {
                                                failure2 = new Result.Failure(th5);
                                            }
                                            if (failure2 instanceof Result.Failure) {
                                                failure2 = null;
                                            }
                                            UUID uuid7 = (UUID) failure2;
                                            g050Var3 = r15;
                                            if (uuid7 != null) {
                                                hst hstVar6 = jst.e;
                                                ac51Var2 = ac51Var4;
                                                lu5 lu5Var2 = new lu5(6, bluetoothGatt3, uuid);
                                                bleConnectionImpl$writeCharacteristic$1.L$0 = null;
                                                bleConnectionImpl$writeCharacteristic$1.L$1 = null;
                                                bleConnectionImpl$writeCharacteristic$1.L$2 = bArr2;
                                                bleConnectionImpl$writeCharacteristic$1.L$3 = dc51Var2;
                                                bleConnectionImpl$writeCharacteristic$1.L$4 = r15;
                                                bleConnectionImpl$writeCharacteristic$1.L$5 = bluetoothGatt3;
                                                bleConnectionImpl$writeCharacteristic$1.L$6 = uuid;
                                                bleConnectionImpl$writeCharacteristic$1.L$7 = uuid7;
                                                bleConnectionImpl$writeCharacteristic$1.label = 2;
                                                Object e2 = e(bluetoothGatt3, lu5Var2, bleConnectionImpl$writeCharacteristic$1);
                                                if (e2 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                uuid2 = uuid7;
                                                obj2 = e2;
                                                bluetoothGatt = bluetoothGatt3;
                                                byte[] bArr6 = bArr2;
                                                dc51Var3 = dc51Var2;
                                                bArr3 = bArr6;
                                                g050Var4 = r15;
                                                bluetoothGattService = (BluetoothGattService) obj2;
                                                if (bluetoothGattService != null) {
                                                }
                                            }
                                            g050Var2 = g050Var3;
                                        }
                                        ac51Var = ac51Var5;
                                        g050Var7 = g050Var2;
                                    }
                                }
                            }
                            g050Var7.d(null);
                            return ac51Var;
                        }
                    }
                    if (cia1.f(context)) {
                    }
                    g050Var7.d(null);
                    return ac51Var;
                } catch (Throwable th6) {
                    th = th6;
                    obj = null;
                    g050Var = r15;
                    g050Var.d(obj);
                    throw th;
                }
                if (i != 0) {
                }
            } catch (Throwable th7) {
                th = th7;
                r14 = "Failed to write service ";
                obj = null;
                g050Var = r14;
                g050Var.d(obj);
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            obj = null;
            g050Var = r14;
            g050Var.d(obj);
            throw th;
        }
        bleConnectionImpl$writeCharacteristic$1 = new BleConnectionImpl$writeCharacteristic$1(this, continuationImpl);
        Object obj32 = bleConnectionImpl$writeCharacteristic$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bleConnectionImpl$writeCharacteristic$1.label;
        ac51 ac51Var62 = zb51.a;
        r14 = 2;
        r15 = 1;
    }
}
