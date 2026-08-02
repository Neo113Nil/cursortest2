package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import xsna.oxt0;

/* compiled from: ChangeTransform.java */
/* loaded from: classes12.dex */
public final class jta extends vlp0 {
    public static final String[] e = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final a f = new a(float[].class, "nonTranslations");
    public static final b g = new b(PointF.class, "translations");
    public static final boolean h = true;
    public final boolean b;
    public final boolean c;
    public final Matrix d;

    /* compiled from: ChangeTransform.java */
    public class a extends Property<e, float[]> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(e eVar, float[] fArr) {
            e eVar2 = eVar;
            float[] fArr2 = fArr;
            System.arraycopy(fArr2, 0, eVar2.c, 0, fArr2.length);
            eVar2.a();
        }
    }

    /* compiled from: ChangeTransform.java */
    public class b extends Property<e, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(e eVar, PointF pointF) {
            e eVar2 = eVar;
            PointF pointF2 = pointF;
            eVar2.getClass();
            eVar2.d = pointF2.x;
            eVar2.e = pointF2.y;
            eVar2.a();
        }
    }

    /* compiled from: ChangeTransform.java */
    public static class c extends ymp0 {
        public View b;
        public zxt c;

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
            vlp0Var.removeListener(this);
            View view = this.b;
            if (Build.VERSION.SDK_INT == 28) {
                if (!byt.h) {
                    try {
                        if (!byt.d) {
                            try {
                                byt.c = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            byt.d = true;
                        }
                        Method declaredMethod = byt.c.getDeclaredMethod("removeGhost", View.class);
                        byt.g = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    byt.h = true;
                }
                Method method = byt.g;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused3) {
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getCause());
                    }
                }
            } else {
                int i = cyt.h;
                cyt cytVar = (cyt) view.getTag(R.id.ghost_view);
                if (cytVar != null) {
                    int i2 = cytVar.e - 1;
                    cytVar.e = i2;
                    if (i2 <= 0) {
                        ((ayt) cytVar.getParent()).removeView(cytVar);
                    }
                }
            }
            view.setTag(R.id.transition_transform, null);
            view.setTag(R.id.parent_matrix, null);
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
            this.c.setVisibility(4);
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
            this.c.setVisibility(0);
        }
    }

    /* compiled from: ChangeTransform.java */
    public static class d extends AnimatorListenerAdapter {
        public boolean b;
        public final Matrix c = new Matrix();
        public final boolean d;
        public final boolean e;
        public final View f;
        public final f g;
        public final e h;
        public final Matrix i;

        public d(View view, f fVar, e eVar, Matrix matrix, boolean z, boolean z2) {
            this.d = z;
            this.e = z2;
            this.f = view;
            this.g = fVar;
            this.h = eVar;
            this.i = matrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z = this.b;
            f fVar = this.g;
            View view = this.f;
            if (!z) {
                if (this.d && this.e) {
                    Matrix matrix = this.c;
                    matrix.set(this.i);
                    view.setTag(R.id.transition_transform, matrix);
                    float f = fVar.a;
                    float f2 = fVar.b;
                    float f3 = fVar.c;
                    float f4 = fVar.d;
                    float f5 = fVar.e;
                    float f6 = fVar.f;
                    float f7 = fVar.g;
                    float f8 = fVar.h;
                    String[] strArr = jta.e;
                    view.setTranslationX(f);
                    view.setTranslationY(f2);
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    view.setTranslationZ(f3);
                    view.setScaleX(f4);
                    view.setScaleY(f5);
                    view.setRotationX(f6);
                    view.setRotationY(f7);
                    view.setRotation(f8);
                } else {
                    view.setTag(R.id.transition_transform, null);
                    view.setTag(R.id.parent_matrix, null);
                }
            }
            y1u0.a.r(view, null);
            float f9 = fVar.a;
            float f10 = fVar.b;
            float f11 = fVar.c;
            float f12 = fVar.d;
            float f13 = fVar.e;
            float f14 = fVar.f;
            float f15 = fVar.g;
            float f16 = fVar.h;
            String[] strArr2 = jta.e;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            view.setTranslationZ(f11);
            view.setScaleX(f12);
            view.setScaleY(f13);
            view.setRotationX(f14);
            view.setRotationY(f15);
            view.setRotation(f16);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = this.h.a;
            Matrix matrix2 = this.c;
            matrix2.set(matrix);
            View view = this.f;
            view.setTag(R.id.transition_transform, matrix2);
            f fVar = this.g;
            float f = fVar.a;
            float f2 = fVar.b;
            float f3 = fVar.c;
            float f4 = fVar.d;
            float f5 = fVar.e;
            float f6 = fVar.f;
            float f7 = fVar.g;
            float f8 = fVar.h;
            String[] strArr = jta.e;
            view.setTranslationX(f);
            view.setTranslationY(f2);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.setTranslationZ(f3);
            view.setScaleX(f4);
            view.setScaleY(f5);
            view.setRotationX(f6);
            view.setRotationY(f7);
            view.setRotation(f8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f;
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setRotationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: ChangeTransform.java */
    public static class e {
        public final Matrix a = new Matrix();
        public final View b;
        public final float[] c;
        public float d;
        public float e;

        public e(View view, float[] fArr) {
            this.b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            a();
        }

        public final void a() {
            float f = this.d;
            float[] fArr = this.c;
            fArr[2] = f;
            fArr[5] = this.e;
            Matrix matrix = this.a;
            matrix.setValues(fArr);
            y1u0.a.r(this.b, matrix);
        }
    }

    /* compiled from: ChangeTransform.java */
    public static class f {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public f(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            this.c = view.getTranslationZ();
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a == this.a && fVar.b == this.b && fVar.c == this.c && fVar.d == this.d && fVar.e == this.e && fVar.f == this.f && fVar.g == this.g && fVar.h == this.h;
        }

        public final int hashCode() {
            float f = this.a;
            int floatToIntBits = (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.b;
            int floatToIntBits2 = (floatToIntBits + (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.h;
            return floatToIntBits7 + (f8 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f8) : 0);
        }
    }

    public jta() {
        this.b = true;
        this.c = true;
        this.d = new Matrix();
    }

    public final void a(gnp0 gnp0Var) {
        View view = gnp0Var.b;
        HashMap hashMap = gnp0Var.a;
        if (view.getVisibility() == 8) {
            return;
        }
        hashMap.put("android:changeTransform:parent", view.getParent());
        hashMap.put("android:changeTransform:transforms", new f(view));
        Matrix matrix = view.getMatrix();
        hashMap.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.c) {
            Matrix matrix2 = new Matrix();
            y1u0.a.t((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            hashMap.put("android:changeTransform:parentMatrix", matrix2);
            hashMap.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            hashMap.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    @Override // xsna.vlp0
    public final void captureEndValues(gnp0 gnp0Var) {
        a(gnp0Var);
    }

    @Override // xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        a(gnp0Var);
        View view = gnp0Var.b;
        if (h) {
            return;
        }
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0383, code lost:
    
        if (r18.size() == r4) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [xsna.jta, xsna.vlp0] */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [xsna.byt] */
    @Override // xsna.vlp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        Object obj;
        boolean z;
        Animator animator;
        Animator animator2;
        cyt cytVar;
        int i;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z3;
        Animator animator3;
        int i2;
        boolean z4;
        int i3;
        int intValue;
        ayt aytVar;
        cyt bytVar;
        gnp0 matchedTransitionValues;
        if (gnp0Var == null) {
            return null;
        }
        View view = gnp0Var.b;
        HashMap hashMap = gnp0Var.a;
        if (gnp0Var2 == null) {
            return null;
        }
        View view2 = gnp0Var2.b;
        HashMap hashMap2 = gnp0Var2.a;
        if (!hashMap.containsKey("android:changeTransform:parent") || !hashMap2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeTransform:parent");
        boolean z5 = this.c && (!(isValidTarget(viewGroup2) && isValidTarget(viewGroup3)) ? viewGroup2 == viewGroup3 : !((matchedTransitionValues = getMatchedTransitionValues(viewGroup2, true)) == null || viewGroup3 != matchedTransitionValues.b));
        Matrix matrix = (Matrix) hashMap.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            hashMap.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) hashMap.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            hashMap.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z5) {
            Matrix matrix3 = (Matrix) hashMap2.get("android:changeTransform:parentMatrix");
            view2.setTag(R.id.parent_matrix, matrix3);
            Matrix matrix4 = this.d;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) hashMap.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                hashMap.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) hashMap.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) hashMap.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) hashMap2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = vn10.a;
        }
        if (matrix7 == null) {
            matrix7 = vn10.a;
        }
        if (matrix6.equals(matrix7)) {
            obj = "android:changeTransform:parentMatrix";
            z = true;
            animator = null;
        } else {
            f fVar = (f) hashMap2.get("android:changeTransform:transforms");
            view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view2.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setRotationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view2.setRotationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view2.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix7.getValues(fArr2);
            e eVar = new e(view2, fArr);
            cqr cqrVar = new cqr();
            cqrVar.a = new float[9];
            Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(f, cqrVar, fArr, fArr2), PropertyValuesHolder.ofObject(g, (TypeConverter) null, getPathMotion().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            view2 = view2;
            z = true;
            d dVar = new d(view2, fVar, eVar, matrix7, z5, this.b);
            ofPropertyValuesHolder.addListener(dVar);
            ofPropertyValuesHolder.addPauseListener(dVar);
            animator = ofPropertyValuesHolder;
        }
        boolean z6 = h;
        if (z5 && animator != null && this.b) {
            Matrix matrix8 = new Matrix((Matrix) hashMap2.get(obj));
            y1u0.a.u(viewGroup, matrix8);
            if (Build.VERSION.SDK_INT == 28) {
                if (!byt.f) {
                    try {
                        if (!byt.d) {
                            try {
                                byt.c = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            byt.d = z;
                        }
                        Method declaredMethod = byt.c.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                        byt.e = declaredMethod;
                        declaredMethod.setAccessible(z);
                    } catch (NoSuchMethodException unused2) {
                    }
                    byt.f = true;
                }
                Method method = byt.e;
                if (method != null) {
                    try {
                        bytVar = new byt((View) method.invoke(null, view2, viewGroup, matrix8));
                    } catch (IllegalAccessException unused3) {
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause());
                    }
                    z2 = z6;
                    animator2 = animator;
                    cytVar = bytVar;
                }
                bytVar = null;
                z2 = z6;
                animator2 = animator;
                cytVar = bytVar;
            } else {
                int i4 = cyt.h;
                if (!(view2.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i5 = ayt.d;
                ayt aytVar2 = (ayt) viewGroup.getTag(R.id.ghost_view_holder);
                cytVar = (cyt) view2.getTag(R.id.ghost_view);
                if (cytVar == null || (aytVar = (ayt) cytVar.getParent()) == aytVar2) {
                    i = 0;
                } else {
                    i = cytVar.e;
                    aytVar.removeView(cytVar);
                    cytVar = null;
                }
                if (cytVar == null) {
                    cytVar = new cyt(view2);
                    cytVar.f = matrix8;
                    if (aytVar2 == null) {
                        aytVar2 = new ayt(viewGroup.getContext());
                        aytVar2.setClipChildren(false);
                        aytVar2.b = viewGroup;
                        viewGroup.setTag(R.id.ghost_view_holder, aytVar2);
                        iut0.a(aytVar2, viewGroup);
                        aytVar2.c = true;
                    } else {
                        ViewGroup viewGroup4 = aytVar2.b;
                        if (!aytVar2.c) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        viewGroup4.getOverlay().remove(aytVar2);
                        viewGroup4.getOverlay().add(aytVar2);
                    }
                    y1u0.c(aytVar2, aytVar2.getLeft(), aytVar2.getTop(), viewGroup.getWidth() + aytVar2.getLeft(), viewGroup.getHeight() + aytVar2.getTop());
                    y1u0.c(cytVar, cytVar.getLeft(), cytVar.getTop(), viewGroup.getWidth() + cytVar.getLeft(), viewGroup.getHeight() + cytVar.getTop());
                    ArrayList arrayList3 = new ArrayList();
                    ayt.a(cytVar.d, arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    int childCount = aytVar2.getChildCount() - 1;
                    int i6 = 0;
                    while (i6 <= childCount) {
                        int i7 = (i6 + childCount) / 2;
                        ayt.a(((cyt) aytVar2.getChildAt(i7)).d, arrayList4);
                        if (arrayList3.isEmpty() || arrayList4.isEmpty()) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            z3 = z6;
                            animator3 = animator;
                        } else {
                            z3 = z6;
                            animator3 = animator;
                            if (arrayList3.get(0) != arrayList4.get(0)) {
                                arrayList = arrayList3;
                            } else {
                                int min = Math.min(arrayList3.size(), arrayList4.size());
                                int i8 = 1;
                                while (true) {
                                    if (i8 < min) {
                                        View view3 = (View) arrayList3.get(i8);
                                        arrayList = arrayList3;
                                        View view4 = (View) arrayList4.get(i8);
                                        if (view3 != view4) {
                                            ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                                            int childCount2 = viewGroup5.getChildCount();
                                            if (view3.getZ() == view4.getZ()) {
                                                arrayList2 = arrayList4;
                                                int i9 = 0;
                                                while (i9 < childCount2) {
                                                    int i10 = childCount2;
                                                    i2 = childCount;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        intValue = oxt0.a.a(i9, viewGroup5);
                                                        i3 = i9;
                                                    } else {
                                                        if (!oxt0.c) {
                                                            try {
                                                                Class cls = Integer.TYPE;
                                                                Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                                                                oxt0.b = declaredMethod2;
                                                                z4 = true;
                                                                try {
                                                                    declaredMethod2.setAccessible(true);
                                                                } catch (NoSuchMethodException unused4) {
                                                                }
                                                            } catch (NoSuchMethodException unused5) {
                                                                z4 = true;
                                                            }
                                                            oxt0.c = z4;
                                                        }
                                                        Method method2 = oxt0.b;
                                                        if (method2 != null) {
                                                            try {
                                                                i3 = i9;
                                                                try {
                                                                    intValue = ((Integer) method2.invoke(viewGroup5, Integer.valueOf(viewGroup5.getChildCount()), Integer.valueOf(i3))).intValue();
                                                                } catch (IllegalAccessException | InvocationTargetException unused6) {
                                                                }
                                                            } catch (IllegalAccessException | InvocationTargetException unused7) {
                                                            }
                                                        }
                                                        i3 = i9;
                                                        intValue = i3;
                                                    }
                                                    View childAt = viewGroup5.getChildAt(intValue);
                                                    if (childAt != view3) {
                                                        if (childAt == view4) {
                                                            break;
                                                        }
                                                        i9 = i3 + 1;
                                                        childCount2 = i10;
                                                        childCount = i2;
                                                    }
                                                }
                                            } else if (view3.getZ() <= view4.getZ()) {
                                                arrayList2 = arrayList4;
                                            }
                                        } else {
                                            i8++;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        arrayList2 = arrayList4;
                                        i2 = childCount;
                                    }
                                    arrayList2.clear();
                                    arrayList3 = arrayList;
                                    z6 = z3;
                                    animator = animator3;
                                    arrayList4 = arrayList2;
                                }
                                childCount = i7 - 1;
                                arrayList2.clear();
                                arrayList3 = arrayList;
                                z6 = z3;
                                animator = animator3;
                                arrayList4 = arrayList2;
                            }
                            arrayList2 = arrayList4;
                        }
                        i2 = childCount;
                        i6 = i7 + 1;
                        childCount = i2;
                        arrayList2.clear();
                        arrayList3 = arrayList;
                        z6 = z3;
                        animator = animator3;
                        arrayList4 = arrayList2;
                    }
                    z2 = z6;
                    animator2 = animator;
                    if (i6 < 0 || i6 >= aytVar2.getChildCount()) {
                        aytVar2.addView(cytVar);
                    } else {
                        aytVar2.addView(cytVar, i6);
                    }
                    cytVar.e = i;
                } else {
                    z2 = z6;
                    animator2 = animator;
                    cytVar.f = matrix8;
                }
                cytVar.e++;
            }
            if (cytVar != null) {
                cytVar.a(view, (ViewGroup) hashMap.get("android:changeTransform:parent"));
                vlp0 vlp0Var = this;
                while (true) {
                    dnp0 dnp0Var = vlp0Var.mParent;
                    if (dnp0Var == null) {
                        break;
                    }
                    vlp0Var = dnp0Var;
                }
                c cVar = new c();
                cVar.b = view2;
                cVar.c = cytVar;
                vlp0Var.addListener(cVar);
                if (z2) {
                    if (view != view2) {
                        y1u0.d(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    y1u0.d(view2, 1.0f);
                }
            }
        } else {
            animator2 = animator;
            if (!z6) {
                viewGroup2.endViewTransition(view);
            }
        }
        return animator2;
    }

    @Override // xsna.vlp0
    public final String[] getTransitionProperties() {
        return e;
    }

    public jta(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.c = true;
        this.d = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jtm0.f);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.b = ytp0.b(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.c = ytp0.b(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
