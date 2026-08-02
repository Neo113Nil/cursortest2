package com.ybsdk.common.repositiories.applications;

import com.ybsdk.core.utils.dto.common.ApplicationType;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ApplicationRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/ApplicationResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.repositiories.applications.ApplicationRepositoryImpl$create$2", f = "ApplicationRepositoryImpl.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApplicationRepositoryImpl$create$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ ApplicationType $type;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationRepositoryImpl$create$2(b bVar, ApplicationType applicationType, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$type = applicationType;
        this.$idempotencyToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ApplicationRepositoryImpl$create$2(this.this$0, this.$type, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ApplicationRepositoryImpl$create$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Api api = this.this$0.a;
            ApplicationRequest applicationRequest = new ApplicationRequest(this.$type);
            String str = this.$idempotencyToken;
            this.label = 1;
            h = api.h(applicationRequest, str, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            h = ((Result) obj).getValue();
        }
        return new Result(h);
    }
}
