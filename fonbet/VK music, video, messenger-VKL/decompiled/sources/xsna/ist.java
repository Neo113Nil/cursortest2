package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.health.js.bridge.api.events.GetHealthConnectInfo$Parameters;
import com.vk.superapp.vksteps.StepsMiniAppIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: GetInfoHealthConnectDelegate.kt */
/* loaded from: classes6.dex */
public final class ist implements guq<GetHealthConnectInfo$Parameters> {
    public static final zrp<StepsMiniAppIds> f = StepsMiniAppIds.h();
    public final com.vk.superapp.base.js.bridge.b b;
    public final bfm c;
    public final wvp d;
    public final ayu0 e;

    public ist(com.vk.superapp.base.js.bridge.b bVar, bfm bfmVar, wvp wvpVar, ayu0 ayu0Var) {
        this.b = bVar;
        this.c = bfmVar;
        this.d = wvpVar;
        this.e = ayu0Var;
    }

    @Override // xsna.guq
    public final List<Long> a1() {
        zrp<StepsMiniAppIds> zrpVar = f;
        ArrayList arrayList = new ArrayList(c5g.u(zrpVar, 10));
        Iterator<E> it = zrpVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((StepsMiniAppIds) it.next()).i()));
        }
        return arrayList;
    }

    @Override // xsna.guq
    public final void k1(GetHealthConnectInfo$Parameters getHealthConnectInfo$Parameters) {
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("VkStepsGetInfoHealthConnectDelegate.execute() -> params: ");
        sb.append(getHealthConnectInfo$Parameters);
        sb.append(", thread: ");
        mft0.a(sb, xgx0Var);
        String b = defpackage.j0.b("VKWebAppGetHealthConnectInfo", this.b);
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.invoke();
        wvp wvpVar = this.d;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            wvpVar.b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null));
        } else if (this.e.b(fragmentActivity)) {
            bbs.a(fragmentActivity, EmptyCoroutineContext.b, new hst(this, fragmentActivity, b, null));
        } else {
            wvpVar.b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), b, 1, null));
        }
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
