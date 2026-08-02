package xsna;

import com.vk.tabbar.settings.impl.mvi.InteractSource;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.awn0;
import xsna.t0j0;
import xsna.y2j0;

/* compiled from: TabbarSettingsReducer.kt */
/* loaded from: classes6.dex */
public final class fwn0 extends dm50<nwn0, awn0, mwn0> {
    @Override // xsna.dm50
    public final mwn0 c(mwn0 mwn0Var, awn0 awn0Var) {
        mwn0 mwn0Var2 = mwn0Var;
        awn0 awn0Var2 = awn0Var;
        t0j0 t0j0Var = mwn0Var2.c;
        y2j0 y2j0Var = mwn0Var2.b;
        if (awn0Var2 instanceof awn0.d) {
            return new mwn0(y2j0.c.a, ((awn0.d) awn0Var2).b, false, false);
        }
        if (awn0Var2 instanceof awn0.b) {
            return new mwn0(y2j0.b.a, t0j0.b.a, false, false);
        }
        if (awn0Var2 instanceof awn0.e) {
            if (y2j0Var instanceof y2j0.a) {
                y2j0Var = y2j0.a.a((y2j0.a) y2j0Var, ((awn0.e) awn0Var2).b, null, 0, null, 0, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            }
            if (t0j0Var instanceof t0j0.a) {
                t0j0Var = t0j0.a.a((t0j0.a) t0j0Var, !((awn0.e) awn0Var2).b, null, InteractSource.NOT_USER_INTERACT, 2);
            }
            return new mwn0(y2j0Var, t0j0Var, ((awn0.e) awn0Var2).c, false);
        }
        if (awn0Var2 instanceof awn0.c) {
            awn0.c cVar = (awn0.c) awn0Var2;
            return new mwn0(cVar.b, cVar.c, false, false);
        }
        if (!(awn0Var2 instanceof awn0.a)) {
            if (awn0Var2 instanceof awn0.f) {
                return new mwn0(y2j0Var, t0j0Var, mwn0Var2.d, true);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (y2j0Var instanceof y2j0.a) {
            awn0.a aVar = (awn0.a) awn0Var2;
            y2j0Var = y2j0.a.a((y2j0.a) y2j0Var, false, aVar.b, aVar.c, aVar.h, aVar.d, aVar.e, 65);
        }
        if (t0j0Var instanceof t0j0.a) {
            awn0.a aVar2 = (awn0.a) awn0Var2;
            t0j0Var = t0j0.a.a((t0j0.a) t0j0Var, false, aVar2.f, aVar2.i, 1);
        }
        return new mwn0(y2j0Var, t0j0Var, ((awn0.a) awn0Var2).g, false);
    }

    @Override // xsna.dm50
    public final nwn0 d() {
        return new nwn0(e(new quz(24)));
    }

    @Override // xsna.dm50
    public final void h(mwn0 mwn0Var, nwn0 nwn0Var) {
        f(nwn0Var.a, mwn0Var);
    }
}
