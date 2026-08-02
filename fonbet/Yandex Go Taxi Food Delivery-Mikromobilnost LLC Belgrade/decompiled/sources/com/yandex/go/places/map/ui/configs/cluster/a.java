package com.yandex.go.places.map.ui.configs.cluster;

import android.graphics.Bitmap;
import com.yandex.go.coroutines.b;
import defpackage.an91;
import defpackage.bo00;
import defpackage.bwh0;
import defpackage.co00;
import defpackage.do00;
import defpackage.e8c;
import defpackage.evu0;
import defpackage.fnb0;
import defpackage.fo00;
import defpackage.g8e;
import defpackage.gn00;
import defpackage.h73;
import defpackage.hn00;
import defpackage.i2c0;
import defpackage.ixy0;
import defpackage.jn00;
import defpackage.k7v;
import defpackage.kn00;
import defpackage.ldc0;
import defpackage.o6c0;
import defpackage.odc0;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.r7c;
import defpackage.s5r;
import defpackage.tcc0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wcc0;
import defpackage.xn00;
import defpackage.ycc;
import defpackage.zfc0;
import defpackage.zn00;
import defpackage.zwy0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes13.dex */
public final class a {
    public final zfc0 a;
    public final e8c b;
    public final tcc0 c;
    public final pav d;
    public final pwy0 e;
    public volatile Bitmap f;

    public a(zfc0 zfc0Var, e8c e8cVar, tcc0 tcc0Var, pav pavVar, tse tseVar, pwy0 pwy0Var, odc0 odc0Var) {
        ixy0 ixy0Var;
        k7v k7vVar;
        String str;
        this.a = zfc0Var;
        this.b = e8cVar;
        this.c = tcc0Var;
        this.d = pavVar;
        this.e = pwy0Var;
        an91 an91Var = odc0Var.h;
        ldc0 ldc0Var = an91Var instanceof ldc0 ? (ldc0) an91Var : null;
        if (ldc0Var == null || (ixy0Var = ldc0Var.g) == null || (k7vVar = ixy0Var.a) == null || (str = k7vVar.a) == null || evu0.J(str)) {
            return;
        }
        b.g(tseVar, null, null, new PlacesClusterAssetsProviderImpl$loadStubCard$1(this, str, null), 3);
    }

    public static zwy0 b(kn00 kn00Var) {
        if (kn00Var instanceof hn00) {
            fo00 fo00Var = ((hn00) kn00Var).h;
            if (fo00Var instanceof bo00) {
                return ((bo00) fo00Var).b;
            }
            if (fo00Var instanceof xn00) {
                return ((xn00) fo00Var).a;
            }
            if (fo00Var instanceof co00) {
                return ((co00) fo00Var).b;
            }
            if (fo00Var instanceof zn00) {
                return ((zn00) fo00Var).a;
            }
            if (fo00Var instanceof do00) {
                return ((do00) fo00Var).a;
            }
        } else {
            if (kn00Var instanceof gn00) {
                return ((gn00) kn00Var).h;
            }
            if (!(kn00Var instanceof jn00)) {
                w511.b();
                return null;
            }
            Bitmap bitmap = ((jn00) kn00Var).f;
            if (bitmap != null) {
                return new zwy0(bitmap, null);
            }
        }
        return null;
    }

    public static r7c c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((r7c) it.next()).a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ycc.r(((r7c) it2.next()).c, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ycc.r(((r7c) it3.next()).d, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ycc.r(((r7c) it4.next()).e, arrayList4);
        }
        return new r7c(i, "supercluster", arrayList2, arrayList3, arrayList4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r4.length() > 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence a(ArrayList arrayList) {
        CharSequence charSequence;
        String str;
        String obj;
        s5r s5rVar = new s5r(kotlin.sequences.b.o(kotlin.sequences.b.g(kotlin.sequences.b.g(new h73(1, arrayList), new fnb0(10, this)), o6c0.a), new fnb0(11)));
        do {
            charSequence = null;
            if (!s5rVar.hasNext()) {
                break;
            }
            xn00 xn00Var = (xn00) s5rVar.next();
            CharSequence charSequence2 = xn00Var.c;
            CharSequence charSequence3 = xn00Var.d;
            if (charSequence3 != null && (obj = charSequence3.toString()) != null) {
                if (!evu0.z(obj, (char) 183)) {
                    obj = null;
                }
                if (obj != null) {
                    str = evu0.k0(evu0.e0((char) 183, obj, obj)).toString();
                    if (str != null) {
                    }
                }
            }
            str = null;
            if (str != null) {
                charSequence = str;
            } else if (charSequence2 != null && !evu0.J(charSequence2)) {
                charSequence = charSequence2;
            }
        } while (charSequence == null);
        return charSequence;
    }

    public final i2c0 d(r7c r7cVar) {
        ArrayList arrayList = r7cVar.c;
        int i = r7cVar.a;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (b((kn00) it.next()) != null) {
                    i2c0 i2 = this.a.f.i(1.0f);
                    CharSequence a = a(r7cVar.c);
                    int i3 = i - 1;
                    e8c e8cVar = this.b;
                    e8cVar.getClass();
                    int i4 = i <= 2 ? 2 : 3;
                    int i5 = i2.a;
                    int i6 = i2.b;
                    Pair b = e8c.b(i5, i6);
                    int intValue = ((Number) b.getFirst()).intValue();
                    int intValue2 = ((Number) b.getSecond()).intValue();
                    int i7 = (int) (i5 * 0.65f);
                    if (i7 < 1) {
                        i7 = 1;
                    }
                    Pair pair = new Pair(Integer.valueOf((intValue * 2) + g8e.d(i4, 1, i7, i5)), Integer.valueOf(intValue2 + i6 + (i4 == 3 ? Math.max(intValue2, e8cVar.d) : intValue2)));
                    int intValue3 = ((Number) pair.getFirst()).intValue();
                    int intValue4 = ((Number) pair.getSecond()).intValue();
                    wcc0 a2 = e8cVar.a(a, i3 <= 0 ? null : e8cVar.a.getResources().getQuantityString(bwh0.discovery_cluster_extra_places, i3, Integer.valueOf(i3)));
                    int max = Math.max(intValue3, a2 != null ? a2.a : 0);
                    int i8 = a2 != null ? e8cVar.c + a2.b : 0;
                    int i9 = e8cVar.e * 2;
                    return new i2c0(max + i9, i9 + intValue4 + i8);
                }
            }
        }
        return new i2c0(0, 0);
    }
}
