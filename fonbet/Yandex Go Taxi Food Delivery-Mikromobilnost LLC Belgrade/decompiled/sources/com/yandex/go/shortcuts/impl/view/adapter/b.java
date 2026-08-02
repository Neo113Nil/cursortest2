package com.yandex.go.shortcuts.impl.view.adapter;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.c1f;
import defpackage.cma1;
import defpackage.ga5;
import defpackage.j1s0;
import defpackage.j24;
import defpackage.jl40;
import defpackage.js4;
import defpackage.jy4;
import defpackage.mh3;
import defpackage.mw2;
import defpackage.n170;
import defpackage.nl4;
import defpackage.pry0;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.t4s0;
import defpackage.u7h0;
import defpackage.w3s0;
import java.util.WeakHashMap;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public abstract class b extends c {
    public final w3s0 h0;
    public final ImageView i0;
    public final ViewGroup j0;
    public String k0;

    public b(w3s0 w3s0Var, t4s0 t4s0Var, c1f c1fVar, n170 n170Var, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.widget.c cVar, View view, j1s0 j1s0Var) {
        super(c1fVar, n170Var, j1s0Var, t4s0Var, view, aVar, cVar);
        this.h0 = w3s0Var;
        int i = u7h0.shortcut_poi;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.i0 = (ImageView) ((View) rp31.d(view, i));
        this.j0 = (ViewGroup) ((View) rp31.d(view, u7h0.shortcut_poi_container));
        this.d0.setMaxLines(2);
        this.d0.setEllipsize(null);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.kx31, defpackage.wys
    public final void Y() {
        super.Y();
        ViewGroup viewGroup = this.j0;
        viewGroup.animate().cancel();
        viewGroup.setVisibility(8);
        this.k0 = null;
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: d0 */
    public void c(ga5 ga5Var) {
        super.c(ga5Var);
        r0(ga5Var);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final void m0(ga5 ga5Var) {
        boolean isLaidOut = this.a.isLaidOut();
        RobotoTextView robotoTextView = this.e0;
        if (isLaidOut) {
            cma1.a0(robotoTextView, new AnimUtils$AnimationEndListener(new mh3(12, this, ga5Var)));
        } else {
            c.i0(this, robotoTextView, ga5Var.getBase().h);
        }
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final void o0(ga5 ga5Var) {
        int unitSizeToPixels;
        unitSizeToPixels = this.h0.a.unitSizeToPixels(ga5Var.getBase().a);
        RobotoTextView robotoTextView = this.d0;
        pry0 pry0Var = new pry0(new jy4(this, (unitSizeToPixels - robotoTextView.getPaddingLeft()) - robotoTextView.getPaddingRight(), 1));
        Z(new BaseShortcutViewHolder$setFormattedTextToView$2(robotoTextView, ga5Var.getBase().g, new j24(10, pry0Var), this, null), Integer.valueOf(robotoTextView.getId()), true);
    }

    public abstract nl4 p0(ga5 ga5Var);

    public final void q0() {
        String str = this.k0;
        if (str == null || str.length() == 0) {
            return;
        }
        a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, this.i0, str, null, null, 0, null, new mw2(20, this, str), null, 956));
    }

    public final void r0(ga5 ga5Var) {
        nl4 p0 = p0(ga5Var);
        ViewGroup viewGroup = this.j0;
        if (p0 != null) {
            String str = p0.d;
            if (str.length() > 0) {
                viewGroup.setBackgroundTintList(ColorStateList.valueOf(s8o.m(p0.c, viewGroup.getContext())));
                if (jl40.l(this.k0, str)) {
                    return;
                }
                this.k0 = str;
                if (viewGroup.getVisibility() != 0) {
                    q0();
                    return;
                } else {
                    cma1.b(0.0f, viewGroup).withEndAction(new js4(5, this));
                    return;
                }
            }
        }
        cma1.L(viewGroup);
        this.k0 = null;
    }
}
