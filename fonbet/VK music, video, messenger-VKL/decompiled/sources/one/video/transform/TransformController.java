package one.video.transform;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import xsna.asp;
import xsna.bpn0;
import xsna.cms0;
import xsna.egi;
import xsna.epx;
import xsna.f880;
import xsna.ogu;
import xsna.r5h0;
import xsna.vna0;
import xsna.wn80;
import xsna.wna0;
import xsna.x2j0;
import xsna.xjp0;
import xsna.yjp0;
import xsna.zrp;

/* compiled from: TransformController.kt */
/* loaded from: classes8.dex */
public final class TransformController {
    public xjp0 a;
    public final CopyOnWriteArrayList b;
    public boolean c;
    public d d;
    public ScaleType e;
    public r5h0 f;
    public OneVideoPlayer g;
    public View h;
    public Size i;
    public final f j;
    public final yjp0 k;
    public Float l;
    public Float m;
    public Float n;
    public Float o;
    public float p;
    public final bpn0 q;
    public final bpn0 r;
    public ValueAnimator s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransformController.kt */
    public static final class ScaleType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScaleType[] $VALUES;
        public static final ScaleType CROP;
        public static final ScaleType FIT;

        static {
            ScaleType scaleType = new ScaleType("FIT", 0);
            FIT = scaleType;
            ScaleType scaleType2 = new ScaleType("CROP", 1);
            CROP = scaleType2;
            ScaleType[] scaleTypeArr = {scaleType, scaleType2};
            $VALUES = scaleTypeArr;
            $ENTRIES = new asp(scaleTypeArr);
        }

        public ScaleType() {
            throw null;
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) $VALUES.clone();
        }
    }

    /* compiled from: TransformController.kt */
    public interface a {
        void a(float f, float f2, float f3, float f4);

        void b(ScaleType scaleType);
    }

    /* compiled from: TransformController.kt */
    public static final class b implements TypeEvaluator<vna0> {
        @Override // android.animation.TypeEvaluator
        public final vna0 evaluate(float f, vna0 vna0Var, vna0 vna0Var2) {
            vna0 vna0Var3 = vna0Var;
            vna0 vna0Var4 = vna0Var2;
            float f2 = 1 - f;
            return new vna0((vna0Var4.a * f) + (vna0Var3.a * f2), (vna0Var4.b * f) + (vna0Var3.b * f2), (vna0Var4.c * f) + (vna0Var3.c * f2));
        }
    }

    /* compiled from: TransformController.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TransformController.kt */
    public interface d {
        void b(float f);
    }

    /* compiled from: TransformController.kt */
    public static final class f implements one.video.player.f {
        public f() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            cms0 cms0Var;
            TransformController.this.h((cVar == null || (cms0Var = (cms0) cVar.c) == null) ? null : cms0Var.c());
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void x(OneVideoPlayer oneVideoPlayer) {
            cms0 cms0Var;
            one.video.player.tracks.c E = oneVideoPlayer.E();
            Size c = (E == null || (cms0Var = (cms0) E.c) == null) ? null : cms0Var.c();
            TransformController transformController = TransformController.this;
            transformController.h(c);
            if (transformController.f.e()) {
                transformController.k(transformController.e);
                transformController.b();
            }
        }
    }

    /* compiled from: TransformController.kt */
    public static final class g implements wna0.a {
        public g() {
        }

        @Override // xsna.wna0.a
        public final void b() {
            TransformController transformController = TransformController.this;
            transformController.b();
            vna0 vna0Var = transformController.c().e;
            float f = vna0Var.a;
            if (f != transformController.p) {
                transformController.p = f;
                d dVar = transformController.d;
                if (dVar != null) {
                    dVar.b(f);
                }
            }
            ScaleType scaleType = vna0Var.a < (transformController.f.a() + transformController.f.b()) / ((float) 2) ? ScaleType.FIT : ScaleType.CROP;
            if (scaleType != transformController.e) {
                transformController.e = scaleType;
                if (wn80.C) {
                    View view = transformController.h;
                    if (view != null && view.isHapticFeedbackEnabled()) {
                        view.performHapticFeedback(6);
                    }
                } else {
                    View view2 = transformController.h;
                    if (view2 != null && view2.isHapticFeedbackEnabled()) {
                        view2.performHapticFeedback(11);
                    }
                }
                Iterator it = transformController.b.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(scaleType);
                }
            }
        }

        @Override // xsna.wna0.a
        public final void onFinish() {
            TransformController transformController = TransformController.this;
            float b = transformController.f.b();
            float a = transformController.f.a();
            float f = transformController.c().e.a;
            if (b >= f || f >= a) {
                return;
            }
            transformController.a(transformController.e);
        }
    }

    public TransformController() {
        this(null);
    }

    public final void a(ScaleType scaleType) {
        float b2;
        int i = c.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i == 1) {
            b2 = this.f.b();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = this.f.a();
        }
        c().getClass();
        vna0 vna0Var = new vna0(b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new b(), c().e, vna0Var);
        ofObject.setDuration(100L);
        ofObject.addListener(new e());
        ofObject.addUpdateListener(new ogu(this, 1));
        ofObject.start();
        this.s = ofObject;
    }

    public final void b() {
        float f2;
        xjp0 xjp0Var = this.a;
        if (xjp0Var == null) {
            return;
        }
        float c2 = this.f.c();
        float d2 = this.f.d();
        float f3 = 1.0f;
        if (d2 > c2) {
            float f4 = c2 / d2;
            f2 = 1.0f;
            f3 = f4;
        } else {
            f2 = d2 / c2;
        }
        float f5 = c().e.a;
        float f6 = c().e.b;
        float f7 = c().e.c;
        float f8 = f3 * f5;
        float f9 = f5 * f2;
        if (epx.d(this.l, f8) && epx.d(this.m, f9) && epx.d(this.n, f6) && epx.d(this.o, f7)) {
            return;
        }
        this.l = Float.valueOf(f8);
        this.m = Float.valueOf(f9);
        this.n = Float.valueOf(f6);
        this.o = Float.valueOf(f7);
        xjp0Var.a(f8, f9, f6, f7);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f8, f9, f6, f7);
        }
    }

    public final wna0 c() {
        return (wna0) this.r.getValue();
    }

    public final void d(MotionEvent motionEvent) {
        if (this.c && this.f.e()) {
            wna0 c2 = c();
            c2.getClass();
            if (motionEvent.getAction() == 2) {
                if (motionEvent.getPointerCount() >= 2) {
                    wna0.b bVar = c2.i;
                    wna0.b bVar2 = wna0.b.TWO_FINGERS;
                    if (bVar != bVar2) {
                        c2.b = null;
                        c2.i = bVar2;
                    }
                }
                if (motionEvent.getPointerCount() == 1) {
                    wna0.b bVar3 = c2.i;
                    wna0.b bVar4 = wna0.b.ONE_FINGER;
                    if (bVar3 != bVar4) {
                        c2.b = null;
                        c2.i = bVar4;
                    }
                }
            } else {
                c2.b = null;
                c2.i = wna0.b.NONE;
                c2.a.onFinish();
            }
            int i = wna0.c.$EnumSwitchMapping$0[c2.i.ordinal()];
            if (i == 1) {
                PointF pointF = new PointF(motionEvent.getX(0), motionEvent.getY(0));
                if (egi.e(pointF)) {
                    c2.a(pointF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c2.b = pointF;
                    c2.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            PointF pointF2 = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            PointF pointF3 = new PointF(motionEvent.getX(1), motionEvent.getY(1));
            if (egi.e(pointF2) && egi.e(pointF3)) {
                float f2 = 2;
                PointF pointF4 = new PointF((pointF2.x + pointF3.x) / f2, (pointF2.y + pointF3.y) / f2);
                float length = new PointF(pointF2.x - pointF3.x, pointF2.y - pointF3.y).length();
                c2.a(pointF4, length);
                c2.b = pointF4;
                c2.c = length;
            }
        }
    }

    public final void e(OneVideoPlayer oneVideoPlayer) {
        one.video.player.tracks.c E;
        cms0 cms0Var;
        if (epx.f(this.g, oneVideoPlayer)) {
            return;
        }
        h((oneVideoPlayer == null || (E = oneVideoPlayer.E()) == null || (cms0Var = (cms0) E.c) == null) ? null : cms0Var.c());
        if (this.f.e()) {
            k(this.e);
            b();
        }
        OneVideoPlayer oneVideoPlayer2 = this.g;
        f fVar = this.j;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.c0(fVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(fVar);
        }
        this.g = oneVideoPlayer;
    }

    public final void f(ScaleType scaleType, boolean z) {
        ScaleType scaleType2 = this.e;
        if (scaleType != scaleType2) {
            this.e = scaleType;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b(scaleType);
            }
        }
        if (this.f.e()) {
            if (scaleType2 == scaleType) {
                k(scaleType);
                b();
            } else {
                if (z) {
                    a(scaleType);
                    return;
                }
                ValueAnimator valueAnimator = this.s;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                k(scaleType);
                b();
            }
        }
    }

    public final void h(Size size) {
        if (epx.f(this.f.b, size)) {
            return;
        }
        r5h0 r5h0Var = this.f;
        Size size2 = r5h0Var.a;
        r5h0Var.getClass();
        this.f = new r5h0(size2, size);
        wna0 c2 = c();
        r5h0 r5h0Var2 = this.f;
        c2.j = r5h0Var2;
        if (r5h0Var2.e()) {
            b();
        }
    }

    public final void i(Size size) {
        if (epx.f(this.f.a, size)) {
            return;
        }
        r5h0 r5h0Var = this.f;
        Size size2 = r5h0Var.b;
        r5h0Var.getClass();
        this.f = new r5h0(size, size2);
        wna0 c2 = c();
        r5h0 r5h0Var2 = this.f;
        c2.j = r5h0Var2;
        if (r5h0Var2.e()) {
            k(this.e);
            b();
        }
    }

    public final void j(View view) {
        if (epx.f(this.h, view)) {
            return;
        }
        i(view != null ? new Size(view.getWidth(), view.getHeight()) : null);
        View view2 = this.h;
        yjp0 yjp0Var = this.k;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(yjp0Var);
        }
        if (view != null) {
            view.addOnLayoutChangeListener(yjp0Var);
        }
        this.h = view;
    }

    public final void k(ScaleType scaleType) {
        float b2;
        int i = c.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i == 1) {
            b2 = this.f.b();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = this.f.a();
        }
        c().b(b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [xsna.yjp0] */
    public TransformController(xjp0 xjp0Var) {
        this.a = xjp0Var;
        this.b = new CopyOnWriteArrayList();
        this.c = true;
        this.e = ScaleType.FIT;
        this.f = new r5h0(null, null);
        this.j = new f();
        this.k = new View.OnLayoutChangeListener() { // from class: xsna.yjp0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                TransformController.this.i(new Size(i3 - i, i4 - i2));
            }
        };
        this.p = 1.0f;
        this.q = new bpn0(new f880(this, 26));
        this.r = new bpn0(new x2j0(this, 6));
    }

    /* compiled from: TransformController.kt */
    public static final class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            TransformController.this.s = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
