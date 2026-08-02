package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.N1;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class N1 implements B1, InterfaceC5155s0 {
    public boolean a;
    public final Context b;
    public final A1 c;
    public final C5004m4 d;
    public final V1 e;
    public C4759ch f;
    public final C5114qa g;
    public final C5157s2 h;
    public final O1 i;
    public final C5043nh j;

    public N1(@NonNull Context context, @NonNull A1 a1) {
        this(context, a1, new C5083p5(context));
    }

    public final void a() {
        this.e.c(new U1() { // from class: xsna.ot50
            @Override // io.appmetrica.analytics.impl.U1
            public final void a(Intent intent) {
                N1.this.d(intent);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void b(Intent intent) {
        this.e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void c(Intent intent) {
        V1 v1 = this.e;
        if (intent == null) {
            v1.getClass();
            return;
        }
        v1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            v1.a.a(action, Integer.valueOf(V1.a(intent)));
        }
        for (Map.Entry entry : v1.b.entrySet()) {
            U1 u1 = (U1) entry.getKey();
            if (((T1) entry.getValue()).a(intent)) {
                u1.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C5342za.I.v().a(AbstractC5166sb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        C5342za.I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onCreate() {
        if (this.a) {
            C5342za.I.v().a(this.b.getResources().getConfiguration());
        } else {
            this.g.b(this.b);
            C5342za c5342za = C5342za.I;
            synchronized (c5342za) {
                c5342za.B.initAsync();
                c5342za.u.a(c5342za.a);
                c5342za.u.a(new C5205to(c5342za.B));
                NetworkServiceLocator.init(new C5134r5(new C5350zi(c5342za.h()), new B5(c5342za.a)));
                c5342za.l().a(c5342za.q);
                c5342za.E();
            }
            AbstractC4865gk.a.e();
            C5151rm c5151rm = C5342za.I.u;
            c5151rm.b();
            C5100pm b = c5151rm.b();
            Hk p = C5342za.I.p();
            p.a(new C5020mk(new C4987ld(this.e)), b);
            c5151rm.a(p);
            ((Kl) C5342za.I.z()).getClass();
            a();
            C5342za.I.m().init();
            C5342za.I.c().init();
            O1 o1 = this.i;
            Context context = this.b;
            C5004m4 c5004m4 = this.d;
            o1.getClass();
            this.f = new C4759ch(context, c5004m4);
            Context context2 = this.b;
            AbstractC5233v1.a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.b;
            C4759ch c4759ch = this.f;
            Zd r = C5342za.k().r();
            IHandlerExecutor e = C5342za.k().w().e();
            C5161s6 c5161s6 = new C5161s6(context3, c4759ch, EnumC5037nb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C5161s6 c5161s62 = new C5161s6(context3, c4759ch, EnumC5037nb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C5318yb(), e, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC5110q6 fileObserverC5110q6 = new FileObserverC5110q6(crashesDirectory, c5161s62, new C5010ma());
                e.execute(new RunnableC4809eg(crashesDirectory, c5161s6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC5110q6.startWatching();
                C5342za.I.E.storeReference(fileObserverC5110q6);
            }
            r.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r.a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r.a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Ud b2 = r.b.b(context3, c4759ch);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b2.newCrash((NativeCrash) it.next());
                    }
                }
                r.a.setDefaultCrashHandler(r.b.a(context3, c4759ch));
            }
            new U5(Collections.singletonList(new RunnableC4913ih())).run();
            this.a = true;
        }
        C5342za.I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onDestroy() {
        Rb l = C5342za.I.l();
        synchronized (l) {
            Iterator it = l.c.iterator();
            while (it.hasNext()) {
                ((InterfaceC5252vk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        Lf lf;
        bundle.setClassLoader(Lf.class.getClassLoader());
        String str = Lf.c;
        try {
            lf = (Lf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            lf = null;
        }
        Integer asInteger = lf != null ? lf.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void reportData(int i, Bundle bundle) {
        this.j.getClass();
        List list = (List) C5342za.I.v.a.get(Integer.valueOf(i));
        if (list == null) {
            list = EmptyList.b;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC5046nk) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        Lf lf;
        bundle.setClassLoader(Lf.class.getClassLoader());
        String str = Lf.c;
        try {
            lf = (Lf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            lf = null;
        }
        Integer asInteger = lf != null ? lf.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.c(asInteger.intValue());
        }
    }

    public N1(Context context, A1 a1, C5083p5 c5083p5) {
        this(context, a1, new C5004m4(context, c5083p5), new V1(), C5114qa.d, C5342za.k().e(), new O1());
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent) {
        V1 v1 = this.e;
        if (intent == null) {
            v1.getClass();
            return;
        }
        v1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            v1.a.a(action, Integer.valueOf(V1.a(intent)));
        }
        for (Map.Entry entry : v1.b.entrySet()) {
            U1 u1 = (U1) entry.getKey();
            if (((T1) entry.getValue()).a(intent)) {
                u1.a(intent);
            }
        }
    }

    public N1(Context context, A1 a1, C5004m4 c5004m4, V1 v1, C5114qa c5114qa, C5157s2 c5157s2, O1 o1) {
        this.a = false;
        this.b = context;
        this.c = a1;
        this.d = c5004m4;
        this.e = v1;
        this.g = c5114qa;
        this.h = c5157s2;
        this.i = o1;
        this.j = new C5043nh();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        C4722b6.b(bundle);
        C4759ch c4759ch = this.f;
        if (c4759ch != null) {
            c4759ch.a(C4722b6.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent, int i) {
        ((C5207u0) this.c).a.stopSelf(i);
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent, int i, int i2) {
        ((C5207u0) this.c).a.stopSelf(i2);
    }
}
