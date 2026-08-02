package yads;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class bf1 {
    public final v9 a;
    public final kz b;
    public final b2 c;
    public final int d;
    public final f2 e;
    public final d4 f;
    public final ov2 g;
    public final cf1 h;
    public final z30 i;

    public /* synthetic */ bf1(Context context, v9 v9Var, kz kzVar, b2 b2Var, int i, q2 q2Var, d4 d4Var, ov2 ov2Var) {
        this(v9Var, kzVar, b2Var, i, q2Var, d4Var, ov2Var, new cf1(), new a40(context, ov2Var, new br2().b(v9Var, d4Var)).a());
    }

    public final af1 a(Context context, ViewGroup viewGroup, x12 x12Var, z00 z00Var, z3 z3Var, js2 js2Var, o73 o73Var, qh0 qh0Var, hi0 hi0Var, j7 j7Var) {
        d4 d4Var = this.f;
        ov2 ov2Var = this.g;
        v9 v9Var = this.a;
        f2 f2Var = this.e;
        int i = this.d;
        List a = (v9Var.a == e00.f ? new ss2(new os2(d4Var, ov2Var, f2Var, i)) : new rd1(ov2Var, new qd1(d4Var, ov2Var, f2Var, i), new e02())).a(context, this.a, x12Var, this.b, this.c, this.i, z3Var, js2Var, o73Var, qh0Var, hi0Var, j7Var);
        cf1 cf1Var = this.h;
        v9 v9Var2 = this.a;
        kz kzVar = this.b;
        cf1Var.getClass();
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            v9 v9Var3 = v9Var2;
            kz kzVar2 = kzVar;
            arrayList.add(((wy0) it.next()).a(context, v9Var3, x12Var, kzVar2, z00Var));
            v9Var2 = v9Var3;
            kzVar = kzVar2;
        }
        return new af1(context, viewGroup, new ze1(arrayList), new xe1(), new we1());
    }

    public bf1(v9 v9Var, kz kzVar, b2 b2Var, int i, q2 q2Var, d4 d4Var, ov2 ov2Var, cf1 cf1Var, z30 z30Var) {
        this.a = v9Var;
        this.b = kzVar;
        this.c = b2Var;
        this.d = i;
        this.e = q2Var;
        this.f = d4Var;
        this.g = ov2Var;
        this.h = cf1Var;
        this.i = z30Var;
    }

    public final ArrayList a(Context context, ExtendedNativeAdView extendedNativeAdView, x12 x12Var, z00 z00Var, f7 f7Var, js2 js2Var, tk2 tk2Var, i7 i7Var, ArrayList arrayList, hi0 hi0Var, c7 c7Var, lw lwVar) {
        af1 a;
        if (x12Var instanceof w32) {
            w32 w32Var = (w32) x12Var;
            List list = c7Var.a;
            ArrayList i = w32Var.i();
            ArrayList arrayList2 = new ArrayList();
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                j7 j7Var = (j7) j5g.b0(i2, list);
                arrayList2.add(a(context, extendedNativeAdView, (x12) i.get(i2), new s53(z00Var), f7Var, js2Var, new o73(tk2Var, new d7(list), new h7(j7Var != null ? j7Var.a : 0L), new e7(c7Var, i2), lwVar), i7Var, arrayList != null ? (hi0) j5g.b0(i2, arrayList) : null, j7Var));
            }
            j7 j7Var2 = (j7) j5g.b0(i.size(), list);
            a = hi0Var != null ? a(context, extendedNativeAdView, w32Var, z00Var, f7Var, js2Var, new o73(tk2Var, new d7(list), new h7(j7Var2 != null ? j7Var2.a : 0L), new gc2(), lwVar), i7Var, hi0Var, j7Var2) : null;
            if (a != null) {
                arrayList2.add(a);
            }
            return arrayList2;
        }
        List list2 = c7Var.a;
        ArrayList arrayList3 = new ArrayList();
        d7 d7Var = new d7(list2);
        j7 j7Var3 = (j7) j5g.a0(list2);
        arrayList3.add(a(context, extendedNativeAdView, x12Var, z00Var, f7Var, js2Var, new o73(tk2Var, d7Var, new h7(j7Var3 != null ? j7Var3.a : 0L), new e7(c7Var, 0), lwVar), i7Var, arrayList != null ? (hi0) j5g.a0(arrayList) : null, (j7) j5g.a0(list2)));
        j7 j7Var4 = (j7) j5g.b0(1, list2);
        a = hi0Var != null ? a(context, extendedNativeAdView, x12Var, z00Var, f7Var, js2Var, new o73(tk2Var, new d7(list2), new h7(j7Var4 != null ? j7Var4.a : 0L), new gc2()), i7Var, hi0Var, j7Var4) : null;
        if (a != null) {
            arrayList3.add(a);
        }
        return arrayList3;
    }
}
