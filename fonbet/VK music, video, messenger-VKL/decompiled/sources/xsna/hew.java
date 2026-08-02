package xsna;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.ref.WeakReference;
import xsna.c63;
import xsna.n6q0;

/* compiled from: ImUnstableConnectionModalHelper.kt */
/* loaded from: classes2.dex */
public final class hew extends c63.b implements j6q0 {
    public static er6 c;
    public static b8u0 d;
    public static f370 e;
    public static WeakReference<AppCompatActivity> f;
    public static n6q0.b h;
    public static final hew b = new hew();
    public static final Handler g = new Handler(Looper.getMainLooper());

    public final void D(er6 er6Var, b8u0 b8u0Var, f370 f370Var, AppCompatActivity appCompatActivity) {
        c = er6Var;
        d = b8u0Var;
        e = f370Var;
        f = appCompatActivity != null ? new WeakReference<>(appCompatActivity) : null;
        c63 c63Var = c63.a;
        c63.a(this);
    }

    @Override // xsna.j6q0
    public final void b(boolean z) {
        if (z) {
            return;
        }
        few fewVar = new few(0);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            fewVar.run();
        } else {
            g.post(fewVar);
        }
    }

    @Override // xsna.c63.b
    public final void m(Activity activity) {
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            f = new WeakReference<>(appCompatActivity);
        }
    }

    @Override // xsna.c63.b
    public final void n(Activity activity) {
        WeakReference<AppCompatActivity> weakReference = f;
        if (epx.f(weakReference != null ? weakReference.get() : null, activity)) {
            few fewVar = new few(0);
            if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                fewVar.run();
            } else {
                g.post(fewVar);
            }
            f = null;
        }
    }

    @Override // xsna.c63.b
    public final void p(Activity activity) {
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            f = new WeakReference<>(appCompatActivity);
        }
    }

    @Override // xsna.j6q0
    public final void c() {
    }

    @Override // xsna.j6q0
    public final void e() {
    }

    @Override // xsna.j6q0
    public final void a(boolean z) {
    }
}
