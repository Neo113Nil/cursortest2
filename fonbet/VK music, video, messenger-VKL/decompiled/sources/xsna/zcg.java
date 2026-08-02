package xsna;

import com.vk.dto.reactions.ReactionMeta;
import com.vk.newsfeed.api.data.NewsComment;
import xsna.rdg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zcg implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iag c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ReactionMeta e;
    public final /* synthetic */ mdg f;
    public final /* synthetic */ aa g;

    public /* synthetic */ zcg(boolean z, iag iagVar, d2f0 d2f0Var, boolean z2, ReactionMeta reactionMeta, mdg mdgVar, aa aaVar) {
        this.b = z;
        this.c = iagVar;
        this.d = z2;
        this.e = reactionMeta;
        this.f = mdgVar;
        this.g = aaVar;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        t9x0 t9x0Var = (t9x0) obj;
        boolean z = this.b;
        iag iagVar = this.c;
        boolean z2 = this.d;
        if (z) {
            iagVar.i4(!iagVar.Q6());
            iagVar.f(t9x0Var.a);
        } else {
            d2f0.e(iagVar != null ? iagVar : null, this.e, t9x0Var);
            iagVar.f0(z2);
            iagVar.f(t9x0Var.a);
        }
        boolean z3 = iagVar instanceof NewsComment;
        if (z3) {
            NewsComment newsComment = (NewsComment) iagVar;
            if (newsComment.H) {
                newsComment.B = z2;
            }
        }
        aa aaVar = this.g;
        ib6 ib6Var = aaVar instanceof ib6 ? (ib6) aaVar : null;
        if (ib6Var != null) {
            ib6Var.E6(iagVar);
        }
        mdg mdgVar = this.f;
        mdgVar.h1(iagVar);
        if (z3 && z2 && aaVar != null && ((NewsComment) iagVar).H) {
            mdgVar.e.z(new rdg.d(aaVar));
        }
        return s3q0.a;
    }
}
