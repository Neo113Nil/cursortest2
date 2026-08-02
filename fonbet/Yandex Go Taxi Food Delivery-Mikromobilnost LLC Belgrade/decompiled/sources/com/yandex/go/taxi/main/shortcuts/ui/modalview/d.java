package com.yandex.go.taxi.main.shortcuts.ui.modalview;

import android.widget.FrameLayout;
import com.yandex.go.address.models.Address;
import defpackage.a9y0;
import defpackage.c9y0;
import defpackage.d6z;
import defpackage.d82;
import defpackage.e8y0;
import defpackage.eg3;
import defpackage.gvz0;
import defpackage.hbp0;
import defpackage.i8y0;
import defpackage.kgt0;
import defpackage.mse;
import defpackage.oep0;
import defpackage.pa00;
import defpackage.pzt0;
import defpackage.qr31;
import defpackage.quq0;
import defpackage.tb90;
import defpackage.tt2;
import defpackage.vb90;
import defpackage.x0s0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.panorama.l;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes14.dex */
public final class d {
    public final l a;
    public final pa00 b;
    public final i8y0 c;
    public final tt2 d;
    public final e8y0 e;
    public final yvf0 f;
    public final c9y0 g;
    public final kgt0 h;
    public final oep0 i;
    public final x0s0 j;
    public final gvz0 k = new gvz0();
    public qr31 l;
    public pzt0 m;
    public hbp0 n;
    public RotatableFloatButton o;
    public vb90 p;

    public d(l lVar, pa00 pa00Var, i8y0 i8y0Var, tt2 tt2Var, e8y0 e8y0Var, yvf0 yvf0Var, c9y0 c9y0Var, kgt0 kgt0Var, oep0 oep0Var, x0s0 x0s0Var) {
        this.a = lVar;
        this.b = pa00Var;
        this.c = i8y0Var;
        this.d = tt2Var;
        this.e = e8y0Var;
        this.f = yvf0Var;
        this.g = c9y0Var;
        this.h = kgt0Var;
        this.i = oep0Var;
        this.j = x0s0Var;
    }

    public static final Object a(d dVar, FloatButtonHolderLayout floatButtonHolderLayout, Address address, FrameLayout frameLayout, ru.yandex.taxi.panorama.d dVar2, SuspendLambda suspendLambda) {
        x0s0 x0s0Var = dVar.j;
        String c = dVar.b.c();
        tb90 panoramaData = address != null ? address.getPanoramaData() : null;
        tb90 tb90Var = panoramaData != null ? panoramaData : null;
        zy11 zy11Var = zy11.a;
        if (tb90Var == null || !dVar2.b) {
            x0s0Var.c = false;
            RotatableFloatButton rotatableFloatButton = dVar.o;
            if (rotatableFloatButton != null) {
                rotatableFloatButton.setVisibilityAnimated(false);
            }
            qr31 qr31Var = dVar.l;
            if (qr31Var != null) {
                qr31Var.a();
            }
            return zy11Var;
        }
        if (!dVar2.e.contains(c)) {
            x0s0Var.c = false;
            return zy11Var;
        }
        if (!((Boolean) x0s0Var.a.a.invoke()).booleanValue()) {
            x0s0Var.c = false;
            if (dVar.o == null) {
                dVar.o = eg3.e(floatButtonHolderLayout, new d82(1), d6z.Y(dVar2, dVar2.d));
                if (frameLayout != null) {
                    dVar.l = new qr31(frameLayout, dVar.k);
                }
            }
            return dVar.a.c(dVar.o, "a", tb90Var, c, dVar2, dVar2.j, (a9y0) dVar.f.get(), dVar.i, new quq0(5, dVar), suspendLambda);
        }
        RotatableFloatButton rotatableFloatButton2 = dVar.o;
        if (rotatableFloatButton2 != null) {
            rotatableFloatButton2.setVisibilityAnimated(false);
        }
        qr31 qr31Var2 = dVar.l;
        if (qr31Var2 != null) {
            qr31Var2.a();
        }
        x0s0Var.c = true;
        return zy11Var;
    }

    public final hbp0 b() {
        hbp0 hbp0Var = this.n;
        if (hbp0Var != null) {
            return hbp0Var;
        }
        hbp0 hbp0Var2 = new hbp0(new ShortcutPanoramaViewController$getScopeDelegate$delegate$1(0, this.d, tt2.class, "main", "main()Lkotlinx/coroutines/CoroutineDispatcher;", 0), "ShortcutPanoramaViewController", (mse) this.c.a.getValue());
        hbp0Var2.a();
        this.n = hbp0Var2;
        return hbp0Var2;
    }
}
