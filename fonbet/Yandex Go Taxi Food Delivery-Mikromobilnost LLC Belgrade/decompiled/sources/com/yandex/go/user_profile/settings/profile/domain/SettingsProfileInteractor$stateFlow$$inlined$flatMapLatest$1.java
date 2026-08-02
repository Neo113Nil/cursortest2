package com.yandex.go.user_profile.settings.profile.domain;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import defpackage.fcr0;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ncr0;
import defpackage.ny61;
import defpackage.tcr0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.taxi.startup.launch.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.settings.profile.domain.SettingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1", f = "SettingsProfileInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SettingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ fcr0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1(Continuation continuation, fcr0 fcr0Var) {
        super(3, continuation);
        this.this$0 = fcr0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SettingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1 settingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1 = new SettingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        settingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        settingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return settingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (((UserProfileExperiment) obj2).i()) {
                fcr0 fcr0Var = this.this$0;
                g92Var = e.m(com.yandex.go.coroutines.b.d(fcr0Var.c.f, new SettingsProfileInteractor$profileSettingsFlow$$inlined$start$1(null, fcr0Var)), ((h) fcr0Var.e).Pg(), fcr0Var.f.h, ((com.yandex.go.user_profile.settings.profile.data.b) fcr0Var.a).a(), new SettingsProfileInteractor$profileSettingsFlow$1(5, fcr0Var.d, tcr0.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/am/AuthStatus;Ljava/lang/String;Lru/yandex/taxi/settings/email/UserEmailInfo;Lru/yandex/taxi/profile/ActiveOrdersProfileState;)Lcom/yandex/go/user_profile/settings/profile/presentation/SettingsProfileUiState;", 4));
            } else {
                g92Var = new g92(2, ncr0.a);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
