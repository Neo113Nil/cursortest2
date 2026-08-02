package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.health.js.bridge.api.events.GetStepsPermissions$Parameters;
import com.vk.superapp.vksteps.StepsMiniAppIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: GetStepsPermissionsHealthConnectDelegate.kt */
/* loaded from: classes6.dex */
public final class vvt implements guq<GetStepsPermissions$Parameters> {
    public static final zrp g = StepsMiniAppIds.h();
    public final com.vk.superapp.base.js.bridge.b b;
    public final bfm c;
    public final wvp d;
    public final ayu0 e;
    public final hmv0 f;

    public vvt(com.vk.superapp.base.js.bridge.b bVar, bfm bfmVar, wvp wvpVar, ayu0 ayu0Var, hmv0 hmv0Var) {
        this.b = bVar;
        this.c = bfmVar;
        this.d = wvpVar;
        this.e = ayu0Var;
        this.f = hmv0Var;
    }

    @Override // xsna.guq
    public final List<Long> a1() {
        zrp zrpVar = g;
        ArrayList arrayList = new ArrayList(c5g.u(zrpVar, 10));
        Iterator<E> it = zrpVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((StepsMiniAppIds) it.next()).i()));
        }
        return arrayList;
    }

    @Override // xsna.guq
    public final void k1(GetStepsPermissions$Parameters getStepsPermissions$Parameters) {
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("VkStepsGetStepsPermissionsHealthConnectDelegate.execute() -> params: ");
        sb.append(getStepsPermissions$Parameters);
        sb.append(", thread: ");
        mft0.a(sb, xgx0Var);
        String b = defpackage.j0.b("VKWebAppGetStepsPermissions", this.b);
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.invoke();
        if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            bbs.a(fragmentActivity, EmptyCoroutineContext.b, new uvt(this, fragmentActivity, b, null));
        } else {
            this.d.d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null));
        }
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
