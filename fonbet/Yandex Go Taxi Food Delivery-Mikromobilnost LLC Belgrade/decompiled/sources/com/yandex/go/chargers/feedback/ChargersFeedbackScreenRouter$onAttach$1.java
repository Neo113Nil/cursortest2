package com.yandex.go.chargers.feedback;

import defpackage.c6a;
import defpackage.mvg;
import defpackage.nar;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.ChargersFeedbackScreenRouter$onAttach$1", f = "ChargersFeedbackScreenRouter.kt", l = {65, 67}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackScreenRouter$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ nar $payload;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackScreenRouter$onAttach$1(c cVar, nar narVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = narVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFeedbackScreenRouter$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFeedbackScreenRouter$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00c5  */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.yandex.go.chargers.feedback.b] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        final nar narVar;
        Iterator it;
        final c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Set n = this.this$0.Q.a.n("CHARGERS_ACTIVE_ORDERS_COMPLETED_NOTIFICATION_ID_KEY");
            List list2 = this.$payload.c;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!n.contains(((c6a) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    com.yandex.go.chargers.data.b bVar = this.this$0.Q;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((c6a) it2.next()).a);
                    }
                    this.L$0 = null;
                    this.L$1 = arrayList;
                    this.label = 1;
                    if (bVar.a(arrayList2, this) != coroutineSingletons) {
                        list = arrayList;
                    }
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$5;
            narVar = (nar) this.L$4;
            cVar = (c) this.L$3;
            kotlin.b.b(obj);
            while (it.hasNext()) {
                final c6a c6aVar = (c6a) it.next();
                ?? r6 = new sls() { // from class: com.yandex.go.chargers.feedback.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        c cVar2 = c.this;
                        tje.N(cVar2.o(), null, null, new ChargersFeedbackScreenRouter$onAttach$1$2$1$1(cVar2, c6aVar, narVar, null), 3);
                        return zy11.a;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = cVar;
                this.L$4 = narVar;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 2;
                if (c.V(cVar, c6aVar, r6, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        list = (List) this.L$1;
        kotlin.b.b(obj);
        c cVar2 = this.this$0;
        narVar = this.$payload;
        it = list.iterator();
        cVar = cVar2;
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
