package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.ffx;
import defpackage.fse;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.seu;
import defpackage.tje;
import defpackage.tse;
import defpackage.yr31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class v extends yr31 implements tse {
    public final kotlinx.coroutines.flow.n0 b = ffx.c(0, 0, null, 7);

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(SlothParams slothParams, ContinuationImpl continuationImpl) {
        ManagingPlusDevicesSlothViewModel$bind$1 managingPlusDevicesSlothViewModel$bind$1;
        int i;
        v vVar;
        c1 c1Var;
        com.yandex.passport.sloth.data.q qVar;
        PassportProcessGlobalComponent passportProcessGlobalComponent;
        l8x l8xVar;
        if (continuationImpl instanceof ManagingPlusDevicesSlothViewModel$bind$1) {
            managingPlusDevicesSlothViewModel$bind$1 = (ManagingPlusDevicesSlothViewModel$bind$1) continuationImpl;
            int i2 = managingPlusDevicesSlothViewModel$bind$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                managingPlusDevicesSlothViewModel$bind$1.label = i2 - Integer.MIN_VALUE;
                Object obj = managingPlusDevicesSlothViewModel$bind$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = managingPlusDevicesSlothViewModel$bind$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.sloth.data.c0 variant = slothParams.getVariant();
                    com.yandex.passport.sloth.data.q qVar2 = variant instanceof com.yandex.passport.sloth.data.q ? (com.yandex.passport.sloth.data.q) variant : null;
                    PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
                    com.yandex.passport.internal.ui.challenge.vpn.o oVar = new com.yandex.passport.internal.ui.challenge.vpn.o();
                    oVar.a = slothParams;
                    oVar.b = a.getSlothStandalonePerformConfiguration().a();
                    oVar.c = a.getSlothDependenciesFactory().a();
                    c1 a2 = oVar.a().a();
                    fse fseVar = managingPlusDevicesSlothViewModel$bind$1.get_context();
                    managingPlusDevicesSlothViewModel$bind$1.L$0 = this;
                    managingPlusDevicesSlothViewModel$bind$1.L$1 = qVar2;
                    managingPlusDevicesSlothViewModel$bind$1.L$2 = a;
                    managingPlusDevicesSlothViewModel$bind$1.L$3 = a2;
                    managingPlusDevicesSlothViewModel$bind$1.label = 1;
                    if (a2.c(fseVar, managingPlusDevicesSlothViewModel$bind$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar = this;
                    c1Var = a2;
                    qVar = qVar2;
                    passportProcessGlobalComponent = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c1Var = (c1) managingPlusDevicesSlothViewModel$bind$1.L$3;
                    PassportProcessGlobalComponent passportProcessGlobalComponent2 = (PassportProcessGlobalComponent) managingPlusDevicesSlothViewModel$bind$1.L$2;
                    com.yandex.passport.sloth.data.q qVar3 = (com.yandex.passport.sloth.data.q) managingPlusDevicesSlothViewModel$bind$1.L$1;
                    v vVar2 = (v) managingPlusDevicesSlothViewModel$bind$1.L$0;
                    kotlin.b.b(obj);
                    passportProcessGlobalComponent = passportProcessGlobalComponent2;
                    qVar = qVar3;
                    vVar = vVar2;
                }
                tje.N(bvf0.a(managingPlusDevicesSlothViewModel$bind$1.get_context()), null, null, new ManagingPlusDevicesSlothViewModel$bind$$inlined$collectOn$1(c1Var.c.e, null, passportProcessGlobalComponent, qVar, vVar), 3);
                tje.N(bvf0.a(managingPlusDevicesSlothViewModel$bind$1.get_context()), null, null, new ManagingPlusDevicesSlothViewModel$bind$$inlined$collectOn$2(c1Var.c.d, null, passportProcessGlobalComponent, qVar, vVar), 3);
                l8xVar = (l8x) managingPlusDevicesSlothViewModel$bind$1.get_context().get(seu.C);
                if (l8xVar != null) {
                    l8xVar.w(new com.yandex.passport.internal.ui.challenge.delete.c1(c1Var, 2));
                }
                return c1Var.C;
            }
        }
        managingPlusDevicesSlothViewModel$bind$1 = new ManagingPlusDevicesSlothViewModel$bind$1(this, continuationImpl);
        Object obj2 = managingPlusDevicesSlothViewModel$bind$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = managingPlusDevicesSlothViewModel$bind$1.label;
        if (i != 0) {
        }
        tje.N(bvf0.a(managingPlusDevicesSlothViewModel$bind$1.get_context()), null, null, new ManagingPlusDevicesSlothViewModel$bind$$inlined$collectOn$1(c1Var.c.e, null, passportProcessGlobalComponent, qVar, vVar), 3);
        tje.N(bvf0.a(managingPlusDevicesSlothViewModel$bind$1.get_context()), null, null, new ManagingPlusDevicesSlothViewModel$bind$$inlined$collectOn$2(c1Var.c.d, null, passportProcessGlobalComponent, qVar, vVar), 3);
        l8xVar = (l8x) managingPlusDevicesSlothViewModel$bind$1.get_context().get(seu.C);
        if (l8xVar != null) {
        }
        return c1Var.C;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return ds31.a(this).a;
    }
}
