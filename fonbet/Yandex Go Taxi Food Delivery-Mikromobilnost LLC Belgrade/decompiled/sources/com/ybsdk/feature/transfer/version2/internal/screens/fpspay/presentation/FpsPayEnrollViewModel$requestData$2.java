package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.f42;
import defpackage.fl1;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.vas;
import defpackage.w511;
import defpackage.was;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollViewModel$requestData$2", f = "FpsPayEnrollViewModel.kt", l = {215}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FpsPayEnrollViewModel$requestData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsPayEnrollViewModel$requestData$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FpsPayEnrollViewModel$requestData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FpsPayEnrollViewModel$requestData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object s8j0Var;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data.a aVar = this.this$0.C;
            this.label = 1;
            b = aVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        Throwable a = Result.a(b);
        if (a == null) {
            Object obj2 = (dqg) b;
            if (obj2 instanceof cqg) {
                vas vasVar = (vas) ((cqg) obj2).a;
                ArrayList arrayList = vasVar.h;
                ArrayList arrayList2 = vasVar.h;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                s8j0Var = new r8j0(new was(vasVar, arrayList != null ? (fl1) kotlin.collections.a.P(arrayList) : null, null, arrayList2.size() > 1, null, false, arrayList2.isEmpty()), null, 14);
            } else {
                if (!(obj2 instanceof bqg)) {
                    w511.b();
                    return null;
                }
                s8j0Var = new s8j0(new FailDataException((ct11) obj2));
            }
        } else {
            x4c.g("[fps-pay] Can't load fps pay enroll screen", a, null, null, 12);
            s8j0Var = new s8j0(a);
        }
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, s8j0Var));
        was wasVar = (was) ((u8j0) this.this$0.X()).a();
        if (wasVar != null) {
            f42 f42Var = this.this$0.H;
            boolean z = wasVar.g;
            fl1 fl1Var = wasVar.b;
            String str = fl1Var != null ? fl1Var.b : null;
            if (str == null) {
                str = "";
            }
            AppAnalyticsReporter appAnalyticsReporter = f42Var.b;
            if (z) {
                appAnalyticsReporter.l.a.a("card.main_screen.sbpay.connect.upgrade_screen.loaded", null);
            } else {
                appAnalyticsReporter.l.a.a("card.main_screen.sbpay.loaded", g8e.w(1, "account_type", str));
            }
        }
        return zy11.a;
    }
}
