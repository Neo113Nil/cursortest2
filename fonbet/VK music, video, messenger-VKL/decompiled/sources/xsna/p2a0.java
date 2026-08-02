package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.bridges.SuperappUiRouterBridge;

/* compiled from: PhoneActualizationRouterImpl.kt */
/* loaded from: classes4.dex */
public final class p2a0 implements l2a0 {
    public final i2a0 a;

    public p2a0(i2a0 i2a0Var) {
        this.a = i2a0Var;
    }

    @Override // xsna.l2a0
    public final io.reactivex.rxjava3.core.x a(UserId userId, String str, String str2) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new j930(this, str, str2, userId));
    }

    @Override // xsna.l2a0
    public final void b(Context context, String str) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.X(context, str, new byo(16), new o2a0(0), dt.b("flow_service", "silent_auth_actual_phone"));
    }
}
