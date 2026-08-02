package xsna;

import com.vk.music.bottomsheets.artistlist.domain.LoadingState;
import kotlin.NoWhenBranchMatchedException;
import xsna.ir3;

/* compiled from: ArtistListBottomSheetReducer.kt */
/* loaded from: classes3.dex */
public final class kr3 extends dm50<mr3, ir3, lr3> {
    @Override // xsna.dm50
    public final lr3 c(lr3 lr3Var, ir3 ir3Var) {
        lr3 lr3Var2 = lr3Var;
        ir3 ir3Var2 = ir3Var;
        if (ir3Var2.equals(ir3.b.b)) {
            return lr3Var2;
        }
        if (ir3Var2 instanceof ir3.c) {
            return new lr3(((ir3.c) ir3Var2).b, LoadingState.LOADED);
        }
        if (!ir3Var2.equals(ir3.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return new lr3(lr3Var2.b, LoadingState.ERROR);
    }

    @Override // xsna.dm50
    public final mr3 d() {
        return new mr3(e(new sm0(1)), e(new e60(5)));
    }

    @Override // xsna.dm50
    public final void h(lr3 lr3Var, mr3 mr3Var) {
        f(mr3Var.b, lr3Var);
    }
}
