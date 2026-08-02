package com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images;

import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.evu0;
import defpackage.ho4;
import defpackage.k7v;
import defpackage.li80;
import defpackage.rj80;
import defpackage.s8o;
import defpackage.zo31;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class c extends a {
    public static final /* synthetic */ int U = 0;

    @Override // defpackage.wys
    public final void c(Object obj) {
        li80 li80Var = (li80) obj;
        rj80 rj80Var = (rj80) ((zo31) this.R);
        GoFrameLayout goFrameLayout = rj80Var.a;
        goFrameLayout.setBackgroundColor(s8o.m(li80Var.b, goFrameLayout.getContext()));
        RobotoTextView robotoTextView = rj80Var.d;
        CharSequence charSequence = li80Var.a;
        robotoTextView.setVisibility(!evu0.J(charSequence) ? 0 : 8);
        robotoTextView.setText(charSequence);
        k7v k7vVar = li80Var.c;
        if ((k7vVar != null ? k7vVar.a : null) == null) {
            rj80Var.c.setVisibility(8);
        } else {
            b0(new PlaceholderViewHolder$bind$2(this, li80Var, null));
        }
    }

    @Override // com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.a
    public final GoImageView c0() {
        return ((rj80) ((zo31) this.R)).c;
    }

    @Override // com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.a
    public final ho4 d0() {
        return ((rj80) ((zo31) this.R)).b;
    }
}
