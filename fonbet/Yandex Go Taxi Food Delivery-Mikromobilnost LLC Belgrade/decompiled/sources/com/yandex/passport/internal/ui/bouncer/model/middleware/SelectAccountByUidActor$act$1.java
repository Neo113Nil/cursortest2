package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/z;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "currentState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/z;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.SelectAccountByUidActor$act$1", f = "SelectAccountByUidMiddleware.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectAccountByUidActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ t0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectAccountByUidActor$act$1(t0 t0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = t0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SelectAccountByUidActor$act$1 selectAccountByUidActor$act$1 = new SelectAccountByUidActor$act$1(this.this$0, (Continuation) obj3);
        selectAccountByUidActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.z) obj;
        selectAccountByUidActor$act$1.L$1 = (s1) obj2;
        return selectAccountByUidActor$act$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object obj2;
        com.yandex.passport.internal.b a;
        Uid uid;
        ModernAccount e;
        LoginProperties m307copyLjS6rdk$default;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.ui.bouncer.model.z zVar = (com.yandex.passport.internal.ui.bouncer.model.z) this.L$0;
        s1 s1Var = (s1) this.L$1;
        t0 t0Var = this.this$0;
        try {
            a = t0Var.a.a();
            uid = zVar.a;
            e = a.e(uid);
        } catch (TimeoutCancellationException e2) {
            failure = new Result.Failure(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (e != null) {
            obj2 = new com.yandex.passport.internal.ui.bouncer.model.h(e, PassportLoginAction.EMPTY);
            return Result.a(obj2) != null ? obj2 : new com.yandex.passport.internal.ui.bouncer.model.o("SelectAccountByUidActor", uw51.j(new StringBuilder("Can not select account with uid "), zVar.a, '.'), null);
        }
        com.yandex.passport.internal.entities.k kVar = (com.yandex.passport.internal.entities.k) t0Var.b.a(a).get(uid);
        if (kVar != null) {
            failure = new com.yandex.passport.internal.ui.bouncer.model.i(kVar.a, kVar.b, PassportLoginAction.EMPTY);
        } else {
            LoginProperties loginProperties = s1Var.c;
            if (loginProperties == null || (m307copyLjS6rdk$default = LoginProperties.m307copyLjS6rdk$default(loginProperties, null, false, null, null, null, null, com.yandex.passport.internal.util.p.A(uid), false, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147483583, null)) == null) {
                throw new IllegalStateException("No login properties specified.");
            }
            failure = new com.yandex.passport.internal.ui.bouncer.model.d0(m307copyLjS6rdk$default, null, null, null, false, false, null, null, 254);
        }
        obj2 = failure;
        if (Result.a(obj2) != null) {
        }
    }
}
