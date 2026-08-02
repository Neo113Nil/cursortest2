package com.yandex.messaging.internal.authorized.sync;

import defpackage.cd0;
import defpackage.cwc;
import defpackage.eke;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.x22;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.ContactsSyncManager$2", f = "ContactsSyncManager.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsSyncManager$2 extends SuspendLambda implements wls {
    final /* synthetic */ x22 $analytics;
    final /* synthetic */ eke $contextPermissionStateReader;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSyncManager$2(d dVar, eke ekeVar, x22 x22Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$contextPermissionStateReader = ekeVar;
        this.$analytics = x22Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactsSyncManager$2(this.this$0, this.$contextPermissionStateReader, this.$analytics, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactsSyncManager$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(new cd0(26, this.this$0.f, this.$contextPermissionStateReader));
            cwc cwcVar = new cwc(6, this.$analytics);
            this.label = 1;
            if (t.collect(cwcVar, this) == coroutineSingletons) {
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
