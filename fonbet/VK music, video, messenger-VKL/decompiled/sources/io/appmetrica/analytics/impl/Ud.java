package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Ud;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import java.io.File;
import xsna.fpf0;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final class Ud implements NativeCrashHandler {
    public final izs a;
    public final IHandlerExecutor b = C5342za.k().w().e();
    public final Xd c;

    public Ud(Context context, C4759ch c4759ch, izs<? super String, s3q0> izsVar, InterfaceC4756ce interfaceC4756ce, EnumC5037nb enumC5037nb, String str) {
        this.a = izsVar;
        this.c = new Xd(context, c4759ch, interfaceC4756ce, enumC5037nb);
    }

    public static final void a(Ud ud, NativeCrash nativeCrash, File file) {
        ud.a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        G0 g0;
        try {
            g0 = new G0(nativeCrash.getSource(), nativeCrash.getHandlerVersion(), nativeCrash.getUuid(), nativeCrash.getDumpFile(), nativeCrash.getCreationTime(), I0.a(nativeCrash.getMetadata()));
        } catch (Throwable unused) {
            g0 = null;
        }
        if (g0 == null) {
            this.a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(g0.f.a).info("Detected native crash with uuid = " + g0.c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.b;
        Xd xd = this.c;
        Consumer consumer = new Consumer() { // from class: xsna.hyp0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Ud.a(Ud.this, nativeCrash, (File) obj);
            }
        };
        xd.getClass();
        Qd qd = new Qd(new Sd(g0.a, g0.b), xd.f);
        Nd nd = new Nd(xd.b, g0.f, new Wd(g0, xd.d));
        C5010ma c5010ma = xd.e;
        String str = g0.d;
        c5010ma.getClass();
        File file = new File(str);
        Context context = xd.a;
        if (C4984la.c == null) {
            synchronized (fpf0.a(C4984la.class)) {
                try {
                    if (C4984la.c == null) {
                        C4984la.c = new C4984la(context);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C4984la c4984la = C4984la.c;
        iHandlerExecutor.execute(new RunnableC4784dg(file, qd, consumer, nd, c4984la == null ? null : c4984la, xd.c.a(g0)));
    }
}
