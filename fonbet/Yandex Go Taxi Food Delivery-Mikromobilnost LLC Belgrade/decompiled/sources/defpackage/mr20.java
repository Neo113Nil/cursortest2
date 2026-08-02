package defpackage;

import com.yandex.go.sdk_registry.api.SdkComponentTier;
import com.yandex.go.sdk_registry.api.SdkLifecycleStage;
import com.yandex.go.sdk_registry.wrappers.mob.b;

/* loaded from: classes13.dex */
public abstract class mr20 {
    public static final qnp0 a;
    public static final inp0 b;
    public static final qnp0 c;
    public static final inp0 d;
    public static final lnp0 e;
    public static final b f;
    public static final lnp0 g;
    public static final b h;

    static {
        vnp0.a("MobSdk");
        qnp0 qnp0Var = new qnp0("MobSdk");
        a = qnp0Var;
        b = new inp0();
        vnp0.a("MobChildSdk");
        qnp0 qnp0Var2 = new qnp0("MobChildSdk");
        c = qnp0Var2;
        d = new inp0();
        SdkComponentTier sdkComponentTier = SdkComponentTier.TIER_1;
        SdkLifecycleStage sdkLifecycleStage = SdkLifecycleStage.APP_CONFIGURATION;
        e = new lnp0(qnp0Var, sdkComponentTier, sdkLifecycleStage, sdkLifecycleStage);
        f = new b(0);
        g = new lnp0(qnp0Var2, sdkComponentTier, SdkLifecycleStage.LCP, sdkLifecycleStage);
        h = new b(1);
    }

    public static final qnp0 a() {
        return a;
    }
}
