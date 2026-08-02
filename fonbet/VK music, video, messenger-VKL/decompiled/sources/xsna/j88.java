package xsna;

import com.vk.libvideo.adfree.impl.ui.entity.BottomSheetState;
import kotlin.NoWhenBranchMatchedException;
import xsna.d78;
import xsna.f88;

/* compiled from: BottomSheetActor.kt */
/* loaded from: classes18.dex */
public final class j88 extends bl50<BottomSheetState, d78, on50, bwj, dwj, f88> {
    public final sj50<BottomSheetState, on50, ll50<on50, bwj, dwj>, jl50<BottomSheetState>, f88> c;

    public j88(sj50<BottomSheetState, on50, ll50<on50, bwj, dwj>, jl50<BottomSheetState>, f88> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<BottomSheetState, on50, ll50<on50, bwj, dwj>, jl50<BottomSheetState>, f88> W() {
        return this.c;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        d78 d78Var = (d78) lj50Var;
        if (d78Var.equals(d78.b.b)) {
            c(f88.b.a);
            return;
        }
        if (d78Var.equals(d78.a.b)) {
            c(f88.a.a);
            return;
        }
        if (d78Var.equals(d78.c.b)) {
            c(f88.c.a);
        } else {
            if (d78Var.equals(d78.d.b)) {
                return;
            }
            if (!d78Var.equals(d78.e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c(f88.d.a);
        }
    }
}
