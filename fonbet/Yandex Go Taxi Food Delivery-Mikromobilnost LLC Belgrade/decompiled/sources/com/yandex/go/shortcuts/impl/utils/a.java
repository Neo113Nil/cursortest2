package com.yandex.go.shortcuts.impl.utils;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.yandex.go.shortcuts.impl.view.AfishaBadgeDrawable;
import com.yandex.go.shortcuts.impl.view.CornersRoundBadgeDrawable;
import defpackage.al4;
import defpackage.dzg0;
import defpackage.fl4;
import defpackage.jl4;
import defpackage.jl40;
import defpackage.k5;
import defpackage.ll4;
import defpackage.mrg0;
import defpackage.mug0;
import defpackage.pl4;
import defpackage.qeb1;
import defpackage.ql4;
import defpackage.s8o;
import defpackage.sm4;
import defpackage.tje;
import defpackage.u7h0;
import defpackage.vbb;
import defpackage.wys;
import defpackage.x3s0;
import defpackage.xw31;
import defpackage.zk4;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.plus.design.gradient.CashbackDrawable;
import ru.yandex.taxi.widget.background.PathFillDrawable;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public abstract class a {
    public static final void a(View view) {
        Drawable background = view.getBackground();
        PathFillDrawable pathFillDrawable = background instanceof PathFillDrawable ? (PathFillDrawable) background : null;
        if (pathFillDrawable != null) {
            pathFillDrawable.freeResources();
        }
    }

    public static final void b(BadgeView badgeView, boolean z, Integer num, Integer num2, int i) {
        if (!(badgeView.getBackground() instanceof CornersRoundBadgeDrawable)) {
            a(badgeView);
            badgeView.setBackground(new CornersRoundBadgeDrawable(badgeView.getContext(), i, num));
            DetachListener detachListener = DetachListener.INSTANCE;
            badgeView.removeOnAttachStateChangeListener(detachListener);
            badgeView.addOnAttachStateChangeListener(detachListener);
        }
        if (num2 != null) {
            badgeView.getBackground().setAlpha(num2.intValue());
        }
        if (z) {
            xw31.B(0, badgeView);
        } else {
            xw31.B(tje.u(12, badgeView.getContext()), badgeView);
        }
    }

    public static final void c(BadgeView badgeView, Integer num, float f, int i, int i2) {
        badgeView.setBackground((Drawable) new vbb(-1, f).b);
        badgeView.getBackground().setAlpha(num.intValue());
        xw31.J(badgeView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void d(wys wysVar, BadgeView badgeView, pl4 pl4Var, c cVar, int i, x3s0 x3s0Var, int i2) {
        if ((i2 & 8) != 0) {
            i = badgeView.getId();
        }
        if ((i2 & 16) != 0) {
            x3s0Var = null;
        }
        int i3 = 8;
        if (!jl40.l(pl4Var.b().e, "plus")) {
            Object tag = badgeView.getTag(u7h0.shortcut_badge_origin_bg);
            if (tag != null) {
                badgeView.setBackground((Drawable) tag);
                badgeView.setTag(u7h0.shortcut_badge_origin_bg, null);
                badgeView.setBackgroundTintMode(PorterDuff.Mode.SRC_IN);
            }
            int i4 = sm4.a[pl4Var.a().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        if (pl4Var instanceof ll4) {
                            b(badgeView, false, Integer.valueOf(tje.r(mug0.shortcuts_corner_badge_big_content_height, badgeView.getContext())), Integer.valueOf((int) (((ll4) pl4Var).c.d * 255.0f)), 8388661);
                        } else if (pl4Var instanceof zk4) {
                            int u = tje.u(5, badgeView.getContext());
                            int u2 = tje.u(3, badgeView.getContext());
                            badgeView.setBackground((Drawable) new vbb(-1, tje.r(mrg0.go_design_m_space, badgeView.getContext())).b);
                            badgeView.getBackground().setAlpha(80);
                            xw31.J(badgeView, Integer.valueOf(u), Integer.valueOf(u2), Integer.valueOf(u2), Integer.valueOf(u2));
                        }
                    }
                } else if (pl4Var instanceof ll4) {
                    b(badgeView, false, null, null, 8388659);
                } else if (pl4Var instanceof jl4) {
                    b(badgeView, true, null, null, 8388659);
                } else if (pl4Var instanceof ql4) {
                    c(badgeView, Integer.valueOf((int) (((ql4) pl4Var).c.d * 255.0f)), tje.w(4, badgeView.getContext()), tje.u(6, badgeView.getContext()), tje.u(2, badgeView.getContext()));
                } else if (pl4Var instanceof al4) {
                    int m = s8o.m(((al4) pl4Var).c.b, badgeView.getContext());
                    if (!(badgeView.getBackground() instanceof AfishaBadgeDrawable)) {
                        a(badgeView);
                        badgeView.setBackground(new AfishaBadgeDrawable(badgeView.getContext()));
                        View.OnAttachStateChangeListener onAttachStateChangeListener = DetachListener.INSTANCE;
                        badgeView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                        badgeView.addOnAttachStateChangeListener(onAttachStateChangeListener);
                    }
                    Drawable background = badgeView.getBackground();
                    AfishaBadgeDrawable afishaBadgeDrawable = background instanceof AfishaBadgeDrawable ? (AfishaBadgeDrawable) background : null;
                    if (afishaBadgeDrawable != null) {
                        afishaBadgeDrawable.setLogoColor(m);
                    }
                } else if (badgeView.getBackground() != null) {
                    xw31.I(badgeView, null, 0, null, null);
                    xw31.B(tje.r(mrg0.go_design_s_space, badgeView.getContext()), badgeView);
                    a(badgeView);
                    badgeView.setBackground(null);
                }
            } else if (pl4Var instanceof fl4) {
                c(badgeView, Integer.valueOf((int) (((fl4) pl4Var).c.d * 255.0f)), tje.r(mrg0.go_design_s_space, badgeView.getContext()), tje.u(12, badgeView.getContext()), tje.r(mrg0.go_design_s_space, badgeView.getContext()));
            }
            badgeView.setTintColor(s8o.m(pl4Var.b().c, badgeView.getContext()));
        } else if (badgeView.getTag(u7h0.shortcut_badge_origin_bg) == null && badgeView.getBackground() != null) {
            badgeView.setTag(u7h0.shortcut_badge_origin_bg, badgeView.getBackground());
            a(badgeView);
            int d = ru.yandex.taxi.design.utils.c.d(mrg0.go_design_m_space, wysVar.a);
            float[] fArr = new float[8];
            for (int i5 = 0; i5 < 8; i5++) {
                fArr[i5] = d;
            }
            CashbackDrawable cashbackDrawable = new CashbackDrawable();
            cashbackDrawable.setShape(new RoundRectShape(fArr, null, null));
            badgeView.setBackground(cashbackDrawable);
            badgeView.setBackgroundTintMode(PorterDuff.Mode.DST);
        }
        badgeView.setTextColor(s8o.m(pl4Var.b().b, badgeView.getContext()));
        if (pl4Var.c() != null) {
            Integer c = pl4Var.c();
            badgeView.setTextTypeface(c != null ? c.intValue() : 0, 0);
        }
        badgeView.setRotation(pl4Var instanceof ql4 ? -3.0f : 0.0f);
        if (x3s0Var != null && (pl4Var instanceof zk4)) {
            badgeView.setOnClickListener(new k5(i3, x3s0Var, pl4Var));
        }
        if (pl4Var.b().f.d()) {
            wysVar.Z(new BadgeUtils$updateBadgeView$2(cVar, pl4Var, badgeView, null), Integer.valueOf(i), true);
        } else if (pl4Var instanceof zk4) {
            badgeView.setText(qeb1.g(((zk4) pl4Var).c.a, badgeView.getResources().getDrawable(dzg0.more_vertical, null), 2));
            badgeView.setVisibility(0);
        } else {
            badgeView.setText(pl4Var.b().a);
            badgeView.setVisibility(0);
        }
    }
}
