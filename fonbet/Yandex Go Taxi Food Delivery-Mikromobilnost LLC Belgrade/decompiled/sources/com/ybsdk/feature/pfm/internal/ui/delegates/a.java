package com.ybsdk.feature.pfm.internal.ui.delegates;

import android.animation.AnimatorInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.design.spoiler.Spoiler;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.ColorFilterConstraintLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.adb0;
import defpackage.bdb0;
import defpackage.cma1;
import defpackage.ddb0;
import defpackage.edb0;
import defpackage.fe60;
import defpackage.ge60;
import defpackage.he60;
import defpackage.i261;
import defpackage.i4b0;
import defpackage.kp50;
import defpackage.l9b0;
import defpackage.lbh0;
import defpackage.lum;
import defpackage.ny61;
import defpackage.sm91;
import defpackage.smg0;
import defpackage.th40;
import defpackage.u8b0;
import defpackage.unh0;
import defpackage.v4b1;
import defpackage.v8b0;
import defpackage.w511;
import defpackage.xty0;
import defpackage.z8b0;

/* loaded from: classes3.dex */
public abstract class a {
    public static final i261 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(unh0.ybsdk_item_pfm_category, viewGroup, false);
        int i = lbh0.pfmCategoryBackground;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = lbh0.pfmCategoryBackgroundImage;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                ColorFilterConstraintLayout colorFilterConstraintLayout = (ColorFilterConstraintLayout) inflate;
                i = lbh0.pfmCategoryIcon;
                ImageView imageView2 = (ImageView) cma1.O(i, inflate);
                if (imageView2 != null) {
                    i = lbh0.pfmCategorySubtitleAmount;
                    SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i, inflate);
                    if (spoilerTextView != null) {
                        i = lbh0.pfmCategorySubtitleHolder;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                        if (linearLayout != null) {
                            i = lbh0.pfmCategorySubtitleIcon;
                            ImageView imageView3 = (ImageView) cma1.O(i, inflate);
                            if (imageView3 != null) {
                                i = lbh0.pfmCategorySubtitlePlain;
                                TextView textView = (TextView) cma1.O(i, inflate);
                                if (textView != null) {
                                    i = lbh0.pfmCategorySubtitleShimmer;
                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                                    if (shimmerFrameLayout != null) {
                                        i = lbh0.pfmCategoryTitleAmount;
                                        SpoilerTextView spoilerTextView2 = (SpoilerTextView) cma1.O(i, inflate);
                                        if (spoilerTextView2 != null) {
                                            i = lbh0.pfmCategoryTitleHolder;
                                            LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
                                            if (linearLayout2 != null) {
                                                i = lbh0.pfmCategoryTitleIcon;
                                                ImageView imageView4 = (ImageView) cma1.O(i, inflate);
                                                if (imageView4 != null) {
                                                    i = lbh0.pfmCategoryTitlePlain;
                                                    TextView textView2 = (TextView) cma1.O(i, inflate);
                                                    if (textView2 != null) {
                                                        i = lbh0.pfmCategoryTitleShimmer;
                                                        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) cma1.O(i, inflate);
                                                        if (shimmerFrameLayout2 != null) {
                                                            i261 i261Var = new i261(colorFilterConstraintLayout, frameLayout, imageView, colorFilterConstraintLayout, imageView2, spoilerTextView, linearLayout, imageView3, textView, shimmerFrameLayout, spoilerTextView2, linearLayout2, imageView4, textView2, shimmerFrameLayout2);
                                                            imageView2.setClipToOutline(true);
                                                            colorFilterConstraintLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(sm91.c(i261Var), smg0.ybsdk_click_scale_animator));
                                                            return i261Var;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static final lum b(i4b0 i4b0Var, z8b0 z8b0Var, z8b0 z8b0Var2) {
        return new lum(PfmCategoriesDelegateKt$pfmCategoryDelegate$1.b, u8b0.a, new th40(15, i4b0Var, z8b0Var, z8b0Var2), v8b0.a);
    }

    public static final void c(SpoilerTextView spoilerTextView, adb0 adb0Var, ColorModel colorModel, ImageView imageView) {
        ColorModel colorModel2 = adb0Var.a;
        if (colorModel2 != null) {
            colorModel = colorModel2;
        }
        xty0.d(spoilerTextView, adb0Var.c);
        xty0.e(spoilerTextView, colorModel);
        ColorModel colorModel3 = adb0Var.d;
        if (colorModel3 == null) {
            colorModel3 = Spoiler.e;
        }
        SpoilerTextView.updateSpoilerState$default(spoilerTextView, colorModel3, false, 2, null);
        v4b1.k(adb0Var.b, imageView, null, null, 6);
    }

    public static final void d(he60 he60Var, i261 i261Var) {
        edb0 edb0Var;
        int i;
        boolean z = he60Var instanceof ge60;
        int r = z ? kp50.r(2) : 0;
        LinearLayout linearLayout = i261Var.g;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), r, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        ShimmerFrameLayout shimmerFrameLayout = i261Var.j;
        ImageView imageView = i261Var.h;
        SpoilerTextView spoilerTextView = i261Var.f;
        TextView textView = i261Var.i;
        if (z) {
            edb0Var = ((ge60) he60Var).a;
        } else {
            if (!(he60Var instanceof fe60)) {
                w511.b();
                return;
            }
            edb0Var = ((fe60) he60Var).b;
        }
        boolean z2 = edb0Var instanceof ddb0;
        if (!z2) {
            if (edb0Var instanceof bdb0) {
                bdb0 bdb0Var = (bdb0) edb0Var;
                ColorModel colorModel = bdb0Var.a;
                if (colorModel == null) {
                    colorModel = l9b0.l;
                }
                xty0.d(textView, bdb0Var.b);
                xty0.e(textView, colorModel);
            } else {
                if (!(edb0Var instanceof adb0)) {
                    w511.b();
                    return;
                }
                c(spoilerTextView, (adb0) edb0Var, l9b0.l, imageView);
            }
        }
        if (z2) {
            shimmerFrameLayout.startShimmer();
        } else {
            shimmerFrameLayout.stopShimmer();
        }
        shimmerFrameLayout.setVisibility(z2 ? 0 : 8);
        bdb0 bdb0Var2 = edb0Var instanceof bdb0 ? (bdb0) edb0Var : null;
        textView.setVisibility(d.c(bdb0Var2 != null ? bdb0Var2.b : null) ? 0 : 8);
        boolean z3 = edb0Var instanceof adb0;
        adb0 adb0Var = z3 ? (adb0) edb0Var : null;
        if (d.d(adb0Var != null ? adb0Var.c : null) && z2) {
            i = 4;
        } else {
            adb0 adb0Var2 = z3 ? (adb0) edb0Var : null;
            i = d.d(adb0Var2 != null ? adb0Var2.c : null) ? 8 : 0;
        }
        spoilerTextView.setVisibility(i);
        adb0 adb0Var3 = z3 ? (adb0) edb0Var : null;
        imageView.setVisibility((adb0Var3 != null ? adb0Var3.b : null) == null ? 8 : 0);
    }

    public static final void e(he60 he60Var, i261 i261Var) {
        edb0 edb0Var;
        int i;
        if (he60Var instanceof ge60) {
            edb0Var = null;
        } else {
            if (!(he60Var instanceof fe60)) {
                w511.b();
                return;
            }
            edb0Var = ((fe60) he60Var).a;
        }
        boolean z = edb0Var instanceof ddb0;
        if (!z && edb0Var != null) {
            if (edb0Var instanceof bdb0) {
                TextView textView = i261Var.n;
                bdb0 bdb0Var = (bdb0) edb0Var;
                ColorModel colorModel = bdb0Var.a;
                if (colorModel == null) {
                    colorModel = l9b0.l;
                }
                xty0.d(textView, bdb0Var.b);
                xty0.e(textView, colorModel);
            } else {
                if (!(edb0Var instanceof adb0)) {
                    w511.b();
                    return;
                }
                c(i261Var.k, (adb0) edb0Var, l9b0.k, i261Var.m);
            }
        }
        ShimmerFrameLayout shimmerFrameLayout = i261Var.o;
        if (z) {
            shimmerFrameLayout.startShimmer();
        } else {
            shimmerFrameLayout.stopShimmer();
        }
        i261Var.o.setVisibility(z ? 0 : 8);
        i261Var.l.setVisibility(edb0Var != null ? 0 : 8);
        SpoilerTextView spoilerTextView = i261Var.k;
        boolean z2 = edb0Var instanceof adb0;
        adb0 adb0Var = z2 ? (adb0) edb0Var : null;
        if (d.d(adb0Var != null ? adb0Var.c : null) && z) {
            i = 4;
        } else {
            adb0 adb0Var2 = z2 ? (adb0) edb0Var : null;
            i = d.d(adb0Var2 != null ? adb0Var2.c : null) ? 8 : 0;
        }
        spoilerTextView.setVisibility(i);
        TextView textView2 = i261Var.n;
        bdb0 bdb0Var2 = edb0Var instanceof bdb0 ? (bdb0) edb0Var : null;
        textView2.setVisibility(d.c(bdb0Var2 != null ? bdb0Var2.b : null) ? 0 : 8);
        ImageView imageView = i261Var.m;
        adb0 adb0Var3 = z2 ? (adb0) edb0Var : null;
        imageView.setVisibility((adb0Var3 != null ? adb0Var3.b : null) != null ? 0 : 8);
    }
}
