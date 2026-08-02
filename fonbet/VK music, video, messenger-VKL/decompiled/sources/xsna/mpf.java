package xsna;

import com.vk.log.L;
import java.util.Arrays;

/* compiled from: ClipsVkLogger.kt */
/* loaded from: classes.dex */
public final class mpf implements xke {
    @Override // xsna.xke
    public final void a(String str, Throwable th) {
        L.g(str, th);
    }

    @Override // xsna.xke
    public final void b(Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(th);
    }

    @Override // xsna.xke
    public final void c(Throwable th) {
        com.vk.metrics.eventtracking.b.a.q(th);
    }

    @Override // xsna.xke
    public final void d(Object... objArr) {
        L.p(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // xsna.xke
    public final void e(Object... objArr) {
        L.e(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // xsna.xke
    public final void f(String... strArr) {
        L.G((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // xsna.xke
    public final void g(Throwable th, Object... objArr) {
        L.j(th, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // xsna.xke
    public final void h(String... strArr) {
        L.l((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // xsna.xke
    public final void e(String str, String str2, Throwable th) {
        L.f(str, str2, th);
    }
}
