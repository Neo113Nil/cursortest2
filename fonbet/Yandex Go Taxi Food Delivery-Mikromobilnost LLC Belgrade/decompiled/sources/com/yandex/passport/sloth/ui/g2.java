package com.yandex.passport.sloth.ui;

/* loaded from: classes2.dex */
public final class g2 implements com.yandex.passport.sloth.ui.dependencies.q {
    public final com.yandex.passport.sloth.ui.dependencies.q a;
    public final c1 b;

    public g2(com.yandex.passport.sloth.ui.dependencies.q qVar, c1 c1Var) {
        this.a = qVar;
        this.b = c1Var;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.q
    public final void a(SlothUiWish slothUiWish) {
        this.a.a(slothUiWish);
        this.b.a(new com.yandex.passport.sloth.n0(slothUiWish.toString(), 20));
    }
}
