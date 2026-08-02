package com.yandex.messaging.domain.experiments;

import com.yandex.messaging.core.net.entities.GetExperimentsResponse;
import com.yandex.messaging.core.net.entities.TestIdData;
import com.yandex.messaging.internal.authorized.i;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getExperiments$$inlined$makeCall$1;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.fi9;
import defpackage.fse;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.qn2;
import defpackage.tcc;
import defpackage.tgy0;
import defpackage.tje;
import defpackage.to3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.experiments.ExperimentsController$initExperiments$2", f = "ExperimentsController.kt", l = {58, 60}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ExperimentsController$initExperiments$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsController$initExperiments$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExperimentsController$initExperiments$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentsController$initExperiments$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r7 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        if (r7 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            fi9 b = i.b(this.this$0.b);
            this.label = 1;
            obj = e.y(b, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                oyj0 oyj0Var = (oyj0) obj;
                GetExperimentsResponse getExperimentsResponse = (GetExperimentsResponse) oyj0Var.b();
                if (getExperimentsResponse != null) {
                    a aVar = this.this$0;
                    aVar.d.a.reportEvent("ab_experiments_received", gw00.e(new Pair("names", kotlin.collections.a.J0(getExperimentsResponse.getFlags().a.keySet()))));
                    aVar.g(getExperimentsResponse.getFlags());
                    tgy0 tgy0Var = aVar.e;
                    List<TestIdData> testIds = getExperimentsResponse.getTestIds();
                    ArrayList arrayList = new ArrayList(tcc.n(testIds, 10));
                    Iterator<T> it = testIds.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((TestIdData) it.next()).getTestId());
                    }
                    tgy0Var.a(kotlin.collections.a.N0(arrayList));
                }
                qn2 qn2Var = (qn2) oyj0Var.a();
                if (qn2Var != null) {
                    this.this$0.d.a.reportEvent("ab_experiments_call_error", gw00.e(new Pair(AuthSdkActivity.RESPONSE_TYPE_CODE, Integer.valueOf(qn2Var.a))));
                }
                return zy11.a;
            }
            b.b(obj);
        }
        this.this$0.d.a.reportEvent("ab_experiments_request");
        to3 a = ((d9g) ((cl21) obj)).a();
        this.label = 2;
        fse fseVar = get_context();
        if (fseVar == null) {
            fseVar = get_context();
        }
        obj = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$getExperiments$$inlined$makeCall$1(null, a), this);
    }
}
