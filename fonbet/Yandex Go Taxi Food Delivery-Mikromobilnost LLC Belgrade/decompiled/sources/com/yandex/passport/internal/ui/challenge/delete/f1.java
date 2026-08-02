package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.fse;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.seu;
import defpackage.tje;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class f1 extends com.yandex.passport.internal.ui.challenge.u {
    public y0 c;
    public final PassportProcessGlobalComponent w;
    public final com.yandex.passport.internal.report.reporters.i1 x;

    public f1() {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.w = a;
        this.x = a.getWebAmReporter();
    }

    @Override // com.yandex.passport.internal.ui.challenge.u
    public final com.yandex.passport.internal.ui.challenge.o W(com.yandex.passport.internal.ui.challenge.l lVar) {
        com.yandex.passport.internal.ui.challenge.k kVar = (com.yandex.passport.internal.ui.challenge.k) lVar;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.w;
        ModernAccount e = passportProcessGlobalComponent.getAccountsRetriever().a().e(kVar.c);
        y0 y0Var = (y0) passportProcessGlobalComponent.createDeleteForever().challengeData(kVar).isChallengeNeeded(e != null ? e.isPhonish() : true).viewModel(this).build().getSessionProvider().get();
        this.c = y0Var;
        if (y0Var == null) {
            return null;
        }
        return y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object X(PassportDeleteAccountPropertiesImpl passportDeleteAccountPropertiesImpl, long j, ContinuationImpl continuationImpl) {
        DeleteForeverViewModel$bind$1 deleteForeverViewModel$bind$1;
        int i;
        com.yandex.passport.sloth.c1 a;
        l8x l8xVar;
        f1 f1Var = this;
        if (continuationImpl instanceof DeleteForeverViewModel$bind$1) {
            deleteForeverViewModel$bind$1 = (DeleteForeverViewModel$bind$1) continuationImpl;
            int i2 = deleteForeverViewModel$bind$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteForeverViewModel$bind$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteForeverViewModel$bind$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteForeverViewModel$bind$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SlothParams slothParams = new SlothParams(new com.yandex.passport.sloth.data.i(j, com.yandex.passport.internal.util.p.B(passportDeleteAccountPropertiesImpl.getUid()), com.yandex.passport.internal.properties.u.W(passportDeleteAccountPropertiesImpl.getTheme())), com.yandex.passport.internal.util.p.B(passportDeleteAccountPropertiesImpl.getUid()).getEnvironment(), null, new CommonWebProperties(false, null, false, false, 15, null), 4, null);
                    com.yandex.passport.internal.ui.challenge.vpn.o oVar = new com.yandex.passport.internal.ui.challenge.vpn.o();
                    oVar.a = slothParams;
                    PassportProcessGlobalComponent passportProcessGlobalComponent = f1Var.w;
                    oVar.b = passportProcessGlobalComponent.getSlothStandalonePerformConfiguration().a();
                    oVar.c = passportProcessGlobalComponent.getSlothDependenciesFactory().a();
                    a = oVar.a().a();
                    fse fseVar = deleteForeverViewModel$bind$1.get_context();
                    deleteForeverViewModel$bind$1.L$0 = f1Var;
                    deleteForeverViewModel$bind$1.L$1 = a;
                    deleteForeverViewModel$bind$1.label = 1;
                    if (a.c(fseVar, deleteForeverViewModel$bind$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.passport.sloth.c1 c1Var = (com.yandex.passport.sloth.c1) deleteForeverViewModel$bind$1.L$1;
                    f1 f1Var2 = (f1) deleteForeverViewModel$bind$1.L$0;
                    kotlin.b.b(obj);
                    a = c1Var;
                    f1Var = f1Var2;
                }
                com.yandex.passport.sloth.b1 b1Var = a.C;
                com.yandex.passport.sloth.v vVar = a.c;
                tje.N(bvf0.a(deleteForeverViewModel$bind$1.get_context()), null, null, new DeleteForeverViewModel$bind$$inlined$collectOn$1(b1Var.b(), null, f1Var), 3);
                tje.N(bvf0.a(deleteForeverViewModel$bind$1.get_context()), null, null, new DeleteForeverViewModel$bind$$inlined$collectOn$2(vVar.e, null, f1Var), 3);
                tje.N(bvf0.a(deleteForeverViewModel$bind$1.get_context()), null, null, new DeleteForeverViewModel$bind$$inlined$collectOn$3(vVar.d, null, f1Var), 3);
                l8xVar = (l8x) deleteForeverViewModel$bind$1.get_context().get(seu.C);
                if (l8xVar != null) {
                    l8xVar.w(new c1(a, 0));
                }
                return a.C;
            }
        }
        deleteForeverViewModel$bind$1 = new DeleteForeverViewModel$bind$1(f1Var, continuationImpl);
        Object obj2 = deleteForeverViewModel$bind$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteForeverViewModel$bind$1.label;
        if (i != 0) {
        }
        com.yandex.passport.sloth.b1 b1Var2 = a.C;
        com.yandex.passport.sloth.v vVar2 = a.c;
        tje.N(bvf0.a(deleteForeverViewModel$bind$1.get_context()), null, null, new DeleteForeverViewModel$bind$$inlined$collectOn$1(b1Var2.b(), null, f1Var), 3);
        tje.N(bvf0.a(deleteForeverViewModel$bind$1.get_context()), null, null, new DeleteForeverViewModel$bind$$inlined$collectOn$2(vVar2.e, null, f1Var), 3);
        tje.N(bvf0.a(deleteForeverViewModel$bind$1.get_context()), null, null, new DeleteForeverViewModel$bind$$inlined$collectOn$3(vVar2.d, null, f1Var), 3);
        l8xVar = (l8x) deleteForeverViewModel$bind$1.get_context().get(seu.C);
        if (l8xVar != null) {
        }
        return a.C;
    }

    public final void Y(o0 o0Var) {
        tje.N(ds31.a(this), null, null, new DeleteForeverViewModel$wish$1(this, o0Var, null), 3);
    }
}
