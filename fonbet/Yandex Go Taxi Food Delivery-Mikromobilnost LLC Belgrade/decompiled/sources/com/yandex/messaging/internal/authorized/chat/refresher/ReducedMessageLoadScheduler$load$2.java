package com.yandex.messaging.internal.authorized.chat.refresher;

import com.yandex.messaging.internal.entities.ReducedMessage;
import defpackage.imz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/messaging/internal/entities/ReducedMessage;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.refresher.ReducedMessageLoadScheduler$load$2", f = "ReducedMessageLoadScheduler.kt", l = {44, 44}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ReducedMessageLoadScheduler$load$2 extends SuspendLambda implements wls {
    final /* synthetic */ imz $loadRange;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReducedMessageLoadScheduler$load$2(b bVar, imz imzVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$loadRange = imzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReducedMessageLoadScheduler$load$2 reducedMessageLoadScheduler$load$2 = new ReducedMessageLoadScheduler$load$2(this.this$0, this.$loadRange, continuation);
        reducedMessageLoadScheduler$load$2.L$0 = obj;
        return reducedMessageLoadScheduler$load$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReducedMessageLoadScheduler$load$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r7 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        vpr vprVar2;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            c cVar = this.this$0.a;
            imz imzVar = this.$loadRange;
            this.L$0 = vprVar;
            this.label = 1;
            obj = cVar.a(imzVar, null, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$1;
                vprVar2 = (vpr) this.L$0;
                kotlin.b.b(obj);
                while (it.hasNext()) {
                    ReducedMessage reducedMessage = (ReducedMessage) it.next();
                    this.L$0 = vprVar2;
                    this.L$1 = it;
                    this.label = 2;
                    if (vprVar2.emit(reducedMessage, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        vprVar2 = vprVar;
        it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
