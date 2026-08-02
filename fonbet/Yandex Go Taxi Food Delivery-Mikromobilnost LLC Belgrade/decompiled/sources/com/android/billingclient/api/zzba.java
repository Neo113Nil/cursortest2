package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.play_billing.b0;
import com.google.android.gms.internal.play_billing.g0;
import com.google.android.gms.internal.play_billing.i0;
import com.google.android.gms.internal.play_billing.j0;
import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.internal.play_billing.y;
import com.google.android.gms.internal.play_billing.z;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzan;
import defpackage.bua1;
import defpackage.eid;
import defpackage.fe91;
import defpackage.gs5;
import defpackage.gva1;
import defpackage.nna1;
import defpackage.ns5;
import defpackage.rfw0;
import defpackage.sla1;
import defpackage.xd91;
import defpackage.z991;
import java.util.concurrent.Callable;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes.dex */
final class zzba implements ServiceConnection {
    final /* synthetic */ a zza;
    private final gs5 zzb;

    public /* synthetic */ zzba(a aVar, gs5 gs5Var, z991 z991Var) {
        this.zza = aVar;
        this.zzb = gs5Var;
    }

    private final void zzc(ns5 ns5Var) {
        synchronized (this.zza.a) {
            try {
                if (this.zza.b == 3) {
                    return;
                }
                this.zzb.onBillingSetupFinished(ns5Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        int i = com.google.android.gms.internal.play_billing.g.a;
        Log.isLoggable("BillingClient", 5);
        try {
            a aVar = this.zza;
            synchronized (aVar.a) {
                z = true;
                if (aVar.b != 1) {
                    z = false;
                }
            }
            a aVar2 = this.zza;
            if (z) {
                rfw0 rfw0Var = aVar2.g;
                sla1 u = w.u();
                u.e();
                w.t((w) u.b, 6);
                nna1 v = y.v();
                v.f(122);
                u.f(v);
                rfw0Var.j((w) u.d());
            } else {
                rfw0 rfw0Var2 = aVar2.g;
                z r = z.r();
                rfw0Var2.getClass();
                try {
                    bua1 x = g0.x();
                    x.f((b0) rfw0Var2.a);
                    x.e();
                    g0.t((g0) x.b, r);
                    ((eid) rfw0Var2.b).m((g0) x.d());
                } catch (Throwable unused) {
                    com.google.android.gms.internal.play_billing.g.h("BillingLogger");
                }
            }
        } catch (Throwable unused2) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
        }
        synchronized (this.zza.a) {
            if (this.zza.b != 3 && this.zza.b != 0) {
                this.zza.r(0);
                this.zza.s();
                this.zzb.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.g.g("BillingClient", "Billing service connected.");
        synchronized (this.zza.a) {
            try {
                if (this.zza.b == 3) {
                    return;
                }
                this.zza.h = zzam.zzu(iBinder);
                a aVar = this.zza;
                if (a.k(new Callable() { // from class: com.android.billingclient.api.b
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzba.this.zza();
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzba.this.zzb();
                    }
                }, aVar.y(), aVar.o()) == null) {
                    a aVar2 = this.zza;
                    ns5 l = aVar2.l();
                    aVar2.B(25, 6, l);
                    zzc(l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        int i = com.google.android.gms.internal.play_billing.g.a;
        Log.isLoggable("BillingClient", 5);
        try {
            a aVar = this.zza;
            synchronized (aVar.a) {
                z = true;
                if (aVar.b != 1) {
                    z = false;
                }
            }
            a aVar2 = this.zza;
            if (z) {
                rfw0 rfw0Var = aVar2.g;
                sla1 u = w.u();
                u.e();
                w.t((w) u.b, 6);
                nna1 v = y.v();
                v.f(Constants.VPN_TRAFFIC);
                u.f(v);
                rfw0Var.j((w) u.d());
            } else {
                rfw0 rfw0Var2 = aVar2.g;
                j0 r = j0.r();
                rfw0Var2.getClass();
                if (r != null) {
                    try {
                        bua1 x = g0.x();
                        x.f((b0) rfw0Var2.a);
                        x.e();
                        g0.w((g0) x.b, r);
                        ((eid) rfw0Var2.b).m((g0) x.d());
                    } catch (Throwable unused) {
                        com.google.android.gms.internal.play_billing.g.h("BillingLogger");
                    }
                }
            }
        } catch (Throwable unused2) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
        }
        synchronized (this.zza.a) {
            try {
                if (this.zza.b == 3) {
                    return;
                }
                this.zza.r(0);
                this.zzb.onBillingServiceDisconnected();
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza() throws Exception {
        Bundle bundle;
        boolean z;
        int i;
        int i2;
        String a;
        int i3;
        zzan zzanVar;
        a aVar;
        synchronized (this.zza.a) {
            try {
                if (this.zza.b == 3) {
                    return null;
                }
                int i4 = this.zza.b;
                if (TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                    a aVar2 = this.zza;
                    com.google.android.gms.internal.play_billing.g.b(bundle, aVar2.c, aVar2.z.longValue());
                }
                try {
                    synchronized (this.zza.a) {
                        zzanVar = this.zza.h;
                    }
                    aVar = this.zza;
                } catch (Exception e) {
                    z = i4 != 1;
                    com.google.android.gms.internal.play_billing.g.h("BillingClient");
                    if (e instanceof DeadObjectException) {
                        i2 = 101;
                    } else if (e instanceof RemoteException) {
                        i2 = 100;
                    } else if (e instanceof SecurityException) {
                        i2 = 102;
                    } else {
                        i = 42;
                        a = i != 42 ? xd91.a(e) : null;
                        this.zza.r(0);
                        i3 = 6;
                    }
                    i = i2;
                    if (i != 42) {
                    }
                    this.zza.r(0);
                    i3 = 6;
                }
                if (zzanVar == null) {
                    aVar.r(0);
                    a aVar3 = this.zza;
                    ns5 ns5Var = fe91.k;
                    aVar3.B(119, 6, ns5Var);
                    zzc(ns5Var);
                    return null;
                }
                String packageName = aVar.f.getPackageName();
                int i5 = 23;
                i3 = 3;
                int i6 = 23;
                while (true) {
                    if (i6 < 3) {
                        i6 = 0;
                        break;
                    }
                    i3 = bundle == null ? zzanVar.zzy(i6, packageName, "subs") : zzanVar.zzc(i6, packageName, "subs", bundle);
                    if (i3 == 0) {
                        com.google.android.gms.internal.play_billing.g.g("BillingClient", "highestLevelSupportedForSubs: " + i6);
                        break;
                    }
                    i6--;
                }
                this.zza.getClass();
                this.zza.j = i6 >= 3;
                if (i6 < 3) {
                    com.google.android.gms.internal.play_billing.g.g("BillingClient", "In-app billing API does not support subscription on this device.");
                    i = 9;
                } else {
                    i = 1;
                }
                while (true) {
                    if (i5 < 3) {
                        break;
                    }
                    i3 = bundle == null ? zzanVar.zzy(i5, packageName, "inapp") : zzanVar.zzc(i5, packageName, "inapp", bundle);
                    if (i3 == 0) {
                        this.zza.k = i5;
                        com.google.android.gms.internal.play_billing.g.g("BillingClient", "mHighestLevelSupportedForInApp: " + i5);
                        break;
                    }
                    i5--;
                }
                a aVar4 = this.zza;
                int i7 = aVar4.k;
                aVar4.u = i7 >= 21;
                aVar4.t = i7 >= 20;
                aVar4.s = i7 >= 19;
                aVar4.r = i7 >= 18;
                aVar4.q = i7 >= 17;
                aVar4.p = i7 >= 16;
                aVar4.o = i7 >= 15;
                aVar4.n = i7 >= 14;
                aVar4.m = i7 >= 9;
                aVar4.l = i7 >= 6;
                if (i7 < 3) {
                    int i8 = com.google.android.gms.internal.play_billing.g.a;
                    Log.isLoggable("BillingClient", 5);
                    i = 36;
                }
                if (i3 == 0) {
                    synchronized (this.zza.a) {
                        try {
                            if (this.zza.b == 3) {
                                return null;
                            }
                            z = i4 != 1;
                            this.zza.r(2);
                            f fVar = this.zza.e != null ? this.zza.e : null;
                            if (fVar != null) {
                                fVar.a(this.zza.u);
                            }
                        } finally {
                        }
                    }
                } else {
                    z = i4 != 1;
                    this.zza.r(0);
                }
                a = null;
                if (i3 == 0) {
                    a aVar5 = this.zza;
                    try {
                        if (true != z) {
                            aVar5.getClass();
                            try {
                                aVar5.q(xd91.d(6));
                            } catch (Throwable unused) {
                                com.google.android.gms.internal.play_billing.g.h("BillingClient");
                            }
                        } else {
                            rfw0 rfw0Var = aVar5.g;
                            gva1 t = i0.t();
                            nna1 v = y.v();
                            v.e();
                            y.t((y) v.b, 0);
                            t.f(v);
                            rfw0Var.m((i0) t.d());
                        }
                    } catch (Throwable unused2) {
                        com.google.android.gms.internal.play_billing.g.h("BillingClient");
                    }
                    zzc(fe91.j);
                } else {
                    ns5 ns5Var2 = fe91.a;
                    try {
                        if (true != z) {
                            this.zza.C(i, 6, ns5Var2, a);
                        } else {
                            nna1 v2 = y.v();
                            int i9 = ns5Var2.a;
                            v2.e();
                            y.t((y) v2.b, i9);
                            String str = ns5Var2.b;
                            v2.e();
                            y.s((y) v2.b, str);
                            v2.f(i);
                            if (a != null) {
                                v2.e();
                                y.r((y) v2.b, a);
                            }
                            rfw0 rfw0Var2 = this.zza.g;
                            gva1 t2 = i0.t();
                            t2.g((y) v2.d());
                            rfw0Var2.m((i0) t2.d());
                        }
                    } catch (Throwable unused3) {
                        com.google.android.gms.internal.play_billing.g.h("BillingClient");
                    }
                    zzc(fe91.a);
                }
                return null;
            } finally {
            }
        }
    }

    public final /* synthetic */ void zzb() {
        this.zza.r(0);
        ns5 ns5Var = fe91.l;
        this.zza.B(24, 6, ns5Var);
        zzc(ns5Var);
    }
}
