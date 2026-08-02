package com.yandex.passport.sloth.ui;

/* loaded from: classes2.dex */
public final class p implements com.yandex.passport.sloth.ui.dependencies.q {
    public final /* synthetic */ com.yandex.passport.sloth.ui.dependencies.q a;
    public final /* synthetic */ l b;

    public p(com.yandex.passport.sloth.ui.dependencies.q qVar, l lVar) {
        this.a = qVar;
        this.b = lVar;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.q
    public final void a(SlothUiWish slothUiWish) {
        this.a.a(slothUiWish);
        ((com.yandex.passport.internal.ui.sloth.f) this.b).a(new com.yandex.passport.sloth.n0(slothUiWish.toString(), 20));
    }
}
