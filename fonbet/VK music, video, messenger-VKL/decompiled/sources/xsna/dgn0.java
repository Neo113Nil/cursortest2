package xsna;

import android.app.Application;
import com.vk.api.sdk.VKApiConfig;
import xsna.mgn0;

/* compiled from: SuperappApiCore.kt */
/* loaded from: classes11.dex */
public final class dgn0 {
    public static volatile mgn0 a;
    public static final bpn0 b = new bpn0(new sq6(15));
    public static final bpn0 c = new bpn0(new c13(14));
    public static final bpn0 d = new bpn0(new jnf(10));
    public static final bpn0 e = new bpn0(new knf(14));
    public static final lnf f = new lnf(11);
    public static final bpn0 g;

    static {
        new bpn0(new r12(12));
        g = new bpn0(new s12(7));
    }

    public static mgn0.f a() {
        mgn0 mgn0Var = a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        return mgn0Var.e;
    }

    public static VKApiConfig b() {
        return (VKApiConfig) e.getValue();
    }

    public static l7r0 c() {
        return (l7r0) c.getValue();
    }

    public static Application d() {
        mgn0 mgn0Var = a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        return mgn0Var.a;
    }

    public static String e() {
        return b().f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static mgn0.g f() {
        mgn0 mgn0Var = a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        return (mgn0.g) mgn0Var.k.getValue();
    }

    public static String g() {
        mgn0 mgn0Var = a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        return mgn0Var.e.c.invoke();
    }

    @ozl
    public static String h() {
        mgn0 mgn0Var = a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        String invoke = mgn0Var.e.e.invoke();
        return invoke == null ? "static.".concat(a0a.d) : invoke;
    }
}
