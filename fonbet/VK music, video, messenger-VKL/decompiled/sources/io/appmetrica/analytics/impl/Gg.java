package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.jw5;

/* loaded from: classes8.dex */
public final class Gg {
    public final Context a;
    public final SafePackageManager b;
    public final InterfaceC4779db c;
    public final Pc d;
    public final long e;
    public final String f;
    public final String g;

    public Gg(Context context, SafePackageManager safePackageManager, InterfaceC4779db interfaceC4779db) {
        this.a = context;
        this.b = safePackageManager;
        this.c = interfaceC4779db;
        Pc pc = new Pc(0);
        pc.a(EnumC5273wg.d, 1);
        pc.a(EnumC5273wg.c, 2);
        this.d = pc;
        this.e = TimeUnit.DAYS.toSeconds(1L);
        this.f = "com.android.vending";
        this.g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (((java.lang.Number) r7.g()).longValue() < r13.e) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5298xg a(List list) {
        C5298xg c5298xg;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C5298xg) list.get(0);
        }
        SafePackageManager safePackageManager = this.b;
        Context context = this.a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C5298xg c5298xg2 = (C5298xg) it.next();
            Pair pair = new Pair(c5298xg2, Long.valueOf(Math.abs(c5298xg2.c - seconds)));
            while (it.hasNext()) {
                C5298xg c5298xg3 = (C5298xg) it.next();
                Pair pair2 = new Pair(c5298xg3, Long.valueOf(Math.abs(c5298xg3.c - seconds)));
                if (jw5.b((Comparable) pair.j(), (Comparable) pair2.j()) > 0) {
                    pair = pair2;
                }
            }
            c5298xg = (C5298xg) pair.d();
        }
        c5298xg = null;
        if (c5298xg == null) {
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C5298xg c5298xg4 = (C5298xg) it2.next();
            while (it2.hasNext()) {
                C5298xg c5298xg5 = (C5298xg) it2.next();
                if (a(this, c5298xg4, c5298xg5) < 0) {
                    c5298xg4 = c5298xg5;
                }
            }
            c5298xg = c5298xg4;
        }
        InterfaceC4779db interfaceC4779db = this.c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C5298xg c5298xg6 = (C5298xg) it3.next();
            arrayList.add(new JSONObject().put("referrer", c5298xg6.a).put("install_timestamp_seconds", c5298xg6.c).put("click_timestamp_seconds", c5298xg6.b).put("source", c5298xg6.d.a));
        }
        interfaceC4779db.reportEvent("several_filled_referrers", jSONObject.put("candidates", vo.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c5298xg.a).put("install_timestamp_seconds", c5298xg.c).put("click_timestamp_seconds", c5298xg.b).put("source", c5298xg.d.a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c5298xg;
    }

    public /* synthetic */ Gg(Context context) {
        this(context, new SafePackageManager(), AbstractC5308y1.a());
    }

    public static final int a(Gg gg, C5298xg c5298xg, C5298xg c5298xg2) {
        int signum = Long.signum(c5298xg.c - c5298xg2.c);
        return signum == 0 ? ((Number) gg.d.a(c5298xg.d)).intValue() - ((Number) gg.d.a(c5298xg2.d)).intValue() : signum;
    }
}
