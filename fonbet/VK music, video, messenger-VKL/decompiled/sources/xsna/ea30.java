package xsna;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dzt0;
import xsna.i1u0;
import xsna.w0u0;

/* compiled from: MotionController.java */
/* loaded from: classes11.dex */
public final class ea30 {
    public fey[] A;
    public final View b;
    public final int c;
    public emk[] j;
    public bg3 k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap<String, i1u0> x;
    public HashMap<String, w0u0> y;
    public HashMap<String, dzt0> z;
    public final Rect a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final fb30 f = new fb30();
    public final fb30 g = new fb30();
    public final ca30 h = new ca30();
    public final ca30 i = new ca30();
    public float l = Float.NaN;
    public float m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList<fb30> u = new ArrayList<>();
    public final float[] v = new float[1];
    public final ArrayList<zcy> w = new ArrayList<>();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public ea30(View view) {
        this.b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).getClass();
        }
    }

    public static void f(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float[] fArr, float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        guo guoVar = this.f.b;
        Iterator<fb30> it = this.u.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            fb30 next = it.next();
            guo guoVar2 = next.b;
            if (guoVar2 != null) {
                float f6 = next.d;
                if (f6 < f) {
                    guoVar = guoVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = next.d;
                }
            }
        }
        if (guoVar != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) guoVar.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) guoVar.b(d);
            }
        }
        return f;
    }

    public final void b(double d, float[] fArr, float[] fArr2) {
        float f;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].c(d, dArr);
        this.j[0].e(d, dArr2);
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Arrays.fill(fArr2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int[] iArr = this.o;
        fb30 fb30Var = this.f;
        float f3 = fb30Var.f;
        float f4 = fb30Var.g;
        float f5 = fb30Var.h;
        float f6 = fb30Var.i;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f10;
                f2 = f11;
            } else if (i2 == 2) {
                f4 = f10;
                f9 = f11;
            } else if (i2 == 3) {
                f5 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f6 = f10;
                f8 = f11;
            }
        }
        float f12 = (f7 / 2.0f) + f2;
        float f13 = (f8 / 2.0f) + f9;
        ea30 ea30Var = fb30Var.n;
        if (ea30Var != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            ea30Var.b(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float sin = (float) (((Math.sin(d3) * d2) + f14) - (f5 / 2.0f));
            float cos = (float) ((f15 - (Math.cos(d3) * d2)) - (f6 / 2.0f));
            double d4 = f2;
            double d5 = f9;
            f = 2.0f;
            f4 = cos;
            f12 = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + f16);
            f13 = (float) ((Math.sin(d3) * d5) + (f17 - (Math.cos(d3) * d4)));
            f3 = sin;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fArr[1] = (f6 / f) + f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public final float c() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (i < 100) {
            float f3 = i * f;
            double d3 = f3;
            guo guoVar = this.f.b;
            Iterator<fb30> it = this.u.iterator();
            float f4 = Float.NaN;
            float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (it.hasNext()) {
                fb30 next = it.next();
                guo guoVar2 = next.b;
                float f6 = f;
                if (guoVar2 != null) {
                    float f7 = next.d;
                    if (f7 < f3) {
                        f5 = f7;
                        guoVar = guoVar2;
                    } else if (Float.isNaN(f4)) {
                        f4 = next.d;
                    }
                }
                f = f6;
            }
            float f8 = f;
            if (guoVar != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                d3 = (((float) guoVar.a((f3 - f5) / r16)) * (f4 - f5)) + f5;
            }
            this.j[0].c(d3, this.p);
            float f9 = f2;
            int i2 = i;
            this.f.c(d3, this.o, this.p, fArr, 0);
            if (i2 > 0) {
                f2 = (float) (Math.hypot(d2 - fArr[1], d - fArr[0]) + f9);
            } else {
                f2 = f9;
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
            f = f8;
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(float f, long j, View view, nt8 nt8Var) {
        boolean z;
        boolean z2;
        float f2;
        i1u0.d dVar;
        boolean z3;
        double d;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        i1u0.d dVar2 = null;
        float a = a(null, f);
        int i = this.E;
        if (i != -1) {
            float f8 = 1.0f / i;
            float floor = ((float) Math.floor(a / f8)) * f8;
            float f9 = (a % f8) / f8;
            if (!Float.isNaN(this.F)) {
                f9 = (f9 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            a = ((interpolator != null ? interpolator.getInterpolation(f9) : ((double) f9) > 0.5d ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * f8) + floor;
        }
        HashMap<String, w0u0> hashMap = this.y;
        if (hashMap != null) {
            Iterator<w0u0> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().d(view, a);
            }
        }
        HashMap<String, i1u0> hashMap2 = this.x;
        if (hashMap2 != null) {
            i1u0.d dVar3 = null;
            z = false;
            for (i1u0 i1u0Var : hashMap2.values()) {
                if (i1u0Var instanceof i1u0.d) {
                    dVar3 = (i1u0.d) i1u0Var;
                } else {
                    z |= i1u0Var.e(a, j, view, nt8Var);
                }
            }
            dVar2 = dVar3;
        } else {
            z = false;
        }
        emk[] emkVarArr = this.j;
        fb30 fb30Var = this.f;
        if (emkVarArr != null) {
            double d2 = a;
            emkVarArr[0].c(d2, this.p);
            this.j[0].e(d2, this.q);
            bg3 bg3Var = this.k;
            if (bg3Var != null) {
                double[] dArr = this.p;
                f2 = 1.0f;
                if (dArr.length > 0) {
                    bg3Var.c(d2, dArr);
                    this.k.e(d2, this.q);
                }
            } else {
                f2 = 1.0f;
            }
            if (this.H) {
                dVar = dVar2;
                z3 = z;
                d = d2;
                f3 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f3 = 2.0f;
                double[] dArr3 = this.q;
                boolean z4 = this.d;
                float f10 = fb30Var.f;
                float f11 = fb30Var.g;
                float f12 = fb30Var.h;
                int i2 = 1;
                float f13 = fb30Var.i;
                dVar = dVar2;
                if (iArr.length != 0) {
                    f4 = f11;
                    if (fb30Var.q.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        fb30Var.q = new double[i3];
                        fb30Var.r = new double[i3];
                    }
                } else {
                    f4 = f11;
                }
                Arrays.fill(fb30Var.q, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = fb30Var.q;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    fb30Var.r[i5] = dArr3[i4];
                }
                float f14 = Float.NaN;
                int i6 = 0;
                float f15 = f4;
                float f16 = f12;
                float f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f20 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                while (true) {
                    double[] dArr5 = fb30Var.q;
                    f5 = f13;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f7 = f10;
                    } else {
                        boolean isNaN = Double.isNaN(fb30Var.q[i6]);
                        double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        if (!isNaN) {
                            d3 = fb30Var.q[i6] + ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        }
                        f7 = f10;
                        float f21 = (float) d3;
                        float f22 = (float) fb30Var.r[i6];
                        if (i6 == i2) {
                            f18 = f22;
                            f13 = f5;
                            f10 = f21;
                        } else if (i6 == 2) {
                            f17 = f22;
                            f10 = f7;
                            f13 = f5;
                            f15 = f21;
                        } else if (i6 == 3) {
                            f19 = f22;
                            f10 = f7;
                            f13 = f5;
                            f16 = f21;
                        } else if (i6 == 4) {
                            f20 = f22;
                            f10 = f7;
                            f13 = f21;
                        } else if (i6 == 5) {
                            f10 = f7;
                            f13 = f5;
                            f14 = f21;
                        }
                        i6++;
                        i2 = 1;
                    }
                    f10 = f7;
                    f13 = f5;
                    i6++;
                    i2 = 1;
                }
                float f23 = f10;
                ea30 ea30Var = fb30Var.n;
                if (ea30Var != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    ea30Var.b(d2, fArr, fArr2);
                    float f24 = fArr[0];
                    float f25 = fArr[1];
                    float f26 = fArr2[0];
                    float f27 = fArr2[1];
                    z3 = z;
                    d = d2;
                    double d4 = f23;
                    double d5 = f15;
                    f6 = (float) (((Math.sin(d5) * d4) + f24) - (f16 / 2.0f));
                    float cos = (float) ((f25 - (Math.cos(d5) * d4)) - (f5 / 2.0f));
                    double d6 = f18;
                    double d7 = f17;
                    float cos2 = (float) ((Math.cos(d5) * d4 * d7) + (Math.sin(d5) * d6) + f26);
                    float sin = (float) ((Math.sin(d5) * d4 * d7) + (f27 - (Math.cos(d5) * d6)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos2;
                        dArr3[1] = sin;
                    }
                    if (!Float.isNaN(f14)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(sin, cos2)) + f14));
                    }
                    f15 = cos;
                } else {
                    f6 = f23;
                    z3 = z;
                    d = d2;
                    if (!Float.isNaN(f14)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2((f20 / 2.0f) + f17, (f19 / 2.0f) + f18)) + f14 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                }
                float f28 = f6;
                if (view instanceof iqr) {
                    ((iqr) view).a();
                } else {
                    float f29 = f28 + 0.5f;
                    int i7 = (int) f29;
                    float f30 = f15 + 0.5f;
                    int i8 = (int) f30;
                    int i9 = (int) (f29 + f16);
                    int i10 = (int) (f30 + f5);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (i11 != view.getMeasuredWidth() || i12 != view.getMeasuredHeight() || z4) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view.layout(i7, i8, i9, i10);
                }
                this.d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + r1.getTop()) / f3;
                    float right = (this.D.getRight() + this.D.getLeft()) / f3;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap<String, w0u0> hashMap3 = this.y;
            if (hashMap3 != null) {
                for (w0u0 w0u0Var : hashMap3.values()) {
                    if (w0u0Var instanceof w0u0.d) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view.setRotation(((w0u0.d) w0u0Var).a(a) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr7 = this.q;
                double d8 = dArr7[0];
                double d9 = dArr7[1];
                i1u0.d dVar4 = dVar;
                view.setRotation(dVar4.d(a, j, view, nt8Var) + ((float) Math.toDegrees(Math.atan2(d9, d8))));
                z2 = z3 | dVar4.h;
            } else {
                z2 = z3;
            }
            int i13 = 1;
            while (true) {
                emk[] emkVarArr2 = this.j;
                if (i13 >= emkVarArr2.length) {
                    break;
                }
                emk emkVar = emkVarArr2[i13];
                float[] fArr3 = this.t;
                emkVar.d(d, fArr3);
                cok.b(fb30Var.o.get(this.r[i13 - 1]), view, fArr3);
                i13++;
            }
            ca30 ca30Var = this.h;
            if (ca30Var.c == 0) {
                if (a <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    view.setVisibility(ca30Var.d);
                } else {
                    ca30 ca30Var2 = this.i;
                    if (a >= f2) {
                        view.setVisibility(ca30Var2.d);
                    } else if (ca30Var2.d != ca30Var.d) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i14 = 0;
                while (true) {
                    fey[] feyVarArr = this.A;
                    if (i14 >= feyVarArr.length) {
                        break;
                    }
                    feyVarArr[i14].i(view, a);
                    i14++;
                }
            }
        } else {
            boolean z5 = z;
            float f31 = fb30Var.f;
            fb30 fb30Var2 = this.g;
            float b = u11.b(fb30Var2.f, f31, a, f31);
            float f32 = fb30Var.g;
            float b2 = u11.b(fb30Var2.g, f32, a, f32);
            float f33 = fb30Var.h;
            float f34 = fb30Var2.h;
            float b3 = u11.b(f34, f33, a, f33);
            float f35 = fb30Var.i;
            float f36 = fb30Var2.i;
            float f37 = b + 0.5f;
            int i15 = (int) f37;
            float f38 = b2 + 0.5f;
            int i16 = (int) f38;
            int i17 = (int) (f37 + b3);
            int b4 = (int) (f38 + u11.b(f36, f35, a, f35));
            int i18 = i17 - i15;
            int i19 = b4 - i16;
            if (f34 != f33 || f36 != f35 || this.d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.d = false;
            }
            view.layout(i15, i16, i17, b4);
            z2 = z5;
        }
        HashMap<String, dzt0> hashMap4 = this.z;
        if (hashMap4 != null) {
            for (dzt0 dzt0Var : hashMap4.values()) {
                if (dzt0Var instanceof dzt0.d) {
                    double[] dArr8 = this.q;
                    view.setRotation(((dzt0.d) dzt0Var).a(a) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    dzt0Var.d(view, a);
                }
            }
        }
        return z2;
    }

    public final void e(fb30 fb30Var) {
        fb30Var.d((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x1271  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x1288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, int i2) {
        String str;
        ArrayList arrayList;
        HashSet<String> hashSet;
        Object obj;
        Object obj2;
        String str2;
        String str3;
        String str4;
        String str5;
        char c;
        char c2;
        HashSet<String> hashSet2;
        fb30 fb30Var;
        ArrayList<fb30> arrayList2;
        String str6;
        String str7;
        HashSet<String> hashSet3;
        Object obj3;
        fb30 fb30Var2;
        String str8;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        fb30[] fb30VarArr;
        Object obj8;
        String str9;
        Object obj9;
        Object obj10;
        String str10;
        String str11;
        Object obj11;
        String str12;
        char c3;
        char c4;
        String str13;
        Iterator<String> it;
        dzt0 iVar;
        dzt0 dzt0Var;
        dzt0 dzt0Var2;
        String str14;
        String str15;
        String str16;
        int[] iArr;
        String str17;
        ConstraintAttribute constraintAttribute;
        HashSet<String> hashSet4;
        Iterator<String> it2;
        int i3;
        HashMap<String, Integer> hashMap;
        Iterator<String> it3;
        String str18;
        Object obj12;
        Object obj13;
        Object obj14;
        char c5;
        char c6;
        String str19;
        i1u0 gVar;
        i1u0 i1u0Var;
        i1u0 i1u0Var2;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        HashSet<String> hashSet5;
        String str20;
        String str21;
        String str22;
        String str23;
        HashSet<String> hashSet6;
        String str24;
        Iterator<String> it4;
        Object obj15;
        ArrayList<fb30> arrayList3;
        String str25;
        HashSet<String> hashSet7;
        Object obj16;
        fb30 fb30Var3;
        Object obj17;
        fb30 fb30Var4;
        Object obj18;
        char c7;
        char c8;
        char c9;
        Object obj19;
        w0u0 kVar;
        w0u0 w0u0Var;
        ConstraintAttribute constraintAttribute3;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        float min;
        float f;
        new HashSet();
        HashSet<String> hashSet8 = new HashSet<>();
        HashSet<String> hashSet9 = new HashSet<>();
        HashSet<String> hashSet10 = new HashSet<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        int i4 = this.B;
        fb30 fb30Var5 = this.f;
        if (i4 != -1) {
            fb30Var5.k = i4;
        }
        ca30 ca30Var = this.h;
        float f2 = ca30Var.b;
        ca30 ca30Var2 = this.i;
        if (ca30.c(f2, ca30Var2.b)) {
            hashSet9.add("alpha");
        }
        String str31 = "elevation";
        if (ca30.c(ca30Var.e, ca30Var2.e)) {
            hashSet9.add("elevation");
        }
        int i5 = ca30Var.d;
        int i6 = ca30Var2.d;
        if (i5 != i6 && ca30Var.c == 0 && (i5 == 0 || i6 == 0)) {
            hashSet9.add("alpha");
        }
        String str32 = "rotation";
        if (ca30.c(ca30Var.f, ca30Var2.f)) {
            hashSet9.add("rotation");
        }
        String str33 = "transitionPathRotate";
        if (!Float.isNaN(ca30Var.p) || !Float.isNaN(ca30Var2.p)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(ca30Var.q) || !Float.isNaN(ca30Var2.q)) {
            hashSet9.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (ca30.c(ca30Var.g, ca30Var2.g)) {
            hashSet9.add("rotationX");
        }
        if (ca30.c(ca30Var.h, ca30Var2.h)) {
            hashSet9.add("rotationY");
        }
        Object obj20 = "rotationX";
        if (ca30.c(ca30Var.k, ca30Var2.k)) {
            hashSet9.add("transformPivotX");
        }
        if (ca30.c(ca30Var.l, ca30Var2.l)) {
            hashSet9.add("transformPivotY");
        }
        String str34 = "scaleX";
        if (ca30.c(ca30Var.i, ca30Var2.i)) {
            hashSet9.add("scaleX");
        }
        Object obj21 = "rotationY";
        String str35 = "scaleY";
        if (ca30.c(ca30Var.j, ca30Var2.j)) {
            hashSet9.add("scaleY");
        }
        float f3 = ca30Var.m;
        Object obj22 = NotificationCompat.CATEGORY_PROGRESS;
        if (ca30.c(f3, ca30Var2.m)) {
            hashSet9.add("translationX");
        }
        Object obj23 = "translationX";
        if (ca30.c(ca30Var.n, ca30Var2.n)) {
            hashSet9.add("translationY");
        }
        String str36 = "translationZ";
        if (ca30.c(ca30Var.o, ca30Var2.o)) {
            hashSet9.add("translationZ");
        }
        fb30 fb30Var6 = this.g;
        ArrayList<fb30> arrayList4 = this.u;
        Object obj24 = "translationY";
        ArrayList<zcy> arrayList5 = this.w;
        if (arrayList5 != null) {
            Iterator<zcy> it5 = arrayList5.iterator();
            ArrayList arrayList6 = null;
            while (it5.hasNext()) {
                zcy next = it5.next();
                String str37 = str36;
                if (next instanceof ydy) {
                    ydy ydyVar = (ydy) next;
                    fb30 fb30Var7 = new fb30();
                    str30 = str34;
                    fb30Var7.c = 0;
                    fb30Var7.j = Float.NaN;
                    fb30Var7.k = -1;
                    fb30Var7.l = -1;
                    fb30Var7.m = Float.NaN;
                    fb30Var7.n = null;
                    fb30Var7.o = new LinkedHashMap<>();
                    fb30Var7.p = 0;
                    str26 = str35;
                    fb30Var7.q = new double[18];
                    fb30Var7.r = new double[18];
                    if (fb30Var5.l != -1) {
                        float f4 = ydyVar.a / 100.0f;
                        fb30Var7.d = f4;
                        fb30Var7.c = ydyVar.h;
                        fb30Var7.p = ydyVar.o;
                        float f5 = Float.isNaN(ydyVar.i) ? f4 : ydyVar.i;
                        str28 = str32;
                        float f6 = Float.isNaN(ydyVar.j) ? f4 : ydyVar.j;
                        str27 = str31;
                        float f7 = fb30Var6.h - fb30Var5.h;
                        float f8 = fb30Var6.i;
                        float f9 = fb30Var5.i;
                        fb30Var7.e = fb30Var7.d;
                        fb30Var7.h = (int) ((f7 * f5) + r11);
                        fb30Var7.i = (int) (((f8 - f9) * f6) + f9);
                        int i7 = ydyVar.o;
                        str29 = str33;
                        if (i7 == 1) {
                            float f10 = Float.isNaN(ydyVar.k) ? f4 : ydyVar.k;
                            float f11 = fb30Var6.f;
                            float f12 = fb30Var5.f;
                            fb30Var7.f = u11.b(f11, f12, f10, f12);
                            if (!Float.isNaN(ydyVar.l)) {
                                f4 = ydyVar.l;
                            }
                            float f13 = fb30Var6.g;
                            float f14 = fb30Var5.g;
                            fb30Var7.g = u11.b(f13, f14, f4, f14);
                        } else if (i7 != 2) {
                            float f15 = Float.isNaN(ydyVar.k) ? f4 : ydyVar.k;
                            float f16 = fb30Var6.f;
                            float f17 = fb30Var5.f;
                            fb30Var7.f = u11.b(f16, f17, f15, f17);
                            if (!Float.isNaN(ydyVar.l)) {
                                f4 = ydyVar.l;
                            }
                            float f18 = fb30Var6.g;
                            float f19 = fb30Var5.g;
                            fb30Var7.g = u11.b(f18, f19, f4, f19);
                        } else {
                            if (Float.isNaN(ydyVar.k)) {
                                float f20 = fb30Var6.f;
                                float f21 = fb30Var5.f;
                                min = u11.b(f20, f21, f4, f21);
                            } else {
                                min = ydyVar.k * Math.min(f6, f5);
                            }
                            fb30Var7.f = min;
                            if (Float.isNaN(ydyVar.l)) {
                                float f22 = fb30Var6.g;
                                float f23 = fb30Var5.g;
                                f = u11.b(f22, f23, f4, f23);
                            } else {
                                f = ydyVar.l;
                            }
                            fb30Var7.g = f;
                        }
                        fb30Var7.l = fb30Var5.l;
                        fb30Var7.b = guo.c(ydyVar.f);
                        fb30Var7.k = ydyVar.g;
                    } else {
                        str27 = str31;
                        str28 = str32;
                        str29 = str33;
                        int i8 = ydyVar.o;
                        if (i8 == 1) {
                            float f24 = ydyVar.a / 100.0f;
                            fb30Var7.d = f24;
                            fb30Var7.c = ydyVar.h;
                            float f25 = Float.isNaN(ydyVar.i) ? f24 : ydyVar.i;
                            float f26 = Float.isNaN(ydyVar.j) ? f24 : ydyVar.j;
                            float f27 = fb30Var6.h - fb30Var5.h;
                            float f28 = fb30Var6.i - fb30Var5.i;
                            fb30Var7.e = fb30Var7.d;
                            if (!Float.isNaN(ydyVar.k)) {
                                f24 = ydyVar.k;
                            }
                            float f29 = (fb30Var5.h / 2.0f) + fb30Var5.f;
                            float f30 = fb30Var5.g;
                            float f31 = fb30Var5.i;
                            float f32 = ((fb30Var6.h / 2.0f) + fb30Var6.f) - f29;
                            float f33 = ((fb30Var6.i / 2.0f) + fb30Var6.g) - ((f31 / 2.0f) + f30);
                            float f34 = f32 * f24;
                            float f35 = (f25 * f27) / 2.0f;
                            fb30Var7.f = (int) ((r8 + f34) - f35);
                            float f36 = f24 * f33;
                            float f37 = (f26 * f28) / 2.0f;
                            fb30Var7.g = (int) ((f30 + f36) - f37);
                            fb30Var7.h = (int) (r8 + r13);
                            fb30Var7.i = (int) (f31 + r15);
                            float f38 = Float.isNaN(ydyVar.l) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ydyVar.l;
                            float f39 = (-f33) * f38;
                            float f40 = f32 * f38;
                            fb30Var7.p = 1;
                            float f41 = (int) ((fb30Var5.f + f34) - f35);
                            float f42 = (int) ((fb30Var5.g + f36) - f37);
                            fb30Var7.f = f41 + f39;
                            fb30Var7.g = f42 + f40;
                            fb30Var7.l = fb30Var7.l;
                            fb30Var7.b = guo.c(ydyVar.f);
                            fb30Var7.k = ydyVar.g;
                        } else if (i8 != 2) {
                            float f43 = ydyVar.a / 100.0f;
                            fb30Var7.d = f43;
                            fb30Var7.c = ydyVar.h;
                            float f44 = Float.isNaN(ydyVar.i) ? f43 : ydyVar.i;
                            float f45 = Float.isNaN(ydyVar.j) ? f43 : ydyVar.j;
                            float f46 = fb30Var6.h;
                            float f47 = fb30Var5.h;
                            float f48 = f46 - f47;
                            float f49 = fb30Var6.i;
                            float f50 = fb30Var5.i;
                            float f51 = f49 - f50;
                            fb30Var7.e = fb30Var7.d;
                            float f52 = (f47 / 2.0f) + fb30Var5.f;
                            float f53 = fb30Var5.g;
                            float f54 = ((f46 / 2.0f) + fb30Var6.f) - f52;
                            float f55 = ((f49 / 2.0f) + fb30Var6.g) - ((f50 / 2.0f) + f53);
                            float f56 = (f48 * f44) / 2.0f;
                            fb30Var7.f = (int) (((f54 * f43) + r8) - f56);
                            float f57 = (f51 * f45) / 2.0f;
                            fb30Var7.g = (int) (((f55 * f43) + f53) - f57);
                            fb30Var7.h = (int) (f47 + r34);
                            fb30Var7.i = (int) (f50 + r42);
                            float f58 = Float.isNaN(ydyVar.k) ? f43 : ydyVar.k;
                            float f59 = Float.isNaN(ydyVar.n) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ydyVar.n;
                            float f60 = f58;
                            float f61 = Float.isNaN(ydyVar.l) ? f43 : ydyVar.l;
                            float f62 = Float.isNaN(ydyVar.m) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ydyVar.m;
                            fb30Var7.p = 0;
                            fb30Var7.f = (int) (((f62 * f55) + ((f60 * f54) + fb30Var5.f)) - f56);
                            fb30Var7.g = (int) (((f55 * f61) + ((f54 * f59) + fb30Var5.g)) - f57);
                            fb30Var7.b = guo.c(ydyVar.f);
                            fb30Var7.k = ydyVar.g;
                        } else {
                            float f63 = ydyVar.a / 100.0f;
                            fb30Var7.d = f63;
                            fb30Var7.c = ydyVar.h;
                            float f64 = Float.isNaN(ydyVar.i) ? f63 : ydyVar.i;
                            float f65 = Float.isNaN(ydyVar.j) ? f63 : ydyVar.j;
                            float f66 = fb30Var6.h;
                            float f67 = fb30Var5.h;
                            float f68 = f66 - f67;
                            float f69 = fb30Var6.i;
                            float f70 = fb30Var5.i;
                            float f71 = f69 - f70;
                            fb30Var7.e = fb30Var7.d;
                            float f72 = (f67 / 2.0f) + fb30Var5.f;
                            float f73 = fb30Var5.g;
                            float f74 = (f66 / 2.0f) + fb30Var6.f;
                            float f75 = ((f69 / 2.0f) + fb30Var6.g) - ((f70 / 2.0f) + f73);
                            float f76 = f68 * f64;
                            fb30Var7.f = (int) ((((f74 - f72) * f63) + r8) - (f76 / 2.0f));
                            float f77 = f71 * f65;
                            fb30Var7.g = (int) (((f75 * f63) + f73) - (f77 / 2.0f));
                            fb30Var7.h = (int) (f67 + f76);
                            fb30Var7.i = (int) (f70 + f77);
                            fb30Var7.p = 2;
                            if (!Float.isNaN(ydyVar.k)) {
                                fb30Var7.f = (int) (ydyVar.k * ((int) (i - fb30Var7.h)));
                            }
                            if (!Float.isNaN(ydyVar.l)) {
                                fb30Var7.g = (int) (ydyVar.l * ((int) (i2 - fb30Var7.i)));
                            }
                            fb30Var7.l = fb30Var7.l;
                            fb30Var7.b = guo.c(ydyVar.f);
                            fb30Var7.k = ydyVar.g;
                        }
                    }
                    if (Collections.binarySearch(arrayList4, fb30Var7) == 0) {
                        Log.e("MotionController", " KeyPath position \"" + fb30Var7.e + "\" outside of range");
                    }
                    arrayList4.add((-r8) - 1, fb30Var7);
                    int i9 = ydyVar.e;
                    if (i9 != -1) {
                        this.e = i9;
                    }
                } else {
                    str26 = str35;
                    str27 = str31;
                    str28 = str32;
                    str29 = str33;
                    str30 = str34;
                    if (next instanceof edy) {
                        next.d(hashSet10);
                    } else if (next instanceof eey) {
                        next.d(hashSet8);
                    } else if (next instanceof fey) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        ArrayList arrayList7 = arrayList6;
                        arrayList7.add((fey) next);
                        arrayList6 = arrayList7;
                    } else {
                        next.f(hashMap2);
                        next.d(hashSet9);
                    }
                }
                str36 = str37;
                str34 = str30;
                str35 = str26;
                str32 = str28;
                str31 = str27;
                str33 = str29;
            }
            str = str36;
            arrayList = arrayList6;
        } else {
            str = "translationZ";
            arrayList = null;
        }
        String str38 = str35;
        String str39 = str31;
        String str40 = str32;
        String str41 = str33;
        String str42 = str34;
        if (arrayList != null) {
            this.A = (fey[]) arrayList.toArray(new fey[0]);
        }
        boolean isEmpty = hashSet9.isEmpty();
        String str43 = "CUSTOM,";
        String str44 = StringUtils.COMMA;
        if (isEmpty) {
            hashSet = hashSet8;
            obj = obj22;
            obj2 = obj23;
            str2 = str38;
            str3 = str40;
            str4 = str39;
            str5 = str41;
            c = 3;
            c2 = 4;
            hashSet2 = hashSet10;
            fb30Var = fb30Var6;
            arrayList2 = arrayList4;
            str6 = str;
            str7 = str42;
            hashSet3 = hashSet9;
            obj3 = obj24;
            fb30Var2 = fb30Var5;
        } else {
            this.y = new HashMap<>();
            Iterator<String> it6 = hashSet9.iterator();
            while (it6.hasNext()) {
                String next2 = it6.next();
                if (!next2.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    switch (next2.hashCode()) {
                        case -1249320806:
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            if (next2.equals(obj18)) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1249320805:
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            Object obj25 = obj21;
                            if (next2.equals(obj25)) {
                                obj21 = obj25;
                                obj18 = obj20;
                                c7 = 1;
                                break;
                            } else {
                                obj21 = obj25;
                                obj18 = obj20;
                                c7 = 65535;
                                break;
                            }
                        case -1225497657:
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            if (next2.equals(obj17)) {
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = 2;
                                break;
                            }
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -1225497656:
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            if (next2.equals(obj16)) {
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = 3;
                                break;
                            }
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -1225497655:
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            if (next2.equals(str25)) {
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = 4;
                                break;
                            }
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -1001078227:
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            if (next2.equals(obj15)) {
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = 5;
                                break;
                            }
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -908189618:
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            if (next2.equals(str24)) {
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = 6;
                                break;
                            }
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -908189617:
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            if (next2.equals(str20)) {
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = 7;
                                break;
                            }
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -797520672:
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            if (next2.equals("waveVariesBy")) {
                                str20 = str38;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = '\b';
                                break;
                            }
                            str20 = str38;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -760884510:
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            if (next2.equals("transformPivotX")) {
                                c8 = '\t';
                                String str45 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = c8;
                                str20 = str38;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str45;
                                break;
                            }
                            str20 = str38;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -760884509:
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            if (next2.equals("transformPivotY")) {
                                c8 = '\n';
                                String str452 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = c8;
                                str20 = str38;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str452;
                                break;
                            }
                            str20 = str38;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -40300674:
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            if (next2.equals(str21)) {
                                c8 = 11;
                                String str4522 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = c8;
                                str20 = str38;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str4522;
                                break;
                            }
                            str20 = str38;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case -4379043:
                            str22 = str39;
                            str23 = str41;
                            if (next2.equals(str22)) {
                                str20 = str38;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = '\f';
                                str21 = str40;
                                break;
                            } else {
                                str20 = str38;
                                str21 = str40;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = 65535;
                                break;
                            }
                        case 37232917:
                            str23 = str41;
                            if (next2.equals(str23)) {
                                str20 = str38;
                                str21 = str40;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = '\r';
                                str22 = str39;
                                break;
                            } else {
                                str20 = str38;
                                str21 = str40;
                                str22 = str39;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = 65535;
                                break;
                            }
                        case 92909918:
                            if (next2.equals("alpha")) {
                                c9 = 14;
                                str20 = str38;
                                str21 = str40;
                                str22 = str39;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = c9;
                                str23 = str41;
                                break;
                            }
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        case 156108012:
                            if (next2.equals("waveOffset")) {
                                c9 = 15;
                                str20 = str38;
                                str21 = str40;
                                str22 = str39;
                                hashSet6 = hashSet10;
                                str24 = str42;
                                it4 = it6;
                                obj15 = obj22;
                                arrayList3 = arrayList4;
                                str25 = str;
                                hashSet7 = hashSet9;
                                obj16 = obj24;
                                fb30Var3 = fb30Var5;
                                obj17 = obj23;
                                fb30Var4 = fb30Var6;
                                obj18 = obj20;
                                c7 = c9;
                                str23 = str41;
                                break;
                            }
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                        default:
                            str20 = str38;
                            str21 = str40;
                            str22 = str39;
                            str23 = str41;
                            hashSet6 = hashSet10;
                            str24 = str42;
                            it4 = it6;
                            obj15 = obj22;
                            arrayList3 = arrayList4;
                            str25 = str;
                            hashSet7 = hashSet9;
                            obj16 = obj24;
                            fb30Var3 = fb30Var5;
                            obj17 = obj23;
                            fb30Var4 = fb30Var6;
                            obj18 = obj20;
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case 0:
                            obj20 = obj18;
                            obj19 = obj17;
                            w0u0Var = new w0u0.i();
                            break;
                        case 1:
                            obj20 = obj18;
                            obj19 = obj17;
                            w0u0Var = new w0u0.j();
                            break;
                        case 2:
                            obj20 = obj18;
                            obj19 = obj17;
                            w0u0Var = new w0u0.m();
                            break;
                        case 3:
                            obj20 = obj18;
                            obj19 = obj17;
                            w0u0Var = new w0u0.n();
                            break;
                        case 4:
                            obj20 = obj18;
                            obj19 = obj17;
                            w0u0Var = new w0u0.o();
                            break;
                        case 5:
                            obj20 = obj18;
                            w0u0.g gVar2 = new w0u0.g();
                            obj19 = obj17;
                            gVar2.f = false;
                            w0u0Var = gVar2;
                            break;
                        case 6:
                            kVar = new w0u0.k();
                            w0u0 w0u0Var2 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var2;
                            obj19 = obj17;
                            break;
                        case 7:
                            kVar = new w0u0.l();
                            w0u0 w0u0Var22 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var22;
                            obj19 = obj17;
                            break;
                        case '\b':
                            kVar = new w0u0.a();
                            w0u0 w0u0Var222 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var222;
                            obj19 = obj17;
                            break;
                        case '\t':
                            kVar = new w0u0.e();
                            w0u0 w0u0Var2222 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var2222;
                            obj19 = obj17;
                            break;
                        case '\n':
                            kVar = new w0u0.f();
                            w0u0 w0u0Var22222 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var22222;
                            obj19 = obj17;
                            break;
                        case 11:
                            kVar = new w0u0.h();
                            w0u0 w0u0Var222222 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var222222;
                            obj19 = obj17;
                            break;
                        case '\f':
                            kVar = new w0u0.c();
                            w0u0 w0u0Var2222222 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var2222222;
                            obj19 = obj17;
                            break;
                        case '\r':
                            kVar = new w0u0.d();
                            w0u0 w0u0Var22222222 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var22222222;
                            obj19 = obj17;
                            break;
                        case 14:
                            kVar = new w0u0.a();
                            w0u0 w0u0Var222222222 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var222222222;
                            obj19 = obj17;
                            break;
                        case 15:
                            kVar = new w0u0.a();
                            w0u0 w0u0Var2222222222 = kVar;
                            obj20 = obj18;
                            w0u0Var = w0u0Var2222222222;
                            obj19 = obj17;
                            break;
                        default:
                            obj20 = obj18;
                            obj19 = obj17;
                            w0u0Var = null;
                            break;
                    }
                } else {
                    SparseArray<ConstraintAttribute> sparseArray = new SparseArray<>();
                    String str46 = next2.split(StringUtils.COMMA)[1];
                    Iterator<zcy> it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        zcy next3 = it7.next();
                        HashSet<String> hashSet11 = hashSet8;
                        HashMap<String, ConstraintAttribute> hashMap3 = next3.d;
                        if (hashMap3 != null && (constraintAttribute3 = hashMap3.get(str46)) != null) {
                            sparseArray.append(next3.a, constraintAttribute3);
                        }
                        hashSet8 = hashSet11;
                    }
                    hashSet5 = hashSet8;
                    w0u0.b bVar = new w0u0.b();
                    String str47 = next2.split(StringUtils.COMMA)[1];
                    bVar.f = sparseArray;
                    obj19 = obj23;
                    str20 = str38;
                    str21 = str40;
                    str22 = str39;
                    hashSet6 = hashSet10;
                    fb30Var4 = fb30Var6;
                    str24 = str42;
                    w0u0Var = bVar;
                    it4 = it6;
                    obj15 = obj22;
                    str23 = str41;
                    arrayList3 = arrayList4;
                    str25 = str;
                    hashSet7 = hashSet9;
                    obj16 = obj24;
                    fb30Var3 = fb30Var5;
                }
                if (w0u0Var != null) {
                    w0u0Var.e = next2;
                    this.y.put(next2, w0u0Var);
                }
                str41 = str23;
                str39 = str22;
                str40 = str21;
                fb30Var6 = fb30Var4;
                fb30Var5 = fb30Var3;
                obj23 = obj19;
                hashSet8 = hashSet5;
                obj24 = obj16;
                hashSet9 = hashSet7;
                str = str25;
                arrayList4 = arrayList3;
                obj22 = obj15;
                it6 = it4;
                str42 = str24;
                hashSet10 = hashSet6;
                str38 = str20;
            }
            hashSet = hashSet8;
            obj = obj22;
            obj2 = obj23;
            str2 = str38;
            str3 = str40;
            str4 = str39;
            str5 = str41;
            c = 3;
            c2 = 4;
            hashSet2 = hashSet10;
            fb30Var = fb30Var6;
            arrayList2 = arrayList4;
            str6 = str;
            str7 = str42;
            hashSet3 = hashSet9;
            obj3 = obj24;
            fb30Var2 = fb30Var5;
            if (arrayList5 != null) {
                Iterator<zcy> it8 = arrayList5.iterator();
                while (it8.hasNext()) {
                    zcy next4 = it8.next();
                    if (next4 instanceof ddy) {
                        next4.a(this.y);
                    }
                }
            }
            ca30Var.a(this.y, 0);
            ca30Var2.a(this.y, 100);
            Iterator<String> it9 = this.y.keySet().iterator();
            while (it9.hasNext()) {
                String next5 = it9.next();
                int intValue = (!hashMap2.containsKey(next5) || (num = hashMap2.get(next5)) == null) ? 0 : num.intValue();
                Iterator<String> it10 = it9;
                w0u0 w0u0Var3 = this.y.get(next5);
                if (w0u0Var3 != null) {
                    w0u0Var3.c(intValue);
                }
                it9 = it10;
            }
        }
        if (hashSet.isEmpty()) {
            str8 = "CUSTOM,";
            obj4 = obj20;
            obj5 = obj21;
            obj6 = obj2;
        } else {
            if (this.x == null) {
                this.x = new HashMap<>();
            }
            Iterator<String> it11 = hashSet.iterator();
            while (it11.hasNext()) {
                String next6 = it11.next();
                if (!this.x.containsKey(next6)) {
                    if (next6.startsWith(str43)) {
                        SparseArray<ConstraintAttribute> sparseArray2 = new SparseArray<>();
                        it3 = it11;
                        String str48 = next6.split(str44)[1];
                        Iterator<zcy> it12 = arrayList5.iterator();
                        while (it12.hasNext()) {
                            String str49 = str43;
                            zcy next7 = it12.next();
                            HashMap<String, Integer> hashMap4 = hashMap2;
                            HashMap<String, ConstraintAttribute> hashMap5 = next7.d;
                            if (hashMap5 != null && (constraintAttribute2 = hashMap5.get(str48)) != null) {
                                sparseArray2.append(next7.a, constraintAttribute2);
                            }
                            hashMap2 = hashMap4;
                            str43 = str49;
                        }
                        hashMap = hashMap2;
                        str18 = str43;
                        i1u0.b bVar2 = new i1u0.b();
                        bVar2.k = new SparseArray<>();
                        bVar2.i = next6.split(str44)[1];
                        bVar2.j = sparseArray2;
                        i1u0Var2 = bVar2;
                        obj12 = obj20;
                        obj13 = obj21;
                        obj14 = obj2;
                    } else {
                        hashMap = hashMap2;
                        it3 = it11;
                        str18 = str43;
                        switch (next6.hashCode()) {
                            case -1249320806:
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                if (next6.equals(obj12)) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1249320805:
                                obj13 = obj21;
                                obj14 = obj2;
                                if (next6.equals(obj13)) {
                                    obj12 = obj20;
                                    c5 = 1;
                                    break;
                                } else {
                                    obj12 = obj20;
                                    c5 = 65535;
                                    break;
                                }
                            case -1225497657:
                                obj14 = obj2;
                                obj12 = obj20;
                                if (next6.equals(obj14)) {
                                    obj13 = obj21;
                                    c5 = 2;
                                    break;
                                } else {
                                    obj13 = obj21;
                                    c5 = 65535;
                                    break;
                                }
                            case -1225497656:
                                if (next6.equals(obj3)) {
                                    obj12 = obj20;
                                    obj13 = obj21;
                                    c5 = c;
                                    obj14 = obj2;
                                    break;
                                }
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                            case -1225497655:
                                if (next6.equals(str6)) {
                                    obj12 = obj20;
                                    obj13 = obj21;
                                    c5 = c2;
                                    obj14 = obj2;
                                    break;
                                }
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                            case -1001078227:
                                if (next6.equals(obj)) {
                                    c5 = 5;
                                    obj12 = obj20;
                                    obj13 = obj21;
                                    obj14 = obj2;
                                    break;
                                }
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                            case -908189618:
                                if (next6.equals(str7)) {
                                    obj12 = obj20;
                                    obj13 = obj21;
                                    obj14 = obj2;
                                    c5 = 6;
                                    break;
                                }
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                            case -908189617:
                                if (next6.equals(str2)) {
                                    obj12 = obj20;
                                    obj13 = obj21;
                                    obj14 = obj2;
                                    c5 = 7;
                                    break;
                                }
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                            case -40300674:
                                if (next6.equals(str3)) {
                                    obj12 = obj20;
                                    obj13 = obj21;
                                    obj14 = obj2;
                                    c5 = '\b';
                                    break;
                                }
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                            case -4379043:
                                if (next6.equals(str4)) {
                                    c6 = '\t';
                                    c5 = c6;
                                    obj12 = obj20;
                                    obj13 = obj21;
                                    obj14 = obj2;
                                    break;
                                }
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                            case 37232917:
                                if (next6.equals(str5)) {
                                    c6 = '\n';
                                    c5 = c6;
                                    obj12 = obj20;
                                    obj13 = obj21;
                                    obj14 = obj2;
                                    break;
                                }
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                            case 92909918:
                                if (next6.equals("alpha")) {
                                    c6 = 11;
                                    c5 = c6;
                                    obj12 = obj20;
                                    obj13 = obj21;
                                    obj14 = obj2;
                                    break;
                                }
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                            default:
                                obj12 = obj20;
                                obj13 = obj21;
                                obj14 = obj2;
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case 0:
                                str19 = str44;
                                gVar = new i1u0.g();
                                i1u0Var = gVar;
                                break;
                            case 1:
                                str19 = str44;
                                gVar = new i1u0.h();
                                i1u0Var = gVar;
                                break;
                            case 2:
                                str19 = str44;
                                gVar = new i1u0.k();
                                i1u0Var = gVar;
                                break;
                            case 3:
                                str19 = str44;
                                gVar = new i1u0.l();
                                i1u0Var = gVar;
                                break;
                            case 4:
                                str19 = str44;
                                gVar = new i1u0.m();
                                i1u0Var = gVar;
                                break;
                            case 5:
                                i1u0.e eVar = new i1u0.e();
                                str19 = str44;
                                eVar.i = false;
                                i1u0Var = eVar;
                                break;
                            case 6:
                                i1u0Var2 = new i1u0.i();
                                break;
                            case 7:
                                i1u0Var2 = new i1u0.j();
                                break;
                            case '\b':
                                i1u0Var2 = new i1u0.f();
                                break;
                            case '\t':
                                i1u0Var2 = new i1u0.c();
                                break;
                            case '\n':
                                i1u0Var2 = new i1u0.d();
                                break;
                            case 11:
                                i1u0Var2 = new i1u0.a();
                                break;
                            default:
                                str19 = str44;
                                i1u0Var = null;
                                break;
                        }
                        if (i1u0Var != null) {
                            i1u0Var.f = next6;
                            this.x.put(next6, i1u0Var);
                        }
                        obj2 = obj14;
                        obj21 = obj13;
                        str44 = str19;
                        it11 = it3;
                        hashMap2 = hashMap;
                        obj20 = obj12;
                        str43 = str18;
                    }
                    str19 = str44;
                    i1u0Var = i1u0Var2;
                    if (i1u0Var != null) {
                    }
                    obj2 = obj14;
                    obj21 = obj13;
                    str44 = str19;
                    it11 = it3;
                    hashMap2 = hashMap;
                    obj20 = obj12;
                    str43 = str18;
                }
            }
            HashMap<String, Integer> hashMap6 = hashMap2;
            str8 = str43;
            obj4 = obj20;
            obj5 = obj21;
            obj6 = obj2;
            if (arrayList5 != null) {
                Iterator<zcy> it13 = arrayList5.iterator();
                while (it13.hasNext()) {
                    zcy next8 = it13.next();
                    if (next8 instanceof eey) {
                        ((eey) next8).i(this.x);
                    }
                }
            }
            Iterator<String> it14 = this.x.keySet().iterator();
            while (it14.hasNext()) {
                String next9 = it14.next();
                HashMap<String, Integer> hashMap7 = hashMap6;
                if (hashMap7.containsKey(next9)) {
                    it2 = it14;
                    i3 = hashMap7.get(next9).intValue();
                } else {
                    it2 = it14;
                    i3 = 0;
                }
                hashMap6 = hashMap7;
                this.x.get(next9).c(i3);
                it14 = it2;
            }
        }
        int size = arrayList2.size();
        int i10 = size + 2;
        fb30[] fb30VarArr2 = new fb30[i10];
        fb30VarArr2[0] = fb30Var2;
        fb30VarArr2[size + 1] = fb30Var;
        if (arrayList2.size() > 0) {
            fb30VarArr = fb30VarArr2;
            obj7 = obj4;
            if (this.e == -1) {
                this.e = 0;
            }
        } else {
            obj7 = obj4;
            fb30VarArr = fb30VarArr2;
        }
        Iterator<fb30> it15 = arrayList2.iterator();
        int i11 = 1;
        while (it15.hasNext()) {
            fb30VarArr[i11] = it15.next();
            i11++;
        }
        HashSet hashSet12 = new HashSet();
        Iterator<String> it16 = fb30Var.o.keySet().iterator();
        while (it16.hasNext()) {
            String next10 = it16.next();
            Object obj26 = obj5;
            Iterator<String> it17 = it16;
            fb30 fb30Var8 = fb30Var2;
            if (fb30Var8.o.containsKey(next10)) {
                fb30Var2 = fb30Var8;
                hashSet4 = hashSet3;
                if (!hashSet4.contains(str8 + next10)) {
                    hashSet12.add(next10);
                }
            } else {
                fb30Var2 = fb30Var8;
                hashSet4 = hashSet3;
            }
            hashSet3 = hashSet4;
            it16 = it17;
            obj5 = obj26;
        }
        Object obj27 = obj5;
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.r = strArr;
        this.s = new int[strArr.length];
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.r;
            if (i12 < strArr2.length) {
                String str50 = strArr2[i12];
                this.s[i12] = 0;
                int i13 = 0;
                while (true) {
                    if (i13 >= i10) {
                        break;
                    }
                    if (!fb30VarArr[i13].o.containsKey(str50) || (constraintAttribute = fb30VarArr[i13].o.get(str50)) == null) {
                        i13++;
                    } else {
                        int[] iArr2 = this.s;
                        iArr2[i12] = constraintAttribute.c() + iArr2[i12];
                    }
                }
                i12++;
            } else {
                boolean z = fb30VarArr[0].k != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                int i14 = 1;
                while (i14 < i10) {
                    boolean z2 = z;
                    fb30 fb30Var9 = fb30VarArr[i14];
                    boolean[] zArr2 = zArr;
                    fb30 fb30Var10 = fb30VarArr[i14 - 1];
                    int i15 = i14;
                    Object obj28 = obj6;
                    boolean b = fb30.b(fb30Var9.f, fb30Var10.f);
                    boolean b2 = fb30.b(fb30Var9.g, fb30Var10.g);
                    zArr2[0] = zArr2[0] | fb30.b(fb30Var9.e, fb30Var10.e);
                    boolean z3 = b | b2 | z2;
                    zArr2[1] = zArr2[1] | z3;
                    zArr2[2] = zArr2[2] | z3;
                    zArr2[c] = zArr2[c] | fb30.b(fb30Var9.h, fb30Var10.h);
                    zArr2[c2] = zArr2[c2] | fb30.b(fb30Var9.i, fb30Var10.i);
                    i14 = i15 + 1;
                    z = z2;
                    zArr = zArr2;
                    obj6 = obj28;
                }
                Object obj29 = obj6;
                boolean[] zArr3 = zArr;
                int i16 = 0;
                for (int i17 = 1; i17 < length; i17++) {
                    if (zArr3[i17]) {
                        i16++;
                    }
                }
                this.o = new int[i16];
                int max = Math.max(2, i16);
                this.p = new double[max];
                this.q = new double[max];
                int i18 = 0;
                for (int i19 = 1; i19 < length; i19++) {
                    if (zArr3[i19]) {
                        this.o[i18] = i19;
                        i18++;
                    }
                }
                int[] iArr3 = {i10, this.o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr3);
                double[] dArr2 = new double[i10];
                int i20 = 0;
                while (i20 < i10) {
                    fb30 fb30Var11 = fb30VarArr[i20];
                    double[] dArr3 = dArr[i20];
                    int i21 = i20;
                    int[] iArr4 = this.o;
                    Object obj30 = obj3;
                    float f78 = fb30Var11.e;
                    float f79 = fb30Var11.f;
                    float f80 = fb30Var11.g;
                    float f81 = fb30Var11.h;
                    float f82 = fb30Var11.i;
                    float f83 = fb30Var11.j;
                    float[] fArr = new float[6];
                    fArr[0] = f78;
                    fArr[1] = f79;
                    fArr[2] = f80;
                    fArr[c] = f81;
                    fArr[c2] = f82;
                    fArr[5] = f83;
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < iArr4.length) {
                        int i24 = i22;
                        if (iArr4[i22] < 6) {
                            iArr = iArr4;
                            str17 = str6;
                            dArr3[i23] = fArr[r12];
                            i23++;
                        } else {
                            iArr = iArr4;
                            str17 = str6;
                        }
                        i22 = i24 + 1;
                        str6 = str17;
                        iArr4 = iArr;
                    }
                    dArr2[i21] = fb30VarArr[i21].d;
                    i20 = i21 + 1;
                    obj3 = obj30;
                    str6 = str6;
                }
                Object obj31 = obj3;
                String str51 = str6;
                int i25 = 0;
                while (true) {
                    int[] iArr5 = this.o;
                    if (i25 < iArr5.length) {
                        if (iArr5[i25] < 6) {
                            String a = i5s.a(new StringBuilder(), fb30.s[this.o[i25]], " [");
                            int i26 = 0;
                            while (i26 < i10) {
                                StringBuilder e = fw3.e(a);
                                int i27 = i25;
                                e.append(dArr[i26][i27]);
                                a = e.toString();
                                i26++;
                                str7 = str7;
                                i25 = i27;
                            }
                        }
                        i25++;
                        str7 = str7;
                    } else {
                        String str52 = str7;
                        this.j = new emk[this.r.length + 1];
                        int i28 = 0;
                        while (true) {
                            String[] strArr3 = this.r;
                            if (i28 >= strArr3.length) {
                                String str53 = str3;
                                String str54 = str2;
                                this.j[0] = emk.a(this.e, dArr2, dArr);
                                char c10 = 65535;
                                if (fb30VarArr[0].k != -1) {
                                    int[] iArr6 = new int[i10];
                                    double[] dArr4 = new double[i10];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i10, 2);
                                    int i29 = 0;
                                    while (i29 < i10) {
                                        iArr6[i29] = fb30VarArr[i29].k;
                                        int i30 = i29;
                                        dArr4[i30] = r8.d;
                                        double[] dArr6 = dArr5[i30];
                                        dArr6[0] = r8.f;
                                        dArr6[1] = r8.g;
                                        i29 = i30 + 1;
                                    }
                                    this.k = new bg3(iArr6, dArr4, dArr5);
                                }
                                this.z = new HashMap<>();
                                if (arrayList5 != null) {
                                    Iterator<String> it18 = hashSet2.iterator();
                                    float f84 = Float.NaN;
                                    while (it18.hasNext()) {
                                        String next11 = it18.next();
                                        if (next11.startsWith("CUSTOM")) {
                                            str13 = str5;
                                            it = it18;
                                            dzt0Var = new dzt0.b();
                                            obj8 = obj7;
                                            str9 = str52;
                                            obj9 = obj27;
                                            obj10 = obj31;
                                            str10 = str54;
                                            str11 = str51;
                                            obj11 = obj29;
                                            str12 = str53;
                                        } else {
                                            switch (next11.hashCode()) {
                                                case -1249320806:
                                                    obj8 = obj7;
                                                    str9 = str52;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    str12 = str53;
                                                    if (next11.equals(obj8)) {
                                                        c3 = 0;
                                                        break;
                                                    } else {
                                                        c3 = 65535;
                                                        break;
                                                    }
                                                case -1249320805:
                                                    str9 = str52;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    str12 = str53;
                                                    if (next11.equals(obj9)) {
                                                        obj8 = obj7;
                                                        c3 = 1;
                                                        break;
                                                    } else {
                                                        c3 = c10;
                                                        obj8 = obj7;
                                                        break;
                                                    }
                                                case -1225497657:
                                                    str9 = str52;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    str12 = str53;
                                                    if (next11.equals(obj11)) {
                                                        obj8 = obj7;
                                                        obj9 = obj27;
                                                        c3 = 2;
                                                        break;
                                                    } else {
                                                        c3 = c10;
                                                        obj8 = obj7;
                                                        obj9 = obj27;
                                                        break;
                                                    }
                                                case -1225497656:
                                                    str9 = str52;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    str12 = str53;
                                                    if (next11.equals(obj10)) {
                                                        obj8 = obj7;
                                                        obj9 = obj27;
                                                        c3 = c;
                                                    } else {
                                                        c3 = c10;
                                                        obj8 = obj7;
                                                        obj9 = obj27;
                                                    }
                                                    obj11 = obj29;
                                                    break;
                                                case -1225497655:
                                                    str9 = str52;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    str12 = str53;
                                                    if (next11.equals(str11)) {
                                                        obj8 = obj7;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        c3 = c2;
                                                    } else {
                                                        c3 = c10;
                                                        obj8 = obj7;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                    }
                                                    obj11 = obj29;
                                                    break;
                                                case -1001078227:
                                                    str9 = str52;
                                                    str10 = str54;
                                                    str12 = str53;
                                                    if (next11.equals(obj)) {
                                                        c3 = 5;
                                                        obj8 = obj7;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        break;
                                                    }
                                                    c3 = c10;
                                                    obj8 = obj7;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                case -908189618:
                                                    str9 = str52;
                                                    str10 = str54;
                                                    str12 = str53;
                                                    if (next11.equals(str9)) {
                                                        obj8 = obj7;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        c3 = 6;
                                                        break;
                                                    }
                                                    c3 = c10;
                                                    obj8 = obj7;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    break;
                                                case -908189617:
                                                    str10 = str54;
                                                    str12 = str53;
                                                    if (next11.equals(str10)) {
                                                        obj8 = obj7;
                                                        str9 = str52;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        c3 = 7;
                                                        break;
                                                    } else {
                                                        c3 = c10;
                                                        obj8 = obj7;
                                                        str9 = str52;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        break;
                                                    }
                                                case -797520672:
                                                    str12 = str53;
                                                    if (next11.equals("waveVariesBy")) {
                                                        obj8 = obj7;
                                                        str9 = str52;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str10 = str54;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        c3 = '\b';
                                                        break;
                                                    }
                                                    c3 = c10;
                                                    obj8 = obj7;
                                                    str9 = str52;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    break;
                                                case -40300674:
                                                    str12 = str53;
                                                    if (next11.equals(str12)) {
                                                        c3 = '\t';
                                                        obj8 = obj7;
                                                        str9 = str52;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str10 = str54;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        break;
                                                    }
                                                    c3 = c10;
                                                    obj8 = obj7;
                                                    str9 = str52;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                case -4379043:
                                                    if (next11.equals(str4)) {
                                                        c4 = '\n';
                                                        c3 = c4;
                                                        obj8 = obj7;
                                                        str9 = str52;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str10 = str54;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        str12 = str53;
                                                        break;
                                                    }
                                                    c3 = c10;
                                                    obj8 = obj7;
                                                    str9 = str52;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    str12 = str53;
                                                case 37232917:
                                                    if (next11.equals(str5)) {
                                                        c4 = 11;
                                                        c3 = c4;
                                                        obj8 = obj7;
                                                        str9 = str52;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str10 = str54;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        str12 = str53;
                                                        break;
                                                    }
                                                    c3 = c10;
                                                    obj8 = obj7;
                                                    str9 = str52;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    str12 = str53;
                                                case 92909918:
                                                    if (next11.equals("alpha")) {
                                                        c4 = '\f';
                                                        c3 = c4;
                                                        obj8 = obj7;
                                                        str9 = str52;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str10 = str54;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        str12 = str53;
                                                        break;
                                                    }
                                                    c3 = c10;
                                                    obj8 = obj7;
                                                    str9 = str52;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    str12 = str53;
                                                case 156108012:
                                                    if (next11.equals("waveOffset")) {
                                                        c4 = '\r';
                                                        c3 = c4;
                                                        obj8 = obj7;
                                                        str9 = str52;
                                                        obj9 = obj27;
                                                        obj10 = obj31;
                                                        str10 = str54;
                                                        str11 = str51;
                                                        obj11 = obj29;
                                                        str12 = str53;
                                                        break;
                                                    }
                                                    c3 = c10;
                                                    obj8 = obj7;
                                                    str9 = str52;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    str12 = str53;
                                                default:
                                                    c3 = c10;
                                                    obj8 = obj7;
                                                    str9 = str52;
                                                    obj9 = obj27;
                                                    obj10 = obj31;
                                                    str10 = str54;
                                                    str11 = str51;
                                                    obj11 = obj29;
                                                    str12 = str53;
                                                    break;
                                            }
                                            switch (c3) {
                                                case 0:
                                                    str13 = str5;
                                                    it = it18;
                                                    dzt0Var2 = new dzt0.g();
                                                    break;
                                                case 1:
                                                    str13 = str5;
                                                    it = it18;
                                                    dzt0Var2 = new dzt0.h();
                                                    break;
                                                case 2:
                                                    str13 = str5;
                                                    it = it18;
                                                    dzt0Var2 = new dzt0.k();
                                                    break;
                                                case 3:
                                                    str13 = str5;
                                                    it = it18;
                                                    dzt0Var2 = new dzt0.l();
                                                    break;
                                                case 4:
                                                    str13 = str5;
                                                    it = it18;
                                                    dzt0Var2 = new dzt0.m();
                                                    break;
                                                case 5:
                                                    str13 = str5;
                                                    dzt0.e eVar2 = new dzt0.e();
                                                    it = it18;
                                                    eVar2.g = false;
                                                    dzt0Var2 = eVar2;
                                                    break;
                                                case 6:
                                                    iVar = new dzt0.i();
                                                    str13 = str5;
                                                    dzt0Var = iVar;
                                                    it = it18;
                                                    break;
                                                case 7:
                                                    iVar = new dzt0.j();
                                                    str13 = str5;
                                                    dzt0Var = iVar;
                                                    it = it18;
                                                    break;
                                                case '\b':
                                                    iVar = new dzt0.a();
                                                    str13 = str5;
                                                    dzt0Var = iVar;
                                                    it = it18;
                                                    break;
                                                case '\t':
                                                    iVar = new dzt0.f();
                                                    str13 = str5;
                                                    dzt0Var = iVar;
                                                    it = it18;
                                                    break;
                                                case '\n':
                                                    iVar = new dzt0.c();
                                                    str13 = str5;
                                                    dzt0Var = iVar;
                                                    it = it18;
                                                    break;
                                                case 11:
                                                    iVar = new dzt0.d();
                                                    str13 = str5;
                                                    dzt0Var = iVar;
                                                    it = it18;
                                                    break;
                                                case '\f':
                                                    iVar = new dzt0.a();
                                                    str13 = str5;
                                                    dzt0Var = iVar;
                                                    it = it18;
                                                    break;
                                                case '\r':
                                                    iVar = new dzt0.a();
                                                    str13 = str5;
                                                    dzt0Var = iVar;
                                                    it = it18;
                                                    break;
                                                default:
                                                    str13 = str5;
                                                    it = it18;
                                                    dzt0Var = null;
                                                    break;
                                            }
                                            if (dzt0Var2 != null) {
                                                str54 = str10;
                                                str52 = str9;
                                                obj31 = obj10;
                                                str51 = str11;
                                                obj29 = obj11;
                                                obj27 = obj9;
                                                str53 = str12;
                                                obj7 = obj8;
                                                it18 = it;
                                            } else {
                                                String str55 = str10;
                                                if (dzt0Var2.e == 1 && Float.isNaN(f84)) {
                                                    f84 = c();
                                                }
                                                dzt0Var2.b = next11;
                                                this.z.put(next11, dzt0Var2);
                                                str52 = str9;
                                                obj31 = obj10;
                                                str51 = str11;
                                                obj29 = obj11;
                                                obj27 = obj9;
                                                str53 = str12;
                                                obj7 = obj8;
                                                it18 = it;
                                                str54 = str55;
                                            }
                                            str5 = str13;
                                            c10 = 65535;
                                        }
                                        dzt0Var2 = dzt0Var;
                                        if (dzt0Var2 != null) {
                                        }
                                        str5 = str13;
                                        c10 = 65535;
                                    }
                                    Iterator<zcy> it19 = arrayList5.iterator();
                                    while (it19.hasNext()) {
                                        zcy next12 = it19.next();
                                        if (next12 instanceof edy) {
                                            ((edy) next12).i(this.z);
                                        }
                                    }
                                    Iterator<dzt0> it20 = this.z.values().iterator();
                                    while (it20.hasNext()) {
                                        it20.next().c();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str56 = strArr3[i28];
                            int i31 = i28;
                            double[][] dArr7 = null;
                            int i32 = 0;
                            int i33 = 0;
                            double[] dArr8 = null;
                            while (i32 < i10) {
                                int i34 = i32;
                                if (fb30VarArr[i34].o.containsKey(str56)) {
                                    if (dArr7 == null) {
                                        dArr8 = new double[i10];
                                        ConstraintAttribute constraintAttribute4 = fb30VarArr[i34].o.get(str56);
                                        dArr7 = (double[][]) Array.newInstance((Class<?>) cls, i10, constraintAttribute4 == null ? 0 : constraintAttribute4.c());
                                    }
                                    fb30 fb30Var12 = fb30VarArr[i34];
                                    double[][] dArr9 = dArr7;
                                    str15 = str3;
                                    str16 = str2;
                                    dArr8[i33] = fb30Var12.d;
                                    double[] dArr10 = dArr9[i33];
                                    ConstraintAttribute constraintAttribute5 = fb30Var12.o.get(str56);
                                    if (constraintAttribute5 != null) {
                                        if (constraintAttribute5.c() == 1) {
                                            dArr10[0] = constraintAttribute5.a();
                                        } else {
                                            int c11 = constraintAttribute5.c();
                                            constraintAttribute5.b(new float[c11]);
                                            int i35 = 0;
                                            int i36 = 0;
                                            while (i35 < c11) {
                                                double[] dArr11 = dArr10;
                                                dArr11[i36] = r15[i35];
                                                i35++;
                                                i36++;
                                                dArr10 = dArr11;
                                                str56 = str56;
                                            }
                                        }
                                    }
                                    str14 = str56;
                                    i33++;
                                    dArr7 = dArr9;
                                } else {
                                    str14 = str56;
                                    str15 = str3;
                                    str16 = str2;
                                }
                                i32 = i34 + 1;
                                str2 = str16;
                                str3 = str15;
                                str56 = str14;
                            }
                            double[] copyOf = Arrays.copyOf(dArr8, i33);
                            double[][] dArr12 = (double[][]) Arrays.copyOf(dArr7, i33);
                            int i37 = i31 + 1;
                            this.j[i37] = emk.a(this.e, copyOf, dArr12);
                            i28 = i37;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        fb30 fb30Var = this.f;
        sb.append(fb30Var.f);
        sb.append(" y: ");
        sb.append(fb30Var.g);
        sb.append(" end: x: ");
        fb30 fb30Var2 = this.g;
        sb.append(fb30Var2.f);
        sb.append(" y: ");
        sb.append(fb30Var2.g);
        return sb.toString();
    }
}
