package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoFundInputType;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupValidationError;
import com.ybsdk.feature.autotopup.internal.network.dto.AutofundValidationError;
import com.ybsdk.feature.autotopup.internal.network.dto.ValidateAutoTopupSuccessData;
import defpackage.g031;
import defpackage.g8e;
import defpackage.h031;
import defpackage.h04;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.ty21;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupSuccessData;", "successData", "Lh031;", "<anonymous>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupSuccessData;)Lh031;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$validateAutoTopupInfo$3$1", f = "AutoTopupSetupRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$validateAutoTopupInfo$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ ty21 $info;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$validateAutoTopupInfo$3$1(ty21 ty21Var, Continuation continuation) {
        super(2, continuation);
        this.$info = ty21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupRepository$validateAutoTopupInfo$3$1 autoTopupSetupRepository$validateAutoTopupInfo$3$1 = new AutoTopupSetupRepository$validateAutoTopupInfo$3$1(this.$info, continuation);
        autoTopupSetupRepository$validateAutoTopupInfo$3$1.L$0 = obj;
        return autoTopupSetupRepository$validateAutoTopupInfo$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupRepository$validateAutoTopupInfo$3$1) create((ValidateAutoTopupSuccessData) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AutoTopupInputType autoTopupInputType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ValidateAutoTopupSuccessData validateAutoTopupSuccessData = (ValidateAutoTopupSuccessData) this.L$0;
        ty21 ty21Var = this.$info;
        List<AutofundValidationError> autofundErrors = validateAutoTopupSuccessData.getAutofundErrors();
        ArrayList arrayList = new ArrayList(tcc.n(autofundErrors, 10));
        for (AutofundValidationError autofundValidationError : autofundErrors) {
            String title = autofundValidationError.getTitle();
            Text.Constant i = title != null ? g8e.i(Text.Companion, title) : null;
            Text.Constant i2 = g8e.i(Text.Companion, autofundValidationError.getMessage());
            if (h04.f[autofundValidationError.getField().ordinal()] != 1) {
                w511.b();
                return null;
            }
            arrayList.add(new g031(i, i2, AutoFundInputType.AUTOFUND_MONEY));
        }
        List<AutoTopupValidationError> autotopupErrors = validateAutoTopupSuccessData.getAutotopupErrors();
        ArrayList arrayList2 = new ArrayList(tcc.n(autotopupErrors, 10));
        for (AutoTopupValidationError autoTopupValidationError : autotopupErrors) {
            String title2 = autoTopupValidationError.getTitle();
            Text.Constant i3 = title2 != null ? g8e.i(Text.Companion, title2) : null;
            Text.Constant i4 = g8e.i(Text.Companion, autoTopupValidationError.getMessage());
            int i5 = h04.g[autoTopupValidationError.getField().ordinal()];
            if (i5 == 1) {
                autoTopupInputType = AutoTopupInputType.AMOUNT;
            } else {
                if (i5 != 2) {
                    w511.b();
                    return null;
                }
                autoTopupInputType = AutoTopupInputType.THRESHOLD;
            }
            arrayList2.add(new g031(i3, i4, autoTopupInputType));
        }
        return new h031(ty21Var, arrayList, arrayList2);
    }
}
