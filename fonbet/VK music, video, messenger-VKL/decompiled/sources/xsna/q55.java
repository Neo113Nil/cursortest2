package xsna;

import android.annotation.SuppressLint;
import com.vk.auth.api.models.AuthResult;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.p4g;
import xsna.t25;

/* compiled from: AuthLib.kt */
/* loaded from: classes.dex */
public final class q55 {
    public static final q55 a = new q55();
    public static final CopyOnWriteArrayList<s25> b = new CopyOnWriteArrayList<>();
    public static a c;

    @SuppressLint({"StaticFieldLeak"})
    public static com.vk.auth.main.a d;

    /* compiled from: AuthLib.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final sk3<s25> a;
        public final AuthResult b;
        public boolean c;

        /* compiled from: AuthLib.kt */
        /* renamed from: xsna.q55$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3549a implements t25.a, g0t {
            public C3549a() {
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof t25.a) && (obj instanceof g0t)) {
                    return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // xsna.g0t
            public final xzs<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(0, a.this, a.class, "callOnAuth", "callOnAuth()V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // xsna.t25.a
            public final void onComplete() {
                a.this.a();
            }
        }

        public a(sk3<s25> sk3Var, AuthResult authResult) {
            this.a = sk3Var;
            this.b = authResult;
        }

        public final void a() {
            s25 m;
            boolean z;
            AuthResult authResult;
            while (true) {
                sk3<s25> sk3Var = this.a;
                if (sk3Var.isEmpty() || this.c || (m = sk3Var.m()) == null) {
                    return;
                }
                try {
                    z = m instanceof t25;
                    authResult = this.b;
                } catch (Throwable th) {
                    par0.a.getClass();
                    par0.d(th);
                }
                if (z) {
                    ((t25) m).c(authResult, new C3549a());
                    return;
                }
                m.n(authResult);
            }
        }

        public final void b() {
            this.c = true;
        }
    }

    /* compiled from: AuthLib.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(Object obj) {
            super(1, obj, par0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((par0) this.receiver).getClass();
            par0.d(th);
            return s3q0.a;
        }
    }

    public static void a(s25 s25Var) {
        b.add(s25Var);
    }

    public static void b(izs izsVar) {
        List y0 = j5g.y0(b);
        b bVar = new b(par0.a);
        p4g.a aVar = p4g.a;
        Iterator it = y0.iterator();
        while (it.hasNext()) {
            try {
                izsVar.invoke(it.next());
            } catch (Throwable th) {
                bVar.invoke(th);
            }
        }
    }

    public static com.vk.auth.main.a c() {
        com.vk.auth.main.a aVar = d;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Auth lib wasn't initialized");
    }

    public static void d(AuthResult authResult) {
        c().a.L = null;
        a aVar = new a(new sk3(b), authResult);
        a aVar2 = c;
        if (aVar2 != null) {
            aVar2.b();
        }
        c = aVar;
        aVar.a();
    }

    public static void e(s25 s25Var) {
        b.remove(s25Var);
    }
}
