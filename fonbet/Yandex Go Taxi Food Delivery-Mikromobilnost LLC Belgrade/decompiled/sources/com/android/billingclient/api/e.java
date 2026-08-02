package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.internal.play_billing.l0;
import com.google.android.gms.internal.play_billing.q;
import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.internal.play_billing.x;
import defpackage.cvb1;
import defpackage.do91;
import defpackage.fe91;
import defpackage.fs5;
import defpackage.gs5;
import defpackage.jd91;
import defpackage.ju61;
import defpackage.kzo;
import defpackage.l0g0;
import defpackage.lg;
import defpackage.mf1;
import defpackage.mr91;
import defpackage.nq91;
import defpackage.nqb1;
import defpackage.ns5;
import defpackage.u7f0;
import defpackage.um91;
import defpackage.v51;
import defpackage.v5c0;
import defpackage.vms;
import defpackage.vo91;
import defpackage.vsb1;
import defpackage.wp91;
import defpackage.xd91;
import defpackage.yua1;
import defpackage.zfb1;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class e extends a {
    public final Context A;
    public volatile int B;
    public volatile com.google.android.gms.internal.play_billing.zzav C;
    public volatile zzca D;
    public volatile mr91 E;

    public e(vms vmsVar, Context context) {
        super(vmsVar, context);
        this.B = 0;
        this.A = context;
    }

    public final /* synthetic */ void E(mf1 mf1Var, fs5 fs5Var) {
        super.a(mf1Var, fs5Var);
    }

    public final /* synthetic */ void F(mf1 mf1Var, fs5 fs5Var) {
        super.b(mf1Var, fs5Var);
    }

    public final /* synthetic */ void G(v5c0 v5c0Var, u7f0 u7f0Var) {
        super.g(v5c0Var, u7f0Var);
    }

    public final synchronized boolean H() {
        if (this.B == 2 && this.C != null) {
            if (this.D != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.android.billingclient.api.d] */
    public final wp91 I(final int i) {
        if (!H()) {
            int i2 = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClientTesting", 5);
            J(106, 28, fe91.a(-1, "Billing Override Service connection is disconnected."));
            return new vo91();
        }
        ?? r0 = new Object() { // from class: com.android.billingclient.api.d
            public final void a(l0 l0Var) {
                String str;
                e eVar = e.this;
                int i3 = i;
                try {
                    if (eVar.C == null) {
                        throw null;
                    }
                    com.google.android.gms.internal.play_billing.zzav zzavVar = eVar.C;
                    String packageName = eVar.A.getPackageName();
                    switch (i3) {
                        case 2:
                            str = "LAUNCH_BILLING_FLOW";
                            break;
                        case 3:
                            str = "ACKNOWLEDGE_PURCHASE";
                            break;
                        case 4:
                            str = "CONSUME_ASYNC";
                            break;
                        case 5:
                            str = "IS_FEATURE_SUPPORTED";
                            break;
                        case 6:
                            str = "START_CONNECTION";
                            break;
                        case 7:
                            str = "QUERY_PRODUCT_DETAILS_ASYNC";
                            break;
                        default:
                            str = "QUERY_SKU_DETAILS_ASYNC";
                            break;
                    }
                    zzavVar.zza(packageName, str, new zzbz(l0Var));
                } catch (Exception unused) {
                    eVar.J(HProv.PP_SET_PIN, 28, fe91.u);
                    com.google.android.gms.internal.play_billing.g.h("BillingClientTesting");
                    l0Var.d = true;
                    vsb1 vsb1Var = l0Var.b;
                    if (vsb1Var != null) {
                        nqb1 nqb1Var = vsb1Var.b;
                        nqb1Var.getClass();
                        if (zfb1.y.g(nqb1Var, null, 0)) {
                            zfb1.b(nqb1Var);
                            l0Var.a = null;
                            l0Var.b = null;
                            l0Var.c = null;
                        }
                    }
                }
            }
        };
        l0 l0Var = new l0();
        l0Var.c = new cvb1();
        vsb1 vsb1Var = new vsb1(l0Var);
        l0Var.b = vsb1Var;
        l0Var.a = d.class;
        try {
            r0.a(l0Var);
            l0Var.a = "billingOverrideService.getBillingOverride";
            return vsb1Var;
        } catch (Exception e) {
            q qVar = new q(e);
            yua1 yua1Var = zfb1.y;
            nqb1 nqb1Var = vsb1Var.b;
            if (yua1Var.g(nqb1Var, null, qVar)) {
                zfb1.b(nqb1Var);
            }
            return vsb1Var;
        }
    }

    public final void J(int i, int i2, ns5 ns5Var) {
        w b = xd91.b(i, i2, ns5Var);
        Objects.requireNonNull(b, "ApiFailure should not be null");
        this.g.j(b);
    }

    public final void K(int i, Consumer consumer, Runnable runnable) {
        mr91 mr91Var;
        um91 um91Var;
        um91 mr91Var2;
        wp91 I = I(i);
        synchronized (this) {
            try {
                if (this.E == null) {
                    ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.E = newSingleThreadScheduledExecutor instanceof mr91 ? (mr91) newSingleThreadScheduledExecutor : new mr91(newSingleThreadScheduledExecutor);
                }
                mr91Var = this.E;
            } finally {
            }
        }
        wp91 b = com.google.android.gms.internal.play_billing.e.b(I, mr91Var);
        lg lgVar = new lg(this, i, consumer, runnable);
        synchronized (this) {
            try {
                if (this.y == null) {
                    ExecutorService o = o();
                    if (o instanceof um91) {
                        mr91Var2 = (um91) o;
                    } else {
                        mr91Var2 = o instanceof ScheduledExecutorService ? new mr91((ScheduledExecutorService) o) : new nq91(o);
                    }
                    this.y = mr91Var2;
                }
                um91Var = this.y;
            } finally {
            }
        }
        b.d(new do91(0, b, lgVar), um91Var);
    }

    @Override // com.android.billingclient.api.a, defpackage.es5
    public final void a(mf1 mf1Var, fs5 fs5Var) {
        K(3, new v51(10, fs5Var), new ju61(6, this, mf1Var, fs5Var));
    }

    @Override // com.android.billingclient.api.a, defpackage.es5
    public final void b(mf1 mf1Var, fs5 fs5Var) {
        K(4, new v51(mf1Var, fs5Var), new ju61(5, this, mf1Var, fs5Var));
    }

    @Override // com.android.billingclient.api.a, defpackage.es5
    public final void c() {
        synchronized (this) {
            x d = xd91.d(27);
            Objects.requireNonNull(d, "ApiSuccess should not be null");
            this.g.l(d);
            try {
                try {
                    jd91 jd91Var = null;
                    if (this.D != null && this.C != null) {
                        com.google.android.gms.internal.play_billing.g.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.A.unbindService(this.D);
                        this.D = new zzca(this, jd91Var);
                    }
                    this.C = null;
                    if (this.E != null) {
                        this.E.shutdownNow();
                        this.E = null;
                    }
                } catch (RuntimeException unused) {
                    com.google.android.gms.internal.play_billing.g.h("BillingClientTesting");
                }
                this.B = 3;
            } catch (Throwable th) {
                this.B = 3;
                throw th;
            }
        }
        super.c();
    }

    @Override // com.android.billingclient.api.a, defpackage.es5
    public final ns5 f(Activity activity, kzo kzoVar) {
        int i = 0;
        try {
            i = ((Integer) I(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException unused) {
            J(114, 28, fe91.u);
            com.google.android.gms.internal.play_billing.g.h("BillingClientTesting");
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            J(HProv.PP_SET_PIN, 28, fe91.u);
            com.google.android.gms.internal.play_billing.g.h("BillingClientTesting");
        }
        if (i > 0) {
            ns5 a = fe91.a(i, "Billing override value was set by a license tester.");
            J(105, 2, a);
            D(a);
            return a;
        }
        try {
            return super.f(activity, kzoVar);
        } catch (Exception unused2) {
            ns5 ns5Var = fe91.i;
            J(HProv.PP_CACHE_SIZE, 2, ns5Var);
            com.google.android.gms.internal.play_billing.g.h("BillingClientTesting");
            return ns5Var;
        }
    }

    @Override // com.android.billingclient.api.a, defpackage.es5
    public final void g(v5c0 v5c0Var, u7f0 u7f0Var) {
        K(7, new v51(8, u7f0Var), new ju61(4, this, v5c0Var, u7f0Var));
    }

    @Override // com.android.billingclient.api.a, defpackage.es5
    public final void j(gs5 gs5Var) {
        synchronized (this) {
            if (H()) {
                com.google.android.gms.internal.play_billing.g.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                x d = xd91.d(26);
                Objects.requireNonNull(d, "ApiSuccess should not be null");
                this.g.l(d);
            } else {
                int i = 1;
                if (this.B == 1) {
                    int i2 = com.google.android.gms.internal.play_billing.g.a;
                    Log.isLoggable("BillingClientTesting", 5);
                } else if (this.B == 3) {
                    int i3 = com.google.android.gms.internal.play_billing.g.a;
                    Log.isLoggable("BillingClientTesting", 5);
                    J(38, 26, fe91.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.B = 1;
                    com.google.android.gms.internal.play_billing.g.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.D = new zzca(this, null);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> queryIntentServices = this.A.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                Log.isLoggable("BillingClientTesting", 5);
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.A.bindService(intent2, this.D, 1)) {
                                    com.google.android.gms.internal.play_billing.g.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    Log.isLoggable("BillingClientTesting", 5);
                                }
                            }
                            i = 39;
                        }
                    }
                    this.B = 0;
                    com.google.android.gms.internal.play_billing.g.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    J(i, 26, fe91.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.j(gs5Var);
    }

    public e(vms vmsVar, Context context, l0g0 l0g0Var) {
        super(vmsVar, context, l0g0Var);
        this.B = 0;
        this.A = context;
    }
}
