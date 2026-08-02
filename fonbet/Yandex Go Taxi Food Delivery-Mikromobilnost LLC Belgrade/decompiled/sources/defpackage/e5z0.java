package defpackage;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class e5z0 extends g5z0 {
    @Override // defpackage.g5z0
    public final void a(String str, Object... objArr) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.g5z0
    public final void b(Throwable th) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.b(th);
        }
    }

    @Override // defpackage.g5z0
    public final void c(Throwable th, String str, Object... objArr) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.c(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.g5z0
    public final void d(String str, Object... objArr) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.d(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.g5z0
    public final void e(Throwable th) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.e(th);
        }
    }

    @Override // defpackage.g5z0
    public final void f(Throwable th, String str, Object... objArr) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.f(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.g5z0
    public final void g(String str, Object... objArr) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.g(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.g5z0
    public final void h() {
        throw new AssertionError();
    }

    @Override // defpackage.g5z0
    public final void j(String str, Object... objArr) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.j(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.g5z0
    public final void k(Throwable th) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.k(th);
        }
    }

    @Override // defpackage.g5z0
    public final void l(Throwable th, Object... objArr) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.l(th, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public final void m(String str) {
        for (g5z0 g5z0Var : i5z0.b) {
            g5z0Var.a.set(str);
        }
    }
}
