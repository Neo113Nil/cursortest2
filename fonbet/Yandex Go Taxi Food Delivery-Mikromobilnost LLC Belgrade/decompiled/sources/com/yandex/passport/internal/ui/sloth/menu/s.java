package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.UserMenuProperties;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.a0;
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
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class s extends yr31 implements tse {
    public final n0 b = ffx.c(1, 0, null, 6);
    public final n0 c = ffx.c(1, 0, null, 6);
    public final n0 w = ffx.c(0, 0, null, 7);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(UserMenuProperties userMenuProperties, ModernAccount modernAccount, ContinuationImpl continuationImpl) {
        UserMenuViewModel$bind$1 userMenuViewModel$bind$1;
        int i;
        c1 a;
        l8x l8xVar;
        s sVar = this;
        if (continuationImpl instanceof UserMenuViewModel$bind$1) {
            userMenuViewModel$bind$1 = (UserMenuViewModel$bind$1) continuationImpl;
            int i2 = userMenuViewModel$bind$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userMenuViewModel$bind$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userMenuViewModel$bind$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userMenuViewModel$bind$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PassportProcessGlobalComponent a2 = com.yandex.passport.internal.di.a.a();
                    SlothParams slothParams = new SlothParams(new a0(com.yandex.passport.internal.properties.u.W(userMenuProperties.getTheme()), userMenuProperties.getCustomWebParams(), modernAccount != null ? modernAccount.getUid() : null, modernAccount != null ? new Long(modernAccount.getLocationId()) : null), com.yandex.passport.internal.util.p.u(userMenuProperties.getEnvironment()), null, new CommonWebProperties(false, null, false, false, 15, null), 4, null);
                    com.yandex.passport.internal.ui.challenge.vpn.o oVar = new com.yandex.passport.internal.ui.challenge.vpn.o();
                    oVar.a = slothParams;
                    oVar.b = new com.yandex.passport.sloth.dependencies.f(Collections.singletonList(a2.getSlothUserMenuPerformConfiguration().a));
                    oVar.c = a2.getSlothDependenciesFactory().a();
                    a = oVar.a().a();
                    tje.N(bvf0.a(userMenuViewModel$bind$1.get_context()), null, null, new UserMenuViewModel$bind$$inlined$collectOn$1(a2.getUserMenuEventSender().a, null, sVar), 3);
                    fse fseVar = userMenuViewModel$bind$1.get_context();
                    userMenuViewModel$bind$1.L$0 = sVar;
                    userMenuViewModel$bind$1.L$1 = a;
                    userMenuViewModel$bind$1.label = 1;
                    if (a.c(fseVar, userMenuViewModel$bind$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c1 c1Var = (c1) userMenuViewModel$bind$1.L$1;
                    s sVar2 = (s) userMenuViewModel$bind$1.L$0;
                    kotlin.b.b(obj);
                    a = c1Var;
                    sVar = sVar2;
                }
                tje.N(bvf0.a(userMenuViewModel$bind$1.get_context()), null, null, new UserMenuViewModel$bind$$inlined$collectOn$2(a.c.d, null, sVar), 3);
                tje.N(bvf0.a(userMenuViewModel$bind$1.get_context()), null, null, new UserMenuViewModel$bind$$inlined$collectOn$3(a.c.e, null, sVar), 3);
                l8xVar = (l8x) userMenuViewModel$bind$1.get_context().get(seu.C);
                if (l8xVar != null) {
                    l8xVar.w(new com.yandex.passport.internal.ui.challenge.delete.c1(a, 1));
                }
                return a.C;
            }
        }
        userMenuViewModel$bind$1 = new UserMenuViewModel$bind$1(sVar, continuationImpl);
        Object obj2 = userMenuViewModel$bind$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userMenuViewModel$bind$1.label;
        if (i != 0) {
        }
        tje.N(bvf0.a(userMenuViewModel$bind$1.get_context()), null, null, new UserMenuViewModel$bind$$inlined$collectOn$2(a.c.d, null, sVar), 3);
        tje.N(bvf0.a(userMenuViewModel$bind$1.get_context()), null, null, new UserMenuViewModel$bind$$inlined$collectOn$3(a.c.e, null, sVar), 3);
        l8xVar = (l8x) userMenuViewModel$bind$1.get_context().get(seu.C);
        if (l8xVar != null) {
        }
        return a.C;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return ds31.a(this).a;
    }
}
