package com.yandex.passport.internal;

import android.content.Context;
import com.yandex.passport.api.w1;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.PassportInitialization$doDelayedWork$1", f = "PassportInitialization.kt", l = {409}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PassportInitialization$doDelayedWork$1 extends SuspendLambda implements wls {
    final /* synthetic */ PassportProcessGlobalComponent $component;
    final /* synthetic */ Context $context;
    final /* synthetic */ w1 $properties;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitialization$doDelayedWork$1(PassportProcessGlobalComponent passportProcessGlobalComponent, w1 w1Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.$component = passportProcessGlobalComponent;
        this.$properties = w1Var;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PassportInitialization$doDelayedWork$1 passportInitialization$doDelayedWork$1 = new PassportInitialization$doDelayedWork$1(this.$component, this.$properties, this.$context, continuation);
        passportInitialization$doDelayedWork$1.L$0 = obj;
        return passportInitialization$doDelayedWork$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportInitialization$doDelayedWork$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar2 = (tse) this.L$0;
            long intValue = ((Number) this.$component.getFlagRepository().b(com.yandex.passport.internal.flags.q.z0)).intValue();
            this.L$0 = tseVar2;
            this.label = 1;
            if (kotlinx.coroutines.a.i(intValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            tseVar = tseVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
        }
        List list = s.a;
        tje.N(tseVar, null, null, new PassportInitialization$uploadDiaryIfNeeded$1(this.$component, null), 3);
        tje.N(tseVar, null, null, new PassportInitialization$sendMetricAboutInitializationPassport$1(this.$component, this.$properties, null), 3);
        Context context = this.$context;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.$component;
        sjh sjhVar = uyj.a;
        tje.N(tseVar, sjhVar, null, new PassportInitialization$reportExitReason$1(context, passportProcessGlobalComponent, null), 2);
        tje.N(tseVar, sjhVar, null, new PassportInitialization$actualizeNamesOfChannelsNotifications$1(this.$component, null), 2);
        tje.N(tseVar, null, null, new PassportInitialization$revokeQuarantineMasterToken$1(this.$component, null), 3);
        PassportProcessGlobalComponent passportProcessGlobalComponent2 = this.$component;
        if (((Boolean) passportProcessGlobalComponent2.getFlagRepository().b(com.yandex.passport.internal.flags.q.d)).booleanValue()) {
            tje.N(tseVar, null, null, new PassportInitialization$tryToMakeAllTokensMasterRelated$1$1(passportProcessGlobalComponent2, null), 3);
        }
        tje.N(tseVar, null, null, new PassportInitialization$tryInsertDelayedAccounts$1(this.$component, null), 3);
        tje.N(tseVar, null, null, new PassportInitialization$sendMetricAboutDependencies$1(this.$component, null), 3);
        return zy11.a;
    }
}
