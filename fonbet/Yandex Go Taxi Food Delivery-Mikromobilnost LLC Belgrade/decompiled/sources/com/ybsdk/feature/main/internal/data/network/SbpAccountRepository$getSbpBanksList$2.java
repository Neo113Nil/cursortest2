package com.ybsdk.feature.main.internal.data.network;

import defpackage.cg91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.uza;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountsYbsSuccessDataDto;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.main.internal.data.network.SbpAccountRepository$getSbpBanksList$2", f = "SbpAccountRepository.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpAccountRepository$getSbpBanksList$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpAccountRepository$getSbpBanksList$2(c cVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SbpAccountRepository$getSbpBanksList$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SbpAccountRepository$getSbpBanksList$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SbpAccountApi sbpAccountApi = this.this$0.a;
            this.label = 1;
            byte[] bArr = new byte[5];
            for (int i2 = 0; i2 < 5; i2++) {
                bArr[i2] = (byte) (cg91.c[i2] ^ cg91.a[i2 % 8]);
            }
            c = sbpAccountApi.c(new String(bArr, uza.a), this);
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
        }
        return new Result(c);
    }
}
