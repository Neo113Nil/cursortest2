package com.yandex.messaging.ui.settings;

import com.yandex.messaging.base.rights.OrganizationRightsFlag;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdr0;
import defpackage.x4b0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx4b0;", "info", "", "currOrg", "Lzy11;", "<anonymous>", "(Lx4b0;J)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.SettingsScreenViewModel$observeOrganizationRights$1", f = "SettingsScreenViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SettingsScreenViewModel$observeOrganizationRights$1 extends SuspendLambda implements zls {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsScreenViewModel$observeOrganizationRights$1(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        SettingsScreenViewModel$observeOrganizationRights$1 settingsScreenViewModel$observeOrganizationRights$1 = new SettingsScreenViewModel$observeOrganizationRights$1(this.this$0, (Continuation) obj3);
        settingsScreenViewModel$observeOrganizationRights$1.L$0 = (x4b0) obj;
        settingsScreenViewModel$observeOrganizationRights$1.J$0 = longValue;
        zy11 zy11Var = zy11.a;
        settingsScreenViewModel$observeOrganizationRights$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        x4b0 x4b0Var = (x4b0) this.L$0;
        long j = this.J$0;
        f fVar = this.this$0;
        fVar.getClass();
        boolean c = x4b0Var.c(OrganizationRightsFlag.CanHaveSavedMessages, j);
        r0 r0Var = fVar.G;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, pdr0.a((pdr0) value, false, false, false, false, null, null, null, c, false, 393215)));
        return zy11.a;
    }
}
