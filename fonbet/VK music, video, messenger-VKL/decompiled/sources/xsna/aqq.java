package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.rpq;

/* compiled from: FaveFeedMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class aqq implements au60<rpq> {
    @Override // xsna.au60
    public final rpq a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new rpq.c.b((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new spq((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new wpq((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new tpq((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new vpq((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new upq((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new rpq.a.C3621a((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new xpq((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
