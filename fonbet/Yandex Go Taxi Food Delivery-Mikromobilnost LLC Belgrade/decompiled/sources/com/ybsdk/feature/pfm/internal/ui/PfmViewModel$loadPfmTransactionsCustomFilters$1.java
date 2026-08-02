package com.ybsdk.feature.pfm.internal.ui;

import com.ybsdk.rconfig.configs.PfmDelaysConfig;
import defpackage.bab0;
import defpackage.h9b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.q9b0;
import defpackage.r8j0;
import defpackage.r9b0;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.tse;
import defpackage.wcb0;
import defpackage.wls;
import defpackage.yfq0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pfm.internal.ui.PfmViewModel$loadPfmTransactionsCustomFilters$1", f = "PfmViewModel.kt", l = {592, 593}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PfmViewModel$loadPfmTransactionsCustomFilters$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $analyticsOnSuccess;
    final /* synthetic */ List<h9b0> $selectedCategoriesPath;
    final /* synthetic */ PfmTransactionsDataSkeletonType $skeletonsLoadingType;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PfmViewModel$loadPfmTransactionsCustomFilters$1(b bVar, PfmTransactionsDataSkeletonType pfmTransactionsDataSkeletonType, List list, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$skeletonsLoadingType = pfmTransactionsDataSkeletonType;
        this.$selectedCategoriesPath = list;
        this.$analyticsOnSuccess = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PfmViewModel$loadPfmTransactionsCustomFilters$1(this.this$0, this.$skeletonsLoadingType, this.$selectedCategoriesPath, this.$analyticsOnSuccess, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PfmViewModel$loadPfmTransactionsCustomFilters$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (kotlinx.coroutines.a.i(r2, r19) == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z;
        Object obj3;
        Throwable a;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            PfmTransactionsDataSkeletonType pfmTransactionsDataSkeletonType = this.$skeletonsLoadingType;
            List<h9b0> list = this.$selectedCategoriesPath;
            pz40 Y = bVar.Y();
            while (true) {
                r0 r0Var2 = (r0) Y;
                Object value2 = r0Var2.getValue();
                List<h9b0> list2 = list;
                if (r0Var2.k(value2, wcb0.a((wcb0) value2, null, null, pfmTransactionsDataSkeletonType, null, null, null, null, new yfq0(list), 247))) {
                    break;
                }
                list = list2;
            }
            long requestsDebounceMs = ((PfmDelaysConfig) ((bab0) this.this$0.B).a.d(q9b0.a).getData()).getRequestsDebounceMs();
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                obj2 = ((Result) obj).getValue();
                b bVar2 = this.this$0;
                sls slsVar = this.$analyticsOnSuccess;
                z = obj2 instanceof Result.Failure;
                EmptyList emptyList = EmptyList.a;
                if (z) {
                    r9b0 r9b0Var = (r9b0) obj2;
                    pz40 Y2 = bVar2.Y();
                    while (true) {
                        r0 r0Var3 = (r0) Y2;
                        Object value3 = r0Var3.getValue();
                        obj3 = obj2;
                        if (r0Var3.k(value3, wcb0.a((wcb0) value3, new r8j0(r9b0Var, null, 14), emptyList, null, b.d0(r9b0Var.b), null, null, null, null, 489))) {
                            break;
                        }
                        obj2 = obj3;
                    }
                    slsVar.invoke();
                } else {
                    obj3 = obj2;
                }
                b bVar3 = this.this$0;
                a = Result.a(obj3);
                if (a != null) {
                    pz40 Y3 = bVar3.Y();
                    do {
                        r0Var = (r0) Y3;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, wcb0.a((wcb0) value, new s8j0(a), emptyList, null, null, null, null, null, null, 505)));
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        b bVar4 = this.this$0;
        this.label = 2;
        Object e0 = bVar4.e0(null, this);
        if (e0 != coroutineSingletons) {
            obj2 = e0;
            b bVar22 = this.this$0;
            sls slsVar2 = this.$analyticsOnSuccess;
            z = obj2 instanceof Result.Failure;
            EmptyList emptyList2 = EmptyList.a;
            if (z) {
            }
            b bVar32 = this.this$0;
            a = Result.a(obj3);
            if (a != null) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
