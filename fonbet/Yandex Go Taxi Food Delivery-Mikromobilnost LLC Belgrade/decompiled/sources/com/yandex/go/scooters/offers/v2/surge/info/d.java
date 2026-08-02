package com.yandex.go.scooters.offers.v2.surge.info;

import android.content.res.ColorStateList;
import com.yandex.go.design.view.GoImageView;
import defpackage.b3p0;
import defpackage.h3p0;
import defpackage.lys;
import defpackage.sls;
import defpackage.tls;
import defpackage.xng0;
import defpackage.zo31;
import defpackage.zy11;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class d extends lys {
    public static final /* synthetic */ int V = 0;
    public final ru.yandex.taxi.widget.utils.e S;
    public final tls T;
    public final int U;

    public d(h3p0 h3p0Var, ru.yandex.taxi.widget.utils.e eVar, tls tlsVar) {
        super(h3p0Var);
        this.S = eVar;
        this.T = tlsVar;
        this.U = ru.yandex.taxi.design.utils.c.h(40, this.a);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        zo31 zo31Var = (zo31) this.R;
        if (((h3p0) zo31Var).c.getVisibility() == 0) {
            ((h3p0) zo31Var).c.setCompoundDrawableTintList(ColorStateList.valueOf(ru.yandex.taxi.design.utils.c.c(xng0.textMain, this.a)));
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        b3p0 b3p0Var = (b3p0) obj;
        zo31 zo31Var = (zo31) this.R;
        h3p0 h3p0Var = (h3p0) zo31Var;
        GoImageView goImageView = h3p0Var.d;
        RobotoTextView robotoTextView = h3p0Var.c;
        b0(new HeaderItemViewHolder$setHeaderIcon$1(this, b3p0Var.a, b3p0Var.b, goImageView, null));
        h3p0Var.e.setText(b3p0Var.c);
        h3p0Var.b.setText(b3p0Var.d);
        final String str = b3p0Var.f;
        CharSequence charSequence = b3p0Var.e;
        if (charSequence == null || charSequence.length() == 0 || str == null || str.length() == 0) {
            robotoTextView.setVisibility(8);
            return;
        }
        robotoTextView.setText(charSequence);
        ru.yandex.taxi.design.utils.c.z(new sls() { // from class: com.yandex.go.scooters.offers.v2.surge.info.c
            @Override // defpackage.sls
            public final Object invoke() {
                ((ScootersSurgeInfoModalView$adapter$1) d.this.T).invoke(str);
                return zy11.a;
            }
        }, robotoTextView);
        robotoTextView.setVisibility(0);
        ((h3p0) zo31Var).c.setCompoundDrawableTintList(ColorStateList.valueOf(ru.yandex.taxi.design.utils.c.c(xng0.textMain, this.a)));
    }
}
