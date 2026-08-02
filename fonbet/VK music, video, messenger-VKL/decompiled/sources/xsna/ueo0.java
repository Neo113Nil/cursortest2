package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.jio0;
import xsna.teo0;
import xsna.veo0;

/* compiled from: TextEditReducer.kt */
/* loaded from: classes4.dex */
public final class ueo0 extends z9 {
    public static veo0 h(veo0 veo0Var, teo0 teo0Var) {
        if (teo0Var instanceof neo0) {
            wlo0 a = wlo0.a(veo0Var.c, null, null, null, ((neo0) teo0Var).a, null, 23);
            gfo0 a2 = yeo0.a(veo0Var.a, a);
            veo0.a aVar = veo0Var.e;
            return veo0.a(veo0Var, null, a2, a, aVar, aVar, 33);
        }
        veo0 veo0Var2 = veo0Var;
        if (teo0Var instanceof oeo0) {
            wlo0 a3 = wlo0.a(veo0Var2.c, null, null, ((oeo0) teo0Var).a, null, null, 27);
            gfo0 a4 = yeo0.a(veo0Var2.a, a3);
            veo0.a aVar2 = veo0Var2.e;
            return veo0.a(veo0Var2, null, a4, a3, aVar2, aVar2, 33);
        }
        if (teo0Var instanceof peo0) {
            wlo0 a5 = wlo0.a(veo0Var2.c, null, null, null, null, ((peo0) teo0Var).a, 15);
            gfo0 a6 = yeo0.a(veo0Var2.a, a5);
            veo0.a aVar3 = veo0Var2.e;
            return veo0.a(veo0Var2, null, a6, a5, aVar3, aVar3, 33);
        }
        if (teo0Var instanceof qeo0) {
            wlo0 wlo0Var = veo0Var2.c;
            t4s t4sVar = wlo0Var.b;
            jio0.a aVar4 = ((qeo0) teo0Var).a;
            float f = t4sVar.b;
            t4sVar.getClass();
            wlo0 a7 = wlo0.a(wlo0Var, null, new t4s(aVar4, f), null, null, null, 29);
            gfo0 a8 = yeo0.a(veo0Var2.a, a7);
            veo0.a aVar5 = veo0Var2.e;
            return veo0.a(veo0Var2, null, a8, a7, aVar5, aVar5, 33);
        }
        if (teo0Var instanceof seo0) {
            wlo0 wlo0Var2 = veo0Var2.c;
            t4s t4sVar2 = wlo0Var2.b;
            float f2 = ((seo0) teo0Var).a;
            jio0.a aVar6 = t4sVar2.a;
            t4sVar2.getClass();
            wlo0 a9 = wlo0.a(wlo0Var2, null, new t4s(aVar6, f2), null, null, null, 29);
            gfo0 a10 = yeo0.a(veo0Var2.a, a9);
            veo0.a aVar7 = veo0Var2.e;
            return veo0.a(veo0Var2, null, a10, a9, aVar7, aVar7, 33);
        }
        if (teo0Var instanceof reo0) {
            wlo0 a11 = wlo0.a(veo0Var2.c, ((reo0) teo0Var).a, null, null, null, null, 30);
            gfo0 a12 = yeo0.a(veo0Var2.a, a11);
            veo0.a aVar8 = veo0Var2.e;
            return veo0.a(veo0Var2, null, a12, a11, aVar8, aVar8, 33);
        }
        if (teo0Var instanceof teo0.c) {
            for (teo0 teo0Var2 : ((teo0.c) teo0Var).a) {
                veo0Var2 = h(veo0Var2, teo0Var2);
            }
            return veo0Var2;
        }
        if (!(teo0Var instanceof teo0.a)) {
            if (teo0Var instanceof teo0.b) {
                return ((teo0.b) teo0Var).a;
            }
            throw new NoWhenBranchMatchedException();
        }
        teo0.a aVar9 = (teo0.a) teo0Var;
        veo0.a aVar10 = veo0Var2.e;
        if (epx.f(aVar9, teo0.a.C3741a.a)) {
            return veo0.a(veo0Var2, null, null, null, aVar10, veo0.a.C3885a.a, 39);
        }
        if (epx.f(aVar9, teo0.a.b.a)) {
            return veo0.a(veo0Var2, null, null, null, aVar10, veo0.a.b.a, 39);
        }
        if (aVar9 instanceof teo0.a.c) {
            return veo0.a(veo0Var2, null, null, null, aVar10, new veo0.a.d(((teo0.a.c) aVar9).a), 39);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.z9
    public final void d(mwx mwxVar) {
        Object value;
        teo0 teo0Var = (teo0) mwxVar;
        utk0 utk0Var = (utk0) this.a;
        do {
            value = utk0Var.getValue();
        } while (!utk0Var.compareAndSet(value, h((veo0) value, teo0Var)));
    }
}
