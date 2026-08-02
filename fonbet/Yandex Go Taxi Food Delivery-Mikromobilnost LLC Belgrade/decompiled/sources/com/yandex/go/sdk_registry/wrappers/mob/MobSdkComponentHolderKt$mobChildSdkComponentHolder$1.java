package com.yandex.go.sdk_registry.wrappers.mob;

import defpackage.lr20;
import defpackage.om20;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class MobSdkComponentHolderKt$mobChildSdkComponentHolder$1 extends FunctionReferenceImpl implements wls {
    public static final MobSdkComponentHolderKt$mobChildSdkComponentHolder$1 b = new MobSdkComponentHolderKt$mobChildSdkComponentHolder$1(2, 1, lr20.class, "createMobAndroidChildProcess", "createMobAndroidChildProcess(Lcom/yandex/go/sdk_registry/api/SdkComponentContext;Lcom/yandex/go/sdk_registry/wrappers/mob/MobChildSdkRegistryDependencies;)Lcom/yandex/mob/MobAndroidChildProcess;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        om20 om20Var = (om20) obj2;
        return new com.yandex.mob.b(om20Var.a, om20Var.b, om20Var.c, om20Var.d, om20Var.e);
    }
}
