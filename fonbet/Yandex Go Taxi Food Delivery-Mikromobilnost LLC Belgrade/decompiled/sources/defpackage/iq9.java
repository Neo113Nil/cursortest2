package defpackage;

import com.yandex.go.chargers.debt.notification.ChargersDebtStateBarPresenter$attachView$$inlined$safeCollectIn$1;
import java.util.HashMap;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;
import ru.yandex.taxi.statebar.a;

/* loaded from: classes12.dex */
public final class iq9 extends h55 {
    public final md6 D;

    public iq9(md6 md6Var) {
        super(null);
        this.D = md6Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        md6 md6Var = this.D;
        ((hq9) md6Var.c).Cg();
        a aVar = (a) md6Var.b;
        t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.CHARGERS_DEBT);
        t3u0Var.b = false;
        aVar.a(new u3u0(t3u0Var));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        md6 md6Var = this.D;
        hq9 hq9Var = (hq9) md6Var.c;
        cq9 cq9Var = new cq9(md6Var);
        hq9Var.Bg(cq9Var);
        em9 em9Var = hq9Var.x;
        em9Var.a.a("Chargers.DebtStateBar.Shown", b64.w(em9Var), 1, new HashMap());
        tje.N(hq9Var.Jg(), null, null, new ChargersDebtStateBarPresenter$attachView$$inlined$safeCollectIn$1(hq9Var.y.a(), null, cq9Var), 3);
    }
}
