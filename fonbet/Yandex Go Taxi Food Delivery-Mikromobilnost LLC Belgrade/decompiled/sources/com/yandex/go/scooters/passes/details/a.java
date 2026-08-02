package com.yandex.go.scooters.passes.details;

import android.view.View;
import defpackage.kdo0;
import defpackage.lys;
import defpackage.nzs;
import defpackage.pav;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class a extends lys {
    public static final /* synthetic */ int T = 0;
    public final pav S;

    public a(ListItemComponent listItemComponent, pav pavVar) {
        super(listItemComponent);
        this.S = pavVar;
        nzs.s((ListItemComponent) ((View) this.R), -1, -2);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        kdo0 kdo0Var = (kdo0) obj;
        ((ListItemComponent) ((View) this.R)).setTitle(kdo0Var.a);
        if (kdo0Var.b.length() == 0) {
            W("ICON_LOAD_KEY");
        } else {
            Z(new ItemViewHolder$bindIcon$1(this, kdo0Var, null), "ICON_LOAD_KEY", true);
        }
    }
}
