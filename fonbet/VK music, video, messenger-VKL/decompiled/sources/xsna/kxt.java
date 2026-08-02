package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.health.js.bridge.api.events.GetWorkoutsPermissions$Parameters;
import java.util.List;

/* compiled from: GetWorkoutPermissionsHealthConnectDelegate.kt */
/* loaded from: classes6.dex */
public final class kxt implements guq<GetWorkoutsPermissions$Parameters> {
    public final com.vk.superapp.base.js.bridge.b b;
    public final bfm c;
    public final wvp d;
    public final ayu0 e;

    public kxt(com.vk.superapp.base.js.bridge.b bVar, bfm bfmVar, wvp wvpVar, ayu0 ayu0Var) {
        this.b = bVar;
        this.c = bfmVar;
        this.d = wvpVar;
        this.e = ayu0Var;
    }

    @Override // xsna.guq
    public final List<Long> a1() {
        return g2w0.j;
    }

    @Override // xsna.guq
    public final void k1(GetWorkoutsPermissions$Parameters getWorkoutsPermissions$Parameters) {
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("GetWorkoutPermissionsHealthConnectDelegate.execute() -> params: ");
        sb.append(getWorkoutsPermissions$Parameters);
        sb.append(", thread: ");
        mft0.a(sb, xgx0Var);
        String b = defpackage.j0.b("VKWebAppGetWorkoutsPermissions", this.b);
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.invoke();
        if (fragmentActivity != null && !fragmentActivity.isDestroyed() && !fragmentActivity.isFinishing()) {
            m4s.y(fragmentActivity, new jxt(this, fragmentActivity, b, null));
        } else {
            this.d.f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null));
        }
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
