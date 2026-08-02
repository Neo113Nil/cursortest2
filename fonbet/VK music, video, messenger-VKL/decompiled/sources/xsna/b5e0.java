package xsna;

import com.vk.music.bottomsheets.domain.model.ConsumeReason;
import kotlin.NoWhenBranchMatchedException;
import xsna.o4e0;
import xsna.v5e0;

/* compiled from: PromoFeature.kt */
/* loaded from: classes3.dex */
public final class b5e0 extends wk50<f6e0, c6e0, o4e0, v5e0> {
    public final g5e0 f;
    public final f4z g;
    public final io.reactivex.rxjava3.disposables.g h;

    public b5e0(x5e0 x5e0Var, g5e0 g5e0Var) {
        super(o4e0.b.b, x5e0Var);
        this.f = g5e0Var;
        this.g = new f4z();
        this.h = new io.reactivex.rxjava3.disposables.g();
    }

    @Override // xsna.wk50
    public final void N(c6e0 c6e0Var, o4e0 o4e0Var) {
        c6e0 c6e0Var2 = c6e0Var;
        o4e0 o4e0Var2 = o4e0Var;
        if (o4e0Var2 instanceof o4e0.b) {
            T(new v5e0.a(c6e0Var2.b));
            return;
        }
        boolean z = o4e0Var2 instanceof o4e0.c;
        g5e0 g5e0Var = this.f;
        if (z) {
            o4e0.c cVar = (o4e0.c) o4e0Var2;
            this.h.b(hg1.g(R(S(g5e0Var.a(cVar.b, cVar.e ? ConsumeReason.BUTTON : ConsumeReason.LINK))), new com.vk.newsfeed.common.recycler.holders.attachments.a(26, new eg1(14, this, o4e0Var2), this)));
            return;
        }
        if (!(o4e0Var2 instanceof o4e0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        o4e0.a aVar = (o4e0.a) o4e0Var2;
        this.h.b(hg1.g(R(S(g5e0Var.a(aVar.b, aVar.c ? ConsumeReason.SWIPE : ConsumeReason.CLOSE))), new com.vk.newsfeed.common.recycler.holders.attachments.a(26, new os30(this, 17), this)));
    }
}
