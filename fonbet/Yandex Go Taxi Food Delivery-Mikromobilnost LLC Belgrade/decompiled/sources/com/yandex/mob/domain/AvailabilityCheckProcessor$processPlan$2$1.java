package com.yandex.mob.domain;

import com.yandex.mob.reporting.MobTrigger;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ha4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.AvailabilityCheckProcessor$processPlan$2$1", f = "AvailabilityCheckProcessor.kt", l = {39, 43, 47, 48, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 56, 59, 62}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class AvailabilityCheckProcessor$processPlan$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ ha4 $plan;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailabilityCheckProcessor$processPlan$2$1(ha4 ha4Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$plan = ha4Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AvailabilityCheckProcessor$processPlan$2$1(this.$plan, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AvailabilityCheckProcessor$processPlan$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e8, code lost:
    
        if (com.yandex.mob.domain.c.b(r1, r6, r5) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d1, code lost:
    
        if (com.yandex.mob.domain.c.c(r6, r5) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
    
        if (com.yandex.mob.domain.c.h(r1, r6, r5) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r6 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r6 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (com.yandex.mob.domain.c.f(r3, r6, r5) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
    
        if (com.yandex.mob.domain.c.a(r6, r1, r5) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
    
        if (com.yandex.mob.domain.c.d(r1, r6, r5) == r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List list;
        List m0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                ha4 ha4Var = this.$plan;
                if (!ha4Var.h) {
                    c cVar = this.this$0;
                    this.label = 1;
                    break;
                }
                if (!this.$plan.g.isEmpty()) {
                    c cVar2 = this.this$0;
                    ha4 ha4Var2 = this.$plan;
                    this.label = 2;
                    break;
                }
                ha4 ha4Var3 = this.$plan;
                z = ha4Var3.c;
                c cVar3 = this.this$0;
                if (!z) {
                    this.label = 5;
                    break;
                } else {
                    Map map = ha4Var3.f;
                    this.label = 3;
                    obj = c.g(cVar3, map, this);
                    break;
                }
                return coroutineSingletons;
            case 1:
                kotlin.b.b(obj);
                if (!this.$plan.g.isEmpty()) {
                }
                ha4 ha4Var32 = this.$plan;
                z = ha4Var32.c;
                c cVar32 = this.this$0;
                if (!z) {
                }
                return coroutineSingletons;
            case 2:
                kotlin.b.b(obj);
                ha4 ha4Var322 = this.$plan;
                z = ha4Var322.c;
                c cVar322 = this.this$0;
                if (!z) {
                }
                return coroutineSingletons;
            case 3:
                kotlin.b.b(obj);
                list = (List) obj;
                c cVar4 = this.this$0;
                ha4 ha4Var4 = this.$plan;
                this.L$0 = list;
                this.label = 4;
                obj = c.f(cVar4, ha4Var4, this);
                break;
            case 4:
                list = (List) this.L$0;
                kotlin.b.b(obj);
                m0 = kotlin.collections.a.m0((List) obj, list);
                if (!m0.isEmpty()) {
                    c cVar5 = this.this$0;
                    this.L$0 = null;
                    this.label = 6;
                    break;
                }
                c cVar6 = this.this$0;
                this.L$0 = null;
                this.label = 7;
                break;
            case 5:
                kotlin.b.b(obj);
                m0 = EmptyList.a;
                if (!m0.isEmpty()) {
                }
                c cVar62 = this.this$0;
                this.L$0 = null;
                this.label = 7;
                break;
            case 6:
                kotlin.b.b(obj);
                c cVar622 = this.this$0;
                this.L$0 = null;
                this.label = 7;
                break;
            case 7:
                kotlin.b.b(obj);
                ha4 ha4Var5 = this.$plan;
                if (ha4Var5.c) {
                    c cVar7 = this.this$0;
                    MobTrigger mobTrigger = ha4Var5.b;
                    this.L$0 = null;
                    this.label = 8;
                    break;
                }
                return zy11.a;
            case 8:
                kotlin.b.b(obj);
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
