package com.ybsdk.feature.main.internal.screens.sbpPartners;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetShownTheme;
import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.main.internal.data.network.c;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.dim0;
import defpackage.eim0;
import defpackage.fim0;
import defpackage.gao;
import defpackage.him0;
import defpackage.jl40;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.qv5;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersViewModel$bindAnotherBankAccount$1", f = "SbpPartnersViewModel.kt", l = {342}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpPartnersViewModel$bindAnotherBankAccount$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $nspkId;
    final /* synthetic */ YbButtonView.a $primaryButtonState;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpPartnersViewModel$bindAnotherBankAccount$1(a aVar, String str, YbButtonView.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$nspkId = str;
        this.$primaryButtonState = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SbpPartnersViewModel$bindAnotherBankAccount$1(this.this$0, this.$nspkId, this.$primaryButtonState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpPartnersViewModel$bindAnotherBankAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        lrp0 lrp0Var = lrp0.C;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = this.this$0.B;
            String str = this.$nspkId;
            this.label = 1;
            Object b = cVar.b(str, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        YbButtonView.a aVar2 = this.$primaryButtonState;
        String str2 = this.$nspkId;
        if (!(obj2 instanceof Result.Failure)) {
            qv5 qv5Var = (qv5) obj2;
            String str3 = qv5Var.a;
            CommonSheetEntity commonSheetEntity = qv5Var.b;
            if (str3 == null) {
                aVar.getClass();
                aVar.Z(new eim0(aVar2));
                aVar.Z(new him0(gao.e(null, Text.Empty.INSTANCE, null, 1)));
                x4c.g("Null deeplink during another yb sbp account binding", null, "bank " + str2, Collections.singletonList(lrp0Var), 2);
            } else if (aVar.G.c(str3).b) {
                Boolean bool = aVar.L;
                boolean l = jl40.l(bool, Boolean.TRUE);
                dim0 dim0Var = dim0.a;
                if (l) {
                    aVar.Z(new eim0(aVar2));
                    aVar.Z(dim0Var);
                } else if (jl40.l(bool, Boolean.FALSE)) {
                    aVar.Z(dim0Var);
                    aVar.Z(new fim0(new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(commonSheetEntity.getTitle(), commonSheetEntity.getDescription(), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(commonSheetEntity.getPrimaryButton().getText(), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131060), new o8k0(25, aVar, str2), commonSheetEntity.getPrimaryButton().getDeeplink()));
                    ((AppAnalyticsReporter) aVar.H.a).G.r(str2, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetShownTheme.NO_APP_INSTALLED);
                } else {
                    if (bool != null) {
                        w511.b();
                        return null;
                    }
                    aVar.Z(new eim0(aVar2));
                    aVar.Z(new him0(gao.e(null, Text.Empty.INSTANCE, null, 1)));
                    x4c.g("Intent not resolved", null, "in SbpBanksViewModel", Collections.singletonList(lrp0Var), 2);
                }
                aVar.L = null;
            } else {
                aVar.Z(new eim0(aVar2));
                aVar.Z(new him0(gao.e(null, Text.Empty.INSTANCE, null, 1)));
            }
        }
        a aVar3 = this.this$0;
        YbButtonView.a aVar4 = this.$primaryButtonState;
        Throwable a = Result.a(obj2);
        if (a != null) {
            aVar3.getClass();
            aVar3.Z(new eim0(aVar4));
            aVar3.Z(new him0(gao.e(null, Text.Empty.INSTANCE, a, 1)));
        }
        return zy11.a;
    }
}
