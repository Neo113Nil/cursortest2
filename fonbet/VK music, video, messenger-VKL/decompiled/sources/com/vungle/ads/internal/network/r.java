package com.vungle.ads.internal.network;

import com.vungle.ads.TpatError;
import com.vungle.ads.internal.model.c3;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.Result;
import xsna.de;
import xsna.epx;
import xsna.fpf0;
import xsna.j8y;
import xsna.s1v;
import xsna.s3q0;
import xsna.wcy;
import xsna.z23;

/* loaded from: classes7.dex */
public final class r {
    public final VungleApiClient a;
    public final Executor b;
    public final com.vungle.ads.internal.signals.j c;
    public final FilePreferences d;
    public final Object e = new Object();

    public r(VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.j jVar, com.vungle.ads.internal.executor.j jVar2, PathProvider pathProvider, com.vungle.ads.internal.signals.j jVar3) {
        this.a = vungleApiClient;
        this.b = jVar2;
        this.c = jVar3;
        this.d = FilePreferences.d.a(jVar, pathProvider, "vngFailedTpats");
    }

    public final void b() {
        for (Map.Entry entry : a().entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            p pVar = new p(str);
            pVar.g = true;
            pVar.e = Boolean.FALSE;
            pVar.c = dVar.b;
            pVar.d = dVar.c;
            pVar.h = dVar.e;
            p a = pVar.a(dVar.a);
            a.i = dVar.f;
            a(a.a(), true);
        }
    }

    public final void a(final q qVar, final boolean z) {
        final String i = qVar.i();
        com.vungle.ads.internal.signals.j jVar = this.c;
        String d = jVar != null ? jVar.d() : null;
        if (d == null) {
            d = "";
        }
        if (d.length() > 0) {
            i = z23.c(Pattern.quote("{{{session_id}}}"), i, d);
        }
        this.b.execute(new Runnable() { // from class: xsna.abz0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.network.r.a(com.vungle.ads.internal.network.r.this, qVar, i, z);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r3 < r11.e()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r0 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r3 = com.iab.omid.library.vungle.internal.l.a("tpat key: ");
        r3.append(r11.i);
        r3.append(", error: ");
        r3.append(r12.a);
        r3.append(", errorIsTerminal: ");
        r3.append(r12.b);
        r3.append(" url: ");
        r3.append(r5);
        r3 = r3.toString();
        r4 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("TpatSender", r3);
        new com.vungle.ads.TpatError(r0, r3).setLogEntry$vungle_ads_release(r11.j).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r0 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, q qVar, String str, boolean z) {
        boolean z2;
        String str2;
        c3 a;
        Boolean bool = qVar.e;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            String str3 = qVar.i;
            z2 = epx.f(str3, "checkpoint.0") || epx.f(str3, "clickUrl") || epx.f(str3, "impression") || epx.f(str3, "load_ad");
        }
        int i = 0;
        while (true) {
            str2 = str;
            a = rVar.a.a(str2, qVar.b(), qVar.a(), qVar.d(), qVar.c());
            if (!z2 || a == null || !a.b() || (i = i + 1) >= qVar.e()) {
                break;
            } else {
                str = str2;
            }
        }
        if (qVar.f()) {
            if (a == null || !a.a()) {
                if (a != null || z) {
                    synchronized (rVar.e) {
                        try {
                            Map a2 = rVar.a();
                            d dVar = (d) a2.get(qVar.i());
                            int a3 = dVar != null ? dVar.a() : 0;
                            if (a == null && a3 > 0) {
                                a2.remove(qVar.i());
                                rVar.a(a2);
                            } else if (a != null && a3 >= qVar.g()) {
                                a2.remove(qVar.i());
                                rVar.a(a2);
                                Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
                                String str4 = "tpat key: " + qVar.i + ", error: " + a.a + ", errorIsTerminal: " + a.b + " url: " + str2;
                                boolean z3 = com.vungle.ads.internal.util.u.a;
                                com.vungle.ads.internal.util.t.b("TpatSender", str4);
                                new TpatError(reason, str4).setLogEntry$vungle_ads_release(qVar.j).logErrorNoReturnValue$vungle_ads_release();
                            } else if (a != null) {
                                d dVar2 = (d) a2.get(qVar.i());
                                a2.put(qVar.i(), dVar2 != null ? d.a(dVar2, a3 + 1) : new d(qVar.d(), qVar.b(), qVar.a(), 1, qVar.g(), qVar.h()));
                                rVar.a(a2);
                            }
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final Map a() {
        Object failure;
        String string = this.d.getString("FAILED_TPATS");
        if (string != null) {
            try {
                j8y.a aVar = j8y.d;
                de deVar = aVar.b;
                int i = wcy.c;
                failure = (Map) aVar.a(s1v.p(deVar, fpf0.b(fpf0.g(wcy.a.a(fpf0.d(String.class)), wcy.a.a(fpf0.d(d.class))))), string);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.b("TpatSender", "Failed to decode stored tpats: " + a);
            }
            if (Result.a(failure) != null) {
                failure = new LinkedHashMap();
            }
            Map map = (Map) failure;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    public final void a(Map map) {
        Object failure;
        try {
            FilePreferences filePreferences = this.d;
            j8y.a aVar = j8y.d;
            de deVar = aVar.b;
            int i = wcy.c;
            filePreferences.a("FAILED_TPATS", aVar.b(s1v.p(deVar, fpf0.b(fpf0.g(wcy.a.a(fpf0.d(String.class)), wcy.a.a(fpf0.d(d.class))))), map)).b();
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.b("TpatSender", "Failed to encode the about to storing tpats: " + map);
        }
    }
}
