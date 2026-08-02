package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xsna.rlr0;

/* compiled from: VectorPainter.kt */
/* loaded from: classes11.dex */
public final class mlr0 {

    /* compiled from: VectorPainter.kt */
    public static final class a extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ Map<String, clr0> $configs;
        final /* synthetic */ klr0 $vectorNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ilr0 ilr0Var, Map map) {
            super(2);
            this.$vectorNode = ilr0Var;
            this.$configs = map;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1450046638, intValue, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:463)");
                }
                mlr0.a((ilr0) this.$vectorNode, this.$configs, aVar2, 0, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VectorPainter.kt */
    public static final class b extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Map<String, clr0> $configs;
        final /* synthetic */ ilr0 $group;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ilr0 ilr0Var, Map<String, ? extends clr0> map, int i, int i2) {
            super(2);
            this.$group = ilr0Var;
            this.$configs = map;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            mlr0.a(this.$group, this.$configs, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: VectorPainter.kt */
    public static final class c implements clr0 {
    }

    /* compiled from: VectorPainter.kt */
    public static final class d implements clr0 {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ilr0 ilr0Var, Map<String, ? extends clr0> map, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        Map<String, ? extends clr0> map2;
        Map<String, ? extends clr0> map3;
        androidx.compose.runtime.f s;
        Iterator<klr0> it;
        Map<String, ? extends clr0> map4;
        androidx.compose.runtime.a M = aVar.M(-446179233);
        if ((i & 6) == 0) {
            i3 = (M.J(ilr0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            map2 = map;
            i3 |= M.y(map2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 19) == 18)) {
                M.h();
                map3 = map2;
            } else {
                Map<String, ? extends clr0> map5 = i4 != 0 ? jgp.b : map2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-446179233, i3, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:423)");
                }
                ilr0Var.getClass();
                Iterator<klr0> it2 = ilr0Var.k.iterator();
                while (it2.hasNext()) {
                    klr0 next = it2.next();
                    if (next instanceof plr0) {
                        M.K(798455915);
                        plr0 plr0Var = (plr0) next;
                        clr0 clr0Var = map5.get(plr0Var.b);
                        if (clr0Var == null) {
                            clr0Var = new c();
                        }
                        it = it2;
                        androidx.compose.runtime.a aVar2 = M;
                        map4 = map5;
                        blr0.b((List) clr0Var.a(rlr0.c.a, plr0Var.c), plr0Var.d, plr0Var.b, (yk8) clr0Var.a(rlr0.a.a, plr0Var.e), ((Number) clr0Var.a(rlr0.b.a, Float.valueOf(plr0Var.f))).floatValue(), (yk8) clr0Var.a(rlr0.i.a, plr0Var.g), ((Number) clr0Var.a(rlr0.j.a, Float.valueOf(plr0Var.h))).floatValue(), ((Number) clr0Var.a(rlr0.k.a, Float.valueOf(plr0Var.i))).floatValue(), plr0Var.j, plr0Var.k, plr0Var.l, ((Number) clr0Var.a(rlr0.p.a, Float.valueOf(plr0Var.m))).floatValue(), ((Number) clr0Var.a(rlr0.n.a, Float.valueOf(plr0Var.n))).floatValue(), ((Number) clr0Var.a(rlr0.o.a, Float.valueOf(plr0Var.o))).floatValue(), aVar2, 0, 0, 0);
                        M = aVar2;
                        M.j();
                    } else {
                        it = it2;
                        map4 = map5;
                        if (next instanceof ilr0) {
                            M.K(799870476);
                            ilr0 ilr0Var2 = (ilr0) next;
                            clr0 clr0Var2 = map4.get(ilr0Var2.b);
                            if (clr0Var2 == null) {
                                clr0Var2 = new d();
                            }
                            blr0.a(ilr0Var2.b, ((Number) clr0Var2.a(rlr0.f.a, Float.valueOf(ilr0Var2.c))).floatValue(), ((Number) clr0Var2.a(rlr0.d.a, Float.valueOf(ilr0Var2.d))).floatValue(), ((Number) clr0Var2.a(rlr0.e.a, Float.valueOf(ilr0Var2.e))).floatValue(), ((Number) clr0Var2.a(rlr0.g.a, Float.valueOf(ilr0Var2.f))).floatValue(), ((Number) clr0Var2.a(rlr0.h.a, Float.valueOf(ilr0Var2.g))).floatValue(), ((Number) clr0Var2.a(rlr0.l.a, Float.valueOf(ilr0Var2.h))).floatValue(), ((Number) clr0Var2.a(rlr0.m.a, Float.valueOf(ilr0Var2.i))).floatValue(), (List) clr0Var2.a(rlr0.c.a, ilr0Var2.j), kai.c(1450046638, new a((ilr0) next, map4), M), M, 805306368, 0);
                            M.j();
                        } else {
                            M.K(800876643);
                            M.j();
                        }
                    }
                    map5 = map4;
                    it2 = it;
                }
                map3 = map5;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new b(ilr0Var, map3, i, i2);
                return;
            }
            return;
        }
        map2 = map;
        if (M.t(i3 & 1, (i3 & 19) == 18)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void b(llr0 llr0Var, long j, long j2, String str, d6g d6gVar, boolean z) {
        ((zak0) llr0Var.g).setValue(new mxj0(j));
        ((zak0) llr0Var.h).setValue(Boolean.valueOf(z));
        alr0 alr0Var = llr0Var.i;
        ((zak0) alr0Var.g).setValue(d6gVar);
        ((zak0) alr0Var.i).setValue(new mxj0(j2));
        alr0Var.c = str;
    }

    public static final oe7 c(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (j == 16) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            se7.b();
            porterDuffColorFilter = re7.b(f870.H(j), z42.a(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(i));
        }
        return new oe7(j, i, porterDuffColorFilter);
    }

    public static final void d(nju njuVar, ilr0 ilr0Var) {
        int size = ilr0Var.k.size();
        for (int i = 0; i < size; i++) {
            klr0 klr0Var = ilr0Var.k.get(i);
            if (klr0Var instanceof plr0) {
                fq90 fq90Var = new fq90();
                plr0 plr0Var = (plr0) klr0Var;
                fq90Var.d = plr0Var.c;
                fq90Var.n = true;
                fq90Var.c();
                fq90Var.s.l(plr0Var.d);
                fq90Var.c();
                fq90Var.c();
                fq90Var.b = plr0Var.e;
                fq90Var.c();
                fq90Var.c = plr0Var.f;
                fq90Var.c();
                fq90Var.g = plr0Var.g;
                fq90Var.c();
                fq90Var.e = plr0Var.h;
                fq90Var.c();
                fq90Var.f = plr0Var.i;
                fq90Var.o = true;
                fq90Var.c();
                fq90Var.h = plr0Var.j;
                fq90Var.o = true;
                fq90Var.c();
                fq90Var.i = plr0Var.k;
                fq90Var.o = true;
                fq90Var.c();
                fq90Var.j = plr0Var.l;
                fq90Var.o = true;
                fq90Var.c();
                fq90Var.k = plr0Var.m;
                fq90Var.p = true;
                fq90Var.c();
                fq90Var.l = plr0Var.n;
                fq90Var.p = true;
                fq90Var.c();
                fq90Var.m = plr0Var.o;
                fq90Var.p = true;
                fq90Var.c();
                njuVar.e(i, fq90Var);
            } else if (klr0Var instanceof ilr0) {
                nju njuVar2 = new nju();
                ilr0 ilr0Var2 = (ilr0) klr0Var;
                njuVar2.k = ilr0Var2.b;
                njuVar2.c();
                njuVar2.l = ilr0Var2.c;
                njuVar2.s = true;
                njuVar2.c();
                njuVar2.o = ilr0Var2.f;
                njuVar2.s = true;
                njuVar2.c();
                njuVar2.p = ilr0Var2.g;
                njuVar2.s = true;
                njuVar2.c();
                njuVar2.q = ilr0Var2.h;
                njuVar2.s = true;
                njuVar2.c();
                njuVar2.r = ilr0Var2.i;
                njuVar2.s = true;
                njuVar2.c();
                njuVar2.m = ilr0Var2.d;
                njuVar2.s = true;
                njuVar2.c();
                njuVar2.n = ilr0Var2.e;
                njuVar2.s = true;
                njuVar2.c();
                njuVar2.f = ilr0Var2.j;
                njuVar2.g = true;
                njuVar2.c();
                d(njuVar2, ilr0Var2);
                njuVar.e(i, njuVar2);
            }
        }
    }

    public static final long e(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final llr0 f(imw imwVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        azl azlVar = (azl) aVar.r(uvi.h);
        float f = imwVar.j;
        float density = azlVar.getDensity();
        boolean p = aVar.p((Float.floatToRawIntBits(density) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object x = aVar.x();
        if (p || x == a.C0011a.a) {
            nju njuVar = new nju();
            d(njuVar, imwVar.f);
            s3q0 s3q0Var = s3q0.a;
            float f2 = imwVar.b;
            float f3 = imwVar.c;
            float I0 = azlVar.I0(f2);
            float I02 = azlVar.I0(f3);
            long floatToRawIntBits = (Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L);
            long e = e(floatToRawIntBits, imwVar.d, imwVar.e);
            llr0 llr0Var = new llr0(njuVar);
            b(llr0Var, floatToRawIntBits, e, imwVar.a, c(imwVar.h, imwVar.g), imwVar.i);
            aVar.R(llr0Var);
            x = llr0Var;
        }
        llr0 llr0Var2 = (llr0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return llr0Var2;
    }

    public static final llr0 g(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, jai jaiVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        String str2 = (i3 & 16) != 0 ? "VectorRootGroup" : str;
        long j2 = (i3 & 32) != 0 ? l5g.k : j;
        int i4 = (i3 & 64) != 0 ? 5 : i;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1685735925, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:129)");
        }
        azl azlVar = (azl) aVar.r(uvi.h);
        long floatToRawIntBits = (Float.floatToRawIntBits(azlVar.I0(f)) << 32) | (Float.floatToRawIntBits(azlVar.I0(f2)) & 4294967295L);
        long e = e(floatToRawIntBits, f3, f4);
        boolean p = aVar.p(j2) | aVar.o(i4);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (p || x == obj) {
            x = c(i4, j2);
            aVar.R(x);
        }
        d6g d6gVar = (d6g) x;
        aVar.K(789579543);
        Object x2 = aVar.x();
        int i5 = 0;
        if (x2 == obj) {
            x2 = new llr0(i5);
            aVar.R(x2);
        }
        llr0 llr0Var = (llr0) x2;
        b(llr0Var, floatToRawIntBits, e, str2, d6gVar, z);
        cvi z2 = n34.z(aVar);
        boolean z3 = ((((i2 & 896) ^ 384) > 256 && aVar.n(f3)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && aVar.n(f4)) || (i2 & 3072) == 2048);
        Object x3 = aVar.x();
        Object obj2 = x3;
        if (z3 || x3 == obj) {
            bvi bviVar = llr0Var.j;
            bvi iviVar = (bviVar == null || bviVar.h()) ? new ivi(z2, new xkr0(llr0Var.i.b)) : bviVar;
            iviVar.d(new jai(1749374910, new olr0(jaiVar, e), true));
            aVar.R(iviVar);
            obj2 = iviVar;
        }
        bvi bviVar2 = (bvi) obj2;
        llr0Var.j = bviVar2;
        boolean y = aVar.y(bviVar2);
        Object x4 = aVar.x();
        if (y || x4 == obj) {
            x4 = new nlr0(bviVar2);
            aVar.R(x4);
        }
        bap.c(llr0Var, (izs) x4, aVar, 0);
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return llr0Var;
    }
}
