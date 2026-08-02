package xsna;

import android.annotation.SuppressLint;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Set;
import xsna.b7d0;
import xsna.l7x0;

/* compiled from: DeleteVotePollAction.kt */
/* loaded from: classes4.dex */
public final class nvl {
    public final l7x0.e a;
    public final lad0 b;
    public final umb0 c;
    public final b7d0 d;
    public final gzs<b7d0.a> e;
    public final izs<Integer, Boolean> f;

    /* JADX WARN: Multi-variable type inference failed */
    public nvl(l7x0.e eVar, lad0 lad0Var, umb0 umb0Var, b7d0 b7d0Var, gzs<b7d0.a> gzsVar, izs<? super Integer, Boolean> izsVar) {
        this.a = eVar;
        this.b = lad0Var;
        this.c = umb0Var;
        this.d = b7d0Var;
        this.e = gzsVar;
        this.f = izsVar;
    }

    @SuppressLint({"CheckResult"})
    public final void a() {
        lad0 lad0Var = this.b;
        mkl mklVar = lad0Var.y;
        Set R0 = j5g.R0(((Poll) mklVar.b).e);
        lad0Var.I.a = this.a;
        Poll poll = (Poll) mklVar.b;
        UserId userId = poll.c;
        int i = poll.b;
        boolean z = poll.j;
        String str = (String) mklVar.c;
        String str2 = (String) mklVar.d;
        wmb0 wmb0Var = this.c.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new aub0(i, userId, str, str2, z), null, null, 3);
        f60 f60Var = new f60(new eqd(this, 13), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.d.j7(new io.reactivex.rxjava3.internal.operators.observable.i0(y0.E(f60Var, lVar, kVar, kVar), new aa6(new p4f(this, 16), 14))).subscribe(new eu0(new n43(mklVar, this, R0, 1), 20), new fu0(new hl1(14, this, mklVar), 18));
    }
}
