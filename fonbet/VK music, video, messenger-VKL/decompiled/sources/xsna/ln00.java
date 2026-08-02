package xsna;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.i;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import xsna.d7q;
import xsna.npl;

/* compiled from: MappingTrackSelector.java */
/* loaded from: classes12.dex */
public abstract class ln00 extends chp0 {

    /* compiled from: MappingTrackSelector.java */
    public static final class a {
        public final int a;
        public final int[] b;
        public final qfp0[] c;
        public final int[] d;
        public final int[][][] e;
        public final qfp0 f;

        public a(int[] iArr, qfp0[] qfp0VarArr, int[] iArr2, int[][][] iArr3, qfp0 qfp0Var) {
            this.b = iArr;
            this.c = qfp0VarArr;
            this.e = iArr3;
            this.d = iArr2;
            this.f = qfp0Var;
            this.a = iArr.length;
        }
    }

    @Override // xsna.chp0
    public final void e(@Nullable Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [xsna.npl$c] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r3v14, types: [xsna.d7q$b] */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.d7q$a[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v42 */
    @Override // xsna.chp0
    public final ehp0 g(androidx.media3.exoplayer.k[] kVarArr, qfp0 qfp0Var, i.b bVar, ewo0 ewo0Var) throws ExoPlaybackException {
        final npl.d dVar;
        int i;
        final ?? r5;
        final String str;
        ?? r23;
        Pair pair;
        String str2;
        com.google.common.collect.g gVar;
        int i2;
        int i3;
        qfp0 qfp0Var2;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        int[] iArr;
        qfp0 qfp0Var3 = qfp0Var;
        int i4 = 1;
        int[] iArr2 = new int[kVarArr.length + 1];
        int length = kVarArr.length + 1;
        pfp0[][] pfp0VarArr = new pfp0[length][];
        int[][][] iArr3 = new int[kVarArr.length + 1][][];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = qfp0Var3.a;
            pfp0VarArr[i5] = new pfp0[i6];
            iArr3[i5] = new int[i6][];
        }
        int length2 = kVarArr.length;
        final int[] iArr4 = new int[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            iArr4[i7] = kVarArr[i7].supportsMixedMimeTypeAdaptation();
        }
        int i8 = 0;
        while (i8 < qfp0Var3.a) {
            pfp0 a2 = qfp0Var3.a(i8);
            int i9 = a2.c == 5 ? i4 : 0;
            int length3 = kVarArr.length;
            int i10 = i4;
            int i11 = 0;
            int i12 = 0;
            while (i11 < kVarArr.length) {
                androidx.media3.exoplayer.k kVar = kVarArr[i11];
                int i13 = i4;
                int i14 = 0;
                for (int i15 = 0; i15 < a2.a; i15++) {
                    i14 = Math.max(i14, kVar.a(a2.d[i15]) & 7);
                }
                int i16 = iArr2[i11] == 0 ? i13 : 0;
                if (i14 > i12 || (i14 == i12 && i9 != 0 && i10 == 0 && i16 != 0)) {
                    i10 = i16;
                    i12 = i14;
                    length3 = i11;
                }
                i11++;
                i4 = i13;
            }
            int i17 = i4;
            if (length3 == kVarArr.length) {
                iArr = new int[a2.a];
            } else {
                androidx.media3.exoplayer.k kVar2 = kVarArr[length3];
                int[] iArr5 = new int[a2.a];
                for (int i18 = 0; i18 < a2.a; i18++) {
                    iArr5[i18] = kVar2.a(a2.d[i18]);
                }
                iArr = iArr5;
            }
            int i19 = iArr2[length3];
            pfp0VarArr[length3][i19] = a2;
            iArr3[length3][i19] = iArr;
            iArr2[length3] = i19 + 1;
            i8++;
            qfp0Var3 = qfp0Var;
            i4 = i17;
        }
        int i20 = i4;
        qfp0[] qfp0VarArr = new qfp0[kVarArr.length];
        String[] strArr = new String[kVarArr.length];
        int[] iArr6 = new int[kVarArr.length];
        for (int i21 = 0; i21 < kVarArr.length; i21++) {
            int i22 = iArr2[i21];
            qfp0VarArr[i21] = new qfp0((pfp0[]) y2r0.U(pfp0VarArr[i21], i22));
            iArr3[i21] = (int[][]) y2r0.U(iArr3[i21], i22);
            strArr[i21] = kVarArr[i21].getName();
            iArr6[i21] = kVarArr[i21].getTrackType();
        }
        a aVar = new a(iArr6, qfp0VarArr, iArr4, iArr3, new qfp0((pfp0[]) y2r0.U(pfp0VarArr[kVarArr.length], iArr2[kVarArr.length])));
        final npl nplVar = (npl) this;
        synchronized (nplVar.c) {
            nplVar.g = Thread.currentThread();
            dVar = nplVar.f;
        }
        if (nplVar.j == null && (context = nplVar.d) != null) {
            nplVar.j = Boolean.valueOf(y2r0.Q(context));
        }
        if (dVar.D && Build.VERSION.SDK_INT >= 32 && nplVar.h == null) {
            nplVar.h = new npl.f(nplVar.d, nplVar, nplVar.j);
        }
        int i23 = aVar.a;
        Context context2 = nplVar.d;
        ?? r4 = new d7q.a[i23];
        int i24 = 0;
        while (true) {
            i = 2;
            if (i24 >= aVar.a) {
                r5 = 0;
                break;
            }
            if (2 == iArr6[i24] && qfp0VarArr[i24].a > 0) {
                r5 = i20;
                break;
            }
            i24++;
        }
        Pair p = npl.p(i20, aVar, iArr3, new npl.h.a() { // from class: xsna.jpl
            @Override // xsna.npl.h.a
            public final com.google.common.collect.g a(int i25, pfp0 pfp0Var, int[] iArr7) {
                npl nplVar2 = npl.this;
                nplVar2.getClass();
                npl.d dVar2 = dVar;
                mpl mplVar = new mpl(nplVar2, dVar2);
                int i26 = iArr4[i25];
                ImmutableList.b bVar2 = ImmutableList.c;
                ImmutableList.a aVar2 = new ImmutableList.a();
                for (int i27 = 0; i27 < pfp0Var.a; i27++) {
                    aVar2.c(new npl.a(i25, pfp0Var, i27, dVar2, iArr7[i27], r5, mplVar, i26));
                }
                return aVar2.g();
            }
        }, new kpl(0));
        if (p != null) {
            r4[((Integer) p.second).intValue()] = (d7q.a) p.first;
        }
        if (p == null) {
            str = null;
        } else {
            d7q.a aVar2 = (d7q.a) p.first;
            str = aVar2.a.d[aVar2.b[0]].d;
        }
        dVar.q.getClass();
        final Point z = (!dVar.g || context2 == null) ? null : y2r0.z(context2);
        Pair p2 = npl.p(2, aVar, iArr3, new npl.h.a() { // from class: xsna.hpl
            /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
            @Override // xsna.npl.h.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final com.google.common.collect.g a(int i25, pfp0 pfp0Var, int[] iArr7) {
                int i26;
                int i27;
                int i28;
                Point point;
                int i29;
                int i30;
                pfp0 pfp0Var2 = pfp0Var;
                int i31 = iArr4[i25];
                npl.d dVar2 = npl.d.this;
                Point point2 = z;
                int i32 = point2 != null ? point2.x : dVar2.e;
                int i33 = point2 != null ? point2.y : dVar2.f;
                boolean z2 = dVar2.h;
                if (i32 == Integer.MAX_VALUE || i33 == Integer.MAX_VALUE) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    int i34 = Integer.MAX_VALUE;
                    for (int i35 = 0; i35 < pfp0Var2.a; i35++) {
                        androidx.media3.common.a aVar3 = pfp0Var2.d[i35];
                        int i36 = aVar3.u;
                        int i37 = aVar3.v;
                        if (i36 > 0 && i37 > 0) {
                            if (z2) {
                                if ((i36 > i37) != (i32 > i33)) {
                                    i28 = i33;
                                    i27 = i32;
                                    int i38 = i36 * i27;
                                    int i39 = i37 * i28;
                                    point = i38 < i39 ? new Point(i28, y2r0.g(i39, i36)) : new Point(y2r0.g(i38, i37), i27);
                                    i29 = aVar3.u;
                                    i30 = i29 * i37;
                                    if (i29 >= ((int) (point.x * 0.98f)) && i37 >= ((int) (point.y * 0.98f)) && i30 < i34) {
                                        i34 = i30;
                                    }
                                }
                            }
                            i27 = i33;
                            i28 = i32;
                            int i382 = i36 * i27;
                            int i392 = i37 * i28;
                            if (i382 < i392) {
                            }
                            i29 = aVar3.u;
                            i30 = i29 * i37;
                            if (i29 >= ((int) (point.x * 0.98f))) {
                                i34 = i30;
                            }
                        }
                    }
                    i26 = i34;
                }
                ImmutableList.b bVar2 = ImmutableList.c;
                ImmutableList.a aVar4 = new ImmutableList.a();
                int i40 = 0;
                while (i40 < pfp0Var2.a) {
                    int b = pfp0Var2.d[i40].b();
                    aVar4.c(new npl.i(i25, pfp0Var2, i40, dVar2, iArr7[i40], str, i31, i26 == Integer.MAX_VALUE || (b != -1 && b <= i26)));
                    i40++;
                    pfp0Var2 = pfp0Var;
                }
                return aVar4.g();
            }
        }, new ipl());
        int i25 = 4;
        if (p2 == null) {
            r23 = 0;
            pair = npl.p(4, aVar, iArr3, new z8(dVar, 12), new gpl(0));
        } else {
            r23 = 0;
            pair = null;
        }
        if (pair != null) {
            r4[((Integer) pair.second).intValue()] = (d7q.a) pair.first;
        } else if (p2 != null) {
            r4[((Integer) p2.second).intValue()] = (d7q.a) p2.first;
        }
        if (!dVar.t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str2 = r23;
        } else {
            String str3 = y2r0.a;
            str2 = locale.toLanguageTag();
        }
        int i26 = 3;
        Pair p3 = npl.p(3, aVar, iArr3, new wll(dVar, str, str2), new lpl());
        if (p3 != null) {
            r4[((Integer) p3.second).intValue()] = (d7q.a) p3.first;
        }
        int i27 = 0;
        while (i27 < i23) {
            int i28 = iArr6[i27];
            if (i28 == i || i28 == 1 || i28 == i26 || i28 == i25) {
                i2 = i27;
            } else {
                qfp0 qfp0Var4 = qfp0VarArr[i27];
                int[][] iArr7 = iArr3[i27];
                pfp0 pfp0Var = r23;
                pfp0 pfp0Var2 = pfp0Var;
                int i29 = 0;
                int i30 = 0;
                while (i29 < qfp0Var4.a) {
                    pfp0 a3 = qfp0Var4.a(i29);
                    int[] iArr8 = iArr7[i29];
                    ?? r12 = pfp0Var2;
                    int i31 = i30;
                    pfp0 pfp0Var3 = pfp0Var;
                    int i32 = 0;
                    while (i32 < a3.a) {
                        int i33 = i27;
                        if (androidx.media3.exoplayer.k.m(iArr8[i32], dVar.E)) {
                            i3 = i32;
                            npl.c cVar = new npl.c(iArr8[i3], a3.d[i32]);
                            if (r12 != 0) {
                                qfp0Var2 = qfp0Var4;
                                if (c7i.a.d(cVar.c, r12.c).d(cVar.b, r12.b).f() <= 0) {
                                }
                            } else {
                                qfp0Var2 = qfp0Var4;
                            }
                            pfp0Var3 = a3;
                            r12 = cVar;
                            i31 = i3;
                        } else {
                            i3 = i32;
                            qfp0Var2 = qfp0Var4;
                        }
                        i32 = i3 + 1;
                        i27 = i33;
                        qfp0Var4 = qfp0Var2;
                        r12 = r12;
                    }
                    i29++;
                    pfp0Var = pfp0Var3;
                    i30 = i31;
                    pfp0Var2 = r12;
                }
                i2 = i27;
                r4[i2] = pfp0Var == null ? r23 : new d7q.a(0, pfp0Var, new int[]{i30});
            }
            i27 = i2 + 1;
            i26 = 3;
            i = 2;
            i25 = 4;
        }
        int i34 = aVar.a;
        qfp0[] qfp0VarArr2 = aVar.c;
        HashMap hashMap = new HashMap();
        for (int i35 = 0; i35 < i34; i35++) {
            npl.k(qfp0VarArr2[i35], dVar, hashMap);
        }
        npl.k(aVar.f, dVar, hashMap);
        for (int i36 = 0; i36 < i34; i36++) {
            zgp0 zgp0Var = (zgp0) hashMap.get(Integer.valueOf(aVar.b[i36]));
            if (zgp0Var != null) {
                pfp0 pfp0Var4 = zgp0Var.a;
                ImmutableList<Integer> immutableList = zgp0Var.b;
                r4[i36] = (immutableList.isEmpty() || qfp0VarArr2[i36].b(pfp0Var4) == -1) ? r23 : new d7q.a(0, pfp0Var4, ipx.x(immutableList));
            }
        }
        int i37 = aVar.a;
        for (int i38 = 0; i38 < i37; i38++) {
            qfp0 qfp0Var5 = aVar.c[i38];
            Map<qfp0, npl.e> map = dVar.G.get(i38);
            if (map != null && map.containsKey(qfp0Var5)) {
                Map<qfp0, npl.e> map2 = dVar.G.get(i38);
                if ((map2 != null ? map2.get(qfp0Var5) : r23) != null) {
                    throw r23;
                }
                r4[i38] = r23;
            }
        }
        for (int i39 = 0; i39 < i23; i39++) {
            int i40 = aVar.b[i39];
            if (dVar.H.get(i39) || dVar.x.contains(Integer.valueOf(i40))) {
                r4[i39] = r23;
            }
        }
        ?? r3 = nplVar.e;
        p06 p06Var = nplVar.b;
        p06Var.getClass();
        d7q[] a4 = r3.a(r4, p06Var);
        wyf0[] wyf0VarArr = new wyf0[i23];
        for (int i41 = 0; i41 < i23; i41++) {
            wyf0VarArr[i41] = (dVar.H.get(i41) || dVar.x.contains(Integer.valueOf(aVar.b[i41])) || (aVar.b[i41] != -2 && a4[i41] == null)) ? r23 : wyf0.c;
        }
        dVar.q.getClass();
        Pair create = Pair.create(wyf0VarArr, a4);
        wgp0[] wgp0VarArr = (wgp0[]) create.second;
        List[] listArr = new List[wgp0VarArr.length];
        for (int i42 = 0; i42 < wgp0VarArr.length; i42++) {
            wgp0 wgp0Var = wgp0VarArr[i42];
            if (wgp0Var != null) {
                gVar = ImmutableList.p(wgp0Var);
            } else {
                ImmutableList.b bVar2 = ImmutableList.c;
                gVar = com.google.common.collect.g.f;
            }
            listArr[i42] = gVar;
        }
        return new ehp0((wyf0[]) create.first, (d7q[]) create.second, bhp0.a(aVar, listArr), aVar);
    }
}
