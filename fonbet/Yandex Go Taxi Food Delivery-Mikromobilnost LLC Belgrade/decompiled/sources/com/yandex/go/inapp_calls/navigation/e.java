package com.yandex.go.inapp_calls.navigation;

import defpackage.hkv;
import defpackage.qu;
import defpackage.yjv;

/* loaded from: classes12.dex */
public final class e implements yjv {
    public final /* synthetic */ f a;
    public final /* synthetic */ hkv b;

    public e(f fVar, hkv hkvVar) {
        this.a = fVar;
        this.b = hkvVar;
    }

    @Override // defpackage.yjv
    public final void Z(boolean z) {
        f fVar = this.a;
        if (z) {
            com.yandex.go.coroutines.b.g(fVar.o(), null, null, new InAppOutgoingCallRouterImpl$downloadAndLaunchInAppCall$1$closeWithResult$1(fVar, this.b, null), 3);
        } else {
            fVar.r(new qu(9));
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.yjv
    public final void u() {
        this.a.r(new qu(9));
    }
}
