package com.ybsdk.feature.transfer.version2.internal.screens.fund;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.transfer.version2.api.entities.FundDocsNoticeInfo;
import defpackage.cos;
import defpackage.dsg;
import defpackage.g8e;
import defpackage.jqp0;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.rr51;
import defpackage.s8j0;
import defpackage.trp0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xns;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeViewModel$load$2", f = "FundDocsNoticeViewModel.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FundDocsNoticeViewModel$load$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundDocsNoticeViewModel$load$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FundDocsNoticeViewModel$load$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FundDocsNoticeViewModel$load$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        r0 r0Var;
        Object value;
        s8j0 s8j0Var;
        r0 r0Var2;
        Object value2;
        r8j0 r8j0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.domain.b bVar = aVar.E;
            FundDocsNoticeInfo noticeInfo = aVar.B.getNoticeInfo();
            this.label = 1;
            g = bVar.g(noticeInfo, this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            g = ((Result) obj).getValue();
        }
        if (!(g instanceof Result.Failure)) {
            try {
                g = ((xns) g).b;
            } catch (Throwable th) {
                g = new Result.Failure(th);
            }
        }
        a aVar2 = this.this$0;
        if (!(g instanceof Result.Failure)) {
            rr51 rr51Var = (rr51) g;
            pz40 Y = aVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                r8j0Var = new r8j0(rr51Var, null, 14);
                ((cos) value2).getClass();
            } while (!r0Var2.k(value2, new cos(r8j0Var)));
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(g);
        if (a != null) {
            List singletonList = Collections.singletonList(lrp0.l);
            String o = g8e.o("transfer_id: ", aVar3.B.getNoticeInfo().getTransferId());
            boolean isEmpty = singletonList.isEmpty();
            if (!isEmpty) {
                if (isEmpty) {
                    w511.b();
                    return null;
                }
                str = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
            }
            trp0 trp0Var = trp0.a;
            trp0.e(new jqp0(a, "Failed to load fund docs", o, str));
            pz40 Y2 = aVar3.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
                s8j0Var = new s8j0(a);
                ((cos) value).getClass();
            } while (!r0Var.k(value, new cos(s8j0Var)));
        }
        return zy11.a;
    }
}
