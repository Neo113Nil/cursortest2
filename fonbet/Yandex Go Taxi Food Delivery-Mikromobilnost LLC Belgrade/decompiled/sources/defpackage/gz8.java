package defpackage;

import androidx.core.view.b;
import ru.yandex.taxi.summary.requirements.list.carousel.view.CarouselButton;

/* loaded from: classes6.dex */
public final class gz8 extends wx8 {
    public static final /* synthetic */ int V = 0;
    public final pav T;
    public rx8 U;

    public gz8(dy8 dy8Var, pav pavVar) {
        super(dy8Var);
        this.T = pavVar;
        b.p(dy8Var.a, new mg(10, this));
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.U = null;
    }

    @Override // defpackage.wx8
    public final void e0(ux8 ux8Var) {
        f0((rx8) ux8Var, false);
    }

    public final void f0(rx8 rx8Var, boolean z) {
        this.U = rx8Var;
        dy8 dy8Var = (dy8) ((zo31) this.R);
        dy8Var.e.setText(rx8Var.getTitle());
        if (rx8Var.isSelected()) {
            CarouselButton carouselButton = dy8Var.b;
            CarouselButton carouselButton2 = dy8Var.b;
            carouselButton.setBackgroundColor(rx8Var.p(), z);
            carouselButton2.setIconRes(Integer.valueOf(f1h0.ic_tick_20));
            cdc u = rx8Var.u();
            if (u != null) {
                carouselButton2.setIconTint(u);
            }
        } else {
            dy8Var.b.setBackgroundColor(new bdc(xng0.bgFloating), z);
            dy8Var.b.setIconRes(Integer.valueOf(f1h0.ic_plus_20));
        }
        d0(rx8Var.s(), this.T);
    }
}
