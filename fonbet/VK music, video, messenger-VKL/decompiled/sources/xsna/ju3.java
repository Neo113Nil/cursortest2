package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.health.js.bridge.api.events.AskWorkoutsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.AskWorkoutsPermissions$Response;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.czu;
import xsna.g0v;
import xsna.p0v;

/* compiled from: AskWorkoutPermissionHealthConnectDelegate.kt */
/* loaded from: classes6.dex */
public final class ju3 implements guq<AskWorkoutsPermissions$Parameters> {
    public final com.vk.superapp.base.js.bridge.b b;
    public final bfm c;
    public xwv0 d;
    public final wvp e;
    public final ayu0 f;
    public final Set<String> g;
    public final t0v h;
    public final gu3 i;

    /* compiled from: AskWorkoutPermissionHealthConnectDelegate.kt */
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

    /* JADX WARN: Type inference failed for: r1v8, types: [xsna.gu3] */
    public ju3(com.vk.superapp.base.js.bridge.b bVar, bfm bfmVar, xwv0 xwv0Var, wvp wvpVar, ayu0 ayu0Var) {
        this.b = bVar;
        this.c = bfmVar;
        this.d = xwv0Var;
        this.e = wvpVar;
        this.f = ayu0Var;
        Object obj = p0v.a;
        this.g = rl3.y0(new String[]{p0v.a.a(fpf0.a(bhn.class)), p0v.a.a(fpf0.a(x0l0.class)), p0v.a.a(fpf0.a(n4q.class)), p0v.a.a(fpf0.a(zcp0.class))});
        this.h = new t0v();
        this.i = new tb0() { // from class: xsna.gu3
            @Override // xsna.tb0
            public final void onActivityResult(int i, int i2, Intent intent) {
                ju3 ju3Var = ju3.this;
                ayu0 ayu0Var2 = ju3Var.f;
                FragmentActivity fragmentActivity = (FragmentActivity) ju3Var.c.invoke();
                if (fragmentActivity == null) {
                    xgx0.a.getClass();
                    xgx0.a("AskWorkoutPermissionHealthConnectDelegate.onActivityResultCallback: fragmentActivityProvider() == null");
                    return;
                }
                if (i != 101) {
                    if (i == 102) {
                        ayu0Var2.j(fragmentActivity, RequestedMiniApp.VK_WORKOUT, null, new pd(ju3Var, 6));
                    }
                } else if (anj.a(fragmentActivity, "android.permission.ACTIVITY_RECOGNITION") == 0) {
                    ayu0Var2.j(fragmentActivity, RequestedMiniApp.VK_WORKOUT, null, new tl0(ju3Var, 6));
                } else {
                    ju3Var.h(false);
                }
                xwv0 xwv0Var2 = ju3Var.d;
                if (xwv0Var2 != null) {
                    xwv0Var2.e3(ju3Var.i);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ju3 ju3Var, Context context, iyu0 iyu0Var, ContinuationImpl continuationImpl) {
        lu3 lu3Var;
        int i;
        int i2;
        ju3Var.getClass();
        if (continuationImpl instanceof lu3) {
            lu3Var = (lu3) continuationImpl;
            int i3 = lu3Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lu3Var.label = i3 - Integer.MIN_VALUE;
                Object obj = lu3Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lu3Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ayu0 ayu0Var = ju3Var.f;
                    lu3Var.L$0 = iyu0Var;
                    lu3Var.label = 1;
                    obj = byu0.c(ayu0Var, context, lu3Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iyu0Var = (iyu0) lu3Var.L$0;
                    kotlin.a.a(obj);
                }
                i2 = a.$EnumSwitchMapping$0[((PermissionsResult) obj).ordinal()];
                if (i2 != 1) {
                    ju3Var.d(iyu0.a(iyu0Var));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ju3Var.h(false);
                }
                return s3q0.a;
            }
        }
        lu3Var = new lu3(ju3Var, continuationImpl);
        Object obj2 = lu3Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lu3Var.label;
        if (i != 0) {
        }
        i2 = a.$EnumSwitchMapping$0[((PermissionsResult) obj2).ordinal()];
        if (i2 != 1) {
        }
        return s3q0.a;
    }

    @Override // xsna.guq
    public final List<Long> a1() {
        return g2w0.j;
    }

    public final void d(iyu0 iyu0Var) {
        Intent a2;
        HealthConnectSdkStatus healthConnectSdkStatus = iyu0Var.g;
        int[] iArr = a.$EnumSwitchMapping$1;
        int i = iArr[healthConnectSdkStatus.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            com.vk.superapp.base.js.bridge.b bVar = this.b;
            String b = defpackage.j0.b("VKWebAppAskWorkoutsPermissions", bVar);
            int i2 = iArr[healthConnectSdkStatus.ordinal()];
            com.vk.superapp.base.js.bridge.b.p(bVar, new JsMethod("VKWebAppAskWorkoutsPermissions"), new AskWorkoutsPermissions$Response(null, new AskWorkoutsPermissions$Response.Data(AskWorkoutsPermissions$Response.Data.PermissionState.DISABLED, i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : AskWorkoutsPermissions$Response.Data.HealthConnectInfo.NEED_INSTALL : AskWorkoutsPermissions$Response.Data.HealthConnectInfo.UNAVAILABLE : AskWorkoutsPermissions$Response.Data.HealthConnectInfo.NEED_MANDATORY_UPDATE : AskWorkoutsPermissions$Response.Data.HealthConnectInfo.UNAVAILABLE, b), b, 1, null), null, null, false, null, 60);
            return;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.invoke();
        if (fragmentActivity == null) {
            j();
            return;
        }
        g0v g0vVar = iyu0Var.f;
        if (epx.f(g0vVar, g0v.b.a)) {
            h(true);
            return;
        }
        if (!(g0vVar instanceof g0v.c) && !(g0vVar instanceof g0v.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            czu.a.getClass();
            a2 = new Intent(czu.b.b);
        } else {
            a2 = this.h.a(fragmentActivity, this.g);
        }
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null) {
            xwv0Var.D1(this.i);
        }
        fragmentActivity.startActivityForResult(a2, 101);
    }

    public final void h(boolean z) {
        com.vk.superapp.base.js.bridge.b bVar = this.b;
        String b = defpackage.j0.b("VKWebAppAskWorkoutsPermissions", bVar);
        com.vk.superapp.base.js.bridge.b.p(bVar, new JsMethod("VKWebAppAskWorkoutsPermissions"), new AskWorkoutsPermissions$Response(null, new AskWorkoutsPermissions$Response.Data(z ? AskWorkoutsPermissions$Response.Data.PermissionState.GRANTED : AskWorkoutsPermissions$Response.Data.PermissionState.DISABLED, null, b, 2, null), b, 1, null), null, null, false, null, 60);
    }

    public final void j() {
        this.e.a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), defpackage.j0.b("VKWebAppAskWorkoutsPermissions", this.b), 1, null));
    }

    @Override // xsna.guq
    public final void k1(AskWorkoutsPermissions$Parameters askWorkoutsPermissions$Parameters) {
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("AskWorkoutPermissionHealthConnectDelegate.execute() -> params: ");
        sb.append(askWorkoutsPermissions$Parameters);
        sb.append(", thread: ");
        mft0.a(sb, xgx0Var);
        String b = defpackage.j0.b("VKWebAppAskWorkoutsPermissions", this.b);
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.invoke();
        if (fragmentActivity != null && !fragmentActivity.isDestroyed() && !fragmentActivity.isFinishing()) {
            m4s.y(fragmentActivity, new ku3(this, fragmentActivity, null));
        } else {
            this.e.a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null));
        }
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.d = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.d = null;
    }
}
