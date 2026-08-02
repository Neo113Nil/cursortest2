package com.ybsdk.network.okhttp.interceptors;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.configs.HostsWithPciDss;
import defpackage.csu;
import defpackage.d5j0;
import defpackage.dj4;
import defpackage.evu0;
import defpackage.fcy0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.m8w;
import defpackage.p8w;
import defpackage.t4j0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.zci0;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class b implements p8w {
    public final HostsWithPciDss a;
    public final AppAnalyticsReporter b;
    public final dj4 c;
    public final csu d;
    public HostsWithPciDss e;
    public List g;
    public final Object f = new Object();
    public ArrayList h = d();
    public ArrayList i = e();

    public b(HostsWithPciDss hostsWithPciDss, AppAnalyticsReporter appAnalyticsReporter, dj4 dj4Var, csu csuVar) {
        this.a = hostsWithPciDss;
        this.b = appAnalyticsReporter;
        this.c = dj4Var;
        this.d = csuVar;
        this.g = dj4Var.a();
    }

    public static String f(HostsWithPciDss hostsWithPciDss, HostAvailabilityCheckInterceptor$Type hostAvailabilityCheckInterceptor$Type) {
        int i = a.a[hostAvailabilityCheckInterceptor$Type.ordinal()];
        if (i == 1) {
            return hostsWithPciDss.getRegular();
        }
        if (i == 2) {
            return hostsWithPciDss.getPciDss();
        }
        if (i == 3) {
            return hostsWithPciDss.getUz();
        }
        w511.b();
        return null;
    }

    public static String g(HostsWithPciDss hostsWithPciDss, HostAvailabilityCheckInterceptor$Type hostAvailabilityCheckInterceptor$Type) {
        String f = f(hostsWithPciDss, hostAvailabilityCheckInterceptor$Type);
        if (f != null) {
            return new URL(f).getHost();
        }
        return null;
    }

    public static d5j0 h(d5j0 d5j0Var, String str) {
        if (str == null) {
            return d5j0Var;
        }
        jwu g = d5j0Var.a.g();
        g.h(str);
        kwu e = g.e();
        t4j0 b = d5j0Var.b();
        b.a = e;
        return new d5j0(b);
    }

    public final ArrayList a() {
        List I = kotlin.collections.a.I(kotlin.collections.a.m0(this.c.a(), Collections.singletonList(this.a)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            if (!jl40.l((HostsWithPciDss) obj, this.e)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final kvj0 b(zci0 zci0Var, d5j0 d5j0Var, HostsWithPciDss hostsWithPciDss, HostAvailabilityCheckInterceptor$Type hostAvailabilityCheckInterceptor$Type) {
        fcy0 fcy0Var = this.b.m0;
        String g = g(hostsWithPciDss, hostAvailabilityCheckInterceptor$Type);
        if (g != null) {
            fcy0Var.a.a("tech.switch_to_backup_host", g8e.w(1, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, g));
            try {
                kvj0 b = zci0Var.b(h(d5j0Var, g));
                this.e = hostsWithPciDss;
                return b;
            } catch (UnknownHostException unused) {
                fcy0Var.a.a("tech.cannot_find_host", g8e.w(1, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "https://".concat(g)));
            } catch (Throwable th) {
                x4c.g("couldn't perform request", th, null, null, 12);
            }
        }
        return null;
    }

    public final HostAvailabilityCheckInterceptor$Type c(d5j0 d5j0Var) {
        return this.h.contains(d5j0Var.a.d) ? HostAvailabilityCheckInterceptor$Type.PCI_DSS : this.i.contains(d5j0Var.a.d) ? HostAvailabilityCheckInterceptor$Type.UZ : HostAvailabilityCheckInterceptor$Type.REGULAR;
    }

    public final ArrayList d() {
        ArrayList m0 = kotlin.collections.a.m0(this.g, Collections.singletonList(this.a));
        ArrayList arrayList = new ArrayList();
        Iterator it = m0.iterator();
        while (it.hasNext()) {
            String g = g((HostsWithPciDss) it.next(), HostAvailabilityCheckInterceptor$Type.PCI_DSS);
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList m0 = kotlin.collections.a.m0(this.g, Collections.singletonList(this.a));
        ArrayList arrayList = new ArrayList();
        Iterator it = m0.iterator();
        while (it.hasNext()) {
            String g = g((HostsWithPciDss) it.next(), HostAvailabilityCheckInterceptor$Type.UZ);
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    public final kvj0 i(zci0 zci0Var, d5j0 d5j0Var) {
        kvj0 b;
        List list = this.g;
        dj4 dj4Var = this.c;
        if (!jl40.l(list, dj4Var.a())) {
            this.g = dj4Var.a();
            this.h = d();
            this.i = e();
        }
        HostAvailabilityCheckInterceptor$Type c = c(d5j0Var);
        Iterator it = a().iterator();
        while (it.hasNext()) {
            kvj0 b2 = b(zci0Var, d5j0Var, (HostsWithPciDss) it.next(), c);
            if (b2 != null) {
                return b2;
            }
        }
        HostsWithPciDss hostsWithPciDss = dj4Var.d;
        if (hostsWithPciDss == null || (b = b(zci0Var, d5j0Var, hostsWithPciDss, c)) == null) {
            return null;
        }
        return b;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        HostsWithPciDss hostsWithPciDss = this.e;
        if (hostsWithPciDss != null) {
            if (this.d.a(d5j0Var.a.d)) {
                d5j0Var = h(d5j0Var, g(hostsWithPciDss, c(d5j0Var)));
            } else {
                fcy0 fcy0Var = this.b.m0;
                kwu kwuVar = d5j0Var.a;
                fcy0Var.a.a("tech.use_original_host", x4e.t(2, "request_host", kwuVar.d, "request_path", kwuVar.b()));
            }
        }
        if (!evu0.y(d5j0Var.a.b(), "v1/userinfo/v1/start_session", false)) {
            return zci0Var.b(d5j0Var);
        }
        try {
            return ((zci0) m8wVar).b(d5j0Var);
        } catch (UnknownHostException e) {
            synchronized (this.f) {
                HostsWithPciDss hostsWithPciDss2 = this.e;
                HostAvailabilityCheckInterceptor$Type c = this.c(d5j0Var);
                if (hostsWithPciDss2 != null && !jl40.l(d5j0Var.a.d, f(hostsWithPciDss2, c))) {
                    return ((zci0) m8wVar).b(h(d5j0Var, g(hostsWithPciDss2, c)));
                }
                fcy0 fcy0Var2 = this.b.m0;
                String str = "https://" + d5j0Var.a.d;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, str);
                fcy0Var2.a.a("tech.cannot_find_host", linkedHashMap);
                kvj0 i = this.i((zci0) m8wVar, d5j0Var);
                if (i != null) {
                    return i;
                }
                if (!this.a().isEmpty()) {
                    this.b.m0.a.a("tech.all_hosts_unavailable", null);
                }
                throw e;
            }
        }
    }
}
