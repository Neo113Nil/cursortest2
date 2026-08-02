package xsna;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import ru.ok.proto.PublisherConfiguration;
import xsna.qlo;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes13.dex */
public final class jdc extends otw<ObjectAnimator> {
    public static final int[] k = {0, PublisherConfiguration.DEFAULT_MAX_MTU, 2700, 4050};
    public static final int[] l = {667, 2017, 3367, 4717};
    public static final int[] m = {1000, 2350, 3700, 5050};
    public static final a n = new a(Float.class, "animationFraction");
    public static final b o = new b(Float.class, "completeEndFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final ilq e;
    public final qdc f;
    public int g;
    public float h;
    public float i;
    public lf2 j;

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class a extends Property<jdc, Float> {
        @Override // android.util.Property
        public final Float get(jdc jdcVar) {
            return Float.valueOf(jdcVar.h);
        }

        @Override // android.util.Property
        public final void set(jdc jdcVar, Float f) {
            jdc jdcVar2 = jdcVar;
            float floatValue = f.floatValue();
            jdcVar2.h = floatValue;
            int i = (int) (floatValue * 5400.0f);
            ilq ilqVar = jdcVar2.e;
            ArrayList arrayList = jdcVar2.b;
            qlo.a aVar = (qlo.a) arrayList.get(0);
            float f2 = jdcVar2.h * 1520.0f;
            aVar.a = (-20.0f) + f2;
            aVar.b = f2;
            for (int i2 = 0; i2 < 4; i2++) {
                aVar.b = (ilqVar.getInterpolation(otw.b(i, jdc.k[i2], 667)) * 250.0f) + aVar.b;
                aVar.a = (ilqVar.getInterpolation(otw.b(i, jdc.l[i2], 667)) * 250.0f) + aVar.a;
            }
            float f3 = aVar.a;
            float f4 = aVar.b;
            aVar.a = (((f4 - f3) * jdcVar2.i) + f3) / 360.0f;
            aVar.b = f4 / 360.0f;
            int i3 = 0;
            while (true) {
                if (i3 >= 4) {
                    break;
                }
                float b = otw.b(i, jdc.m[i3], 333);
                if (b >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && b <= 1.0f) {
                    int i4 = i3 + jdcVar2.g;
                    int[] iArr = jdcVar2.f.c;
                    int length = i4 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    int i5 = iArr[length];
                    int i6 = iArr[length2];
                    float interpolation = ilqVar.getInterpolation(b);
                    qlo.a aVar2 = (qlo.a) arrayList.get(0);
                    ak3 ak3Var = ak3.a;
                    Integer valueOf = Integer.valueOf(i5);
                    Integer valueOf2 = Integer.valueOf(i6);
                    ak3Var.getClass();
                    aVar2.c = ak3.a(interpolation, valueOf, valueOf2).intValue();
                    break;
                }
                i3++;
            }
            jdcVar2.a.invalidateSelf();
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class b extends Property<jdc, Float> {
        @Override // android.util.Property
        public final Float get(jdc jdcVar) {
            return Float.valueOf(jdcVar.i);
        }

        @Override // android.util.Property
        public final void set(jdc jdcVar, Float f) {
            jdcVar.i = f.floatValue();
        }
    }

    public jdc(@NonNull qdc qdcVar) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = qdcVar;
        this.e = new ilq();
    }

    @Override // xsna.otw
    public final void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // xsna.otw
    public final void c() {
        this.g = 0;
        ((qlo.a) this.b.get(0)).c = this.f.c[0];
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.otw
    public final void d(@NonNull a.c cVar) {
        this.j = cVar;
    }

    @Override // xsna.otw
    public final void e() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.a.isVisible()) {
            this.d.start();
        } else {
            a();
        }
    }

    @Override // xsna.otw
    public final void f() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, n, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration(5400L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new hdc(this));
        }
        int i = 0;
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, o, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration(333L);
            this.d.setInterpolator(this.e);
            this.d.addListener(new idc(this, i));
        }
        this.g = 0;
        ((qlo.a) this.b.get(0)).c = this.f.c[0];
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c.start();
    }

    @Override // xsna.otw
    public final void g() {
        this.j = null;
    }
}
