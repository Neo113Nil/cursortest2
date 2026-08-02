package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.smt;

/* compiled from: GeoPostsMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class umt implements au60<smt> {
    @Override // xsna.au60
    public final smt a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new smt.a.b((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new mmt((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new rmt((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new nmt((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new pmt((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new omt((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new lmt((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new qmt((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
