package com.yandex.go.places.impl.ui.organizations.chips.viewholders;

import com.yandex.go.places.impl.ui.common.chip.ChipView;
import defpackage.di80;
import defpackage.lgp;
import defpackage.lqb;
import defpackage.mia1;
import defpackage.n8a;
import defpackage.pav;
import defpackage.s5o;
import defpackage.scc;
import defpackage.tls;
import defpackage.tt2;
import defpackage.wys;
import java.util.List;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class a extends wys {
    public static final List V = scc.g(new s5o(null), new lgp(ChipItemViewHolder$Companion$PAYLOAD_TYPES$1.b, ChipItemViewHolder$Companion$PAYLOAD_TYPES$2.b, 3));
    public final ChipView R;
    public final pav S;
    public final tt2 T;
    public final tls U;

    public a(ChipView chipView, pav pavVar, tt2 tt2Var, tls tlsVar) {
        super(chipView);
        this.R = chipView;
        this.S = pavVar;
        this.T = tt2Var;
        this.U = tlsVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        di80 di80Var = (di80) obj;
        lqb lqbVar = di80Var.b;
        ChipView chipView = this.R;
        chipView.setTexts(lqbVar);
        chipView.setSelected(di80Var.d);
        chipView.setContentDescription(di80Var.b.a());
        chipView.setBackgroundColors(di80Var.c);
        Z(new ChipItemViewHolder$bind$1$1(this, di80Var, chipView, null), "load_image_key", false);
        mia1.c(chipView);
        c.z(new n8a(18, this, di80Var), chipView);
    }
}
