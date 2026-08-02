package com.ybsdk.feature.partnerselection.internal.data.helpers;

import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerRequest;
import defpackage.ji90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.partnerselection.internal.data.helpers.PartnerSelectionHelper$checkUserPartnerCrossBorder$response$1", f = "PartnerSelectionHelper.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerSelectionHelper$checkUserPartnerCrossBorder$response$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ CrossBorderCheckUserPartnerRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerSelectionHelper$checkUserPartnerCrossBorder$response$1(a aVar, String str, CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$request = crossBorderCheckUserPartnerRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PartnerSelectionHelper$checkUserPartnerCrossBorder$response$1(this.this$0, this.$idempotencyToken, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PartnerSelectionHelper$checkUserPartnerCrossBorder$response$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ji90 ji90Var = this.this$0.a;
            String str = this.$idempotencyToken;
            CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest = this.$request;
            this.label = 1;
            b = ji90Var.b(str, crossBorderCheckUserPartnerRequest, this);
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
        return new Result(b);
    }
}
