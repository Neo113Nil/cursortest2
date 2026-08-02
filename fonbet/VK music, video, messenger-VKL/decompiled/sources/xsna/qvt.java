package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$SyncReason;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bex0;
import xsna.g0v;
import xsna.omv0;

/* compiled from: GetStepsHealthConnectPermissionsCommand.kt */
/* loaded from: classes6.dex */
public final class qvt extends dvv0 {
    public final FragmentImpl e;
    public final ayu0 f;
    public final bpn0 g = new bpn0(new qo0(18));

    /* compiled from: GetStepsHealthConnectPermissionsCommand.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsHealthConnectPermissionsCommand$execute$1", f = "GetStepsHealthConnectPermissionsCommand.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ String $data;
        long J$0;
        Object L$0;
        int label;
        final /* synthetic */ qvt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, qvt qvtVar, spj<? super a> spjVar) {
            super(1, spjVar);
            this.$data = str;
            this.this$0 = qvtVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new a(this.$data, this.this$0, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            long j;
            Context context;
            long currentTimeMillis;
            FragmentActivity activity;
            FragmentActivity activity2;
            fvv0 M;
            long j2;
            Context context2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    kotlin.a.a(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    xgx0 xgx0Var = xgx0.a;
                    String str = "VkStepsGetStepsHealthConnectPermissionsCommand.execute() -> data: " + this.$data + ", thread: " + Thread.currentThread().getName();
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
                    if (mo2getContext == null || (((activity = this.this$0.e.getActivity()) != null && activity.isDestroyed()) || ((activity2 = this.this$0.e.getActivity()) != null && activity2.isFinishing()))) {
                        r6y r6yVar3 = this.this$0.b;
                        if (r6yVar3 != null) {
                            bex0.a.a(r6yVar3, JsApiMethodType.GET_STEPS_PERMISSIONS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                        }
                        return s3q0.a;
                    }
                    ayu0 ayu0Var = this.this$0.f;
                    RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
                    this.L$0 = mo2getContext;
                    this.J$0 = currentTimeMillis;
                    this.label = 1;
                    obj = byu0.b(ayu0Var, mo2getContext, requestedMiniApp, this);
                    r1 = mo2getContext;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (r1 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    currentTimeMillis = this.J$0;
                    Context context3 = (Context) this.L$0;
                    kotlin.a.a(obj);
                    r1 = context3;
                }
                j2 = currentTimeMillis;
                context2 = r1;
            } catch (Throwable th2) {
                th = th2;
                j = currentTimeMillis;
                context = r1;
            }
            try {
                iyu0 iyu0Var = (iyu0) obj;
                boolean z = iyu0Var.a && epx.f(iyu0Var.f, g0v.b.a);
                r6y r6yVar4 = this.this$0.b;
                if (r6yVar4 != null) {
                    bex0.a.b(r6yVar4, JsApiMethodType.GET_STEPS_PERMISSIONS, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("has_permissions", z).put("mobile_services_type", iyu0Var.h.h()), null, 12);
                }
                qvt.d(this.this$0, context2, j2, iyu0Var, null, 8);
                return s3q0.a;
            } catch (Throwable th3) {
                th = th3;
                context = context2;
                j = j2;
                String str2 = "VkStepsGetStepsHealthConnectPermissionsCommand.getVkHealthStatus() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
                xgx0.a.getClass();
                xgx0.b(str2);
                r6y r6yVar5 = this.this$0.b;
                if (r6yVar5 != null) {
                    bex0.a.a(r6yVar5, JsApiMethodType.GET_STEPS_PERMISSIONS, VkAppsErrors.Client.CUSTOM_ERROR, str2, null, null, 56);
                }
                qvt.d(this.this$0, context, j, null, str2, 4);
                return s3q0.a;
            }
        }
    }

    public qvt(FragmentImpl fragmentImpl, ayu0 ayu0Var) {
        this.e = fragmentImpl;
        this.f = ayu0Var;
    }

    public static void d(qvt qvtVar, Context context, long j, iyu0 iyu0Var, String str, int i) {
        iyu0 iyu0Var2 = (i & 4) != 0 ? null : iyu0Var;
        String str2 = (i & 8) != 0 ? null : str;
        omv0 omv0Var = (omv0) qvtVar.g.getValue();
        omv0.a aVar = new omv0.a(j, VkStepsResultPermissionItem$SyncReason.CHECK_STEPS_PERMISSIONS_COMMAND, false, iyu0Var2, str2);
        omv0Var.getClass();
        omv0.a(context, aVar);
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        bbs.b(this.e, new a(str, this, null));
    }
}
