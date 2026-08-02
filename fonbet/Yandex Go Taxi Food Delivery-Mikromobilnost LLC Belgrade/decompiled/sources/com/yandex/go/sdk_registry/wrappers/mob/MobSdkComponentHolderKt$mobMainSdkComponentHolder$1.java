package com.yandex.go.sdk_registry.wrappers.mob;

import android.content.Context;
import com.yandex.go.proxyprovision.mob.d;
import com.yandex.mob.api.model.MobEnvironment;
import defpackage.ap20;
import defpackage.fop0;
import defpackage.gnp0;
import defpackage.hnp0;
import defpackage.lr20;
import defpackage.mdh;
import defpackage.npt;
import defpackage.ny61;
import defpackage.qm20;
import defpackage.sjh;
import defpackage.tot;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yn20;
import defpackage.zn20;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class MobSdkComponentHolderKt$mobMainSdkComponentHolder$1 extends FunctionReferenceImpl implements wls {
    public static final MobSdkComponentHolderKt$mobMainSdkComponentHolder$1 b = new MobSdkComponentHolderKt$mobMainSdkComponentHolder$1(2, 1, lr20.class, "createMobAndroidMainProcess", "createMobAndroidMainProcess(Lcom/yandex/go/sdk_registry/api/SdkComponentContext;Lcom/yandex/go/sdk_registry/wrappers/mob/MobMainSdkRegistryDependencies;)Lcom/yandex/mob/MobAndroidMainProcess;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ap20 ap20Var = (ap20) obj2;
        hnp0 a = ((gnp0) obj).a(fop0.a);
        if (a == null) {
            ny61.g("Required value was null.");
            return null;
        }
        Context context = ap20Var.a;
        MobEnvironment mobEnvironment = ap20Var.b;
        yn20 yn20Var = ap20Var.c;
        qm20 qm20Var = ap20Var.d;
        List list = ap20Var.e;
        zn20 zn20Var = ap20Var.f;
        npt nptVar = ap20Var.g;
        com.yandex.go.proxyprovision.mob.a aVar = ap20Var.h;
        tot totVar = ap20Var.i;
        d dVar = ap20Var.j;
        sjh sjhVar = uyj.a;
        return new com.yandex.mob.d(context, mobEnvironment, qm20Var, list, zn20Var, nptVar, aVar, yn20Var, totVar, dVar, ap20Var.l, ap20Var.m, mdh.b, ap20Var.n);
    }
}
