package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.NoWhenBranchMatchedException;
import xsna.vx60;

/* compiled from: NewsfeedSearchPagingReducer.kt */
/* loaded from: classes4.dex */
public final class oy60 implements bm50<xx60, vx60> {
    public final pr60 a;

    public oy60(s1v s1vVar, rr60 rr60Var) {
        this.a = new pr60(s1vVar, rr60Var);
    }

    @Override // xsna.bm50
    public final xx60 a(xx60 xx60Var, vx60 vx60Var) {
        xx60 xx60Var2 = xx60Var;
        vx60 vx60Var2 = vx60Var;
        if (vx60Var2 instanceof ux60) {
            return xx60.a(xx60Var2, null, null, null, null, this.a.a(xx60Var2.l, ((ux60) vx60Var2).a), IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        }
        if (vx60Var2 instanceof vx60.b) {
            return xx60.a(xx60Var2, ((vx60.b) vx60Var2).a, null, null, null, null, 2039);
        }
        if (vx60Var2 instanceof vx60.c) {
            vx60.c cVar = (vx60.c) vx60Var2;
            return epx.f(xx60Var2.e, cVar.a) ? xx60.a(xx60Var2, null, null, null, cVar.b, null, 1535) : xx60Var2;
        }
        if (!(vx60Var2 instanceof vx60.a)) {
            throw new NoWhenBranchMatchedException();
        }
        vx60.a aVar = (vx60.a) vx60Var2;
        return xx60.a(xx60Var2, null, aVar.a, aVar.b, null, null, 1663);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(vx60 vx60Var) {
        return true;
    }
}
