package com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images;

import com.yandex.go.design.view.GoImageView;
import defpackage.ho4;
import defpackage.ki80;
import defpackage.lf80;
import defpackage.pav;
import defpackage.pk80;
import defpackage.qgv;
import defpackage.sls;
import defpackage.tzt;
import defpackage.w511;
import defpackage.zo31;
import kotlin.Pair;

/* loaded from: classes13.dex */
public final class b extends a {
    public static final /* synthetic */ int Z = 0;
    public final int U;
    public final int V;
    public final sls W;

    public b(pk80 pk80Var, pav pavVar, int i, int i2, sls slsVar, lf80 lf80Var) {
        super(pk80Var, pavVar, lf80Var);
        this.U = i;
        this.V = i2;
        this.W = slsVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        ki80 ki80Var = (ki80) obj;
        zo31 zo31Var = (zo31) this.R;
        int i = qgv.a[ki80Var.c.ordinal()];
        int i2 = 8;
        if (i == 1) {
            GoImageView goImageView = ((pk80) zo31Var).b;
            goImageView.setImageIcon(null);
            goImageView.setVisibility(8);
            f0("", false);
            g0(true);
            return;
        }
        if (i == 2) {
            ((pk80) zo31Var).b.setVisibility(0);
            b0(new ImageViewHolder$bind$2(this, ki80Var, null));
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            f0("", false);
            g0(false);
            pk80 pk80Var = (pk80) zo31Var;
            GoImageView goImageView2 = pk80Var.b;
            goImageView2.setImageIcon(null);
            goImageView2.setVisibility(0);
            ru.yandex.taxi.design.utils.c.z(new tzt(i2, this), pk80Var.a);
        }
    }

    @Override // com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.a
    public final GoImageView c0() {
        return ((pk80) ((zo31) this.R)).b;
    }

    @Override // com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.a
    public final ho4 d0() {
        return ((pk80) ((zo31) this.R)).c;
    }

    @Override // com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.a
    public final Pair h0() {
        return new Pair(Integer.valueOf(this.U), Integer.valueOf(this.V));
    }
}
