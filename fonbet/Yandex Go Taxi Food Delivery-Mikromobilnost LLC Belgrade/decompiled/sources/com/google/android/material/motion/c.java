package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import defpackage.a710;
import defpackage.org0;

/* loaded from: classes11.dex */
public final class c extends a710 {
    public final float g;
    public final float h;
    public float i;
    public Rect j;
    public Rect k;
    public float[] l;

    public c(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(org0.m3_back_progress_main_container_min_edge_gap);
        this.h = resources.getDimension(org0.m3_back_progress_main_container_max_translation_y);
    }

    public final AnimatorSet a(final View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        View view2 = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view3 = view;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r11 = r1.getRoundedCorner(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r12 = r1.getRoundedCorner(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r4 = r1.getRoundedCorner(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        r0 = r1.getRoundedCorner(3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float[] b() {
        float[] fArr;
        View view;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        if (this.l == null) {
            if (Build.VERSION.SDK_INT < 31 || (r1 = (view = this.b).getRootWindowInsets()) == null) {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                int width = view.getWidth();
                int height = view.getHeight();
                int radius = (i3 == 0 && i4 == 0 && roundedCorner4 != null) ? roundedCorner4.getRadius() : 0;
                int i5 = width + i3;
                int radius2 = (i5 < i || i4 != 0 || roundedCorner3 == null) ? 0 : roundedCorner3.getRadius();
                int radius3 = (i5 < i || i4 + height < i2 || roundedCorner2 == null) ? 0 : roundedCorner2.getRadius();
                int radius4 = (i3 != 0 || i4 + height < i2 || roundedCorner == null) ? 0 : roundedCorner.getRadius();
                float f = radius;
                float f2 = radius2;
                float f3 = radius3;
                float f4 = radius4;
                fArr = new float[]{f, f, f2, f2, f3, f3, f4, f4};
            }
            this.l = fArr;
        }
        return this.l;
    }
}
