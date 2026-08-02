package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.j5g;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4867gm {
    public final HashSet a;
    public final HashMap b;
    public final C4790dm c;
    public List d;
    public HashMap e;
    public long f;
    public boolean g;
    public long h;
    public final C4834ff i;
    public final P j;
    public final O3 k;
    public final J6 l;
    public final C4829fa m;
    public final C4803ea n;
    public final zo o;

    public C4867gm(Context context, C4834ff c4834ff) {
        this(c4834ff, new P(), new O3(), C5030n4.l().a(context), new J6(), new C4829fa(), new C4803ea(), new zo());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r8.g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z;
        boolean z2;
        try {
            boolean a = a(j5g.d0(list, AbstractC5022mm.a));
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (this.a.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
            boolean z3 = AbstractC5022mm.b.currentTimeSeconds() > this.h;
            if (a && !z2 && !z3) {
            }
            z = true;
        } finally {
        }
        return z;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            zo zoVar = this.o;
            String str = identifiersResult.id;
            zoVar.getClass();
            if (zo.a(str)) {
                this.b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        C4881ha c4881ha;
        C4834ff d = this.i.i((IdentifiersResult) this.b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.b.get("appmetrica_report_ad_url")).e(this.f).h((IdentifiersResult) this.b.get("appmetrica_clids")).j(Pm.a((Map) this.e)).f((IdentifiersResult) this.b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.b.get("appmetrica_yandex_adv_id")).b(this.g).c(this.l.d).d(this.h);
        C4829fa c4829fa = this.m;
        synchronized (c4829fa) {
            c4881ha = c4829fa.b;
        }
        d.a(c4881ha).b();
    }

    public C4867gm(C4834ff c4834ff, P p, O3 o3, Gd gd, J6 j6, C4829fa c4829fa, C4803ea c4803ea, zo zoVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = new HashMap();
        this.c = new C4790dm();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.i = c4834ff;
        this.j = p;
        this.k = o3;
        this.l = j6;
        this.m = c4829fa;
        this.n = c4803ea;
        this.o = zoVar;
        c(gd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c4834ff.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c4834ff.i());
        a("appmetrica_get_ad_url", c4834ff.d());
        a("appmetrica_report_ad_url", c4834ff.e());
        b(c4834ff.o());
        a("appmetrica_google_adv_id", c4834ff.l());
        a("appmetrica_huawei_oaid", c4834ff.m());
        a("appmetrica_yandex_adv_id", c4834ff.r());
        j6.a(c4834ff.h());
        c4829fa.a(c4834ff.k());
        this.d = c4834ff.g();
        String i = c4834ff.i((String) null);
        this.e = i != null ? Pm.a(i) : null;
        this.g = c4834ff.a(true);
        this.f = c4834ff.b(0L);
        this.h = c4834ff.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return vo.a((Map) this.e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
            return;
        }
        this.b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.l.c.get(str2);
                }
                if (identifiersResult == null) {
                    C4881ha c4881ha = this.m.b;
                    if (!epx.f(str2, "appmetrica_lib_ssl_enabled") || (bool = c4881ha.a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c4881ha.b;
                        String str3 = c4881ha.c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = CredentialEntry.FALSE_STRING;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !vo.a((Map) this.e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
