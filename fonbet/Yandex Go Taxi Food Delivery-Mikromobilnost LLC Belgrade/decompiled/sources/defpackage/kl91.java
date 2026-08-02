package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes11.dex */
public final class kl91 extends yta1 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new jl91());
            }
            try {
                c = unsafe.objectFieldOffset(ql91.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(ql91.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(ql91.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(ll91.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(ll91.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                ny61.j(e2);
            }
        } catch (PrivilegedActionException e3) {
            ny61.n("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.yta1
    public final el91 f(ql91 ql91Var) {
        el91 el91Var;
        el91 el91Var2 = el91.d;
        do {
            el91Var = ql91Var.b;
            if (el91Var2 == el91Var) {
                break;
            }
        } while (!j(ql91Var, el91Var, el91Var2));
        return el91Var;
    }

    @Override // defpackage.yta1
    public final ll91 g(ql91 ql91Var) {
        ll91 ll91Var;
        ll91 ll91Var2 = ll91.c;
        do {
            ll91Var = ql91Var.c;
            if (ll91Var2 == ll91Var) {
                break;
            }
        } while (!l(ql91Var, ll91Var, ll91Var2));
        return ll91Var;
    }

    @Override // defpackage.yta1
    public final void h(ll91 ll91Var, ll91 ll91Var2) {
        a.putObject(ll91Var, f, ll91Var2);
    }

    @Override // defpackage.yta1
    public final void i(ll91 ll91Var, Thread thread) {
        a.putObject(ll91Var, e, thread);
    }

    @Override // defpackage.yta1
    public final boolean j(ql91 ql91Var, el91 el91Var, el91 el91Var2) {
        return km91.a(a, ql91Var, b, el91Var, el91Var2);
    }

    @Override // defpackage.yta1
    public final boolean k(ql91 ql91Var, Object obj, Object obj2) {
        return km91.a(a, ql91Var, d, obj, obj2);
    }

    @Override // defpackage.yta1
    public final boolean l(ql91 ql91Var, ll91 ll91Var, ll91 ll91Var2) {
        return km91.a(a, ql91Var, c, ll91Var, ll91Var2);
    }
}
