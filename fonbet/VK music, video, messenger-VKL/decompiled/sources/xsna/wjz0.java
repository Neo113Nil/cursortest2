package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ocz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class wjz0 {
    public final ocz0 a;
    public final int b;
    public final vul c;
    public final kbz0 d;
    public final kbz0 e;
    public final l0n f;
    public final lhz0 g;
    public final ArrayList h;

    public wjz0(ocz0 ocz0Var) {
        int i;
        this.a = ocz0Var;
        if ("promoImageCarousel".equals(ocz0Var.E)) {
            i = 5;
        } else if ("promoVideoCarousel".equals(ocz0Var.E)) {
            i = 6;
        } else if (ocz0Var.b0 != null) {
            i = 3;
        } else if (ocz0Var.X != null) {
            i = 1;
        } else {
            ArrayList arrayList = ocz0Var.a0;
            i = (arrayList == null || arrayList.isEmpty()) ? ocz0Var.t != null ? 0 : ("post_vk".equals(ocz0Var.E) || "vk_post".equals(ocz0Var.E) || "vk_clip".equals(ocz0Var.E)) ? 4 : IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE : 2;
        }
        this.b = i;
        kiw kiwVar = ocz0Var.u;
        if (kiwVar != null) {
            this.d = new kbz0(kiwVar);
        }
        kiw kiwVar2 = ocz0Var.t;
        if (kiwVar2 != null) {
            this.e = new kbz0(kiwVar2);
        }
        if (ocz0Var.Y != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ocz0Var.Y.iterator();
            while (it.hasNext()) {
                arrayList2.add(new kbz0((kiw) it.next()));
            }
        }
        this.f = ocz0Var.A;
        ocz0.d dVar = ocz0Var.X;
        if (dVar != null) {
            this.g = new lhz0(dVar);
        }
        if (ocz0Var.a0 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ocz0Var.a0.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new sez0((ocz0.a) it2.next()));
            }
            this.h = arrayList3;
        }
        String str = ocz0Var.H;
        this.c = (str == null || ocz0Var.q == null) ? null : new vul(ocz0Var, str);
    }

    public final String a() {
        return this.a.r;
    }

    public final String b() {
        return this.a.h;
    }

    public final String c() {
        return this.a.n();
    }

    public final l0n d() {
        l0n l0nVar = this.f;
        if (l0nVar == null) {
            return null;
        }
        l0n l0nVar2 = new l0n(l0nVar.a, l0nVar.d, l0nVar.c, l0nVar.b);
        l0nVar2.e.putAll(l0nVar.e);
        return l0nVar2;
    }

    public final kbz0 e() {
        return this.d;
    }

    public final kbz0 f() {
        return this.e;
    }

    public final String g() {
        return this.a.f;
    }

    public final lhz0 h() {
        return this.g;
    }
}
