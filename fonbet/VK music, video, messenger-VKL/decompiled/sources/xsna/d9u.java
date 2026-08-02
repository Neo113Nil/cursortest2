package xsna;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.el3;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class d9u implements Handler.Callback {

    @NonNull
    public static final Status q = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status r = new Status(4, "The user must be signed in to make this API call.");
    public static final Object s = new Object();

    @Nullable
    public static d9u t;

    @Nullable
    public TelemetryData d;

    @Nullable
    public wpz0 e;
    public final Context f;
    public final GoogleApiAvailability g;
    public final npz0 h;
    public final com.google.android.gms.internal.base.zar o;
    public volatile boolean p;
    public long b = 10000;
    public boolean c = false;
    public final AtomicInteger i = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);
    public final ConcurrentHashMap k = new ConcurrentHashMap(5, 0.75f, 1);

    @Nullable
    public skz0 l = null;
    public final el3 m = new el3();
    public final el3 n = new el3();

    public d9u(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.p = true;
        this.f = context;
        com.google.android.gms.internal.base.zar zarVar = new com.google.android.gms.internal.base.zar(looper, this);
        this.o = zarVar;
        this.g = googleApiAvailability;
        this.h = new npz0(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (e43.e == null) {
            e43.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (e43.e.booleanValue()) {
            this.p = false;
        }
        zarVar.sendMessage(zarVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (s) {
            try {
                d9u d9uVar = t;
                if (d9uVar != null) {
                    d9uVar.j.incrementAndGet();
                    com.google.android.gms.internal.base.zar zarVar = d9uVar.o;
                    zarVar.sendMessageAtFrontOfQueue(zarVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status d(ty2 ty2Var, ConnectionResult connectionResult) {
        String str = ty2Var.b.c;
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, h5s.d(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf));
    }

    @NonNull
    public static d9u e(@NonNull Context context) {
        d9u d9uVar;
        synchronized (s) {
            try {
                if (t == null) {
                    Looper looper = v2u.b().getLooper();
                    context.getPackageName();
                    d9u d9uVar2 = new d9u(context.getApplicationContext(), looper, GoogleApiAvailability.getInstance());
                    u2u.zag(fpz0.a(d9uVar2.f));
                    t = d9uVar2;
                }
                d9uVar = t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d9uVar;
    }

    public final hmz0 b(com.google.android.gms.common.api.b bVar) {
        ty2 apiKey = bVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.k;
        hmz0 hmz0Var = (hmz0) concurrentHashMap.get(apiKey);
        if (hmz0Var == null) {
            hmz0Var = new hmz0(this, bVar);
            concurrentHashMap.put(apiKey, hmz0Var);
        }
        if (hmz0Var.b.requiresSignIn()) {
            this.n.add(apiKey);
        }
        hmz0Var.r();
        return hmz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.common.api.b bVar) {
        qmz0 qmz0Var;
        d9u d9uVar;
        if (i == 0) {
            return;
        }
        ty2 apiKey = bVar.getApiKey();
        if (g()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = mmg0.a().a;
            boolean z = true;
            if (rootTelemetryConfiguration != null) {
                if (rootTelemetryConfiguration.c) {
                    boolean z2 = rootTelemetryConfiguration.d;
                    hmz0 hmz0Var = (hmz0) this.k.get(apiKey);
                    if (hmz0Var != null) {
                        Object obj = hmz0Var.b;
                        if (obj instanceof rd6) {
                            rd6 rd6Var = (rd6) obj;
                            if (rd6Var.hasConnectionInfo() && !rd6Var.isConnecting()) {
                                ConnectionTelemetryConfiguration a = qmz0.a(hmz0Var, rd6Var, i);
                                if (a != null) {
                                    hmz0Var.n++;
                                    z = a.n();
                                }
                            }
                        }
                    }
                    z = z2;
                }
            }
            d9uVar = this;
            qmz0Var = new qmz0(d9uVar, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            if (qmz0Var == null) {
                Task task = taskCompletionSource.getTask();
                final com.google.android.gms.internal.base.zar zarVar = d9uVar.o;
                Objects.requireNonNull(zarVar);
                task.addOnCompleteListener(new Executor() { // from class: xsna.lmz0
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zarVar.post(runnable);
                    }
                }, qmz0Var);
                return;
            }
            return;
        }
        qmz0Var = null;
        d9uVar = this;
        if (qmz0Var == null) {
        }
    }

    public final void f(@NonNull skz0 skz0Var) {
        synchronized (s) {
            try {
                if (this.l != skz0Var) {
                    this.l = skz0Var;
                    this.m.clear();
                }
                this.m.addAll(skz0Var.f());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        int i;
        if (this.c) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = mmg0.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.c) {
            return false;
        }
        SparseIntArray sparseIntArray = this.h.a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    @NonNull
    public final Task h(@NonNull com.google.android.gms.common.api.b bVar, @NonNull eqf0 eqf0Var, @NonNull k5q0 k5q0Var, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c(taskCompletionSource, eqf0Var.d(), bVar);
        anz0 anz0Var = new anz0(new goz0(new bnz0(eqf0Var, k5q0Var, runnable), taskCompletionSource), this.j.get(), bVar);
        com.google.android.gms.internal.base.zar zarVar = this.o;
        zarVar.sendMessage(zarVar.obtainMessage(8, anz0Var));
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02fe  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(@NonNull Message message) {
        boolean z;
        Feature[] f;
        com.google.android.gms.internal.base.zar zarVar = this.o;
        ConcurrentHashMap concurrentHashMap = this.k;
        int i = message.what;
        hmz0 hmz0Var = null;
        switch (i) {
            case 1:
                this.b = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zarVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zarVar.sendMessageDelayed(zarVar.obtainMessage(12, (ty2) it.next()), this.b);
                }
                return true;
            case 2:
                ((cpz0) message.obj).getClass();
                cpz0.a();
                throw null;
            case 3:
                for (hmz0 hmz0Var2 : concurrentHashMap.values()) {
                    exc0.d(hmz0Var2.o.o);
                    hmz0Var2.m = null;
                    hmz0Var2.r();
                }
                return true;
            case 4:
            case 8:
            case 13:
                anz0 anz0Var = (anz0) message.obj;
                com.google.android.gms.common.api.b bVar = anz0Var.c;
                qoz0 qoz0Var = anz0Var.a;
                hmz0 hmz0Var3 = (hmz0) concurrentHashMap.get(bVar.getApiKey());
                if (hmz0Var3 == null) {
                    hmz0Var3 = b(bVar);
                }
                if (!hmz0Var3.b.requiresSignIn() || this.j.get() == anz0Var.b) {
                    hmz0Var3.p(qoz0Var);
                    return true;
                }
                qoz0Var.a(q);
                hmz0Var3.q();
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        hmz0 hmz0Var4 = (hmz0) it2.next();
                        if (hmz0Var4.i == i2) {
                            hmz0Var = hmz0Var4;
                        }
                    }
                }
                if (hmz0Var == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 65);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                if (connectionResult.c != 13) {
                    hmz0Var.i(d(hmz0Var.e, connectionResult));
                    return true;
                }
                GoogleApiAvailability googleApiAvailability = this.g;
                int i3 = connectionResult.c;
                googleApiAvailability.getClass();
                AtomicBoolean atomicBoolean = fau.a;
                String l = ConnectionResult.l(i3);
                String str = connectionResult.e;
                hmz0Var.i(new Status(17, h5s.d(new StringBuilder(String.valueOf(l).length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", l, ": ", str)));
                return true;
            case 6:
                Context context = this.f;
                if (context.getApplicationContext() instanceof Application) {
                    gw5.a((Application) context.getApplicationContext());
                    gw5 gw5Var = gw5.f;
                    cmz0 cmz0Var = new cmz0(this);
                    gw5Var.getClass();
                    synchronized (gw5Var) {
                        gw5Var.d.add(cmz0Var);
                    }
                    AtomicBoolean atomicBoolean2 = gw5Var.b;
                    AtomicBoolean atomicBoolean3 = gw5Var.c;
                    if (!atomicBoolean3.get()) {
                        Boolean bool = ahd0.b;
                        if (bool == null) {
                            bool = Boolean.valueOf(Process.isIsolated());
                            ahd0.b = bool;
                        }
                        if (bool.booleanValue()) {
                            z = true;
                            if (!z) {
                                this.b = 300000L;
                                return true;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        }
                    }
                    z = atomicBoolean2.get();
                    if (!z) {
                    }
                }
                return true;
            case 7:
                b((com.google.android.gms.common.api.b) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    hmz0 hmz0Var5 = (hmz0) concurrentHashMap.get(message.obj);
                    exc0.d(hmz0Var5.o.o);
                    if (hmz0Var5.k) {
                        hmz0Var5.r();
                        return true;
                    }
                }
                return true;
            case 10:
                el3 el3Var = this.n;
                el3Var.getClass();
                el3.a aVar = new el3.a();
                while (aVar.hasNext()) {
                    hmz0 hmz0Var6 = (hmz0) concurrentHashMap.remove((ty2) aVar.next());
                    if (hmz0Var6 != null) {
                        hmz0Var6.q();
                    }
                }
                el3Var.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    hmz0 hmz0Var7 = (hmz0) concurrentHashMap.get(message.obj);
                    d9u d9uVar = hmz0Var7.o;
                    exc0.d(d9uVar.o);
                    boolean z2 = hmz0Var7.k;
                    if (z2) {
                        if (z2) {
                            d9u d9uVar2 = hmz0Var7.o;
                            ty2 ty2Var = hmz0Var7.e;
                            d9uVar2.o.removeMessages(11, ty2Var);
                            d9uVar2.o.removeMessages(9, ty2Var);
                            hmz0Var7.k = false;
                        }
                        hmz0Var7.i(d9uVar.g.isGooglePlayServicesAvailable(d9uVar.f) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                        hmz0Var7.b.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((hmz0) concurrentHashMap.get(message.obj)).k(true);
                    return true;
                }
                return true;
            case 14:
                tkz0 tkz0Var = (tkz0) message.obj;
                ty2 a = tkz0Var.a();
                if (concurrentHashMap.containsKey(a)) {
                    tkz0Var.b().setResult(Boolean.valueOf(((hmz0) concurrentHashMap.get(a)).k(false)));
                    return true;
                }
                tkz0Var.b().setResult(Boolean.FALSE);
                return true;
            case 15:
                imz0 imz0Var = (imz0) message.obj;
                if (concurrentHashMap.containsKey(imz0Var.a())) {
                    hmz0 hmz0Var8 = (hmz0) concurrentHashMap.get(imz0Var.a());
                    if (hmz0Var8.l.contains(imz0Var) && !hmz0Var8.k) {
                        if (hmz0Var8.b.isConnected()) {
                            hmz0Var8.d();
                            return true;
                        }
                        hmz0Var8.r();
                        return true;
                    }
                }
                return true;
            case 16:
                imz0 imz0Var2 = (imz0) message.obj;
                if (concurrentHashMap.containsKey(imz0Var2.a())) {
                    hmz0 hmz0Var9 = (hmz0) concurrentHashMap.get(imz0Var2.a());
                    if (hmz0Var9.l.remove(imz0Var2)) {
                        d9u d9uVar3 = hmz0Var9.o;
                        d9uVar3.o.removeMessages(15, imz0Var2);
                        d9uVar3.o.removeMessages(16, imz0Var2);
                        Feature b = imz0Var2.b();
                        LinkedList<qoz0> linkedList = hmz0Var9.a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (qoz0 qoz0Var2 : linkedList) {
                            if ((qoz0Var2 instanceof tmz0) && (f = ((tmz0) qoz0Var2).f(hmz0Var9)) != null) {
                                int length = f.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        break;
                                    }
                                    if (!dq70.b(f[i4], b)) {
                                        i4++;
                                    } else if (i4 >= 0) {
                                        arrayList.add(qoz0Var2);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            qoz0 qoz0Var3 = (qoz0) arrayList.get(i5);
                            linkedList.remove(qoz0Var3);
                            qoz0Var3.b(new UnsupportedApiCallException(b));
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.d;
                if (telemetryData != null) {
                    if (telemetryData.b > 0 || g()) {
                        if (this.e == null) {
                            this.e = new wpz0(this.f, wpz0.a, a8o0.c, b.a.c);
                        }
                        this.e.a(telemetryData);
                    }
                    this.d = null;
                    return true;
                }
                return true;
            case 18:
                rmz0 rmz0Var = (rmz0) message.obj;
                long j = rmz0Var.c;
                MethodInvocation methodInvocation = rmz0Var.a;
                int i6 = rmz0Var.b;
                if (j == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i6, Arrays.asList(methodInvocation));
                    if (this.e == null) {
                        this.e = new wpz0(this.f, wpz0.a, a8o0.c, b.a.c);
                    }
                    this.e.a(telemetryData2);
                    return true;
                }
                TelemetryData telemetryData3 = this.d;
                if (telemetryData3 != null) {
                    List list = telemetryData3.c;
                    if (telemetryData3.b != i6 || (list != null && list.size() >= rmz0Var.d)) {
                        zarVar.removeMessages(17);
                        TelemetryData telemetryData4 = this.d;
                        if (telemetryData4 != null) {
                            if (telemetryData4.b > 0 || g()) {
                                if (this.e == null) {
                                    this.e = new wpz0(this.f, wpz0.a, a8o0.c, b.a.c);
                                }
                                this.e.a(telemetryData4);
                            }
                            this.d = null;
                        }
                    } else {
                        TelemetryData telemetryData5 = this.d;
                        if (telemetryData5.c == null) {
                            telemetryData5.c = new ArrayList();
                        }
                        telemetryData5.c.add(methodInvocation);
                    }
                }
                if (this.d == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(methodInvocation);
                    this.d = new TelemetryData(i6, arrayList2);
                    zarVar.sendMessageDelayed(zarVar.obtainMessage(17), j);
                    return true;
                }
                return true;
            case 19:
                this.c = false;
                return true;
            default:
                new StringBuilder(String.valueOf(i).length() + 20);
                return false;
        }
    }

    public final boolean i(ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntent;
        int i2 = connectionResult.c;
        GoogleApiAvailability googleApiAvailability = this.g;
        googleApiAvailability.getClass();
        if (i2 != 9) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    switch (i2) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            break;
                        default:
                            "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(connectionResult));
                            return false;
                    }
            }
        }
        Context context = this.f;
        if (!q6x.v(context)) {
            boolean i3 = connectionResult.i();
            int i4 = connectionResult.c;
            if (i3) {
                pendingIntent = connectionResult.d;
            } else {
                pendingIntent = null;
                Intent b = googleApiAvailability.b(context, i4, null);
                if (b != null) {
                    pendingIntent = wu90.a(context, b);
                }
            }
            if (pendingIntent != null) {
                googleApiAvailability.h(context, new ConnectionResult(i4, com.google.android.gms.internal.base.zan.zaa(context, 0, GoogleApiActivity.a(context, pendingIntent, i, true), com.google.android.gms.internal.base.zan.zaa | 134217728), connectionResult.e, connectionResult.f));
                return true;
            }
        }
        return false;
    }

    public final void j(@NonNull ConnectionResult connectionResult, int i) {
        if (i(connectionResult, i)) {
            return;
        }
        com.google.android.gms.internal.base.zar zarVar = this.o;
        zarVar.sendMessage(zarVar.obtainMessage(5, i, 0, connectionResult));
    }
}
