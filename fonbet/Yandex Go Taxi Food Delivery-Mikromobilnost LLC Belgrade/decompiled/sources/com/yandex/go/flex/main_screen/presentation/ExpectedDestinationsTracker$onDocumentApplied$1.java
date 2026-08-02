package com.yandex.go.flex.main_screen.presentation;

import com.yandex.go.flex.main_screen.shared_data.ExpectedDestination;
import com.yandex.go.flex.main_screen.shared_data.ExpectedDestinations;
import defpackage.boe0;
import defpackage.mvg;
import defpackage.nbl0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.qoi0;
import defpackage.rpo;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xzl;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.ExpectedDestinationsTracker$onDocumentApplied$1", f = "ExpectedDestinationsTracker.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ExpectedDestinationsTracker$onDocumentApplied$1 extends SuspendLambda implements wls {
    final /* synthetic */ xzl $documentFetchResult;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpectedDestinationsTracker$onDocumentApplied$1(a aVar, xzl xzlVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$documentFetchResult = xzlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExpectedDestinationsTracker$onDocumentApplied$1(this.this$0, this.$documentFetchResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExpectedDestinationsTracker$onDocumentApplied$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ExpectedDestinations expectedDestinations;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nbl0 nbl0Var = this.this$0.d;
            this.label = 1;
            obj = ((noh) nbl0Var.d.getValue()).k(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boe0 boe0Var = (boe0) obj;
        if (((boe0Var != null && boe0Var.c) || this.$documentFetchResult.c != q5z.d) && (expectedDestinations = (ExpectedDestinations) this.$documentFetchResult.a.c.b(qoi0.a(ExpectedDestinations.class))) != null) {
            List<ExpectedDestination> list = expectedDestinations.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (ExpectedDestination expectedDestination : list) {
                zzs zzsVar = expectedDestination.a;
                double d = zzsVar.a;
                double d2 = zzsVar.b;
                int i2 = zzsVar.c;
                String str = expectedDestination.b;
                if (str.length() == 0) {
                    str = expectedDestination.c;
                }
                arrayList.add(new rpo(d, d2, i2, str));
            }
            r0 r0Var = this.this$0.a.a;
            r0Var.getClass();
            r0Var.m(null, arrayList);
        }
        return zy11.a;
    }
}
