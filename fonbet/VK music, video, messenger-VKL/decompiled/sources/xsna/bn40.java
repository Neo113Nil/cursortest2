package xsna;

import com.vk.log.L;
import java.util.ArrayList;

/* compiled from: MusicLogger.kt */
/* loaded from: classes.dex */
public final class bn40 {
    public static final bn40 a = new bn40();
    public static final String b = bn40.class.getName();
    public static wzs<? super String, ? super gzs<? extends Object>, s3q0> c = new zm40();

    public static final void a(RuntimeException runtimeException, Object... objArr) {
        L.LogType logType = L.LogType.d;
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.a("MusicLog : ");
        rmk0Var.b(objArr);
        ArrayList<Object> arrayList = rmk0Var.a;
        L.v(logType, b, runtimeException, arrayList.toArray(new Object[arrayList.size()]));
    }

    public static final void b(Object... objArr) {
        L.LogType logType = L.LogType.d;
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.a("MusicLog : ");
        rmk0Var.b(objArr);
        ArrayList<Object> arrayList = rmk0Var.a;
        L.v(logType, b, null, arrayList.toArray(new Object[arrayList.size()]));
    }

    public static final void c(Throwable th, Object... objArr) {
        L.LogType logType = L.LogType.e;
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.a("MusicLog : ");
        rmk0Var.b(objArr);
        ArrayList<Object> arrayList = rmk0Var.a;
        L.v(logType, b, th, arrayList.toArray(new Object[arrayList.size()]));
    }

    public static final void d(Object... objArr) {
        L.LogType logType = L.LogType.e;
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.a("MusicLog : ");
        rmk0Var.b(objArr);
        ArrayList<Object> arrayList = rmk0Var.a;
        L.v(logType, b, null, arrayList.toArray(new Object[arrayList.size()]));
    }

    public static final void e(yj40 yj40Var) {
        f("got " + yj40Var.getTag() + " event: " + yj40Var.a());
    }

    public static final void f(Object... objArr) {
        L.LogType logType = L.LogType.i;
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.a("MusicLog : ");
        rmk0Var.b(objArr);
        ArrayList<Object> arrayList = rmk0Var.a;
        L.v(logType, b, null, arrayList.toArray(new Object[arrayList.size()]));
    }

    public static final void g(String str, Object... objArr) {
        if (objArr.length == 0) {
            f(str, " request success ");
            return;
        }
        rmk0 rmk0Var = new rmk0(3);
        rmk0Var.a(str);
        rmk0Var.a(" request success with result: ");
        rmk0Var.b(objArr);
        ArrayList<Object> arrayList = rmk0Var.a;
        f(arrayList.toArray(new Object[arrayList.size()]));
    }

    public static final void h(Object... objArr) {
        L.LogType logType = L.LogType.w;
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.a("MusicLog : ");
        rmk0Var.b(objArr);
        ArrayList<Object> arrayList = rmk0Var.a;
        L.v(logType, b, null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
