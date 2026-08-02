package xsna;

import android.app.UiModeManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bkz0;
import xsna.dzy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class gpy0 {
    public static final gpy0 l = new gpy0();
    public final h2z0 a = new h2z0();
    public final uvy0 b = new uvy0();
    public final bkz0 c;
    public final q1z0 d;
    public final tcz0 e;
    public final iiz0 f;
    public final kdz0 g;
    public final l7z0 h;
    public final nzy0 i;
    public final i7z0 j;
    public final dzy0 k;

    public gpy0() {
        bkz0 bkz0Var = new bkz0();
        bkz0Var.a = new bkz0.a(0L, new HashMap());
        this.c = bkz0Var;
        this.d = new q1z0();
        this.e = new tcz0();
        this.f = new iiz0();
        this.g = new kdz0();
        l7z0 l7z0Var = new l7z0();
        try {
            l7z0Var.a = BluetoothDevice.class.getMethod("isConnected", null);
        } catch (Throwable unused) {
        }
        this.h = l7z0Var;
        this.i = new nzy0();
        this.j = new i7z0();
        this.k = new dzy0();
    }

    public static long a(s3z0 s3z0Var, int i, long j) {
        if (s3z0Var == null) {
            return 0L;
        }
        long currentTimeMillis = System.currentTimeMillis();
        s3z0Var.a(i, currentTimeMillis - j);
        return currentTimeMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map b(pp50 pp50Var, jgz jgzVar, s3z0 s3z0Var, Context context) {
        HashMap hashMap;
        Intent intent;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        HashMap hashMap6;
        bkz0.a aVar;
        bkz0.a aVar2;
        HashMap hashMap7;
        HashMap hashMap8;
        HashMap hashMap9;
        int i;
        BluetoothAdapter defaultAdapter;
        HashMap hashMap10;
        Object invoke;
        HashMap hashMap11;
        UiModeManager uiModeManager;
        if (o8z0.b()) {
            gu8.c(null, "FingerprintDataProvider: You must not call collectData method from main thread");
            return Collections.EMPTY_MAP;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Map g = this.a.g(context);
        a(s3z0Var, 23, currentTimeMillis);
        Map h = this.b.h(context);
        long a = a(s3z0Var, 10, currentTimeMillis);
        this.j.getClass();
        HashMap hashMap12 = new HashMap();
        Point q = c1z0.q(context);
        int i2 = q.x;
        int i3 = q.y;
        if (i2 != 0 && i3 != 0) {
            hashMap12.put("vpw", String.valueOf(i2));
            hashMap12.put("vph", String.valueOf(i3));
        }
        a(s3z0Var, 21, a);
        synchronized (this.i) {
            try {
                hashMap = new HashMap();
                try {
                    intent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                } catch (NoSuchMethodError unused) {
                    intent = null;
                }
                if (intent != null) {
                    int intExtra = intent.getIntExtra("level", -1);
                    int intExtra2 = intent.getIntExtra("scale", -1);
                    int intExtra3 = intent.getIntExtra("status", 1);
                    if (intExtra >= 0 && intExtra2 > 0) {
                        hashMap.put("bl", String.valueOf((intExtra * 100) / intExtra2));
                    }
                    hashMap.put("bs", String.valueOf(intExtra3));
                }
            } finally {
            }
        }
        long a2 = a(s3z0Var, 16, a);
        this.k.getClass();
        HashMap hashMap13 = new HashMap();
        String str = dzy0.a.a;
        if (str != null) {
            hashMap13.put("mtr_id", str);
        }
        a(s3z0Var, 22, a2);
        HashMap hashMap14 = new HashMap();
        if (jgzVar.u()) {
            bkz0 bkz0Var = this.c;
            synchronized (bkz0Var) {
                synchronized (bkz0Var) {
                    aVar2 = bkz0Var.a;
                }
                long a3 = a(s3z0Var, 15, a2);
                ?? g2 = this.d.g(context);
                long a4 = a(s3z0Var, 11, a3);
                synchronized (this.e) {
                    hashMap7 = new HashMap();
                    try {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                        if (activeNetworkInfo != null) {
                            hashMap7.put(SignalingProtocol.NOTIFY_CONNECTION, activeNetworkInfo.getTypeName());
                            if (activeNetworkInfo.getType() == 0) {
                                hashMap7.put("connection_type", activeNetworkInfo.getSubtypeName() != null ? activeNetworkInfo.getSubtypeName() : "");
                            } else {
                                hashMap7.put("connection_type", activeNetworkInfo.getTypeName() != null ? activeNetworkInfo.getTypeName() : "");
                            }
                            try {
                                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                                if (networkCapabilities != null) {
                                    hashMap7.put("vpn_connected", networkCapabilities.hasTransport(4) ? "1" : "0");
                                }
                            } catch (Throwable th) {
                                gu8.e(null, "NetworkInfoDataProvider: " + th.getMessage());
                            }
                        }
                    } catch (Throwable unused2) {
                        gu8.c(null, "NetworkInfoDataProvider: No permissions for access to network state");
                    }
                }
                long a5 = a(s3z0Var, 14, a4);
                ?? g3 = this.f.g(context);
                long a6 = a(s3z0Var, 13, a5);
                l7z0 l7z0Var = this.h;
                l7z0Var.getClass();
                hashMap5 = new HashMap();
                Method method = l7z0Var.a;
                if (method == null) {
                    hashMap8 = g3;
                    hashMap9 = g2;
                } else {
                    try {
                        i = context.checkCallingOrSelfPermission("android.permission.BLUETOOTH");
                        hashMap8 = g3;
                        hashMap9 = g2;
                    } catch (Throwable th2) {
                        hashMap8 = g3;
                        hashMap9 = g2;
                        eb3.a(null, new StringBuilder("FPDataProvider: Unable to check android.permission.BLUETOOTH permission! Unexpected throwable in Context.checkCallingOrSelfPermission() method - "), th2);
                        i = -1;
                    }
                    if ((i == 0) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled()) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            Iterator<BluetoothDevice> it = defaultAdapter.getBondedDevices().iterator();
                            while (it.hasNext()) {
                                BluetoothDevice next = it.next();
                                Iterator<BluetoothDevice> it2 = it;
                                hashMap10 = hashMap7;
                                try {
                                    if (Arrays.binarySearch(l7z0.b, next.getBluetoothClass().getDeviceClass()) < 0 && (invoke = method.invoke(next, null)) != null && ((Boolean) invoke).booleanValue()) {
                                        String name = next.getName();
                                        if (!TextUtils.isEmpty(name)) {
                                            arrayList.add(new String(Base64.encode(name.getBytes(), 2), StandardCharsets.UTF_8));
                                        }
                                    }
                                    it = it2;
                                    hashMap7 = hashMap10;
                                } catch (Throwable unused3) {
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        hashMap10 = hashMap7;
                        if (!arrayList.isEmpty()) {
                            hashMap5.put("bdn", TextUtils.join(StringUtils.COMMA, arrayList));
                        }
                        long a7 = a(s3z0Var, 17, a6);
                        this.g.getClass();
                        hashMap11 = new HashMap();
                        uiModeManager = (UiModeManager) context.getSystemService("uimode");
                        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 3) {
                            hashMap11.put("isc", "1");
                        }
                        a(s3z0Var, 18, a7);
                        hashMap2 = hashMap8;
                        hashMap3 = hashMap11;
                        hashMap4 = hashMap9;
                        hashMap14 = hashMap10;
                    }
                }
                hashMap10 = hashMap7;
                long a72 = a(s3z0Var, 17, a6);
                this.g.getClass();
                hashMap11 = new HashMap();
                uiModeManager = (UiModeManager) context.getSystemService("uimode");
                if (uiModeManager != null) {
                    hashMap11.put("isc", "1");
                }
                a(s3z0Var, 18, a72);
                hashMap2 = hashMap8;
                hashMap3 = hashMap11;
                hashMap4 = hashMap9;
                hashMap14 = hashMap10;
            }
            o8z0.c(new sgr(bkz0Var, pp50Var, context));
            aVar2.getClass();
            new HashMap(aVar2.a);
            long a32 = a(s3z0Var, 15, a2);
            ?? g22 = this.d.g(context);
            long a42 = a(s3z0Var, 11, a32);
            synchronized (this.e) {
            }
        } else {
            hashMap2 = hashMap14;
            hashMap3 = hashMap2;
            hashMap4 = hashMap3;
            hashMap5 = hashMap4;
        }
        synchronized (this) {
            try {
                hashMap6 = new HashMap();
                hashMap6.putAll(g);
                hashMap6.putAll(h);
                hashMap6.putAll(hashMap12);
                hashMap6.putAll(hashMap);
                hashMap6.putAll(hashMap13);
                if (jgzVar.u()) {
                    bkz0 bkz0Var2 = this.c;
                    synchronized (bkz0Var2) {
                        aVar = bkz0Var2.a;
                    }
                    if (s3z0Var != null) {
                        s3z0Var.a(15, aVar.b);
                    }
                    aVar.getClass();
                    hashMap6.putAll(new HashMap(aVar.a));
                    hashMap6.putAll(hashMap4);
                    hashMap6.putAll(hashMap14);
                    hashMap6.putAll(hashMap2);
                    hashMap6.putAll(hashMap5);
                    hashMap6.putAll(hashMap3);
                }
            } finally {
            }
        }
        return hashMap6;
    }
}
