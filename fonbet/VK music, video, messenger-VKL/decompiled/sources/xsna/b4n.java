package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.l5n;

/* compiled from: DiscoverMediaMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class b4n implements au60<l5n> {
    @Override // xsna.au60
    public final l5n a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new l5n.b.c((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new m5n((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new q5n((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.g) {
            return new t5n((ds60.g) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new n5n((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new p5n((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new o5n((ds60.d) ds60Var);
        }
        if (!(ds60Var instanceof ds60.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ds60.a aVar = (ds60.a) ds60Var;
        if (aVar instanceof ds60.a.C2747a) {
            return l5n.a.C3232a.b;
        }
        if (aVar instanceof ds60.a.b) {
            return l5n.a.b.b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
