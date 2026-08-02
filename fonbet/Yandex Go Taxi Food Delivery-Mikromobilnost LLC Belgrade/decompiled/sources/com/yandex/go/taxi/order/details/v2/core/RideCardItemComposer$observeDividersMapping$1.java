package com.yandex.go.taxi.order.details.v2.core;

import com.yandex.go.slot.dto.d0;
import defpackage.g050;
import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zjk0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$observeDividersMapping$1", f = "RideCardItemComposer.kt", l = {363}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardItemComposer$observeDividersMapping$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/yandex/go/slot/dto/d0;", "dividersMap", "Lzy11;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$observeDividersMapping$1$1", f = "RideCardItemComposer.kt", l = {381}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$observeDividersMapping$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((Map) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar;
            g050 g050Var;
            List<Pair> list;
            Object value;
            LinkedHashMap linkedHashMap;
            Map map = (Map) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    zjk0 b = cVar2.d.b((d0) entry.getValue());
                    Pair pair = b == null ? null : new Pair(str, b);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                cVar = this.this$0;
                kotlinx.coroutines.sync.a aVar = cVar.j;
                this.L$0 = null;
                this.L$1 = arrayList;
                this.L$2 = aVar;
                this.L$3 = cVar;
                this.label = 1;
                if (aVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                g050Var = aVar;
                list = arrayList;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$3;
                g050Var = (g050) this.L$2;
                list = (List) this.L$1;
                kotlin.b.b(obj);
            }
            try {
                r0 r0Var = cVar.c.a;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    for (Pair pair2 : list) {
                        linkedHashMap.put((String) pair2.getFirst(), (zjk0) pair2.getSecond());
                    }
                } while (!r0Var.k(value, linkedHashMap));
                g050Var.d(null);
                return zy11.a;
            } catch (Throwable th) {
                g050Var.d(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardItemComposer$observeDividersMapping$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardItemComposer$observeDividersMapping$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardItemComposer$observeDividersMapping$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            gci0 gci0Var = cVar.c.j;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.k(gci0Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.r("SharedFlow never completes, this call should never return.");
        return null;
    }
}
