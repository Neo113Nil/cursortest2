package com.ybsdk.feature.status.screen.internal.ui;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.DivkitCommonEvents$DivkitCommonScreenLoadedResult;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams;
import defpackage.bsl;
import defpackage.dsg;
import defpackage.jfp0;
import defpackage.jqp0;
import defpackage.kpn;
import defpackage.lrp0;
import defpackage.msl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.psl;
import defpackage.pz40;
import defpackage.qis;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.t8j;
import defpackage.trp0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.status.screen.internal.ui.DivkitCommonViewModel$load$2", f = "DivkitCommonViewModel.kt", l = {142, 145}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivkitCommonViewModel$load$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivkitCommonViewModel$load$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivkitCommonViewModel$load$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivkitCommonViewModel$load$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x003b, code lost:
    
        if (r13 == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        a aVar;
        bsl bslVar;
        Object obj2;
        bsl bslVar2;
        qis qisVar;
        Throwable a2;
        r0 r0Var;
        Object value;
        boolean z;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            com.ybsdk.feature.status.screen.internal.data.a aVar3 = aVar2.D;
            DivkitCommonScreenParams divkitCommonScreenParams = aVar2.B;
            this.label = 1;
            a = aVar3.a(divkitCommonScreenParams, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bslVar2 = (bsl) this.L$2;
                aVar = (a) this.L$1;
                obj2 = this.L$0;
                kotlin.b.b(obj);
                qisVar = (qis) obj;
                if (qisVar != null) {
                    bslVar = bslVar2;
                    a = obj2;
                    obj2 = a;
                    qisVar = null;
                    bslVar2 = bslVar;
                    aVar.a0(new t8j(4, aVar, bslVar2));
                    if (qisVar != null) {
                    }
                    List list = bslVar2.g;
                    if (r13) {
                    }
                    Y = aVar.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, msl.a((msl) aVar.X(), null, z, 31)));
                    a = obj2;
                    a aVar4 = this.this$0;
                    a2 = Result.a(a);
                    if (a2 != null) {
                    }
                    return zy11.a;
                }
                aVar.Z(new psl(qisVar));
                aVar.a0(new t8j(4, aVar, bslVar2));
                boolean z2 = qisVar != null;
                List list2 = bslVar2.g;
                z = z2 && (list2 != null ? (kpn) kotlin.collections.a.R(list2) : null) != null;
                Y = aVar.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, msl.a((msl) aVar.X(), null, z, 31)));
                a = obj2;
                a aVar42 = this.this$0;
                a2 = Result.a(a);
                if (a2 != null) {
                    AppAnalyticsReporter appAnalyticsReporter = aVar42.F;
                    DivkitCommonScreenParams divkitCommonScreenParams2 = aVar42.B;
                    rt1.m(appAnalyticsReporter.v, divkitCommonScreenParams2.getPath(), divkitCommonScreenParams2.getScreen(), DivkitCommonEvents$DivkitCommonScreenLoadedResult.ERROR, a2.getMessage(), 16);
                    List singletonList = Collections.singletonList(lrp0.h);
                    String path = divkitCommonScreenParams2.getPath();
                    boolean isEmpty = singletonList.isEmpty();
                    if (!isEmpty) {
                        if (isEmpty) {
                            w511.b();
                            return null;
                        }
                        str = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
                    }
                    trp0 trp0Var = trp0.a;
                    trp0.e(new jqp0(a2, "Failed to load divkit common screen with path", path, str));
                    pz40 Y2 = aVar42.Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, msl.a((msl) aVar42.X(), new s8j0(a2), false, 55)));
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        aVar = this.this$0;
        if (!(a instanceof Result.Failure)) {
            bslVar = (bsl) a;
            List list3 = bslVar.f;
            if (list3 != null) {
                this.L$0 = a;
                this.L$1 = aVar;
                this.L$2 = bslVar;
                this.label = 2;
                qis a3 = aVar.H.a(list3, new jfp0(aVar.B.getPath()));
                if (a3 != coroutineSingletons) {
                    obj2 = a;
                    obj = a3;
                    bslVar2 = bslVar;
                    qisVar = (qis) obj;
                    if (qisVar != null) {
                    }
                }
                return coroutineSingletons;
            }
            obj2 = a;
            qisVar = null;
            bslVar2 = bslVar;
            aVar.a0(new t8j(4, aVar, bslVar2));
            if (qisVar != null) {
            }
            List list22 = bslVar2.g;
            if (z2) {
            }
            Y = aVar.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, msl.a((msl) aVar.X(), null, z, 31)));
            a = obj2;
        }
        a aVar422 = this.this$0;
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }
}
