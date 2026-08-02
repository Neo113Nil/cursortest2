package com.yandex.go.preorder.header;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ck31;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.fyh0;
import defpackage.i3y;
import defpackage.s5k0;
import defpackage.tpr;
import defpackage.w5k0;
import defpackage.xqg0;
import defpackage.xyz;
import defpackage.z5k0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class g implements s5k0 {
    public final ru.yandex.taxi.widget.utils.e a;
    public final n0 b;
    public final eci0 c;
    public final i3y d;
    public final tpr e;

    public g(com.yandex.go.route.interactor.c cVar, ru.yandex.taxi.widget.utils.e eVar, ck31 ck31Var) {
        this.a = eVar;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        n0 b = ffx.b(0, 1, bufferOverflow);
        this.b = b;
        this.c = kotlinx.coroutines.flow.e.c(ffx.b(0, 1, bufferOverflow));
        this.d = kotlin.a.a(new xyz(7, this));
        this.e = com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.n(new d(cVar.f()), new f(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.r(b, new MainScreenRidaHeaderStateInteractor$uiStateFlow$1(1, this, g.class, "headerVisibilityDebounceMs", "headerVisibilityDebounceMs(Lcom/yandex/go/preorder/header/MapInteractionState;)J", 0)), new MainScreenRidaHeaderStateInteractor$special$$inlined$start$1(MapInteractionState.IDLE, null))), new b(((k) ck31Var).r(""), this), new MainScreenRidaHeaderStateInteractor$uiStateFlow$3(this, null)), new MainScreenRidaHeaderStateInteractor$special$$inlined$start$2(new z5k0(eVar.a.getString(fyh0.rida_loading_your_location), new w5k0(eVar.a.getColor(xqg0.rida_header_gradient_top), eVar.a.getColor(xqg0.rida_header_gradient_bottom)), true), null));
    }

    @Override // defpackage.s5k0
    public final tpr a() {
        return this.e;
    }
}
