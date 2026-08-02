package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class bf01 extends fa01 {

    @VisibleForTesting
    public af01 f;
    public gd01 g;
    public final CopyOnWriteArraySet h;
    public boolean i;
    public final AtomicReference j;
    public final Object k;
    public xwz0 l;
    public int m;
    public final AtomicLong n;
    public long o;
    public int p;
    public final op01 q;

    @VisibleForTesting
    public boolean r;
    public final com.vk.movika.sdk.base.asset.b s;

    public bf01(mb01 mb01Var) {
        super(mb01Var);
        this.h = new CopyOnWriteArraySet();
        this.k = new Object();
        this.r = true;
        this.s = new com.vk.movika.sdk.base.asset.b(this);
        this.j = new AtomicReference();
        this.l = new xwz0(null, null);
        this.m = 100;
        this.o = -1L;
        this.p = 100;
        this.n = new AtomicLong(0L);
        this.q = new op01(mb01Var);
    }

    public static /* bridge */ /* synthetic */ void E(bf01 bf01Var, xwz0 xwz0Var, xwz0 xwz0Var2) {
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 2) {
                break;
            }
            zzah zzahVar = zzahVarArr[i];
            if (!xwz0Var2.f(zzahVar) && xwz0Var.f(zzahVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean g = xwz0Var.g(xwz0Var2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || g) {
            ((mb01) bf01Var.b).o().q();
        }
    }

    public static void F(bf01 bf01Var, xwz0 xwz0Var, int i, long j, boolean z, boolean z2) {
        bf01Var.k();
        mb01 mb01Var = (mb01) bf01Var.b;
        bf01Var.l();
        if (j <= bf01Var.o) {
            int i2 = bf01Var.p;
            xwz0 xwz0Var2 = xwz0.b;
            if (i2 <= i) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.o.b(xwz0Var, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        x901 x901Var = mb01Var.i;
        mb01.i(x901Var);
        x901Var.k();
        if (!x901Var.s(i)) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.o.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = x901Var.o().edit();
        edit.putString("consent_settings", xwz0Var.e());
        edit.putInt("consent_source", i);
        edit.apply();
        bf01Var.o = j;
        bf01Var.p = i;
        yh01 s = mb01Var.s();
        s.k();
        mb01 mb01Var2 = (mb01) s.b;
        s.l();
        if (z) {
            mb01Var2.getClass();
            mb01Var2.p().p();
        }
        if (s.r()) {
            s.w(new nh01(s, s.t(false)));
        }
        if (z2) {
            mb01Var.s().B(new AtomicReference());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(long j, Object obj, String str, String str2) {
        Object obj2;
        String str3;
        boolean r;
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        exc0.f(str2);
        k();
        l();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    String lowerCase = str4.toLowerCase(Locale.ENGLISH);
                    String str5 = CredentialEntry.FALSE_STRING;
                    long j2 = true != CredentialEntry.FALSE_STRING.equals(lowerCase) ? 0L : 1L;
                    obj = Long.valueOf(j2);
                    x901 x901Var = mb01Var.i;
                    mb01.i(x901Var);
                    w901 w901Var = x901Var.o;
                    if (j2 == 1) {
                        str5 = "true";
                    }
                    w901Var.b(str5);
                    obj2 = obj;
                    str3 = "_npa";
                    if (!mb01Var.b()) {
                        k901 k901Var = mb01Var.j;
                        mb01.k(k901Var);
                        k901Var.q.a("User property not set since app measurement is disabled");
                        return;
                    }
                    if (mb01Var.h()) {
                        zzkw zzkwVar = new zzkw(j, obj2, str3, str);
                        yh01 s = mb01Var.s();
                        s.k();
                        mb01 mb01Var2 = (mb01) s.b;
                        s.l();
                        mb01Var2.getClass();
                        e901 p = mb01Var2.p();
                        p.getClass();
                        Parcel obtain = Parcel.obtain();
                        tj01.a(zzkwVar, obtain);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        if (marshall.length > 131072) {
                            k901 k901Var2 = ((mb01) p.b).j;
                            mb01.k(k901Var2);
                            k901Var2.j.a("User property too long for local database. Sending directly to service");
                            r = false;
                        } else {
                            r = p.r(1, marshall);
                        }
                        s.w(new mg01(s, s.t(true), r, zzkwVar));
                        return;
                    }
                    return;
                }
            }
            if (obj == null) {
                x901 x901Var2 = mb01Var.i;
                mb01.i(x901Var2);
                x901Var2.o.b("unset");
                obj2 = obj;
                str3 = "_npa";
                if (!mb01Var.b()) {
                }
            }
        }
        obj2 = obj;
        str3 = str2;
        if (!mb01Var.b()) {
        }
    }

    public final void B(boolean z, Boolean bool) {
        k();
        l();
        mb01 mb01Var = (mb01) this.b;
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        k901Var.p.b(bool, "Setting app measurement enabled (FE)");
        x901 x901Var = mb01Var.i;
        mb01.i(x901Var);
        x901Var.k();
        SharedPreferences.Editor edit = x901Var.o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z) {
            x901 x901Var2 = mb01Var.i;
            mb01.i(x901Var2);
            x901Var2.k();
            SharedPreferences.Editor edit2 = x901Var2.o().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.k();
        if (mb01Var.E || !(bool == null || bool.booleanValue())) {
            C();
        }
    }

    public final void C() {
        k();
        mb01 mb01Var = (mb01) this.b;
        x901 x901Var = mb01Var.i;
        k901 k901Var = mb01Var.j;
        jcl jclVar = mb01Var.o;
        mb01.i(x901Var);
        String a = x901Var.o.a();
        if (a != null) {
            if ("unset".equals(a)) {
                jclVar.getClass();
                A(System.currentTimeMillis(), null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(a) ? 0L : 1L);
                jclVar.getClass();
                A(System.currentTimeMillis(), valueOf, MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa");
            }
        }
        if (!mb01Var.b() || !this.r) {
            mb01.k(k901Var);
            k901Var.p.a("Updating Scion state (FE)");
            yh01 s = mb01Var.s();
            s.k();
            s.l();
            s.w(new i1z0(s, s.t(true)));
            return;
        }
        mb01.k(k901Var);
        k901Var.p.a("Recording app launch after enabling measurement for the first time (FE)");
        G();
        zzof.zzc();
        if (mb01Var.h.t(null, s701.d0)) {
            fj01 fj01Var = mb01Var.l;
            mb01.j(fj01Var);
            fj01Var.g.a();
        }
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.s(new md01(this));
    }

    public final String D() {
        return (String) this.j.get();
    }

    public final void G() {
        k();
        l();
        mb01 mb01Var = (mb01) this.b;
        boolean h = mb01Var.h();
        kwz0 kwz0Var = mb01Var.h;
        if (h) {
            if (kwz0Var.t(null, s701.X)) {
                ((mb01) kwz0Var.b).getClass();
                Boolean s = kwz0Var.s("google_analytics_deferred_deep_link_enabled");
                if (s != null && s.booleanValue()) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.p.a("Deferred Deep Link feature enabled.");
                    kb01 kb01Var = mb01Var.k;
                    mb01.k(kb01Var);
                    kb01Var.s(new wq4(this, 1));
                }
            }
            yh01 s2 = mb01Var.s();
            s2.k();
            s2.l();
            com.google.android.gms.measurement.internal.zzq t = s2.t(true);
            ((mb01) s2.b).p().r(3, new byte[0]);
            s2.w(new ob01(s2, t, 1));
            this.r = false;
            x901 x901Var = mb01Var.i;
            mb01.i(x901Var);
            x901Var.k();
            String string = x901Var.o().getString("previous_os_version", null);
            ((mb01) x901Var.b).n().m();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = x901Var.o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            mb01Var.n().m();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            r("auto", "_ou", bundle);
        }
    }

    @Override // xsna.fa01
    public final boolean n() {
        return false;
    }

    public final void o(String str, String str2, Bundle bundle) {
        mb01 mb01Var = (mb01) this.b;
        mb01Var.o.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        exc0.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.s(new oe01(this, bundle2));
    }

    public final void p() {
        mb01 mb01Var = (mb01) this.b;
        if (!(mb01Var.b.getApplicationContext() instanceof Application) || this.f == null) {
            return;
        }
        ((Application) mb01Var.b.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f1, code lost:
    
        if (r6 > 100) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0126, code lost:
    
        if (r7 > 100) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            boolean z3 = !z2 || this.g == null || sk01.T(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            kb01 kb01Var = ((mb01) this.b).k;
            mb01.k(kb01Var);
            kb01Var.s(new ke01(this, str3, str2, j, bundle3, z2, z3, z));
            return;
        }
        kg01 kg01Var = ((mb01) this.b).p;
        mb01.j(kg01Var);
        synchronized (kg01Var.o) {
            try {
                if (!kg01Var.n) {
                    k901 k901Var = ((mb01) kg01Var.b).j;
                    mb01.k(k901Var);
                    k901Var.n.a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((mb01) kg01Var.b).getClass();
                    }
                    k901 k901Var2 = ((mb01) kg01Var.b).j;
                    mb01.k(k901Var2);
                    k901Var2.n.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((mb01) kg01Var.b).getClass();
                    }
                    k901 k901Var3 = ((mb01) kg01Var.b).j;
                    mb01.k(k901Var3);
                    k901Var3.n.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    Activity activity = kg01Var.j;
                    string2 = activity != null ? kg01Var.r(activity.getClass()) : "Activity";
                }
                String str5 = string2;
                dg01 dg01Var = kg01Var.f;
                if (kg01Var.k && dg01Var != null) {
                    kg01Var.k = false;
                    boolean f = c2f0.f(dg01Var.b, str5);
                    boolean f2 = c2f0.f(dg01Var.a, string);
                    if (f && f2) {
                        k901 k901Var4 = ((mb01) kg01Var.b).j;
                        mb01.k(k901Var4);
                        k901Var4.n.a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                k901 k901Var5 = ((mb01) kg01Var.b).j;
                mb01.k(k901Var5);
                k901Var5.q.c("Logging screen view with name, class", string == null ? "null" : string, str5 == null ? "null" : str5);
                dg01 dg01Var2 = kg01Var.f == null ? kg01Var.g : kg01Var.f;
                sk01 sk01Var = ((mb01) kg01Var.b).m;
                mb01.i(sk01Var);
                dg01 dg01Var3 = new dg01(string, sk01Var.j0(), j, str5, true);
                kg01Var.f = dg01Var3;
                kg01Var.g = dg01Var2;
                kg01Var.l = dg01Var3;
                ((mb01) kg01Var.b).o.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                kb01 kb01Var2 = ((mb01) kg01Var.b).k;
                mb01.k(kb01Var2);
                kb01Var2.s(new eg01(kg01Var, bundle2, dg01Var3, dg01Var2, elapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(String str, String str2, Bundle bundle) {
        k();
        ((mb01) this.b).o.getClass();
        s(str, str2, bundle, System.currentTimeMillis());
    }

    public final void s(String str, String str2, Bundle bundle, long j) {
        k();
        boolean z = true;
        if (this.g != null && !sk01.T(str2)) {
            z = false;
        }
        t(str, str2, j, bundle, true, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Object obj;
        bf01 bf01Var;
        jcl jclVar;
        k901 k901Var;
        sk01 sk01Var;
        mb01 mb01Var;
        boolean z4;
        sk01 sk01Var2;
        dg01 q;
        boolean equals;
        long j2;
        boolean z5;
        kg01 kg01Var;
        String str3;
        long j3;
        bf01 bf01Var2;
        sk01 sk01Var3;
        k901 k901Var2;
        long j4;
        long j5;
        int size;
        int i;
        boolean z6;
        int i2;
        sk01 sk01Var4;
        boolean r;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i3;
        Object[] objArr;
        String str4 = str;
        exc0.f(str4);
        exc0.i(bundle);
        k();
        l();
        mb01 mb01Var2 = (mb01) this.b;
        boolean b = mb01Var2.b();
        Context context = mb01Var2.b;
        fj01 fj01Var = mb01Var2.l;
        kg01 kg01Var2 = mb01Var2.p;
        f901 f901Var = mb01Var2.n;
        x901 x901Var = mb01Var2.i;
        jcl jclVar2 = mb01Var2.o;
        k901 k901Var3 = mb01Var2.j;
        sk01 sk01Var5 = mb01Var2.m;
        if (!b) {
            mb01.k(k901Var3);
            k901Var3.p.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = mb01Var2.o().l;
        if (list != null && !list.contains(str2)) {
            mb01.k(k901Var3);
            k901Var3.p.c("Dropping non-safelisted event. event name, origin", str2, str4);
            return;
        }
        if (this.i) {
            obj = null;
        } else {
            this.i = true;
            try {
                Class<?> cls = !mb01Var2.f ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                try {
                    objArr = new Object[]{context};
                    obj = null;
                } catch (Exception e) {
                    e = e;
                    obj = null;
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, objArr);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        mb01.k(k901Var3);
                        k901Var3.l.b(e, "Failed to invoke Tag Manager's initialize() method");
                    } catch (ClassNotFoundException unused) {
                        mb01.k(k901Var3);
                        k901Var3.o.a("Tag Manager is not found and thus will not be used");
                        if ("_cmp".equals(str2)) {
                        }
                        bf01Var = this;
                        jclVar = jclVar2;
                        k901Var = k901Var3;
                        sk01Var = sk01Var5;
                        mb01Var = mb01Var2;
                        z4 = true;
                        if (z) {
                        }
                        sk01Var2 = sk01Var;
                        com.vk.movika.sdk.base.asset.b bVar = bf01Var.s;
                        if (!z3) {
                        }
                        k901 k901Var4 = k901Var;
                        mb01.j(kg01Var2);
                        q = kg01Var2.q(false);
                        if (q != null) {
                        }
                        sk01.w(q, bundle, (z || z3) ? false : z4);
                        equals = "am".equals(str4);
                        boolean T = sk01.T(str2);
                        if (z) {
                        }
                        j2 = j;
                        z5 = equals;
                        if (mb01Var.h()) {
                        }
                    }
                    if ("_cmp".equals(str2)) {
                    }
                    bf01Var = this;
                    jclVar = jclVar2;
                    k901Var = k901Var3;
                    sk01Var = sk01Var5;
                    mb01Var = mb01Var2;
                    z4 = true;
                    if (z) {
                    }
                    sk01Var2 = sk01Var;
                    com.vk.movika.sdk.base.asset.b bVar2 = bf01Var.s;
                    if (!z3) {
                        mb01.i(sk01Var2);
                        i3 = 2;
                        if (sk01Var2.P(NotificationCompat.CATEGORY_EVENT, str2)) {
                        }
                        if (i3 != 0) {
                        }
                    }
                    k901 k901Var42 = k901Var;
                    mb01.j(kg01Var2);
                    q = kg01Var2.q(false);
                    if (q != null) {
                        q.d = z4;
                    }
                    sk01.w(q, bundle, (z || z3) ? false : z4);
                    equals = "am".equals(str4);
                    boolean T2 = sk01.T(str2);
                    if (z) {
                    }
                    j2 = j;
                    z5 = equals;
                    if (mb01Var.h()) {
                    }
                }
            } catch (ClassNotFoundException unused2) {
                obj = null;
            }
        }
        if ("_cmp".equals(str2) || !bundle.containsKey("gclid")) {
            bf01Var = this;
            jclVar = jclVar2;
            k901Var = k901Var3;
            sk01Var = sk01Var5;
            mb01Var = mb01Var2;
            z4 = true;
        } else {
            String string = bundle.getString("gclid");
            jclVar2.getClass();
            jclVar = jclVar2;
            mb01Var = mb01Var2;
            sk01Var = sk01Var5;
            z4 = true;
            k901Var = k901Var3;
            A(System.currentTimeMillis(), string, "auto", "_lgclid");
            bf01Var = this;
        }
        if (z || sk01.k[0].equals(str2)) {
            sk01Var2 = sk01Var;
        } else {
            mb01.i(sk01Var);
            mb01.i(x901Var);
            sk01Var2 = sk01Var;
            sk01Var2.x(bundle, x901Var.z.a());
        }
        com.vk.movika.sdk.base.asset.b bVar22 = bf01Var.s;
        if (!z3 && !"_iap".equals(str2)) {
            mb01.i(sk01Var2);
            i3 = 2;
            if (sk01Var2.P(NotificationCompat.CATEGORY_EVENT, str2)) {
                if (sk01Var2.L(yiz.e, yiz.f, NotificationCompat.CATEGORY_EVENT, str2)) {
                    ((mb01) sk01Var2.b).getClass();
                    if (sk01Var2.K(40, NotificationCompat.CATEGORY_EVENT, str2)) {
                        i3 = 0;
                    }
                } else {
                    i3 = 13;
                }
            }
            if (i3 != 0) {
                mb01.k(k901Var);
                k901Var.k.b(f901Var.d(str2), "Invalid public event name. Event will not be logged (FE)");
                mb01.i(sk01Var2);
                String q2 = sk01.q(40, str2, z4);
                int length = str2 != null ? str2.length() : 0;
                mb01.i(sk01Var2);
                sk01.z(bVar22, null, i3, "_ev", q2, length);
                return;
            }
        }
        k901 k901Var422 = k901Var;
        mb01.j(kg01Var2);
        q = kg01Var2.q(false);
        if (q != null && !bundle.containsKey("_sc")) {
            q.d = z4;
        }
        sk01.w(q, bundle, (z || z3) ? false : z4);
        equals = "am".equals(str4);
        boolean T22 = sk01.T(str2);
        if (z || bf01Var.g == null || T22) {
            j2 = j;
            z5 = equals;
        } else {
            if (!equals) {
                mb01.k(k901Var422);
                k901Var422.p.c("Passing event to registered event handler (FE)", f901Var.d(str2), f901Var.b(bundle));
                exc0.i(bf01Var.g);
                ((fh9) bf01Var.g).e(str4, str2, bundle, j);
                return;
            }
            j2 = j;
            z5 = true;
        }
        if (mb01Var.h()) {
            mb01.i(sk01Var2);
            int d0 = sk01Var2.d0(str2);
            if (d0 != 0) {
                mb01.k(k901Var422);
                k901Var422.k.b(f901Var.d(str2), "Invalid event name. Event will not be logged (FE)");
                mb01.i(sk01Var2);
                String q3 = sk01.q(40, str2, true);
                int length2 = str2 != null ? str2.length() : 0;
                mb01.i(sk01Var2);
                sk01.z(bVar22, null, d0, "_ev", q3, length2);
                return;
            }
            List unmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
            mb01.i(sk01Var2);
            Bundle m0 = sk01Var2.m0(str2, bundle, unmodifiableList, z3);
            exc0.i(m0);
            mb01.j(kg01Var2);
            boolean z7 = z5;
            if (kg01Var2.q(false) == null || !"_ae".equals(str2)) {
                kg01Var = kg01Var2;
                str3 = "_o";
                j3 = 0;
            } else {
                mb01.j(fj01Var);
                dj01 dj01Var = fj01Var.h;
                ((mb01) dj01Var.d.b).o.getClass();
                j3 = 0;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                kg01Var = kg01Var2;
                str3 = "_o";
                long j6 = elapsedRealtime - dj01Var.b;
                dj01Var.b = elapsedRealtime;
                if (j6 > 0) {
                    mb01.i(sk01Var2);
                    sk01Var2.u(m0, j6);
                }
            }
            zznw.zzc();
            mb01 mb01Var3 = mb01Var;
            if (mb01Var3.h.t(null, s701.c0)) {
                if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                    mb01.i(sk01Var2);
                    mb01 mb01Var4 = (mb01) sk01Var2.b;
                    String string2 = m0.getString("_ffr");
                    int i4 = vqm0.a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    x901 x901Var2 = mb01Var4.i;
                    mb01.i(x901Var2);
                    String a = x901Var2.w.a();
                    if (string2 == a || (string2 != null && string2.equals(a))) {
                        k901 k901Var5 = mb01Var4.j;
                        mb01.k(k901Var5);
                        k901Var5.p.a("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        x901 x901Var3 = mb01Var4.i;
                        mb01.i(x901Var3);
                        x901Var3.w.b(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    mb01.i(sk01Var2);
                    x901 x901Var4 = ((mb01) sk01Var2.b).i;
                    mb01.i(x901Var4);
                    String a2 = x901Var4.w.a();
                    if (!TextUtils.isEmpty(a2)) {
                        m0.putString("_ffr", a2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(m0);
            mb01.i(x901Var);
            if (x901Var.q.a() > j3) {
                mb01.i(x901Var);
                if (x901Var.r(j2)) {
                    mb01.i(x901Var);
                    if (x901Var.t.b()) {
                        mb01.k(k901Var422);
                        k901Var422.q.a("Current session is expired, remove the session number, ID, and engagement time");
                        jclVar.getClass();
                        k901Var2 = k901Var422;
                        sk01Var3 = sk01Var2;
                        A(System.currentTimeMillis(), null, "auto", "_sid");
                        jclVar.getClass();
                        A(System.currentTimeMillis(), null, "auto", "_sno");
                        jclVar.getClass();
                        A(System.currentTimeMillis(), null, "auto", "_se");
                        bf01Var2 = this;
                        mb01.i(x901Var);
                        j4 = j3;
                        x901Var.r.b(j4);
                        if (m0.getLong("extend_session", j4) != 1) {
                            mb01.k(k901Var2);
                            k901Var2.q.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                            mb01.j(fj01Var);
                            j5 = j;
                            fj01Var.g.b(j5, true);
                        } else {
                            j5 = j;
                        }
                        ArrayList arrayList3 = new ArrayList(m0.keySet());
                        Collections.sort(arrayList3);
                        size = arrayList3.size();
                        i = 0;
                        while (i < size) {
                            String str5 = (String) arrayList3.get(i);
                            if (str5 != null) {
                                mb01.i(sk01Var3);
                                Object obj2 = m0.get(str5);
                                if (obj2 instanceof Bundle) {
                                    arrayList = arrayList3;
                                    bundleArr = new Bundle[]{(Bundle) obj2};
                                } else {
                                    arrayList = arrayList3;
                                    if (obj2 instanceof Parcelable[]) {
                                        Parcelable[] parcelableArr = (Parcelable[]) obj2;
                                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                                    } else if (obj2 instanceof ArrayList) {
                                        ArrayList arrayList4 = (ArrayList) obj2;
                                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                                    } else {
                                        bundleArr = null;
                                    }
                                }
                                if (bundleArr != null) {
                                    m0.putParcelableArray(str5, bundleArr);
                                }
                            } else {
                                arrayList = arrayList3;
                            }
                            i++;
                            arrayList3 = arrayList;
                        }
                        z6 = false;
                        i2 = 0;
                        while (i2 < arrayList2.size()) {
                            Bundle bundle2 = (Bundle) arrayList2.get(i2);
                            String str6 = i2 != 0 ? "_ep" : str2;
                            String str7 = str3;
                            bundle2.putString(str7, str4);
                            if (z2) {
                                mb01.i(sk01Var3);
                                sk01Var4 = sk01Var3;
                                bundle2 = sk01Var4.l0(bundle2);
                            } else {
                                sk01Var4 = sk01Var3;
                            }
                            Bundle bundle3 = bundle2;
                            String str8 = str4;
                            boolean z8 = z6;
                            zzaw zzawVar = new zzaw(str6, new zzau(bundle2), str8, j5);
                            yh01 s = mb01Var3.s();
                            s.getClass();
                            mb01 mb01Var5 = (mb01) s.b;
                            s.k();
                            s.l();
                            mb01Var5.getClass();
                            e901 p = mb01Var5.p();
                            p.getClass();
                            Parcel obtain = Parcel.obtain();
                            k001.a(zzawVar, obtain, z8 ? 1 : 0);
                            byte[] marshall = obtain.marshall();
                            obtain.recycle();
                            if (marshall.length > 131072) {
                                k901 k901Var6 = ((mb01) p.b).j;
                                mb01.k(k901Var6);
                                k901Var6.j.a("Event is too long for local database. Sending event directly to service");
                                r = z8 ? 1 : 0;
                            } else {
                                r = p.r(z8 ? 1 : 0, marshall);
                            }
                            s.w(new oh01(s, s.t(true), r, zzawVar));
                            if (!z7) {
                                Iterator it = bf01Var2.h.iterator();
                                while (it.hasNext()) {
                                    ((hd01) it.next()).a(str, str2, new Bundle(bundle3), j);
                                }
                            }
                            i2++;
                            j5 = j;
                            z6 = z8 ? 1 : 0;
                            str3 = str7;
                            sk01Var3 = sk01Var4;
                            str4 = str;
                        }
                        mb01.j(kg01Var);
                        if (kg01Var.q(z6) == null && "_ae".equals(str2)) {
                            mb01.j(fj01Var);
                            jclVar.getClass();
                            fj01Var.h.a(SystemClock.elapsedRealtime(), true, true);
                            return;
                        }
                    }
                }
            }
            bf01Var2 = this;
            sk01Var3 = sk01Var2;
            k901Var2 = k901Var422;
            j4 = j3;
            if (m0.getLong("extend_session", j4) != 1) {
            }
            ArrayList arrayList32 = new ArrayList(m0.keySet());
            Collections.sort(arrayList32);
            size = arrayList32.size();
            i = 0;
            while (i < size) {
            }
            z6 = false;
            i2 = 0;
            while (i2 < arrayList2.size()) {
            }
            mb01.j(kg01Var);
            if (kg01Var.q(z6) == null) {
            }
        }
    }

    public final void u(long j, boolean z) {
        k();
        l();
        mb01 mb01Var = (mb01) this.b;
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        k901Var.p.a("Resetting analytics data (FE)");
        fj01 fj01Var = mb01Var.l;
        mb01.j(fj01Var);
        fj01Var.k();
        dj01 dj01Var = fj01Var.h;
        dj01Var.c.a();
        dj01Var.a = 0L;
        dj01Var.b = 0L;
        zzpd.zzc();
        kwz0 kwz0Var = mb01Var.h;
        if (kwz0Var.t(null, s701.i0)) {
            mb01Var.o().q();
        }
        boolean b = mb01Var.b();
        x901 x901Var = mb01Var.i;
        mb01.i(x901Var);
        mb01 mb01Var2 = (mb01) x901Var.b;
        x901Var.h.b(j);
        x901 x901Var2 = mb01Var2.i;
        kwz0 kwz0Var2 = mb01Var2.h;
        mb01.i(x901Var2);
        if (!TextUtils.isEmpty(x901Var2.w.a())) {
            x901Var.w.b(null);
        }
        zzof.zzc();
        r701 r701Var = s701.d0;
        if (kwz0Var2.t(null, r701Var)) {
            x901Var.q.b(0L);
        }
        x901Var.r.b(0L);
        if (!kwz0Var2.w()) {
            x901Var.q(!b);
        }
        x901Var.x.b(null);
        x901Var.y.b(0L);
        x901Var.z.b(null);
        if (z) {
            yh01 s = mb01Var.s();
            s.k();
            mb01 mb01Var3 = (mb01) s.b;
            s.l();
            com.google.android.gms.measurement.internal.zzq t = s.t(false);
            mb01Var3.getClass();
            mb01Var3.p().p();
            s.w(new lb01(s, t, 1));
        }
        zzof.zzc();
        if (kwz0Var.t(null, r701Var)) {
            mb01.j(fj01Var);
            fj01Var.g.a();
        }
        this.r = !b;
    }

    public final void v(Bundle bundle, long j) {
        mb01 mb01Var = (mb01) this.b;
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.l.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        k15.C(bundle2, "app_id", String.class, null);
        k15.C(bundle2, "origin", String.class, null);
        k15.C(bundle2, "name", String.class, null);
        k15.C(bundle2, "value", Object.class, null);
        k15.C(bundle2, "trigger_event_name", String.class, null);
        k15.C(bundle2, "trigger_timeout", Long.class, 0L);
        k15.C(bundle2, "timed_out_event_name", String.class, null);
        k15.C(bundle2, "timed_out_event_params", Bundle.class, null);
        k15.C(bundle2, "triggered_event_name", String.class, null);
        k15.C(bundle2, "triggered_event_params", Bundle.class, null);
        k15.C(bundle2, "time_to_live", Long.class, 0L);
        k15.C(bundle2, "expired_event_name", String.class, null);
        k15.C(bundle2, "expired_event_params", Bundle.class, null);
        exc0.f(bundle2.getString("name"));
        exc0.f(bundle2.getString("origin"));
        exc0.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        sk01 sk01Var = mb01Var.m;
        sk01 sk01Var2 = mb01Var.m;
        f901 f901Var = mb01Var.n;
        k901 k901Var2 = mb01Var.j;
        mb01.i(sk01Var);
        if (sk01Var.g0(string) != 0) {
            mb01.k(k901Var2);
            k901Var2.i.b(f901Var.f(string), "Invalid conditional user property name");
            return;
        }
        mb01.i(sk01Var2);
        if (sk01Var2.c0(obj, string) != 0) {
            mb01.k(k901Var2);
            k901Var2.i.c("Invalid conditional user property value", f901Var.f(string), obj);
            return;
        }
        mb01.i(sk01Var2);
        Object p = sk01Var2.p(obj, string);
        if (p == null) {
            mb01.k(k901Var2);
            k901Var2.i.c("Unable to normalize conditional user property value", f901Var.f(string), obj);
            return;
        }
        k15.D(bundle2, p);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            mb01.k(k901Var2);
            k901Var2.i.c("Invalid conditional user property timeout", f901Var.f(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            mb01.k(k901Var2);
            k901Var2.i.c("Invalid conditional user property time to live", f901Var.f(string), Long.valueOf(j3));
        } else {
            kb01 kb01Var = mb01Var.k;
            mb01.k(kb01Var);
            kb01Var.s(new ne01(this, bundle2));
        }
    }

    public final void w(Bundle bundle, int i, long j) {
        Object obj;
        String string;
        mb01 mb01Var = (mb01) this.b;
        l();
        xwz0 xwz0Var = xwz0.b;
        zzah[] values = zzah.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            zzah zzahVar = values[i2];
            if (bundle.containsKey(zzahVar.zzd) && (string = bundle.getString(zzahVar.zzd)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.n.b(obj, "Ignoring invalid consent setting");
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.n.a("Valid consent values are 'granted', 'denied'");
        }
        x(xwz0.a(bundle), i, j);
    }

    public final void x(xwz0 xwz0Var, int i, long j) {
        xwz0 xwz0Var2;
        boolean z;
        boolean z2;
        xwz0 xwz0Var3;
        int i2;
        boolean z3;
        l();
        if (i != -10 && ((Boolean) xwz0Var.a.get(zzah.AD_STORAGE)) == null && ((Boolean) xwz0Var.a.get(zzah.ANALYTICS_STORAGE)) == null) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.n.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.k) {
            try {
                xwz0Var2 = this.l;
                int i3 = this.m;
                xwz0 xwz0Var4 = xwz0.b;
                boolean z4 = false;
                if (i <= i3) {
                    z = xwz0Var.g(xwz0Var2, (zzah[]) xwz0Var.a.keySet().toArray(new zzah[0]));
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    z2 = true;
                    if (xwz0Var.f(zzahVar) && !this.l.f(zzahVar)) {
                        z4 = true;
                    }
                    xwz0 d = xwz0Var.d(this.l);
                    this.l = d;
                    this.m = i;
                    boolean z5 = z4;
                    xwz0Var3 = d;
                    i2 = -10;
                    z3 = z5;
                } else {
                    z = false;
                    z2 = false;
                    xwz0Var3 = xwz0Var;
                    i2 = -10;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            k901 k901Var2 = ((mb01) this.b).j;
            mb01.k(k901Var2);
            k901Var2.o.b(xwz0Var3, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.n.getAndIncrement();
        if (z) {
            this.j.set(null);
            kb01 kb01Var = ((mb01) this.b).k;
            mb01.k(kb01Var);
            kb01Var.t(new we01(this, xwz0Var3, j, i, andIncrement, z3, xwz0Var2));
            return;
        }
        xe01 xe01Var = new xe01(this, xwz0Var3, i, andIncrement, z3, xwz0Var2);
        if (i == 30 || i == i2) {
            kb01 kb01Var2 = ((mb01) this.b).k;
            mb01.k(kb01Var2);
            kb01Var2.t(xe01Var);
        } else {
            kb01 kb01Var3 = ((mb01) this.b).k;
            mb01.k(kb01Var3);
            kb01Var3.s(xe01Var);
        }
    }

    public final void y(xwz0 xwz0Var) {
        k();
        boolean z = (xwz0Var.f(zzah.ANALYTICS_STORAGE) && xwz0Var.f(zzah.AD_STORAGE)) || ((mb01) this.b).s().r();
        mb01 mb01Var = (mb01) this.b;
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.k();
        if (z != mb01Var.E) {
            mb01 mb01Var2 = (mb01) this.b;
            kb01 kb01Var2 = mb01Var2.k;
            mb01.k(kb01Var2);
            kb01Var2.k();
            mb01Var2.E = z;
            x901 x901Var = ((mb01) this.b).i;
            mb01.i(x901Var);
            x901Var.k();
            Boolean valueOf = x901Var.o().contains("measurement_enabled_from_api") ? Boolean.valueOf(x901Var.o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                B(false, Boolean.valueOf(z));
            }
        }
    }

    public final void z(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        mb01 mb01Var = (mb01) this.b;
        String str3 = str == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : str;
        if (z) {
            sk01 sk01Var = mb01Var.m;
            mb01.i(sk01Var);
            i = sk01Var.g0(str2);
        } else {
            sk01 sk01Var2 = mb01Var.m;
            mb01.i(sk01Var2);
            if (sk01Var2.P("user property", str2)) {
                if (sk01Var2.L(fd01.a, null, "user property", str2)) {
                    ((mb01) sk01Var2.b).getClass();
                    if (sk01Var2.K(24, "user property", str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        com.vk.movika.sdk.base.asset.b bVar = this.s;
        if (i != 0) {
            mb01.i(mb01Var.m);
            String q = sk01.q(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            mb01.i(mb01Var.m);
            sk01.z(bVar, null, i, "_ev", q, length);
            return;
        }
        if (obj == null) {
            kb01 kb01Var = mb01Var.k;
            mb01.k(kb01Var);
            kb01Var.s(new le01(this, str3, str2, null, j));
            return;
        }
        sk01 sk01Var3 = mb01Var.m;
        sk01 sk01Var4 = mb01Var.m;
        mb01.i(sk01Var3);
        int c0 = sk01Var3.c0(obj, str2);
        if (c0 != 0) {
            mb01.i(sk01Var4);
            String q2 = sk01.q(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            mb01.i(sk01Var4);
            sk01.z(bVar, null, c0, "_ev", q2, length);
            return;
        }
        mb01.i(sk01Var4);
        Object p = sk01Var4.p(obj, str2);
        if (p != null) {
            kb01 kb01Var2 = mb01Var.k;
            mb01.k(kb01Var2);
            kb01Var2.s(new le01(this, str3, str2, p, j));
        }
    }
}
