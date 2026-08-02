package xsna;

import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import xsna.g0v;

/* compiled from: VkHealthStatusExt.kt */
/* loaded from: classes6.dex */
public final class jyu0 {
    public static final boolean a(iyu0 iyu0Var) {
        return b(iyu0Var) || d(iyu0Var) || c(iyu0Var);
    }

    public static final boolean b(iyu0 iyu0Var) {
        return iyu0Var.h == MobileServicesType.GOOGLE_PLAY && iyu0Var.a && iyu0Var.b && iyu0Var.c;
    }

    public static final boolean c(iyu0 iyu0Var) {
        return iyu0Var.h == MobileServicesType.GOOGLE_PLAY && iyu0Var.a && iyu0Var.b && epx.f(iyu0Var.f, g0v.b.a);
    }

    public static final boolean d(iyu0 iyu0Var) {
        return iyu0Var.h == MobileServicesType.HUAWEI && iyu0Var.a && iyu0Var.e;
    }

    public static final boolean e(iyu0 iyu0Var) {
        return iyu0Var.a && iyu0Var.b && iyu0Var.c;
    }

    public static final boolean f(iyu0 iyu0Var) {
        return iyu0Var.a && iyu0Var.b && epx.f(iyu0Var.f, g0v.b.a);
    }
}
