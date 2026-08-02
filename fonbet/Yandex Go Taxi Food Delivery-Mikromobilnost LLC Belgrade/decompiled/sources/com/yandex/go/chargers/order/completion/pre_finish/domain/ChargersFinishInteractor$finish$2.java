package com.yandex.go.chargers.order.completion.pre_finish.domain;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.order.completion.pre_finish.data.ChargersFinishApi;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersFinishProgressResponse;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersFinishResponse;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.n1a;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.domain.ChargersFinishInteractor$finish$2", f = "ChargersFinishInteractor.kt", l = {41, 44, 49, 53, 54}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFinishInteractor$finish$2 extends SuspendLambda implements wls {
    final /* synthetic */ kotlinx.serialization.json.b $args;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFinishInteractor$finish$2(a aVar, kotlinx.serialization.json.b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$args = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersFinishInteractor$finish$2 chargersFinishInteractor$finish$2 = new ChargersFinishInteractor$finish$2(this.this$0, this.$args, continuation);
        chargersFinishInteractor$finish$2.L$0 = obj;
        return chargersFinishInteractor$finish$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFinishInteractor$finish$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0127, code lost:
    
        if (r14 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r14 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0161  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x017e -> B:9:0x00f0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        kotlinx.serialization.json.b bVar;
        kotlinx.serialization.json.b bVar2;
        a aVar2;
        Long l;
        long longValue;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.e.a.g(n1a.a);
            a aVar3 = this.this$0;
            kotlinx.serialization.json.b bVar3 = this.$args;
            this.L$0 = tseVar;
            this.label = 1;
            ChargersFinishApi chargersFinishApi = (ChargersFinishApi) aVar3.c.get();
            aVar3.d.getClass();
            obj = chargersFinishApi.c(bVar3, f.e()).a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i == 3) {
                    aVar = (a) this.L$4;
                    bVar = (kotlinx.serialization.json.b) this.L$3;
                    kotlin.b.b(obj);
                    fmt fmtVar = (fmt) obj;
                    ChargersFinishProgressResponse chargersFinishProgressResponse = (ChargersFinishProgressResponse) fmtVar.a;
                    String a = fmtVar.e.a("X-YaTraceId");
                    Long l2 = wwg.l(fmtVar).b;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = bVar;
                    this.L$4 = aVar;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = l2;
                    this.label = 4;
                    if (a.a(aVar, chargersFinishProgressResponse, a, this) != coroutineSingletons) {
                        bVar2 = bVar;
                        aVar2 = aVar;
                        l = l2;
                        if (l == null) {
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = bVar2;
                        this.L$4 = aVar2;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.label = 5;
                        if (kotlinx.coroutines.a.i(longValue, this) != coroutineSingletons) {
                        }
                    }
                }
                if (i == 4) {
                    l = (Long) this.L$8;
                    aVar2 = (a) this.L$4;
                    bVar2 = (kotlinx.serialization.json.b) this.L$3;
                    kotlin.b.b(obj);
                    longValue = l == null ? l.longValue() : 2000L;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = bVar2;
                    this.L$4 = aVar2;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 5;
                    if (kotlinx.coroutines.a.i(longValue, this) != coroutineSingletons) {
                        aVar = aVar2;
                        bVar = bVar2;
                        if (kotlinx.coroutines.a.p(get_context())) {
                        }
                    }
                }
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$4;
                bVar = (kotlinx.serialization.json.b) this.L$3;
                kotlin.b.b(obj);
                if (kotlinx.coroutines.a.p(get_context())) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = bVar;
                    this.L$4 = aVar;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 3;
                    ChargersFinishApi chargersFinishApi2 = (ChargersFinishApi) aVar.c.get();
                    aVar.d.getClass();
                    obj = chargersFinishApi2.a(bVar, f.e()).a(this);
                }
            }
            kotlin.b.b(obj);
        }
        fmt fmtVar2 = (fmt) obj;
        String a2 = fmtVar2.e.a("X-YaTraceId");
        kotlinx.serialization.json.b bVar4 = ((ChargersFinishResponse) fmtVar2.a).a;
        a aVar4 = this.this$0;
        if (bVar4 != null) {
            aVar = aVar4;
            bVar = bVar4;
            if (kotlinx.coroutines.a.p(get_context())) {
            }
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        return a.a(aVar4, null, a2, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
