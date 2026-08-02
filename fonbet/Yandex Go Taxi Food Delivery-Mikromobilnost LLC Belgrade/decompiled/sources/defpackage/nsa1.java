package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class nsa1 {
    public static final void a(int i, fid fidVar, tls tlsVar, f530 f530Var, String str) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1196758346);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 l = ymb1.l(f530Var, cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3));
            qnm qnmVar = qnm.a;
            f530 b = m4m0.b(l, qnm.c(btsVar).a(), qke.q);
            int i3 = 0;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            String e = ohb1.e(btsVar, oyh0.folders_name_placeholder);
            ety0 l2 = ltm.b(btsVar).l(btsVar);
            lkx lkxVar = new lkx(i3, i3, 7, 119);
            qnm.d.getClass();
            fu91.a(str, e, tlsVar, u3a1.d(an91.m(c530.a, 0.0f, 4.0f, 1), "folder_edit_name_input"), l2, 1, 0, null, false, null, lkxVar, null, btsVar, (i2 & 14) | ImageMetadata.EDGE_MODE | ((i2 << 3) & 896));
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xwr(str, tlsVar, f530Var, i);
        }
    }

    public static final nyk0 b(int i, float f, wre wreVar, List list) {
        float[] fArr = new float[i * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long n = pw91.n(ex21.e(f, (ex21.b / i) * 2.0f * i3), ior.a(0.0f, 0.0f));
            int i4 = i2 + 1;
            fArr[i2] = pw91.j(n);
            i2 += 2;
            fArr[i4] = pw91.k(n);
        }
        return c(fArr, wreVar, list, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nyk0 c(float[] fArr, wre wreVar, List list, float f, float f2) {
        float f3;
        long a;
        int i;
        ArrayList arrayList;
        List singletonList;
        jdf a2;
        wre wreVar2;
        float f4 = 1.0f;
        Float valueOf = Float.valueOf(1.0f);
        if (fArr.length < 6) {
            ny61.g("Polygons must have at least 3 vertices");
            return null;
        }
        int i2 = 2;
        int i3 = 1;
        if (fArr.length % 2 == 1) {
            ny61.g("The vertices array should have even size");
            return null;
        }
        if (list != null && list.size() * 2 != fArr.length) {
            ny61.g("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList3 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            wre wreVar3 = (list == null || (wreVar2 = (wre) list.get(i5)) == null) ? wreVar : wreVar2;
            int i6 = (((i5 + length) - 1) % length) * 2;
            int i7 = i5 + 1;
            int i8 = (i7 % length) * 2;
            int i9 = i5 * 2;
            arrayList3.add(new ayk0(ior.a(fArr[i6], fArr[i6 + 1]), ior.a(fArr[i9], fArr[i9 + 1]), ior.a(fArr[i8], fArr[i8 + 1]), wreVar3));
            i5 = i7;
            f4 = f4;
        }
        float f5 = f4;
        d6w n = y6i0.n(0, length);
        ArrayList arrayList4 = new ArrayList(tcc.n(n, 10));
        c6w it = n.iterator();
        while (true) {
            f3 = 0.0f;
            if (!it.c) {
                break;
            }
            int nextInt = it.nextInt();
            int i10 = (nextInt + 1) % length;
            float f6 = ((ayk0) arrayList3.get(nextInt)).h + ((ayk0) arrayList3.get(i10)).h;
            float c = ((ayk0) arrayList3.get(i10)).c() + ((ayk0) arrayList3.get(nextInt)).c();
            int i11 = nextInt * 2;
            float f7 = fArr[i11];
            float f8 = fArr[i11 + 1];
            int i12 = i10 * 2;
            float f9 = f7 - fArr[i12];
            float f10 = f8 - fArr[i12 + 1];
            float f11 = ex21.b;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            arrayList4.add(f6 > sqrt ? new Pair(Float.valueOf(sqrt / f6), Float.valueOf(0.0f)) : c > sqrt ? new Pair(valueOf, Float.valueOf((sqrt - f6) / (c - f6))) : new Pair(valueOf, valueOf));
        }
        int i13 = 0;
        while (i13 < length) {
            rx40 rx40Var = new rx40(i2);
            int i14 = i4;
            while (i14 < i2) {
                Pair pair = (Pair) arrayList4.get((((i13 + length) - i3) + i14) % length);
                rx40Var.a(((((ayk0) arrayList3.get(i13)).c() - ((ayk0) arrayList3.get(i13)).h) * ((Number) pair.getSecond()).floatValue()) + (((ayk0) arrayList3.get(i13)).h * ((Number) pair.getFirst()).floatValue()));
                i14++;
                f3 = f3;
                i2 = i2;
            }
            int i15 = i2;
            float f12 = f3;
            ayk0 ayk0Var = (ayk0) arrayList3.get(i13);
            float b = rx40Var.b(i4);
            float b2 = rx40Var.b(i3);
            long j = ayk0Var.e;
            int i16 = i3;
            ArrayList arrayList5 = arrayList3;
            long j2 = ayk0Var.d;
            int i17 = i4;
            float f13 = ayk0Var.f;
            ArrayList arrayList6 = arrayList2;
            long j3 = ayk0Var.b;
            float min = Math.min(b, b2);
            float f14 = ayk0Var.h;
            if (f14 < 1.0E-4f || min < 1.0E-4f || f13 < 1.0E-4f) {
                i = i13;
                arrayList = arrayList4;
                ayk0Var.i = j3;
                float j4 = pw91.j(j3);
                float k = pw91.k(j3);
                float j5 = pw91.j(j3);
                float k2 = pw91.k(j3);
                singletonList = Collections.singletonList(jub1.a(j4, k, ex21.c(j4, j5, 0.33333334f), ex21.c(k, k2, 0.33333334f), ex21.c(j4, j5, 0.6666667f), ex21.c(k, k2, 0.6666667f), j5, k2));
            } else {
                float min2 = Math.min(min, f14);
                float a3 = ayk0Var.a(b);
                float a4 = ayk0Var.a(b2);
                float f15 = (f13 * min2) / f14;
                float f16 = ex21.b;
                i = i13;
                arrayList = arrayList4;
                ayk0Var.i = pw91.n(j3, pw91.r((float) Math.sqrt((min2 * min2) + (f15 * f15)), pw91.i(pw91.g(2.0f, pw91.n(j2, j)))));
                long n2 = pw91.n(j3, pw91.r(min2, j2));
                long n3 = pw91.n(j3, pw91.r(min2, j));
                jdf b3 = ayk0.b(min2, a3, ayk0Var.b, ayk0Var.a, n2, n3, ayk0Var.i, f15);
                jdf b4 = ayk0.b(min2, a4, ayk0Var.b, ayk0Var.c, n3, n2, ayk0Var.i, f15);
                float a5 = b4.a();
                float b5 = b4.b();
                float[] fArr2 = b4.a;
                jdf a6 = jub1.a(a5, b5, fArr2[4], fArr2[5], fArr2[i15], fArr2[3], fArr2[i17], fArr2[i16]);
                float j6 = pw91.j(ayk0Var.i);
                float k3 = pw91.k(ayk0Var.i);
                float a7 = b3.a();
                float b6 = b3.b();
                float[] fArr3 = a6.a;
                float f17 = fArr3[i17];
                float f18 = fArr3[i16];
                long b7 = ex21.b(a7 - j6, b6 - k3);
                float f19 = f17 - j6;
                float f20 = f18 - k3;
                long b8 = ex21.b(f19, f20);
                long a8 = ior.a(-pw91.k(b7), pw91.j(b7));
                long a9 = ior.a(-pw91.k(b8), pw91.j(b8));
                int i18 = (pw91.k(a8) * f20) + (pw91.j(a8) * f19) >= f12 ? i16 : i17;
                float h = pw91.h(b7, b8);
                if (h > 0.999f) {
                    a2 = jub1.a(a7, b6, ex21.c(a7, f17, 0.33333334f), ex21.c(b6, f18, 0.33333334f), ex21.c(a7, f17, 0.6666667f), ex21.c(b6, f18, 0.6666667f), f17, f18);
                } else {
                    float sqrt2 = (((((float) Math.sqrt(2.0f * r9)) - ((float) Math.sqrt(f5 - (h * h)))) * ((((float) Math.sqrt((r11 * r11) + (r10 * r10))) * 4.0f) / 3.0f)) / (f5 - h)) * (i18 != 0 ? f5 : -1.0f);
                    a2 = jub1.a(a7, b6, (pw91.j(a8) * sqrt2) + a7, (pw91.k(a8) * sqrt2) + b6, f17 - (pw91.j(a9) * sqrt2), f18 - (pw91.k(a9) * sqrt2), f17, f18);
                }
                singletonList = scc.g(b3, a2, a6);
            }
            arrayList6.add(singletonList);
            i13 = i + 1;
            f3 = f12;
            arrayList2 = arrayList6;
            i3 = i16;
            arrayList3 = arrayList5;
            i2 = i15;
            i4 = i17;
            arrayList4 = arrayList;
        }
        ArrayList arrayList7 = arrayList2;
        int i19 = i3;
        ArrayList arrayList8 = arrayList3;
        int i20 = i4;
        float f21 = f3;
        ArrayList arrayList9 = new ArrayList();
        int i21 = i20;
        while (i21 < length) {
            int i22 = i21 + 1;
            int i23 = i22 % length;
            int i24 = i21 * 2;
            long a10 = ior.a(fArr[i24], fArr[i24 + 1]);
            int i25 = (((i21 + length) - 1) % length) * 2;
            long a11 = ior.a(fArr[i25], fArr[i25 + 1]);
            int i26 = i23 * 2;
            long a12 = ior.a(fArr[i26], fArr[i26 + 1]);
            long m = pw91.m(a10, a11);
            long m2 = pw91.m(a12, a10);
            arrayList9.add(new dkp((List) arrayList7.get(i21), a10, ((ayk0) arrayList8.get(i21)).i, (pw91.k(m2) * pw91.j(m)) - (pw91.j(m2) * pw91.k(m)) > f21 ? i19 : i20));
            float a13 = ((jdf) a.Z((List) arrayList7.get(i21))).a();
            float b9 = ((jdf) a.Z((List) arrayList7.get(i21))).b();
            float f22 = ((jdf) a.P((List) arrayList7.get(i23))).a[i20];
            float f23 = ((jdf) a.P((List) arrayList7.get(i23))).a[i19];
            arrayList9.add(new ekp(Collections.singletonList(jub1.a(a13, b9, ex21.c(a13, f22, 0.33333334f), ex21.c(b9, f23, 0.33333334f), ex21.c(a13, f22, 0.6666667f), ex21.c(b9, f23, 0.6666667f), f22, f23))));
            i21 = i22;
        }
        if (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) {
            float f24 = f21;
            float f25 = f24;
            int i27 = i20;
            while (i27 < fArr.length) {
                int i28 = i27 + 1;
                f25 += fArr[i27];
                i27 += 2;
                f24 += fArr[i28];
            }
            a = ior.a((f25 / fArr.length) / 2.0f, (f24 / fArr.length) / 2.0f);
        } else {
            a = ior.a(f, f2);
        }
        return new nyk0(arrayList9, Float.intBitsToFloat((int) (a >> 32)), Float.intBitsToFloat((int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }

    public static final HashSet d() {
        return u4r0.c("android_back_button");
    }

    public static void e(Object obj, Object obj2) {
        if (obj == null) {
            ny61.t("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            ny61.t(oyr.p("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
