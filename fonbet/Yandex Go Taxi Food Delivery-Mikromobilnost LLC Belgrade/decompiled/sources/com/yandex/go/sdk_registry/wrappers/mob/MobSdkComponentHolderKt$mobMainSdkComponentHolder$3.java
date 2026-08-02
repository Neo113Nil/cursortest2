package com.yandex.go.sdk_registry.wrappers.mob;

import com.yandex.mob.d;
import defpackage.ap20;
import defpackage.dab1;
import defpackage.eop0;
import defpackage.fop0;
import defpackage.gnp0;
import defpackage.jop0;
import defpackage.lr20;
import defpackage.mr20;
import defpackage.qop0;
import defpackage.rop0;
import defpackage.xpp0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class MobSdkComponentHolderKt$mobMainSdkComponentHolder$3 extends FunctionReferenceImpl implements zls {
    public static final MobSdkComponentHolderKt$mobMainSdkComponentHolder$3 b = new MobSdkComponentHolderKt$mobMainSdkComponentHolder$3(3, 1, lr20.class, "startMainMobAppLifecycle", "startMainMobAppLifecycle(Lcom/yandex/go/sdk_registry/api/SdkComponentContext;Lcom/yandex/mob/MobAndroidMainProcess;Lcom/yandex/go/sdk_registry/wrappers/mob/MobMainSdkRegistryDependencies;)V");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gnp0 gnp0Var = (gnp0) obj;
        d dVar = (d) obj2;
        ap20 ap20Var = (ap20) obj3;
        dab1 dab1Var = ((xpp0) gnp0Var.a(rop0.a)) != null ? dab1.G : null;
        String str = mr20.a.a;
        com.yandex.go.sdk_registry.a aVar = (com.yandex.go.sdk_registry.a) gnp0Var.a(jop0.a);
        if (aVar != null) {
            eop0 eop0Var = (eop0) gnp0Var.a(fop0.a);
            if (eop0Var != null) {
                aVar.a(new MobSdkComponentHolderKt$startMainMobAppLifecycle$1(new Ref$BooleanRef(), eop0Var, ap20Var, dVar, null));
            } else if (dab1Var != null) {
                qop0.b(dab1Var, str, "Host dispatchers adapter is missing for MOB app lifecycle");
            }
        } else if (dab1Var != null) {
            qop0.b(dab1Var, str, "Host lifecycle adapter is missing for MOB app lifecycle");
        }
        return zy11.a;
    }
}
