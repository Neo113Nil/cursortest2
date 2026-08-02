package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.jv60;

/* compiled from: NewsfeedInitialPostReducer.kt */
/* loaded from: classes4.dex */
public final class wl60 implements bm50<qz60, jv60.b> {
    @Override // xsna.bm50
    public final qz60 a(qz60 qz60Var, jv60.b bVar) {
        qz60 qz60Var2 = qz60Var;
        if (bVar instanceof jv60.b.a) {
            return qz60.a(qz60Var2, null, 0, null, null, null, null, null, null, 127);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(jv60.b bVar) {
        return true;
    }
}
