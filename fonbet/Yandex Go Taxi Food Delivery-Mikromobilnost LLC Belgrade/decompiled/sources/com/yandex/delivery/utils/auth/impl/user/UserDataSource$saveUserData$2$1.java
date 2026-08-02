package com.yandex.delivery.utils.auth.impl.user;

import android.content.Context;
import defpackage.en21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.utils.auth.impl.user.UserDataSource$saveUserData$2$1", f = "UserDataSource.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class UserDataSource$saveUserData$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDataSource$saveUserData$2$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserDataSource$saveUserData$2$1(this.this$0, this.$userId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserDataSource$saveUserData$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        b bVar = this.this$0.b;
        String str = this.$userId;
        this.label = 1;
        en21 en21Var = b.c;
        Context context = bVar.a;
        en21Var.getClass();
        Object a = androidx.datastore.preferences.core.b.a((tpg) b.d.getValue(context, en21.a[0]), new UserIdPersistentDataStore$setUserId$2(bVar, str, null), this);
        if (a != coroutineSingletons) {
            a = zy11Var;
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
