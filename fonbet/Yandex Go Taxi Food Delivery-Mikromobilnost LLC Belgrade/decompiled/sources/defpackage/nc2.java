package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil3.c;
import coil3.util.AndroidSystemCallbacks$ActivityCallbacks;
import coil3.util.AndroidSystemCallbacks$ComponentCallbacks;
import defpackage.adi0;
import defpackage.mdi0;
import defpackage.nc2;
import defpackage.tdi0;
import defpackage.uci0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class nc2 {
    public final WeakReference a;
    public final AndroidSystemCallbacks$ActivityCallbacks b;
    public final AndroidSystemCallbacks$ComponentCallbacks c = new ComponentCallbacks2() { // from class: coil3.util.AndroidSystemCallbacks$ComponentCallbacks
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            nc2 nc2Var = nc2.this;
            synchronized (nc2Var) {
                if (((c) nc2Var.a.get()) == null) {
                    nc2Var.a();
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            adi0 d;
            long b;
            nc2 nc2Var = nc2.this;
            synchronized (nc2Var) {
                try {
                    c cVar = (c) nc2Var.a.get();
                    if (cVar != null) {
                        uci0 uci0Var = cVar.a;
                        if (level >= 40) {
                            adi0 d2 = cVar.d();
                            if (d2 != null) {
                                synchronized (d2.c) {
                                    ((mdi0) d2.a.c).d(-1L);
                                    tdi0 tdi0Var = d2.b;
                                    tdi0Var.b = 0;
                                    tdi0Var.a.clear();
                                }
                            }
                        } else if (level >= 20) {
                            nc2Var.b.register(uci0Var.a);
                        } else if (level >= 10 && (d = cVar.d()) != null) {
                            synchronized (d.c) {
                                b = ((mdi0) d.a.c).b();
                            }
                            long j = b / 2;
                            synchronized (d.c) {
                                ((mdi0) d.a.c).d(j);
                            }
                        }
                    } else {
                        nc2Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    public Context d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r2v1, types: [coil3.util.AndroidSystemCallbacks$ComponentCallbacks] */
    public nc2(c cVar) {
        this.a = new WeakReference(cVar);
        this.b = new AndroidSystemCallbacks$ActivityCallbacks(this, cVar);
    }

    public final synchronized void a() {
        try {
            if (this.e) {
                return;
            }
            this.e = true;
            Context context = this.d;
            if (context != null) {
                this.b.unregister(context);
                context.unregisterComponentCallbacks(this.c);
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
