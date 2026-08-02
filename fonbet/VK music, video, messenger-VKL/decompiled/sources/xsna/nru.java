package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupSuggestion;
import com.vk.voip.b;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nru implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserId c;

    public /* synthetic */ nru(UserId userId, int i) {
        this.b = i;
        this.c = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(epx.f(((GroupSuggestion) obj).b.c, this.c));
            default:
                fqw0 fqw0Var = (fqw0) obj;
                zqk0 zqk0Var = fqw0Var.a;
                boolean z = false;
                if (!zqk0Var.i && !com.vk.dto.common.b.a(zqk0Var.b)) {
                    z = com.vk.dto.common.b.d(fqw0Var.a.b) ? fqw0Var.f : true;
                }
                com.vk.voip.ui.c.b.getClass();
                v2x0 v2x0Var = com.vk.voip.ui.c.r0;
                if (v2x0Var == null) {
                    v2x0Var = null;
                }
                lmc lmcVar = v2x0Var.d;
                long j = this.c.b;
                int g = swe0.g(Math.max(12, (((Math.max(iah0.f().widthPixels, iah0.f().heightPixels) / ListGroupCallView.r0) + 1) * 4) / 3), 6, 30);
                rah0 rah0Var = com.vk.voip.ui.c.g;
                return new b.d(z, true, g, rah0Var != null ? rah0Var : null);
        }
    }
}
