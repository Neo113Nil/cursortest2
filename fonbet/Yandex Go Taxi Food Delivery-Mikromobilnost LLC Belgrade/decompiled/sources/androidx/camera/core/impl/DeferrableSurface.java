package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.b;
import defpackage.el7;
import defpackage.euy;
import defpackage.geb1;
import defpackage.gl7;
import defpackage.hiv;
import defpackage.jx81;
import defpackage.sgb1;
import defpackage.zvg;
import java.util.concurrent.atomic.AtomicInteger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public abstract class DeferrableSurface {
    public static final Size k = new Size(0, 0);
    public static final boolean l = sgb1.g(3, "DeferrableSurface");
    public static final AtomicInteger m = new AtomicInteger(0);
    public static final AtomicInteger n = new AtomicInteger(0);
    public final Object a;
    public int b;
    public boolean c;
    public b d;
    public final gl7 e;
    public b f;
    public final gl7 g;
    public final Size h;
    public final int i;
    public Class j;

    public static final class SurfaceClosedException extends Exception {
        DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        public final DeferrableSurface a() {
            return this.mDeferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
    }

    public DeferrableSurface(int i, Size size) {
        this.a = new Object();
        final int i2 = 0;
        this.b = 0;
        this.c = false;
        this.h = size;
        this.i = i;
        gl7 r = jx81.r(new el7(this) { // from class: loh
            public final /* synthetic */ DeferrableSurface b;

            {
                this.b = this;
            }

            @Override // defpackage.el7
            public final Object j(b bVar) {
                int i3 = i2;
                DeferrableSurface deferrableSurface = this.b;
                switch (i3) {
                    case 0:
                        synchronized (deferrableSurface.a) {
                            deferrableSurface.d = bVar;
                        }
                        return "DeferrableSurface-termination(" + deferrableSurface + Extension.C_BRAKE;
                    default:
                        synchronized (deferrableSurface.a) {
                            deferrableSurface.f = bVar;
                        }
                        return "DeferrableSurface-close(" + deferrableSurface + Extension.C_BRAKE;
                }
            }
        });
        this.e = r;
        final int i3 = 1;
        this.g = jx81.r(new el7(this) { // from class: loh
            public final /* synthetic */ DeferrableSurface b;

            {
                this.b = this;
            }

            @Override // defpackage.el7
            public final Object j(b bVar) {
                int i32 = i3;
                DeferrableSurface deferrableSurface = this.b;
                switch (i32) {
                    case 0:
                        synchronized (deferrableSurface.a) {
                            deferrableSurface.d = bVar;
                        }
                        return "DeferrableSurface-termination(" + deferrableSurface + Extension.C_BRAKE;
                    default:
                        synchronized (deferrableSurface.a) {
                            deferrableSurface.f = bVar;
                        }
                        return "DeferrableSurface-close(" + deferrableSurface + Extension.C_BRAKE;
                }
            }
        });
        if (sgb1.g(3, "DeferrableSurface")) {
            n.incrementAndGet();
            m.get();
            e();
            r.b.c(new zvg(14, this, Log.getStackTraceString(new Exception())), geb1.b());
        }
    }

    public void a() {
        b bVar;
        synchronized (this.a) {
            try {
                if (this.c) {
                    bVar = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        bVar = this.d;
                        this.d = null;
                    } else {
                        bVar = null;
                    }
                    if (sgb1.g(3, "DeferrableSurface")) {
                        toString();
                        sgb1.g(3, "DeferrableSurface");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bVar != null) {
            bVar.b(null);
        }
    }

    public final void b() {
        b bVar;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    bVar = this.d;
                    this.d = null;
                } else {
                    bVar = null;
                }
                if (sgb1.g(3, "DeferrableSurface")) {
                    toString();
                    sgb1.g(3, "DeferrableSurface");
                    if (this.b == 0) {
                        n.get();
                        m.decrementAndGet();
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bVar != null) {
            bVar.b(null);
        }
    }

    public final euy c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new hiv(1, new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (sgb1.g(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        n.get();
                        m.incrementAndGet();
                        e();
                    }
                    toString();
                    sgb1.g(3, "DeferrableSurface");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (!l && sgb1.g(3, "DeferrableSurface")) {
            sgb1.g(3, "DeferrableSurface");
        }
        toString();
        sgb1.g(3, "DeferrableSurface");
    }

    public abstract euy f();

    public DeferrableSurface() {
        this(0, k);
    }
}
