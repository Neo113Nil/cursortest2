package com.yandex.go.taxi.summary.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.summary.ui.a;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.amp0;
import defpackage.czo0;
import defpackage.dpv0;
import defpackage.hbp0;
import defpackage.mcv0;
import defpackage.msb1;
import defpackage.o3;
import defpackage.o81;
import defpackage.p81;
import defpackage.q81;
import defpackage.qpv0;
import defpackage.rpv0;
import defpackage.tje;
import defpackage.vev0;
import defpackage.w511;
import defpackage.xw31;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.DotsIndicatorComponent;
import ru.yandex.taxi.preorder.summary.solid.o;

/* loaded from: classes6.dex */
public final class a {
    public final amp0 a;
    public final FrameLayout b;
    public final DotsIndicatorComponent c;
    public final GoFrameLayout d;
    public final AnchorBottomSheetBehavior e;
    public final qpv0 f;
    public final int g;
    public int h;
    public int i;
    public final mcv0 j;
    public final mcv0 k;
    public final ru.yandex.taxi.preorder.summary.solid.sourcedestination.b l;
    public final hbp0 m;

    /* JADX WARN: Type inference failed for: r4v3, types: [mcv0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [mcv0] */
    public a(amp0 amp0Var, o oVar, FrameLayout frameLayout, DotsIndicatorComponent dotsIndicatorComponent, FrameLayout frameLayout2, GoFrameLayout goFrameLayout, AnchorBottomSheetBehavior anchorBottomSheetBehavior, qpv0 qpv0Var) {
        ru.yandex.taxi.preorder.summary.solid.sourcedestination.b bVar;
        dpv0 dpv0Var = (dpv0) amp0Var.b;
        this.a = amp0Var;
        this.b = frameLayout;
        this.c = dotsIndicatorComponent;
        this.d = goFrameLayout;
        this.e = anchorBottomSheetBehavior;
        this.f = qpv0Var;
        this.g = tje.u(8, goFrameLayout.getContext());
        final int i = 0;
        this.j = new View.OnLayoutChangeListener(this) { // from class: mcv0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10;
                int i11 = i;
                a aVar = this.b;
                switch (i11) {
                    case 0:
                        aVar.h = view.getHeight() - view.getPaddingBottom();
                        aVar.b();
                        break;
                    default:
                        int i12 = aVar.i;
                        GoFrameLayout goFrameLayout2 = aVar.d;
                        aVar.i = view.getHeight();
                        aVar.b();
                        if (i12 == 0 && (i10 = aVar.i) != 0) {
                            goFrameLayout2.setTranslationY(-i10);
                            goFrameLayout2.animate().translationY(0.0f).setInterpolator(pcv0.a).setDuration(400L).start();
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.k = new View.OnLayoutChangeListener(this) { // from class: mcv0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10;
                int i11 = i2;
                a aVar = this.b;
                switch (i11) {
                    case 0:
                        aVar.h = view.getHeight() - view.getPaddingBottom();
                        aVar.b();
                        break;
                    default:
                        int i12 = aVar.i;
                        GoFrameLayout goFrameLayout2 = aVar.d;
                        aVar.i = view.getHeight();
                        aVar.b();
                        if (i12 == 0 && (i10 = aVar.i) != 0) {
                            goFrameLayout2.setTranslationY(-i10);
                            goFrameLayout2.animate().translationY(0.0f).setInterpolator(pcv0.a).setDuration(400L).start();
                            break;
                        }
                        break;
                }
            }
        };
        q81 q81Var = ((vev0) amp0Var.c).a;
        if (q81Var instanceof p81) {
            frameLayout2.setVisibility(8);
            bVar = dpv0Var.a(goFrameLayout, oVar);
        } else if (q81Var instanceof o81) {
            goFrameLayout.setVisibility(8);
            bVar = dpv0Var.a(frameLayout2, oVar);
        } else {
            if (!q81Var.equals(msb1.c)) {
                w511.b();
                throw null;
            }
            goFrameLayout.setVisibility(8);
            frameLayout2.setVisibility(8);
            bVar = null;
        }
        this.l = bVar;
        this.m = new hbp0(new czo0(14), "", null);
    }

    public final void a() {
        hbp0 hbp0Var = this.m;
        hbp0Var.a();
        ru.yandex.taxi.preorder.summary.solid.sourcedestination.b bVar = this.l;
        if (bVar != null) {
            bVar.b();
        }
        this.c.addOnLayoutChangeListener(this.j);
        this.d.addOnLayoutChangeListener(this.k);
        hbp0.e(hbp0Var, null, null, new SummaryAddressControlCoordinator$attach$1(this, null), 3);
    }

    public final void b() {
        amp0 amp0Var = this.a;
        boolean z = ((vev0) amp0Var.c).a instanceof p81;
        int i = this.g;
        if (z) {
            ((o3) amp0Var.a).o(this.i + i);
        }
        rpv0 rpv0Var = (rpv0) this.f;
        if (!rpv0Var.a.g(((k) rpv0Var.b).h())) {
            if (((vev0) amp0Var.c).a instanceof p81) {
                int i2 = this.i;
                ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                r4 = i2 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + i;
            } else {
                r4 = this.h;
            }
        }
        this.e.K(r4, true);
        FrameLayout frameLayout = this.b;
        if (frameLayout.getPaddingBottom() != r4) {
            xw31.I(frameLayout, null, null, null, Integer.valueOf(r4));
        }
    }
}
