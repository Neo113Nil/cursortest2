package xsna;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.tf6;

/* compiled from: PolystarContent.java */
/* loaded from: classes12.dex */
public final class vub0 implements gq90, tf6.a, wdy {
    public final String e;
    public final k800 f;
    public final PolystarShape.Type g;
    public final boolean h;
    public final boolean i;
    public final hqr j;
    public final tf6<?, PointF> k;
    public final hqr l;

    @Nullable
    public final hqr m;
    public final hqr n;

    @Nullable
    public final hqr o;
    public final hqr p;
    public boolean r;
    public final Path a = new Path();
    public final Path b = new Path();
    public final PathMeasure c = new PathMeasure();
    public final float[] d = new float[2];
    public final op5 q = new op5(1, false);

    /* compiled from: PolystarContent.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public vub0(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.f = k800Var;
        this.e = polystarShape.a;
        PolystarShape.Type type = polystarShape.b;
        this.g = type;
        this.h = polystarShape.j;
        this.i = polystarShape.k;
        hqr j = polystarShape.c.j();
        this.j = j;
        tf6<PointF, PointF> j2 = polystarShape.d.j();
        this.k = j2;
        hqr j3 = polystarShape.e.j();
        this.l = j3;
        hqr j4 = polystarShape.g.j();
        this.n = j4;
        hqr j5 = polystarShape.i.j();
        this.p = j5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.m = polystarShape.f.j();
            this.o = polystarShape.h.j();
        } else {
            this.m = null;
            this.o = null;
        }
        aVar.h(j);
        aVar.h(j2);
        aVar.h(j3);
        aVar.h(j4);
        aVar.h(j5);
        if (type == type2) {
            aVar.h(this.m);
            aVar.h(this.o);
        }
        j.a(this);
        j2.a(this);
        j3.a(this);
        j4.a(this);
        j5.a(this);
        if (type == type2) {
            this.m.a(this);
            this.o.a(this);
        }
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            gfj gfjVar = (gfj) arrayList.get(i);
            if (gfjVar instanceof arp0) {
                arp0 arp0Var = (arp0) gfjVar;
                if (arp0Var.c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    ((ArrayList) this.q.b).add(arp0Var);
                    arp0Var.d(this);
                }
            }
            i++;
        }
    }

    @Override // xsna.vdy
    public final void d(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        ls20.g(udyVar, i, arrayList, udyVar2, this);
    }

    @Override // xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        hqr hqrVar;
        hqr hqrVar2;
        if (t == t800.u) {
            this.j.k(a900Var);
            return;
        }
        if (t == t800.v) {
            this.l.k(a900Var);
            return;
        }
        if (t == t800.i) {
            this.k.k(a900Var);
            return;
        }
        if (t == t800.w && (hqrVar2 = this.m) != null) {
            hqrVar2.k(a900Var);
            return;
        }
        if (t == t800.x) {
            this.n.k(a900Var);
            return;
        }
        if (t == t800.y && (hqrVar = this.o) != null) {
            hqrVar.k(a900Var);
        } else if (t == t800.z) {
            this.p.k(a900Var);
        }
    }

    @Override // xsna.gfj
    public final String getName() {
        return this.e;
    }

    @Override // xsna.gq90
    public final Path getPath() {
        boolean z;
        float f;
        double d;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        double d2;
        boolean z2 = this.r;
        Path path = this.a;
        if (z2) {
            return path;
        }
        path.reset();
        if (this.h) {
            this.r = true;
            return path;
        }
        int i2 = a.a[this.g.ordinal()];
        tf6<?, PointF> tf6Var = this.k;
        hqr hqrVar = this.n;
        hqr hqrVar2 = this.p;
        double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        hqr hqrVar3 = this.l;
        hqr hqrVar4 = this.j;
        if (i2 == 1) {
            z = true;
            float floatValue = hqrVar4.f().floatValue();
            if (hqrVar3 != null) {
                d3 = hqrVar3.f().floatValue();
            }
            double radians = Math.toRadians(d3 - 90.0d);
            double d4 = floatValue;
            float f7 = (float) (6.283185307179586d / d4);
            if (this.i) {
                f7 *= -1.0f;
            }
            float f8 = f7;
            float f9 = f8 / 2.0f;
            float f10 = floatValue - ((int) floatValue);
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = 2.0f;
                radians += (1.0f - f10) * f9;
            } else {
                f = 2.0f;
            }
            float floatValue2 = hqrVar.f().floatValue();
            float floatValue3 = this.m.f().floatValue();
            hqr hqrVar5 = this.o;
            float floatValue4 = hqrVar5 != null ? hqrVar5.f().floatValue() / 100.0f : 0.0f;
            float floatValue5 = hqrVar2 != null ? hqrVar2.f().floatValue() / 100.0f : 0.0f;
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float b = u11.b(floatValue2, floatValue3, f10, floatValue3);
                double d5 = b;
                f4 = b;
                float cos = (float) (Math.cos(radians) * d5);
                float sin = (float) (Math.sin(radians) * d5);
                path.moveTo(cos, sin);
                d = radians + ((f8 * f10) / f);
                f2 = cos;
                f3 = sin;
            } else {
                double d6 = floatValue2;
                float cos2 = (float) (Math.cos(radians) * d6);
                float sin2 = (float) (Math.sin(radians) * d6);
                path.moveTo(cos2, sin2);
                d = radians + f9;
                f2 = cos2;
                f3 = sin2;
                f4 = 0.0f;
            }
            double ceil = Math.ceil(d4) * 2.0d;
            double d7 = d;
            int i3 = 0;
            boolean z3 = false;
            while (true) {
                double d8 = i3;
                if (d8 >= ceil) {
                    break;
                }
                float f11 = z3 ? floatValue2 : floatValue3;
                float f12 = (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || d8 != ceil - 2.0d) ? f9 : (f8 * f10) / f;
                if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && d8 == ceil - 1.0d) {
                    f11 = f4;
                }
                double d9 = f11;
                float cos3 = (float) (Math.cos(d7) * d9);
                float sin3 = (float) (Math.sin(d7) * d9);
                if (floatValue4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && floatValue5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    path.lineTo(cos3, sin3);
                    f5 = f10;
                    f6 = cos3;
                } else {
                    f5 = f10;
                    Path path2 = path;
                    double atan2 = (float) (Math.atan2(f3, f2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    float f13 = f2;
                    float f14 = f3;
                    double atan22 = (float) (Math.atan2(sin3, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f15 = z3 ? floatValue4 : floatValue5;
                    float f16 = z3 ? floatValue5 : floatValue4;
                    float f17 = (z3 ? floatValue3 : floatValue2) * f15 * 0.47829f;
                    float f18 = cos4 * f17;
                    float f19 = f17 * sin4;
                    float f20 = (z3 ? floatValue2 : floatValue3) * f16 * 0.47829f;
                    float f21 = cos5 * f20;
                    float f22 = f20 * sin5;
                    if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (i3 == 0) {
                            f18 *= f5;
                            f19 *= f5;
                        } else if (d8 == ceil - 1.0d) {
                            f21 *= f5;
                            f22 *= f5;
                        }
                    }
                    f6 = cos3;
                    path = path2;
                    path.cubicTo(f13 - f18, f14 - f19, f21 + cos3, sin3 + f22, f6, sin3);
                }
                d7 += f12;
                z3 = !z3;
                i3++;
                f2 = f6;
                f3 = sin3;
                f10 = f5;
                f = 2.0f;
            }
            PointF f23 = tf6Var.f();
            path.offset(f23.x, f23.y);
            path.close();
        } else if (i2 != 2) {
            z = true;
        } else {
            int floor = (int) Math.floor(hqrVar4.f().floatValue());
            if (hqrVar3 != null) {
                d3 = hqrVar3.f().floatValue();
            }
            double radians2 = Math.toRadians(d3 - 90.0d);
            double d10 = floor;
            float floatValue6 = hqrVar2.f().floatValue() / 100.0f;
            float floatValue7 = hqrVar.f().floatValue();
            double d11 = floatValue7;
            z = true;
            float cos6 = (float) (Math.cos(radians2) * d11);
            float sin6 = (float) (Math.sin(radians2) * d11);
            path.moveTo(cos6, sin6);
            double d12 = (float) (6.283185307179586d / d10);
            double ceil2 = Math.ceil(d10);
            double d13 = radians2 + d12;
            int i4 = 0;
            while (true) {
                double d14 = i4;
                if (d14 >= ceil2) {
                    break;
                }
                double d15 = ceil2;
                float cos7 = (float) (Math.cos(d13) * d11);
                float sin7 = (float) (Math.sin(d13) * d11);
                if (floatValue6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i = i4;
                    Path path3 = path;
                    d2 = d11;
                    double atan23 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    double atan24 = (float) (Math.atan2(sin7, cos7) - 1.5707963267948966d);
                    float f24 = floatValue7 * floatValue6 * 0.25f;
                    float f25 = f24 * cos8;
                    float f26 = f24 * sin8;
                    float cos9 = ((float) Math.cos(atan24)) * f24;
                    float sin9 = f24 * ((float) Math.sin(atan24));
                    if (d14 == d15 - 1.0d) {
                        Path path4 = this.b;
                        path4.reset();
                        path4.moveTo(cos6, sin6);
                        float f27 = cos6 - f25;
                        float f28 = sin6 - f26;
                        float f29 = cos7 + cos9;
                        float f30 = sin7 + sin9;
                        path4.cubicTo(f27, f28, f29, f30, cos7, sin7);
                        PathMeasure pathMeasure = this.c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f27, f28, f29, f30, fArr[0], fArr[1]);
                        cos6 = cos7;
                        sin6 = sin7;
                    } else {
                        float f31 = sin7 + sin9;
                        path = path3;
                        sin6 = sin7;
                        path.cubicTo(cos6 - f25, sin6 - f26, cos7 + cos9, f31, cos7, sin6);
                        cos6 = cos7;
                    }
                } else {
                    i = i4;
                    d2 = d11;
                    cos6 = cos7;
                    sin6 = sin7;
                    if (d14 == d15 - 1.0d) {
                        i4 = i + 1;
                        ceil2 = d15;
                        d11 = d2;
                    } else {
                        path.lineTo(cos6, sin6);
                    }
                }
                d13 += d12;
                i4 = i + 1;
                ceil2 = d15;
                d11 = d2;
            }
            PointF f32 = tf6Var.f();
            path.offset(f32.x, f32.y);
            path.close();
        }
        path.close();
        this.q.c(path);
        this.r = z;
        return path;
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.r = false;
        this.f.invalidateSelf();
    }
}
