package com.yandex.messaging.internal;

import com.yandex.messaging.internal.authorized.sync.SyncSource;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.e1k;
import defpackage.el21;
import defpackage.i0x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.NotificationActionHandler$handleMarkAsRead$1", f = "NotificationActionHandler.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationActionHandler$handleMarkAsRead$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActionHandler$handleMarkAsRead$1(b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationActionHandler$handleMarkAsRead$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationActionHandler$handleMarkAsRead$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e1k e1kVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            el21 el21Var = this.this$0.e;
            this.label = 1;
            obj = com.yandex.messaging.internal.authorized.i.a(el21Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e1kVar = (e1k) this.L$0;
                kotlin.b.b(obj);
                e1kVar.close();
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        i0x0 c = ((d9g) ((cl21) obj)).f().c(false, false, SyncSource.MarkAsReadAction);
        this.L$0 = c;
        this.label = 2;
        if (kotlinx.coroutines.a.i(5000L, this) != coroutineSingletons) {
            e1kVar = c;
            e1kVar.close();
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
