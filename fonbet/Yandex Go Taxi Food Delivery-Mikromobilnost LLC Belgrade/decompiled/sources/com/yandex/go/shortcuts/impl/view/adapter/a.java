package com.yandex.go.shortcuts.impl.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.bv;
import defpackage.c1f;
import defpackage.dl4;
import defpackage.ga5;
import defpackage.gv;
import defpackage.ha5;
import defpackage.il4;
import defpackage.j0;
import defpackage.j1s0;
import defpackage.lgp;
import defpackage.mqv0;
import defpackage.mug0;
import defpackage.n170;
import defpackage.nl4;
import defpackage.ny61;
import defpackage.rp31;
import defpackage.t4s0;
import defpackage.tje;
import defpackage.u7h0;
import defpackage.w3s0;
import defpackage.w511;
import defpackage.x1s0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class a extends b {
    public static final ArrayList o0;
    public final x1s0 l0;
    public final ImageView m0;
    public final ImageView n0;

    static {
        int i = 3;
        o0 = kotlin.collections.a.o0(kotlin.collections.a.o0(kotlin.collections.a.o0(kotlin.collections.a.o0(c.g0, new lgp(ActionDrivenViewHolder$Companion$PAYLOAD_TYPES$1.b, ActionDrivenViewHolder$Companion$PAYLOAD_TYPES$2.b, i)), new lgp(ActionDrivenViewHolder$Companion$PAYLOAD_TYPES$3.b, ActionDrivenViewHolder$Companion$PAYLOAD_TYPES$4.b, i)), new lgp(ActionDrivenViewHolder$Companion$PAYLOAD_TYPES$5.b, ActionDrivenViewHolder$Companion$PAYLOAD_TYPES$6.b, i)), new lgp(ActionDrivenViewHolder$Companion$PAYLOAD_TYPES$7.b, ActionDrivenViewHolder$Companion$PAYLOAD_TYPES$8.b, i));
    }

    public a(w3s0 w3s0Var, t4s0 t4s0Var, c1f c1fVar, n170 n170Var, ru.yandex.taxi.widget.c cVar, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, View view, j1s0 j1s0Var, mqv0 mqv0Var, x1s0 x1s0Var) {
        super(w3s0Var, t4s0Var, c1fVar, n170Var, aVar, cVar, view, j1s0Var);
        int r;
        this.l0 = x1s0Var;
        int i = u7h0.shortcut_icon;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ImageView imageView = (ImageView) ((View) rp31.d(view, i));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = gv.a[mqv0Var.c().ordinal()];
        if (i2 == 1) {
            r = tje.r(mug0.shortcut_tariff_icon_margin_bottom_default, imageView.getContext());
        } else {
            if (i2 != 2) {
                w511.b();
                throw null;
            }
            r = tje.r(mug0.shortcut_tariff_icon_margin_bottom_high, imageView.getContext());
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, r);
        imageView.setLayoutParams(marginLayoutParams);
        this.m0 = imageView;
        this.n0 = (ImageView) ((View) rp31.d(view, u7h0.bottom_right));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.wys
    public final void c(Object obj) {
        bv bvVar = (bv) obj;
        super.c(bvVar);
        t0(bvVar);
        s0(bvVar);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.b, com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: d0 */
    public final void c(ga5 ga5Var) {
        bv bvVar = (bv) ga5Var;
        super.c(bvVar);
        t0(bvVar);
        s0(bvVar);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final void l0(ha5 ha5Var) {
        this.a.setContentDescription(((Object) ha5Var.a) + Extension.FIX_SPACE + ((Object) ha5Var.b));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.b
    public final nl4 p0(ga5 ga5Var) {
        return ((bv) ga5Var).v();
    }

    public final void s0(bv bvVar) {
        Integer num;
        dl4 dl4Var = bvVar.g;
        a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, this.n0, dl4Var != null ? dl4Var.c : null, null, null, (dl4Var == null || (num = dl4Var.d) == null) ? 0 : num.intValue(), null, null, null, 1004));
    }

    public final void t0(bv bvVar) {
        String str;
        il4 il4Var = bvVar.f;
        if (il4Var == null || (str = il4Var.c) == null) {
            return;
        }
        if (str.length() <= 0) {
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, this.m0, str2, null, null, 0, null, new j0(4, this, bvVar), null, 956));
        }
    }
}
