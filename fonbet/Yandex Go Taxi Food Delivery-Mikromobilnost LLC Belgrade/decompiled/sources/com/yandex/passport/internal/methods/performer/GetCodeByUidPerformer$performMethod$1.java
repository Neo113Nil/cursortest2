package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.u4;
import com.yandex.passport.data.network.z4;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.CredentialProvider;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/data/network/y4;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetCodeByUidPerformer$performMethod$1", f = "GetCodeByUidPerformer.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetCodeByUidPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ ModernAccount $account;
    final /* synthetic */ CredentialProvider $credentialsProvider;
    final /* synthetic */ Environment $environment;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCodeByUidPerformer$performMethod$1(CredentialProvider credentialProvider, a0 a0Var, Environment environment, ModernAccount modernAccount, Continuation continuation) {
        super(2, continuation);
        this.$credentialsProvider = credentialProvider;
        this.this$0 = a0Var;
        this.$environment = environment;
        this.$account = modernAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetCodeByUidPerformer$performMethod$1(this.$credentialsProvider, this.this$0, this.$environment, this.$account, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetCodeByUidPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClientCredentials clientCredentials;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CredentialProvider credentialProvider = this.$credentialsProvider;
        if (jl40.l(credentialProvider, CredentialProvider.FromProperties.INSTANCE)) {
            clientCredentials = this.this$0.w.r(this.$environment);
        } else if (jl40.l(credentialProvider, CredentialProvider.NoCredentials.INSTANCE)) {
            clientCredentials = null;
        } else {
            if (!(credentialProvider instanceof CredentialProvider.Provided)) {
                w511.b();
                return null;
            }
            clientCredentials = ((CredentialProvider.Provided) this.$credentialsProvider).getClientCredentials();
        }
        a0 a0Var = this.this$0;
        z4 z4Var = a0Var.c;
        com.yandex.passport.internal.network.mappers.b bVar = a0Var.x;
        Environment environment = this.$environment;
        bVar.getClass();
        u4 u4Var = new u4(this.$account.getLocationId(), this.$account.getMasterToken(), com.yandex.passport.internal.network.mappers.b.a(environment), clientCredentials != null ? clientCredentials.getDecryptedId() : null, clientCredentials != null ? clientCredentials.getDecryptedSecret() : null);
        this.label = 1;
        Object a = z4Var.a(u4Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
