package com.yandex.passport.internal.methods.performer;

import android.text.TextUtils;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.t1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uw51;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/api/PassportUidImpl;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/api/PassportUidImpl;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetUidByNormalizedLoginPerformer$performMethod$1", f = "GetUidByNormalizedLoginPerformer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GetUidByNormalizedLoginPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ t1 $method;
    int label;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUidByNormalizedLoginPerformer$performMethod$1(t1 t1Var, p0 p0Var, Continuation continuation) {
        super(2, continuation);
        this.$method = t1Var;
        this.this$0 = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetUidByNormalizedLoginPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetUidByNormalizedLoginPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ModernAccount modernAccount;
        Uid uid;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = (String) this.$method.b.c;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("getUidByNormalizedLogin: normalizedLogin = ", str, LogLevel.DEBUG, null, 8);
        }
        com.yandex.passport.internal.b a = this.this$0.a.a();
        Iterator it = a.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                modernAccount = null;
                break;
            }
            modernAccount = a.b.b((AccountRow) it.next());
            if (modernAccount != null) {
                String normalizedDisplayLogin = modernAccount.getNormalizedDisplayLogin();
                if (str != null && normalizedDisplayLogin != null && TextUtils.equals(str, normalizedDisplayLogin)) {
                    break;
                }
            }
        }
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getUidByNormalizedLogin: account = " + modernAccount, 8);
        }
        if (modernAccount == null || (uid = modernAccount.getUid()) == null) {
            throw new PassportAccountNotFoundException("normalized display login", str);
        }
        return com.yandex.passport.internal.util.p.A(uid);
    }
}
