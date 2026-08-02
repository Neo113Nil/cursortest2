package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionArguments;
import kotlin.NoWhenBranchMatchedException;
import xsna.k1m;
import xsna.w1m;

/* compiled from: DescriptionInlineActor.kt */
/* loaded from: classes7.dex */
public final class y1m extends bl50<DescriptionState, k1m, on50, bwj, dwj, w1m> {
    public final DescriptionArguments c;
    public final sj50<DescriptionState, on50, ll50<on50, bwj, dwj>, jl50<DescriptionState>, w1m> d;

    public y1m(DescriptionArguments descriptionArguments, sj50<DescriptionState, on50, ll50<on50, bwj, dwj>, jl50<DescriptionState>, w1m> sj50Var) {
        super(sj50Var);
        this.c = descriptionArguments;
        this.d = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<DescriptionState, on50, ll50<on50, bwj, dwj>, jl50<DescriptionState>, w1m> W() {
        return this.d;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        k1m k1mVar = (k1m) lj50Var;
        if (k1mVar instanceof k1m.d) {
            rdi.y(this, new nhe((k1m.d) k1mVar, 12));
            return;
        }
        boolean z = k1mVar instanceof k1m.b;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z || (k1mVar instanceof k1m.a)) {
            if (epx.f(((DescriptionState) sj50Var.getCurrentState()).c, this.c.b)) {
                c(w1m.b.a);
                return;
            } else {
                rdi.y(this, new qt(23));
                return;
            }
        }
        if (k1mVar instanceof k1m.c) {
            if (((Boolean) ((DescriptionState) sj50Var.getCurrentState()).f.getValue()).booleanValue() && ((Boolean) ((DescriptionState) sj50Var.getCurrentState()).e.getValue()).booleanValue()) {
                c(new w1m.a(((DescriptionState) sj50Var.getCurrentState()).c));
                return;
            }
            return;
        }
        if (!(k1mVar instanceof k1m.e)) {
            throw new NoWhenBranchMatchedException();
        }
        k1m.e eVar = (k1m.e) k1mVar;
        if ((eVar instanceof k1m.e.b) || (eVar instanceof k1m.e.c)) {
            c(w1m.b.a);
        } else {
            if (!(eVar instanceof k1m.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            rdi.y(this, new pt(24));
        }
    }
}
