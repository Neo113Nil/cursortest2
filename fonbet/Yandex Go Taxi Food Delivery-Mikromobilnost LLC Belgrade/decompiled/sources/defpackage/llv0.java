package defpackage;

import com.yandex.go.taxi.tariffs.interactor.a;
import java.util.Map;
import ru.yandex.taxi.summary.solid.interactor.u;
import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView;

/* loaded from: classes6.dex */
public final class llv0 {
    public final qlv0 a;
    public final tlv0 b;
    public final i130 c;
    public final h3y d;
    public final p9t0 e = new p9t0(24, this);

    public llv0(qlv0 qlv0Var, tlv0 tlv0Var, i130 i130Var, h3y h3yVar) {
        this.a = qlv0Var;
        this.b = tlv0Var;
        this.c = i130Var;
        this.d = h3yVar;
    }

    public final void a(flv0 flv0Var, sls slsVar, sls slsVar2) {
        ejr ejrVar;
        z4m0 z4m0Var = this.b.a;
        slv0 slv0Var = new slv0(slsVar, slsVar2, this.e, flv0Var, (hhs0) ((du6) z4m0Var.b).get(), (tt2) ((xvf0) z4m0Var.c).get(), (u) ((l9t0) z4m0Var.w).get(), (uos0) ((xvf0) z4m0Var.x).get(), (wiq0) ((w0g) z4m0Var.y).get(), (c4r0) ((xvf0) z4m0Var.z).get(), (a) ((g0g) z4m0Var.A).get());
        Map map = flv0Var.j;
        qlv0 qlv0Var = this.a;
        if (map != null) {
            ejrVar = new gjr(qlv0Var.d, map);
        } else {
            qlv0Var.getClass();
            ejrVar = qtb1.F;
        }
        this.c.a().d(new SummaryPromotionModalWindowsModalView(qlv0Var.a, qlv0Var.b, slv0Var, qlv0Var.c, ejrVar));
    }
}
