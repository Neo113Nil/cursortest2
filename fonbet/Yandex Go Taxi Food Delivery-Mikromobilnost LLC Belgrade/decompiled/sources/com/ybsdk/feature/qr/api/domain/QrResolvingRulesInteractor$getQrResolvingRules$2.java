package com.ybsdk.feature.qr.api.domain;

import com.ybsdk.feature.qr.api.data.QrResolvingRulesApi;
import com.ybsdk.feature.qr.api.data.rules.GetResolvingRulesRequest;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wlp;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesResponseDto;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.qr.api.domain.QrResolvingRulesInteractor$getQrResolvingRules$2", f = "QrResolvingRulesInteractor.kt", l = {22, 24}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrResolvingRulesInteractor$getQrResolvingRules$2 extends SuspendLambda implements tls {
    final /* synthetic */ QrResolvingRulesSource $source;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrResolvingRulesInteractor$getQrResolvingRules$2(QrResolvingRulesSource qrResolvingRulesSource, a aVar, Continuation continuation) {
        super(1, continuation);
        this.$source = qrResolvingRulesSource;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QrResolvingRulesInteractor$getQrResolvingRules$2(this.$source, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((QrResolvingRulesInteractor$getQrResolvingRules$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r5 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r5 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            GetResolvingRulesRequest getResolvingRulesRequest = new GetResolvingRulesRequest(this.$source.getValue());
            boolean isEnabled = ((CommonFeatureFlag) this.this$0.b.a.d(wlp.b0).getData()).isEnabled();
            a aVar = this.this$0;
            if (isEnabled) {
                QrResolvingRulesApi qrResolvingRulesApi = aVar.a;
                this.label = 1;
                a = qrResolvingRulesApi.b(getResolvingRulesRequest, this);
            } else {
                QrResolvingRulesApi qrResolvingRulesApi2 = aVar.a;
                this.label = 2;
                a = qrResolvingRulesApi2.a(getResolvingRulesRequest, this);
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
