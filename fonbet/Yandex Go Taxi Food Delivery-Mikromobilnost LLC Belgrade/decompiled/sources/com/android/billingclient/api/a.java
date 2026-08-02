package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.b0;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.k;
import com.google.android.gms.internal.play_billing.k0;
import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.internal.play_billing.x;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzco;
import defpackage.ag1;
import defpackage.b64;
import defpackage.cya1;
import defpackage.do91;
import defpackage.es5;
import defpackage.f791;
import defpackage.fe91;
import defpackage.fs5;
import defpackage.gs5;
import defpackage.iqa1;
import defpackage.ita1;
import defpackage.j0g0;
import defpackage.ks5;
import defpackage.kzo;
import defpackage.l0g0;
import defpackage.l591;
import defpackage.mf1;
import defpackage.ns5;
import defpackage.o3;
import defpackage.q7f0;
import defpackage.rd61;
import defpackage.rfw0;
import defpackage.t7f0;
import defpackage.tqs;
import defpackage.u7f0;
import defpackage.um91;
import defpackage.uma1;
import defpackage.uqs;
import defpackage.v5c0;
import defpackage.vjb1;
import defpackage.vms;
import defpackage.w991;
import defpackage.wwa1;
import defpackage.xd91;
import defpackage.z991;
import defpackage.zt91;
import io.appmetrica.analytics.billingv6.impl.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public class a extends es5 {
    public final Object a;
    public volatile int b;
    public final String c;
    public final Handler d;
    public volatile f e;
    public final Context f;
    public final rfw0 g;
    public volatile zzan h;
    public volatile zzba i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final vms v;
    public final boolean w;
    public ExecutorService x;
    public volatile um91 y;
    public final Long z;

    public a(vms vmsVar, Context context) {
        this.a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.k = 0;
        long nextLong = new Random().nextLong();
        this.z = Long.valueOf(nextLong);
        this.c = n();
        this.f = context.getApplicationContext();
        iqa1 v = b0.v();
        String n = n();
        v.e();
        b0.u((b0) v.b, n);
        String packageName = this.f.getPackageName();
        v.e();
        b0.t((b0) v.b, packageName);
        v.e();
        b0.s((b0) v.b, nextLong);
        this.g = new rfw0(this.f, (b0) v.d());
        int i = com.google.android.gms.internal.play_billing.g.a;
        Log.isLoggable("BillingClient", 5);
        this.e = new f(this.f, null, this.g);
        this.v = vmsVar;
        this.f.getPackageName();
    }

    public static Future k(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new do91(21, submit, runnable), (long) (j * 0.95d));
            return submit;
        } catch (Exception unused) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
            return null;
        }
    }

    public static String n() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public final void A(fs5 fs5Var, ns5 ns5Var, int i, Exception exc) {
        com.google.android.gms.internal.play_billing.g.h("BillingClient");
        C(i, 13, ns5Var, xd91.a(exc));
        fs5Var.b(ns5Var, null);
    }

    public final void B(int i, int i2, ns5 ns5Var) {
        try {
            p(xd91.b(i, i2, ns5Var));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
        }
    }

    public final void C(int i, int i2, ns5 ns5Var, String str) {
        try {
            p(xd91.c(i, i2, ns5Var, str));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
        }
    }

    public final void D(ns5 ns5Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.d.post(new uqs(26, this, ns5Var));
    }

    @Override // defpackage.es5
    public void a(mf1 mf1Var, fs5 fs5Var) {
        if (!e()) {
            ns5 ns5Var = fe91.k;
            B(2, 3, ns5Var);
            fs5Var.a(ns5Var);
            return;
        }
        int i = 5;
        if (TextUtils.isEmpty(mf1Var.g())) {
            int i2 = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            ns5 ns5Var2 = fe91.h;
            B(26, 3, ns5Var2);
            fs5Var.a(ns5Var2);
            return;
        }
        int i3 = 27;
        if (!this.m) {
            ns5 ns5Var3 = fe91.b;
            B(27, 3, ns5Var3);
            fs5Var.a(ns5Var3);
        } else if (k(new l591(this, fs5Var, mf1Var, i), 30000L, new uqs(i3, this, fs5Var), y(), o()) == null) {
            ns5 l = l();
            B(25, 3, l);
            fs5Var.a(l);
        }
    }

    @Override // defpackage.es5
    public void b(mf1 mf1Var, fs5 fs5Var) {
        if (!e()) {
            ns5 ns5Var = fe91.k;
            B(2, 4, ns5Var);
            fs5Var.c(ns5Var);
        } else if (k(new l591(this, mf1Var, fs5Var, 0), 30000L, new tqs(23, this, fs5Var, mf1Var), y(), o()) == null) {
            ns5 l = l();
            B(25, 4, l);
            fs5Var.c(l);
        }
    }

    @Override // defpackage.es5
    public void c() {
        try {
            q(xd91.d(12));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
        }
        synchronized (this.a) {
            try {
                if (this.e != null) {
                    f fVar = this.e;
                    zzm zzmVar = fVar.d;
                    Context context = fVar.a;
                    zzmVar.zzc(context);
                    fVar.e.zzc(context);
                }
            } catch (Throwable unused2) {
                com.google.android.gms.internal.play_billing.g.h("BillingClient");
            }
            try {
                com.google.android.gms.internal.play_billing.g.g("BillingClient", "Unbinding from service.");
                s();
            } catch (Throwable unused3) {
                com.google.android.gms.internal.play_billing.g.h("BillingClient");
            }
            try {
                try {
                    synchronized (this) {
                        ExecutorService executorService = this.x;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.x = null;
                            this.y = null;
                        }
                    }
                } catch (Throwable unused4) {
                    com.google.android.gms.internal.play_billing.g.h("BillingClient");
                }
            } finally {
                r(3);
            }
        }
    }

    @Override // defpackage.es5
    public final void d(final fs5 fs5Var) {
        if (!e()) {
            int i = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            ns5 ns5Var = fe91.k;
            B(2, 13, ns5Var);
            fs5Var.b(ns5Var, null);
            return;
        }
        if (this.r) {
            if (k(new Callable() { // from class: com.android.billingclient.api.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzan zzanVar;
                    a aVar = a.this;
                    fs5 fs5Var2 = fs5Var;
                    aVar.getClass();
                    z991 z991Var = null;
                    try {
                        synchronized (aVar.a) {
                            zzanVar = aVar.h;
                        }
                        if (zzanVar == null) {
                            aVar.A(fs5Var2, fe91.k, 119, null);
                            return null;
                        }
                        String packageName = aVar.f.getPackageName();
                        String str = aVar.c;
                        long longValue = aVar.z.longValue();
                        Bundle bundle = new Bundle();
                        com.google.android.gms.internal.play_billing.g.b(bundle, str, longValue);
                        zzanVar.zzp(18, packageName, bundle, new zzbe(fs5Var2, aVar.g, aVar.k, z991Var));
                        return null;
                    } catch (DeadObjectException e) {
                        aVar.A(fs5Var2, fe91.k, 62, e);
                        return null;
                    } catch (Exception e2) {
                        aVar.A(fs5Var2, fe91.i, 62, e2);
                        return null;
                    }
                }
            }, 30000L, new vjb1(this, fs5Var), y(), o()) == null) {
                ns5 l = l();
                B(25, 13, l);
                fs5Var.b(l, null);
                return;
            }
            return;
        }
        int i2 = com.google.android.gms.internal.play_billing.g.a;
        Log.isLoggable("BillingClient", 5);
        ns5 ns5Var2 = fe91.r;
        B(32, 13, ns5Var2);
        fs5Var.b(ns5Var2, null);
    }

    @Override // defpackage.es5
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.b == 2 && this.h != null && this.i != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x047a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03db  */
    @Override // defpackage.es5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ns5 f(Activity activity, final kzo kzoVar) {
        String str;
        String str2;
        Future k;
        int i;
        Object obj;
        int c;
        String string;
        boolean z;
        String str3;
        String str4;
        String str5;
        ks5 ks5Var;
        boolean z2;
        String str6;
        int i2;
        final int i3;
        if (this.e == null || this.e.b == null) {
            ns5 ns5Var = fe91.t;
            B(12, 2, ns5Var);
            return ns5Var;
        }
        if (!e()) {
            ns5 ns5Var2 = fe91.k;
            B(2, 2, ns5Var2);
            D(ns5Var2);
            return ns5Var2;
        }
        ArrayList F = kzoVar.F();
        zzco G = kzoVar.G();
        b64.D(ita1.f(F));
        ks5 ks5Var2 = (ks5) ita1.f(G);
        String b = ks5Var2.a().b();
        String c2 = ks5Var2.a().c();
        if (c2.equals("subs") && !this.j) {
            int i4 = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            ns5 ns5Var3 = fe91.m;
            B(9, 2, ns5Var3);
            D(ns5Var3);
            return ns5Var3;
        }
        if (kzoVar.H() && !this.l) {
            int i5 = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            ns5 ns5Var4 = fe91.g;
            B(18, 2, ns5Var4);
            D(ns5Var4);
            return ns5Var4;
        }
        if (F.size() > 1 && !this.p) {
            int i6 = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            ns5 ns5Var5 = fe91.o;
            B(19, 2, ns5Var5);
            D(ns5Var5);
            return ns5Var5;
        }
        if (!G.isEmpty() && !this.q) {
            int i7 = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            ns5 ns5Var6 = fe91.q;
            B(20, 2, ns5Var6);
            D(ns5Var6);
            return ns5Var6;
        }
        ns5 z3 = kzoVar.z();
        if (z3 != fe91.j) {
            B(120, 2, z3);
            D(z3);
            return z3;
        }
        if (this.l) {
            boolean z4 = this.m;
            this.v.getClass();
            this.v.getClass();
            boolean z5 = this.w;
            String str7 = this.c;
            long longValue = this.z.longValue();
            String packageName = this.f.getPackageName();
            final Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.g.b(bundle, str7, longValue);
            if (kzoVar.y() != 0) {
                bundle.putInt("prorationMode", kzoVar.y());
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("obfuscatedProfileId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(kzoVar.C())) {
                bundle.putString("oldSkuPurchaseToken", kzoVar.C());
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            kzoVar.E();
            if (!TextUtils.isEmpty(null)) {
                kzoVar.E();
                bundle.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("paymentsPurchaseParams", null);
            }
            if (z4) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z5) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            if (kzoVar.G().stream().anyMatch(new Predicate() { // from class: u391
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    int i8 = g.a;
                    return false;
                }
            })) {
                zt91 r = k.r();
                r.f((Iterable) kzoVar.G().stream().filter(new Predicate() { // from class: j891
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        int i8 = g.a;
                        return false;
                    }
                }).map(new rd61(1, packageName)).collect(zzco.q()));
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((k) r.d()).d());
            }
            if (F.isEmpty()) {
                str3 = c2;
                ArrayList<String> arrayList = new ArrayList<>(G.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(G.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                str4 = b;
                ArrayList<String> arrayList5 = new ArrayList<>();
                str = "BUY_INTENT";
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                str5 = "proxyPackageVersion";
                for (int i8 = 0; i8 < G.size(); i8++) {
                    ks5 ks5Var3 = (ks5) G.get(i8);
                    t7f0 a = ks5Var3.a();
                    if (a.e().isEmpty()) {
                        ks5Var = ks5Var3;
                    } else {
                        ks5Var = ks5Var3;
                        arrayList3.add(a.e());
                    }
                    arrayList4.add(ks5Var.b());
                    String f = a.f();
                    if (a.g() != null && !a.g().isEmpty()) {
                        Iterator it = a.g().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            q7f0 q7f0Var = (q7f0) it.next();
                            if (!TextUtils.isEmpty(q7f0Var.a())) {
                                f = q7f0Var.a();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(f)) {
                        arrayList5.add(f);
                    }
                    if (i8 > 0) {
                        arrayList.add(((ks5) G.get(i8)).a().b());
                        arrayList2.add(((ks5) G.get(i8)).a().c());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList6);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = F.iterator();
                if (it2.hasNext()) {
                    b64.D(it2.next());
                    throw null;
                }
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (F.size() > 1) {
                    ArrayList<String> arrayList8 = new ArrayList<>(F.size() - 1);
                    ArrayList<String> arrayList9 = new ArrayList<>(F.size() - 1);
                    str3 = c2;
                    if (1 < F.size()) {
                        b64.D(F.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList8);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList9);
                } else {
                    str3 = c2;
                }
                str5 = "proxyPackageVersion";
                str4 = b;
                str = "BUY_INTENT";
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.n) {
                ns5 ns5Var7 = fe91.p;
                B(21, 2, ns5Var7);
                D(ns5Var7);
                return ns5Var7;
            }
            if (TextUtils.isEmpty(ks5Var2.a().d())) {
                z2 = false;
            } else {
                bundle.putString("skuPackageName", ks5Var2.a().d());
                z2 = true;
            }
            if (TextUtils.isEmpty(null)) {
                str2 = null;
            } else {
                str2 = null;
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                Log.isLoggable("BillingClient", 5);
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    str6 = str5;
                    try {
                        bundle.putString(str6, this.f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused) {
                        bundle.putString(str6, "package not found");
                        if (!this.q) {
                        }
                        if (!this.o) {
                        }
                        if (this.m) {
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    str6 = str5;
                }
            }
            if (!this.q && !G.isEmpty()) {
                i2 = 17;
            } else if (!this.o && z2) {
                i2 = 15;
            } else if (this.m) {
                i2 = 6;
            } else {
                i3 = 9;
                final String str8 = str4;
                final String str9 = str3;
                k = k(new Callable(i3, str8, str9, kzoVar, bundle) { // from class: z691
                    public final /* synthetic */ int b;
                    public final /* synthetic */ String c;
                    public final /* synthetic */ String w;
                    public final /* synthetic */ Bundle x;

                    {
                        this.x = bundle;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle i9;
                        zzan zzanVar;
                        a aVar = a.this;
                        int i10 = this.b;
                        String str10 = this.c;
                        String str11 = this.w;
                        Bundle bundle2 = this.x;
                        try {
                            synchronized (aVar.a) {
                                zzanVar = aVar.h;
                            }
                            return zzanVar == null ? g.i(fe91.k, 119) : zzanVar.zzg(i10, aVar.f.getPackageName(), str10, str11, null, bundle2);
                        } catch (DeadObjectException e) {
                            ns5 ns5Var8 = fe91.k;
                            String a2 = xd91.a(e);
                            i9 = g.i(ns5Var8, 5);
                            if (a2 != null) {
                                i9.putString("ADDITIONAL_LOG_DETAILS", a2);
                            }
                            return i9;
                        } catch (Exception e2) {
                            ns5 ns5Var9 = fe91.i;
                            String a3 = xd91.a(e2);
                            i9 = g.i(ns5Var9, 5);
                            if (a3 != null) {
                                i9.putString("ADDITIONAL_LOG_DETAILS", a3);
                            }
                            return i9;
                        }
                    }
                }, 5000L, null, this.d, o());
            }
            i3 = i2;
            final String str82 = str4;
            final String str92 = str3;
            k = k(new Callable(i3, str82, str92, kzoVar, bundle) { // from class: z691
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String w;
                public final /* synthetic */ Bundle x;

                {
                    this.x = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle i9;
                    zzan zzanVar;
                    a aVar = a.this;
                    int i10 = this.b;
                    String str10 = this.c;
                    String str11 = this.w;
                    Bundle bundle2 = this.x;
                    try {
                        synchronized (aVar.a) {
                            zzanVar = aVar.h;
                        }
                        return zzanVar == null ? g.i(fe91.k, 119) : zzanVar.zzg(i10, aVar.f.getPackageName(), str10, str11, null, bundle2);
                    } catch (DeadObjectException e) {
                        ns5 ns5Var8 = fe91.k;
                        String a2 = xd91.a(e);
                        i9 = g.i(ns5Var8, 5);
                        if (a2 != null) {
                            i9.putString("ADDITIONAL_LOG_DETAILS", a2);
                        }
                        return i9;
                    } catch (Exception e2) {
                        ns5 ns5Var9 = fe91.i;
                        String a3 = xd91.a(e2);
                        i9 = g.i(ns5Var9, 5);
                        if (a3 != null) {
                            i9.putString("ADDITIONAL_LOG_DETAILS", a3);
                        }
                        return i9;
                    }
                }
            }, 5000L, null, this.d, o());
        } else {
            str = "BUY_INTENT";
            str2 = null;
            k = k(new l591(this, b, c2, 4), 5000L, null, this.d, o());
        }
        try {
            try {
                if (k == null) {
                    ns5 ns5Var8 = fe91.d;
                    B(25, 2, ns5Var8);
                    D(ns5Var8);
                    return ns5Var8;
                }
                Bundle bundle2 = (Bundle) k.get(5000L, TimeUnit.MILLISECONDS);
                int a2 = com.google.android.gms.internal.play_billing.g.a(bundle2, "BillingClient");
                String e = com.google.android.gms.internal.play_billing.g.e(bundle2, "BillingClient");
                if (a2 == 0) {
                    Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    String str10 = str;
                    intent2.putExtra(str10, (PendingIntent) bundle2.getParcelable(str10));
                    activity.startActivity(intent2);
                    return fe91.j;
                }
                Log.isLoggable("BillingClient", 5);
                ns5 a3 = fe91.a(a2, e);
                if (bundle2 != null) {
                    try {
                        obj = bundle2.get("LOG_REASON");
                    } catch (Throwable unused3) {
                        i = 5;
                    }
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            c = cya1.c(((Integer) obj).intValue());
                            if (c == 1) {
                                c = 23;
                            }
                            if (bundle2 != null) {
                                try {
                                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                                } catch (Throwable unused4) {
                                    Log.isLoggable("BillingClient", 5);
                                }
                                C(c, 2, a3, string);
                                D(a3);
                                return a3;
                            }
                            string = str2;
                            C(c, 2, a3, string);
                            D(a3);
                            return a3;
                        }
                        i = 5;
                        try {
                            Log.isLoggable("BillingClient", 5);
                        } catch (Throwable unused5) {
                            Log.isLoggable("BillingClient", i);
                            c = 1;
                            if (c == 1) {
                            }
                            if (bundle2 != null) {
                            }
                            string = str2;
                            C(c, 2, a3, string);
                            D(a3);
                            return a3;
                        }
                    }
                }
                c = 1;
                if (c == 1) {
                }
                if (bundle2 != null) {
                }
                string = str2;
                C(c, 2, a3, string);
                D(a3);
                return a3;
            } catch (CancellationException | TimeoutException e2) {
                com.google.android.gms.internal.play_billing.g.h("BillingClient");
                ns5 ns5Var9 = fe91.l;
                C(4, 2, ns5Var9, xd91.a(e2));
                D(ns5Var9);
                return ns5Var9;
            }
        } catch (Exception e3) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
            ns5 ns5Var10 = fe91.k;
            C(5, 2, ns5Var10, xd91.a(e3));
            D(ns5Var10);
            return ns5Var10;
        }
    }

    @Override // defpackage.es5
    public void g(v5c0 v5c0Var, u7f0 u7f0Var) {
        if (!e()) {
            ns5 ns5Var = fe91.k;
            B(2, 7, ns5Var);
            u7f0Var.onProductDetailsResponse(ns5Var, new ArrayList());
        } else {
            if (this.q) {
                if (k(new l591(this, v5c0Var, u7f0Var, 1), 30000L, new do91(22, this, u7f0Var), y(), o()) == null) {
                    ns5 l = l();
                    B(25, 7, l);
                    u7f0Var.onProductDetailsResponse(l, new ArrayList());
                    return;
                }
                return;
            }
            int i = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            ns5 ns5Var2 = fe91.q;
            B(20, 7, ns5Var2);
            u7f0Var.onProductDetailsResponse(ns5Var2, new ArrayList());
        }
    }

    @Override // defpackage.es5
    public final void h(ag1 ag1Var, i iVar) {
        String g = ag1Var.g();
        if (!e()) {
            ns5 ns5Var = fe91.k;
            B(2, 11, ns5Var);
            iVar.onPurchaseHistoryResponse(ns5Var, null);
        } else if (k(new l591(this, g, iVar, 3), 30000L, new uqs(22, this, iVar), y(), o()) == null) {
            ns5 l = l();
            B(25, 11, l);
            iVar.onPurchaseHistoryResponse(l, null);
        }
    }

    @Override // defpackage.es5
    public final void i(mf1 mf1Var, j0g0 j0g0Var) {
        String r = mf1Var.r();
        int i = 2;
        if (!e()) {
            ns5 ns5Var = fe91.k;
            B(2, 9, ns5Var);
            j0g0Var.onQueryPurchasesResponse(ns5Var, zzco.n());
        } else {
            if (TextUtils.isEmpty(r)) {
                int i2 = com.google.android.gms.internal.play_billing.g.a;
                Log.isLoggable("BillingClient", 5);
                ns5 ns5Var2 = fe91.f;
                B(50, 9, ns5Var2);
                j0g0Var.onQueryPurchasesResponse(ns5Var2, zzco.n());
                return;
            }
            if (k(new l591(this, r, j0g0Var, i), 30000L, new uqs(21, this, j0g0Var), y(), o()) == null) {
                ns5 l = l();
                B(25, 9, l);
                j0g0Var.onQueryPurchasesResponse(l, zzco.n());
            }
        }
    }

    @Override // defpackage.es5
    public void j(gs5 gs5Var) {
        ns5 ns5Var;
        ns5 ns5Var2;
        synchronized (this.a) {
            try {
                if (e()) {
                    ns5Var = z();
                } else {
                    if (this.b == 1) {
                        int i = com.google.android.gms.internal.play_billing.g.a;
                        Log.isLoggable("BillingClient", 5);
                        ns5Var2 = fe91.e;
                        B(37, 6, ns5Var2);
                    } else if (this.b == 3) {
                        int i2 = com.google.android.gms.internal.play_billing.g.a;
                        Log.isLoggable("BillingClient", 5);
                        ns5Var2 = fe91.k;
                        B(38, 6, ns5Var2);
                    } else {
                        r(1);
                        s();
                        com.google.android.gms.internal.play_billing.g.g("BillingClient", "Starting in-app billing setup.");
                        this.i = new zzba(this, gs5Var, null);
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
                        int i3 = 41;
                        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            i3 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    Log.isLoggable("BillingClient", 5);
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.c);
                                    synchronized (this.a) {
                                        try {
                                            if (this.b == 2) {
                                                ns5Var = z();
                                            } else if (this.b != 1) {
                                                Log.isLoggable("BillingClient", 5);
                                                ns5Var2 = fe91.k;
                                                B(HProv.PP_NK_SYNC, 6, ns5Var2);
                                            } else {
                                                zzba zzbaVar = this.i;
                                                if (this.f.bindService(intent2, zzbaVar, 1)) {
                                                    com.google.android.gms.internal.play_billing.g.g("BillingClient", "Service was bonded successfully.");
                                                    ns5Var = null;
                                                } else {
                                                    Log.isLoggable("BillingClient", 5);
                                                    i3 = 39;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                Log.isLoggable("BillingClient", 5);
                            }
                        }
                        r(0);
                        com.google.android.gms.internal.play_billing.g.g("BillingClient", "Billing service unavailable on device.");
                        ns5 ns5Var3 = fe91.c;
                        B(i3, 6, ns5Var3);
                        ns5Var = ns5Var3;
                    }
                    ns5Var = ns5Var2;
                }
            } finally {
            }
        }
        if (ns5Var != null) {
            gs5Var.onBillingSetupFinished(ns5Var);
        }
    }

    public final ns5 l() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return fe91.k;
                }
            }
            return fe91.i;
        }
    }

    public final void m() {
        if (TextUtils.isEmpty(null)) {
            this.f.getPackageName();
        }
    }

    public final synchronized ExecutorService o() {
        try {
            if (this.x == null) {
                this.x = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.g.a, new f791());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.x;
    }

    public final void p(w wVar) {
        try {
            this.g.k(wVar, this.k);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
        }
    }

    public final void q(x xVar) {
        try {
            rfw0 rfw0Var = this.g;
            int i = this.k;
            rfw0Var.getClass();
            try {
                iqa1 iqa1Var = (iqa1) ((b0) rfw0Var.a).j();
                iqa1Var.e();
                b0.r((b0) iqa1Var.b, i);
                rfw0Var.a = (b0) iqa1Var.d();
                rfw0Var.l(xVar);
            } catch (Throwable unused) {
                com.google.android.gms.internal.play_billing.g.h("BillingLogger");
            }
        } catch (Throwable unused2) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
        }
    }

    public final void r(int i) {
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                int i2 = this.b;
                com.google.android.gms.internal.play_billing.g.g("BillingClient", "Setting clientState from " + (i2 != 0 ? i2 != 1 ? i2 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s() {
        synchronized (this.a) {
            if (this.i != null) {
                try {
                    try {
                        this.f.unbindService(this.i);
                    } finally {
                        this.h = null;
                        this.i = null;
                    }
                } catch (Throwable unused) {
                    com.google.android.gms.internal.play_billing.g.h("BillingClient");
                    this.h = null;
                    this.i = null;
                }
            }
        }
    }

    public final o3 t(ns5 ns5Var, int i, Exception exc) {
        com.google.android.gms.internal.play_billing.g.h("BillingClient");
        C(i, 7, ns5Var, xd91.a(exc));
        return new o3(ns5Var.a, ns5Var.b, new ArrayList());
    }

    public final w991 u(ns5 ns5Var, int i, Exception exc) {
        com.google.android.gms.internal.play_billing.g.h("BillingClient");
        C(i, 11, ns5Var, xd91.a(exc));
        return new w991(ns5Var, null);
    }

    public final w991 v(ns5 ns5Var, int i, Exception exc) {
        C(i, 9, ns5Var, xd91.a(exc));
        com.google.android.gms.internal.play_billing.g.h("BillingClient");
        return new w991(ns5Var, null);
    }

    public final void w(fs5 fs5Var, ns5 ns5Var, int i, Exception exc) {
        com.google.android.gms.internal.play_billing.g.h("BillingClient");
        C(i, 3, ns5Var, xd91.a(exc));
        fs5Var.a(ns5Var);
    }

    public final void x(fs5 fs5Var, ns5 ns5Var, int i, Exception exc) {
        com.google.android.gms.internal.play_billing.g.h("BillingClient");
        C(i, 4, ns5Var, xd91.a(exc));
        fs5Var.c(ns5Var);
    }

    public final Handler y() {
        return Looper.myLooper() == null ? this.d : new Handler(Looper.myLooper());
    }

    public final ns5 z() {
        com.google.android.gms.internal.play_billing.g.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        uma1 u = x.u();
        u.g(6);
        wwa1 s = k0.s();
        s.f();
        u.f(s);
        q((x) u.d());
        return fe91.j;
    }

    public a(vms vmsVar, Context context, l0g0 l0g0Var) {
        String n = n();
        this.a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.k = 0;
        long nextLong = new Random().nextLong();
        this.z = Long.valueOf(nextLong);
        this.c = n;
        this.f = context.getApplicationContext();
        iqa1 v = b0.v();
        v.e();
        b0.u((b0) v.b, n);
        String packageName = this.f.getPackageName();
        v.e();
        b0.t((b0) v.b, packageName);
        v.e();
        b0.s((b0) v.b, nextLong);
        this.g = new rfw0(this.f, (b0) v.d());
        if (l0g0Var == null) {
            int i = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
        }
        this.e = new f(this.f, l0g0Var, this.g);
        this.v = vmsVar;
        this.w = false;
        this.f.getPackageName();
    }
}
