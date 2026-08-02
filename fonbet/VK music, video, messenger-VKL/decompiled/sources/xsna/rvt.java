package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: GetStepsPermissionsCommand.kt */
/* loaded from: classes6.dex */
public final class rvt extends dvv0 {
    public final FragmentImpl e;
    public final ayu0 f;

    /* compiled from: GetStepsPermissionsCommand.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsPermissionsCommand$execute$1", f = "GetStepsPermissionsCommand.kt", l = {65}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ String $data;
        Object L$0;
        int label;
        final /* synthetic */ rvt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, rvt rvtVar, spj<? super a> spjVar) {
            super(1, spjVar);
            this.$data = str;
            this.this$0 = rvtVar;
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
            MobileServicesType mobileServicesType;
            fvv0 M;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    xgx0 xgx0Var = xgx0.a;
                    String str = "VkStepsGetStepsPermissionsCommand.execute() -> data: " + this.$data + ", thread: " + Thread.currentThread().getName();
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
                            bex0.a.a(r6yVar2, JsApiMethodType.GET_STEPS_PERMISSIONS, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                        }
                        return s3q0.a;
                    }
                    Context mo2getContext = this.this$0.e.mo2getContext();
                    if (mo2getContext == null) {
                        r6y r6yVar3 = this.this$0.b;
                        if (r6yVar3 != null) {
                            bex0.a.a(r6yVar3, JsApiMethodType.GET_STEPS_PERMISSIONS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                        }
                        return s3q0.a;
                    }
                    MobileServicesType h = this.this$0.f.h(mo2getContext);
                    ayu0 ayu0Var = this.this$0.f;
                    RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
                    this.L$0 = h;
                    this.label = 1;
                    obj = byu0.b(ayu0Var, mo2getContext, requestedMiniApp, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mobileServicesType = h;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mobileServicesType = (MobileServicesType) this.L$0;
                    kotlin.a.a(obj);
                }
                iyu0 iyu0Var = (iyu0) obj;
                if (!jyu0.b(iyu0Var) && !jyu0.d(iyu0Var)) {
                    z = false;
                }
                JSONObject put = com.vk.movika.sdk.android.defaultplayer.interactive.c.b("has_permissions", z).put("mobile_services_type", mobileServicesType.h());
                r6y r6yVar4 = this.this$0.b;
                if (r6yVar4 != null) {
                    bex0.a.b(r6yVar4, JsApiMethodType.GET_STEPS_PERMISSIONS, put, null, 12);
                }
                return s3q0.a;
            } catch (Throwable th) {
                String str2 = "VkStepsGetStepsPermissionsCommand.getVkHealthStatus() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
                xgx0.a.getClass();
                xgx0.b(str2);
                r6y r6yVar5 = this.this$0.b;
                if (r6yVar5 != null) {
                    bex0.a.a(r6yVar5, JsApiMethodType.GET_STEPS_PERMISSIONS, VkAppsErrors.Client.CUSTOM_ERROR, str2, null, null, 56);
                }
                return s3q0.a;
            }
        }
    }

    public rvt(FragmentImpl fragmentImpl, ayu0 ayu0Var) {
        this.e = fragmentImpl;
        this.f = ayu0Var;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        bbs.b(this.e, new a(str, this, null));
    }
}
