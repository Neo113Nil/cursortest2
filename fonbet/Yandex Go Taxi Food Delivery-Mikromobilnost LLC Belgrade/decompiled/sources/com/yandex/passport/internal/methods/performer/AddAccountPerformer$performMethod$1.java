package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.AliasType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/internal/account/PassportAccountImpl;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.AddAccountPerformer$performMethod$1", f = "AddAccountPerformer.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AddAccountPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.x $method;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddAccountPerformer$performMethod$1(com.yandex.passport.internal.methods.x xVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$method = xVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddAccountPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddAccountPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Environment u = com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) this.$method.b.c);
            com.yandex.passport.common.account.b bVar = MasterToken.Companion;
            String str = (String) this.$method.c.c;
            bVar.getClass();
            MasterToken a = com.yandex.passport.common.account.b.a(str);
            List list = (List) this.$method.d.c;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(((AliasType) it.next()).getType()));
            }
            com.yandex.passport.internal.usecase.b bVar2 = this.this$0.a;
            com.yandex.passport.internal.usecase.a aVar = new com.yandex.passport.internal.usecase.a(u, a, arrayList);
            this.label = 1;
            obj = bVar2.a(aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        if (!(value instanceof Result.Failure)) {
            value = com.yandex.passport.internal.a0.g0((ModernAccount) value);
        }
        b bVar3 = this.this$0;
        Throwable a2 = Result.a(value);
        if (a2 != null) {
            try {
                throw com.yandex.passport.internal.methods.performer.error.a.a(bVar3.b, a2, null, null, null, null, new PassportFailedResponseException(a2.getLocalizedMessage()), 30);
            } catch (Throwable th) {
                value = new Result.Failure(th);
            }
        }
        return new Result(value);
    }
}
