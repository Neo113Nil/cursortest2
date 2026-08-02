package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentActivity;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.health.js.bridge.api.events.GetWorkouts$Parameters;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult;
import com.vk.superapp.vkworkout.types.SyncWorkoutReason;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.f2w0;
import xsna.g0v;
import xsna.p0v;

/* compiled from: GetWorkoutsHealthConnectDelegate.kt */
/* loaded from: classes6.dex */
public final class xxt implements guq<GetWorkouts$Parameters> {
    public final com.vk.superapp.base.js.bridge.b b;
    public final bfm c;
    public xwv0 d;
    public final wvp e;
    public final f2w0 f;
    public final ayu0 g;
    public final x1w0 h;
    public final d2w0 i;
    public boolean j;
    public final t0v k = new t0v();
    public final Set<String> l;
    public final oxt m;

    /* JADX WARN: Type inference failed for: r1v8, types: [xsna.oxt] */
    public xxt(com.vk.superapp.base.js.bridge.b bVar, bfm bfmVar, xwv0 xwv0Var, wvp wvpVar, f2w0 f2w0Var, ayu0 ayu0Var, x1w0 x1w0Var, d2w0 d2w0Var) {
        this.b = bVar;
        this.c = bfmVar;
        this.d = xwv0Var;
        this.e = wvpVar;
        this.f = f2w0Var;
        this.g = ayu0Var;
        this.h = x1w0Var;
        this.i = d2w0Var;
        Object obj = p0v.a;
        this.l = rl3.y0(new String[]{p0v.a.a(fpf0.a(bhn.class)), p0v.a.a(fpf0.a(x0l0.class)), p0v.a.a(fpf0.a(n4q.class)), p0v.a.a(fpf0.a(zcp0.class))});
        this.m = new tb0() { // from class: xsna.oxt
            @Override // xsna.tb0
            public final void onActivityResult(int i, int i2, Intent intent) {
                xxt xxtVar = xxt.this;
                bfm bfmVar2 = xxtVar.c;
                if (i == 101) {
                    Set<String> set = xxtVar.l;
                    Set<? extends String> c = xxtVar.k.c(i2, intent);
                    FragmentActivity fragmentActivity = (FragmentActivity) bfmVar2.invoke();
                    if (fragmentActivity != null) {
                        Set<String> set2 = set;
                        if (c.containsAll(set2)) {
                            FragmentActivity fragmentActivity2 = (FragmentActivity) bfmVar2.invoke();
                            if (fragmentActivity2 != null) {
                                xxtVar.d(fragmentActivity2);
                            }
                        } else {
                            PermissionHelper permissionHelper = PermissionHelper.a;
                            String[] strArr = (String[]) set2.toArray(new String[0]);
                            permissionHelper.getClass();
                            if (PermissionHelper.t(fragmentActivity, strArr)) {
                                d.a aVar = new d.a(fragmentActivity);
                                aVar.a.m = false;
                                aVar.c(R.string.vk_permissions_go_to_settings_empty);
                                int i3 = 1;
                                aVar.j(fragmentActivity.getString(R.string.vk_permissions_go_to_settings_positive), new d5i(i3, xxtVar, fragmentActivity));
                                aVar.f(fragmentActivity.getString(R.string.vk_permissions_go_to_settings_negative), new w4p(xxtVar, i3));
                                aVar.m();
                            } else {
                                xxtVar.h();
                            }
                        }
                    }
                } else if (i == 102) {
                    String b = defpackage.j0.b("VKWebAppGetSteps", xxtVar.b);
                    FragmentActivity fragmentActivity3 = (FragmentActivity) bfmVar2.invoke();
                    if (fragmentActivity3 == null) {
                        xxtVar.e.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null));
                    } else {
                        xxtVar.g.j(fragmentActivity3, RequestedMiniApp.VK_STEPS, null, new s6k(xxtVar, 21));
                    }
                }
                xwv0 xwv0Var2 = xxtVar.d;
                if (xwv0Var2 != null) {
                    xwv0Var2.e3(xxtVar.m);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(xxt xxtVar, Context context, iyu0 iyu0Var, ContinuationImpl continuationImpl) {
        vxt vxtVar;
        int i;
        PermissionsResult.a aVar;
        xxtVar.getClass();
        if (continuationImpl instanceof vxt) {
            vxtVar = (vxt) continuationImpl;
            int i2 = vxtVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vxtVar.label = i2 - Integer.MIN_VALUE;
                Object obj = vxtVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vxtVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (iyu0Var.a) {
                        if (epx.f(iyu0Var.f, g0v.b.a)) {
                            xxtVar.d(context);
                        } else {
                            FragmentActivity fragmentActivity = (FragmentActivity) xxtVar.c.invoke();
                            if (fragmentActivity != null) {
                                m4s.y(fragmentActivity, new pxt(xxtVar, fragmentActivity, null));
                            }
                        }
                        return s3q0.a;
                    }
                    aVar = PermissionsResult.Companion;
                    ayu0 ayu0Var = xxtVar.g;
                    vxtVar.L$0 = aVar;
                    vxtVar.label = 1;
                    obj = byu0.c(ayu0Var, context, vxtVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (PermissionsResult.a) vxtVar.L$0;
                    kotlin.a.a(obj);
                }
                PermissionsResult.a aVar2 = aVar;
                PermissionsResult permissionsResult = (PermissionsResult) obj;
                int i3 = 0;
                int i4 = 0;
                wxt wxtVar = new wxt(i4, xxtVar, xxt.class, "checkHealthConnectPermissions", "checkHealthConnectPermissions()V", i3, 0);
                rx4 rx4Var = new rx4(i4, xxtVar, xxt.class, "sendWorkoutsPermissionsDeniedEvent", "sendWorkoutsPermissionsDeniedEvent()V", i3, 2);
                aVar2.getClass();
                PermissionsResult.a.a(permissionsResult, wxtVar, rx4Var);
                return s3q0.a;
            }
        }
        vxtVar = new vxt(xxtVar, continuationImpl);
        Object obj2 = vxtVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vxtVar.label;
        if (i != 0) {
        }
        PermissionsResult.a aVar22 = aVar;
        PermissionsResult permissionsResult2 = (PermissionsResult) obj2;
        int i32 = 0;
        int i42 = 0;
        wxt wxtVar2 = new wxt(i42, xxtVar, xxt.class, "checkHealthConnectPermissions", "checkHealthConnectPermissions()V", i32, 0);
        rx4 rx4Var2 = new rx4(i42, xxtVar, xxt.class, "sendWorkoutsPermissionsDeniedEvent", "sendWorkoutsPermissionsDeniedEvent()V", i32, 2);
        aVar22.getClass();
        PermissionsResult.a.a(permissionsResult2, wxtVar2, rx4Var2);
        return s3q0.a;
    }

    @Override // xsna.guq
    public final List<Long> a1() {
        return g2w0.j;
    }

    public final void d(Context context) {
        String b = defpackage.j0.b("VKWebAppGetWorkouts", this.b);
        ton0 ton0Var = new ton0(SyncWorkoutReason.BRIDGE_EVENT, this.j);
        SelectedDataSource selectedDataSource = SelectedDataSource.HEALTH_CONNECT;
        f2w0.b.a(this.f, context, ton0Var, new vh9(this, context, b, 8), new nxt(0, this, b), selectedDataSource, 4);
    }

    public final void h() {
        this.e.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), defpackage.j0.b("VKWebAppGetSteps", this.b), 1, null));
    }

    @Override // xsna.guq
    public final void k1(GetWorkouts$Parameters getWorkouts$Parameters) {
        GetWorkouts$Parameters getWorkouts$Parameters2 = getWorkouts$Parameters;
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("GetWorkoutsHealthConnectDelegate.execute() -> params: ");
        sb.append(getWorkouts$Parameters2);
        sb.append(", thread: ");
        mft0.a(sb, xgx0Var);
        String b = defpackage.j0.b("VKWebAppGetWorkouts", this.b);
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        boolean k = wdx0Var.k();
        wvp wvpVar = this.e;
        if (!k) {
            wvpVar.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.invoke();
        if (fragmentActivity == null || fragmentActivity.isDestroyed() || fragmentActivity.isFinishing()) {
            wvpVar.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null));
            return;
        }
        Boolean c = getWorkouts$Parameters2.c();
        this.j = c != null ? c.booleanValue() : false;
        m4s.y(fragmentActivity, new qxt(this, fragmentActivity, b, null));
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
