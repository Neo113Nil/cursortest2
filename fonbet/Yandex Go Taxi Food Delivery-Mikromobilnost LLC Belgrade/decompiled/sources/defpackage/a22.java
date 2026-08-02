package defpackage;

import com.yandex.go.dto.response.m0;
import com.yandex.go.scooters.domain.model.ScootersPreselectionException;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.view.adapter.model.model.PlainButtonModel$Style;
import com.yandex.go.shortcuts.view.adapter.model.model.TextModel$TextColor;

/* loaded from: classes13.dex */
public final class a22 implements e4s0 {
    public final zuj0 a;

    public /* synthetic */ a22(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    @Override // defpackage.e4s0
    public d4s0 a() {
        Layout layout = new Layout(0);
        int i = kyh0.mass_transit;
        avj0 avj0Var = (avj0) this.a;
        return new d4s0(layout, d1z.a, null, scc.g(k4q0.a(6, null, avj0Var.h(i)), new qry0(avj0Var.h(kyh0.webview_error_title), tje.u(64, avj0Var.a), TextModel$TextColor.CONTROL_MINOR), new t3s0(tje.u(1, avj0Var.a) + tje.u(6, avj0Var.a), 0, 12, false), new bhc0(avj0Var.h(kyh0.try_again), PlainButtonModel$Style.CONTROL_MINOR, m0.INSTANCE)), null, null, null, null, null, true, 2548);
    }

    public ScootersPreselectionException b(cq60 cq60Var, c430 c430Var) {
        if (cq60Var.h != null || c430Var.c == null) {
            return null;
        }
        int i = kyh0.scooters_not_found_title;
        avj0 avj0Var = (avj0) this.a;
        return new ScootersPreselectionException(avj0Var.h(i), avj0Var.h(kyh0.scooters_not_found_subtile));
    }
}
