package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.bmz;
import xsna.nlz;
import xsna.slz;
import xsna.tlz;

/* compiled from: LiveSpectatorsFeature.kt */
/* loaded from: classes3.dex */
public final class qlz extends wk50<dmz, bmz, nlz, tlz> {
    public final int f;
    public final UserId g;
    public final crx0 h;
    public final f4z i;

    public qlz(int i, UserId userId, crx0 crx0Var) {
        super(nlz.a.b, new wlz(bmz.c.b));
        this.f = i;
        this.g = userId;
        this.h = crx0Var;
        this.i = new f4z();
    }

    @Override // xsna.wk50
    public final void N(bmz bmzVar, nlz nlzVar) {
        nlz nlzVar2 = nlzVar;
        if (nlzVar2 instanceof nlz.a) {
            T(tlz.b.b);
            this.h.getClass();
            tga0 tga0Var = new tga0(this.f, this.g);
            ahn.D(tga0Var);
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(tga0Var).l(new xlz(ylz.b, 0)), new fq1(new bz(29), 21)), new v4w(this, 4), new eiz(this, 1), 1);
            return;
        }
        if (!(nlzVar2 instanceof nlz.b)) {
            throw new NoWhenBranchMatchedException();
        }
        slz.b bVar = new slz.b(((nlz.b) nlzVar2).b);
        f4z f4zVar = this.i;
        f4zVar.b(bVar);
        f4zVar.b(slz.a.a);
    }
}
