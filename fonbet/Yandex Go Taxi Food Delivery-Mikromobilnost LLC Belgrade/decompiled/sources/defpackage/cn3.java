package defpackage;

import com.yandex.messaging.auth.AuthEnvironment;

/* loaded from: classes15.dex */
public abstract class cn3 {
    public static xm3 f() {
        return new xm3();
    }

    public static bn3 g(String str, AuthEnvironment authEnvironment) {
        return authEnvironment == AuthEnvironment.TeamProduction ? new ym3(str, 1) : new zm3(str);
    }

    public static ym3 i(String str) {
        return new ym3(str, 0);
    }

    public t4j0 a(t4j0 t4j0Var) {
        return t4j0Var;
    }

    public bn3 b() {
        throw new IllegalStateException();
    }

    public boolean c(String str) {
        return false;
    }

    public boolean d(String str, String str2) {
        return false;
    }

    public boolean e() {
        return false;
    }

    public cn3 h(String str, AuthEnvironment authEnvironment) {
        throw new IllegalStateException();
    }
}
