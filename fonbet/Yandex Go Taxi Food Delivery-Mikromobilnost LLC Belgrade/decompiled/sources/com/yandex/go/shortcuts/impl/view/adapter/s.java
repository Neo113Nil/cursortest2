package com.yandex.go.shortcuts.impl.view.adapter;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.shortcuts.impl.view.adapter.s;
import com.yandex.go.shortcuts.view.adapter.model.model.SectionTypedHeaderModel$AppearanceType;
import defpackage.ei;
import defpackage.ip11;
import defpackage.j1s0;
import defpackage.kx31;
import defpackage.l4q0;
import defpackage.mug0;
import defpackage.n4q0;
import defpackage.rp31;
import defpackage.s5o;
import defpackage.t4s0;
import defpackage.tls;
import defpackage.u7h0;
import defpackage.w0q0;
import defpackage.w511;
import defpackage.xw31;
import defpackage.yln;
import defpackage.zmh;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;
import ru.yandex.taxi.utils.StyledTypefaceSpan;

/* loaded from: classes13.dex */
public final class s extends kx31 {
    public static final List e0 = Collections.singletonList(new s5o(SectionTypedHeaderViewHolder$Companion$PAYLOAD_TYPES$1.b));
    public final com.yandex.go.shortcuts.impl.ui.shortcutview.a T;
    public final ru.yandex.taxi.widget.c U;
    public final ip11 V;
    public final ListItemComponent W;
    public final AppCompatImageView Z;
    public final yln a0;
    public SectionTypedHeaderModel$AppearanceType b0;
    public int c0;
    public int d0;

    public s(com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.widget.c cVar, t4s0 t4s0Var, View view, j1s0 j1s0Var, ip11 ip11Var) {
        super(view, t4s0Var);
        this.T = aVar;
        this.U = cVar;
        this.V = ip11Var;
        int i = u7h0.shortcuts_section_header;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(view, i));
        this.W = listItemComponent;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ((View) rp31.d(view, u7h0.icon_header));
        this.Z = appCompatImageView;
        this.a0 = new yln(25, this);
        this.b0 = SectionTypedHeaderModel$AppearanceType.DEFAULT;
        int a = j1s0Var.a(20);
        int a2 = j1s0Var.a(16);
        listItemComponent.setTitleTextSizePx(a);
        listItemComponent.setTrailTextSize(a2);
        androidx.core.view.b.q(listItemComponent, true);
        androidx.core.view.b.q(appCompatImageView, true);
    }

    public static final SpannedString d0(s sVar, CharSequence charSequence, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(new StyledTypefaceSpan(((zmh) sVar.V).f(sVar.W.getContext()), 0, 2, null), 0, spannableStringBuilder.length(), 33);
        if (z) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpanFix(28, true), 0, spannableStringBuilder.length(), 33);
        }
        return new SpannedString(spannableStringBuilder);
    }

    @Override // defpackage.kx31, defpackage.wys
    public final void Y() {
        super.Y();
        ListItemComponent listItemComponent = this.W;
        listItemComponent.setTitle((CharSequence) null);
        listItemComponent.getLeadImageView().removeOnLayoutChangeListener(this.a0);
    }

    @Override // defpackage.wys
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final void c(l4q0 l4q0Var) {
        c0(l4q0Var);
        SectionTypedHeaderModel$AppearanceType sectionTypedHeaderModel$AppearanceType = l4q0Var.e;
        Integer num = l4q0Var.f;
        String str = l4q0Var.d;
        this.b0 = sectionTypedHeaderModel$AppearanceType;
        int i = n4q0.a[sectionTypedHeaderModel$AppearanceType.ordinal()];
        final int i2 = 0;
        ListItemComponent listItemComponent = this.W;
        AppCompatImageView appCompatImageView = this.Z;
        final int i3 = 1;
        if (i == 1) {
            listItemComponent.setVisibility(8);
            appCompatImageView.setVisibility(0);
            if (str.length() > 0) {
                a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.b(this.T, this.Z, l4q0Var.d, new w0q0(14), new tls(this) { // from class: m4q0
                    public final /* synthetic */ s b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        zy11 zy11Var = zy11.a;
                        s sVar = this.b;
                        Drawable drawable = (Drawable) obj;
                        switch (i4) {
                            case 0:
                                sVar.d0 = drawable.getIntrinsicHeight();
                                sVar.c0 = drawable.getIntrinsicWidth();
                                ImageView g0 = sVar.g0();
                                if (g0 != null) {
                                    g0.addOnLayoutChangeListener(sVar.a0);
                                }
                                sVar.f0(true);
                                sVar.h0();
                                break;
                            default:
                                ImageView g02 = sVar.g0();
                                if (g02 != null) {
                                    g02.addOnLayoutChangeListener(sVar.a0);
                                }
                                sVar.i0();
                                break;
                        }
                        return zy11Var;
                    }
                }, 4));
            } else if (num != null) {
                appCompatImageView.setImageResource(num.intValue());
            }
            androidx.core.view.b.p(appCompatImageView, new ei(18));
            Z(new SectionTypedHeaderViewHolder$bindIconOnlyAppearance$5(this, l4q0Var, null), "TITLE_KEY", true);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        appCompatImageView.setVisibility(8);
        listItemComponent.setVisibility(0);
        f0(false);
        this.c0 = 0;
        this.d0 = 0;
        if (str.length() > 0) {
            a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.b(this.T, listItemComponent.getLeadImageView(), l4q0Var.d, new w0q0(14), new tls(this) { // from class: m4q0
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i4 = i2;
                    zy11 zy11Var = zy11.a;
                    s sVar = this.b;
                    Drawable drawable = (Drawable) obj;
                    switch (i4) {
                        case 0:
                            sVar.d0 = drawable.getIntrinsicHeight();
                            sVar.c0 = drawable.getIntrinsicWidth();
                            ImageView g0 = sVar.g0();
                            if (g0 != null) {
                                g0.addOnLayoutChangeListener(sVar.a0);
                            }
                            sVar.f0(true);
                            sVar.h0();
                            break;
                        default:
                            ImageView g02 = sVar.g0();
                            if (g02 != null) {
                                g02.addOnLayoutChangeListener(sVar.a0);
                            }
                            sVar.i0();
                            break;
                    }
                    return zy11Var;
                }
            }, 4));
        } else if (num != null) {
            int intValue = num.intValue();
            f0(true);
            listItemComponent.getLeadImageView().setImageResource(intValue);
            h0();
        }
        if (l4q0Var.b.b.d()) {
            listItemComponent.setTitleUseMinimumWidth(true);
            Z(new SectionTypedHeaderViewHolder$bindDefaultAppearance$4(this, l4q0Var, null), "TITLE_KEY", true);
        } else {
            listItemComponent.setTitle((CharSequence) null);
        }
        if (!l4q0Var.c.b.d()) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            return;
        }
        listItemComponent.setTrailCompanionTextAlignment(2);
        listItemComponent.setTrailCompanionTextEllipsize(TextUtils.TruncateAt.END);
        Z(new SectionTypedHeaderViewHolder$bindDefaultAppearance$5(this, l4q0Var, null), "SUBTITLE_KEY", true);
    }

    public final void f0(boolean z) {
        if (z) {
            ImageView g0 = g0();
            if (g0 != null) {
                g0.setVisibility(0);
                return;
            }
            return;
        }
        ImageView g02 = g0();
        if (g02 != null) {
            g02.setVisibility(8);
        }
        xw31.K(ru.yandex.taxi.design.utils.c.d(mug0.shortcuts_section_typed_without_icon_start_margin, this.a), this.W);
    }

    public final ImageView g0() {
        return (ImageView) this.W.getLeadViewAs(ImageView.class);
    }

    public final void h0() {
        int i;
        int i2;
        ListItemComponent listItemComponent = this.W;
        ViewParent parent = listItemComponent.getParent();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int x = viewGroup != null ? (int) viewGroup.getX() : 0;
        ViewParent parent2 = listItemComponent.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        int y = viewGroup2 != null ? (int) viewGroup2.getY() : 0;
        View view = this.a;
        int h = ru.yandex.taxi.design.utils.c.h(8, view);
        int h2 = ru.yandex.taxi.design.utils.c.h(12, view);
        ImageView g0 = g0();
        int height = g0 != null ? g0.getHeight() : 0;
        ImageView g02 = g0();
        int width = g02 != null ? g02.getWidth() : 0;
        int i3 = this.d0;
        if (i3 == 0) {
            i = 0;
        } else {
            int i4 = height - i3;
            if (i4 < 0) {
                i4 = 0;
            }
            i = i4 / 2;
        }
        int i5 = this.c0;
        if (i5 == 0) {
            i2 = 0;
        } else {
            int i6 = width - i5;
            if (i6 < 0) {
                i6 = 0;
            }
            i2 = i6 / 2;
        }
        ViewGroup.LayoutParams layoutParams = listItemComponent.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.setMarginStart(((-x) - i2) + h2);
            marginLayoutParams2.topMargin = E() == 0 ? ((-y) - i) + h : 0;
            marginLayoutParams = marginLayoutParams2;
        }
        listItemComponent.setLayoutParams(marginLayoutParams);
    }

    public final void i0() {
        AppCompatImageView appCompatImageView = this.Z;
        ViewParent parent = appCompatImageView.getParent();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int x = viewGroup != null ? (int) viewGroup.getX() : 0;
        ViewParent parent2 = appCompatImageView.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        int y = viewGroup2 != null ? (int) viewGroup2.getY() : 0;
        View view = this.a;
        int h = ru.yandex.taxi.design.utils.c.h(9, view);
        int h2 = ru.yandex.taxi.design.utils.c.h(18, view);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.setMarginStart((-x) + h2);
            marginLayoutParams2.topMargin = E() == 0 ? (-y) + h : h;
            marginLayoutParams2.bottomMargin = E() != 0 ? h : 0;
            marginLayoutParams = marginLayoutParams2;
        }
        appCompatImageView.setLayoutParams(marginLayoutParams);
    }
}
