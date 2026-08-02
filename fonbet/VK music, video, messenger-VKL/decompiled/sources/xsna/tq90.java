package xsna;

import androidx.compose.ui.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.qq90;

/* compiled from: PathParser.kt */
/* loaded from: classes11.dex */
public final class tq90 {
    public static final void a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            double sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d16 * sqrt2;
        double d24 = sqrt2 * d17;
        if (z == z2) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
            atan22 = atan22 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        double d29 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d29) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = atan22;
        double d31 = -d10;
        double d32 = d31 * cos2;
        double d33 = d6 * sin2;
        double d34 = (d32 * sin3) - (d33 * cos3);
        double d35 = d31 * sin2;
        double d36 = d6 * cos2;
        double d37 = (cos3 * d36) + (sin3 * d35);
        double d38 = d30 / ceil;
        double d39 = atan2;
        double d40 = d34;
        int i = 0;
        double d41 = d;
        double d42 = d37;
        double d43 = d2;
        while (i < ceil) {
            double d44 = d39 + d38;
            double sin4 = Math.sin(d44);
            double cos4 = Math.cos(d44);
            int i2 = i;
            double d45 = (((d10 * cos2) * cos4) + d27) - (d33 * sin4);
            int i3 = ceil;
            double d46 = (d36 * sin4) + (d10 * sin2 * cos4) + d28;
            double d47 = (d32 * sin4) - (d33 * cos4);
            double d48 = (cos4 * d36) + (sin4 * d35);
            double d49 = d44 - d39;
            double tan = Math.tan(d49 / d18);
            double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d29) - 1) * Math.sin(d49)) / 3;
            path.b((float) ((d40 * sqrt3) + d41), (float) ((d42 * sqrt3) + d43), (float) (d45 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d45, (float) d46);
            d41 = d45;
            i = i2 + 1;
            d27 = d27;
            sin2 = sin2;
            d29 = d29;
            d39 = d44;
            d42 = d48;
            d40 = d47;
            d43 = d46;
            d10 = d5;
            ceil = i3;
        }
    }

    public static final void b(List list, Path path) {
        int i;
        float f;
        int i2;
        qq90 qq90Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        Path path2 = path;
        int h = path2.h();
        path2.rewind();
        path2.l(h);
        qq90 qq90Var2 = list2.isEmpty() ? qq90.b.c : (qq90) list2.get(0);
        int size = list2.size();
        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i3 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i3 < size) {
            qq90 qq90Var3 = (qq90) list2.get(i3);
            if (qq90Var3 instanceof qq90.b) {
                path2.close();
                i = size;
                f = f11;
                i2 = i3;
                qq90Var = qq90Var3;
                f12 = f16;
                f14 = f12;
                f13 = f17;
            } else {
                if (qq90Var3 instanceof qq90.n) {
                    qq90.n nVar = (qq90.n) qq90Var3;
                    float f18 = nVar.c;
                    f14 += f18;
                    float f19 = nVar.d;
                    f15 += f19;
                    path2.n(f18, f19);
                    i = size;
                    f = f11;
                    i2 = i3;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (qq90Var3 instanceof qq90.f) {
                        qq90.f fVar = (qq90.f) qq90Var3;
                        float f20 = fVar.c;
                        float f21 = fVar.d;
                        path2.a(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        f14 = f20;
                        f16 = f14;
                    } else if (qq90Var3 instanceof qq90.m) {
                        qq90.m mVar = (qq90.m) qq90Var3;
                        float f22 = mVar.c;
                        float f23 = mVar.d;
                        path2.m(f22, f23);
                        f14 += mVar.c;
                        f15 += f23;
                    } else if (qq90Var3 instanceof qq90.e) {
                        qq90.e eVar = (qq90.e) qq90Var3;
                        float f24 = eVar.c;
                        float f25 = eVar.d;
                        path2.c(f24, f25);
                        f14 = eVar.c;
                        f15 = f25;
                    } else if (qq90Var3 instanceof qq90.l) {
                        qq90.l lVar = (qq90.l) qq90Var3;
                        path2.m(lVar.c, f11);
                        f14 += lVar.c;
                    } else if (qq90Var3 instanceof qq90.d) {
                        qq90.d dVar = (qq90.d) qq90Var3;
                        path2.c(dVar.c, f15);
                        f14 = dVar.c;
                    } else if (qq90Var3 instanceof qq90.r) {
                        qq90.r rVar = (qq90.r) qq90Var3;
                        path2.m(f11, rVar.c);
                        f15 += rVar.c;
                    } else if (qq90Var3 instanceof qq90.s) {
                        qq90.s sVar = (qq90.s) qq90Var3;
                        path2.c(f14, sVar.c);
                        f15 = sVar.c;
                    } else {
                        if (qq90Var3 instanceof qq90.k) {
                            qq90.k kVar = (qq90.k) qq90Var3;
                            path2.o(kVar.c, kVar.d, kVar.e, kVar.f, kVar.g, kVar.h);
                            f8 = kVar.e + f14;
                            f9 = kVar.f + f15;
                            f14 += kVar.g;
                            f10 = kVar.h;
                        } else {
                            if (qq90Var3 instanceof qq90.c) {
                                qq90.c cVar = (qq90.c) qq90Var3;
                                path.b(cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h);
                                float f26 = cVar.e;
                                float f27 = cVar.f;
                                float f28 = cVar.g;
                                float f29 = cVar.h;
                                f14 = f28;
                                f15 = f29;
                                i = size;
                                f = f11;
                                i2 = i3;
                                qq90Var = qq90Var3;
                                f12 = f26;
                                f13 = f27;
                            } else if (qq90Var3 instanceof qq90.p) {
                                if (qq90Var2.a) {
                                    float f30 = f14 - f12;
                                    f7 = f15 - f13;
                                    f6 = f30;
                                } else {
                                    f6 = f11;
                                    f7 = f6;
                                }
                                qq90.p pVar = (qq90.p) qq90Var3;
                                path.o(f6, f7, pVar.c, pVar.d, pVar.e, pVar.f);
                                f8 = pVar.c + f14;
                                f9 = pVar.d + f15;
                                f14 += pVar.e;
                                f10 = pVar.f;
                            } else {
                                if (qq90Var3 instanceof qq90.h) {
                                    if (qq90Var2.a) {
                                        float f31 = 2;
                                        f14 = (f14 * f31) - f12;
                                        f15 = (f31 * f15) - f13;
                                    }
                                    qq90.h hVar = (qq90.h) qq90Var3;
                                    path.b(f14, f15, hVar.c, hVar.d, hVar.e, hVar.f);
                                    f4 = hVar.c;
                                    float f32 = hVar.d;
                                    float f33 = hVar.e;
                                    float f34 = hVar.f;
                                    f14 = f33;
                                    f15 = f34;
                                    i = size;
                                    f = f11;
                                    i2 = i3;
                                    qq90Var = qq90Var3;
                                    f13 = f32;
                                } else {
                                    if (qq90Var3 instanceof qq90.o) {
                                        qq90.o oVar = (qq90.o) qq90Var3;
                                        float f35 = oVar.c;
                                        float f36 = oVar.f;
                                        float f37 = oVar.e;
                                        float f38 = oVar.d;
                                        path.f(f35, f38, f37, f36);
                                        float f39 = oVar.c + f14;
                                        f5 = f38 + f15;
                                        f14 += f37;
                                        f15 += f36;
                                        f12 = f39;
                                    } else if (qq90Var3 instanceof qq90.g) {
                                        qq90.g gVar = (qq90.g) qq90Var3;
                                        float f40 = gVar.c;
                                        float f41 = gVar.f;
                                        float f42 = gVar.e;
                                        f5 = gVar.d;
                                        path.t(f40, f5, f42, f41);
                                        f12 = gVar.c;
                                        f15 = f41;
                                        f14 = f42;
                                    } else if (qq90Var3 instanceof qq90.q) {
                                        if (qq90Var2.b) {
                                            f2 = f14 - f12;
                                            f3 = f15 - f13;
                                        } else {
                                            f2 = f11;
                                            f3 = f2;
                                        }
                                        qq90.q qVar = (qq90.q) qq90Var3;
                                        float f43 = qVar.c;
                                        float f44 = qVar.d;
                                        path.f(f2, f3, f43, f44);
                                        f4 = f2 + f14;
                                        float f45 = f3 + f15;
                                        f14 += qVar.c;
                                        f15 += f44;
                                        f13 = f45;
                                        i = size;
                                        f = f11;
                                        i2 = i3;
                                        qq90Var = qq90Var3;
                                    } else if (qq90Var3 instanceof qq90.i) {
                                        if (qq90Var2.b) {
                                            float f46 = 2;
                                            f14 = (f14 * f46) - f12;
                                            f15 = (f46 * f15) - f13;
                                        }
                                        qq90.i iVar = (qq90.i) qq90Var3;
                                        float f47 = iVar.c;
                                        float f48 = iVar.d;
                                        path.t(f14, f15, f47, f48);
                                        float f49 = f15;
                                        f15 = f48;
                                        f13 = f49;
                                        i = size;
                                        f = f11;
                                        i2 = i3;
                                        f12 = f14;
                                        qq90Var = qq90Var3;
                                        f14 = iVar.c;
                                    } else if (qq90Var3 instanceof qq90.j) {
                                        qq90.j jVar = (qq90.j) qq90Var3;
                                        float f50 = jVar.h + f14;
                                        float f51 = jVar.i + f15;
                                        f = f11;
                                        i = size;
                                        i2 = i3;
                                        a(path, f14, f15, f50, f51, jVar.c, jVar.d, jVar.e, jVar.f, jVar.g);
                                        f12 = f50;
                                        f14 = f12;
                                        f13 = f51;
                                        f15 = f13;
                                        qq90Var = qq90Var3;
                                    } else {
                                        i = size;
                                        f = f11;
                                        i2 = i3;
                                        if (!(qq90Var3 instanceof qq90.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qq90.a aVar = (qq90.a) qq90Var3;
                                        float f52 = aVar.h;
                                        float f53 = aVar.i;
                                        qq90Var = qq90Var3;
                                        a(path, f14, f15, f52, f53, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g);
                                        f12 = aVar.h;
                                        f14 = f12;
                                        f13 = f53;
                                    }
                                    f13 = f5;
                                }
                                f12 = f4;
                            }
                            i3 = i2 + 1;
                            list2 = list;
                            path2 = path;
                            size = i;
                            qq90Var2 = qq90Var;
                            f11 = f;
                        }
                        f15 += f10;
                        f12 = f8;
                        f13 = f9;
                    }
                    i = size;
                    f = f11;
                    i2 = i3;
                }
                qq90Var = qq90Var3;
                i3 = i2 + 1;
                list2 = list;
                path2 = path;
                size = i;
                qq90Var2 = qq90Var;
                f11 = f;
            }
            f15 = f13;
            i3 = i2 + 1;
            list2 = list;
            path2 = path;
            size = i;
            qq90Var2 = qq90Var;
            f11 = f;
        }
    }
}
