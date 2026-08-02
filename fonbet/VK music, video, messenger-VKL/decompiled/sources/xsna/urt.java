package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.C4217a2;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: GetGoogleFitWorkoutPermissionsCommand.kt */
/* loaded from: classes6.dex */
public final class urt extends dvv0 {
    public final FragmentImpl e;
    public final ayu0 f;

    /* compiled from: GetGoogleFitWorkoutPermissionsCommand.kt */
    @b6l(c = "com.vk.superapp.vkworkout.infrastructure.commands.GetGoogleFitWorkoutPermissionsCommand$execute$1", f = "GetGoogleFitWorkoutPermissionsCommand.kt", l = {65}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(1, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return urt.this.new a(spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FragmentActivity activity;
            FragmentActivity activity2;
            fvv0 M;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    r6y r6yVar = urt.this.b;
                    Long valueOf = (r6yVar == null || (M = r6yVar.M()) == null) ? null : Long.valueOf(M.getAppId());
                    if (!BuildInfo.h() && !j5g.P(g2w0.j, valueOf)) {
                        r6y r6yVar2 = urt.this.b;
                        if (r6yVar2 != null) {
                            bex0.a.a(r6yVar2, JsApiMethodType.GET_WORKOUT_PERMISSIONS, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                        }
                        return s3q0.a;
                    }
                    Context mo2getContext = urt.this.e.mo2getContext();
                    if (mo2getContext == null || (((activity = urt.this.e.getActivity()) != null && activity.isDestroyed()) || ((activity2 = urt.this.e.getActivity()) != null && activity2.isFinishing()))) {
                        r6y r6yVar3 = urt.this.b;
                        if (r6yVar3 != null) {
                            bex0.a.a(r6yVar3, JsApiMethodType.GET_WORKOUT_PERMISSIONS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                        }
                        return s3q0.a;
                    }
                    ayu0 ayu0Var = urt.this.f;
                    RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
                    this.label = 1;
                    obj = byu0.b(ayu0Var, mo2getContext, requestedMiniApp, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                iyu0 iyu0Var = (iyu0) obj;
                boolean e = jyu0.e(iyu0Var);
                boolean z = iyu0Var.b;
                String str = e ? "granted" : z ? "disabled_can_ask" : C4217a2.e;
                r6y r6yVar4 = urt.this.b;
                if (r6yVar4 != null) {
                    JsApiMethodType jsApiMethodType = JsApiMethodType.GET_WORKOUT_PERMISSIONS;
                    JSONObject d = yq.d("permission_state", str);
                    d.put("mobile_services_type", iyu0Var.h.h());
                    d.put("has_activity_recognition", iyu0Var.a);
                    if (z) {
                        d.put("has_logged_gms", iyu0Var.c);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    bex0.a.b(r6yVar4, jsApiMethodType, d, null, 12);
                }
                return s3q0.a;
            } catch (Throwable th) {
                String str2 = "GetGoogleFitWorkoutPermissionsCommand.execute() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
                xgx0.a.getClass();
                xgx0.b(str2);
                r6y r6yVar5 = urt.this.b;
                if (r6yVar5 != null) {
                    bex0.a.a(r6yVar5, JsApiMethodType.GET_WORKOUT_PERMISSIONS, VkAppsErrors.Client.CUSTOM_ERROR, str2, null, null, 56);
                }
                return s3q0.a;
            }
        }
    }

    public urt(FragmentImpl fragmentImpl, ayu0 ayu0Var) {
        this.e = fragmentImpl;
        this.f = ayu0Var;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        m4s.z(this.e, new a(null));
    }
}
