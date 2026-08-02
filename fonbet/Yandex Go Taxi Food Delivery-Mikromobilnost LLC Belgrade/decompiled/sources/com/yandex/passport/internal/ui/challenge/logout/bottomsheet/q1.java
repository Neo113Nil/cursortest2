package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.core.view.ViewCompat$Api21Impl;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.common.ui.view.HorizontalScrollViewBuilder;
import defpackage.bx60;
import defpackage.kp31;
import defpackage.li91;
import defpackage.lzx;
import defpackage.n751;
import defpackage.ny61;
import defpackage.qke;
import defpackage.t2y;
import defpackage.tls;
import defpackage.uc20;
import defpackage.wj91;
import defpackage.x4h0;
import defpackage.zy11;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class q1 extends t2y {
    public final LinearLayoutBuilder A;
    public final HorizontalScrollViewBuilder B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final LinearLayoutBuilder G;
    public final TextView H;
    public final TextView I;
    public final h0 c;
    public final TextView w;
    public final View x;
    public final TextView y;
    public final LinearLayoutBuilder z;

    /* JADX WARN: Multi-variable type inference failed */
    public q1(LogoutBottomSheetActivity logoutBottomSheetActivity) {
        super(logoutBottomSheetActivity);
        new k1();
        new l1();
        m1 m1Var = new m1();
        n1 n1Var = new n1();
        new o1();
        new p1();
        this.c = new h0();
        View view = (View) LogoutNewBottomSheetUi$special$$inlined$textView$default$1.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        boolean z = this instanceof lzx;
        if (z) {
            ((lzx) this).addToParent(view);
        }
        TextView textView = (TextView) view;
        textView.setTextSize(24.0f);
        li91.l(textView, R.color.passport_logout_primary);
        li91.k(textView, x4h0.ys_text_medium);
        int i = 1;
        textView.setGravity(1);
        this.w = textView;
        View view2 = (View) LogoutNewBottomSheetUi$special$$inlined$view$default$1.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view2);
        }
        this.x = view2;
        View view3 = (View) LogoutNewBottomSheetUi$special$$inlined$textView$default$2.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view3);
        }
        TextView textView2 = (TextView) view3;
        textView2.setTextSize(16.0f);
        li91.l(textView2, R.color.passport_logout_link);
        li91.k(textView2, x4h0.ys_text_medium);
        textView2.setGravity(1);
        textView2.setTextColor(qke.m(R.color.passport_logout_link, textView2.getContext()));
        this.y = textView2;
        View view4 = (View) LogoutNewBottomSheetUi$special$$inlined$imageView$default$1.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view4);
        }
        ImageView imageView = (ImageView) view4;
        imageView.setImageDrawable(d(imageView.getContext(), R.drawable.passport_logout_delete_trailing, R.color.passport_logout_secondary));
        imageView.setImageTintList(qke.m(R.color.passport_logout_link, imageView.getContext()));
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(0);
        linearLayoutBuilder.setGravity(17);
        linearLayoutBuilder.invoke(textView2, new j1(linearLayoutBuilder, 3));
        linearLayoutBuilder.invoke(imageView, new u0(3));
        this.z = linearLayoutBuilder;
        LinearLayoutBuilder linearLayoutBuilder2 = new LinearLayoutBuilder(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(linearLayoutBuilder2);
        }
        linearLayoutBuilder2.setOrientation(0);
        linearLayoutBuilder2.setGravity(17);
        DisplayMetrics displayMetrics = uc20.a;
        linearLayoutBuilder2.setPaddingRelative((int) (displayMetrics.density * 24.0f), linearLayoutBuilder2.getPaddingTop(), linearLayoutBuilder2.getPaddingEnd(), linearLayoutBuilder2.getPaddingBottom());
        linearLayoutBuilder2.setPaddingRelative(linearLayoutBuilder2.getPaddingStart(), linearLayoutBuilder2.getPaddingTop(), (int) (24.0f * displayMetrics.density), linearLayoutBuilder2.getPaddingBottom());
        this.A = linearLayoutBuilder2;
        HorizontalScrollViewBuilder horizontalScrollViewBuilder = new HorizontalScrollViewBuilder(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(horizontalScrollViewBuilder);
        }
        horizontalScrollViewBuilder.setFillViewport(true);
        horizontalScrollViewBuilder.invoke(linearLayoutBuilder2, new o(i, horizontalScrollViewBuilder));
        this.B = horizontalScrollViewBuilder;
        View view5 = (View) LogoutNewBottomSheetUi$special$$inlined$textView$default$3.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view5);
        }
        TextView textView3 = (TextView) view5;
        m1Var.a(textView3);
        this.C = textView3;
        View view6 = (View) LogoutNewBottomSheetUi$special$$inlined$textView$default$4.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view6);
        }
        TextView textView4 = (TextView) view6;
        n1Var.a(textView4);
        this.D = textView4;
        View view7 = (View) LogoutNewBottomSheetUi$special$$inlined$textView$default$5.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view7);
        }
        TextView textView5 = (TextView) view7;
        m1Var.a(textView5);
        this.E = textView5;
        View view8 = (View) LogoutNewBottomSheetUi$special$$inlined$textView$default$6.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view8);
        }
        TextView textView6 = (TextView) view8;
        n1Var.a(textView6);
        this.F = textView6;
        LinearLayoutBuilder linearLayoutBuilder3 = new LinearLayoutBuilder(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(linearLayoutBuilder3);
        }
        linearLayoutBuilder3.setOrientation(1);
        LinearLayoutBuilder e = e(textView3, textView4, R.id.passport_logout_option_logout_this);
        li91.e(new LogoutNewBottomSheetUi$checkOnClick$1(this, e, linearLayoutBuilder3, null), e);
        f(e, true);
        linearLayoutBuilder3.invoke(e, new j1(linearLayoutBuilder3, 1));
        LinearLayoutBuilder e2 = e(textView5, textView6, R.id.passport_logout_option_logout_all);
        li91.e(new LogoutNewBottomSheetUi$checkOnClick$1(this, e2, linearLayoutBuilder3, null), e2);
        linearLayoutBuilder3.invoke(e2, new j1(linearLayoutBuilder3, 2));
        this.G = linearLayoutBuilder3;
        View view9 = (View) LogoutNewBottomSheetUi$special$$inlined$textView$default$7.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view9);
        }
        TextView textView7 = (TextView) view9;
        textView7.setTextSize(16.0f);
        li91.l(textView7, R.color.passport_logout_on_brand_background);
        li91.k(textView7, x4h0.ys_text_medium);
        textView7.setBackgroundResource(R.drawable.passport_logout_prominent_button_background);
        textView7.setGravity(17);
        this.H = textView7;
        View view10 = (View) LogoutNewBottomSheetUi$special$$inlined$textView$default$8.b.invoke(wj91.e(0, logoutBottomSheetActivity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view10);
        }
        TextView textView8 = (TextView) view10;
        textView8.setTextSize(16.0f);
        li91.l(textView8, R.color.passport_logout_primary);
        li91.k(textView8, x4h0.ys_text_medium);
        textView8.setBackgroundResource(R.drawable.passport_logout_button_background);
        textView8.setGravity(17);
        this.I = textView8;
    }

    public static boolean c(View view) {
        View view2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    view2 = null;
                    break;
                }
                int i2 = i + 1;
                view2 = viewGroup.getChildAt(i);
                if (view2 == null) {
                    ny61.s();
                    return false;
                }
                if (view2 instanceof Checkable) {
                    break;
                }
                i = i2;
            }
            Checkable checkable = view2 instanceof Checkable ? (Checkable) view2 : null;
            if (checkable != null) {
                return checkable.isChecked();
            }
        }
        return false;
    }

    public static Drawable d(Context context, int i, int i2) {
        Drawable mutate;
        Drawable drawable = context.getDrawable(i);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        mutate.setTint(context.getColor(i2));
        return mutate;
    }

    public static void f(View view, boolean z) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            Checkable checkable = childAt instanceof Checkable ? (Checkable) childAt : null;
            if (checkable != null) {
                checkable.setChecked(z);
            }
            i = i2;
        }
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        final int i = 0;
        final LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(linearLayoutBuilder);
        }
        final int i2 = 1;
        linearLayoutBuilder.setOrientation(1);
        linearLayoutBuilder.setPadding(linearLayoutBuilder.getPaddingLeft(), (int) (44.0f * uc20.a.density), linearLayoutBuilder.getPaddingRight(), linearLayoutBuilder.getPaddingBottom());
        final u0 u0Var = new u0(4);
        linearLayoutBuilder.invoke(this.w, new tls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.g1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                u0 u0Var2 = u0Var;
                LinearLayoutBuilder linearLayoutBuilder2 = linearLayoutBuilder;
                switch (i3) {
                    case 0:
                        ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                        layoutParams.width = -1;
                        layoutParams.height = -2;
                        u0Var2.invoke(layoutParams);
                        layoutParams.bottomMargin = (int) (24.0f * uc20.a.density);
                        ((LinearLayout) obj).setLayoutParams(generateLayoutParams);
                        break;
                    case 1:
                        ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                        layoutParams2.width = -2;
                        layoutParams2.height = -2;
                        layoutParams2.gravity = 1;
                        u0Var2.invoke(layoutParams2);
                        ((TextView) obj).setLayoutParams(generateLayoutParams2);
                        break;
                    default:
                        ViewGroup viewGroup = (ViewGroup) obj;
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
                        layoutParams3.gravity = -1;
                        layoutParams3.width = -1;
                        layoutParams3.height = -2;
                        u0Var2.invoke(layoutParams3);
                        layoutParams3.topMargin = (int) (8.0f * uc20.a.density);
                        viewGroup.setLayoutParams(layoutParams3);
                        linearLayoutBuilder2.post(new com.yandex.passport.internal.interaction.a(5, viewGroup, linearLayoutBuilder2));
                        break;
                }
                return zy11Var;
            }
        });
        final int i3 = 2;
        linearLayoutBuilder.invoke(this.z, new tls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.g1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i32 = i3;
                zy11 zy11Var = zy11.a;
                u0 u0Var2 = u0Var;
                LinearLayoutBuilder linearLayoutBuilder2 = linearLayoutBuilder;
                switch (i32) {
                    case 0:
                        ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                        layoutParams.width = -1;
                        layoutParams.height = -2;
                        u0Var2.invoke(layoutParams);
                        layoutParams.bottomMargin = (int) (24.0f * uc20.a.density);
                        ((LinearLayout) obj).setLayoutParams(generateLayoutParams);
                        break;
                    case 1:
                        ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                        layoutParams2.width = -2;
                        layoutParams2.height = -2;
                        layoutParams2.gravity = 1;
                        u0Var2.invoke(layoutParams2);
                        ((TextView) obj).setLayoutParams(generateLayoutParams2);
                        break;
                    default:
                        ViewGroup viewGroup = (ViewGroup) obj;
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
                        layoutParams3.gravity = -1;
                        layoutParams3.width = -1;
                        layoutParams3.height = -2;
                        u0Var2.invoke(layoutParams3);
                        layoutParams3.topMargin = (int) (8.0f * uc20.a.density);
                        viewGroup.setLayoutParams(layoutParams3);
                        linearLayoutBuilder2.post(new com.yandex.passport.internal.interaction.a(5, viewGroup, linearLayoutBuilder2));
                        break;
                }
                return zy11Var;
            }
        });
        linearLayoutBuilder.invoke(this.B, new j1(linearLayoutBuilder, 4));
        linearLayoutBuilder.invoke(this.x, new j1(linearLayoutBuilder, 5));
        linearLayoutBuilder.invoke(this.G, new tls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.g1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i32 = i;
                zy11 zy11Var = zy11.a;
                u0 u0Var2 = u0Var;
                LinearLayoutBuilder linearLayoutBuilder2 = linearLayoutBuilder;
                switch (i32) {
                    case 0:
                        ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                        layoutParams.width = -1;
                        layoutParams.height = -2;
                        u0Var2.invoke(layoutParams);
                        layoutParams.bottomMargin = (int) (24.0f * uc20.a.density);
                        ((LinearLayout) obj).setLayoutParams(generateLayoutParams);
                        break;
                    case 1:
                        ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                        layoutParams2.width = -2;
                        layoutParams2.height = -2;
                        layoutParams2.gravity = 1;
                        u0Var2.invoke(layoutParams2);
                        ((TextView) obj).setLayoutParams(generateLayoutParams2);
                        break;
                    default:
                        ViewGroup viewGroup = (ViewGroup) obj;
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
                        layoutParams3.gravity = -1;
                        layoutParams3.width = -1;
                        layoutParams3.height = -2;
                        u0Var2.invoke(layoutParams3);
                        layoutParams3.topMargin = (int) (8.0f * uc20.a.density);
                        viewGroup.setLayoutParams(layoutParams3);
                        linearLayoutBuilder2.post(new com.yandex.passport.internal.interaction.a(5, viewGroup, linearLayoutBuilder2));
                        break;
                }
                return zy11Var;
            }
        });
        final o oVar = new o(i3, u0Var);
        linearLayoutBuilder.invoke(this.H, new tls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i4 = i;
                zy11 zy11Var = zy11.a;
                o oVar2 = oVar;
                LinearLayoutBuilder linearLayoutBuilder2 = linearLayoutBuilder;
                TextView textView = (TextView) obj;
                switch (i4) {
                    case 0:
                        ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                        oVar2.invoke(layoutParams);
                        layoutParams.bottomMargin = (int) (8.0f * uc20.a.density);
                        textView.setLayoutParams(generateLayoutParams);
                        break;
                    default:
                        ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                        oVar2.invoke(layoutParams2);
                        layoutParams2.bottomMargin = (int) (24.0f * uc20.a.density);
                        textView.setLayoutParams(generateLayoutParams2);
                        break;
                }
                return zy11Var;
            }
        });
        linearLayoutBuilder.invoke(this.I, new tls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i4 = i2;
                zy11 zy11Var = zy11.a;
                o oVar2 = oVar;
                LinearLayoutBuilder linearLayoutBuilder2 = linearLayoutBuilder;
                TextView textView = (TextView) obj;
                switch (i4) {
                    case 0:
                        ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                        oVar2.invoke(layoutParams);
                        layoutParams.bottomMargin = (int) (8.0f * uc20.a.density);
                        textView.setLayoutParams(generateLayoutParams);
                        break;
                    default:
                        ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                        oVar2.invoke(layoutParams2);
                        layoutParams2.bottomMargin = (int) (24.0f * uc20.a.density);
                        textView.setLayoutParams(generateLayoutParams2);
                        break;
                }
                return zy11Var;
            }
        });
        bx60 bx60Var = new bx60() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.i1
            @Override // defpackage.bx60
            public final n751 onApplyWindowInsets(View view, n751 n751Var) {
                int i4 = n751Var.a.g(2).d;
                LinearLayoutBuilder linearLayoutBuilder2 = LinearLayoutBuilder.this;
                linearLayoutBuilder2.setPadding(linearLayoutBuilder2.getPaddingLeft(), linearLayoutBuilder2.getPaddingTop(), linearLayoutBuilder2.getPaddingRight(), i4);
                return n751.b;
            }
        };
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(linearLayoutBuilder, bx60Var);
        return linearLayoutBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LinearLayoutBuilder e(TextView textView, TextView textView2, int i) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int generateViewId = View.generateViewId();
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(wj91.e(0, this.a), 0, 0);
        if (generateViewId != -1) {
            linearLayoutBuilder.setId(generateViewId);
        }
        if (this instanceof lzx) {
            ((lzx) this).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(0);
        DisplayMetrics displayMetrics = uc20.a;
        int i2 = (int) (10.0f * displayMetrics.density);
        linearLayoutBuilder.setPadding(0, i2, 0, i2);
        View view = (View) LogoutNewBottomSheetUi$optionRadio$lambda$60$$inlined$radioButton$default$1.b.invoke(wj91.e(0, linearLayoutBuilder.getCtx()), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        linearLayoutBuilder.addToParent(view);
        RadioButton radioButton = (RadioButton) view;
        this.c.getClass();
        StateListDrawableCompat stateListDrawableCompat = new StateListDrawableCompat();
        stateListDrawableCompat.addState(new int[]{android.R.attr.state_checked}, d(radioButton.getContext(), R.drawable.passport_logout_radio_checked, R.color.passport_logout_brand_background));
        stateListDrawableCompat.addState(new int[0], d(radioButton.getContext(), R.drawable.passport_logout_radio_normal, R.color.passport_logout_border));
        radioButton.setButtonDrawable(stateListDrawableCompat);
        ViewGroup.LayoutParams layoutParams = radioButton.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd((int) (12.0f * displayMetrics.density));
        radioButton.setLayoutParams(marginLayoutParams);
        radioButton.setClickable(false);
        radioButton.setFocusable(false);
        radioButton.setFocusableInTouchMode(false);
        LinearLayoutBuilder linearLayoutBuilder2 = new LinearLayoutBuilder(wj91.e(0, linearLayoutBuilder.getCtx()), 0, 0);
        linearLayoutBuilder.addToParent(linearLayoutBuilder2);
        linearLayoutBuilder2.setOrientation(1);
        linearLayoutBuilder2.setLayoutParams(linearLayoutBuilder2.generateLayoutParams(-1, -2));
        linearLayoutBuilder2.invoke(textView, new u0(2));
        linearLayoutBuilder2.invoke(textView2, new j1(linearLayoutBuilder2, 0));
        return linearLayoutBuilder;
    }
}
