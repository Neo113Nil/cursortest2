package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.health.js.bridge.api.events.AskWorkoutsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.AskWorkoutsPermissions$Response;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import java.util.List;

/* compiled from: AskWorkoutPermissionGoogleFitDelegate.kt */
/* loaded from: classes6.dex */
public final class fu3 implements guq<AskWorkoutsPermissions$Parameters> {
    public final com.vk.superapp.base.js.bridge.b b;
    public final bfm c;
    public final wvp d;
    public final ayu0 e;

    public fu3(com.vk.superapp.base.js.bridge.b bVar, bfm bfmVar, wvp wvpVar, ayu0 ayu0Var) {
        this.b = bVar;
        this.c = bfmVar;
        this.d = wvpVar;
        this.e = ayu0Var;
    }

    @Override // xsna.guq
    public final List<Long> a1() {
        return g2w0.j;
    }

    public final void c(boolean z) {
        com.vk.superapp.base.js.bridge.b bVar = this.b;
        String b = defpackage.j0.b("VKWebAppAskWorkoutsPermissions", bVar);
        com.vk.superapp.base.js.bridge.b.p(bVar, new JsMethod("VKWebAppAskWorkoutsPermissions"), new AskWorkoutsPermissions$Response(null, new AskWorkoutsPermissions$Response.Data(z ? AskWorkoutsPermissions$Response.Data.PermissionState.GRANTED : AskWorkoutsPermissions$Response.Data.PermissionState.DISABLED, null, b, 2, null), b, 1, null), null, null, false, null, 60);
    }

    @Override // xsna.guq
    public final void k1(AskWorkoutsPermissions$Parameters askWorkoutsPermissions$Parameters) {
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("AskWorkoutPermissionGoogleFitDelegate.execute() -> params: ");
        sb.append(askWorkoutsPermissions$Parameters);
        sb.append(", thread: ");
        mft0.a(sb, xgx0Var);
        String b = defpackage.j0.b("VKWebAppAskWorkoutsPermissions", this.b);
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.invoke();
        if (fragmentActivity == null || fragmentActivity.isDestroyed() || fragmentActivity.isFinishing()) {
            this.d.a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null));
            return;
        }
        kxu0 kxu0Var = new kxu0();
        kxu0Var.b = fragmentActivity;
        this.e.e(kxu0Var, new h6(this, 6), new we0(this, 6), RequestedMiniApp.VK_WORKOUT);
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
