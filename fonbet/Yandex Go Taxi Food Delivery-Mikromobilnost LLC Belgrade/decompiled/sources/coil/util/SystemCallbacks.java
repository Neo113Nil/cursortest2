package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil.c;
import defpackage.bdi0;
import defpackage.jsb1;
import defpackage.m2x0;
import defpackage.swn;
import defpackage.tls;
import defpackage.ux50;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\tH\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR.\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00020\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010\u000e\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010(\u0012\u0004\b,\u0010\b\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001bR\u0016\u0010-\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010*¨\u00060"}, d2 = {"Lcoil/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Lcoil/c;", "imageLoader", "<init>", "(Lcoil/c;)V", "Lzy11;", "registerNetworkObserver", "()V", "Lkotlin/Function1;", "block", "withImageLoader", "(Ltls;)V", "registerMemoryPressureCallbacks", "shutdown", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "level", "onTrimMemory", "(I)V", "onLowMemory", "", "isOnline", "onConnectivityChange", "(Z)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "getImageLoader", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "Landroid/content/Context;", ClidProvider.APPLICATION, "Landroid/content/Context;", "Lux50;", "networkObserver", "Lux50;", "Z", "getShutdown", "()Z", "setShutdown", "getShutdown$annotations", "_isOnline", "Companion", "m2x0", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SystemCallbacks implements ComponentCallbacks2 {
    public static final m2x0 Companion = new m2x0();
    private static final String OFFLINE = "OFFLINE";
    private static final String ONLINE = "ONLINE";
    private static final String TAG = "NetworkObserver";
    private boolean _isOnline = true;
    private Context application;
    private final WeakReference<c> imageLoader;
    private ux50 networkObserver;
    private boolean shutdown;

    public SystemCallbacks(c cVar) {
        this.imageLoader = new WeakReference<>(cVar);
    }

    public static /* synthetic */ void getImageLoader$annotations() {
    }

    public static /* synthetic */ void getShutdown$annotations() {
    }

    private final synchronized void registerNetworkObserver() {
        zy11 zy11Var;
        try {
            c cVar = this.imageLoader.get();
            if (cVar != null) {
                if (this.networkObserver == null) {
                    ux50 b = cVar.e.b ? jsb1.b(cVar.a, this) : new swn();
                    this.networkObserver = b;
                    this._isOnline = b.a();
                }
                zy11Var = zy11.a;
            } else {
                zy11Var = null;
            }
            if (zy11Var == null) {
                shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void withImageLoader(tls block) {
        zy11 zy11Var;
        c cVar = this.imageLoader.get();
        if (cVar != null) {
            block.invoke(cVar);
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var == null) {
            shutdown();
        }
    }

    public final WeakReference<c> getImageLoader() {
        return this.imageLoader;
    }

    public final boolean getShutdown() {
        return this.shutdown;
    }

    public final synchronized boolean isOnline() {
        registerNetworkObserver();
        return this._isOnline;
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onConfigurationChanged(Configuration newConfig) {
        try {
            if ((this.imageLoader.get() != null ? zy11.a : null) == null) {
                shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onConnectivityChange(boolean isOnline) {
        zy11 zy11Var;
        try {
            if (this.imageLoader.get() != null) {
                this._isOnline = isOnline;
                zy11Var = zy11.a;
            } else {
                zy11Var = null;
            }
            if (zy11Var == null) {
                shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public synchronized void onTrimMemory(int level) {
        zy11 zy11Var;
        try {
            c cVar = this.imageLoader.get();
            if (cVar != null) {
                bdi0 bdi0Var = (bdi0) cVar.c.getValue();
                if (bdi0Var != null) {
                    bdi0Var.b(level);
                }
                zy11Var = zy11.a;
            } else {
                zy11Var = null;
            }
            if (zy11Var == null) {
                shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void registerMemoryPressureCallbacks() {
        zy11 zy11Var;
        try {
            c cVar = this.imageLoader.get();
            if (cVar != null) {
                if (this.application == null) {
                    Context context = cVar.a;
                    this.application = context;
                    context.registerComponentCallbacks(this);
                }
                zy11Var = zy11.a;
            } else {
                zy11Var = null;
            }
            if (zy11Var == null) {
                shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setShutdown(boolean z) {
        this.shutdown = z;
    }

    public final synchronized void shutdown() {
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Context context = this.application;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            ux50 ux50Var = this.networkObserver;
            if (ux50Var != null) {
                ux50Var.shutdown();
            }
            this.imageLoader.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
