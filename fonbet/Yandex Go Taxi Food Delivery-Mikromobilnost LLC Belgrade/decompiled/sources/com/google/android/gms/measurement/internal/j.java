package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import com.google.android.gms.internal.measurement.zzdf;
import defpackage.aaa1;
import defpackage.b4b1;
import defpackage.bb1;
import defpackage.bna1;
import defpackage.cla1;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.do91;
import defpackage.eib1;
import defpackage.euy;
import defpackage.fka1;
import defpackage.goa1;
import defpackage.i0a1;
import defpackage.ieb1;
import defpackage.j5b1;
import defpackage.j691;
import defpackage.jya1;
import defpackage.kl40;
import defpackage.l1a1;
import defpackage.l1x0;
import defpackage.lxa1;
import defpackage.m8b1;
import defpackage.ma10;
import defpackage.mbs;
import defpackage.mdi0;
import defpackage.myw;
import defpackage.na3;
import defpackage.nw91;
import defpackage.o370;
import defpackage.o5a1;
import defpackage.oza1;
import defpackage.qwa1;
import defpackage.rms;
import defpackage.rvr;
import defpackage.suu0;
import defpackage.svb1;
import defpackage.tpa1;
import defpackage.tqs;
import defpackage.udq0;
import defpackage.uqa1;
import defpackage.vma1;
import defpackage.vqs;
import defpackage.vsa1;
import defpackage.vw91;
import defpackage.wia1;
import defpackage.wl91;
import defpackage.x791;
import defpackage.xka1;
import defpackage.y1a1;
import defpackage.yja1;
import defpackage.z8k0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes.dex */
public final class j extends vw91 {
    public final AtomicReference A;
    public final Object B;
    public boolean C;
    public int D;
    public cla1 E;
    public cla1 F;
    public PriorityQueue G;
    public boolean H;
    public wia1 I;
    public final AtomicLong J;
    public long K;
    public final svb1 L;
    public boolean M;
    public vma1 N;
    public SharedPreferences.OnSharedPreferenceChangeListener O;
    public vma1 P;
    public final o370 Q;
    public zzky w;
    public yja1 x;
    public final CopyOnWriteArraySet y;
    public boolean z;

    public j(g gVar) {
        super(gVar);
        this.y = new CopyOnWriteArraySet();
        this.B = new Object();
        this.C = false;
        this.D = 1;
        this.M = true;
        this.Q = new o370(this);
        this.A = new AtomicReference();
        this.I = wia1.c;
        this.K = -1L;
        this.J = new AtomicLong(0L);
        this.L = new svb1(gVar);
    }

    @Override // defpackage.vw91
    public final boolean Jg() {
        return false;
    }

    public final void Kg(wia1 wia1Var) {
        Gg();
        boolean z = (wia1Var.i(zzjk.ANALYTICS_STORAGE) && wia1Var.i(zzjk.AD_STORAGE)) || ((g) this.b).j().Pg();
        g gVar = (g) this.b;
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        aaa1Var.Gg();
        if (z != gVar.S) {
            aaa1 aaa1Var2 = gVar.z;
            g.g(aaa1Var2);
            aaa1Var2.Gg();
            gVar.S = z;
            o5a1 o5a1Var = ((g) this.b).x;
            g.e(o5a1Var);
            o5a1Var.Gg();
            Boolean valueOf = o5a1Var.Kg().contains("measurement_enabled_from_api") ? Boolean.valueOf(o5a1Var.Kg().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                Xg(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r14 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r3 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Lg(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = !z2 || this.x == null || ieb1.dh(str2);
            if (str == null) {
                str = "app";
            }
            String str3 = str;
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
            aaa1 aaa1Var = ((g) this.b).z;
            g.g(aaa1Var);
            aaa1Var.Pg(new bna1(this, str3, str2, j, bundle3, z2, z3, z));
            return;
        }
        jya1 jya1Var = ((g) this.b).E;
        g.f(jya1Var);
        synchronized (jya1Var.F) {
            try {
                if (!jya1Var.E) {
                    y1a1 y1a1Var = ((g) jya1Var.b).y;
                    g.g(y1a1Var);
                    y1a1Var.E.a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((g) jya1Var.b).w.getClass();
                    }
                    y1a1 y1a1Var2 = ((g) jya1Var.b).y;
                    g.g(y1a1Var2);
                    y1a1Var2.E.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((g) jya1Var.b).w.getClass();
                    }
                    y1a1 y1a1Var3 = ((g) jya1Var.b).y;
                    g.g(y1a1Var3);
                    y1a1Var3.E.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = jya1Var.A;
                    string2 = zzdfVar != null ? jya1Var.Ng(zzdfVar.zzb) : "Activity";
                }
                String str5 = string2;
                qwa1 qwa1Var = jya1Var.w;
                if (jya1Var.B && qwa1Var != null) {
                    jya1Var.B = false;
                    boolean equals = Objects.equals(qwa1Var.b, str5);
                    boolean equals2 = Objects.equals(qwa1Var.a, string);
                    if (equals && equals2) {
                        y1a1 y1a1Var4 = ((g) jya1Var.b).y;
                        g.g(y1a1Var4);
                        y1a1Var4.E.a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                g gVar = (g) jya1Var.b;
                y1a1 y1a1Var5 = gVar.y;
                g.g(y1a1Var5);
                y1a1Var5.H.c("Logging screen view with name, class", string == null ? "null" : string, str5);
                qwa1 qwa1Var2 = jya1Var.w == null ? jya1Var.x : jya1Var.w;
                ieb1 ieb1Var = gVar.B;
                g.e(ieb1Var);
                qwa1 qwa1Var3 = new qwa1(ieb1Var.Bh(), j, string, str5, true);
                jya1Var.w = qwa1Var3;
                jya1Var.x = qwa1Var2;
                jya1Var.C = qwa1Var3;
                gVar.D.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aaa1 aaa1Var2 = gVar.z;
                g.g(aaa1Var2);
                aaa1Var2.Pg(new z8k0(jya1Var, bundle2, qwa1Var3, qwa1Var2, elapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final void Mg() {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.Mg():void");
    }

    public final void Ng(String str, String str2, Bundle bundle) {
        Gg();
        ((g) this.b).D.getClass();
        Og(str, str2, bundle, System.currentTimeMillis());
    }

    public final void Og(String str, String str2, Bundle bundle, long j) {
        Gg();
        boolean z = true;
        if (this.x != null && !ieb1.dh(str2)) {
            z = false;
        }
        Pg(str, str2, j, bundle, true, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Pg(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        o5a1 o5a1Var;
        kl40 kl40Var;
        j691 j691Var;
        o5a1 o5a1Var2;
        o370 o370Var;
        boolean z4;
        long j2;
        boolean a;
        j jVar;
        long j3;
        int i;
        long j4;
        boolean Ng;
        ArrayList arrayList;
        int i2;
        Bundle[] bundleArr;
        String str3 = str;
        cvw.i(str3);
        cvw.l(bundle);
        Gg();
        Hg();
        g gVar = (g) this.b;
        boolean a2 = gVar.a();
        m8b1 m8b1Var = gVar.A;
        j691 j691Var2 = gVar.w;
        Context context = gVar.a;
        ieb1 ieb1Var = gVar.B;
        y1a1 y1a1Var = gVar.y;
        if (!a2) {
            g.g(y1a1Var);
            y1a1Var.G.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = gVar.l().E;
        if (list != null && !list.contains(str2)) {
            g.g(y1a1Var);
            y1a1Var.G.c("Dropping non-safelisted event. event name, origin", str2, str3);
            return;
        }
        if (!this.z) {
            this.z = true;
            try {
                try {
                    (!gVar.b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    g.g(y1a1Var);
                    y1a1Var.C.b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                g.g(y1a1Var);
                y1a1Var.F.a("Tag Manager is not found and thus will not be used");
            }
        }
        i0a1 i0a1Var = gVar.C;
        o5a1 o5a1Var3 = gVar.x;
        kl40 kl40Var2 = gVar.D;
        if (!j691Var2.Qg(null, nw91.f1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            kl40Var2.getClass();
            o5a1Var = o5a1Var3;
            kl40Var = kl40Var2;
            j691Var = j691Var2;
            Rg("auto", System.currentTimeMillis(), string, "_lgclid");
        } else {
            o5a1Var = o5a1Var3;
            kl40Var = kl40Var2;
            j691Var = j691Var2;
        }
        if (!z || ieb1.D[0].equals(str2)) {
            o5a1Var2 = o5a1Var;
        } else {
            g.e(ieb1Var);
            g.e(o5a1Var);
            o5a1Var2 = o5a1Var;
            ieb1Var.Rg(bundle, o5a1Var2.S.D());
        }
        o370 o370Var2 = this.Q;
        if (!z3 && !"_iap".equals(str2)) {
            g.e(ieb1Var);
            int i3 = 2;
            if (ieb1Var.Fh(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, str2)) {
                if (ieb1Var.Hh(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, cma1.c, cma1.d, str2)) {
                    ((g) ieb1Var.b).getClass();
                    if (ieb1Var.Ih(40, DatabaseHelper.OttTrackingTable.COLUMN_EVENT, str2)) {
                        i3 = 0;
                    }
                } else {
                    i3 = 13;
                }
            }
            if (i3 != 0) {
                g.g(y1a1Var);
                y1a1Var.B.b(i0a1Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                g.e(ieb1Var);
                ieb1.Wg(o370Var2, null, i3, "_ev", ieb1.Lg(40, str2, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        jya1 jya1Var = gVar.E;
        g.f(jya1Var);
        qwa1 Mg = jya1Var.Mg(false);
        if (Mg != null && !bundle.containsKey("_sc")) {
            Mg.d = true;
        }
        ieb1.wh(Mg, bundle, z && !z3);
        boolean equals = "am".equals(str3);
        boolean dh = ieb1.dh(str2);
        if (z) {
            o370Var = o370Var2;
            if (this.x != null && !dh) {
                if (!equals) {
                    g.g(y1a1Var);
                    y1a1Var.G.c("Passing event to registered event handler (FE)", i0a1Var.a(str2), i0a1Var.e(bundle));
                    cvw.l(this.x);
                    ((m) this.x).a(str3, str2, bundle, j);
                    return;
                }
                z4 = true;
                if (gVar.c()) {
                    return;
                }
                g.e(ieb1Var);
                g gVar2 = (g) ieb1Var.b;
                int Jh = ieb1Var.Jh(str2);
                if (Jh != 0) {
                    g.g(y1a1Var);
                    y1a1Var.B.b(i0a1Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                    String Lg = ieb1.Lg(40, str2, true);
                    int length = str2 != null ? str2.length() : 0;
                    g.e(ieb1Var);
                    ieb1.Wg(o370Var, null, Jh, "_ev", Lg, length);
                    return;
                }
                Bundle Og = ieb1Var.Og(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
                cvw.l(Og);
                g.f(jya1Var);
                String str4 = "_o";
                if (jya1Var.Mg(false) == null || !"_ae".equals(str2)) {
                    j2 = 0;
                } else {
                    g.f(m8b1Var);
                    mdi0 mdi0Var = m8b1Var.z;
                    ((g) ((m8b1) mdi0Var.d).b).D.getClass();
                    j2 = 0;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j5 = elapsedRealtime - mdi0Var.b;
                    mdi0Var.b = elapsedRealtime;
                    if (j5 > 0) {
                        ieb1Var.mh(Og, j5);
                    }
                }
                if (!"auto".equals(str3) && "_ssr".equals(str2)) {
                    String string2 = Og.getString("_ffr");
                    int i4 = suu0.a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    o5a1 o5a1Var4 = gVar2.x;
                    g.e(o5a1Var4);
                    if (Objects.equals(string2, o5a1Var4.P.o())) {
                        y1a1 y1a1Var2 = gVar2.y;
                        g.g(y1a1Var2);
                        y1a1Var2.G.a("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        o5a1 o5a1Var5 = gVar2.x;
                        g.e(o5a1Var5);
                        o5a1Var5.P.p(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    o5a1 o5a1Var6 = gVar2.x;
                    g.e(o5a1Var6);
                    String o = o5a1Var6.P.o();
                    if (!TextUtils.isEmpty(o)) {
                        Og.putString("_ffr", o);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Og);
                if (j691Var.Qg(null, nw91.U0)) {
                    g.f(m8b1Var);
                    m8b1Var.Gg();
                    a = m8b1Var.x;
                } else {
                    g.e(o5a1Var2);
                    a = o5a1Var2.M.a();
                }
                g.e(o5a1Var2);
                if (o5a1Var2.J.a() > j2 && o5a1Var2.Qg(j) && a) {
                    g.g(y1a1Var);
                    y1a1Var.H.a("Current session is expired, remove the session number, ID, and engagement time");
                    kl40Var.getClass();
                    i = 0;
                    Rg("auto", System.currentTimeMillis(), null, "_sid");
                    kl40Var.getClass();
                    Rg("auto", System.currentTimeMillis(), null, "_sno");
                    kl40Var.getClass();
                    Rg("auto", System.currentTimeMillis(), null, "_se");
                    jVar = this;
                    j3 = j2;
                    o5a1Var2.K.b(j3);
                } else {
                    jVar = this;
                    j3 = j2;
                    i = 0;
                }
                if (Og.getLong("extend_session", j3) == 1) {
                    g.g(y1a1Var);
                    y1a1Var.H.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    g.f(m8b1Var);
                    j4 = j;
                    m8b1Var.y.d(j4);
                } else {
                    j4 = j;
                }
                ArrayList arrayList3 = new ArrayList(Og.keySet());
                Collections.sort(arrayList3);
                int size = arrayList3.size();
                int i5 = i;
                while (i5 < size) {
                    String str5 = (String) arrayList3.get(i5);
                    if (str5 != null) {
                        g.e(ieb1Var);
                        Object obj = Og.get(str5);
                        arrayList = arrayList3;
                        if (obj instanceof Bundle) {
                            i2 = size;
                            Bundle[] bundleArr2 = new Bundle[1];
                            bundleArr2[i] = (Bundle) obj;
                            bundleArr = bundleArr2;
                        } else {
                            i2 = size;
                            if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList4 = (ArrayList) obj;
                                bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                            } else {
                                bundleArr = null;
                            }
                        }
                        if (bundleArr != null) {
                            Og.putParcelableArray(str5, bundleArr);
                        }
                    } else {
                        arrayList = arrayList3;
                        i2 = size;
                    }
                    i5++;
                    arrayList3 = arrayList;
                    size = i2;
                }
                int i6 = i;
                while (i6 < arrayList2.size()) {
                    Bundle bundle2 = (Bundle) arrayList2.get(i6);
                    String str6 = i6 != 0 ? "_ep" : str2;
                    String str7 = str4;
                    bundle2.putString(str7, str3);
                    if (z2) {
                        bundle2 = ieb1Var.gh(bundle2);
                    }
                    String str8 = str3;
                    Bundle bundle3 = bundle2;
                    zzbg zzbgVar = new zzbg(str6, new zzbe(bundle2), str8, j4);
                    j5b1 j6 = gVar.j();
                    j6.getClass();
                    j6.Gg();
                    j6.Hg();
                    j6.Sg();
                    c i7 = ((g) j6.b).i();
                    i7.getClass();
                    Parcel obtain = Parcel.obtain();
                    zzbh.zza(zzbgVar, obtain, i);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    if (marshall.length > 131072) {
                        y1a1 y1a1Var3 = ((g) i7.b).y;
                        g.g(y1a1Var3);
                        y1a1Var3.A.a("Event is too long for local database. Sending event directly to service");
                        Ng = false;
                    } else {
                        Ng = i7.Ng(0, marshall);
                    }
                    j6.Ug(new l1x0(j6, j6.Wg(true), Ng, zzbgVar, 2));
                    if (!z4) {
                        Iterator it = jVar.y.iterator();
                        while (it.hasNext()) {
                            ((fka1) it.next()).a(str, str2, new Bundle(bundle3), j);
                        }
                    }
                    i6++;
                    str3 = str;
                    j4 = j;
                    str4 = str7;
                    i = 0;
                }
                g.f(jya1Var);
                if (jya1Var.Mg(false) == null || !"_ae".equals(str2)) {
                    return;
                }
                g.f(m8b1Var);
                kl40Var.getClass();
                m8b1Var.z.e(SystemClock.elapsedRealtime(), true, true);
                return;
            }
        } else {
            o370Var = o370Var2;
        }
        z4 = equals;
        if (gVar.c()) {
        }
    }

    public final void Qg(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        g gVar = (g) this.b;
        if (z) {
            ieb1 ieb1Var = gVar.B;
            g.e(ieb1Var);
            i = ieb1Var.Kh(str2);
        } else {
            ieb1 ieb1Var2 = gVar.B;
            g.e(ieb1Var2);
            if (ieb1Var2.Fh("user property", str2)) {
                if (ieb1Var2.Hh("user property", bb1.d, null, str2)) {
                    ((g) ieb1Var2.b).getClass();
                    if (ieb1Var2.Ih(24, "user property", str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        o370 o370Var = this.Q;
        if (i != 0) {
            g.e(gVar.B);
            String Lg = ieb1.Lg(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            g.e(gVar.B);
            ieb1.Wg(o370Var, null, i, "_ev", Lg, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            aaa1 aaa1Var = gVar.z;
            g.g(aaa1Var);
            aaa1Var.Pg(new z8k0(this, str3, str2, (Object) null, j));
            return;
        }
        ieb1 ieb1Var3 = gVar.B;
        ieb1 ieb1Var4 = gVar.B;
        g.e(ieb1Var3);
        int Tg = ieb1Var3.Tg(obj, str2);
        if (Tg != 0) {
            g.e(ieb1Var4);
            String Lg2 = ieb1.Lg(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            g.e(ieb1Var4);
            ieb1.Wg(o370Var, null, Tg, "_ev", Lg2, length);
            return;
        }
        g.e(ieb1Var4);
        Object Ug = ieb1Var4.Ug(obj, str2);
        if (Ug != null) {
            aaa1 aaa1Var2 = gVar.z;
            g.g(aaa1Var2);
            aaa1Var2.Pg(new z8k0(this, str3, str2, Ug, j));
        }
    }

    public final void Rg(String str, long j, Object obj, String str2) {
        String str3;
        Object obj2 = obj;
        g gVar = (g) this.b;
        cvw.i(str);
        cvw.i(str2);
        Gg();
        Hg();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj2 = Long.valueOf(j2);
                    o5a1 o5a1Var = gVar.x;
                    g.e(o5a1Var);
                    o5a1Var.G.p(j2 == 1 ? "true" : "false");
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.H.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj2);
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                o5a1 o5a1Var2 = gVar.x;
                g.e(o5a1Var2);
                o5a1Var2.G.p("unset");
            } else {
                str4 = str2;
            }
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.H.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj2);
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!gVar.a()) {
            y1a1 y1a1Var3 = gVar.y;
            g.g(y1a1Var3);
            y1a1Var3.H.a("User property not set since app measurement is disabled");
            return;
        }
        if (gVar.c()) {
            zzpl zzplVar = new zzpl(str3, j, obj3, str);
            j5b1 j3 = gVar.j();
            j3.Gg();
            j3.Hg();
            j3.Sg();
            c i = ((g) j3.b).i();
            i.getClass();
            Parcel obtain = Parcel.obtain();
            boolean z = false;
            zzpm.zza(zzplVar, obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                y1a1 y1a1Var4 = ((g) i.b).y;
                g.g(y1a1Var4);
                y1a1Var4.A.a("User property too long for local database. Sending directly to service");
            } else {
                z = i.Ng(1, marshall);
            }
            j3.Ug(new l1x0(j3, j3.Wg(true), z, zzplVar, 1));
        }
    }

    public final void Sg() {
        Gg();
        Hg();
        g gVar = (g) this.b;
        if (gVar.c()) {
            j691 j691Var = gVar.w;
            ((g) j691Var.b).getClass();
            Boolean Sg = j691Var.Sg("google_analytics_deferred_deep_link_enabled");
            if (Sg != null && Sg.booleanValue()) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.G.a("Deferred Deep Link feature enabled.");
                aaa1 aaa1Var = gVar.z;
                g.g(aaa1Var);
                aaa1Var.Pg(new mbs(13, this));
            }
            j5b1 j = gVar.j();
            j.Gg();
            j.Hg();
            zzr Wg = j.Wg(true);
            j.Sg();
            g gVar2 = (g) j.b;
            gVar2.w.Qg(null, nw91.b1);
            gVar2.i().Ng(3, new byte[0]);
            j.Ug(new na3(14, j, Wg));
            this.M = false;
            o5a1 o5a1Var = gVar.x;
            g.e(o5a1Var);
            o5a1Var.Gg();
            String string = o5a1Var.Kg().getString("previous_os_version", null);
            ((g) o5a1Var.b).k().Ig();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = o5a1Var.Kg().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            gVar.k().Ig();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            Ng("auto", "_ou", bundle);
        }
    }

    public final void Tg(Bundle bundle, long j) {
        g gVar = (g) this.b;
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(CommonUrlParts.APP_ID))) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.C.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(CommonUrlParts.APP_ID);
        lxa1.h(bundle2, CommonUrlParts.APP_ID, String.class, null);
        lxa1.h(bundle2, "origin", String.class, null);
        lxa1.h(bundle2, "name", String.class, null);
        lxa1.h(bundle2, "value", Object.class, null);
        lxa1.h(bundle2, "trigger_event_name", String.class, null);
        lxa1.h(bundle2, "trigger_timeout", Long.class, 0L);
        lxa1.h(bundle2, "timed_out_event_name", String.class, null);
        lxa1.h(bundle2, "timed_out_event_params", Bundle.class, null);
        lxa1.h(bundle2, "triggered_event_name", String.class, null);
        lxa1.h(bundle2, "triggered_event_params", Bundle.class, null);
        lxa1.h(bundle2, "time_to_live", Long.class, 0L);
        lxa1.h(bundle2, "expired_event_name", String.class, null);
        lxa1.h(bundle2, "expired_event_params", Bundle.class, null);
        cvw.i(bundle2.getString("name"));
        cvw.i(bundle2.getString("origin"));
        cvw.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        ieb1 ieb1Var = gVar.B;
        i0a1 i0a1Var = gVar.C;
        y1a1 y1a1Var2 = gVar.y;
        g.e(ieb1Var);
        if (ieb1Var.Kh(string) != 0) {
            g.g(y1a1Var2);
            y1a1Var2.z.b(i0a1Var.c(string), "Invalid conditional user property name");
            return;
        }
        g.e(ieb1Var);
        if (ieb1Var.Tg(obj, string) != 0) {
            g.g(y1a1Var2);
            y1a1Var2.z.c("Invalid conditional user property value", i0a1Var.c(string), obj);
            return;
        }
        Object Ug = ieb1Var.Ug(obj, string);
        if (Ug == null) {
            g.g(y1a1Var2);
            y1a1Var2.z.c("Unable to normalize conditional user property value", i0a1Var.c(string), obj);
            return;
        }
        lxa1.g(bundle2, Ug);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            g.g(y1a1Var2);
            y1a1Var2.z.c("Invalid conditional user property timeout", i0a1Var.c(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            g.g(y1a1Var2);
            y1a1Var2.z.c("Invalid conditional user property time to live", i0a1Var.c(string), Long.valueOf(j3));
        } else {
            aaa1 aaa1Var = gVar.z;
            g.g(aaa1Var);
            aaa1Var.Pg(new goa1(this, bundle2, 0));
        }
    }

    public final void Ug(String str, String str2, Bundle bundle) {
        g gVar = (g) this.b;
        gVar.D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        cvw.i(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        aaa1Var.Pg(new do91((Object) this, (Object) bundle2, false, 25));
    }

    public final String Vg() {
        g gVar = (g) this.b;
        try {
            return udq0.Y(gVar.a, gVar.I);
        } catch (IllegalStateException e) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void Wg(wia1 wia1Var, long j, boolean z) {
        int i = wia1Var.b;
        Gg();
        Hg();
        g gVar = (g) this.b;
        o5a1 o5a1Var = gVar.x;
        y1a1 y1a1Var = gVar.y;
        g.e(o5a1Var);
        wia1 Ng = o5a1Var.Ng();
        if (j <= this.K && wia1.l(Ng.b, i)) {
            g.g(y1a1Var);
            y1a1Var.F.b(wia1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        o5a1 o5a1Var2 = gVar.x;
        g.e(o5a1Var2);
        o5a1Var2.Gg();
        if (!wia1.l(i, o5a1Var2.Kg().getInt("consent_source", 100))) {
            g.g(y1a1Var);
            y1a1Var.F.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = o5a1Var2.Kg().edit();
        edit.putString("consent_settings", wia1Var.g());
        edit.putInt("consent_source", i);
        edit.apply();
        g.g(y1a1Var);
        y1a1Var.H.b(wia1Var, "Setting storage consent(FE)");
        this.K = j;
        if (gVar.j().Qg()) {
            j5b1 j2 = gVar.j();
            j2.Gg();
            j2.Hg();
            j2.Ug(new b4b1(j2, 2));
        } else {
            j5b1 j3 = gVar.j();
            j3.Gg();
            j3.Hg();
            if (j3.Pg()) {
                j3.Ug(new oza1(j3, j3.Wg(false), 1));
            }
        }
        if (z) {
            gVar.j().Kg(new AtomicReference());
        }
    }

    public final void Xg(Boolean bool, boolean z) {
        Gg();
        Hg();
        g gVar = (g) this.b;
        y1a1 y1a1Var = gVar.y;
        g.g(y1a1Var);
        y1a1Var.G.b(bool, "Setting app measurement enabled (FE)");
        o5a1 o5a1Var = gVar.x;
        g.e(o5a1Var);
        o5a1Var.Gg();
        SharedPreferences.Editor edit = o5a1Var.Kg().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z) {
            o5a1Var.Gg();
            SharedPreferences.Editor edit2 = o5a1Var.Kg().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        aaa1Var.Gg();
        if (gVar.S || !(bool == null || bool.booleanValue())) {
            Yg();
        }
    }

    public final void Yg() {
        Gg();
        g gVar = (g) this.b;
        o5a1 o5a1Var = gVar.x;
        y1a1 y1a1Var = gVar.y;
        kl40 kl40Var = gVar.D;
        g.e(o5a1Var);
        String o = o5a1Var.G.o();
        int i = 1;
        if (o != null) {
            if ("unset".equals(o)) {
                kl40Var.getClass();
                Rg("app", System.currentTimeMillis(), null, "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(o) ? 0L : 1L);
                kl40Var.getClass();
                Rg("app", System.currentTimeMillis(), valueOf, "_npa");
            }
        }
        if (!gVar.a() || !this.M) {
            g.g(y1a1Var);
            y1a1Var.G.a("Updating Scion state (FE)");
            j5b1 j = gVar.j();
            j.Gg();
            j.Hg();
            j.Ug(new tqs((Object) j, (Object) j.Wg(true), false, 29));
            return;
        }
        g.g(y1a1Var);
        y1a1Var.G.a("Recording app launch after enabling measurement for the first time (FE)");
        Sg();
        m8b1 m8b1Var = gVar.A;
        g.f(m8b1Var);
        m8b1Var.y.b();
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        aaa1Var.Pg(new xka1(this, i));
    }

    public final void Zg() {
        g gVar = (g) this.b;
        if (!(gVar.a.getApplicationContext() instanceof Application) || this.w == null) {
            return;
        }
        ((Application) gVar.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.w);
    }

    public final void ah(Bundle bundle, int i, long j) {
        Object obj;
        String string;
        g gVar = (g) this.b;
        Hg();
        wia1 wia1Var = wia1.c;
        zzjk[] b = zzjj.STORAGE.b();
        int length = b.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            String str = b[i2].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
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
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.E.b(obj, "Ignoring invalid consent setting");
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.E.a("Valid consent values are 'granted', 'denied'");
        }
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        boolean Mg = aaa1Var.Mg();
        wia1 b2 = wia1.b(i, bundle);
        Iterator it = b2.a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((zzji) it.next()) != zzji.UNINITIALIZED) {
                ch(b2, Mg);
                break;
            }
        }
        x791 c = x791.c(i, bundle);
        Iterator it2 = c.e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((zzji) it2.next()) != zzji.UNINITIALIZED) {
                bh(c, Mg);
                break;
            }
        }
        Boolean d = x791.d(bundle);
        if (d != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (Mg) {
                Rg(str2, j, d.toString(), "allow_personalized_ads");
            } else {
                Qg(str2, "allow_personalized_ads", d.toString(), false, j);
            }
        }
    }

    public final void bh(x791 x791Var, boolean z) {
        tqs tqsVar = new tqs((Object) this, (Object) x791Var, false, 27);
        if (z) {
            Gg();
            tqsVar.run();
        } else {
            aaa1 aaa1Var = ((g) this.b).z;
            g.g(aaa1Var);
            aaa1Var.Pg(tqsVar);
        }
    }

    public final void ch(wia1 wia1Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        wia1 wia1Var2;
        Hg();
        int i = wia1Var.b;
        if (i != -10) {
            zzji zzjiVar = (zzji) wia1Var.a.get(zzjk.AD_STORAGE);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            zzji zzjiVar2 = zzji.UNINITIALIZED;
            if (zzjiVar == zzjiVar2) {
                zzji zzjiVar3 = (zzji) wia1Var.a.get(zzjk.ANALYTICS_STORAGE);
                if (zzjiVar3 == null) {
                    zzjiVar3 = zzjiVar2;
                }
                if (zzjiVar3 == zzjiVar2) {
                    y1a1 y1a1Var = ((g) this.b).y;
                    g.g(y1a1Var);
                    y1a1Var.E.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.B) {
            try {
                z2 = false;
                if (wia1.l(i, this.I.b)) {
                    wia1 wia1Var3 = this.I;
                    EnumMap enumMap = wia1Var.a;
                    zzjk[] zzjkVarArr = (zzjk[]) enumMap.keySet().toArray(new zzjk[0]);
                    int length = zzjkVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        zzjk zzjkVar = zzjkVarArr[i2];
                        zzji zzjiVar4 = (zzji) enumMap.get(zzjkVar);
                        zzji zzjiVar5 = (zzji) wia1Var3.a.get(zzjkVar);
                        zzji zzjiVar6 = zzji.DENIED;
                        if (zzjiVar4 == zzjiVar6 && zzjiVar5 != zzjiVar6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
                    if (wia1Var.i(zzjkVar2) && !this.I.i(zzjkVar2)) {
                        z2 = true;
                    }
                    wia1Var = wia1Var.k(this.I);
                    this.I = wia1Var;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                wia1Var2 = wia1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            y1a1 y1a1Var2 = ((g) this.b).y;
            g.g(y1a1Var2);
            y1a1Var2.F.b(wia1Var2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.J.getAndIncrement();
        if (z3) {
            this.A.set(null);
            uqa1 uqa1Var = new uqa1(this, wia1Var2, andIncrement, z4, 0);
            if (z) {
                Gg();
                uqa1Var.run();
                return;
            } else {
                aaa1 aaa1Var = ((g) this.b).z;
                g.g(aaa1Var);
                aaa1Var.Rg(uqa1Var);
                return;
            }
        }
        uqa1 uqa1Var2 = new uqa1(this, wia1Var2, andIncrement, z4, 1);
        if (z) {
            Gg();
            uqa1Var2.run();
        } else if (i == 30 || i == -10) {
            aaa1 aaa1Var2 = ((g) this.b).z;
            g.g(aaa1Var2);
            aaa1Var2.Rg(uqa1Var2);
        } else {
            aaa1 aaa1Var3 = ((g) this.b).z;
            g.g(aaa1Var3);
            aaa1Var3.Pg(uqa1Var2);
        }
    }

    public final void dh() {
        eib1.a();
        g gVar = (g) this.b;
        j691 j691Var = gVar.w;
        aaa1 aaa1Var = gVar.z;
        y1a1 y1a1Var = gVar.y;
        if (j691Var.Qg(null, nw91.Q0)) {
            g.g(aaa1Var);
            if (aaa1Var.Mg()) {
                g.g(y1a1Var);
                y1a1Var.z.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (rms.k()) {
                g.g(y1a1Var);
                y1a1Var.z.a("Cannot get trigger URIs from main thread");
                return;
            }
            Hg();
            g.g(y1a1Var);
            y1a1Var.H.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            g.g(aaa1Var);
            aaa1Var.Qg(atomicReference, 10000L, "get trigger URIs", new tpa1(this, atomicReference, 1));
            List list = (List) atomicReference.get();
            if (list == null) {
                g.g(y1a1Var);
                y1a1Var.B.a("Timed out waiting for get trigger URIs");
            } else {
                g.g(aaa1Var);
                aaa1Var.Pg(new tqs(28, this, list));
            }
        }
    }

    public final PriorityQueue eh() {
        if (this.G == null) {
            this.G = new PriorityQueue(Comparator.comparing(vsa1.a, rvr.A));
        }
        return this.G;
    }

    public final void fh() {
        zzoh zzohVar;
        Gg();
        this.H = false;
        if (eh().isEmpty() || this.C || (zzohVar = (zzoh) eh().poll()) == null) {
            return;
        }
        g gVar = (g) this.b;
        ieb1 ieb1Var = gVar.B;
        g.e(ieb1Var);
        if (ieb1Var.z == null) {
            ieb1Var.z = ma10.a(((g) ieb1Var.b).a);
        }
        MeasurementManagerFutures$Api33Ext5JavaImpl measurementManagerFutures$Api33Ext5JavaImpl = ieb1Var.z;
        if (measurementManagerFutures$Api33Ext5JavaImpl != null) {
            this.C = true;
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            l1a1 l1a1Var = y1a1Var.H;
            String str = zzohVar.zza;
            l1a1Var.b(str, "Registering trigger URI");
            euy f = measurementManagerFutures$Api33Ext5JavaImpl.f(Uri.parse(str));
            if (f != null) {
                vqs.d(f, new wl91(this, zzohVar), new myw(this));
            } else {
                this.C = false;
                eh().add(zzohVar);
            }
        }
    }
}
