package xsna;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import xsna.e57;
import xsna.y65;

/* compiled from: BiometricViewModel.java */
/* loaded from: classes11.dex */
public class o57 extends nyt0 {

    @Nullable
    public Executor b;

    @Nullable
    public e57.a c;

    @Nullable
    public e57.d d;

    @Nullable
    public e57.c e;

    @Nullable
    public y65 f;

    @Nullable
    public uq9 g;

    @Nullable
    public c h;

    @Nullable
    public String i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    @Nullable
    public ug50<e57.b> p;

    @Nullable
    public ug50<p47> q;

    @Nullable
    public ug50<CharSequence> r;

    @Nullable
    public ug50<Boolean> s;

    @Nullable
    public ug50<Boolean> t;

    @Nullable
    public ug50<Boolean> v;

    @Nullable
    public ug50<Integer> x;

    @Nullable
    public ug50<CharSequence> y;
    public int j = 0;
    public boolean u = true;
    public int w = 0;

    /* compiled from: BiometricViewModel.java */
    public static final class a extends y65.c {

        @NonNull
        public final WeakReference<o57> a;

        public a(@Nullable o57 o57Var) {
            this.a = new WeakReference<>(o57Var);
        }
    }

    /* compiled from: BiometricViewModel.java */
    public static class b implements Executor {
        public final Handler b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.b.post(runnable);
        }
    }

    /* compiled from: BiometricViewModel.java */
    public static class c implements DialogInterface.OnClickListener {

        @NonNull
        public final WeakReference<o57> b;

        public c(@Nullable o57 o57Var) {
            this.b = new WeakReference<>(o57Var);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            WeakReference<o57> weakReference = this.b;
            if (weakReference.get() != null) {
                weakReference.get().m(true);
            }
        }
    }

    public static <T> void n(ug50<T> ug50Var, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            ug50Var.k(t);
        } else {
            ug50Var.i(t);
        }
    }

    public final int i() {
        e57.d dVar = this.d;
        if (dVar == null) {
            return 0;
        }
        e57.c cVar = this.e;
        int i = dVar.f;
        return i != 0 ? i : cVar != null ? 15 : 255;
    }

    public final void j(@Nullable p47 p47Var) {
        if (this.q == null) {
            this.q = new ug50<>();
        }
        n(this.q, p47Var);
    }

    public final void k(@NonNull CharSequence charSequence) {
        if (this.y == null) {
            this.y = new ug50<>();
        }
        n(this.y, charSequence);
    }

    public final void l(int i) {
        if (this.x == null) {
            this.x = new ug50<>();
        }
        n(this.x, Integer.valueOf(i));
    }

    public final void m(boolean z) {
        if (this.t == null) {
            this.t = new ug50<>();
        }
        n(this.t, Boolean.valueOf(z));
    }
}
