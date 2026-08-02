package xsna;

import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.GetHealthConnectInfo$Response;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetInfoHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetInfoHealthConnectDelegate$execute$1", f = "GetInfoHealthConnectDelegate.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class hst extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ ist this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hst(ist istVar, FragmentActivity fragmentActivity, String str, spj<? super hst> spjVar) {
        super(1, spjVar);
        this.this$0 = istVar;
        this.$fragmentActivity = fragmentActivity;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new hst(this.this$0, this.$fragmentActivity, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((hst) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ayu0 ayu0Var = this.this$0.e;
            FragmentActivity fragmentActivity = this.$fragmentActivity;
            this.label = 1;
            a = byu0.a(ayu0Var, fragmentActivity, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = obj;
        }
        HealthConnectSdkStatus healthConnectSdkStatus = (HealthConnectSdkStatus) a;
        com.vk.superapp.base.js.bridge.b.p(this.this$0.b, new JsMethod("VKWebAppGetHealthConnectInfo"), new GetHealthConnectInfo$Response(null, new GetHealthConnectInfo$Response.Data(healthConnectSdkStatus.h(), true, e370.s != null, Build.BRAND, Boolean.valueOf(f890.c(this.$fragmentActivity)), Boolean.valueOf(f890.b(this.$fragmentActivity, "com.google.android.apps.fitness") != null), f890.a(this.$fragmentActivity).name().toLowerCase(Locale.ROOT), this.$requestId), this.$requestId, 1, null), null, null, false, null, 60);
        return s3q0.a;
    }
}
