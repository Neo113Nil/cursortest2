package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class vy0 {
    public final v9 a;
    public final ViewGroup b;
    public final ov2 c;
    public final z00 d;
    public final bf1 e;
    public final a4 f;

    public /* synthetic */ vy0(Context context, v9 v9Var, RelativeLayout relativeLayout, kz kzVar, b2 b2Var, int i, q2 q2Var, d4 d4Var, ov2 ov2Var) {
        this(v9Var, relativeLayout, ov2Var, new j42(q2Var, new ny0(gx2.a().a(context))), new bf1(context, v9Var, kzVar, b2Var, i, q2Var, d4Var, ov2Var), new a4(q2Var));
    }

    public final qy0 a(Context context, x12 x12Var, kz kzVar) {
        ArrayList arrayList;
        hi0 hi0Var;
        kz kzVar2;
        js2 js2Var;
        ArrayList arrayList2;
        Object obj;
        js2 js2Var2 = new js2(context, new fi0(x12Var, kzVar, ((mv3) this.c).a(), new ni0(), new xi0()), kzVar);
        a4 a4Var = this.f;
        v9 v9Var = this.a;
        a4Var.getClass();
        t2 nr2Var = v9Var.a == e00.f ? new nr2(js2Var2, new or2(a4Var.a)) : new ed1();
        List d = x12Var.d();
        if (d != null) {
            arrayList = new ArrayList();
            for (Object obj2 : d) {
                String str = ((hi0) obj2).a;
                fg0[] fg0VarArr = fg0.b;
                if (epx.f(str, "ad")) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        List d2 = x12Var.d();
        if (d2 != null) {
            ListIterator listIterator = d2.listIterator(d2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                String str2 = ((hi0) obj).a;
                fg0[] fg0VarArr2 = fg0.b;
                if (epx.f(str2, "pack_shot")) {
                    break;
                }
            }
            hi0Var = (hi0) obj;
        } else {
            hi0Var = null;
        }
        e22 b = x12Var.b();
        c7 c7Var = b != null ? b.j : null;
        String str3 = this.a.p;
        cg0[] cg0VarArr = cg0.b;
        if (!epx.f(str3, "ad_pod") || c7Var == null) {
            kzVar2 = kzVar;
            js2Var = js2Var2;
            arrayList2 = arrayList;
        } else {
            if ((x12Var instanceof w32) || hi0Var != null) {
                z00 z00Var = this.d;
                return new g7(context, x12Var, z00Var, js2Var2, arrayList, hi0Var, this.b, nr2Var, kzVar, this.e, c7Var, new ExtendedNativeAdView(context), new s2(x12Var, kzVar, z00Var), new tk2(), new lw(), new vr2(new b83()));
            }
            kzVar2 = kzVar;
            arrayList2 = arrayList;
            js2Var = js2Var2;
        }
        ArrayList arrayList3 = arrayList2;
        return new uy0(this.e.a(context, this.b, x12Var, this.d, new yl2(nr2Var), js2Var, new o73(new tk2(), new k03(this.a), new q03(this.a), new p03()), new r03(), arrayList3 != null ? (hi0) j5g.a0(arrayList3) : null, null), kzVar2);
    }

    public vy0(v9 v9Var, RelativeLayout relativeLayout, ov2 ov2Var, z00 z00Var, bf1 bf1Var, a4 a4Var) {
        this.a = v9Var;
        this.b = relativeLayout;
        this.c = ov2Var;
        this.d = z00Var;
        this.e = bf1Var;
        this.f = a4Var;
    }
}
