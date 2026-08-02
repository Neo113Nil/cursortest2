package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.C4217a2;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult;
import com.vkontakte.android.R;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.bex0;
import xsna.g0v;

/* compiled from: AskHealthConnectWorkoutPermissionsCommand.kt */
/* loaded from: classes6.dex */
public final class yt3 extends dvv0 {
    public final FragmentImpl e;
    public final ayu0 f;
    public final Set<String> g;
    public final hb0<Set<String>> h;
    public final hb0<Intent> i;

    /* compiled from: AskHealthConnectWorkoutPermissionsCommand.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionsResult.values().length];
            try {
                iArr[PermissionsResult.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionsResult.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HealthConnectSdkStatus.values().length];
            try {
                iArr2[HealthConnectSdkStatus.UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HealthConnectSdkStatus.NEED_MANDATORY_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[HealthConnectSdkStatus.UNAVAILABLE_TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[HealthConnectSdkStatus.NEED_INSTALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[HealthConnectSdkStatus.AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: AskHealthConnectWorkoutPermissionsCommand.kt */
    @b6l(c = "com.vk.superapp.vkworkout.infrastructure.commands.AskHealthConnectWorkoutPermissionsCommand$execute$1", f = "AskHealthConnectWorkoutPermissionsCommand.kt", l = {83}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(1, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return yt3.this.new b(spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((b) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FragmentActivity activity;
            FragmentActivity activity2;
            fvv0 M;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                r6y r6yVar = yt3.this.b;
                Long valueOf = (r6yVar == null || (M = r6yVar.M()) == null) ? null : Long.valueOf(M.getAppId());
                if (!BuildInfo.h() && !j5g.P(g2w0.j, valueOf)) {
                    r6y r6yVar2 = yt3.this.b;
                    if (r6yVar2 != null) {
                        bex0.a.a(r6yVar2, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                    }
                    return s3q0.a;
                }
                Context mo2getContext = yt3.this.e.mo2getContext();
                if (mo2getContext == null || (((activity = yt3.this.e.getActivity()) != null && activity.isDestroyed()) || ((activity2 = yt3.this.e.getActivity()) != null && activity2.isFinishing()))) {
                    r6y r6yVar3 = yt3.this.b;
                    if (r6yVar3 != null) {
                        bex0.a.a(r6yVar3, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                    }
                    return s3q0.a;
                }
                yt3 yt3Var = yt3.this;
                this.label = 1;
                if (yt3.d(yt3Var, mo2getContext, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public yt3(FragmentImpl fragmentImpl, ayu0 ayu0Var) {
        hb0<Set<String>> registerForActivityResult;
        hb0<Intent> registerForActivityResult2;
        lb0 activityResultRegistry;
        lb0 activityResultRegistry2;
        this.e = fragmentImpl;
        this.f = ayu0Var;
        t0v t0vVar = new t0v();
        this.g = ayu0Var.a(RequestedMiniApp.VK_WORKOUT);
        FragmentActivity activity = fragmentImpl.getActivity();
        if (activity == null || (activityResultRegistry2 = activity.getActivityResultRegistry()) == null) {
            registerForActivityResult = fragmentImpl.registerForActivityResult(t0vVar, new ut3(this, 0));
        } else {
            registerForActivityResult = activityResultRegistry2.c("AskHealthConnectWorkoutPermissionsCommand.resultRegistry: " + fragmentImpl.hashCode(), fragmentImpl, t0vVar, new ua0() { // from class: xsna.tt3
                @Override // xsna.ua0
                public final void onActivityResult(Object obj) {
                    yt3.this.f((Set) obj);
                }
            });
        }
        this.h = registerForActivityResult;
        FragmentActivity activity2 = fragmentImpl.getActivity();
        if (activity2 == null || (activityResultRegistry = activity2.getActivityResultRegistry()) == null) {
            registerForActivityResult2 = fragmentImpl.registerForActivityResult(new cb0(), new ua0() { // from class: xsna.wt3
                @Override // xsna.ua0
                public final void onActivityResult(Object obj) {
                    yt3 yt3Var = yt3.this;
                    Context mo2getContext = yt3Var.e.mo2getContext();
                    if (mo2getContext != null) {
                        yt3Var.f.j(mo2getContext, RequestedMiniApp.VK_WORKOUT, new s9(yt3Var, 4), new p1(yt3Var, 6));
                        return;
                    }
                    r6y r6yVar = yt3Var.b;
                    if (r6yVar != null) {
                        bex0.a.a(r6yVar, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                    }
                }
            });
        } else {
            registerForActivityResult2 = activityResultRegistry.c("AskHealthConnectWorkoutPermissionsCommand.openSettingsResultRegistry: " + fragmentImpl.hashCode(), fragmentImpl, new cb0(), new vt3(this, 0));
        }
        this.i = registerForActivityResult2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r5.h(r6, r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(yt3 yt3Var, Context context, ContinuationImpl continuationImpl) {
        zt3 zt3Var;
        int i;
        iyu0 iyu0Var;
        yt3Var.getClass();
        if (continuationImpl instanceof zt3) {
            zt3Var = (zt3) continuationImpl;
            int i2 = zt3Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zt3Var.label = i2 - Integer.MIN_VALUE;
                Object obj = zt3Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zt3Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zt3Var.L$0 = context;
                    zt3Var.label = 1;
                    obj = yt3Var.e(zt3Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    context = (Context) zt3Var.L$0;
                    kotlin.a.a(obj);
                }
                iyu0Var = (iyu0) obj;
                if (iyu0Var != null) {
                    return s3q0.a;
                }
                if (iyu0Var.a) {
                    yt3Var.g(iyu0Var);
                    return s3q0.a;
                }
                zt3Var.L$0 = null;
                zt3Var.label = 2;
            }
        }
        zt3Var = new zt3(yt3Var, continuationImpl);
        Object obj3 = zt3Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zt3Var.label;
        if (i != 0) {
        }
        iyu0Var = (iyu0) obj3;
        if (iyu0Var != null) {
        }
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        m4s.z(this.e, new b(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        au3 au3Var;
        int i;
        try {
            if (continuationImpl instanceof au3) {
                au3Var = (au3) continuationImpl;
                int i2 = au3Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    au3Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = au3Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = au3Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ayu0 ayu0Var = this.f;
                        Context requireContext = this.e.requireContext();
                        RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
                        au3Var.label = 1;
                        obj = byu0.b(ayu0Var, requireContext, requestedMiniApp, au3Var);
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
            String str = "AskHealthConnectWorkoutPermissionsCommand.getVkHealthStatus() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
            xgx0.a.getClass();
            xgx0.b(str);
            r6y r6yVar = this.b;
            if (r6yVar == null) {
                return null;
            }
            bex0.a.a(r6yVar, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, VkAppsErrors.Client.CUSTOM_ERROR, str, null, null, 56);
            return null;
        }
        au3Var = new au3(this, continuationImpl);
        Object obj2 = au3Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = au3Var.label;
    }

    public final void f(Set<String> set) {
        Set<String> set2 = this.g;
        if (set.containsAll(j5g.O0(set2))) {
            j();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentImpl fragmentImpl = this.e;
        Context requireContext = fragmentImpl.requireContext();
        String[] strArr = (String[]) set2.toArray(new String[0]);
        permissionHelper.getClass();
        if (!PermissionHelper.t(requireContext, strArr)) {
            i();
            return;
        }
        Context requireContext2 = fragmentImpl.requireContext();
        d.a aVar = new d.a(fragmentImpl.requireContext());
        aVar.a.m = false;
        aVar.c(R.string.vk_permissions_go_to_settings_empty);
        aVar.j(requireContext2.getString(R.string.vk_permissions_go_to_settings_positive), new com.vk.stickers.bonus.catalog.a(this, 1));
        aVar.f(requireContext2.getString(R.string.vk_permissions_go_to_settings_negative), new DialogInterface.OnClickListener() { // from class: xsna.xt3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                yt3.this.i();
            }
        });
        aVar.m();
    }

    public final void g(iyu0 iyu0Var) {
        HealthConnectSdkStatus healthConnectSdkStatus = iyu0Var.g;
        int i = a.$EnumSwitchMapping$1[healthConnectSdkStatus.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            String h = healthConnectSdkStatus.h();
            r6y r6yVar = this.b;
            if (r6yVar != null) {
                r6yVar.A(JsApiMethodType.ASK_WORKOUT_PERMISSIONS, new JSONObject().put("health_connect_info", h));
                return;
            }
            return;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        g0v g0vVar = iyu0Var.f;
        if (epx.f(g0vVar, g0v.b.a)) {
            j();
        } else {
            if (!(g0vVar instanceof g0v.a) && !(g0vVar instanceof g0v.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.h.a(this.g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Context context, iyu0 iyu0Var, ContinuationImpl continuationImpl) {
        bu3 bu3Var;
        int i;
        int i2;
        if (continuationImpl instanceof bu3) {
            bu3Var = (bu3) continuationImpl;
            int i3 = bu3Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bu3Var.label = i3 - Integer.MIN_VALUE;
                Object obj = bu3Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bu3Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    bu3Var.L$0 = iyu0Var;
                    bu3Var.label = 1;
                    obj = byu0.c(this.f, context, bu3Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iyu0Var = (iyu0) bu3Var.L$0;
                    kotlin.a.a(obj);
                }
                i2 = a.$EnumSwitchMapping$0[((PermissionsResult) obj).ordinal()];
                if (i2 != 1) {
                    g(iyu0.a(iyu0Var));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i();
                }
                return s3q0.a;
            }
        }
        bu3Var = new bu3(this, continuationImpl);
        Object obj2 = bu3Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bu3Var.label;
        if (i != 0) {
        }
        i2 = a.$EnumSwitchMapping$0[((PermissionsResult) obj2).ordinal()];
        if (i2 != 1) {
        }
        return s3q0.a;
    }

    public final void i() {
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.b(r6yVar, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, new JSONObject().put("permission_state", C4217a2.e), null, 12);
        }
    }

    public final void j() {
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.b(r6yVar, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, new JSONObject().put("permission_state", "granted"), null, 12);
        }
    }
}
