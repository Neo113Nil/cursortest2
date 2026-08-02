package androidx.camera.core;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettingsLoader;
import defpackage.b2k0;
import defpackage.bez0;
import defpackage.bo7;
import defpackage.d6z;
import defpackage.euy;
import defpackage.gl7;
import defpackage.grb1;
import defpackage.hhs0;
import defpackage.hiv;
import defpackage.hsj0;
import defpackage.ilg0;
import defpackage.jlg0;
import defpackage.js7;
import defpackage.jx81;
import defpackage.lm7;
import defpackage.m2v;
import defpackage.m6;
import defpackage.nq7;
import defpackage.ny61;
import defpackage.qdy;
import defpackage.qn7;
import defpackage.qs7;
import defpackage.sgb1;
import defpackage.us7;
import defpackage.x4e;
import defpackage.yt7;
import defpackage.zt7;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class e {
    public static final Object s = new Object();
    public static final SparseArray t = new SparseArray();
    public final us7 a;
    public final Object b;
    public final zt7 c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public lm7 g;
    public qn7 h;
    public bo7 i;
    public hhs0 j;
    public m2v k;
    public final b2k0 l;
    public final gl7 m;
    public final js7 n;
    public CameraX$InternalInitState o;
    public euy p;
    public final Integer q;
    public final int r;

    public e(Context context, qdy qdyVar) {
        ComponentCallbacks2 componentCallbacks2;
        yt7 yt7Var;
        String string;
        boolean z;
        b2k0 bez0Var;
        gl7 gl7Var;
        e eVar;
        Executor executor;
        QuirkSettingsLoader quirkSettingsLoader = new QuirkSettingsLoader();
        this.a = new us7();
        this.b = new Object();
        this.o = CameraX$InternalInitState.UNINITIALIZED;
        this.p = hiv.c;
        Context b = grb1.b(context);
        while (true) {
            if (!(b instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (b instanceof Application) {
                    componentCallbacks2 = (Application) b;
                    break;
                }
                b = ((ContextWrapper) b).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof yt7) {
            yt7Var = (yt7) componentCallbacks2;
        } else {
            try {
                Context b2 = grb1.b(context);
                Bundle bundle = b2.getPackageManager().getServiceInfo(new ComponentName(b2, (Class<?>) MetadataHolderService.class), 640).metaData;
                string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
                sgb1.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            }
            if (string == null) {
                sgb1.d("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                yt7Var = null;
            } else {
                yt7Var = (yt7) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
        }
        if (yt7Var == null) {
            ny61.r("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            throw null;
        }
        zt7 cameraXConfig = yt7Var.getCameraXConfig();
        this.c = cameraXConfig;
        ilg0 ilg0Var = (ilg0) cameraXConfig.a.g(zt7.D, null);
        if (ilg0Var != null) {
            ilg0Var.toString();
            sgb1.g(3, "CameraX");
        } else {
            ilg0Var = (ilg0) quirkSettingsLoader.mo104apply(context);
            Objects.toString(ilg0Var);
            sgb1.g(3, "CameraX");
        }
        if (ilg0Var == null) {
            ilg0Var = jlg0.b;
            Objects.toString(ilg0Var);
            sgb1.g(3, "CameraX");
        }
        jlg0.c.a.t(ilg0Var);
        this.r = ((Integer) cameraXConfig.a.g(zt7.E, -1)).intValue();
        Executor executor2 = (Executor) cameraXConfig.a.g(zt7.x, null);
        Handler handler = (Handler) cameraXConfig.a.g(zt7.y, null);
        executor2 = executor2 == null ? new nq7() : executor2;
        this.d = executor2;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f = handlerThread;
            handlerThread.start();
            this.e = Handler.createAsync(handlerThread.getLooper());
        } else {
            this.f = null;
            this.e = handler;
        }
        Integer num = (Integer) cameraXConfig.g(zt7.z, null);
        this.q = num;
        synchronized (s) {
            z = true;
            try {
                if (num != null) {
                    d6z.p(num.intValue(), 3, 6, "minLogLevel");
                    SparseArray sparseArray = t;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                    c();
                }
            } finally {
            }
        }
        b2k0 b2k0Var = (b2k0) cameraXConfig.a.g(zt7.C, b2k0.a);
        Objects.requireNonNull(b2k0Var);
        long a = b2k0Var.a();
        if (b2k0Var instanceof qs7) {
            switch (((qs7) b2k0Var).b) {
                case 0:
                    bez0Var = new qs7(a, 0);
                    break;
                default:
                    bez0Var = new qs7(a, 1);
                    break;
            }
        } else {
            bez0Var = new bez0(a, b2k0Var);
        }
        this.l = bez0Var;
        this.n = new js7(executor2);
        synchronized (this.b) {
            if (this.o != CameraX$InternalInitState.UNINITIALIZED) {
                z = false;
            }
            d6z.y("CameraX.initInternal() should only be called once per instance", z);
            this.o = CameraX$InternalInitState.INITIALIZING;
            androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
            bVar.c = new hsj0();
            gl7Var = new gl7(bVar);
            bVar.b = gl7Var;
            bVar.a = x4e.class;
            try {
                executor = this.d;
                eVar = this;
            } catch (Exception e2) {
                e = e2;
                eVar = this;
            }
            try {
                executor.execute(new d(1, SystemClock.elapsedRealtime(), context, eVar, bVar, executor));
                bVar.a = "CameraX initInternal";
            } catch (Exception e3) {
                e = e3;
                gl7Var.a(e);
                eVar.m = gl7Var;
            }
        }
        eVar.m = gl7Var;
    }

    public static void a(Integer num) {
        synchronized (s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = t;
                int intValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c() {
        SparseArray sparseArray = t;
        if (sparseArray.size() == 0) {
            sgb1.a = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            sgb1.a = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            sgb1.a = 4;
        } else if (sparseArray.get(5) != null) {
            sgb1.a = 5;
        } else if (sparseArray.get(6) != null) {
            sgb1.a = 6;
        }
    }

    public final euy b() {
        synchronized (this.b) {
            try {
                this.e.removeCallbacksAndMessages("retry_token");
                int ordinal = this.o.ordinal();
                if (ordinal == 0) {
                    this.o = CameraX$InternalInitState.SHUTDOWN;
                    return hiv.c;
                }
                if (ordinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (ordinal == 2 || ordinal == 3) {
                    this.o = CameraX$InternalInitState.SHUTDOWN;
                    a(this.q);
                    this.p = jx81.r(new m6(28, this));
                }
                return this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
