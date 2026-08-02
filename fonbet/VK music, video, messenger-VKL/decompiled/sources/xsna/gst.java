package xsna;

import android.content.Context;
import android.os.Build;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vksteps.utils.enums.HealthConnectInstallType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: GetInfoHealthConnectCommand.kt */
/* loaded from: classes6.dex */
public final class gst extends dvv0 {
    public final FragmentImpl e;
    public final ayu0 f;

    /* compiled from: GetInfoHealthConnectCommand.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetInfoHealthConnectCommand$execute$1", f = "GetInfoHealthConnectCommand.kt", l = {68}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ String $data;
        Object L$0;
        int label;
        final /* synthetic */ gst this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, gst gstVar, spj<? super a> spjVar) {
            super(1, spjVar);
            this.$data = str;
            this.this$0 = gstVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new a(this.$data, this.this$0, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Context context;
            fvv0 M;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                xgx0 xgx0Var = xgx0.a;
                String str = "VkStepsGetInfoHealthConnectCommand.execute() -> data: " + this.$data + ", thread: " + Thread.currentThread().getName();
                xgx0Var.getClass();
                xgx0.a(str);
                if (!BuildInfo.h()) {
                    r6y r6yVar = this.this$0.b;
                    Long valueOf = (r6yVar == null || (M = r6yVar.M()) == null) ? null : Long.valueOf(M.getAppId());
                    ArrayList arrayList = imv0.q;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            long longValue = ((Number) it.next()).longValue();
                            if (valueOf != null && valueOf.longValue() == longValue) {
                            }
                        }
                    }
                    r6y r6yVar2 = this.this$0.b;
                    if (r6yVar2 != null) {
                        bex0.a.a(r6yVar2, JsApiMethodType.GET_HEALTH_CONNECT_INFO, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                    }
                    return s3q0.a;
                }
                Context mo2getContext = this.this$0.e.mo2getContext();
                if (mo2getContext == null) {
                    r6y r6yVar3 = this.this$0.b;
                    if (r6yVar3 != null) {
                        bex0.a.a(r6yVar3, JsApiMethodType.GET_HEALTH_CONNECT_INFO, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                    }
                    return s3q0.a;
                }
                if (!this.this$0.f.b(mo2getContext)) {
                    r6y r6yVar4 = this.this$0.b;
                    if (r6yVar4 != null) {
                        bex0.a.a(r6yVar4, JsApiMethodType.GET_HEALTH_CONNECT_INFO, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                    }
                    return s3q0.a;
                }
                ayu0 ayu0Var = this.this$0.f;
                this.L$0 = mo2getContext;
                this.label = 1;
                Object a = byu0.a(ayu0Var, mo2getContext, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                context = mo2getContext;
                obj = a;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) this.L$0;
                kotlin.a.a(obj);
            }
            HealthConnectSdkStatus healthConnectSdkStatus = (HealthConnectSdkStatus) obj;
            boolean c = f890.c(context);
            boolean z = f890.b(context, "com.google.android.apps.fitness") != null;
            HealthConnectInstallType a2 = f890.a(context);
            r6y r6yVar5 = this.this$0.b;
            if (r6yVar5 != null) {
                bex0.a.b(r6yVar5, JsApiMethodType.GET_HEALTH_CONNECT_INFO, new JSONObject().put("health_connect_info", healthConnectSdkStatus.h()).put("sa_workout_health_connect", true).put("sa_steps_health_connect", e370.s != null).put("is_samsung_health_installed", c).put("device_brand", Build.BRAND).put("is_google_fit_installed", z).put("health_connect_installer", a2.name().toLowerCase(Locale.ROOT)), null, 12);
            }
            return s3q0.a;
        }
    }

    public gst(FragmentImpl fragmentImpl, ayu0 ayu0Var) {
        this.e = fragmentImpl;
        this.f = ayu0Var;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        bbs.b(this.e, new a(str, this, null));
    }
}
