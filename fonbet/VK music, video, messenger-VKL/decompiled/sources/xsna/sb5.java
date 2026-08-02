package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.video.ui.upload.impl.publish.presentation.author.feature.entity.AuthorState;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorArguments;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.b85;
import xsna.h75;

/* compiled from: AuthorInlineActor.kt */
/* loaded from: classes7.dex */
public final class sb5 extends bl50<AuthorState, h75, on50, bwj, dwj, b85> {
    public final AuthorArguments c;
    public final kee0 d;
    public final h7v e;
    public final sj50<AuthorState, on50, ll50<on50, bwj, dwj>, jl50<AuthorState>, b85> f;
    public final boolean g;

    public sb5(AuthorArguments authorArguments, fks0 fks0Var, kee0 kee0Var, h7v h7vVar, sj50<AuthorState, on50, ll50<on50, bwj, dwj>, jl50<AuthorState>, b85> sj50Var) {
        super(sj50Var);
        this.c = authorArguments;
        this.d = kee0Var;
        this.e = h7vVar;
        this.f = sj50Var;
        this.g = fks0Var.l1();
        g3q.a(this, new rb5(this, null));
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<AuthorState, on50, ll50<on50, bwj, dwj>, jl50<AuthorState>, b85> W() {
        return this.f;
    }

    public final void m() {
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        AuthorItem authorItem = (AuthorItem) j5g.b0(((AuthorState) sj50Var.getCurrentState()).c, ((AuthorState) sj50Var.getCurrentState()).b);
        UserId userId = authorItem != null ? authorItem.d : null;
        if (userId == null) {
            userId = UserId.d;
        }
        c(new b85.a(userId));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        h75 h75Var = (h75) lj50Var;
        if (h75Var instanceof h75.a) {
            rdi.y(this, new jy((h75.a) h75Var, 7));
            if (this.c.d) {
                c(b85.c.a);
                return;
            } else {
                m();
                return;
            }
        }
        if (h75Var instanceof h75.b) {
            if (this.g) {
                c(b85.d.a);
                return;
            } else {
                c(b85.b.a);
                return;
            }
        }
        if (h75Var instanceof f75) {
            m();
            return;
        }
        if (h75Var instanceof g75) {
            rdi.y(this, new g60(this, 9));
            return;
        }
        if (h75Var instanceof j75) {
            g3q.a(this, new qb5(this, null));
        } else {
            if (!(h75Var instanceof i75)) {
                throw new NoWhenBranchMatchedException();
            }
            this.e.b(HintId.INFO_PROFILE_UPLOAD_ONBOARDING.getId());
            rdi.y(this, new db(11));
        }
    }
}
