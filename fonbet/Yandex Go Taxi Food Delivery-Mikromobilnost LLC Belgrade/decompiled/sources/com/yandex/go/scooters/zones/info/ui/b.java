package com.yandex.go.scooters.zones.info.ui;

import defpackage.lys;
import defpackage.m9p0;
import defpackage.q9p0;
import defpackage.zo31;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class b extends lys {
    public static final /* synthetic */ int T = 0;
    public final ru.yandex.taxi.widget.utils.e S;

    public b(q9p0 q9p0Var, ru.yandex.taxi.widget.utils.e eVar) {
        super(q9p0Var);
        this.S = eVar;
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        m9p0 m9p0Var = (m9p0) obj;
        q9p0 q9p0Var = (q9p0) ((zo31) this.R);
        b0(new HeaderItemViewHolder$bind$1$1(q9p0Var, this, m9p0Var, null));
        q9p0Var.d.setText(m9p0Var.b);
        RobotoTextView robotoTextView = q9p0Var.b;
        CharSequence charSequence = m9p0Var.c;
        robotoTextView.setVisibility(charSequence.length() > 0 ? 0 : 8);
        robotoTextView.setText(charSequence);
    }
}
