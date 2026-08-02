package com.yandex.go.shortcuts.impl.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.c1f;
import defpackage.ga5;
import defpackage.hg;
import defpackage.il4;
import defpackage.j1s0;
import defpackage.kyh0;
import defpackage.lgp;
import defpackage.mqv0;
import defpackage.mug0;
import defpackage.n170;
import defpackage.nl4;
import defpackage.ny61;
import defpackage.rp31;
import defpackage.t4s0;
import defpackage.u7h0;
import defpackage.vfm;
import defpackage.w3s0;
import defpackage.w511;
import defpackage.xfm;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public final class f extends b {
    public static final ArrayList m0;
    public final ImageView l0;

    static {
        int i = 3;
        m0 = kotlin.collections.a.o0(kotlin.collections.a.o0(kotlin.collections.a.o0(c.g0, new lgp(DriveShortcutViewHolder$Companion$PAYLOAD_TYPES$1.b, DriveShortcutViewHolder$Companion$PAYLOAD_TYPES$2.b, i)), new lgp(DriveShortcutViewHolder$Companion$PAYLOAD_TYPES$3.b, DriveShortcutViewHolder$Companion$PAYLOAD_TYPES$4.b, i)), new lgp(DriveShortcutViewHolder$Companion$PAYLOAD_TYPES$5.b, DriveShortcutViewHolder$Companion$PAYLOAD_TYPES$6.b, i));
    }

    public f(c1f c1fVar, n170 n170Var, j1s0 j1s0Var, w3s0 w3s0Var, t4s0 t4s0Var, mqv0 mqv0Var, View view, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.widget.c cVar) {
        super(w3s0Var, t4s0Var, c1fVar, n170Var, aVar, cVar, view, j1s0Var);
        int d;
        int i = u7h0.shortcut_icon;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ImageView imageView = (ImageView) ((View) rp31.d(view, i));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = xfm.a[mqv0Var.c().ordinal()];
        if (i2 == 1) {
            d = ru.yandex.taxi.design.utils.c.d(mug0.shortcut_tariff_icon_margin_bottom_default, view);
        } else {
            if (i2 != 2) {
                w511.b();
                throw null;
            }
            d = ru.yandex.taxi.design.utils.c.d(mug0.shortcut_tariff_icon_margin_bottom_high, view);
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, d);
        imageView.setLayoutParams(marginLayoutParams);
        this.l0 = imageView;
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.wys
    public final void c(Object obj) {
        vfm vfmVar = (vfm) obj;
        super.c(vfmVar);
        s0(vfmVar);
        View view = this.a;
        hg.a(view);
        this.l0.setContentDescription(ru.yandex.taxi.design.utils.c.G(kyh0.drive, view));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.b, com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: d0 */
    public final void c(ga5 ga5Var) {
        vfm vfmVar = (vfm) ga5Var;
        super.c(vfmVar);
        s0(vfmVar);
        View view = this.a;
        hg.a(view);
        this.l0.setContentDescription(ru.yandex.taxi.design.utils.c.G(kyh0.drive, view));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.b
    public final nl4 p0(ga5 ga5Var) {
        return ((vfm) ga5Var).v();
    }

    public final void s0(vfm vfmVar) {
        String str;
        il4 il4Var = vfmVar.e;
        if (il4Var == null || (str = il4Var.c) == null) {
            return;
        }
        if (str.length() <= 0) {
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, this.l0, str2, null, null, 0, null, null, null, 1020));
        }
    }
}
