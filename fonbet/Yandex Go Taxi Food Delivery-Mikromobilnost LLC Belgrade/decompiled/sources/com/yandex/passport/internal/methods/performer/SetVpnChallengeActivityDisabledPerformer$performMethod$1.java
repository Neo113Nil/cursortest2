package com.yandex.passport.internal.methods.performer;

import android.content.SharedPreferences;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.methods.n2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.SetVpnChallengeActivityDisabledPerformer$performMethod$1", f = "SetVpnChallengeActivityDisabledPerformer.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SetVpnChallengeActivityDisabledPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ n2 $method;
    int label;
    final /* synthetic */ h1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetVpnChallengeActivityDisabledPerformer$performMethod$1(h1 h1Var, n2 n2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = h1Var;
        this.$method = n2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SetVpnChallengeActivityDisabledPerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SetVpnChallengeActivityDisabledPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set<String> stringSet;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h1 h1Var = this.this$0;
            String packageName = h1Var.a.getPackageName();
            SharedPreferences b = h1Var.c.a.b(Environment.PRODUCTION);
            Set<String> set = EmptySet.a;
            if (b != null && (stringSet = b.getStringSet("vpnManualMode", set)) != null) {
                set = stringSet;
            }
            if (!set.contains(packageName) && ((Boolean) this.$method.b.c).booleanValue()) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, "SetVpnChallengeActivityDisabledPerformer", "Not allowed action", 8);
                }
                throw new PassportActionForbiddenException();
            }
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            n2 n2Var = this.$method;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, "SetVpnChallengeActivityDisabledPerformer", "Set vpn blocker disabled, disabled = " + ((Boolean) n2Var.b.c).booleanValue(), 8);
            }
            com.yandex.passport.internal.usecase.vpn.b bVar = this.this$0.b;
            boolean booleanValue = ((Boolean) this.$method.b.c).booleanValue();
            this.label = 1;
            if (bVar.g(booleanValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
