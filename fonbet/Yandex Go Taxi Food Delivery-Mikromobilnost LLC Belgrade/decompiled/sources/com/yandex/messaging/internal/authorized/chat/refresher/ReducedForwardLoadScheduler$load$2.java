package com.yandex.messaging.internal.authorized.chat.refresher;

import com.yandex.messaging.internal.entities.ReducedMessage;
import defpackage.imz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v9s;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lkotlin/Pair;", "Lv9s;", "Lcom/yandex/messaging/internal/entities/ReducedMessage;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.refresher.ReducedForwardLoadScheduler$load$2", f = "ReducedForwardLoadScheduler.kt", l = {36, 37}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ReducedForwardLoadScheduler$load$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<v9s> $loadKeys;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReducedForwardLoadScheduler$load$2(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$loadKeys = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReducedForwardLoadScheduler$load$2 reducedForwardLoadScheduler$load$2 = new ReducedForwardLoadScheduler$load$2(this.$loadKeys, this.this$0, continuation);
        reducedForwardLoadScheduler$load$2.L$0 = obj;
        return reducedForwardLoadScheduler$load$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReducedForwardLoadScheduler$load$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Iterator it;
        vpr vprVar;
        v9s v9sVar;
        Iterator it2;
        vpr vprVar2;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                v9s v9sVar2 = (v9s) this.L$3;
                it = (Iterator) this.L$2;
                a aVar3 = (a) this.L$1;
                vpr vprVar3 = (vpr) this.L$0;
                kotlin.b.b(obj);
                v9sVar = v9sVar2;
                it2 = ((Iterable) obj).iterator();
                vprVar2 = vprVar3;
                aVar2 = aVar3;
            } else {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it2 = (Iterator) this.L$4;
                v9s v9sVar3 = (v9s) this.L$3;
                Iterator it3 = (Iterator) this.L$2;
                aVar2 = (a) this.L$1;
                vprVar2 = (vpr) this.L$0;
                kotlin.b.b(obj);
                v9sVar = v9sVar3;
                it = it3;
            }
            while (it2.hasNext()) {
                Pair pair = new Pair(v9sVar, (ReducedMessage) it2.next());
                this.L$0 = vprVar2;
                this.L$1 = aVar2;
                this.L$2 = it;
                this.L$3 = v9sVar;
                this.L$4 = it2;
                this.label = 2;
                if (vprVar2.emit(pair, this) == coroutineSingletons) {
                    break;
                }
            }
            aVar = aVar2;
            vprVar = vprVar2;
            if (it.hasNext()) {
                v9s v9sVar4 = (v9s) it.next();
                c cVar = aVar.a;
                long j = v9sVar4.c;
                imz imzVar = new imz(j, j, false);
                String str = v9sVar4.b;
                this.L$0 = vprVar;
                this.L$1 = aVar;
                this.L$2 = it;
                this.L$3 = v9sVar4;
                this.L$4 = null;
                this.label = 1;
                Serializable a = cVar.a(imzVar, str, this);
                if (a != coroutineSingletons) {
                    a aVar4 = aVar;
                    v9sVar = v9sVar4;
                    it2 = ((Iterable) a).iterator();
                    vprVar2 = vprVar;
                    aVar2 = aVar4;
                    while (it2.hasNext()) {
                    }
                    aVar = aVar2;
                    vprVar = vprVar2;
                    if (it.hasNext()) {
                        return zy11.a;
                    }
                }
                return coroutineSingletons;
            }
        } else {
            kotlin.b.b(obj);
            vpr vprVar4 = (vpr) this.L$0;
            List<v9s> list = this.$loadKeys;
            aVar = this.this$0;
            it = list.iterator();
            vprVar = vprVar4;
            if (it.hasNext()) {
            }
        }
    }
}
