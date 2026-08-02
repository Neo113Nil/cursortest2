package com.yandex.passport.internal.sso.announcing;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.core.accounts.x;
import com.yandex.passport.internal.core.accounts.y;
import com.yandex.passport.internal.core.accounts.z;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.sso.announcing.SsoAccountsSyncHelper$forceRemoveAccount$1", f = "SsoAccountsSyncHelper.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SsoAccountsSyncHelper$forceRemoveAccount$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uid $uid;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SsoAccountsSyncHelper$forceRemoveAccount$1(a aVar, Uid uid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$uid = uid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SsoAccountsSyncHelper$forceRemoveAccount$1(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SsoAccountsSyncHelper$forceRemoveAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            z zVar = this.this$0.b;
            y yVar = new y(new x(this.$uid), false, false, RevokePlace.SSO_ACCOUNT_SYNC, false);
            this.label = 1;
            zVar.a(yVar);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
