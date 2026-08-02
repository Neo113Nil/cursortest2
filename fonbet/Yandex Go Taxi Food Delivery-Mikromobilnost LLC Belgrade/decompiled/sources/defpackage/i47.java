package defpackage;

import android.view.ContextThemeWrapper;
import com.yandex.go.shortcuts.dto.response.Layout;
import java.util.Collections;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.b;

/* loaded from: classes6.dex */
public final class i47 implements e4s0 {
    public final /* synthetic */ int a;
    public final zuj0 b;

    public /* synthetic */ i47(zuj0 zuj0Var, int i) {
        this.a = i;
        this.b = zuj0Var;
    }

    @Override // defpackage.e4s0
    public d4s0 a() {
        int i = this.a;
        zuj0 zuj0Var = this.b;
        switch (i) {
            case 1:
                Layout layout = Layout.e;
                b bVar = FormattedText.Companion;
                avj0 avj0Var = (avj0) zuj0Var;
                String h = avj0Var.h(kyh0.invite_activation_common_error);
                int i2 = xng0.textMain;
                ContextThemeWrapper contextThemeWrapper = avj0Var.a;
                String a = bVar.a(h, q5z.s(qje.t(i2, contextThemeWrapper))).a();
                if (a == null) {
                    a = "";
                }
                return new d4s0(layout, d1z.a, null, Collections.singletonList(new jsy(a, tje.u(112, contextThemeWrapper))), null, null, null, null, null, true, 2548);
            default:
                return new d4s0(new Layout(0), d1z.a, null, Collections.singletonList(k4q0.a(2, Integer.valueOf(e0h0.ic_masstransit_logo), ((avj0) zuj0Var).h(kyh0.mass_transit))), null, null, null, null, null, true, 2548);
        }
    }
}
