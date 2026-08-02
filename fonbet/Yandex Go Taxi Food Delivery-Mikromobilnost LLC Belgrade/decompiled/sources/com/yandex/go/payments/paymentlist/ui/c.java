package com.yandex.go.payments.paymentlist.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import defpackage.a6a0;
import defpackage.c6a0;
import defpackage.cf70;
import defpackage.dzg0;
import defpackage.e5k;
import defpackage.egh;
import defpackage.f1h0;
import defpackage.g1a0;
import defpackage.hba0;
import defpackage.j4a0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.l2z;
import defpackage.l6a0;
import defpackage.mfb;
import defpackage.mrg0;
import defpackage.op70;
import defpackage.pav;
import defpackage.pwf0;
import defpackage.s8o;
import defpackage.t5a0;
import defpackage.tje;
import defpackage.u6d0;
import defpackage.utg0;
import defpackage.w511;
import defpackage.wys;
import defpackage.xca0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y2h0;
import defpackage.yca0;
import defpackage.z0a0;
import defpackage.zca0;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes8.dex */
public final class c extends wys {
    public static final /* synthetic */ int a0 = 0;
    public final ListItemWithBadgeComponent R;
    public final z0a0 S;
    public final pav T;
    public final mfb U;
    public final hba0 V;
    public l6a0 W;
    public boolean Z;

    public c(ListItemWithBadgeComponent listItemWithBadgeComponent, z0a0 z0a0Var, pav pavVar, mfb mfbVar, hba0 hba0Var) {
        super(listItemWithBadgeComponent);
        this.R = listItemWithBadgeComponent;
        this.S = z0a0Var;
        this.T = pavVar;
        this.U = mfbVar;
        this.V = hba0Var;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        l6a0 l6a0Var = this.W;
        if (l6a0Var != null) {
            pav pavVar = this.T;
            ListItemWithBadgeComponent listItemWithBadgeComponent = this.R;
            pavVar.c(listItemWithBadgeComponent.getLeadImageView());
            ((g1a0) this.S).b(listItemWithBadgeComponent.getLeadImageView(), l6a0Var.n());
            f0(l6a0Var, listItemWithBadgeComponent.getContext());
            listItemWithBadgeComponent.setSubtitleTextColor(l6a0Var.y().b);
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        Runnable runnable;
        l6a0 l6a0Var = (l6a0) obj;
        final int i = 0;
        boolean v = l6a0Var.v();
        View view = this.a;
        int d = v ? ru.yandex.taxi.design.utils.c.d(utg0.payment_methods_item_horizontal_padding, view) : ru.yandex.taxi.design.utils.c.h(0, view);
        ListItemWithBadgeComponent listItemWithBadgeComponent = this.R;
        listItemWithBadgeComponent.setPadding(d, 0, d, 0);
        listItemWithBadgeComponent.setTitleContentDescription(null);
        listItemWithBadgeComponent.setSubtitleContentDescription(null);
        boolean z = true;
        z = true;
        listItemWithBadgeComponent.setUseAutoAccessibilityDelegate(true);
        listItemWithBadgeComponent.setTrailContentDescription(null);
        listItemWithBadgeComponent.setTrailContainerClickListener(null);
        ImageView trailCompanionImageView = listItemWithBadgeComponent.getTrailCompanionImageView();
        if (trailCompanionImageView != null) {
            trailCompanionImageView.setContentDescription(null);
            ru.yandex.taxi.design.utils.c.B(trailCompanionImageView, pwf0.c);
        }
        androidx.core.view.b.p(listItemWithBadgeComponent, null);
        listItemWithBadgeComponent.setTrailCompanionMode(0);
        Context context = listItemWithBadgeComponent.getContext();
        listItemWithBadgeComponent.setTitle(l6a0Var.getTitle());
        cf70 y = l6a0Var.y();
        CharSequence charSequence = y.a;
        if (charSequence == null) {
            listItemWithBadgeComponent.hideSubtitle();
        } else {
            listItemWithBadgeComponent.setSubtitle(charSequence);
            listItemWithBadgeComponent.setSubtitleTextColor(y.b);
            listItemWithBadgeComponent.showSubtitle();
        }
        this.T.c(listItemWithBadgeComponent.getLeadImageView());
        ((g1a0) this.S).b(listItemWithBadgeComponent.getLeadImageView(), l6a0Var.n());
        if (l6a0Var.z()) {
            listItemWithBadgeComponent.startProgressAnimation();
            listItemWithBadgeComponent.setClickable(false);
            listItemWithBadgeComponent.setLongClickable(false);
        } else {
            listItemWithBadgeComponent.stopProgressAnimation();
            listItemWithBadgeComponent.setClickable(true);
        }
        PaymentOptionState x = l6a0Var.x();
        if (l6a0Var instanceof egh) {
            egh eghVar = (egh) l6a0Var;
            switch (zca0.a[x.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    final l2z c0 = c0(eghVar.j);
                    if (c0 != null) {
                        final int i2 = true ? 1 : 0;
                        runnable = new Runnable() { // from class: wca0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i2;
                                l2z l2zVar = c0;
                                switch (i3) {
                                    case 0:
                                        l2zVar.invoke();
                                        break;
                                    default:
                                        l2zVar.invoke();
                                        break;
                                }
                            }
                        };
                    } else {
                        runnable = null;
                    }
                    listItemWithBadgeComponent.setDebounceClickListener(runnable);
                    l2z c02 = c0(eghVar.l);
                    if (c02 != null) {
                        listItemWithBadgeComponent.setOnLongClickListener(new e5k(c02, 1));
                        break;
                    } else {
                        listItemWithBadgeComponent.setOnLongClickListener(null);
                        listItemWithBadgeComponent.setLongClickable(false);
                        break;
                    }
                case 4:
                case 5:
                    listItemWithBadgeComponent.setDebounceClickListener(null);
                    listItemWithBadgeComponent.setOnLongClickListener(null);
                    break;
                case 6:
                    listItemWithBadgeComponent.setOnClickListener(null);
                    listItemWithBadgeComponent.setOnLongClickListener(null);
                    listItemWithBadgeComponent.setLongClickable(false);
                    break;
                default:
                    w511.b();
                    return;
            }
        } else {
            if (!(l6a0Var instanceof u6d0)) {
                w511.b();
                return;
            }
            u6d0 u6d0Var = (u6d0) l6a0Var;
            int i3 = zca0.a[x.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                final l2z c03 = c0(u6d0Var.j);
                listItemWithBadgeComponent.setDebounceClickListener(c03 != null ? new Runnable() { // from class: wca0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i;
                        l2z l2zVar = c03;
                        switch (i32) {
                            case 0:
                                l2zVar.invoke();
                                break;
                            default:
                                l2zVar.invoke();
                                break;
                        }
                    }
                } : null);
            } else {
                listItemWithBadgeComponent.setOnClickListener(null);
                listItemWithBadgeComponent.setOnLongClickListener(null);
                listItemWithBadgeComponent.setLongClickable(false);
            }
        }
        f0(l6a0Var, context);
        listItemWithBadgeComponent.setDividers(DividerPosition.BOTTOM, l6a0Var.m());
        l6a0 l6a0Var2 = this.W;
        listItemWithBadgeComponent.setActivated(l6a0Var.x() == PaymentOptionState.SELECTED);
        listItemWithBadgeComponent.setDefaultMinHeight();
        if (!l6a0Var.w()) {
            u6d0 u6d0Var2 = l6a0Var instanceof u6d0 ? (u6d0) l6a0Var : null;
            if (u6d0Var2 == null || !u6d0Var2.p) {
                z = false;
            }
        }
        if (z) {
            listItemWithBadgeComponent.setContentAlpha(1.0f);
        } else if (l6a0Var.x() == PaymentOptionState.DELETABLE_WITH_EDIT_NAME) {
            listItemWithBadgeComponent.setContentAlpha(0.5f);
            listItemWithBadgeComponent.trailFrame.setAlpha(1.0f);
            listItemWithBadgeComponent.getTrailImageView().setAlpha(0.5f);
            ImageView trailCompanionImageView2 = listItemWithBadgeComponent.getTrailCompanionImageView();
            if (trailCompanionImageView2 != null) {
                trailCompanionImageView2.setContentDescription(listItemWithBadgeComponent.getContext().getString(kyh0.payment_methods_action_rename));
            }
        } else if (l6a0Var instanceof u6d0) {
            listItemWithBadgeComponent.setContentAlpha(1.0f);
            d0(l6a0Var);
        } else {
            listItemWithBadgeComponent.setContentAlpha(0.5f);
            d0(l6a0Var);
        }
        listItemWithBadgeComponent.setEnabled(z);
        if (l6a0Var instanceof u6d0) {
            u6d0 u6d0Var3 = (u6d0) l6a0Var;
            if (u6d0Var3.l == PlusOption$TrailMode.TOGGLE && (l6a0Var2 instanceof u6d0)) {
                u6d0 u6d0Var4 = (u6d0) l6a0Var2;
                if (jl40.l(u6d0Var4.k.a, u6d0Var3.k.a) && u6d0Var4.p != u6d0Var3.p && listItemWithBadgeComponent.isAccessibilityFocused()) {
                    listItemWithBadgeComponent.sendAccessibilityEvent(2048);
                }
            }
        }
        listItemWithBadgeComponent.setAnalyticsButtonName(SharedPaymentAnalytics$Button.SELECT_CARD.getAnalyticsName());
        this.W = l6a0Var;
        j4a0 c = l6a0Var.c();
        if (c == null) {
            if (listItemWithBadgeComponent.hasTitleBadge()) {
                listItemWithBadgeComponent.getTitleBadge().setText("");
                listItemWithBadgeComponent.getTitleBadge().setVisibility(8);
                return;
            }
            return;
        }
        BadgeView titleBadge = listItemWithBadgeComponent.getTitleBadge();
        titleBadge.setVisibility(0);
        titleBadge.setText(c.c());
        titleBadge.setTextColor(s8o.m(c.b(), listItemWithBadgeComponent.getContext()));
        titleBadge.setTintColor(s8o.m(c.a(), listItemWithBadgeComponent.getContext()));
        listItemWithBadgeComponent.setTitleBadgeWithBottomShadow(s8o.m(c.a(), listItemWithBadgeComponent.getContext()), tje.r(mrg0.go_design_m_space, titleBadge.getContext()), tje.u(4, titleBadge.getContext()));
        xw31.E(titleBadge, Integer.valueOf((int) tje.x(titleBadge.getContext(), 1.0f)), Integer.valueOf((int) tje.x(titleBadge.getContext(), 8.0f)), 0, 0);
        TextView subtitle = listItemWithBadgeComponent.subtitle();
        xw31.E(subtitle, 0, Integer.valueOf((int) ru.yandex.taxi.design.utils.c.i(-4.0f, subtitle)), 0, 0);
    }

    public final l2z c0(c6a0 c6a0Var) {
        if (c6a0Var instanceof t5a0) {
            return null;
        }
        return new l2z(12, this, c6a0Var);
    }

    public final void d0(l6a0 l6a0Var) {
        if (l6a0Var instanceof u6d0) {
            Z(new PaymentMethodsOptionItemViewHolder$removeAccessibilityDelegate$1(this, null), ((u6d0) l6a0Var).k.a, true);
        } else {
            androidx.core.view.b.p(this.R, new AccessibilityDelegateCompat());
        }
    }

    public final void e0(egh eghVar) {
        ListItemWithBadgeComponent listItemWithBadgeComponent = this.R;
        listItemWithBadgeComponent.setTrailImage(listItemWithBadgeComponent.getContext().getDrawable(dzg0.ic_trash));
        if (eghVar.d) {
            listItemWithBadgeComponent.getTrailImageView().setContentDescription(listItemWithBadgeComponent.getContext().getString(kyh0.payment_delete_card));
            ClickableImageView trailImageView = listItemWithBadgeComponent.getTrailImageView();
            l2z c0 = c0(eghVar.m);
            trailImageView.setDebounceClickListener(c0 != null ? new op70(23, c0) : null);
        }
    }

    public final void f0(l6a0 l6a0Var, Context context) {
        Context context2;
        ImageView trailCompanionImageView;
        ImageView trailCompanionImageView2;
        boolean z = l6a0Var instanceof egh;
        boolean z2 = false;
        ListItemWithBadgeComponent listItemWithBadgeComponent = this.R;
        if (!z) {
            if (!(l6a0Var instanceof u6d0)) {
                w511.b();
                return;
            }
            u6d0 u6d0Var = (u6d0) l6a0Var;
            PlusOption$TrailMode plusOption$TrailMode = u6d0Var.l;
            int i = plusOption$TrailMode == null ? -1 : zca0.b[plusOption$TrailMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                listItemWithBadgeComponent.setTrailMode(2);
                listItemWithBadgeComponent.setUseAutoAccessibilityDelegate(true);
                return;
            }
            SwitchComponent switchComponent = (SwitchComponent) listItemWithBadgeComponent.getTrailViewAs(SwitchComponent.class);
            if (switchComponent == null) {
                context2 = context;
                switchComponent = new SwitchComponent(context2, null, 0, 6, null);
            } else {
                context2 = context;
            }
            switchComponent.setEnabled(u6d0Var.m);
            switchComponent.setTrackColorAttr(xng0.controlMain);
            listItemWithBadgeComponent.setUseAutoAccessibilityDelegate(false);
            listItemWithBadgeComponent.setTrailView(switchComponent);
            ViewGroup.LayoutParams layoutParams = switchComponent.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd(tje.u(12, context2));
                switchComponent.setLayoutParams(layoutParams2);
            }
            boolean z3 = u6d0Var.p;
            l6a0 l6a0Var2 = this.W;
            u6d0 u6d0Var2 = l6a0Var2 instanceof u6d0 ? (u6d0) l6a0Var2 : null;
            String str = u6d0Var2 != null ? u6d0Var2.k.a : null;
            if (this.Z && jl40.l(str, u6d0Var.k.a)) {
                z2 = true;
            }
            this.Z = true;
            if (z2) {
                switchComponent.setCheckedWithAnimation(z3);
            } else {
                switchComponent.setChecked(z3);
            }
            listItemWithBadgeComponent.setTitleContentDescription(u6d0Var.n);
            listItemWithBadgeComponent.setSubtitleContentDescription(u6d0Var.o);
            switchComponent.setImportantForAccessibility(2);
            androidx.core.view.b.p(switchComponent, null);
            androidx.core.view.b.p(listItemWithBadgeComponent, yca0.a);
            return;
        }
        egh eghVar = (egh) l6a0Var;
        boolean z4 = eghVar.d;
        PaymentOptionState paymentOptionState = eghVar.b;
        if (eghVar.k) {
            listItemWithBadgeComponent.setTrailMode(2);
        }
        switch (zca0.a[paymentOptionState.ordinal()]) {
            case 1:
            case 2:
                CheckBoxComponent checkBoxComponent = (CheckBoxComponent) listItemWithBadgeComponent.getTrailViewAs(CheckBoxComponent.class);
                if (checkBoxComponent == null) {
                    checkBoxComponent = new CheckBoxComponent(listItemWithBadgeComponent.getContext(), null, 0, 6, null);
                }
                boolean z5 = paymentOptionState == PaymentOptionState.SELECTED;
                mfb mfbVar = this.U;
                Drawable a = z5 ? mfbVar.a() : mfbVar.b();
                checkBoxComponent.setChecked(z5);
                checkBoxComponent.setImageDrawable(a);
                checkBoxComponent.setEnabled(z4);
                listItemWithBadgeComponent.setUseAutoAccessibilityDelegate(false);
                listItemWithBadgeComponent.setTrailView(checkBoxComponent);
                checkBoxComponent.setImportantForAccessibility(2);
                androidx.core.view.b.p(checkBoxComponent, null);
                androidx.core.view.b.p(listItemWithBadgeComponent, xca0.a);
                if (eghVar.o instanceof a6a0) {
                    listItemWithBadgeComponent.setTrailCompanionMode(1);
                    listItemWithBadgeComponent.setTrailCompanionImage(f1h0.ic_info);
                    View view = this.a;
                    listItemWithBadgeComponent.setTrailCompanionImageSize(ru.yandex.taxi.design.utils.c.h(28, view), tje.u(24, view.getContext()));
                    ImageView trailCompanionImageView3 = listItemWithBadgeComponent.getTrailCompanionImageView();
                    if (trailCompanionImageView3 != null) {
                        trailCompanionImageView3.setPadding(0, 0, tje.u(4, view.getContext()), 0);
                    }
                    int m = s8o.m(eghVar.e.b, listItemWithBadgeComponent.getContext());
                    if (m != 0 && (trailCompanionImageView2 = listItemWithBadgeComponent.getTrailCompanionImageView()) != null) {
                        trailCompanionImageView2.setColorFilter(m);
                    }
                    if (z4 && (trailCompanionImageView = listItemWithBadgeComponent.getTrailCompanionImageView()) != null) {
                        ru.yandex.taxi.design.utils.c.z(new l2z(11, this, eghVar), trailCompanionImageView);
                        break;
                    }
                }
                break;
            case 3:
                listItemWithBadgeComponent.setTrailMode(2);
                break;
            case 4:
                e0(eghVar);
                break;
            case 5:
                e0(eghVar);
                listItemWithBadgeComponent.setTrailCompanionMode(1);
                listItemWithBadgeComponent.setTrailCompanionImage(y2h0.ic_name_edit);
                ImageView trailCompanionImageView4 = listItemWithBadgeComponent.getTrailCompanionImageView();
                if (trailCompanionImageView4 != null) {
                    trailCompanionImageView4.setContentDescription(listItemWithBadgeComponent.getContext().getString(kyh0.payment_methods_action_rename));
                    ru.yandex.taxi.design.utils.c.z(c0(eghVar.n), trailCompanionImageView4);
                    break;
                }
                break;
            case 6:
                listItemWithBadgeComponent.setTrailMode(0);
                break;
            default:
                w511.b();
                break;
        }
    }
}
