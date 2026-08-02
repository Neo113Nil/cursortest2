package xsna;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.SystemClock;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.concurrent.Executor;
import xsna.oi9;
import xsna.th9;
import xsna.ub9;
import xsna.vo9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class so9 implements Runnable {
    public final /* synthetic */ vo9 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Executor d;
    public final /* synthetic */ ub9.a e;
    public final /* synthetic */ long f;

    public /* synthetic */ so9(vo9 vo9Var, Context context, Executor executor, ub9.a aVar, long j) {
        this.b = vo9Var;
        this.c = context;
        this.d = executor;
        this.e = aVar;
        this.f = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Application application;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        final vo9 vo9Var = this.b;
        Context context = this.c;
        final Executor executor = this.d;
        final ub9.a aVar = this.e;
        final long j = this.f;
        fl9 fl9Var = vo9Var.a;
        Handler handler = vo9Var.e;
        wo9 wo9Var = vo9Var.c;
        try {
            Context applicationContext = context.getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            vo9Var.j = application;
            if (application == null) {
                vo9Var.j = context.getApplicationContext();
            }
            try {
                obj = wo9Var.s.f(wo9.t);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            oi9.a aVar2 = (oi9.a) obj;
            if (aVar2 == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            sk5 sk5Var = new sk5(vo9Var.d, handler);
            try {
                obj2 = wo9Var.s.f(wo9.z);
            } catch (IllegalArgumentException unused2) {
                obj2 = null;
            }
            vo9Var.g = aVar2.a(vo9Var.j, sk5Var, (nl9) obj2);
            try {
                obj3 = wo9Var.s.f(wo9.u);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            th9.a aVar3 = (th9.a) obj3;
            if (aVar3 == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            vo9Var.h = aVar3.a(vo9Var.j, vo9Var.g.a(), vo9Var.g.d());
            try {
                obj4 = wo9Var.s.f(wo9.v);
            } catch (IllegalArgumentException unused4) {
                obj4 = null;
            }
            UseCaseConfigFactory.a aVar4 = (UseCaseConfigFactory.a) obj4;
            if (aVar4 == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            vo9Var.i = aVar4.a(vo9Var.j);
            if (executor instanceof li9) {
                ((li9) executor).a(vo9Var.g);
            }
            fl9Var.b(vo9Var.g);
            if (m6m.a.a(btw.class) != null) {
                CameraValidator.a(vo9Var.j, fl9Var);
            }
            synchronized (vo9Var.b) {
                vo9Var.k = vo9.b.INITIALIZED;
            }
            aVar.b(null);
        } catch (InitializationException e) {
            e = e;
            if (SystemClock.elapsedRealtime() - j < 2500) {
                SystemClock.elapsedRealtime();
                handler.postDelayed(new Runnable() { // from class: xsna.to9
                    @Override // java.lang.Runnable
                    public final void run() {
                        vo9 vo9Var2 = vo9.this;
                        Context context2 = vo9Var2.j;
                        Executor executor2 = executor;
                        executor2.execute(new so9(vo9Var2, context2, executor2, aVar, j));
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (vo9Var.b) {
                vo9Var.k = vo9.b.INITIALIZED;
            }
            if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                s100.a("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.", null);
                aVar.b(null);
            } else if (e instanceof InitializationException) {
                aVar.d(e);
            } else {
                aVar.d(new InitializationException(e));
            }
        } catch (CameraValidator.CameraIdListIncorrectException e2) {
            e = e2;
            if (SystemClock.elapsedRealtime() - j < 2500) {
            }
        } catch (RuntimeException e3) {
            e = e3;
            if (SystemClock.elapsedRealtime() - j < 2500) {
            }
        }
    }
}
