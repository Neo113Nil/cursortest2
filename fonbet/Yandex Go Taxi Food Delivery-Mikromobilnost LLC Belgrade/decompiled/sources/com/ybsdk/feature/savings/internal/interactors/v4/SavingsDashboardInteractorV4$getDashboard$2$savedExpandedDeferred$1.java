package com.ybsdk.feature.savings.internal.interactors.v4;

import com.squareup.moshi.JsonDataException;
import defpackage.gbm0;
import defpackage.j73;
import defpackage.kgx;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xiu0;
import defpackage.zy11;
import java.io.EOFException;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.v4.SavingsDashboardInteractorV4$getDashboard$2$savedExpandedDeferred$1", f = "SavingsDashboardInteractorV4.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardInteractorV4$getDashboard$2$savedExpandedDeferred$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardInteractorV4$getDashboard$2$savedExpandedDeferred$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsDashboardInteractorV4$getDashboard$2$savedExpandedDeferred$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsDashboardInteractorV4$getDashboard$2$savedExpandedDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lrp0 lrp0Var = lrp0.B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gbm0 gbm0Var = this.this$0.d;
        gbm0Var.getClass();
        xiu0 xiu0Var = gbm0Var.a;
        try {
            String a = gbm0Var.a();
            if (a != null) {
                String[] strArr = (String[]) gbm0Var.b.fromJson(a);
                Set f0 = strArr != null ? j73.f0(strArr) : null;
                if (f0 != null) {
                    return f0;
                }
            }
        } catch (JsonDataException e) {
            x4c.g("Savings dashboard V4 expanded shelves loading error", e, null, Collections.singletonList(lrp0Var), 4);
            kgx kgxVar = gbm0.c[0];
            xiu0Var.a(null);
        } catch (EOFException e2) {
            x4c.g("Savings dashboard V4 expanded shelves loading error", e2, null, Collections.singletonList(lrp0Var), 4);
            kgx kgxVar2 = gbm0.c[0];
            xiu0Var.a(null);
        } catch (IllegalStateException e3) {
            x4c.g("Savings dashboard V4 expanded shelves loading error", e3, null, Collections.singletonList(lrp0Var), 4);
            kgx kgxVar3 = gbm0.c[0];
            xiu0Var.a(null);
        } catch (Exception e4) {
            x4c.g("Savings dashboard V4 expanded shelves loading error", e4, null, Collections.singletonList(lrp0Var), 4);
        }
        return EmptySet.a;
    }
}
