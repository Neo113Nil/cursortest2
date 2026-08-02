package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.health.js.bridge.api.events.GetWorkouts$Parameters;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkworkout.types.SyncWorkoutReason;
import java.util.List;
import xsna.f2w0;

/* compiled from: GetWorkoutsGoogleFitDelegate.kt */
/* loaded from: classes6.dex */
public final class mxt implements guq<GetWorkouts$Parameters> {
    public final com.vk.superapp.base.js.bridge.b b;
    public final bfm c;
    public final wvp d;
    public final f2w0 e;
    public final ayu0 f;
    public final d2w0 g;
    public boolean h;

    public mxt(com.vk.superapp.base.js.bridge.b bVar, bfm bfmVar, wvp wvpVar, f2w0 f2w0Var, ayu0 ayu0Var, x1w0 x1w0Var, d2w0 d2w0Var) {
        this.b = bVar;
        this.c = bfmVar;
        this.d = wvpVar;
        this.e = f2w0Var;
        this.f = ayu0Var;
        this.g = d2w0Var;
    }

    @Override // xsna.guq
    public final List<Long> a1() {
        return g2w0.j;
    }

    public final void c(Context context) {
        String b = defpackage.j0.b("VKWebAppGetWorkouts", this.b);
        ton0 ton0Var = new ton0(SyncWorkoutReason.BRIDGE_EVENT, this.h);
        SelectedDataSource selectedDataSource = SelectedDataSource.GOOGLE_FIT;
        f2w0.b.a(this.e, context, ton0Var, new r9e(this, b, context), new mwo(this, context, b, 1), selectedDataSource, 4);
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
        wvp wvpVar = this.d;
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
        this.h = c != null ? c.booleanValue() : false;
        m4s.y(fragmentActivity, new lxt(this, fragmentActivity, b, null));
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
