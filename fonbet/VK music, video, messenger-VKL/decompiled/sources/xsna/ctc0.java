package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.zsc0;

/* compiled from: PostponedPostsMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class ctc0 implements au60<zsc0> {
    @Override // xsna.au60
    public final zsc0 a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new zsc0.a.b((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new usc0((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new ysc0((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new vsc0((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new xsc0((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new wsc0((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new tsc0((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new zsc0.b.a((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
