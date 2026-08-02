package com.yandex.passport.internal.filter;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.Filter;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/passport/internal/ModernAccount;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.filter.AccountFilterRepository$filterAccountsSynchronous$1", f = "AccountFilterRepository.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AccountFilterRepository$filterAccountsSynchronous$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<ModernAccount> $accountList;
    final /* synthetic */ Filter $hostFilter;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountFilterRepository$filterAccountsSynchronous$1(i iVar, List list, Filter filter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$accountList = list;
        this.$hostFilter = filter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountFilterRepository$filterAccountsSynchronous$1(this.this$0, this.$accountList, this.$hostFilter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountFilterRepository$filterAccountsSynchronous$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        i iVar = this.this$0;
        List<ModernAccount> list = this.$accountList;
        Filter filter = this.$hostFilter;
        this.label = 1;
        Object c = iVar.c(list, filter, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
