package com.yandex.passport.internal.usecase.vpn;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.config.o;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.usecase.vpn.CheckVpnStatusUseCase$setVpnChallengeActivityDisabled$2", f = "CheckVpnStatusUseCase.kt", l = {HProv.PP_CIPHEROID}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class CheckVpnStatusUseCase$setVpnChallengeActivityDisabled$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $disabled;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckVpnStatusUseCase$setVpnChallengeActivityDisabled$2(b bVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$disabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckVpnStatusUseCase$setVpnChallengeActivityDisabled$2(this.this$0, this.$disabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckVpnStatusUseCase$setVpnChallengeActivityDisabled$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharedPreferences.Editor edit;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o oVar = this.this$0.e;
        Environment environment = Environment.PRODUCTION;
        boolean z = this.$disabled;
        SharedPreferences b = oVar.a.b(environment);
        if (b != null && (edit = b.edit()) != null) {
            edit.putBoolean("vpnBlockerUserDisabled", z);
            edit.apply();
        }
        if (this.$disabled) {
            n0 n0Var = this.this$0.m;
            this.label = 1;
            if (n0Var.emit(zy11Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
