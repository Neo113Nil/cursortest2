package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.qhv0;

/* compiled from: ClipFeedAnimationUtils.kt */
/* loaded from: classes17.dex */
public final class uvc {
    public static final long a;
    public static final long b;
    public static final /* synthetic */ int c = 0;

    /* compiled from: ClipFeedAnimationUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoResizer.VideoFitType.values().length];
            try {
                iArr[VideoResizer.VideoFitType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoResizer.VideoFitType.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SURFACE_VIEW;
        a = bVar.a(videoFeatures) ? 0L : 350L;
        b = bVar.a(videoFeatures) ? 0L : 200L;
    }

    public static final void a(List list, boolean z, io2 io2Var, gzs gzsVar, io2 io2Var2, z8e z8eVar, RecyclerView recyclerView) {
        List<View> q1 = z8eVar.q1();
        ArrayList u0 = j5g.u0(z8eVar.w2(), list);
        List<View> N0 = z8eVar.N0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : N0) {
            View view = (View) obj;
            if (bwt0.K(view) && (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || z)) {
                arrayList.add(obj);
            }
        }
        AnimatorSet f = f(io2Var2, q1, u0, z);
        AnimatorSet e = e(arrayList, z);
        List<Animator> I = z ? rl3.I(new Animator[]{f, e}) : rl3.I(new Animator[]{e, f});
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        while (adapter instanceof pd90) {
            adapter = ((pd90) adapter).c;
        }
        wke wkeVar = adapter instanceof wke ? (wke) adapter : null;
        if (wkeVar != null) {
            uzz uzzVar = wkeVar.k;
            synchronized (uzzVar) {
                uzzVar.c.set(true);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        if (z) {
            d(j5g.u0(arrayList, u0), false, false);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(I);
        animatorSet.addListener(new wvc(recyclerView, z8eVar, z, io2Var, gzsVar));
        animatorSet.start();
    }

    public static final void b(boolean z, io2 io2Var, gzs gzsVar) {
        if (z) {
            if (io2Var != null) {
                io2Var.D0();
            }
        } else if (io2Var != null) {
            io2Var.C();
        }
        gzsVar.invoke();
    }

    public static void c(List list, q8e q8eVar, io2 io2Var, boolean z, gzs gzsVar) {
        q8e q8eVar2;
        boolean z2;
        ViewTreeObserver viewTreeObserver;
        if (z) {
            if (io2Var != null) {
                io2Var.e0();
            }
        } else if (io2Var != null) {
            io2Var.J();
        }
        if (q8eVar == null || (viewTreeObserver = q8eVar.getViewTreeObserver()) == null) {
            q8eVar2 = q8eVar;
            z2 = z;
        } else {
            q8eVar2 = q8eVar;
            z2 = z;
            viewTreeObserver.addOnPreDrawListener(new vvc(q8eVar2, io2Var, z2, gzsVar, list));
        }
        if (z2 || q8eVar2 == null) {
            return;
        }
        q8eVar2.invalidate();
    }

    public static void d(ArrayList arrayList, boolean z, boolean z2) {
        if (z) {
            long j = a;
            if (j > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).animate().alpha(z2 ? 1.0f : 0.0f).setDuration(j).setInterpolator(new pkk(0.58d, 0.77d, 0.5d, 1.0d)).start();
                }
                return;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setAlpha(z2 ? 1.0f : 0.0f);
        }
    }

    public static AnimatorSet e(ArrayList arrayList, boolean z) {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Pair pair = z ? new Pair(valueOf, Float.valueOf(1.0f)) : new Pair(Float.valueOf(view.getAlpha()), valueOf);
            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, ((Number) pair.d()).floatValue(), ((Number) pair.g()).floatValue()));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(b);
        animatorSet.setInterpolator(new pkk(0.58d, 0.77d, 0.5d, 1.0d));
        return animatorSet;
    }

    public static AnimatorSet f(io2 io2Var, List list, ArrayList arrayList, boolean z) {
        ValueAnimator valueAnimator;
        qhv0 qhv0Var;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KeyEvent.Callback callback = (View) it.next();
            boolean z2 = !z;
            if (callback instanceof VideoTextureView) {
                valueAnimator = g(((VideoTextureView) callback).getMatrixProvider(), io2Var, z2);
            } else if (callback instanceof tn10) {
                valueAnimator = g((tn10) callback, io2Var, z2);
            } else {
                ValueAnimator valueAnimator2 = null;
                if (callback instanceof zjt) {
                    final zjt zjtVar = (zjt) callback;
                    Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    qhv0 vkScaleType = zjtVar.getVkScaleType();
                    if (vkScaleType != null) {
                        Rect rect = new Rect(io2Var.t0());
                        float i0 = io2Var.i0();
                        int i = a.$EnumSwitchMapping$0[io2Var.getContentScaleType().ordinal()];
                        if (i == 1) {
                            qhv0Var = qhv0.e.a;
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            qhv0Var = qhv0.b.a;
                        }
                        Rect rect2 = new Rect();
                        int[] iArr = {0, 0};
                        zjtVar.getLocationOnScreen(iArr);
                        int i2 = iArr[0];
                        rect2.left = i2;
                        rect2.top = iArr[1];
                        rect2.right = zjtVar.getWidth() + i2;
                        rect2.bottom = zjtVar.getHeight() + iArr[1];
                        rect.offset(-rect2.left, -rect2.top);
                        rect2.offset(-rect2.left, -rect2.top);
                        final qhv0.l lVar = new qhv0.l(qhv0Var, vkScaleType, rect, rect2, null, null, 112);
                        Pair pair = !z ? new Pair(Float.valueOf(zjtVar.getAlpha()), valueOf) : new Pair(valueOf, Float.valueOf(1.0f));
                        float floatValue = ((Number) pair.d()).floatValue();
                        valueAnimator2 = ValueAnimator.ofFloat(floatValue, ((Number) pair.g()).floatValue());
                        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                        ref$FloatRef.element = floatValue;
                        xvc xvcVar = new xvc(rect, rect2, ref$FloatRef, i0);
                        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.tvc
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue2 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                if (Math.abs(floatValue2) <= Float.MAX_VALUE) {
                                    qhv0.l.this.g = floatValue2;
                                    ref$FloatRef.element = floatValue2;
                                }
                                zjt zjtVar2 = zjtVar;
                                zjtVar2.invalidate();
                                zjtVar2.invalidateOutline();
                            }
                        });
                        valueAnimator2.addListener(new yvc(zjtVar, vkScaleType, zjtVar, lVar, xvcVar));
                    }
                }
                valueAnimator = valueAnimator2;
            }
            if (valueAnimator != null) {
                arrayList2.add(valueAnimator);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(a);
        animatorSet.setInterpolator(new pkk(0.58d, 0.77d, 0.5d, 1.0d));
        animatorSet.playTogether(arrayList2);
        animatorSet.addListener(new zvc(arrayList, z));
        return animatorSet;
    }

    public static pn10 g(tn10 tn10Var, io2 io2Var, boolean z) {
        Rect rect = new Rect(io2Var.t0());
        Rect g0 = io2Var.g0();
        VideoResizer.VideoFitType contentScaleType = io2Var.getContentScaleType();
        int i0 = (int) io2Var.i0();
        Rect rect2 = new Rect();
        View b2 = tn10Var.b();
        int[] iArr = {0, 0};
        b2.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect2.left = i;
        rect2.top = iArr[1];
        rect2.right = b2.getWidth() + i;
        rect2.bottom = b2.getHeight() + iArr[1];
        s3q0 s3q0Var = s3q0.a;
        return new pn10(rect, g0, contentScaleType, i0, rect2, tn10Var.getContentScaleType(), 0, z, tn10Var);
    }
}
