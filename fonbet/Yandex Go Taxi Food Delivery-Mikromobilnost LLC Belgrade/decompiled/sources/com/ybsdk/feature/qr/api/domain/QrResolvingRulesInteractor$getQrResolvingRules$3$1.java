package com.ybsdk.feature.qr.api.domain;

import com.ybsdk.feature.qr.api.data.rules.GetResolvingRulesResponseDto;
import com.ybsdk.feature.qr.api.data.rules.GetResolvingRulesRuleDto;
import defpackage.ctj0;
import defpackage.dtj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesResponseDto;", Constants.KEY_DATA, "Ldtj0;", "<anonymous>", "(Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesResponseDto;)Ldtj0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.api.domain.QrResolvingRulesInteractor$getQrResolvingRules$3$1", f = "QrResolvingRulesInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrResolvingRulesInteractor$getQrResolvingRules$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrResolvingRulesInteractor$getQrResolvingRules$3$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrResolvingRulesInteractor$getQrResolvingRules$3$1 qrResolvingRulesInteractor$getQrResolvingRules$3$1 = new QrResolvingRulesInteractor$getQrResolvingRules$3$1(this.this$0, continuation);
        qrResolvingRulesInteractor$getQrResolvingRules$3$1.L$0 = obj;
        return qrResolvingRulesInteractor$getQrResolvingRules$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrResolvingRulesInteractor$getQrResolvingRules$3$1) create((GetResolvingRulesResponseDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        GetResolvingRulesResponseDto getResolvingRulesResponseDto = (GetResolvingRulesResponseDto) this.L$0;
        this.this$0.getClass();
        List<GetResolvingRulesRuleDto> rules = getResolvingRulesResponseDto.getRules();
        ArrayList arrayList = new ArrayList(tcc.n(rules, 10));
        for (GetResolvingRulesRuleDto getResolvingRulesRuleDto : rules) {
            arrayList.add(new ctj0(getResolvingRulesRuleDto.getRegexes(), getResolvingRulesRuleDto.getCategory(), getResolvingRulesRuleDto.getDeeplinkTemplate()));
        }
        return new dtj0(arrayList, getResolvingRulesResponseDto.getUnknownQrDeeplink());
    }
}
