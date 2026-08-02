package com.yandex.go.shortcuts.impl.view.adapter;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.go.shortcuts.dto.response.TextStyleDto;
import com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButton;
import defpackage.ays;
import defpackage.bl4;
import defpackage.bns;
import defpackage.da5;
import defpackage.ea5;
import defpackage.ekh0;
import defpackage.j1s0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.lgp;
import defpackage.lhc;
import defpackage.lsy;
import defpackage.mg;
import defpackage.mqu;
import defpackage.mrg0;
import defpackage.msy;
import defpackage.pdc;
import defpackage.qje;
import defpackage.r7v;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sl4;
import defpackage.t4s0;
import defpackage.tje;
import defpackage.tl4;
import defpackage.u7h0;
import defpackage.ufu;
import defpackage.umw0;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.AnimatedRoundedCornersImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class h extends d implements umw0 {
    public static final List g0;
    public final com.yandex.go.shortcuts.impl.ui.shortcutview.a Z;
    public final ays a0;
    public final pdc b0;
    public lsy c0;
    public final ListItemComponent d0;
    public final AnimatedRoundedCornersImageView e0;
    public final ArrayList f0;

    static {
        int i = 3;
        g0 = scc.g(new lgp(ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$1.b, ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$2.b, i), new lgp(ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$3.b, ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$4.b, i), new lgp(ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$5.b, ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$6.b, i), new lgp(ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$7.b, ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$8.b, i), new lgp(ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$9.b, ListItemShortcutViewHolder$Companion$PAYLOAD_TYPES$10.b, i));
    }

    public h(View view, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, t4s0 t4s0Var, ru.yandex.taxi.widget.c cVar, j1s0 j1s0Var, ays aysVar, pdc pdcVar) {
        super(cVar, t4s0Var, view);
        this.Z = aVar;
        this.a0 = aysVar;
        this.b0 = pdcVar;
        int i = u7h0.list_item;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(view, i));
        this.d0 = listItemComponent;
        this.e0 = (AnimatedRoundedCornersImageView) ((View) rp31.d(view, u7h0.shortcut_background));
        this.f0 = new ArrayList();
        mg mgVar = new mg(17, this);
        int a = j1s0Var.a(16);
        int a2 = j1s0Var.a(14);
        listItemComponent.setSubtitleTextSizePx(a2);
        listItemComponent.setTitleTextSizePx(a);
        listItemComponent.setTrailTextSize(a2);
        View inflate = LayoutInflater.from(listItemComponent.getContext()).inflate(ekh0.list_item_lead_view, (ViewGroup) listItemComponent, false);
        listItemComponent.setLeadIconHolderSize(ru.yandex.taxi.design.utils.c.d(mrg0.component_image_holder_size, view), tje.r(mrg0.component_image_holder_custom_width, view.getContext()));
        listItemComponent.setLeadView(inflate);
        listItemComponent.setUseAutoAccessibilityDelegate(false);
        androidx.core.view.b.p(listItemComponent, null);
        listItemComponent.setTitleTypeface(0);
        listItemComponent.setTitleTextColor(qje.t(xng0.textMain, listItemComponent.getContext()));
        listItemComponent.setSubtitleTextColor(qje.t(xng0.textMinor, listItemComponent.getContext()));
        androidx.core.view.b.p(listItemComponent, mgVar);
    }

    public static void i0(RobotoTextView robotoTextView, tl4 tl4Var) {
        robotoTextView.setTextColor(tl4Var.c.b);
        bl4 bl4Var = tl4Var.c;
        robotoTextView.setBackgroundColor(lhc.f(s8o.m(bl4Var.c, robotoTextView.getContext()), Math.abs((int) (255.0f * bl4Var.d)) & 255));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.kx31, defpackage.wys
    public final void Y() {
        super.Y();
        this.c0 = null;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        lsy lsyVar = this.c0;
        if (lsyVar != null) {
            h0(lsyVar);
            ArrayList arrayList = this.f0;
            int size = arrayList.size();
            ArrayList arrayList2 = lsyVar.l;
            if (size != arrayList2.size()) {
                m0(lsyVar);
                return;
            }
            int f = scc.f(arrayList2);
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                i0((RobotoTextView) arrayList.get(i), (tl4) arrayList2.get(f - i));
            }
        }
    }

    public final void h0(lsy lsyVar) {
        kdc kdcVar = lsyVar.b.i.d;
        ListItemComponent listItemComponent = this.d0;
        listItemComponent.setTitleTextColor(kdcVar);
        ea5 ea5Var = lsyVar.b;
        listItemComponent.setSubtitleTextColor(ea5Var.i.d);
        listItemComponent.setRoundedBackground(s8o.m(ea5Var.c.g, listItemComponent.getContext()));
        ViewGroup viewGroup = (ViewGroup) listItemComponent.getLeadViewAs(ViewGroup.class);
        if (viewGroup != null) {
            int i = u7h0.lead_background;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            k0((ImageView) ((View) rp31.d(viewGroup, i)), lsyVar);
        }
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final void c(lsy lsyVar) {
        this.c0 = lsyVar;
        super.c(lsyVar);
        ea5 ea5Var = lsyVar.b;
        TextStyleDto.HorizontalAlignment horizontalAlignment = ea5Var.i.b;
        int ordinal = horizontalAlignment.ordinal();
        ListItemComponent listItemComponent = this.d0;
        listItemComponent.setTitleAlignment(ordinal);
        listItemComponent.setSubtitleAlignment(horizontalAlignment.ordinal());
        kdc kdcVar = ea5Var.i.d;
        listItemComponent.setTitleTextColor(kdcVar);
        listItemComponent.setSubtitleTextColor(kdcVar);
        listItemComponent.setTitleSingleLine(true);
        listItemComponent.setSubtitleSingleLine(true);
        listItemComponent.setTitleEllipsizeMode(2);
        listItemComponent.setSubTitleEllipsizeMode(2);
        b0(new ListItemShortcutViewHolder$loadTitleAndSubtitle$1(ea5Var.g, this, ea5Var.h, new bns(18, listItemComponent), null));
        l0(lsyVar);
        m0(lsyVar);
        if (lsyVar.g) {
            listItemComponent.setDividers(DividerPosition.NONE, DividerType.ICON);
        } else {
            listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON);
        }
        listItemComponent.setVisibility(0);
        this.e0.setVisibility(4);
        listItemComponent.setPadding(0, 0, 0, 0);
        h0(lsyVar);
        ViewGroup viewGroup = (ViewGroup) listItemComponent.getLeadViewAs(ViewGroup.class);
        if (viewGroup != null) {
            int i = u7h0.lead_background;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ImageView imageView = (ImageView) ((View) rp31.d(viewGroup, i));
            imageView.setVisibility(lsyVar.d.length() <= 0 ? 8 : 0);
            a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.b(this.Z, imageView, lsyVar.d, new mqu(21, imageView, this), null, 36));
            k0(imageView, lsyVar);
        }
    }

    public final void k0(ImageView imageView, lsy lsyVar) {
        kdc b = ((ufu) this.b0).b(lsyVar.e);
        Integer valueOf = b != null ? Integer.valueOf(s8o.m(b, this.a.getContext())) : null;
        imageView.setBackgroundTintList(valueOf != null ? ColorStateList.valueOf(valueOf.intValue()) : null);
    }

    public final void l0(lsy lsyVar) {
        this.c0 = lsyVar;
        NestedButton nestedButton = lsyVar.j;
        ListItemComponent listItemComponent = this.d0;
        View view = this.a;
        if (nestedButton != null) {
            if (nestedButton.e) {
                listItemComponent.hideTrailDivider();
            } else {
                listItemComponent.showTrailDivider();
            }
            if (nestedButton.c.length() > 0) {
                listItemComponent.setTrailContentDescription(nestedButton.b);
                a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, listItemComponent.getTrailImageView(), nestedButton.c, null, null, 0, null, null, null, 1020));
                listItemComponent.setTrailIconHolderSize(ru.yandex.taxi.design.utils.c.d(mrg0.component_image_holder_size, view), tje.r(mrg0.component_image_holder_custom_width, view.getContext()));
                listItemComponent.setTrailImageStartEndPadding((int) tje.w(8, view.getContext()), 0, (int) tje.w(4, view.getContext()), 0);
            }
            listItemComponent.setTrailContainerClickListener(new r7v(20, this, nestedButton));
            return;
        }
        sl4 sl4Var = lsyVar.k;
        if (sl4Var == null) {
            listItemComponent.setTrailCompanionTextPaddingEnd((int) ru.yandex.taxi.design.utils.c.j(4, view));
            listItemComponent.setTrailCompanionTextPaddingStart((int) tje.w(8, view.getContext()));
            listItemComponent.setTrailCompanionText(lsyVar.f);
            listItemComponent.setTrailContainerClickListener(null);
            return;
        }
        listItemComponent.setTrailContentDescription("");
        a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, listItemComponent.getTrailImageView(), sl4Var.c, null, null, 0, null, null, null, 1020));
        listItemComponent.setTrailIconHolderSize(ru.yandex.taxi.design.utils.c.d(mrg0.component_image_holder_size, view), tje.r(mrg0.component_image_holder_custom_width, view.getContext()));
        listItemComponent.setTrailImageStartEndPadding((int) tje.w(8, view.getContext()), 0, (int) tje.w(4, view.getContext()), 0);
        listItemComponent.setTrailContainerClickListener(null);
    }

    public final void m0(lsy lsyVar) {
        this.c0 = lsyVar;
        ListItemComponent listItemComponent = this.d0;
        listItemComponent.setTrailContentDescription("");
        ArrayList arrayList = this.f0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            listItemComponent.trailFrame.removeView((RobotoTextView) it.next());
        }
        arrayList.clear();
        for (tl4 tl4Var : kotlin.collections.a.q0(lsyVar.l)) {
            RobotoTextView robotoTextView = new RobotoTextView(this.a.getContext(), null, 0, 6, null);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMarginStart(tje.u(4, robotoTextView.getContext()));
            robotoTextView.setLayoutParams(marginLayoutParams);
            int u = tje.u(6, robotoTextView.getContext());
            robotoTextView.setPadding(u, tje.u(1, robotoTextView.getContext()), u, tje.u(2, robotoTextView.getContext()));
            robotoTextView.setTextTypeface(3);
            robotoTextView.setTextSize(tje.s(mrg0.component_text_size_caption, robotoTextView.getContext()));
            bl4 bl4Var = tl4Var.c;
            String str = bl4Var.a;
            FormattedText formattedText = bl4Var.f;
            da5 da5Var = new da5(str, formattedText);
            msy msyVar = new msy(0, robotoTextView);
            msyVar.invoke(str);
            if (jl40.l(formattedText, FormattedText.c)) {
                msyVar.invoke(str);
            } else {
                b0(new ListItemShortcutViewHolder$convertText$1(this, da5Var, msyVar, null));
            }
            i0(robotoTextView, tl4Var);
            robotoTextView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(100, robotoTextView.getContext())));
            robotoTextView.setClipToOutline(true);
            listItemComponent.trailFrame.addView(robotoTextView, 0);
            arrayList.add(robotoTextView);
        }
    }
}
