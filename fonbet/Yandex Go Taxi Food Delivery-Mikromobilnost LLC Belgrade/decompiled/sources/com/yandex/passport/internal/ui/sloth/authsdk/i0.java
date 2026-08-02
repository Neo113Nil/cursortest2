package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.ffx;
import defpackage.fse;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.yr31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class i0 extends yr31 implements tse {
    public c1 c;
    public final zd b = new zd();
    public final n0 w = ffx.c(1, 0, null, 6);
    public final n0 x = ffx.c(1, 0, null, 6);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(SlothParams slothParams, ContinuationImpl continuationImpl) {
        AuthSdkSlothViewModel$bind$1 authSdkSlothViewModel$bind$1;
        int i;
        c1 c1Var;
        c1 c1Var2;
        c1 c1Var3;
        if (continuationImpl instanceof AuthSdkSlothViewModel$bind$1) {
            authSdkSlothViewModel$bind$1 = (AuthSdkSlothViewModel$bind$1) continuationImpl;
            int i2 = authSdkSlothViewModel$bind$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authSdkSlothViewModel$bind$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authSdkSlothViewModel$bind$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authSdkSlothViewModel$bind$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
                    com.yandex.passport.internal.ui.challenge.vpn.o oVar = new com.yandex.passport.internal.ui.challenge.vpn.o();
                    slothParams.getClass();
                    oVar.a = slothParams;
                    oVar.b = a.getSlothStandalonePerformConfiguration().a();
                    oVar.c = a.getSlothDependenciesFactory().a();
                    c1 a2 = oVar.a().a();
                    this.c = a2;
                    if (a2 == null) {
                        a2 = null;
                    }
                    fse fseVar = authSdkSlothViewModel$bind$1.get_context();
                    authSdkSlothViewModel$bind$1.L$0 = this;
                    authSdkSlothViewModel$bind$1.label = 1;
                    if (a2.c(fseVar, authSdkSlothViewModel$bind$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (i0) authSdkSlothViewModel$bind$1.L$0;
                    kotlin.b.b(obj);
                }
                c1Var = this.c;
                if (c1Var == null) {
                    c1Var = null;
                }
                tje.N(bvf0.a(authSdkSlothViewModel$bind$1.get_context()), null, null, new AuthSdkSlothViewModel$bind$$inlined$collectOn$1(c1Var.c.d, null, this), 3);
                c1Var2 = this.c;
                if (c1Var2 == null) {
                    c1Var2 = null;
                }
                tje.N(bvf0.a(authSdkSlothViewModel$bind$1.get_context()), null, null, new AuthSdkSlothViewModel$bind$$inlined$collectOn$2(c1Var2.c.e, null, this), 3);
                c1Var3 = this.c;
                if (c1Var3 == null) {
                    c1Var3 = null;
                }
                tje.N(bvf0.a(authSdkSlothViewModel$bind$1.get_context()), null, null, new AuthSdkSlothViewModel$bind$$inlined$collectOn$3(c1Var3.C.b(), null, this), 3);
                c1 c1Var4 = this.c;
                return (c1Var4 != null ? c1Var4 : null).C;
            }
        }
        authSdkSlothViewModel$bind$1 = new AuthSdkSlothViewModel$bind$1(this, continuationImpl);
        Object obj2 = authSdkSlothViewModel$bind$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authSdkSlothViewModel$bind$1.label;
        if (i != 0) {
        }
        c1Var = this.c;
        if (c1Var == null) {
        }
        tje.N(bvf0.a(authSdkSlothViewModel$bind$1.get_context()), null, null, new AuthSdkSlothViewModel$bind$$inlined$collectOn$1(c1Var.c.d, null, this), 3);
        c1Var2 = this.c;
        if (c1Var2 == null) {
        }
        tje.N(bvf0.a(authSdkSlothViewModel$bind$1.get_context()), null, null, new AuthSdkSlothViewModel$bind$$inlined$collectOn$2(c1Var2.c.e, null, this), 3);
        c1Var3 = this.c;
        if (c1Var3 == null) {
        }
        tje.N(bvf0.a(authSdkSlothViewModel$bind$1.get_context()), null, null, new AuthSdkSlothViewModel$bind$$inlined$collectOn$3(c1Var3.C.b(), null, this), 3);
        c1 c1Var42 = this.c;
        return (c1Var42 != null ? c1Var42 : null).C;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return ds31.a(this).a;
    }
}
