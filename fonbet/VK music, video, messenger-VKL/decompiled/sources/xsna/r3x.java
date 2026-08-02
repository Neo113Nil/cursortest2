package xsna;

import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.push.RegisterForPushesResult;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InsertPushTokenByProjectIdInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.domain.interactor.InsertPushTokenByProjectIdInteractor$invoke$2", f = "InsertPushTokenByProjectIdInteractor.kt", l = {36, 38}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class r3x extends SuspendLambda implements izs<spj<? super Result<? extends RegisterForPushesResult>>, Object> {
    final /* synthetic */ CallingAppIds $callingAppIds;
    final /* synthetic */ String $projectId;
    final /* synthetic */ String $pushToken;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ t3x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3x(t3x t3xVar, CallingAppIds callingAppIds, String str, String str2, spj<? super r3x> spjVar) {
        super(1, spjVar);
        this.this$0 = t3xVar;
        this.$callingAppIds = callingAppIds;
        this.$pushToken = str;
        this.$projectId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new r3x(this.this$0, this.$callingAppIds, this.$pushToken, this.$projectId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super Result<? extends RegisterForPushesResult>> spjVar) {
        return ((r3x) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r10 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        String str;
        t3x t3xVar;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (i == 0) {
            kotlin.a.a(obj);
            t3x t3xVar2 = this.this$0;
            CallingAppIds callingAppIds = this.$callingAppIds;
            String str3 = this.$pushToken;
            String str4 = this.$projectId;
            this.L$0 = str3;
            this.L$1 = str4;
            this.L$2 = t3xVar2;
            this.label = 1;
            obj = t3x.a(t3xVar2, callingAppIds, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str4;
            t3xVar = t3xVar2;
            str2 = str3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                failure = (RegisterForPushesResult) obj;
                return new Result(failure);
            }
            t3x t3xVar3 = (t3x) this.L$2;
            String str5 = (String) this.L$1;
            String str6 = (String) this.L$0;
            kotlin.a.a(obj);
            str = str5;
            str2 = str6;
            t3xVar = t3xVar3;
        }
        long longValue = ((Number) obj).longValue();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = t3x.b(t3xVar, longValue, str2, str, this);
    }
}
