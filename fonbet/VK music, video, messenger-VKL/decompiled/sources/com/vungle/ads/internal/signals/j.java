package com.vungle.ads.internal.signals;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import org.chromium.base.TimeUtils;
import xsna.fpf0;
import xsna.j8y;
import xsna.msy;
import xsna.n9y;
import xsna.s1v;

/* loaded from: classes7.dex */
public final class j {
    public final Context a;
    public long c;
    public long e;
    public long g;
    public c h;
    public final Lazy j;
    public com.vungle.ads.internal.session.b k;
    public final j8y b = n9y.a(e.a);
    public long d = System.currentTimeMillis();
    public int f = -1;
    public ConcurrentHashMap i = new ConcurrentHashMap();

    public j(Context context) {
        this.a = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.j = msy.a(lazyThreadSafetyMode, new g(context));
        e();
        this.g = c().a("vungle_signal_session_creation_time", -1L);
        f();
        this.h = new c(this.f);
        com.vungle.ads.internal.session.b bVar = new com.vungle.ads.internal.session.b(context, this.h.a(), a(msy.a(lazyThreadSafetyMode, new h(context))), b(msy.a(lazyThreadSafetyMode, new i(context))));
        this.k = bVar;
        this.h.a(bVar.b());
        boolean z = u.a;
        t.a("SignalManager", new d(this));
        try {
            this.h.a(!com.vungle.ads.internal.platform.e.a() ? 1 : 0);
            this.h.e(com.vungle.ads.internal.platform.e.f(context) ? 1 : 0);
            this.h.c(com.vungle.ads.internal.platform.e.d(context) ? 1 : 0);
            this.h.d(com.vungle.ads.internal.platform.e.c(context));
            this.h.b(com.vungle.ads.internal.platform.e.e(context) ? 1 : 0);
        } catch (Exception e) {
            boolean z2 = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Failed to collect device signals: ");
            a.append(e.getLocalizedMessage());
            t.b("SignalManager", a.toString());
        }
    }

    public final c b() {
        return this.h;
    }

    public final FilePreferences c() {
        return (FilePreferences) this.j.getValue();
    }

    public final String d() {
        return this.h.b;
    }

    public final void e() {
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.a(new f(this));
    }

    public final void f() {
        if (this.f == -1) {
            this.f = c().a("vungle_signal_session_count", 0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.g;
        long j2 = currentTimeMillis - j;
        if (j < 0 || j2 >= TimeUtils.MILLISECONDS_PER_DAY) {
            this.f = 1;
            c().b("vungle_signal_session_creation_time", currentTimeMillis);
            this.g = currentTimeMillis;
        } else {
            this.f++;
        }
        c().b("vungle_signal_session_count", this.f);
        c().b();
    }

    public static final com.vungle.ads.internal.executor.a a(Lazy lazy) {
        return (com.vungle.ads.internal.executor.a) lazy.getValue();
    }

    public static final PathProvider b(Lazy lazy) {
        return (PathProvider) lazy.getValue();
    }

    public final synchronized m a(String str) {
        long currentTimeMillis;
        Long l;
        try {
            currentTimeMillis = System.currentTimeMillis();
            l = this.i.containsKey(str) ? (Long) this.i.get(str) : null;
            this.i.put(str, Long.valueOf(currentTimeMillis));
        } catch (Throwable th) {
            throw th;
        }
        return new m(l, currentTimeMillis);
    }

    public final void b(r3 r3Var) {
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.r()) {
            return;
        }
        this.k.b(r3Var);
    }

    public final void b(String str) {
        if (str == null || str.length() == 0 || this.h.d.isEmpty()) {
            return;
        }
        ((m) this.h.d.get(0)).c = str;
    }

    public final void a(r3 r3Var) {
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.r()) {
            return;
        }
        this.k.a(r3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r4.intValue() == 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r4.intValue() == 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, m mVar) {
        Configuration configuration;
        this.h.b().clear();
        this.h.b().add(mVar);
        int i = 0;
        m mVar2 = (m) this.h.b().get(0);
        if (context == null) {
            context = this.a;
        }
        Resources resources = context.getResources();
        Integer valueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        int i2 = valueOf != null ? 2 : 1;
        if (valueOf != null) {
        }
        if (valueOf == null || valueOf.intValue() != 0) {
            i = -1;
        }
        mVar2.a(i);
    }

    public final String a() {
        this.h.e = (System.currentTimeMillis() + this.e) - this.d;
        try {
            j8y j8yVar = this.b;
            return "2:".concat(j8yVar.b(s1v.p(j8yVar.b, fpf0.d(c.class)), this.h));
        } catch (Throwable unused) {
            return null;
        }
    }
}
