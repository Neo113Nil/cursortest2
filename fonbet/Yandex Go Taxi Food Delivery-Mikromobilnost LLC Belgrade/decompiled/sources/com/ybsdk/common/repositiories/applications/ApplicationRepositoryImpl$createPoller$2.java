package com.ybsdk.common.repositiories.applications;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ApplicationStatusRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/network/dto/ApplicationStatusResponse;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.applications.ApplicationRepositoryImpl$createPoller$2", f = "ApplicationRepositoryImpl.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApplicationRepositoryImpl$createPoller$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/network/dto/ApplicationStatusResponse;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.common.repositiories.applications.ApplicationRepositoryImpl$createPoller$2$1", f = "ApplicationRepositoryImpl.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.common.repositiories.applications.ApplicationRepositoryImpl$createPoller$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ String $applicationId;
        final /* synthetic */ int $attemptNumber;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, String str, int i, Continuation continuation) {
            super(1, continuation);
            this.this$0 = bVar;
            this.$applicationId = str;
            this.$attemptNumber = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$applicationId, this.$attemptNumber, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object L;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                Api api = this.this$0.a;
                ApplicationStatusRequest applicationStatusRequest = new ApplicationStatusRequest(this.$applicationId);
                int i2 = this.$attemptNumber;
                this.label = 1;
                L = api.L(applicationStatusRequest, i2, this);
                if (L == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                L = ((Result) obj).getValue();
            }
            return new Result(L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationRepositoryImpl$createPoller$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$applicationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ApplicationRepositoryImpl$createPoller$2 applicationRepositoryImpl$createPoller$2 = new ApplicationRepositoryImpl$createPoller$2(this.this$0, this.$applicationId, continuation);
        applicationRepositoryImpl$createPoller$2.I$0 = ((tq11) obj).a;
        return applicationRepositoryImpl$createPoller$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        ApplicationRepositoryImpl$createPoller$2 applicationRepositoryImpl$createPoller$2 = new ApplicationRepositoryImpl$createPoller$2(this.this$0, this.$applicationId, (Continuation) obj2);
        applicationRepositoryImpl$createPoller$2.I$0 = i;
        return applicationRepositoryImpl$createPoller$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$applicationId, this.I$0, null);
            this.label = 1;
            c = c.c(anonymousClass1, this);
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
