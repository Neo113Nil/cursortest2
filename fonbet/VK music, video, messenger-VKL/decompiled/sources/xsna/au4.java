package xsna;

import com.vk.dto.music.reactions.Reaction;
import kotlin.NoWhenBranchMatchedException;
import xsna.eu4;
import xsna.vt4;

/* compiled from: AudioReactionsFeature.kt */
/* loaded from: classes3.dex */
public final class au4 extends wk50<lu4, ku4, vt4, fu4> {
    public final izs<Reaction, s3q0> f;
    public final bu4 g;
    public String h;
    public final f4z i;

    public au4(gu4 gu4Var, vt4.c cVar, twi0 twi0Var, bu4 bu4Var) {
        super(cVar, gu4Var);
        this.f = twi0Var;
        this.g = bu4Var;
        this.i = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ku4 ku4Var, vt4 vt4Var) {
        vt4 vt4Var2 = vt4Var;
        if (vt4Var2 instanceof vt4.c) {
            this.h = ((vt4.c) vt4Var2).b;
            U();
            return;
        }
        boolean z = vt4Var2 instanceof vt4.a;
        f4z f4zVar = this.i;
        if (z) {
            Reaction reaction = ((vt4.a) vt4Var2).b;
            izs<Reaction, s3q0> izsVar = this.f;
            if (izsVar != null) {
                izsVar.invoke(reaction);
            }
            f4zVar.b(eu4.a.a);
            return;
        }
        if (vt4Var2 instanceof vt4.b) {
            f4zVar.b(eu4.a.a);
        } else {
            if (!vt4Var2.equals(vt4.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            U();
        }
    }

    public final void U() {
        this.e.b(new io.reactivex.rxjava3.internal.operators.single.n(ktr.d(this.g.K().q(io.reactivex.rxjava3.schedulers.a.b())), new wf1(new x7(this, 6), 5)).subscribe(new ff3(new com.vk.im.ui.fragments.b(this, 4), 1), new ov2(new zt4(this, 0), 1)));
    }
}
