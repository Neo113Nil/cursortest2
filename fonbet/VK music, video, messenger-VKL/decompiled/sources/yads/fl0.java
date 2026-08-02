package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class fl0 extends j03 {
    public final ol0 m;

    public fl0(List list) {
        kc2 kc2Var = new kc2((byte[]) list.get(0));
        this.m = new ol0(kc2Var.r(), kc2Var.r());
    }

    @Override // yads.j03
    public final v53 a(byte[] bArr, int i, boolean z) {
        boolean z2;
        List unmodifiableList;
        char c;
        ll0 ll0Var;
        int i2;
        int i3;
        int i4;
        int i5;
        if (z) {
            nl0 nl0Var = this.m.f;
            nl0Var.c.clear();
            nl0Var.d.clear();
            nl0Var.e.clear();
            nl0Var.f.clear();
            nl0Var.g.clear();
            nl0Var.h = null;
            nl0Var.i = null;
        }
        ol0 ol0Var = this.m;
        ol0Var.getClass();
        jc2 jc2Var = new jc2(i, bArr);
        while (true) {
            z2 = true;
            if (jc2Var.b() >= 48 && jc2Var.a(8) == 15) {
                nl0 nl0Var2 = ol0Var.f;
                int a = jc2Var.a(8);
                int i6 = 16;
                int a2 = jc2Var.a(16);
                int a3 = jc2Var.a(16);
                int c2 = jc2Var.c() + a3;
                if (a3 * 8 > jc2Var.b()) {
                    ji1.d("DvbParser", "Data field length exceeds limit");
                    jc2Var.c(jc2Var.b());
                } else {
                    switch (a) {
                        case 16:
                            if (a2 == nl0Var2.a) {
                                jl0 jl0Var = nl0Var2.i;
                                jc2Var.a(8);
                                int a4 = jc2Var.a(4);
                                int a5 = jc2Var.a(2);
                                jc2Var.c(2);
                                int i7 = a3 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i7 > 0) {
                                    int a6 = jc2Var.a(8);
                                    jc2Var.c(8);
                                    i7 -= 6;
                                    sparseArray.put(a6, new kl0(jc2Var.a(16), jc2Var.a(16)));
                                }
                                jl0 jl0Var2 = new jl0(a4, a5, sparseArray);
                                if (a5 != 0) {
                                    nl0Var2.i = jl0Var2;
                                    nl0Var2.c.clear();
                                    nl0Var2.d.clear();
                                    nl0Var2.e.clear();
                                    break;
                                } else if (jl0Var != null && jl0Var.a != a4) {
                                    nl0Var2.i = jl0Var2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            jl0 jl0Var3 = nl0Var2.i;
                            if (a2 == nl0Var2.a && jl0Var3 != null) {
                                int a7 = jc2Var.a(8);
                                jc2Var.c(4);
                                boolean e = jc2Var.e();
                                jc2Var.c(3);
                                int a8 = jc2Var.a(16);
                                int a9 = jc2Var.a(16);
                                jc2Var.a(3);
                                int a10 = jc2Var.a(3);
                                jc2Var.c(2);
                                int a11 = jc2Var.a(8);
                                int a12 = jc2Var.a(8);
                                int a13 = jc2Var.a(4);
                                int a14 = jc2Var.a(2);
                                jc2Var.c(2);
                                int i8 = a3 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i8 > 0) {
                                    int a15 = jc2Var.a(i6);
                                    int a16 = jc2Var.a(2);
                                    jc2Var.a(2);
                                    int a17 = jc2Var.a(12);
                                    jc2Var.c(4);
                                    int a18 = jc2Var.a(12);
                                    int i9 = i8 - 6;
                                    if (a16 == 1 || a16 == 2) {
                                        jc2Var.a(8);
                                        jc2Var.a(8);
                                        i8 -= 8;
                                    } else {
                                        i8 = i9;
                                    }
                                    sparseArray2.put(a15, new ml0(a17, a18));
                                    i6 = 16;
                                }
                                ll0 ll0Var2 = new ll0(a7, e, a8, a9, a10, a11, a12, a13, a14, sparseArray2);
                                if (jl0Var3.b == 0 && (ll0Var = (ll0) nl0Var2.c.get(a7)) != null) {
                                    SparseArray sparseArray3 = ll0Var.j;
                                    for (int i10 = 0; i10 < sparseArray3.size(); i10++) {
                                        ll0Var2.j.put(sparseArray3.keyAt(i10), (ml0) sparseArray3.valueAt(i10));
                                    }
                                }
                                nl0Var2.c.put(ll0Var2.a, ll0Var2);
                                break;
                            }
                            break;
                        case 18:
                            if (a2 == nl0Var2.a) {
                                gl0 a19 = ol0.a(jc2Var, a3);
                                nl0Var2.d.put(a19.a, a19);
                                break;
                            } else if (a2 == nl0Var2.b) {
                                gl0 a20 = ol0.a(jc2Var, a3);
                                nl0Var2.f.put(a20.a, a20);
                                break;
                            }
                            break;
                        case 19:
                            if (a2 == nl0Var2.a) {
                                il0 a21 = ol0.a(jc2Var);
                                nl0Var2.e.put(a21.a, a21);
                                break;
                            } else if (a2 == nl0Var2.b) {
                                il0 a22 = ol0.a(jc2Var);
                                nl0Var2.g.put(a22.a, a22);
                                break;
                            }
                            break;
                        case 20:
                            if (a2 == nl0Var2.a) {
                                jc2Var.c(4);
                                boolean e2 = jc2Var.e();
                                jc2Var.c(3);
                                int a23 = jc2Var.a(16);
                                int a24 = jc2Var.a(16);
                                if (e2) {
                                    int a25 = jc2Var.a(16);
                                    i2 = jc2Var.a(16);
                                    i5 = jc2Var.a(16);
                                    i4 = a25;
                                    i3 = jc2Var.a(16);
                                } else {
                                    i2 = a23;
                                    i3 = a24;
                                    i4 = 0;
                                    i5 = 0;
                                }
                                nl0Var2.h = new hl0(a23, a24, i4, i2, i5, i3);
                                break;
                            }
                            break;
                    }
                    jc2Var.d(c2 - jc2Var.c());
                }
            }
        }
        nl0 nl0Var3 = ol0Var.f;
        jl0 jl0Var4 = nl0Var3.i;
        if (jl0Var4 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            hl0 hl0Var = nl0Var3.h;
            if (hl0Var == null) {
                hl0Var = ol0Var.d;
            }
            Bitmap bitmap = ol0Var.g;
            if (bitmap == null || hl0Var.a + 1 != bitmap.getWidth() || hl0Var.b + 1 != ol0Var.g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(hl0Var.a + 1, hl0Var.b + 1, Bitmap.Config.ARGB_8888);
                ol0Var.g = createBitmap;
                ol0Var.c.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = jl0Var4.c;
            int i11 = 0;
            while (i11 < sparseArray4.size()) {
                ol0Var.c.save();
                kl0 kl0Var = (kl0) sparseArray4.valueAt(i11);
                ll0 ll0Var3 = (ll0) ol0Var.f.c.get(sparseArray4.keyAt(i11));
                int i12 = kl0Var.a + hl0Var.c;
                int i13 = kl0Var.b + hl0Var.e;
                ol0Var.c.clipRect(i12, i13, Math.min(ll0Var3.c + i12, hl0Var.d), Math.min(ll0Var3.d + i13, hl0Var.f));
                gl0 gl0Var = (gl0) ol0Var.f.d.get(ll0Var3.f);
                if (gl0Var == null && (gl0Var = (gl0) ol0Var.f.f.get(ll0Var3.f)) == null) {
                    gl0Var = ol0Var.e;
                }
                SparseArray sparseArray5 = ll0Var3.j;
                boolean z3 = z2;
                for (int i14 = 0; i14 < sparseArray5.size(); i14++) {
                    int keyAt = sparseArray5.keyAt(i14);
                    ml0 ml0Var = (ml0) sparseArray5.valueAt(i14);
                    il0 il0Var = (il0) ol0Var.f.e.get(keyAt);
                    if (il0Var == null) {
                        il0Var = (il0) ol0Var.f.g.get(keyAt);
                    }
                    if (il0Var != null) {
                        Paint paint = il0Var.b ? null : ol0Var.a;
                        int i15 = ll0Var3.e;
                        int i16 = i12 + ml0Var.a;
                        int i17 = i13 + ml0Var.b;
                        Canvas canvas = ol0Var.c;
                        int[] iArr = i15 == 3 ? gl0Var.d : i15 == 2 ? gl0Var.c : gl0Var.b;
                        ol0.a(il0Var.c, iArr, i15, i16, i17, paint, canvas);
                        ol0.a(il0Var.d, iArr, i15, i16, i17 + 1, paint, canvas);
                    }
                }
                if (ll0Var3.b) {
                    int i18 = ll0Var3.e;
                    c = 3;
                    ol0Var.b.setColor(i18 == 3 ? gl0Var.d[ll0Var3.g] : i18 == 2 ? gl0Var.c[ll0Var3.h] : gl0Var.b[ll0Var3.i]);
                    ol0Var.c.drawRect(i12, i13, ll0Var3.c + i12, ll0Var3.d + i13, ol0Var.b);
                } else {
                    c = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(ol0Var.g, i12, i13, ll0Var3.c, ll0Var3.d);
                float f = hl0Var.a;
                float f2 = i13;
                float f3 = hl0Var.b;
                arrayList.add(new o20(null, null, null, createBitmap2, f2 / f3, 0, 0, i12 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, ll0Var3.c / f, ll0Var3.d / f3, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                ol0Var.c.drawColor(0, PorterDuff.Mode.CLEAR);
                ol0Var.c.restore();
                i11++;
                z2 = z3;
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return new pl0(unmodifiableList);
    }
}
