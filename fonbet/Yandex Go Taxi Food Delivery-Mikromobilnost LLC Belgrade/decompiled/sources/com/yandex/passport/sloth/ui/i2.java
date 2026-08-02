package com.yandex.passport.sloth.ui;

import android.R;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.common.ui.view.CommonSpinner;
import com.yandex.passport.common.ui.view.LottieAnimationViewBuilder;
import com.yandex.passport.sloth.ui.string.SlothString;
import defpackage.kp31;
import defpackage.li91;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.tls;
import defpackage.uc20;
import defpackage.wj91;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class i2 extends t2y {
    public final Button A;
    public final com.yandex.passport.sloth.ui.dependencies.o c;
    public final View w;
    public final com.yandex.passport.sloth.ui.dependencies.k x;
    public final ImageView y;
    public final TextView z;

    /* JADX WARN: Multi-variable type inference failed */
    public i2(Activity activity, com.yandex.passport.sloth.ui.string.a aVar, com.yandex.passport.sloth.ui.dependencies.o oVar) {
        super(activity);
        View e;
        this.c = oVar;
        com.yandex.passport.sloth.ui.dependencies.g d = oVar.d();
        if (d instanceof com.yandex.passport.sloth.ui.dependencies.f) {
            View view = (View) SlothZeroPageUi$special$$inlined$lottieProgressBar$default$1.b.invoke(wj91.e(0, activity), 0, 0);
            if (this instanceof lzx) {
                ((lzx) this).addToParent(view);
            }
            LottieAnimationViewBuilder lottieAnimationViewBuilder = (LottieAnimationViewBuilder) view;
            lottieAnimationViewBuilder.setVisibility(0);
            lottieAnimationViewBuilder.setRepeatCount(-1);
            lottieAnimationViewBuilder.setAnimation(((com.yandex.passport.sloth.ui.dependencies.f) d).a);
            e = (LottieAnimationView) view;
        } else {
            boolean z = oVar.c() instanceof com.yandex.passport.sloth.ui.dependencies.a;
            View view2 = (View) SlothZeroPageUi$special$$inlined$commonSpinner$default$1.b.invoke(wj91.e(0, activity), 0, 0);
            if (this instanceof lzx) {
                ((lzx) this).addToParent(view2);
            }
            CommonSpinner commonSpinner = (CommonSpinner) view2;
            commonSpinner.setColorResource(oVar.f().a);
            e = com.yandex.passport.internal.ui.c.e(this, activity, z, commonSpinner, 1.0f, 0L);
        }
        this.w = e;
        this.x = oVar.e().toSize();
        View view3 = (View) SlothZeroPageUi$special$$inlined$imageView$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        boolean z2 = this instanceof lzx;
        if (z2) {
            ((lzx) this).addToParent(view3);
        }
        ImageView imageView = (ImageView) view3;
        imageView.setVisibility(8);
        imageView.setImageResource(d.passport_sloth_unexpected_error);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.y = imageView;
        View view4 = (View) SlothZeroPageUi$special$$inlined$textView$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (z2) {
            ((lzx) this).addToParent(view4);
        }
        TextView textView = (TextView) view4;
        textView.setVisibility(8);
        textView.setTextSize(16.0f);
        li91.l(textView, oVar.f().a);
        textView.setSingleLine(false);
        textView.setGravity(17);
        DisplayMetrics displayMetrics = uc20.a;
        textView.setPadding(textView.getPaddingLeft(), (int) (12.0f * displayMetrics.density), textView.getPaddingRight(), textView.getPaddingBottom());
        this.z = textView;
        View view5 = (View) SlothZeroPageUi$special$$inlined$button$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (z2) {
            ((lzx) this).addToParent(view5);
        }
        Button button = (Button) view5;
        button.setText(((com.yandex.passport.internal.ui.sloth.k) aVar).a(SlothString.BACK_BUTTON));
        button.setTextSize(16.0f);
        li91.l(button, oVar.f().a);
        button.setSingleLine(true);
        button.setAllCaps(false);
        button.setBackgroundColor(com.yandex.passport.internal.ui.c.q(R.attr.selectableItemBackground, button.getContext()));
        button.setPadding(button.getPaddingLeft(), (int) (displayMetrics.density * 14.0f), button.getPaddingRight(), button.getPaddingBottom());
        button.setPadding(button.getPaddingLeft(), button.getPaddingTop(), button.getPaddingRight(), (int) (14.0f * displayMetrics.density));
        button.setVisibility(8);
        button.setGravity(17);
        this.A = button;
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
        linearLayoutBuilder.setGravity(17);
        com.yandex.passport.sloth.ui.dependencies.o oVar = this.c;
        com.yandex.passport.sloth.ui.dependencies.i b = oVar.b();
        if (b instanceof com.yandex.passport.sloth.ui.dependencies.h) {
            linearLayoutBuilder.setBackgroundResource(((com.yandex.passport.sloth.ui.dependencies.h) b).a);
        } else {
            li91.g(oVar.f().b, linearLayoutBuilder);
        }
        linearLayoutBuilder.invoke(this.w, new s(3, linearLayoutBuilder, this));
        linearLayoutBuilder.invoke(this.y, new tls() { // from class: com.yandex.passport.sloth.ui.h2
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                LinearLayoutBuilder linearLayoutBuilder2 = linearLayoutBuilder;
                switch (i3) {
                    case 0:
                        ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                        layoutParams.width = -1;
                        layoutParams.height = -2;
                        ((ImageView) obj).setLayoutParams(generateLayoutParams);
                        break;
                    case 1:
                        ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                        layoutParams2.width = -1;
                        layoutParams2.height = -2;
                        ((TextView) obj).setLayoutParams(generateLayoutParams2);
                        break;
                    default:
                        ViewGroup.LayoutParams generateLayoutParams3 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) generateLayoutParams3;
                        layoutParams3.width = -1;
                        layoutParams3.height = -2;
                        ((Button) obj).setLayoutParams(generateLayoutParams3);
                        break;
                }
                return zy11Var;
            }
        });
        linearLayoutBuilder.invoke(this.z, new tls() { // from class: com.yandex.passport.sloth.ui.h2
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                LinearLayoutBuilder linearLayoutBuilder2 = linearLayoutBuilder;
                switch (i3) {
                    case 0:
                        ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                        layoutParams.width = -1;
                        layoutParams.height = -2;
                        ((ImageView) obj).setLayoutParams(generateLayoutParams);
                        break;
                    case 1:
                        ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                        layoutParams2.width = -1;
                        layoutParams2.height = -2;
                        ((TextView) obj).setLayoutParams(generateLayoutParams2);
                        break;
                    default:
                        ViewGroup.LayoutParams generateLayoutParams3 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) generateLayoutParams3;
                        layoutParams3.width = -1;
                        layoutParams3.height = -2;
                        ((Button) obj).setLayoutParams(generateLayoutParams3);
                        break;
                }
                return zy11Var;
            }
        });
        if (oVar.a()) {
            final int i3 = 2;
            linearLayoutBuilder.invoke(this.A, new tls() { // from class: com.yandex.passport.sloth.ui.h2
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i32 = i3;
                    zy11 zy11Var = zy11.a;
                    LinearLayoutBuilder linearLayoutBuilder2 = linearLayoutBuilder;
                    switch (i32) {
                        case 0:
                            ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                            layoutParams.width = -1;
                            layoutParams.height = -2;
                            ((ImageView) obj).setLayoutParams(generateLayoutParams);
                            break;
                        case 1:
                            ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                            layoutParams2.width = -1;
                            layoutParams2.height = -2;
                            ((TextView) obj).setLayoutParams(generateLayoutParams2);
                            break;
                        default:
                            ViewGroup.LayoutParams generateLayoutParams3 = linearLayoutBuilder2.generateLayoutParams(-2, -2);
                            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) generateLayoutParams3;
                            layoutParams3.width = -1;
                            layoutParams3.height = -2;
                            ((Button) obj).setLayoutParams(generateLayoutParams3);
                            break;
                    }
                    return zy11Var;
                }
            });
        }
        return linearLayoutBuilder;
    }
}
