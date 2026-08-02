package com.ybsdk.feature.autotopup.internal.presentation.result;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.domain.e;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusResultDataEntity;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.l04;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v5;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.z94;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultViewModel$getPaymentStatus$1", f = "AutoTopupResultViewModel.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupResultViewModel$getPaymentStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $source;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupResultViewModel$getPaymentStatus$1(b bVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$agreementId = str;
        this.$source = str2;
        this.$type = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupResultViewModel$getPaymentStatus$1(this.this$0, this.$agreementId, this.$source, this.$type, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupResultViewModel$getPaymentStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AutoTopupResultViewModel$getPaymentStatus$1 autoTopupResultViewModel$getPaymentStatus$1;
        Object c;
        String obj2;
        Text amount;
        CharSequence a;
        String str;
        ActionButtonEntity secondaryButton;
        String action;
        ActionButtonEntity primaryButton;
        Text title;
        CharSequence a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            e eVar = bVar.H;
            String str2 = this.$agreementId;
            String str3 = this.$source;
            String str4 = this.$type;
            boolean z = bVar.M;
            this.label = 1;
            autoTopupResultViewModel$getPaymentStatus$1 = this;
            c = eVar.c(str2, str3, str4, z, autoTopupResultViewModel$getPaymentStatus$1);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
            autoTopupResultViewModel$getPaymentStatus$1 = this;
        }
        b bVar2 = autoTopupResultViewModel$getPaymentStatus$1.this$0;
        if (!(c instanceof Result.Failure)) {
            dqg dqgVar = (dqg) c;
            if (dqgVar instanceof cqg) {
                AutotopupPaymentStatusResultDataEntity resultData = ((AutotopupPaymentStatusEntity) ((cqg) dqgVar).a).getResultData();
                Context context = bVar2.G;
                bVar2.a0(new v5(25, resultData, bVar2));
                l04 l04Var = bVar2.F;
                String str5 = "";
                if (resultData == null || (title = resultData.getTitle()) == null || (a2 = d.a(context, title)) == null || (obj2 = a2.toString()) == null) {
                    obj2 = (resultData == null || (amount = resultData.getAmount()) == null || (a = d.a(context, amount)) == null) ? "" : a.toString();
                }
                if (resultData == null || (primaryButton = resultData.getPrimaryButton()) == null || (str = primaryButton.getAction()) == null) {
                    str = "";
                }
                if (resultData != null && (secondaryButton = resultData.getSecondaryButton()) != null && (action = secondaryButton.getAction()) != null) {
                    str5 = action;
                }
                z94 z94Var = l04Var.a.e;
                LinkedHashMap t = x4e.t(3, "error", obj2, "deeplink1", str);
                t.put("deeplink2", str5);
                z94Var.a.a("auto_topup.settings.result_screen_info.loaded", t);
            } else {
                if (!(dqgVar instanceof bqg)) {
                    w511.b();
                    return null;
                }
                b.b0(bVar2);
            }
        }
        b bVar3 = autoTopupResultViewModel$getPaymentStatus$1.this$0;
        Throwable a3 = Result.a(c);
        if (a3 != null) {
            x4c.g("Failed to get auto topup payment status", a3, null, Collections.singletonList(lrp0.b), 4);
            b.b0(bVar3);
        }
        return zy11.a;
    }
}
