package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data;

import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitAutoPullRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullResultDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullConfirmResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.Me2meDebitResultRepository$autoPullConfirm$2", f = "Me2meDebitResultRepository.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2meDebitResultRepository$autoPullConfirm$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    final /* synthetic */ String $ybId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me2meDebitResultRepository$autoPullConfirm$2(a aVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$operationId = str2;
        this.$verificationToken = str3;
        this.$ybId = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Me2meDebitResultRepository$autoPullConfirm$2(this.this$0, this.$idempotencyToken, this.$operationId, this.$verificationToken, this.$ybId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Me2meDebitResultRepository$autoPullConfirm$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Transfer2Api transfer2Api = this.this$0.a;
            String str = this.$idempotencyToken;
            String str2 = yu50.a;
            Map<String, String> b = ynb1.b(new Pair(yu50.e, this.$operationId), new Pair(yu50.a, this.$verificationToken));
            Me2MeDebitAutoPullRequest me2MeDebitAutoPullRequest = new Me2MeDebitAutoPullRequest(this.$ybId);
            this.label = 1;
            o = transfer2Api.o(str, b, me2MeDebitAutoPullRequest, this);
            if (o == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            o = ((Result) obj).getValue();
        }
        return new Result(o);
    }
}
