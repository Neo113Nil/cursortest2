package xsna;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import com.vkontakte.android.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutionException;
import xsna.wo9;

/* compiled from: ProcessCameraProvider.java */
/* loaded from: classes11.dex */
public final class lgd0 {
    public static final lgd0 c = new lgd0();
    public final e4z a = new e4z();
    public vo9 b;

    @NonNull
    public static ora b(@NonNull Context context) {
        ugz<vo9> a;
        ComponentCallbacks2 componentCallbacks2;
        wo9.b bVar;
        context.getClass();
        synchronized (vo9.m) {
            boolean z = vo9.o != null;
            a = vo9.a();
            if (a.isDone()) {
                try {
                    a.get();
                } catch (InterruptedException e) {
                    throw new RuntimeException("Unexpected thread interrupt. Should not be possible since future is already complete.", e);
                } catch (ExecutionException unused) {
                    vo9 vo9Var = vo9.n;
                    if (vo9Var != null) {
                        vo9.n = null;
                        vo9.q = r0t.e(ub9.a(new h7(vo9Var, 6)));
                    }
                    a = null;
                }
            }
            if (a == null) {
                if (!z) {
                    Context applicationContext = context.getApplicationContext();
                    while (true) {
                        if (!(applicationContext instanceof ContextWrapper)) {
                            componentCallbacks2 = null;
                            break;
                        }
                        if (applicationContext instanceof Application) {
                            componentCallbacks2 = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                    if (componentCallbacks2 instanceof wo9.b) {
                        bVar = (wo9.b) componentCallbacks2;
                    } else {
                        try {
                            bVar = (wo9.b) Class.forName(context.getApplicationContext().getResources().getString(R.string.androidx_camera_default_config_provider)).getDeclaredConstructor(null).newInstance(null);
                        } catch (Resources.NotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
                            s100.a("CameraX", "Failed to retrieve default CameraXConfig.Provider from resources", e2);
                            bVar = null;
                        }
                    }
                    if (bVar == null) {
                        throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                    }
                    obr.f("CameraX has already been configured. To use a different configuration, shutdown() must be called.", vo9.o == null);
                    vo9.o = bVar;
                    Integer num = (Integer) bVar.getCameraXConfig().g(wo9.y, null);
                    if (num != null) {
                        s100.a = num.intValue();
                    }
                }
                vo9.b(context);
                a = vo9.a();
            }
        }
        return r0t.g(a, new t98(new ky80(3)), xo9.g());
    }

    @NonNull
    public final d4z a(@NonNull nhn0 nhn0Var, @NonNull nl9 nl9Var, @NonNull vfq0... vfq0VarArr) {
        d4z d4zVar;
        Collection<d4z> unmodifiableCollection;
        d4z d4zVar2;
        boolean contains;
        fsk.m();
        LinkedHashSet<pi9> linkedHashSet = new LinkedHashSet<>(nl9Var.a);
        for (vfq0 vfq0Var : vfq0VarArr) {
            nl9 o = vfq0Var.f.o();
            if (o != null) {
                Iterator<pi9> it = o.a.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next());
                }
            }
        }
        nl9 nl9Var2 = new nl9();
        nl9Var2.a = linkedHashSet;
        LinkedHashSet<CameraInternal> a = nl9Var2.a(this.b.a.a());
        CameraUseCaseAdapter.a aVar = new CameraUseCaseAdapter.a(a);
        e4z e4zVar = this.a;
        synchronized (e4zVar.a) {
            d4zVar = (d4z) e4zVar.b.get(new en5(nhn0Var, aVar));
        }
        e4z e4zVar2 = this.a;
        synchronized (e4zVar2.a) {
            unmodifiableCollection = Collections.unmodifiableCollection(e4zVar2.b.values());
        }
        for (vfq0 vfq0Var2 : vfq0VarArr) {
            for (d4z d4zVar3 : unmodifiableCollection) {
                synchronized (d4zVar3.b) {
                    contains = ((ArrayList) d4zVar3.d.k()).contains(vfq0Var2);
                }
                if (contains && d4zVar3 != d4zVar) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", vfq0Var2));
                }
            }
        }
        if (d4zVar == null) {
            e4z e4zVar3 = this.a;
            vo9 vo9Var = this.b;
            th9 th9Var = vo9Var.h;
            if (th9Var == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            UseCaseConfigFactory useCaseConfigFactory = vo9Var.i;
            if (useCaseConfigFactory == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(a, th9Var, useCaseConfigFactory);
            synchronized (e4zVar3.a) {
                try {
                    obr.a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", e4zVar3.b.get(new en5(nhn0Var, cameraUseCaseAdapter.e)) == null);
                    if (nhn0Var.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                        throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                    }
                    d4zVar2 = new d4z(nhn0Var, cameraUseCaseAdapter);
                    if (((ArrayList) cameraUseCaseAdapter.k()).isEmpty()) {
                        d4zVar2.j();
                    }
                    e4zVar3.d(d4zVar2);
                } finally {
                }
            }
            d4zVar = d4zVar2;
        }
        if (vfq0VarArr.length == 0) {
            return d4zVar;
        }
        this.a.a(d4zVar, Arrays.asList(vfq0VarArr));
        return d4zVar;
    }

    public final boolean c(@NonNull nl9 nl9Var) throws CameraInfoUnavailableException {
        try {
            nl9Var.a(this.b.a.a()).iterator().next();
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
