package xsna;

import android.util.Log;
import java.util.Arrays;

/* compiled from: ClipsLoggerDefault.kt */
/* loaded from: classes.dex */
public final class yke implements xke {
    public static String i(Object... objArr) {
        return rl3.Z(objArr, " | ", null, null, new nj(7), 30);
    }

    @Override // xsna.xke
    public final void a(String str, Throwable th) {
        g(th, str);
    }

    @Override // xsna.xke
    public final void b(Throwable th) {
        g(th, new Object[0]);
    }

    @Override // xsna.xke
    public final void c(Throwable th) {
        b(th);
    }

    @Override // xsna.xke
    public final void d(Object... objArr) {
        i(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // xsna.xke
    public final void e(Object... objArr) {
        i(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // xsna.xke
    public final void f(String... strArr) {
        i(Arrays.copyOf(strArr, strArr.length));
    }

    @Override // xsna.xke
    public final void g(Throwable th, Object... objArr) {
        Log.e("ClipsLoggerDefault", i(Arrays.copyOf(objArr, objArr.length)) + "\nError: " + mnh0.A(th));
    }

    @Override // xsna.xke
    public final void h(String... strArr) {
        Log.e("ClipsLoggerDefault", i(Arrays.copyOf(strArr, strArr.length)));
    }

    @Override // xsna.xke
    public final void e(String str, String str2, Throwable th) {
        g(th, str, str2);
    }
}
