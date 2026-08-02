package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.vkontakte.android.R;
import java.util.HashMap;
import xsna.vlp0;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public final class wra extends vlp0 {
    private boolean mResizeClip;
    private static final String[] sTransitionProperties = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<i, PointF> TOP_LEFT_PROPERTY = new a(PointF.class, "topLeft");
    private static final Property<i, PointF> BOTTOM_RIGHT_PROPERTY = new b(PointF.class, "bottomRight");
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY = new c(PointF.class, "bottomRight");
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY = new d(PointF.class, "topLeft");
    private static final Property<View, PointF> POSITION_PROPERTY = new e(PointF.class, X3.i.L);
    private static final aif0 sRectEvaluator = new aif0();

    /* compiled from: ChangeBounds.java */
    public class a extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            iVar.b(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    public class b extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    public class c extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            y1u0.c(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    public class d extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            y1u0.c(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    public class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            y1u0.c(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes12.dex */
    public class f extends AnimatorListenerAdapter {
        private final i mViewBounds;

        public f(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes12.dex */
    public static class g extends AnimatorListenerAdapter implements vlp0.i {
        public final View b;
        public final Rect c;
        public final boolean d;
        public final Rect e;
        public final boolean f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public boolean o;

        public g(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.b = view;
            this.c = rect;
            this.d = z;
            this.e = rect2;
            this.f = z2;
            this.g = i;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.l = i6;
            this.m = i7;
            this.n = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
            this.o = true;
        }

        @Override // xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
            View view = this.b;
            view.setTag(R.id.transition_clip, view.getClipBounds());
            view.setClipBounds(this.f ? null : this.e);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
            View view = this.b;
            Rect rect = (Rect) view.getTag(R.id.transition_clip);
            view.setTag(R.id.transition_clip, null);
            view.setClipBounds(rect);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (this.o) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.d) {
                    rect = this.c;
                }
            } else if (!this.f) {
                rect = this.e;
            }
            View view = this.b;
            view.setClipBounds(rect);
            if (z) {
                y1u0.c(view, this.g, this.h, this.i, this.j);
            } else {
                y1u0.c(view, this.k, this.l, this.m, this.n);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            int i = this.i;
            int i2 = this.g;
            int i3 = this.m;
            int i4 = this.k;
            int max = Math.max(i - i2, i3 - i4);
            int i5 = this.j;
            int i6 = this.h;
            int i7 = this.n;
            int i8 = this.l;
            int max2 = Math.max(i5 - i6, i7 - i8);
            if (z) {
                i2 = i4;
            }
            if (z) {
                i6 = i8;
            }
            View view = this.b;
            y1u0.c(view, i2, i6, max + i2, max2 + i6);
            view.setClipBounds(z ? this.e : this.c);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionStart(vlp0 vlp0Var) {
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes12.dex */
    public static class h extends ymp0 {
        public boolean b = false;
        public final ViewGroup c;

        public h(ViewGroup viewGroup) {
            this.c = viewGroup;
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
            oxt0.a(this.c, false);
            this.b = true;
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
            if (!this.b) {
                oxt0.a(this.c, false);
            }
            vlp0Var.removeListener(this);
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
            oxt0.a(this.c, false);
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
            oxt0.a(this.c, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes12.dex */
    public static class i {
        public int a;
        public int b;
        public int c;
        public int d;
        public final View e;
        public int f;
        public int g;

        public i(View view) {
            this.e = view;
        }

        public final void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            this.d = round;
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                y1u0.c(this.e, this.a, this.b, this.c, round);
                this.f = 0;
                this.g = 0;
            }
        }

        public final void b(PointF pointF) {
            this.a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            this.b = round;
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                y1u0.c(this.e, this.a, round, this.c, this.d);
                this.f = 0;
                this.g = 0;
            }
        }
    }

    public wra() {
        this.mResizeClip = false;
    }

    private void captureValues(gnp0 gnp0Var) {
        View view = gnp0Var.b;
        HashMap hashMap = gnp0Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", gnp0Var.b.getParent());
        if (this.mResizeClip) {
            hashMap.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // xsna.vlp0
    public void captureEndValues(gnp0 gnp0Var) {
        captureValues(gnp0Var);
    }

    @Override // xsna.vlp0
    public void captureStartValues(gnp0 gnp0Var) {
        Rect rect;
        captureValues(gnp0Var);
        if (!this.mResizeClip || (rect = (Rect) gnp0Var.b.getTag(R.id.transition_clip)) == null) {
            return;
        }
        gnp0Var.a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vlp0
    public Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        int i2;
        Rect rect;
        int i3;
        int i4;
        ObjectAnimator a2;
        int i5;
        Rect rect2;
        ObjectAnimator objectAnimator;
        Animator b2;
        if (gnp0Var != null) {
            HashMap hashMap = gnp0Var.a;
            if (gnp0Var2 != null) {
                HashMap hashMap2 = gnp0Var2.a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = gnp0Var2.b;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i6 = rect3.left;
                    int i7 = rect4.left;
                    int i8 = rect3.top;
                    int i9 = rect4.top;
                    int i10 = rect3.right;
                    int i11 = rect4.right;
                    int i12 = rect3.bottom;
                    int i13 = rect4.bottom;
                    int i14 = i10 - i6;
                    int i15 = i12 - i8;
                    int i16 = i11 - i7;
                    int i17 = i13 - i9;
                    Rect rect5 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect6 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
                        i2 = 0;
                    } else {
                        i2 = (i6 == i7 && i8 == i9) ? 0 : 1;
                        if (i10 != i11 || i12 != i13) {
                            i2++;
                        }
                    }
                    if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                        i2++;
                    }
                    int i18 = i2;
                    if (i18 <= 0) {
                        return null;
                    }
                    if (this.mResizeClip) {
                        y1u0.c(view, i6, i8, Math.max(i14, i16) + i6, i8 + Math.max(i15, i17));
                        if (i6 == i7 && i8 == i9) {
                            a2 = null;
                            rect = rect6;
                            i3 = i12;
                            i4 = i7;
                        } else {
                            rect = rect6;
                            i3 = i12;
                            i4 = i7;
                            a2 = hp70.a(view, POSITION_PROPERTY, getPathMotion().a(i6, i8, i7, i9));
                        }
                        boolean z = rect5 == null;
                        if (z) {
                            i5 = 0;
                            rect2 = new Rect(0, 0, i14, i15);
                        } else {
                            i5 = 0;
                            rect2 = rect5;
                        }
                        int i19 = rect == null ? 1 : i5;
                        Rect rect7 = i19 != 0 ? new Rect(i5, i5, i16, i17) : rect;
                        if (rect2.equals(rect7)) {
                            objectAnimator = null;
                        } else {
                            view.setClipBounds(rect2);
                            ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", sRectEvaluator, rect2, rect7);
                            g gVar = new g(view, rect2, z, rect7, i19, i6, i8, i10, i3, i4, i9, i11, i13);
                            ofObject.addListener(gVar);
                            addListener(gVar);
                            objectAnimator = ofObject;
                        }
                        b2 = enp0.b(a2, objectAnimator);
                    } else {
                        y1u0.c(view, i6, i8, i10, i12);
                        if (i18 != 2) {
                            b2 = (i6 == i7 && i8 == i9) ? hp70.a(view, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().a(i10, i12, i11, i13)) : hp70.a(view, TOP_LEFT_ONLY_PROPERTY, getPathMotion().a(i6, i8, i7, i9));
                        } else if (i14 == i16 && i15 == i17) {
                            b2 = hp70.a(view, POSITION_PROPERTY, getPathMotion().a(i6, i8, i7, i9));
                        } else {
                            i iVar = new i(view);
                            ObjectAnimator a3 = hp70.a(iVar, TOP_LEFT_PROPERTY, getPathMotion().a(i6, i8, i7, i9));
                            ObjectAnimator a4 = hp70.a(iVar, BOTTOM_RIGHT_PROPERTY, getPathMotion().a(i10, i12, i11, i13));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a3, a4);
                            animatorSet.addListener(new f(iVar));
                            b2 = animatorSet;
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        oxt0.a(viewGroup4, true);
                        getRootTransition().addListener(new h(viewGroup4));
                    }
                    return b2;
                }
            }
        }
        return null;
    }

    @Override // xsna.vlp0
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // xsna.vlp0
    public boolean isSeekingSupported() {
        return true;
    }

    public void setResizeClip(boolean z) {
        this.mResizeClip = z;
    }

    public wra(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mResizeClip = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jtm0.c);
        boolean b2 = ytp0.b(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        setResizeClip(b2);
    }
}
