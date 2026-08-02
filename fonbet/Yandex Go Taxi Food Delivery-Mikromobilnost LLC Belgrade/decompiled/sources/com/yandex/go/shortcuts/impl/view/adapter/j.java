package com.yandex.go.shortcuts.impl.view.adapter;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.BatteryChargeViewV2;
import com.yandex.go.design.view.GoImageView;
import defpackage.ak80;
import defpackage.bl4;
import defpackage.c1f;
import defpackage.cl4;
import defpackage.dl4;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fl4;
import defpackage.ga5;
import defpackage.gl4;
import defpackage.hl4;
import defpackage.ix00;
import defpackage.j1s0;
import defpackage.lgp;
import defpackage.mrg0;
import defpackage.msy;
import defpackage.n170;
import defpackage.op70;
import defpackage.pp8;
import defpackage.rl4;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.sf5;
import defpackage.t4s0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u7h0;
import defpackage.w5b0;
import defpackage.ww90;
import defpackage.xl4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class j extends c {
    public static final ArrayList q0;
    public w5b0 h0;
    public final ConstraintLayout i0;
    public final Flow j0;
    public final GoImageView k0;
    public final GoImageView l0;
    public final ButtonComponent m0;
    public final GoImageView n0;
    public final BadgeView o0;
    public final ArrayList p0;

    static {
        int i = 3;
        q0 = kotlin.collections.a.o0(kotlin.collections.a.o0(kotlin.collections.a.o0(kotlin.collections.a.o0(c.g0, new lgp(PersonalShortcutViewHolder$Companion$PAYLOAD_TYPES$1.b, PersonalShortcutViewHolder$Companion$PAYLOAD_TYPES$2.b, i)), new lgp(PersonalShortcutViewHolder$Companion$PAYLOAD_TYPES$3.b, PersonalShortcutViewHolder$Companion$PAYLOAD_TYPES$4.b, i)), new lgp(PersonalShortcutViewHolder$Companion$PAYLOAD_TYPES$5.b, PersonalShortcutViewHolder$Companion$PAYLOAD_TYPES$6.b, i)), new lgp(PersonalShortcutViewHolder$Companion$PAYLOAD_TYPES$7.b, PersonalShortcutViewHolder$Companion$PAYLOAD_TYPES$8.b, i));
    }

    public j(c1f c1fVar, n170 n170Var, j1s0 j1s0Var, t4s0 t4s0Var, View view, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.widget.c cVar) {
        super(c1fVar, n170Var, j1s0Var, t4s0Var, view, aVar, cVar);
        int i = u7h0.content_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.i0 = (ConstraintLayout) ((View) rp31.d(view, i));
        this.j0 = (Flow) ((View) rp31.d(view, u7h0.bottom_left_flow_container));
        this.k0 = (GoImageView) ((View) rp31.d(view, u7h0.bottom_right));
        this.l0 = (GoImageView) ((View) rp31.d(view, u7h0.top_right));
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(view, u7h0.button));
        this.m0 = buttonComponent;
        this.n0 = (GoImageView) ((View) rp31.d(view, u7h0.button_image_overlay));
        this.o0 = (BadgeView) ((View) rp31.d(view, u7h0.button_badge_overlay));
        this.p0 = new ArrayList();
        buttonComponent.setOnClickListener(new op70(27, this));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.kx31, defpackage.wys
    public final void Y() {
        super.Y();
        this.h0 = null;
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        w5b0 w5b0Var = this.h0;
        if (w5b0Var != null) {
            q0(w5b0Var);
            s0(w5b0Var);
        }
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.wys
    public final void c(Object obj) {
        w5b0 w5b0Var = (w5b0) obj;
        this.h0 = w5b0Var;
        boolean z = w5b0Var.d instanceof pp8;
        e0(w5b0Var, z);
        if (z) {
            return;
        }
        super.c(w5b0Var);
        q0(w5b0Var);
        r0(w5b0Var);
        t0(w5b0Var);
        s0(w5b0Var);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: d0 */
    public final void c(ga5 ga5Var) {
        w5b0 w5b0Var = (w5b0) ga5Var;
        this.h0 = w5b0Var;
        boolean z = w5b0Var.d instanceof pp8;
        e0(w5b0Var, z);
        if (z) {
            return;
        }
        super.c(w5b0Var);
        q0(w5b0Var);
        r0(w5b0Var);
        t0(w5b0Var);
        s0(w5b0Var);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d
    public final void e0(ga5 ga5Var, boolean z) {
        w5b0 w5b0Var = (w5b0) ga5Var;
        super.e0(w5b0Var, z);
        this.a.setClickable(!z);
        int i = 4;
        this.j0.setVisibility((z || w5b0Var.g.isEmpty()) ? 4 : 0);
        this.k0.setVisibility((z || w5b0Var.h == null) ? 4 : 0);
        this.l0.setVisibility((z || w5b0Var.i == null) ? 4 : 0);
        this.m0.setVisibility((z || w5b0Var.j == null) ? 4 : 0);
        this.n0.setVisibility((z || w5b0Var.j == null) ? 4 : 0);
        if (!z && w5b0Var.j != null) {
            i = 0;
        }
        this.o0.setVisibility(i);
    }

    public final void p0(FormattedText formattedText, String str, tls tlsVar) {
        if (formattedText.a.isEmpty()) {
            tlsVar.invoke(str);
        } else {
            b0(new PersonalShortcutViewHolder$convertText$1(tlsVar, this, formattedText, str, null));
        }
    }

    public final void q0(w5b0 w5b0Var) {
        Flow flow;
        ConstraintLayout constraintLayout;
        RobotoTextView robotoTextView;
        this.h0 = w5b0Var;
        ArrayList arrayList = this.p0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            flow = this.j0;
            constraintLayout = this.i0;
            if (!hasNext) {
                break;
            }
            View view = (View) it.next();
            constraintLayout.removeView(view);
            flow.removeView(view);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = w5b0Var.g.iterator();
        while (it2.hasNext()) {
            xl4 xl4Var = (xl4) it2.next();
            boolean z = xl4Var instanceof fl4;
            View view2 = this.a;
            if (z) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof RobotoTextView) {
                        arrayList3.add(next);
                    }
                }
                robotoTextView = (RobotoTextView) kotlin.collections.a.R(arrayList3);
                if (robotoTextView != null) {
                    arrayList.remove(robotoTextView);
                } else {
                    RobotoTextView robotoTextView2 = new RobotoTextView(view2.getContext(), null, 0, 6, null);
                    robotoTextView2.setId(View.generateViewId());
                    robotoTextView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    robotoTextView2.setIncludeFontPadding(false);
                    robotoTextView = robotoTextView2;
                }
                bl4 bl4Var = ((fl4) xl4Var).c;
                int r = tje.r(mrg0.go_design_s_space, robotoTextView.getContext());
                robotoTextView.setPadding(r, tje.u(2, robotoTextView.getContext()), r, tje.u(3, robotoTextView.getContext()));
                robotoTextView.setTextTypeface(3);
                robotoTextView.setTextSize(tje.s(mrg0.component_text_size_caption, robotoTextView.getContext()));
                p0(bl4Var.f, bl4Var.a, new msy(3, robotoTextView));
                robotoTextView.setTextColor(bl4Var.b);
                robotoTextView.setBackgroundColor(s8o.m(bl4Var.c, robotoTextView.getContext()));
                robotoTextView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(100, robotoTextView.getContext())));
                robotoTextView.setClipToOutline(true);
            } else if (xl4Var instanceof cl4) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (next2 instanceof BatteryChargeViewV2) {
                        arrayList4.add(next2);
                    }
                }
                robotoTextView = (BatteryChargeViewV2) kotlin.collections.a.R(arrayList4);
                if (robotoTextView != null) {
                    arrayList.remove(robotoTextView);
                } else {
                    BatteryChargeViewV2 batteryChargeViewV2 = new BatteryChargeViewV2(view2.getContext(), null, 0, 6, null);
                    batteryChargeViewV2.setId(View.generateViewId());
                    batteryChargeViewV2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    float r2 = tje.r(mrg0.component_text_size_caption_secondary, batteryChargeViewV2.getContext());
                    batteryChargeViewV2.updateTextSize(r2, r2);
                    batteryChargeViewV2.setMask(f1h0.ic_battery_v2_mask_mini);
                    batteryChargeViewV2.setAppearanceOption(new sf5(true, false, false));
                    robotoTextView = batteryChargeViewV2;
                }
                cl4 cl4Var = (cl4) xl4Var;
                bl4 bl4Var2 = cl4Var.c;
                p0(bl4Var2.f, bl4Var2.a, new ww90(9, robotoTextView, cl4Var));
            } else {
                robotoTextView = null;
            }
            if (robotoTextView != null) {
                arrayList2.add(robotoTextView);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            View view3 = (View) it5.next();
            constraintLayout.addView(view3);
            flow.addView(view3);
        }
    }

    public final void r0(w5b0 w5b0Var) {
        this.h0 = w5b0Var;
        dl4 dl4Var = w5b0Var.h;
        GoImageView goImageView = this.k0;
        if (dl4Var == null) {
            goImageView.setVisibility(4);
            return;
        }
        goImageView.setVisibility(0);
        String str = dl4Var.c;
        Integer num = dl4Var.d;
        a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, this.k0, str, null, null, num != null ? num.intValue() : 0, null, null, null, 748));
    }

    public final void s0(w5b0 w5b0Var) {
        this.h0 = w5b0Var;
        gl4 gl4Var = w5b0Var.j;
        hl4 hl4Var = w5b0Var.k;
        GoImageView goImageView = this.n0;
        ButtonComponent buttonComponent = this.m0;
        BadgeView badgeView = this.o0;
        if (gl4Var == null) {
            buttonComponent.setVisibility(4);
            goImageView.setVisibility(4);
            badgeView.setVisibility(4);
            return;
        }
        bl4 bl4Var = gl4Var.c;
        String str = gl4Var.d;
        boolean z = str != null && (evu0.J(str) ^ true);
        int i = 8;
        goImageView.setVisibility(z ? 0 : 8);
        if (hl4Var != null && !z) {
            i = 0;
        }
        badgeView.setVisibility(i);
        buttonComponent.setVisibility(0);
        p0(bl4Var.f, bl4Var.a, new ix00(buttonComponent, 1));
        buttonComponent.setButtonTitleColor(bl4Var.b);
        buttonComponent.setButtonBackground(bl4Var.c);
        if (hl4Var != null) {
            badgeView.setBackgroundTintList(ColorStateList.valueOf(s8o.m(hl4Var.c, badgeView.getContext())));
            b0(new PersonalShortcutViewHolder$setupButtonBadgeOverlay$1(this, hl4Var, null));
        }
        if (str != null) {
            a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.b(this.Z, this.n0, str, new ak80(29, this), null, 36));
        }
    }

    public final void t0(w5b0 w5b0Var) {
        this.h0 = w5b0Var;
        rl4 rl4Var = w5b0Var.i;
        GoImageView goImageView = this.l0;
        if (rl4Var == null) {
            goImageView.setVisibility(4);
            return;
        }
        goImageView.setVisibility(0);
        a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, this.l0, rl4Var.c, null, null, 0, null, null, null, 748));
    }
}
