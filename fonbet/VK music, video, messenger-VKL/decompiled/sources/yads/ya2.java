package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ya2 {
    public static final wa2 g = new wa2();
    public static final long h = TimeUnit.SECONDS.toMillis(1);
    public static volatile ya2 i;
    public final va2 c;
    public boolean e;
    public boolean f;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ta2 d = new ta2();

    public ya2(Context context) {
        this.c = new va2(context);
    }

    public final void a(pe3 pe3Var) {
        synchronized (this.a) {
            try {
                this.d.b(pe3Var);
                if (!this.d.a()) {
                    this.c.c.getClass();
                    yp2.a("om_sdk_js_request_tag");
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(pe3 pe3Var) {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.f;
                if (!z) {
                    this.d.a(pe3Var);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            pe3Var.a();
        } else {
            a();
        }
    }

    public final void c() {
        synchronized (this.a) {
            this.b.removeCallbacksAndMessages(null);
            this.e = false;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b() {
        this.b.postDelayed(new xsna.yn2(this, 14), h);
    }

    public final void a() {
        boolean z;
        synchronized (this.a) {
            try {
                if (this.e) {
                    z = false;
                } else {
                    z = true;
                    this.e = true;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            b();
            this.c.a(new xa2(this));
        }
    }

    public static final void a(ya2 ya2Var) {
        ya2Var.c.c.getClass();
        yp2.a("om_sdk_js_request_tag");
        synchronized (ya2Var.a) {
            ya2Var.f = true;
            s3q0 s3q0Var = s3q0.a;
        }
        ya2Var.c();
        ya2Var.d.b();
    }
}
