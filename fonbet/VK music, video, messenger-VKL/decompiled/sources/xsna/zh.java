package xsna;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.VelocityTracker;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: AbstractStickersGuidesDrawer.kt */
/* loaded from: classes16.dex */
public abstract class zh implements ial0 {
    public final View a;
    public final vru b;
    public boolean c;
    public final VelocityTracker d;
    public final Paint e;
    public final Paint f;
    public final ypa g;
    public final kmr0 h;
    public wah0 i;
    public final x5l0 j;
    public final xpa k;
    public final w98 l;
    public final w98 m;
    public final w98 n;
    public final w98 o;
    public final cov p;
    public final b q;
    public final c r;
    public float s;
    public float t;
    public static final /* synthetic */ qcy<Object>[] v = {new MutablePropertyReference1Impl(zh.class, "isMoveX", "isMoveX()Z", 0), p5j.a(0, zh.class, "isMoveY", "isMoveY()Z", fpf0.a)};
    public static final a u = new a();
    public static final float w = iah0.b(0.2f);
    public static final float x = iah0.b(2.0f);

    /* compiled from: AbstractStickersGuidesDrawer.kt */
    public static final class a {
    }

    /* compiled from: Delegates.kt */
    public static final class b extends wq70<Boolean> {
        public final /* synthetic */ zh b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(zh zhVar) {
            super(r0);
            Boolean bool = Boolean.TRUE;
            this.b = zhVar;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            if (booleanValue) {
                this.b.h.a = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            }
        }
    }

    /* compiled from: Delegates.kt */
    public static final class c extends wq70<Boolean> {
        public final /* synthetic */ zh b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(zh zhVar) {
            super(r0);
            Boolean bool = Boolean.TRUE;
            this.b = zhVar;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            if (booleanValue) {
                this.b.h.b = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            }
        }
    }

    public zh(View view, cng0 cng0Var) {
        this.a = view;
        vru vruVar = new vru();
        this.b = vruVar;
        this.c = true;
        this.d = VelocityTracker.obtain();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#5CD9FF"));
        paint.setStrokeWidth(vruVar.a);
        this.e = paint;
        Paint paint2 = new Paint(paint);
        float[] fArr = vruVar.b;
        paint2.setPathEffect(new DashPathEffect(fArr, fArr[0] * 0.5f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(vruVar.c);
        this.f = paint2;
        this.g = new ypa(0);
        this.h = new kmr0(0);
        this.i = new wah0(0);
        this.j = new x5l0(0);
        this.k = new xpa(0);
        this.l = new w98(0);
        this.m = new w98(0);
        this.n = new w98(0);
        this.o = new w98(0);
        this.p = cng0Var.a(view.getContext(), new defpackage.r(this, 2), new yh(this, 0), new ic(this, 1));
        view.setHapticFeedbackEnabled(true);
        this.q = new b(this);
        this.r = new c(this);
    }

    public static void j(Canvas canvas, r7z r7zVar, Paint paint) {
        canvas.drawLine(r7zVar.a, r7zVar.b, r7zVar.c, r7zVar.d, paint);
    }

    public static boolean p(zh zhVar, float f, float f2, float f3) {
        float f4 = x;
        return q(f, f2, f4) && !q(f3, f2, f4);
    }

    public static boolean q(float f, float f2, float f3) {
        return f <= f2 + f3 && f2 - f3 <= f;
    }

    @Override // xsna.ial0
    public final float a() {
        return this.s;
    }

    @Override // xsna.ial0
    public void b() {
        t();
        this.a.invalidate();
    }

    @Override // xsna.ial0
    public final boolean c() {
        return r();
    }

    @Override // xsna.ial0
    public final float d() {
        return this.t;
    }

    @Override // xsna.ial0
    public final boolean e() {
        return s();
    }

    @Override // xsna.ial0
    public final void f(boolean z) {
        this.c = z;
    }

    @Override // xsna.ial0
    public void g(int i, int i2, int i3, int i4) {
        if ((i == i3 && i2 == i4) || i * i2 == 0) {
            return;
        }
        float f = i * 0.5f;
        float f2 = i2 * 0.5f;
        this.i = new wah0(f, f2, i, i2);
        ypa ypaVar = this.g;
        Path path = ypaVar.a;
        Path path2 = ypaVar.a;
        Path path3 = ypaVar.d;
        Path path4 = ypaVar.c;
        Path path5 = ypaVar.b;
        path.reset();
        path2.moveTo(f, f2);
        path2.lineTo(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path5.reset();
        path5.moveTo(f, f2);
        path5.lineTo(f, i2);
        path4.reset();
        path4.moveTo(f, f2);
        path4.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        path3.reset();
        path3.moveTo(f, f2);
        path3.lineTo(i, f2);
    }

    public void i(Canvas canvas) {
        boolean a2 = l().a();
        Paint paint = this.f;
        ypa ypaVar = this.g;
        if (a2) {
            canvas.drawPath(ypaVar.a, paint);
            canvas.drawPath(ypaVar.b, paint);
        }
        if (l().d()) {
            canvas.drawPath(ypaVar.c, paint);
            canvas.drawPath(ypaVar.d, paint);
        }
    }

    public emv k() {
        return this.m;
    }

    public hmv l() {
        return this.k;
    }

    public emv m() {
        return this.n;
    }

    public emv n() {
        return this.o;
    }

    public emv o() {
        return this.l;
    }

    public final boolean r() {
        return this.q.getValue(this, v[0]).booleanValue();
    }

    public final boolean s() {
        return this.r.getValue(this, v[1]).booleanValue();
    }

    public final void t() {
        l().c(false);
        o().a();
        k().a();
        l().b(false);
        m().a();
        n().a();
        u(true);
        v(true);
        kmr0 kmr0Var = this.h;
        kmr0Var.a = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        kmr0Var.b = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        this.p.reset();
    }

    public final void u(boolean z) {
        this.q.setValue(this, v[0], Boolean.valueOf(z));
    }

    public final void v(boolean z) {
        this.r.setValue(this, v[1], Boolean.valueOf(z));
    }

    public final void w() {
        awt0.p(this.a);
    }
}
