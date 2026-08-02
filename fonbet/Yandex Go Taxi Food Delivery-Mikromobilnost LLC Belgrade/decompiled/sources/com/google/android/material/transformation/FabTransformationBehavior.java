package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.circularreveal.CircularRevealWidget$CircularRevealScrimColorProperty;
import com.google.android.material.circularreveal.a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.ab30;
import defpackage.bb30;
import defpackage.ck2;
import defpackage.leh0;
import defpackage.mj2;
import defpackage.ny61;
import defpackage.u1n;
import defpackage.uh6;
import defpackage.vuz;
import defpackage.wvb;
import defpackage.xvb;
import defpackage.ycs0;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes11.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public float A;
    public final Rect c;
    public final RectF w;
    public final RectF x;
    public final int[] y;
    public float z;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.w = new RectF();
        this.x = new RectF();
        this.y = new int[2];
    }

    public static Pair w(float f, float f2, boolean z, u1n u1nVar) {
        bb30 f3;
        bb30 f4;
        if (f == 0.0f || f2 == 0.0f) {
            f3 = ((ab30) u1nVar.b).f("translationXLinear");
            f4 = ((ab30) u1nVar.b).f("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            f3 = ((ab30) u1nVar.b).f("translationXCurveDownwards");
            f4 = ((ab30) u1nVar.b).f("translationYCurveDownwards");
        } else {
            f3 = ((ab30) u1nVar.b).f("translationXCurveUpwards");
            f4 = ((ab30) u1nVar.b).f("translationYCurveUpwards");
        }
        return new Pair(f3, f4);
    }

    public static float z(u1n u1nVar, bb30 bb30Var, float f) {
        long j = bb30Var.a;
        long j2 = bb30Var.b;
        bb30 f2 = ((ab30) u1nVar.b).f("expansion");
        return mj2.a(f, 0.0f, bb30Var.b().getInterpolation((((f2.a + f2.b) + 17) - j) / j2));
    }

    public final void A(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.y);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract u1n B(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean b(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        ny61.r("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void d(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03a7 A[LOOP:0: B:61:0x03a5->B:62:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet v(final View view, final View view2, final boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        ArrayList arrayList;
        float f;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ArrayList arrayList2;
        boolean z3;
        AnimatorSet animatorSet;
        int i;
        int size;
        int i2;
        ObjectAnimator ofFloat4;
        ObjectAnimator ofInt;
        ObjectAnimator ofInt2;
        u1n B = B(view2.getContext(), z);
        if (z) {
            this.z = view.getTranslationX();
            this.A = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((ab30) B.b).f("elevation").a(ofFloat);
        arrayList3.add(ofFloat);
        float x = x(view, view2, (vuz) B.c);
        float y = y(view, view2, (vuz) B.c);
        Pair w = w(x, y, z, B);
        bb30 bb30Var = (bb30) w.first;
        bb30 bb30Var2 = (bb30) w.second;
        RectF rectF = this.x;
        Rect rect = this.c;
        RectF rectF2 = this.w;
        if (z) {
            f = 0.0f;
            if (!z2) {
                view2.setTranslationX(-x);
                view2.setTranslationY(-y);
            }
            arrayList = arrayList4;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float z4 = z(B, bb30Var, -x);
            float z5 = z(B, bb30Var2, -y);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF2.set(rect);
            A(view2, rectF);
            rectF.offset(z4, z5);
            rectF.intersect(rectF2);
            rectF2.set(rectF);
            ofFloat3 = ofFloat6;
            ofFloat2 = ofFloat5;
        } else {
            arrayList = arrayList4;
            f = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -x);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -y);
        }
        bb30Var.a(ofFloat2);
        bb30Var2.a(ofFloat3);
        arrayList3.add(ofFloat2);
        arrayList3.add(ofFloat3);
        float width = rectF2.width();
        float height = rectF2.height();
        float x2 = x(view, view2, (vuz) B.c);
        float y2 = y(view, view2, (vuz) B.c);
        Pair w2 = w(x2, y2, z, B);
        bb30 bb30Var3 = (bb30) w2.first;
        bb30 bb30Var4 = (bb30) w2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            x2 = this.z;
        }
        float f2 = y2;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, x2);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            f2 = this.A;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f2);
        bb30Var3.a(ofFloat7);
        bb30Var4.a(ofFloat8);
        arrayList3.add(ofFloat7);
        arrayList3.add(ofFloat8);
        boolean z6 = view2 instanceof xvb;
        if (z6 && (view instanceof ImageView)) {
            final xvb xvbVar = (xvb) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    ofInt2 = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0);
                } else {
                    ofInt2 = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255);
                }
                ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transformation.FabTransformationBehavior.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view2.invalidate();
                    }
                });
                ((ab30) B.b).f("iconFade").a(ofInt2);
                arrayList3.add(ofInt2);
                AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        xvbVar.setCircularRevealOverlayDrawable(null);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        xvbVar.setCircularRevealOverlayDrawable(drawable);
                    }
                };
                arrayList2 = arrayList;
                arrayList2.add(animatorListenerAdapter);
                if (z6) {
                    z3 = z6;
                } else {
                    final xvb xvbVar2 = (xvb) view2;
                    vuz vuzVar = (vuz) B.c;
                    A(view, rectF2);
                    rectF2.offset(this.z, this.A);
                    A(view2, rectF);
                    rectF.offset(-x(view, view2, vuzVar), f);
                    float centerX = rectF2.centerX() - rectF.left;
                    vuz vuzVar2 = (vuz) B.c;
                    A(view, rectF2);
                    z3 = z6;
                    rectF2.offset(this.z, this.A);
                    A(view2, rectF);
                    rectF.offset(0.0f, -y(view, view2, vuzVar2));
                    float centerY = rectF2.centerY() - rectF.top;
                    ((FloatingActionButton) view).getMeasuredContentRect(rect);
                    float width2 = rect.width() / 2.0f;
                    bb30 f3 = ((ab30) B.b).f("expansion");
                    if (z) {
                        if (!z2) {
                            xvbVar2.setRevealInfo(new wvb(centerX, centerY, width2));
                        }
                        if (z2) {
                            width2 = xvbVar2.getRevealInfo().c;
                        }
                        animatorSet = a.a(xvbVar2, centerX, centerY, uh6.n(centerX, centerY, width, height));
                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.4
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                wvb revealInfo = xvbVar2.getRevealInfo();
                                revealInfo.c = Float.MAX_VALUE;
                                xvbVar2.setRevealInfo(revealInfo);
                            }
                        });
                        long j = f3.a;
                        int i3 = (int) centerX;
                        int i4 = (int) centerY;
                        if (j > 0) {
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i3, i4, width2, width2);
                            createCircularReveal.setStartDelay(0L);
                            createCircularReveal.setDuration(j);
                            arrayList3.add(createCircularReveal);
                        }
                    } else {
                        float f4 = xvbVar2.getRevealInfo().c;
                        AnimatorSet a = a.a(xvbVar2, centerX, centerY, width2);
                        long j2 = f3.a;
                        int i5 = (int) centerX;
                        int i6 = (int) centerY;
                        if (j2 > 0) {
                            Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i5, i6, f4, f4);
                            createCircularReveal2.setStartDelay(0L);
                            createCircularReveal2.setDuration(j2);
                            arrayList3.add(createCircularReveal2);
                        }
                        long j3 = f3.a;
                        long j4 = f3.b;
                        ycs0 ycs0Var = ((ab30) B.b).a;
                        int i7 = ycs0Var.c;
                        int i8 = 0;
                        long j5 = 0;
                        while (i8 < i7) {
                            ycs0 ycs0Var2 = ycs0Var;
                            bb30 bb30Var5 = (bb30) ycs0Var.j(i8);
                            j5 = Math.max(j5, bb30Var5.a + bb30Var5.b);
                            i8++;
                            ycs0Var = ycs0Var2;
                            j3 = j3;
                        }
                        long j6 = j3 + j4;
                        if (j6 < j5) {
                            Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i5, i6, width2, width2);
                            createCircularReveal3.setStartDelay(j6);
                            createCircularReveal3.setDuration(j5 - j6);
                            arrayList3.add(createCircularReveal3);
                        }
                        animatorSet = a;
                    }
                    f3.a(animatorSet);
                    arrayList3.add(animatorSet);
                    arrayList2.add(a.b(xvbVar2));
                }
                if (z3) {
                    xvb xvbVar3 = (xvb) view2;
                    ColorStateList backgroundTintList = view.getBackgroundTintList();
                    int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
                    int i9 = 16777215 & colorForState;
                    if (z) {
                        if (!z2) {
                            xvbVar3.setCircularRevealScrimColor(colorForState);
                        }
                        ofInt = ObjectAnimator.ofInt(xvbVar3, CircularRevealWidget$CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, i9);
                    } else {
                        ofInt = ObjectAnimator.ofInt(xvbVar3, CircularRevealWidget$CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, colorForState);
                    }
                    ofInt.setEvaluator(ArgbEvaluatorCompat.getInstance());
                    ((ab30) B.b).f("color").a(ofInt);
                    arrayList3.add(ofInt);
                }
                if (view2 instanceof ViewGroup) {
                    View findViewById = view2.findViewById(leh0.mtrl_child_content_container);
                    ViewGroup viewGroup = null;
                    if (findViewById != null) {
                        if (findViewById instanceof ViewGroup) {
                            viewGroup = (ViewGroup) findViewById;
                        }
                    } else if ((view2 instanceof TransformationChildLayout) || (view2 instanceof TransformationChildCard)) {
                        View childAt = ((ViewGroup) view2).getChildAt(0);
                        if (childAt instanceof ViewGroup) {
                            viewGroup = (ViewGroup) childAt;
                        }
                    } else {
                        viewGroup = (ViewGroup) view2;
                    }
                    if (viewGroup != null) {
                        if (z) {
                            if (!z2) {
                                ChildrenAlphaProperty.CHILDREN_ALPHA.set(viewGroup, Float.valueOf(0.0f));
                            }
                            i = 0;
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, ChildrenAlphaProperty.CHILDREN_ALPHA, 1.0f);
                        } else {
                            i = 0;
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, ChildrenAlphaProperty.CHILDREN_ALPHA, 0.0f);
                        }
                        ((ab30) B.b).f("contentFade").a(ofFloat4);
                        arrayList3.add(ofFloat4);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ck2.a(animatorSet2, arrayList3);
                        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                if (z) {
                                    return;
                                }
                                view2.setVisibility(4);
                                view.setAlpha(1.0f);
                                view.setVisibility(0);
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                                if (z) {
                                    view2.setVisibility(0);
                                    view.setAlpha(0.0f);
                                    view.setVisibility(4);
                                }
                            }
                        });
                        size = arrayList2.size();
                        for (i2 = i; i2 < size; i2++) {
                            animatorSet2.addListener((Animator.AnimatorListener) arrayList2.get(i2));
                        }
                        return animatorSet2;
                    }
                }
                i = 0;
                AnimatorSet animatorSet22 = new AnimatorSet();
                ck2.a(animatorSet22, arrayList3);
                animatorSet22.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (z) {
                            return;
                        }
                        view2.setVisibility(4);
                        view.setAlpha(1.0f);
                        view.setVisibility(0);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        if (z) {
                            view2.setVisibility(0);
                            view.setAlpha(0.0f);
                            view.setVisibility(4);
                        }
                    }
                });
                size = arrayList2.size();
                while (i2 < size) {
                }
                return animatorSet22;
            }
        }
        arrayList2 = arrayList;
        if (z6) {
        }
        if (z3) {
        }
        if (view2 instanceof ViewGroup) {
        }
        i = 0;
        AnimatorSet animatorSet222 = new AnimatorSet();
        ck2.a(animatorSet222, arrayList3);
        animatorSet222.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                view2.setVisibility(4);
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
            }
        });
        size = arrayList2.size();
        while (i2 < size) {
        }
        return animatorSet222;
    }

    public final float x(View view, View view2, vuz vuzVar) {
        RectF rectF = this.w;
        A(view, rectF);
        rectF.offset(this.z, this.A);
        RectF rectF2 = this.x;
        A(view2, rectF2);
        vuzVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float y(View view, View view2, vuz vuzVar) {
        RectF rectF = this.w;
        A(view, rectF);
        rectF.offset(this.z, this.A);
        RectF rectF2 = this.x;
        A(view2, rectF2);
        vuzVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.w = new RectF();
        this.x = new RectF();
        this.y = new int[2];
    }
}
