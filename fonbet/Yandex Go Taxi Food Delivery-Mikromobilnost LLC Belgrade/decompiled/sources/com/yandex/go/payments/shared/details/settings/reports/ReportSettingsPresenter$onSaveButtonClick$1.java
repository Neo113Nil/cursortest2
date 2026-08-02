package com.yandex.go.payments.shared.details.settings.reports;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.SaveReportSettingsRequest;
import com.yandex.go.payments.shared.v;
import defpackage.il;
import defpackage.l3j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.details.settings.reports.ReportSettingsPresenter$onSaveButtonClick$1", f = "ReportSettingsPresenter.kt", l = {HProv.PP_CIPHEROID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ReportSettingsPresenter$onSaveButtonClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ SaveReportSettingsRequest $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ l3j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportSettingsPresenter$onSaveButtonClick$1(l3j0 l3j0Var, SaveReportSettingsRequest saveReportSettingsRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = l3j0Var;
        this.$request = saveReportSettingsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReportSettingsPresenter$onSaveButtonClick$1(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReportSettingsPresenter$onSaveButtonClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l3j0 l3j0Var;
        l3j0 l3j0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                l3j0 l3j0Var3 = this.this$0;
                SaveReportSettingsRequest saveReportSettingsRequest = this.$request;
                try {
                    v vVar = l3j0Var3.y;
                    il ilVar = l3j0Var3.A;
                    String str = ilVar.b().a;
                    String str2 = ilVar.b().k;
                    this.L$0 = l3j0Var3;
                    this.L$1 = l3j0Var3;
                    this.label = 1;
                    Object o = vVar.o(str, saveReportSettingsRequest, str2, this);
                    if (o == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    l3j0Var = l3j0Var3;
                    obj = o;
                    l3j0Var2 = l3j0Var;
                } catch (Throwable th) {
                    th = th;
                    l3j0Var = l3j0Var3;
                    l3j0Var.Mg(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l3j0Var = (l3j0) this.L$1;
                l3j0Var2 = (l3j0) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    l3j0Var.Mg(th);
                    return zy11.a;
                }
            }
            l3j0.Kg(l3j0Var2, (Account) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
