package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import ru.yandex.video.m3.player.drm.DrmLoadException;

/* loaded from: classes10.dex */
public final class d5z0 extends f5z0 {
    @Override // defpackage.f5z0
    public final void a(String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void b(Throwable th, String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.b(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void c(DrmLoadException.ErrorDiagnostic errorDiagnostic) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.c(errorDiagnostic);
        }
    }

    @Override // defpackage.f5z0
    public final void d(String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.d(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void e(Throwable th) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.e(th);
        }
    }

    @Override // defpackage.f5z0
    public final void f(Throwable th, String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.f(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void h(String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.h(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void i(Throwable th, String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.i(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void k(int i, String str, String str2) {
        throw new AssertionError();
    }

    @Override // defpackage.f5z0
    public final void m(String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.m(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void n(Throwable th, String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.n(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void o(String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.o(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void p(Throwable th, String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.p(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void q(String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.q(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.f5z0
    public final void r(Throwable th, String str, Object... objArr) {
        for (f5z0 f5z0Var : h5z0.c) {
            f5z0Var.r(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public final void s(f5z0 f5z0Var) {
        if (f5z0Var == this) {
            ny61.g("Cannot plant Timber into itself.");
            return;
        }
        ArrayList arrayList = h5z0.b;
        synchronized (arrayList) {
            arrayList.add(f5z0Var);
            Object[] array = arrayList.toArray(new f5z0[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            h5z0.c = (f5z0[]) array;
        }
    }

    public final void t(String str) {
        f5z0[] f5z0VarArr = h5z0.c;
        int length = f5z0VarArr.length;
        int i = 0;
        while (i < length) {
            f5z0 f5z0Var = f5z0VarArr[i];
            i++;
            f5z0Var.a.set(str);
        }
    }
}
