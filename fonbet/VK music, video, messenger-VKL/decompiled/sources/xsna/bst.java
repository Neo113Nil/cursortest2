package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult;
import com.vk.superapp.vkworkout.types.SyncWorkoutReason;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.bex0;
import xsna.f2w0;
import xsna.g0v;

/* compiled from: GetHealthConnectWorkoutsCommand.kt */
/* loaded from: classes6.dex */
public final class bst extends dvv0 {
    public final FragmentImpl e;
    public final ayu0 f;
    public final f2w0 g;
    public final bpn0 h;
    public final bpn0 i;
    public boolean j;
    public final Set<String> k;
    public final hb0<Set<String>> l;

    /* compiled from: GetHealthConnectWorkoutsCommand.kt */
    @b6l(c = "com.vk.superapp.vkworkout.infrastructure.commands.GetHealthConnectWorkoutsCommand$execute$1", f = "GetHealthConnectWorkoutsCommand.kt", l = {MBSupportMuteAdType.REWARD_VIDEO, 102, 103}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ String $data;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, spj<? super a> spjVar) {
            super(1, spjVar);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return bst.this.new a(this.$data, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0114, code lost:
        
            if (xsna.bst.e(r10, r3, r1, r9) != r0) goto L73;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FragmentActivity activity;
            FragmentActivity activity2;
            Context context;
            fvv0 M;
            Context context2;
            iyu0 iyu0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                r6y r6yVar = bst.this.b;
                Long valueOf = (r6yVar == null || (M = r6yVar.M()) == null) ? null : Long.valueOf(M.getAppId());
                if (BuildInfo.h() || j5g.P(g2w0.j, valueOf)) {
                    wdx0 wdx0Var = e370.f;
                    if (wdx0Var == null) {
                        wdx0Var = null;
                    }
                    if (wdx0Var.k()) {
                        Context mo2getContext = bst.this.e.mo2getContext();
                        if (mo2getContext == null || (((activity = bst.this.e.getActivity()) != null && activity.isDestroyed()) || ((activity2 = bst.this.e.getActivity()) != null && activity2.isFinishing()))) {
                            r6y r6yVar2 = bst.this.b;
                            if (r6yVar2 != null) {
                                bex0.a.a(r6yVar2, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                            }
                            return s3q0.a;
                        }
                        String str = this.$data;
                        if (str != null && str.length() != 0) {
                            bst.this.j = new JSONObject(this.$data).optBoolean("need_resync");
                        }
                        bst bstVar = bst.this;
                        this.L$0 = mo2getContext;
                        this.label = 1;
                        Object d = bst.d(bstVar, mo2getContext, this);
                        if (d != coroutineSingletons) {
                            context = mo2getContext;
                            obj = d;
                        }
                        return coroutineSingletons;
                    }
                }
                r6y r6yVar3 = bst.this.b;
                if (r6yVar3 != null) {
                    bex0.a.a(r6yVar3, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                }
                return s3q0.a;
            }
            if (i == 1) {
                context = (Context) this.L$0;
                kotlin.a.a(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                iyu0Var = (iyu0) this.L$1;
                context2 = (Context) this.L$0;
                kotlin.a.a(obj);
                bst bstVar2 = bst.this;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            iyu0 iyu0Var2 = (iyu0) obj;
            if (iyu0Var2 == null) {
                return s3q0.a;
            }
            if (iyu0Var2.h != MobileServicesType.GOOGLE_PLAY || !iyu0Var2.b || iyu0Var2.g != HealthConnectSdkStatus.AVAILABLE) {
                r6y r6yVar4 = bst.this.b;
                if (r6yVar4 != null) {
                    bex0.a.a(r6yVar4, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                }
                return s3q0.a;
            }
            d2w0 d2w0Var = (d2w0) bst.this.i.getValue();
            SelectedDataSource selectedDataSource = SelectedDataSource.HEALTH_CONNECT;
            this.L$0 = context;
            this.L$1 = iyu0Var2;
            this.label = 2;
            if (d2w0Var.a(selectedDataSource, this) != coroutineSingletons) {
                context2 = context;
                iyu0Var = iyu0Var2;
                bst bstVar22 = bst.this;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            return coroutineSingletons;
        }
    }

    public bst(FragmentImpl fragmentImpl, ayu0 ayu0Var, f2w0 f2w0Var) {
        hb0<Set<String>> registerForActivityResult;
        lb0 activityResultRegistry;
        this.e = fragmentImpl;
        this.f = ayu0Var;
        this.g = f2w0Var;
        t0v t0vVar = new t0v();
        this.h = new bpn0(new x5(20));
        this.i = new bpn0(new re0(16));
        this.k = ayu0Var.a(RequestedMiniApp.VK_WORKOUT);
        FragmentActivity activity = fragmentImpl.getActivity();
        if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
            registerForActivityResult = fragmentImpl.registerForActivityResult(t0vVar, new vt3(this, 1));
        } else {
            registerForActivityResult = activityResultRegistry.c("GetHealthConnectWorkoutsCommand.permissionsResultRegistry: " + fragmentImpl.hashCode(), fragmentImpl, t0vVar, new ut3(this, 1));
        }
        this.l = registerForActivityResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(bst bstVar, Context context, ContinuationImpl continuationImpl) {
        cst cstVar;
        int i;
        bstVar.getClass();
        try {
            if (continuationImpl instanceof cst) {
                cstVar = (cst) continuationImpl;
                int i2 = cstVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cstVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = cstVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cstVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ayu0 ayu0Var = bstVar.f;
                        RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
                        cstVar.label = 1;
                        obj = byu0.b(ayu0Var, context, requestedMiniApp, cstVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return (iyu0) obj;
                }
            }
            if (i != 0) {
            }
            return (iyu0) obj;
        } catch (Throwable th) {
            String str = "GetHealthConnectWorkoutsCommand.getVkHealthStatus() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
            xgx0.a.getClass();
            xgx0.b(str);
            r6y r6yVar = bstVar.b;
            if (r6yVar == null) {
                return null;
            }
            bex0.a.a(r6yVar, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.CUSTOM_ERROR, str, null, null, 56);
            return null;
        }
        cstVar = new cst(bstVar, continuationImpl);
        Object obj2 = cstVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cstVar.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(bst bstVar, Context context, iyu0 iyu0Var, ContinuationImpl continuationImpl) {
        dst dstVar;
        int i;
        PermissionsResult.a aVar;
        bstVar.getClass();
        if (continuationImpl instanceof dst) {
            dstVar = (dst) continuationImpl;
            int i2 = dstVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dstVar.label = i2 - Integer.MIN_VALUE;
                Object obj = dstVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dstVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (iyu0Var.a) {
                        if (epx.f(iyu0Var.f, g0v.b.a)) {
                            bstVar.g(context);
                        } else {
                            m4s.z(bstVar.e, new ast(bstVar, null));
                        }
                        return s3q0.a;
                    }
                    aVar = PermissionsResult.Companion;
                    ayu0 ayu0Var = bstVar.f;
                    dstVar.L$0 = aVar;
                    dstVar.label = 1;
                    obj = byu0.c(ayu0Var, context, dstVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (PermissionsResult.a) dstVar.L$0;
                    kotlin.a.a(obj);
                }
                PermissionsResult.a aVar2 = aVar;
                PermissionsResult permissionsResult = (PermissionsResult) obj;
                int i3 = 0;
                int i4 = 0;
                est estVar = new est(i4, bstVar, bst.class, "checkHealthConnectPermissions", "checkHealthConnectPermissions()V", i3, 0);
                ax0 ax0Var = new ax0(i4, bstVar, bst.class, "sendPermissionsDeniedEvent", "sendPermissionsDeniedEvent()V", i3, 2);
                aVar2.getClass();
                PermissionsResult.a.a(permissionsResult, estVar, ax0Var);
                return s3q0.a;
            }
        }
        dstVar = new dst(bstVar, continuationImpl);
        Object obj2 = dstVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dstVar.label;
        if (i != 0) {
        }
        PermissionsResult.a aVar22 = aVar;
        PermissionsResult permissionsResult2 = (PermissionsResult) obj2;
        int i32 = 0;
        int i42 = 0;
        est estVar2 = new est(i42, bstVar, bst.class, "checkHealthConnectPermissions", "checkHealthConnectPermissions()V", i32, 0);
        ax0 ax0Var2 = new ax0(i42, bstVar, bst.class, "sendPermissionsDeniedEvent", "sendPermissionsDeniedEvent()V", i32, 2);
        aVar22.getClass();
        PermissionsResult.a.a(permissionsResult2, estVar2, ax0Var2);
        return s3q0.a;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        m4s.z(this.e, new a(str, null));
    }

    public final void f(Set<String> set) {
        if (set.containsAll(this.k)) {
            Context mo2getContext = this.e.mo2getContext();
            if (mo2getContext == null) {
                return;
            }
            g(mo2getContext);
            return;
        }
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
        }
    }

    public final void g(Context context) {
        ton0 ton0Var = new ton0(SyncWorkoutReason.BRIDGE_EVENT, this.j);
        SelectedDataSource selectedDataSource = SelectedDataSource.HEALTH_CONNECT;
        f2w0.b.a(this.g, context, ton0Var, new h1(15, this, context), new zrt(this, 0), selectedDataSource, 4);
    }
}
