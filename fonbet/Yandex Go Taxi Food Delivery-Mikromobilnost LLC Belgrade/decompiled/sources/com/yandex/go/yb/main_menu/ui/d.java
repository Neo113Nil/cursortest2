package com.yandex.go.yb.main_menu.ui;

import defpackage.dp51;
import defpackage.i3y;
import defpackage.ly51;
import defpackage.tje;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes15.dex */
public final class d {
    public final i3y a;
    public final ly51 b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new dp51(17));
    public YbWalletMenuItemViewHolderImpl$BadgeWrapper d;

    public d(i3y i3yVar, ly51 ly51Var) {
        this.a = i3yVar;
        this.b = ly51Var;
    }

    public final void a() {
        c cVar = new c(this);
        ly51 ly51Var = this.b;
        ly51Var.Bg(cVar);
        tje.N(ly51Var.Jg(), null, null, new YbWalletMenuItemPresenter$attachView$1(ly51Var, cVar, null), 3);
        tje.N(ly51Var.Jg(), null, null, new YbWalletMenuItemPresenter$attachView$2(ly51Var, null), 3);
    }
}
