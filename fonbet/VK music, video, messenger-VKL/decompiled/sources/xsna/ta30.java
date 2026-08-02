package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.video.ui.discovery.minimizable.motion.light.engine.exception.MotionLayoutException;
import com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo;
import com.vk.video.ui.discovery.minimizable.motion.touches.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.aa30;
import xsna.nb30;

/* compiled from: MotionLayoutLight.kt */
/* loaded from: classes7.dex */
public final class ta30 extends ViewGroup implements u160, of, a.c {
    public static final boolean g = BuildInfo.h();
    public final Object b;
    public boolean c;
    public za30 d;
    public final HashMap<Integer, uoy> e;
    public final com.vk.video.ui.discovery.minimizable.motion.touches.a f;

    /* compiled from: ViewExt.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ View b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ ta30 e;
        public final /* synthetic */ View f;

        public a(View view, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, ta30 ta30Var, View view2) {
            this.b = view;
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = ta30Var;
            this.f = view2;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            View view = this.b;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                L.d(new b(measuredWidth, measuredHeight, this.e, this.f));
            }
            return s3q0.a;
        }
    }

    /* compiled from: MotionLayoutLight.kt */
    public static final class b implements gzs<Object> {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ ta30 d;
        public final /* synthetic */ View e;

        public b(int i, int i2, ta30 ta30Var, View view) {
            this.b = i;
            this.c = i2;
            this.d = ta30Var;
            this.e = view;
        }

        @Override // xsna.gzs
        public final Object invoke() {
            return "Size changed " + this.b + ' ' + this.c + ' ' + this.d.getContext().getResources().getResourceName(this.e.getId());
        }
    }

    public ta30(Context context) {
        super(context);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new iy2(27));
        this.e = new HashMap<>();
        this.f = new com.vk.video.ui.discovery.minimizable.motion.touches.a(context, this, this, getComposeTouchActionsDetector());
    }

    public static int a(upy upyVar) {
        kxj0 kxj0Var = upyVar.b;
        float f = upyVar.c;
        if (epx.f(kxj0Var, kxj0.c) && f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 8;
        }
        return f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 4 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final bri getComposeTouchActionsDetector() {
        return (bri) this.b.getValue();
    }

    @Override // xsna.of, com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public final void D(nb30 nb30Var) {
        za30 za30Var = this.d;
        if (za30Var != null) {
            jl4 jl4Var = new jl4(12, za30Var, nb30Var);
            if (za30Var.b.keySet().contains(nb30Var)) {
                jl4Var.invoke();
                return;
            }
            throw new MotionLayoutException("State with id = " + nb30Var + " is not registered");
        }
    }

    @Override // xsna.of
    public final void M3(bb30 bb30Var) {
        ArrayList arrayList;
        za30 za30Var = this.d;
        if (za30Var == null || (arrayList = za30Var.e) == null) {
            return;
        }
        arrayList.remove(bb30Var);
    }

    @Override // xsna.of
    public final void W2(bb30 bb30Var) {
        ArrayList arrayList;
        za30 za30Var = this.d;
        if (za30Var == null || (arrayList = za30Var.e) == null) {
            return;
        }
        arrayList.add(bb30Var);
    }

    @Override // xsna.u160
    public final void a2(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        getTouchProcessor().l(view, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new MotionLayoutException("Add views only via registerLayoutNode method!");
    }

    public final void b(uoy uoyVar, View view) {
        View view2;
        this.e.put(Integer.valueOf(view.getId()), uoyVar);
        za30 za30Var = this.d;
        if (za30Var != null) {
            za30Var.d.add(uoyVar);
        }
        if (g) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = view.getMeasuredWidth();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = view.getMeasuredHeight();
            view2 = view;
            f4m.a(view2, new a(view2, ref$IntRef, ref$IntRef2, this, view));
        } else {
            view2 = view;
        }
        super.addView(view2, -1, generateDefaultLayoutParams());
    }

    @Override // xsna.t160
    public final void c0(int i, View view) {
        com.vk.video.ui.discovery.minimizable.motion.touches.a touchProcessor = getTouchProcessor();
        TouchActionInfo touchActionInfo = touchProcessor.e;
        if (touchActionInfo != null && (touchActionInfo.d instanceof TouchActionInfo.b.a)) {
            touchProcessor.p();
            touchProcessor.e = null;
            touchProcessor.k = 0;
            touchProcessor.j = 0;
            touchProcessor.l = false;
        }
        touchProcessor.i = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vpy vpyVar;
        Map<uoy, upy> a2;
        vpy vpyVar2;
        Map<uoy, upy> a3;
        if (g) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"MotionLayoutLight.dispatchDraw "});
            }
        }
        za30 za30Var = this.d;
        if (za30Var != null) {
            uny unyVar = za30Var.f;
            int i = 0;
            if (this.c) {
                if (unyVar != null && (vpyVar2 = unyVar.f) != null && (a3 = vpyVar2.a()) != null) {
                    int i2 = 0;
                    while (i2 < getChildCount()) {
                        int i3 = i2 + 1;
                        View childAt = getChildAt(i2);
                        if (childAt == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        upy orDefault = a3.getOrDefault(this.e.get(Integer.valueOf(childAt.getId())), upy.d);
                        int a4 = a(orDefault);
                        kxj0 kxj0Var = orDefault.b;
                        childAt.setVisibility(a4);
                        if (childAt.getVisibility() != 8) {
                            int i4 = kxj0Var.a;
                            int i5 = kxj0Var.b;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                            lzb0 lzb0Var = orDefault.a;
                            int i6 = lzb0Var.a;
                            int i7 = lzb0Var.b;
                            childAt.layout(i6, i7, kxj0Var.a + i6, i5 + i7);
                            childAt.setAlpha(orDefault.c);
                            childAt.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        i2 = i3;
                    }
                }
                this.c = false;
            } else if (unyVar != null && (vpyVar = unyVar.f) != null && (a2 = vpyVar.a()) != null) {
                while (i < getChildCount()) {
                    int i8 = i + 1;
                    View childAt2 = getChildAt(i);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    upy orDefault2 = a2.getOrDefault(this.e.get(Integer.valueOf(childAt2.getId())), upy.d);
                    childAt2.setVisibility(a(orDefault2));
                    childAt2.setAlpha(orDefault2.c);
                    childAt2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i = i8;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // xsna.of
    public final void e1(TouchActionInfo touchActionInfo) {
        getTouchProcessor().g.add(touchActionInfo);
    }

    @Override // xsna.of
    public final void f1(nb30 nb30Var) {
        za30 za30Var = this.d;
        if (za30Var != null) {
            ValueAnimator valueAnimator = za30Var.i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            za30Var.i = null;
            if (za30Var.b.keySet().contains(nb30Var)) {
                za30Var.c(new aa30.a(nb30Var));
                s3q0 s3q0Var = s3q0.a;
            } else {
                throw new MotionLayoutException("State with id = " + nb30Var + " is not registered");
            }
        }
    }

    @Override // xsna.of, com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public aa30 getState() {
        aa30 aa30Var;
        za30 za30Var = this.d;
        return (za30Var == null || (aa30Var = za30Var.h) == null) ? new aa30.a(nb30.a.b) : aa30Var;
    }

    @Override // xsna.of
    public com.vk.video.ui.discovery.minimizable.motion.touches.a getTouchProcessor() {
        return this.f;
    }

    @Override // xsna.t160
    public final boolean h4(View view, View view2, int i, int i2) {
        return getTouchProcessor().m(i, i2, view2);
    }

    @Override // com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public final ei k3(nmp0 nmp0Var) {
        vmp0 vmp0Var;
        za30 za30Var = this.d;
        if (za30Var != null && (vmp0Var = (vmp0) za30Var.a.get(nmp0Var)) != null) {
            return vmp0Var.a;
        }
        throw new MotionLayoutException("Transition with id = " + nmp0Var + " not found");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.vk.video.ui.discovery.minimizable.motion.touches.a touchProcessor = getTouchProcessor();
        touchProcessor.f = ViewConfiguration.get(touchProcessor.a);
        if (touchProcessor.e != null) {
            touchProcessor.e = null;
            touchProcessor.l = false;
            touchProcessor.h.clear();
            touchProcessor.i = false;
            touchProcessor.j = 0;
            touchProcessor.k = 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.vk.video.ui.discovery.minimizable.motion.touches.a touchProcessor = getTouchProcessor();
        if (motionEvent == null) {
            touchProcessor.getClass();
            return false;
        }
        boolean onTouchEvent = ((GestureDetector) touchProcessor.m.getValue()).onTouchEvent(motionEvent);
        if (mnh0.m(motionEvent) || motionEvent.getAction() == 3) {
            return false;
        }
        return onTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        uny unyVar;
        vpy vpyVar;
        Map<uoy, upy> a2;
        if (g) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"MotionLayoutLight.onLayout " + i + ' ' + i2 + ' ' + i3 + ' ' + i4});
            }
        }
        za30 za30Var = this.d;
        if (za30Var == null || (unyVar = za30Var.f) == null || (vpyVar = unyVar.f) == null || (a2 = vpyVar.a()) == null) {
            return;
        }
        int i5 = 0;
        while (i5 < getChildCount()) {
            int i6 = i5 + 1;
            View childAt = getChildAt(i5);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            upy orDefault = a2.getOrDefault(this.e.get(Integer.valueOf(childAt.getId())), upy.d);
            if (a(orDefault) != 8) {
                lzb0 lzb0Var = orDefault.a;
                int i7 = lzb0Var.a;
                int i8 = lzb0Var.b;
                kxj0 kxj0Var = orDefault.b;
                childAt.layout(i7, i8, kxj0Var.a + i7, kxj0Var.b + i8);
            }
            i5 = i6;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        uny unyVar;
        vpy vpyVar;
        Map<uoy, upy> a2;
        if (g) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"MotionLayoutLight.onMeasure"});
            }
        }
        za30 za30Var = this.d;
        if (za30Var == null) {
            super.onMeasure(i, i2);
            return;
        }
        wvs0 wvs0Var = za30Var.c;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        kxj0 kxj0Var = wvs0Var.c;
        if (kxj0Var.a != size || kxj0Var.b != size2) {
            kxj0 kxj0Var2 = new kxj0(size, size2);
            if (!epx.f(kxj0Var, kxj0Var2)) {
                wvs0Var.c = kxj0Var2;
                b1z b1zVar = wvs0Var.b;
                if (b1zVar != null) {
                    b1zVar.invoke();
                }
            }
            kxj0Var = kxj0Var2;
        }
        za30 za30Var2 = this.d;
        if (za30Var2 != null && (unyVar = za30Var2.f) != null && (vpyVar = unyVar.f) != null && (a2 = vpyVar.a()) != null) {
            int i3 = 0;
            while (i3 < getChildCount()) {
                int i4 = i3 + 1;
                View childAt = getChildAt(i3);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                upy orDefault = a2.getOrDefault(this.e.get(Integer.valueOf(childAt.getId())), upy.d);
                int a3 = a(orDefault);
                kxj0 kxj0Var3 = orDefault.b;
                if (a3 != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(kxj0Var3.a, 1073741824), View.MeasureSpec.makeMeasureSpec(kxj0Var3.b, 1073741824));
                }
                i3 = i4;
            }
        }
        setMeasuredDimension(kxj0Var.a, kxj0Var.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return getTouchProcessor().j(f, f2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return getTouchProcessor().n(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        throw new MotionLayoutException("Removing views is not supported!");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        com.vk.video.ui.discovery.minimizable.motion.touches.a touchProcessor = getTouchProcessor();
        if (!z) {
            touchProcessor.getClass();
            return;
        }
        TouchActionInfo touchActionInfo = touchProcessor.e;
        if (touchActionInfo == null || !(touchActionInfo.d instanceof TouchActionInfo.b.a)) {
            touchProcessor.e = null;
            touchProcessor.l = false;
            touchProcessor.h.clear();
            touchProcessor.i = false;
            touchProcessor.j = 0;
            touchProcessor.k = 0;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (g) {
            L.C("Request layout detected, call stack is ", new RuntimeException());
        }
        za30 za30Var = this.d;
        if ((za30Var != null ? za30Var.h : null) instanceof aa30.b) {
            return;
        }
        super.requestLayout();
    }

    @Override // xsna.t160
    public final void s1(View view, int i, int i2, int[] iArr, int i3) {
        getTouchProcessor().k(view, i, i2, iArr);
    }

    @Override // com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public void setState(aa30 aa30Var) {
        za30 za30Var = this.d;
        if (za30Var != null) {
            ValueAnimator valueAnimator = za30Var.i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            za30Var.i = null;
            za30Var.c(aa30Var);
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public final void Z1() {
    }

    @Override // xsna.t160
    public final void l0(View view, View view2, int i, int i2) {
    }

    @Override // xsna.t160
    public final void H0(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
