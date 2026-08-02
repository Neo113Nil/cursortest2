package androidx.camera.core;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import defpackage.a2k0;
import defpackage.bo7;
import defpackage.br7;
import defpackage.ffx;
import defpackage.grb1;
import defpackage.hhs0;
import defpackage.jm7;
import defpackage.jzz0;
import defpackage.lm7;
import defpackage.m2v;
import defpackage.nn7;
import defpackage.nq7;
import defpackage.os7;
import defpackage.qn7;
import defpackage.sgb1;
import defpackage.st7;
import defpackage.us7;
import defpackage.v34;
import defpackage.wt7;
import defpackage.xs7;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ e a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ int w;
    public final /* synthetic */ androidx.concurrent.futures.b x;
    public final /* synthetic */ long y;

    public /* synthetic */ d(int i, long j, Context context, e eVar, androidx.concurrent.futures.b bVar, Executor executor) {
        this.a = eVar;
        this.b = context;
        this.c = executor;
        this.w = i;
        this.x = bVar;
        this.y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.a;
        Context context = this.b;
        Executor executor = this.c;
        int i = this.w;
        androidx.concurrent.futures.b bVar = this.x;
        long j = this.y;
        Trace.beginSection(ffx.f0("CX:initAndRetryRecursively"));
        Context b = grb1.b(context);
        try {
            try {
                if (eVar.c.b() == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                v34 v34Var = new v34(eVar.d, eVar.e);
                xs7 a = eVar.c.a();
                long p = eVar.c.p();
                if (eVar.c.w() == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                bo7 bo7Var = new bo7(b);
                eVar.i = bo7Var;
                hhs0 hhs0Var = new hhs0(bo7Var);
                eVar.j = hhs0Var;
                eVar.g = new lm7(b, v34Var, a, p, eVar.c, hhs0Var);
                if (eVar.c.t() == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                lm7 lm7Var = eVar.g;
                qn7 a2 = nn7.a(b, lm7Var.e, lm7Var.a());
                eVar.h = a2;
                eVar.j.c = a2;
                if (executor instanceof nq7) {
                    ((nq7) executor).a(eVar.g);
                }
                eVar.a.d(eVar.g);
                jm7 jm7Var = eVar.g.b;
                jm7Var.getClass();
                us7 us7Var = eVar.a;
                eVar.k = new m2v(us7Var, jm7Var, eVar.i, eVar.j);
                Iterator it = us7Var.c().iterator();
                while (it.hasNext()) {
                    ((br7) it.next()).f().B(eVar.k);
                }
                eVar.n.e(eVar.g, eVar.a);
                eVar.n.i.add(eVar.h);
                eVar.n.i.add(eVar.g.b);
                st7.a(b, eVar.a, a);
                if (i > 1 && jzz0.a()) {
                    Trace.setCounter(ffx.f0("CX:CameraProvider-RetryStatus"), -1);
                }
                synchronized (eVar.b) {
                    eVar.o = CameraX$InternalInitState.INITIALIZED;
                }
                bVar.b(null);
                Trace.endSection();
            } catch (InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException e) {
                a2k0 b2 = eVar.l.b(new os7(e, j));
                if (jzz0.a()) {
                    Trace.setCounter(ffx.f0("CX:CameraProvider-RetryStatus"), r8.a);
                }
                eVar.n.d();
                if (!b2.b || i >= Integer.MAX_VALUE) {
                    synchronized (eVar.b) {
                        eVar.o = CameraX$InternalInitState.INITIALIZING_ERROR;
                        if (b2.c) {
                            synchronized (eVar.b) {
                                eVar.o = CameraX$InternalInitState.INITIALIZED;
                                bVar.b(null);
                            }
                        } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a();
                            sgb1.e("CameraX", str, e);
                            bVar.d(new InitializationException(new CameraUnavailableException(str)));
                        } else if (e instanceof InitializationException) {
                            bVar.d(e);
                        } else {
                            bVar.d(new InitializationException(e));
                        }
                    }
                } else {
                    SystemClock.elapsedRealtime();
                    sgb1.g(5, "CameraX");
                    eVar.e.postDelayed(new wt7(i, j, b, eVar, bVar, executor), "retry_token", b2.a);
                }
                Trace.endSection();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
