package xsna;

import android.content.Context;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* compiled from: GetWorkoutsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.GetWorkoutsHealthConnectDelegate$sendWorkoutsCustomError$1", f = "GetWorkoutsHealthConnectDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class sxt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Throwable $exception;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ xxt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxt(xxt xxtVar, String str, Throwable th, Context context, spj<? super sxt> spjVar) {
        super(1, spjVar);
        this.this$0 = xxtVar;
        this.$requestId = str;
        this.$exception = th;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new sxt(this.this$0, this.$requestId, this.$exception, this.$context, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((sxt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        wvp wvpVar = this.this$0.e;
        String str = this.$requestId;
        JSONObject put = new JSONObject().put("extra_native_description", this.$exception.getMessage());
        xxt xxtVar = this.this$0;
        Context context = this.$context;
        x1w0 x1w0Var = xxtVar.h;
        wvpVar.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, put.put("health_connect_version", x1w0.a(context, "com.google.android.apps.healthdata")).toString(), 1, null), null, null, 114686, null), str, 1, null));
        return s3q0.a;
    }
}
