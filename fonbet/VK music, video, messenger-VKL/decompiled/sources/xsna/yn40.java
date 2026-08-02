package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.view.vkmix.models.MusicMixMood;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.agn;
import xsna.fh7;
import xsna.io40;
import xsna.k2t;
import xsna.l2t;
import xsna.lh6;
import xsna.o0;

/* compiled from: MusicMixAnimationGLView.kt */
/* loaded from: classes3.dex */
public final class yn40 extends lh6 implements nhl {
    public static final /* synthetic */ int C = 0;
    public volatile xm6 A;
    public List<fo40> B;
    public final double n;
    public final utk0 o;
    public final utk0 p;
    public final ValueAnimator q;
    public final utk0 r;
    public final utk0 s;
    public final utk0 t;
    public final bpn0 u;
    public final Object v;
    public ValueAnimator w;
    public boolean x;
    public boolean y;
    public long z;

    public yn40(Context context) {
        super(context, null);
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new l2t.b(8, 16));
        double uptimeMillis = SystemClock.uptimeMillis() / 1000.0d;
        this.n = uptimeMillis;
        this.o = vtk0.a(Float.valueOf((float) ((SystemClock.uptimeMillis() / 1000.0d) - uptimeMillis)));
        this.p = vtk0.a(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.q = new ValueAnimator();
        bo40 bo40Var = bo40.d;
        ao40 ao40Var = ao40.c;
        do40 do40Var = do40.c;
        utk0 a = vtk0.a(new oo40(bo40Var, bo40Var, ao40Var, ao40Var, do40Var, do40Var, 0L, (izs) null, 384));
        this.r = a;
        this.s = vtk0.a(new lh6.a(1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((oo40) a.getValue()).c, ((oo40) a.getValue()).a.a, ((oo40) a.getValue()).a.b, ((oo40) a.getValue()).a.c, ((oo40) a.getValue()).e));
        this.t = vtk0.a(Float.valueOf(1.0f));
        this.u = new bpn0(new m1y(this, 11));
        this.v = msy.a(LazyThreadSafetyMode.NONE, new mh3(14, context, this));
        this.B = fo40.f;
    }

    public static final void e(yn40 yn40Var, MusicMixMood musicMixMood) {
        Object obj;
        utk0 utk0Var = yn40Var.r;
        oo40 oo40Var = (oo40) utk0Var.getValue();
        Iterator<T> it = yn40Var.B.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((fo40) obj).a == musicMixMood) {
                    break;
                }
            }
        }
        fo40 fo40Var = (fo40) obj;
        if (fo40Var == null && (fo40Var = (fo40) j5g.a0(yn40Var.B)) == null) {
            fo40Var = (fo40) j5g.Y(fo40.f);
        }
        yn40Var.z = SystemClock.uptimeMillis();
        utk0 utk0Var2 = yn40Var.p;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        utk0Var2.getClass();
        utk0Var2.i(null, valueOf);
        yn40Var.x = false;
        do40 do40Var = oo40Var.f;
        do40 do40Var2 = do40.c;
        if (epx.f(do40Var, do40Var2) || epx.f(fo40Var.e, do40Var2)) {
            utk0Var.i(null, new oo40(oo40Var.b, fo40Var.c, oo40Var.d, fo40Var.d, oo40Var.f, fo40Var.e, 800L, epx.f(oo40Var.f, do40Var2) ? rn40.b : sn40.b, 256));
        } else {
            utk0Var.i(null, new oo40(oo40Var.b, fo40Var.c, oo40Var.d, ao40.e, oo40Var.f, do40.d, 250L, qn40.b, new nh3(19, yn40Var, fo40Var)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ti getAccelerometerController() {
        return (ti) this.v.getValue();
    }

    private final tn40 getInfiniteAnimatorListener() {
        return (tn40) this.u.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(oo40 oo40Var) {
        ao40 ao40Var;
        zn40 zn40Var;
        eo40 eo40Var;
        eo40 eo40Var2;
        do40 do40Var;
        izs<Float, Float> izsVar = oo40Var.h;
        do40 do40Var2 = oo40Var.f;
        ao40 ao40Var2 = oo40Var.d;
        bo40 bo40Var = oo40Var.a;
        bo40 bo40Var2 = oo40Var.b;
        float floatValue = ((Number) izsVar.invoke(this.p.getValue())).floatValue();
        utk0 utk0Var = this.s;
        lh6.a aVar = (lh6.a) utk0Var.getValue();
        if (floatValue >= 1.0f) {
            ao40Var = ao40Var2;
        } else {
            ao40 ao40Var3 = oo40Var.c;
            PointF pointF = ao40Var3.a;
            float f = pointF.x;
            PointF pointF2 = ao40Var2.a;
            float b = u11.b(pointF2.x, f, floatValue, f);
            float f2 = pointF.y;
            PointF pointF3 = new PointF(b, u11.b(pointF2.y, f2, floatValue, f2));
            float f3 = ao40Var3.b;
            ao40Var = new ao40(pointF3, u11.b(ao40Var2.b, f3, floatValue, f3));
        }
        if (floatValue >= 1.0f) {
            zn40Var = bo40Var2.a;
        } else {
            zn40 zn40Var2 = bo40Var.a;
            zn40 zn40Var3 = bo40Var2.a;
            zn40Var = new zn40(emi.u((float[]) zn40Var2.a, (float[]) zn40Var3.a, floatValue), emi.u((float[]) zn40Var2.b, (float[]) zn40Var3.b, floatValue), emi.u((float[]) zn40Var2.c, (float[]) zn40Var3.c, floatValue));
        }
        if (floatValue >= 1.0f) {
            eo40Var = bo40Var2.b;
        } else {
            eo40 eo40Var3 = bo40Var.b;
            eo40 eo40Var4 = bo40Var2.b;
            eo40Var = new eo40(emi.u((float[]) eo40Var3.a, (float[]) eo40Var4.a, floatValue), emi.u((float[]) eo40Var3.b, (float[]) eo40Var4.b, floatValue), emi.u((float[]) eo40Var3.c, (float[]) eo40Var4.c, floatValue));
        }
        if (floatValue >= 1.0f) {
            eo40Var2 = bo40Var2.c;
        } else {
            eo40 eo40Var5 = bo40Var.c;
            eo40 eo40Var6 = bo40Var2.c;
            eo40Var2 = new eo40(emi.u((float[]) eo40Var5.a, (float[]) eo40Var6.a, floatValue), emi.u((float[]) eo40Var5.b, (float[]) eo40Var6.b, floatValue), emi.u((float[]) eo40Var5.c, (float[]) eo40Var6.c, floatValue));
        }
        if (floatValue >= 1.0f) {
            do40Var = do40Var2;
        } else {
            do40 do40Var3 = oo40Var.e;
            float[] u = emi.u(do40Var3.a, do40Var2.a, floatValue);
            int i = do40Var3.b;
            int i2 = do40Var2.b;
            double d = floatValue;
            if (d >= 0.01d) {
                i = d > 0.99d ? i2 : i | i2;
            }
            do40Var = new do40(u, i);
        }
        lh6.a a = lh6.a.a(aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ao40Var, zn40Var, eo40Var, eo40Var2, do40Var, 7);
        utk0Var.getClass();
        utk0Var.i(null, a);
    }

    public final void g() {
        if (this.y) {
            ti accelerometerController = getAccelerometerController();
            accelerometerController.c = false;
            ((SensorManager) accelerometerController.e.getValue()).unregisterListener((si) accelerometerController.f.getValue());
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    public final void h() {
        if (this.y) {
            ti accelerometerController = getAccelerometerController();
            if (!accelerometerController.c) {
                accelerometerController.c = true;
                ((SensorManager) accelerometerController.e.getValue()).registerListener((si) accelerometerController.f.getValue(), ((SensorManager) accelerometerController.e.getValue()).getDefaultSensor(9), 1);
            }
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
        xm6 xm6Var = this.A;
        if (xm6Var != null) {
            xm6Var.invoke();
        }
        this.A = null;
    }

    public final void i(f5z f5zVar, utk0 utk0Var, boolean z, ovj ovjVar) {
        androidx.lifecycle.j a = g5z.a(f5zVar);
        utk0 utk0Var2 = this.s;
        utk0 utk0Var3 = this.t;
        b2t b2tVar = new b2t(getContext());
        utk0 a2 = vtk0.a(lh6.d((lh6.a) utk0Var2.getValue()));
        myc0.h(a, ovjVar, null, new mh6(utk0Var2, a2, this, null), 2);
        myc0.h(a, ovjVar, null, new nh6(utk0Var3, this, null), 2);
        int i = 8;
        List<? extends k2t.a> l = e43.l(new io40.b(a2, utk0Var3, new h6(a, 9), new we0(b2tVar, i)), new fh7.a(new we0(b2tVar, i)), new o0.a(new we0(b2tVar, i)));
        z1t z1tVar = new z1t();
        z1tVar.b = new Size(0, 0);
        z1tVar.c = l;
        List<? extends k2t.a> list = l;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k2t.a) it.next()).a(z1tVar.b));
        }
        z1tVar.d = new agn.a(b2tVar);
        setRenderer(z1tVar);
        f5zVar.getLifecycle().addObserver(this);
        myc0.h(a, ovjVar, null, new un40(utk0Var, this, null), 2);
        myc0.h(a, ovjVar, null, new vn40(this, null), 2);
        myc0.h(a, ovjVar, null, new wn40(this, null), 2);
        myc0.h(a, ovjVar, null, new xn40(this, null), 2);
        this.y = z;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5000.0f);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(5000L);
        ofFloat.addUpdateListener(getInfiniteAnimatorListener());
        ofFloat.start();
        this.w = ofFloat;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
