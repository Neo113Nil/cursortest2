package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Executor;
import xsna.fx10;
import xsna.h1u;

/* compiled from: MediaRouteProvider.java */
/* loaded from: classes12.dex */
public abstract class bx10 {
    public final Context b;
    public final d c;
    public final c d = new c();
    public a e;
    public yw10 f;
    public boolean g;
    public dx10 h;
    public boolean i;

    /* compiled from: MediaRouteProvider.java */
    public static abstract class a {
    }

    /* compiled from: MediaRouteProvider.java */
    public static abstract class b extends e {
        public final Object a = new Object();
        public Executor b;
        public h1u.a c;
        public vw10 d;
        public ArrayList e;

        /* compiled from: MediaRouteProvider.java */
        public static final class a {
            public final vw10 a;
            public final int b;
            public final boolean c;
            public final boolean d;
            public final boolean e;

            public a(vw10 vw10Var, int i, boolean z, boolean z2, boolean z3) {
                this.a = vw10Var;
                this.b = i;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }
        }

        /* compiled from: MediaRouteProvider.java */
        /* renamed from: xsna.bx10$b$b, reason: collision with other inner class name */
        public interface InterfaceC2630b {
            void a(@NonNull b bVar, @Nullable vw10 vw10Var, @NonNull Collection<a> collection);
        }

        @Nullable
        public String j() {
            return null;
        }

        @Nullable
        public String k() {
            return null;
        }

        public final void l(@NonNull vw10 vw10Var, @NonNull ArrayList arrayList) {
            if (vw10Var == null) {
                throw new NullPointerException("groupRoute must not be null");
            }
            synchronized (this.a) {
                try {
                    try {
                        Executor executor = this.b;
                        if (executor != null) {
                            executor.execute(new fv8(this, this.c, vw10Var, arrayList, 1));
                        } else {
                            this.d = vw10Var;
                            this.e = new ArrayList(arrayList);
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }

        public abstract void m(@NonNull String str);

        public abstract void n(@NonNull String str);

        public abstract void o(@Nullable ArrayList arrayList);
    }

    /* compiled from: MediaRouteProvider.java */
    public final class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            bx10 bx10Var = bx10.this;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                bx10Var.g = false;
                bx10Var.i(bx10Var.f);
                return;
            }
            bx10Var.i = false;
            a aVar = bx10Var.e;
            if (aVar != null) {
                dx10 dx10Var = bx10Var.h;
                h1u h1uVar = h1u.this;
                fx10.g d = h1uVar.d(bx10Var);
                if (d != null) {
                    h1uVar.p(d, dx10Var);
                }
            }
        }
    }

    /* compiled from: MediaRouteProvider.java */
    public static final class d {
        public final ComponentName a;

        public d(ComponentName componentName) {
            this.a = componentName;
        }

        @NonNull
        public final String toString() {
            return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
        }
    }

    /* compiled from: MediaRouteProvider.java */
    public static final class f {
        public static final f b = new f(new Bundle());
        public final Bundle a;

        public f(Bundle bundle) {
            this.a = new Bundle(bundle);
        }
    }

    public bx10(Context context, d dVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.b = context;
        if (dVar == null) {
            this.c = new d(new ComponentName(context, getClass()));
        } else {
            this.c = dVar;
        }
    }

    @Nullable
    public b a(@NonNull String str, @NonNull f fVar) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Nullable
    public e f(@NonNull String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Nullable
    public e g(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return h(str, f.b);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Nullable
    public e h(@NonNull String str, @NonNull f fVar) {
        return f(str);
    }

    public final void j(@Nullable dx10 dx10Var) {
        fx10.b();
        if (this.h != dx10Var) {
            this.h = dx10Var;
            if (this.i) {
                return;
            }
            this.i = true;
            this.d.sendEmptyMessage(1);
        }
    }

    public final void k(@Nullable yw10 yw10Var) {
        fx10.b();
        if (Objects.equals(this.f, yw10Var)) {
            return;
        }
        this.f = yw10Var;
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.sendEmptyMessage(2);
    }

    /* compiled from: MediaRouteProvider.java */
    public static abstract class e {
        public void h(int i) {
            g();
        }

        public void d() {
        }

        public void e() {
        }

        @Deprecated
        public void g() {
        }

        public void f(int i) {
        }

        public void i(int i) {
        }
    }

    public void i(@Nullable yw10 yw10Var) {
    }
}
