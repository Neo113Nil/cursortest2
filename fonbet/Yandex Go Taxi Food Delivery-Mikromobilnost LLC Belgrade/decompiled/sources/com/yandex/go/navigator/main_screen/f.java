package com.yandex.go.navigator.main_screen;

import defpackage.bvf0;
import defpackage.i3y;
import defpackage.mdh;
import defpackage.mg50;
import defpackage.re50;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class f {
    public final com.yandex.go.navigator.utils.d a;
    public final mg50 b;
    public final re50 c;
    public final tt2 d;
    public final r0 e;
    public final i3y f;
    public final m0 g;

    public f(com.yandex.go.navigator.utils.d dVar, mg50 mg50Var, re50 re50Var, tt2 tt2Var, final ru.yandex.taxi.preorder.suggested.i iVar, com.yandex.go.navigator.main_screen.experiement.e eVar) {
        this.a = dVar;
        this.b = mg50Var;
        this.c = re50Var;
        this.d = tt2Var;
        r0 c = bvf0.c(Boolean.TRUE);
        this.e = c;
        this.f = kotlin.a.a(new sls() { // from class: com.yandex.go.navigator.main_screen.a
            @Override // defpackage.sls
            public final Object invoke() {
                rol0 c2 = ru.yandex.taxi.preorder.suggested.i.this.c(true);
                f fVar = this;
                kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(c2, new MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1(fVar, null));
                fVar.d.getClass();
                sjh sjhVar = uyj.a;
                return kotlinx.coroutines.flow.e.F(I, mdh.b);
            }
        });
        this.g = new m0(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new e(eVar.c)), new MainModalAddressShortcutsInteractor$special$$inlined$flatMapLatest$1(this, null)), c, new MainModalAddressShortcutsInteractor$loadingSuggestFlow$1(3, null));
    }
}
