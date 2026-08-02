package xsna;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments;
import kotlin.NoWhenBranchMatchedException;
import xsna.el50;
import xsna.f0k;
import xsna.k0k;
import xsna.ln50;

/* compiled from: CoverChooseInlineActor.kt */
/* loaded from: classes7.dex */
public final class z0k extends bl50<CoverChooseState, f0k, on50, bwj, dwj, m0k> {
    public final CoverChooseArguments c;
    public final a1k d;
    public final sj50<CoverChooseState, on50, ll50<on50, bwj, dwj>, jl50<CoverChooseState>, m0k> e;

    public z0k(CoverChooseArguments coverChooseArguments, a1k a1kVar, sj50<CoverChooseState, on50, ll50<on50, bwj, dwj>, jl50<CoverChooseState>, m0k> sj50Var) {
        super(sj50Var);
        this.c = coverChooseArguments;
        this.d = a1kVar;
        this.e = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<CoverChooseState, on50, ll50<on50, bwj, dwj>, jl50<CoverChooseState>, m0k> W() {
        return this.e;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        Rect rect;
        Matrix matrix;
        f0k f0kVar = (f0k) lj50Var;
        boolean z = f0kVar instanceof f0k.c;
        ln50.a.C3276a c3276a = ln50.a.b;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            if (((CoverChooseState) sj50Var.getCurrentState()).c != null) {
                return;
            }
            el50.a.a(this, e1k.a, c3276a, new eqd(this, 12));
            return;
        }
        if (f0kVar instanceof f0k.d) {
            f0k.d dVar = (f0k.d) f0kVar;
            if (dVar instanceof f0k.d.a) {
                if (((CoverChooseState) sj50Var.getCurrentState()).f) {
                    return;
                }
                c(l0k.a);
                return;
            } else {
                if (!(dVar instanceof f0k.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                CoverChooseState coverChooseState = (CoverChooseState) sj50Var.getCurrentState();
                Bitmap bitmap = coverChooseState.c;
                if (bitmap == null || (rect = coverChooseState.d) == null || (matrix = coverChooseState.e) == null) {
                    return;
                }
                d3q.a(this, f1k.a, c3276a, new j6e(this, 11), new y0k(bitmap, matrix, rect, this, null));
                return;
            }
        }
        if (!(f0kVar instanceof f0k.b)) {
            if (!(f0kVar instanceof f0k.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c(l0k.a);
            return;
        }
        f0k.b bVar = (f0k.b) f0kVar;
        if (bVar instanceof f0k.b.C2843b) {
            rdi.y(this, new mmf(bVar, 14));
            return;
        }
        if (bVar instanceof f0k.b.c) {
            rdi.y(this, new o1e(bVar, 10));
        } else {
            if (!(bVar instanceof f0k.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            com.vk.metrics.eventtracking.b.a.a(((f0k.b.a) bVar).b);
            c(k0k.a.a);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
