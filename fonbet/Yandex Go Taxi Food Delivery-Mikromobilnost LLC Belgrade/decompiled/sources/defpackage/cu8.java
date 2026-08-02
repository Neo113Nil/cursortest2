package defpackage;

import kotlin.collections.a;
import kotlinx.coroutines.flow.e;
import ru.yandex.logistics.care.ui.l;
import ru.yandex.taxi.logistics.care.impl.router.d;
import ru.yandex.taxi.logistics.care.impl.router.f;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;

/* loaded from: classes13.dex */
public final class cu8 implements ju41 {
    public final gci0 a;

    public cu8(f4l0 f4l0Var, st2 st2Var) {
        oo0 oo0Var;
        syc sycVar = new syc(f4l0Var.d(), 17);
        ike a = bvf0.a(st2Var.b);
        xsr0.a.getClass();
        r2u0 r2u0Var = wsr0.c;
        qv0 qv0Var = (qv0) a.R(f4l0Var.getRoute().a);
        this.a = e.R(sycVar, a, r2u0Var, (qv0Var == null || (oo0Var = qv0Var.a) == null) ? null : oo0Var.h);
    }

    @Override // defpackage.ju41
    public gci0 getCurrentState() {
        return this.a;
    }

    public cu8(l lVar) {
        pb pbVar = new pb(lVar.J, 23);
        k5c a = ds31.a(lVar);
        xsr0.a.getClass();
        this.a = e.R(pbVar, a, wsr0.b, WebViewState.LOADING);
    }

    public cu8(f fVar) {
        pwy0 pwy0Var = fVar.U;
        this.a = e.R(new d(pwy0Var.a()), fVar.O, wsr0.a(xsr0.a, 3), Boolean.valueOf(pwy0Var.getThemeType().c()));
    }
}
