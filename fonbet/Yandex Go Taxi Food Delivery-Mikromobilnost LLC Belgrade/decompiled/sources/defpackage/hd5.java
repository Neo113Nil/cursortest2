package defpackage;

import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.fragment.common.BaseWebChromeClient;
import ru.yandex.taxi.preorder.map.n;
import ru.yandex.taxi.preorder.source.routeoverlay.RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$1;
import ru.yandex.taxi.preorder.source.routeoverlay.RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$2;
import ru.yandex.taxi.preorder.source.routeoverlay.RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$3;
import ru.yandex.taxi.preorder.source.routeoverlay.RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$4;
import ru.yandex.taxi.preorder.source.routeoverlay.RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$5;
import ru.yandex.taxi.preorder.source.routeoverlay.a;
import ru.yandex.taxi.styling.f;

/* loaded from: classes6.dex */
public final class hd5 extends jey {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hd5(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.jey, defpackage.iey
    public void onDestroy() {
        l8x l8xVar;
        l8x l8xVar2;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                BaseWebChromeClient baseWebChromeClient = (BaseWebChromeClient) obj2;
                l8xVar = baseWebChromeClient.createIntentJob;
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                l8xVar2 = baseWebChromeClient.requestPermissionJob;
                if (l8xVar2 != null) {
                    l8xVar2.a(null);
                }
                ((ney) obj).d(this);
                break;
            case 1:
                pzt0 pzt0Var = ((m420) obj2).d;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                ((ney) obj).d(this);
                break;
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public void onPause() {
        switch (this.a) {
            case 2:
                a aVar = (a) this.c;
                aVar.B0.b();
                tac tacVar = aVar.A0;
                if (tacVar != null) {
                    tacVar.cancel();
                }
                aVar.A0 = null;
                cp10 cp10Var = aVar.v0;
                if (cp10Var != null) {
                    tje.B(aVar.w).removeAccessibilityStateChangeListener(cp10Var);
                }
                ((gh00) ((ah00) aVar.b)).u((b01) this.b);
                n nVar = aVar.x;
                pzt0 pzt0Var = nVar.x;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                nVar.x = null;
                nVar.h.t4(nVar);
                ru.yandex.taxi.preorder.source.points.a aVar2 = aVar.P;
                aVar2.n.b();
                aVar2.k.clear();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l6l0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l6l0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l6l0] */
    @Override // defpackage.jey, defpackage.iey
    public void onResume() {
        switch (this.a) {
            case 2:
                final a aVar = (a) this.c;
                hbp0 hbp0Var = aVar.B0;
                ah00 ah00Var = (ah00) aVar.b;
                n nVar = aVar.x;
                hbp0 hbp0Var2 = aVar.B0;
                if (!hbp0Var.d()) {
                    hbp0Var2.a();
                    tje.N(hbp0Var2, null, null, new RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$1(((f) aVar.z).d(null), null, aVar), 3);
                    tje.N(hbp0Var2, null, null, new RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$2(aVar.H.b(nVar.v), null, aVar), 3);
                    tje.N(hbp0Var2, null, null, new RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$3(aVar.A.a(), null, aVar), 3);
                    tje.N(hbp0Var2, null, null, new RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$4(e.t(aVar.R.b()), null, aVar), 3);
                    tje.N(hbp0Var2, null, null, new RouteOverlayImplV1$attach$2$onResume$$inlined$safeCollectIn$5(aVar.K.a, null, aVar), 3);
                }
                final int i = 0;
                final int i2 = 1;
                final int i3 = 2;
                nVar.e(new wls() { // from class: l6l0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i;
                        zy11 zy11Var = zy11.a;
                        a aVar2 = aVar;
                        t3l0 t3l0Var = (t3l0) obj;
                        t3l0 t3l0Var2 = (t3l0) obj2;
                        switch (i4) {
                            case 0:
                                aVar2.Qg(t3l0Var, t3l0Var2, aVar2.j0, aVar2.x0);
                                if (aVar2.j0 != null) {
                                    aVar2.S.d(t3l0Var2.b());
                                    break;
                                }
                                break;
                            case 1:
                                aVar2.Qg(t3l0Var, t3l0Var2, aVar2.k0, aVar2.y0);
                                break;
                            default:
                                xq00 xq00Var = aVar2.z0;
                                f4c0 f4c0Var = aVar2.l0;
                                if (f4c0Var != null) {
                                    boolean z = t3l0Var != null && t3l0Var.c == t3l0Var2.c;
                                    boolean z2 = t3l0Var != null && t3l0Var.b() && t3l0Var2.b();
                                    if (!t3l0Var2.a() && !aVar2.p0) {
                                        if (t3l0Var != null && (!z2 || !z)) {
                                            xq00Var.b();
                                            if (!t3l0Var.a()) {
                                                xq00Var.f(new i6l0(aVar2, t3l0Var2, f4c0Var, 1));
                                                xq00Var.e(aVar2.w0);
                                                break;
                                            } else {
                                                aVar2.Sg(t3l0Var2, f4c0Var, xq00Var);
                                                break;
                                            }
                                        } else {
                                            aVar2.Pg(t3l0Var2, f4c0Var);
                                            f4c0Var.i(t3l0Var2.b());
                                            break;
                                        }
                                    } else {
                                        f4c0Var.i(false);
                                        break;
                                    }
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }, new wls() { // from class: l6l0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i2;
                        zy11 zy11Var = zy11.a;
                        a aVar2 = aVar;
                        t3l0 t3l0Var = (t3l0) obj;
                        t3l0 t3l0Var2 = (t3l0) obj2;
                        switch (i4) {
                            case 0:
                                aVar2.Qg(t3l0Var, t3l0Var2, aVar2.j0, aVar2.x0);
                                if (aVar2.j0 != null) {
                                    aVar2.S.d(t3l0Var2.b());
                                    break;
                                }
                                break;
                            case 1:
                                aVar2.Qg(t3l0Var, t3l0Var2, aVar2.k0, aVar2.y0);
                                break;
                            default:
                                xq00 xq00Var = aVar2.z0;
                                f4c0 f4c0Var = aVar2.l0;
                                if (f4c0Var != null) {
                                    boolean z = t3l0Var != null && t3l0Var.c == t3l0Var2.c;
                                    boolean z2 = t3l0Var != null && t3l0Var.b() && t3l0Var2.b();
                                    if (!t3l0Var2.a() && !aVar2.p0) {
                                        if (t3l0Var != null && (!z2 || !z)) {
                                            xq00Var.b();
                                            if (!t3l0Var.a()) {
                                                xq00Var.f(new i6l0(aVar2, t3l0Var2, f4c0Var, 1));
                                                xq00Var.e(aVar2.w0);
                                                break;
                                            } else {
                                                aVar2.Sg(t3l0Var2, f4c0Var, xq00Var);
                                                break;
                                            }
                                        } else {
                                            aVar2.Pg(t3l0Var2, f4c0Var);
                                            f4c0Var.i(t3l0Var2.b());
                                            break;
                                        }
                                    } else {
                                        f4c0Var.i(false);
                                        break;
                                    }
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }, new wls() { // from class: l6l0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        zy11 zy11Var = zy11.a;
                        a aVar2 = aVar;
                        t3l0 t3l0Var = (t3l0) obj;
                        t3l0 t3l0Var2 = (t3l0) obj2;
                        switch (i4) {
                            case 0:
                                aVar2.Qg(t3l0Var, t3l0Var2, aVar2.j0, aVar2.x0);
                                if (aVar2.j0 != null) {
                                    aVar2.S.d(t3l0Var2.b());
                                    break;
                                }
                                break;
                            case 1:
                                aVar2.Qg(t3l0Var, t3l0Var2, aVar2.k0, aVar2.y0);
                                break;
                            default:
                                xq00 xq00Var = aVar2.z0;
                                f4c0 f4c0Var = aVar2.l0;
                                if (f4c0Var != null) {
                                    boolean z = t3l0Var != null && t3l0Var.c == t3l0Var2.c;
                                    boolean z2 = t3l0Var != null && t3l0Var.b() && t3l0Var2.b();
                                    if (!t3l0Var2.a() && !aVar2.p0) {
                                        if (t3l0Var != null && (!z2 || !z)) {
                                            xq00Var.b();
                                            if (!t3l0Var.a()) {
                                                xq00Var.f(new i6l0(aVar2, t3l0Var2, f4c0Var, 1));
                                                xq00Var.e(aVar2.w0);
                                                break;
                                            } else {
                                                aVar2.Sg(t3l0Var2, f4c0Var, xq00Var);
                                                break;
                                            }
                                        } else {
                                            aVar2.Pg(t3l0Var2, f4c0Var);
                                            f4c0Var.i(t3l0Var2.b());
                                            break;
                                        }
                                    } else {
                                        f4c0Var.i(false);
                                        break;
                                    }
                                }
                                break;
                        }
                        return zy11Var;
                    }
                });
                ((gh00) ah00Var).e((b01) this.b);
                aVar.A0 = ((gh00) ah00Var).a.d.h(new jx0(i3, aVar));
                aVar.P.a();
                cp10 cp10Var = aVar.v0;
                if (cp10Var != null) {
                    tje.B(aVar.w).addAccessibilityStateChangeListener(cp10Var);
                    break;
                }
                break;
        }
    }
}
