package com.yandex.go.shortcuts.impl.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import defpackage.d1q0;
import defpackage.j1s0;
import defpackage.kx31;
import defpackage.mug0;
import defpackage.rp31;
import defpackage.s5o;
import defpackage.t4s0;
import defpackage.u7h0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class q extends kx31 {
    public static final List V = Collections.singletonList(new s5o(SectionHeaderViewHolder$Companion$PAYLOAD_TYPES$1.b));
    public final ru.yandex.taxi.widget.c T;
    public final ListItemComponent U;

    public q(ru.yandex.taxi.widget.c cVar, t4s0 t4s0Var, View view, j1s0 j1s0Var) {
        super(view, t4s0Var);
        this.T = cVar;
        int i = u7h0.shortcuts_section_header;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(view, i));
        this.U = listItemComponent;
        listItemComponent.setTitleTextSizePx(j1s0Var.a(20));
        androidx.core.view.b.q(listItemComponent, true);
    }

    public static final void d0(q qVar, CharSequence charSequence) {
        ListItemComponent listItemComponent = qVar.U;
        listItemComponent.setTitle(charSequence);
        if (qVar.E() == 0) {
            ViewGroup.LayoutParams layoutParams = listItemComponent.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, -listItemComponent.getContext().getResources().getDimensionPixelSize(mug0.shortcuts_section_title_vertical_padding), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                listItemComponent.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // defpackage.kx31, defpackage.wys
    public final void Y() {
        super.Y();
        this.U.setTitle((CharSequence) null);
    }

    @Override // defpackage.wys
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final void c(d1q0 d1q0Var) {
        c0(d1q0Var);
        boolean d = d1q0Var.b.d();
        ListItemComponent listItemComponent = this.U;
        if (d) {
            Z(new SectionHeaderViewHolder$bind$1(this, d1q0Var, null), zy11.a, true);
        } else {
            listItemComponent.setTitle((CharSequence) null);
        }
        listItemComponent.disableAutoFitTitle();
    }
}
