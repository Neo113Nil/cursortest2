package com.yandex.go.places.impl.ui.organizations.chips.viewholders;

import com.yandex.go.places.impl.ui.common.chip.ChipView;
import defpackage.ei80;
import defpackage.lgp;
import defpackage.lqb;
import defpackage.mia1;
import defpackage.s5o;
import defpackage.scc;
import defpackage.tls;
import defpackage.wys;
import defpackage.zr01;
import java.util.List;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class b extends wys {
    public static final List T = scc.g(new s5o(null), new lgp(TriggerableChipItemViewHolder$Companion$PAYLOAD_TYPES$1.b, TriggerableChipItemViewHolder$Companion$PAYLOAD_TYPES$2.b, 3));
    public final ChipView R;
    public final tls S;

    public b(ChipView chipView, tls tlsVar) {
        super(chipView);
        this.R = chipView;
        this.S = tlsVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        ei80 ei80Var = (ei80) obj;
        lqb lqbVar = ei80Var.b;
        ChipView chipView = this.R;
        chipView.setTexts(lqbVar);
        chipView.setTriggered(ei80Var.d);
        chipView.setBackgroundColorSingle(ei80Var.c);
        chipView.setContentDescription(ei80Var.f);
        c.z(new zr01(11, this, ei80Var), chipView);
        mia1.c(chipView);
    }
}
