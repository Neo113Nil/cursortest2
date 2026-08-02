package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.rd4;

/* compiled from: AudioBookBottomSheetReducer.kt */
/* loaded from: classes3.dex */
public final class td4 extends dm50<xd4, rd4, wd4> {
    @Override // xsna.dm50
    public final wd4 c(wd4 wd4Var, rd4 rd4Var) {
        wd4 wd4Var2 = wd4Var;
        if (rd4Var instanceof rd4.a) {
            return new wd4(wd4Var2.b, wd4Var2.c);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final xd4 d() {
        return new xd4(e(new sd4(0)));
    }

    @Override // xsna.dm50
    public final void h(wd4 wd4Var, xd4 xd4Var) {
        f(xd4Var.a, wd4Var);
    }
}
