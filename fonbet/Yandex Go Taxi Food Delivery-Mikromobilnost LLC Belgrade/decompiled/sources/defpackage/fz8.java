package defpackage;

import androidx.core.view.b;
import ru.yandex.taxi.summary.requirements.list.carousel.view.CarouselButton;

/* loaded from: classes6.dex */
public final class fz8 extends wx8 {
    public static final /* synthetic */ int V = 0;
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public final /* synthetic */ int T;
    public final pav U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz8(dy8 dy8Var, pav pavVar, int i) {
        super(dy8Var);
        this.T = i;
        switch (i) {
            case 1:
                super(dy8Var);
                this.U = pavVar;
                CarouselButton carouselButton = dy8Var.b;
                CarouselButton.setBackgroundColor$default(carouselButton, new bdc(xng0.bgFloating), false, 2, null);
                carouselButton.setIconRes(Integer.valueOf(f1h0.ic_close_error_20));
                dy8Var.d.setVisibility(0);
                b.p(dy8Var.a, new mg(11, this));
                break;
            case 2:
                super(dy8Var);
                this.U = pavVar;
                CarouselButton carouselButton2 = dy8Var.b;
                CarouselButton.setBackgroundColor$default(carouselButton2, new bdc(xng0.bgFloating), false, 2, null);
                carouselButton2.setIconRes(Integer.valueOf(f1h0.ic_chevron_right_circle_10));
                dy8Var.d.setVisibility(0);
                b.p(dy8Var.a, new ei(5));
                break;
            default:
                this.U = pavVar;
                CarouselButton carouselButton3 = dy8Var.b;
                CarouselButton.setBackgroundColor$default(carouselButton3, new bdc(xng0.bgFloating), false, 2, null);
                carouselButton3.setIconRes(Integer.valueOf(f1h0.ic_chevron_right_circle_10));
                b.p(dy8Var.a, new ei(4));
                break;
        }
    }

    @Override // defpackage.wx8
    public final void e0(ux8 ux8Var) {
        int i = this.T;
        pav pavVar = this.U;
        Object obj = this.R;
        switch (i) {
            case 0:
                ox8 ox8Var = (ox8) ux8Var;
                dy8 dy8Var = (dy8) ((zo31) obj);
                dy8Var.e.setText(ox8Var.b);
                dy8Var.b.setText(ox8Var.c);
                d0(ox8Var.d, pavVar);
                break;
            case 1:
                sx8 sx8Var = (sx8) ux8Var;
                ((dy8) ((zo31) obj)).e.setText(sx8Var.b);
                d0(sx8Var.c, pavVar);
                break;
            default:
                tx8 tx8Var = (tx8) ux8Var;
                dy8 dy8Var2 = (dy8) ((zo31) obj);
                dy8Var2.e.setText(tx8Var.e);
                dy8Var2.b.setText(tx8Var.c);
                d0(tx8Var.f, pavVar);
                break;
        }
    }
}
