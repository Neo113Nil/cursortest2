package xsna;

import com.vk.api.sdk.VKApiConfig;

/* compiled from: ExternalApiManager.kt */
/* loaded from: classes.dex */
public final class zdq {
    public static final <T> T a(l7r0 l7r0Var, alv alvVar, ara<? extends T> araVar, boolean z) {
        int i = alvVar.c;
        int i2 = alvVar.d;
        if (i2 != 0) {
            araVar = new qwp(i2, araVar, l7r0Var);
        }
        if (i != 0) {
            araVar = new fjr0(l7r0Var, i, araVar, l7r0Var.d);
        }
        if (z) {
            if (i < 1) {
                i = 1;
            }
            araVar = new xj(i, araVar, l7r0Var);
        }
        String str = alvVar.a;
        vx5 vx5Var = new vx5();
        VKApiConfig vKApiConfig = l7r0Var.a;
        return (T) l7r0Var.h(new tgx(l7r0Var, str, new z1p0(vx5Var, vKApiConfig.v, vKApiConfig.u, vKApiConfig.w, null, 112), araVar));
    }
}
