package com.yandex.go.shortcuts.impl.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.c1f;
import defpackage.ga5;
import defpackage.ha5;
import defpackage.j1s0;
import defpackage.jay0;
import defpackage.lgp;
import defpackage.mqv0;
import defpackage.mug0;
import defpackage.n170;
import defpackage.nac;
import defpackage.nl4;
import defpackage.ny61;
import defpackage.qux0;
import defpackage.rp31;
import defpackage.t4s0;
import defpackage.u7h0;
import defpackage.w3s0;
import defpackage.w511;
import defpackage.y3h0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class v extends b {
    public static final ArrayList m0;
    public final ImageView l0;

    static {
        int i = 3;
        m0 = kotlin.collections.a.o0(kotlin.collections.a.o0(kotlin.collections.a.o0(kotlin.collections.a.o0(kotlin.collections.a.o0(c.g0, new lgp(TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$1.b, TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$2.b, i)), new lgp(TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$3.b, TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$4.b, i)), new lgp(TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$5.b, TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$6.b, i)), new lgp(TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$7.b, TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$8.b, i)), new lgp(TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$9.b, TaxiShortcutViewHolder$Companion$PAYLOAD_TYPES$10.b, i));
    }

    public v(c1f c1fVar, n170 n170Var, j1s0 j1s0Var, w3s0 w3s0Var, t4s0 t4s0Var, mqv0 mqv0Var, View view, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.widget.c cVar) {
        super(w3s0Var, t4s0Var, c1fVar, n170Var, aVar, cVar, view, j1s0Var);
        int d;
        int i = u7h0.shortcut_tariff;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ImageView imageView = (ImageView) ((View) rp31.d(view, i));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = jay0.a[mqv0Var.c().ordinal()];
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
        qux0 qux0Var = (qux0) obj;
        super.c(qux0Var);
        s0(qux0Var);
        this.l0.setContentDescription(qux0Var.e);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.b, com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: d0 */
    public final void c(ga5 ga5Var) {
        qux0 qux0Var = (qux0) ga5Var;
        super.c(qux0Var);
        s0(qux0Var);
        this.l0.setContentDescription(qux0Var.e);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final void l0(ha5 ha5Var) {
        this.a.setContentDescription(((Object) ha5Var.a) + Extension.FIX_SPACE + ((Object) ha5Var.b));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.b
    public final nl4 p0(ga5 ga5Var) {
        return ((qux0) ga5Var).w();
    }

    public final void s0(qux0 qux0Var) {
        int i = qux0Var.c ? 0 : 8;
        ImageView imageView = this.l0;
        imageView.setVisibility(i);
        if (qux0Var.c) {
            String str = qux0Var.d;
            nac nacVar = (nac) this.Z.b.a(imageView);
            nacVar.e(y3h0.tariff_icon);
            a0(nacVar.c(str));
        }
    }
}
