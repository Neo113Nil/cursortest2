package defpackage;

import java.util.Arrays;
import kotlin.a;
import ru.yandex.video.m3.player.drm.DrmLoadException;

/* loaded from: classes.dex */
public final class hot extends f5z0 {
    public final ThreadLocal b = new ThreadLocal();
    public final i3y c = a.a(new gmt(6));

    public static /* synthetic */ void t(hot hotVar, int i, Throwable th, String str, Object[] objArr, int i2) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        hotVar.s(i, th, str, objArr);
    }

    @Override // defpackage.f5z0
    public final void a(String str, Object... objArr) {
        t(this, 5, null, str, Arrays.copyOf(objArr, objArr.length), 2);
    }

    @Override // defpackage.f5z0
    public final void b(Throwable th, String str, Object... objArr) {
        s(5, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.f5z0
    public final void c(DrmLoadException.ErrorDiagnostic errorDiagnostic) {
        t(this, 5, errorDiagnostic, null, new Object[0], 4);
    }

    @Override // defpackage.f5z0
    public final void d(String str, Object... objArr) {
        t(this, 15, null, str, Arrays.copyOf(objArr, objArr.length), 2);
    }

    @Override // defpackage.f5z0
    public final void e(Throwable th) {
        t(this, 15, th, null, new Object[0], 4);
    }

    @Override // defpackage.f5z0
    public final void f(Throwable th, String str, Object... objArr) {
        s(15, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.f5z0
    public final void h(String str, Object... objArr) {
        t(this, 10, null, str, Arrays.copyOf(objArr, objArr.length), 2);
    }

    @Override // defpackage.f5z0
    public final void i(Throwable th, String str, Object... objArr) {
        s(10, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.f5z0
    public final boolean j(String str) {
        if (str == null) {
            return false;
        }
        this.b.set(str);
        return false;
    }

    @Override // defpackage.f5z0
    public final void k(int i, String str, String str2) {
    }

    @Override // defpackage.f5z0
    public final void m(String str, Object... objArr) {
        t(this, 5, null, str, Arrays.copyOf(objArr, objArr.length), 2);
    }

    @Override // defpackage.f5z0
    public final void n(Throwable th, String str, Object... objArr) {
        s(5, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.f5z0
    public final void o(String str, Object... objArr) {
        t(this, 15, null, str, Arrays.copyOf(objArr, objArr.length), 2);
    }

    @Override // defpackage.f5z0
    public final void p(Throwable th, String str, Object... objArr) {
        s(15, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.f5z0
    public final void q(String str, Object... objArr) {
        t(this, 20, null, str, Arrays.copyOf(objArr, objArr.length), 2);
    }

    @Override // defpackage.f5z0
    public final void r(Throwable th, String str, Object... objArr) {
        s(20, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final void s(int i, Throwable th, String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l(i, th, str, Arrays.copyOf(copyOf, copyOf.length));
        jst jstVar = (jst) this.c.getValue();
        ThreadLocal threadLocal = this.b;
        String str2 = (String) threadLocal.get();
        if (str2 != null) {
            threadLocal.remove();
        }
        ke00 a = jstVar.b.a();
        if (a == null || !a.b(i)) {
            return;
        }
        if (str != null && str.length() != 0 && objArr.length != 0) {
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            str = String.format(str, Arrays.copyOf(copyOf2, copyOf2.length));
        }
        a.a(i, str2, th, str, jstVar.a);
    }
}
