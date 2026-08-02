package xsna;

import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.cll0;
import xsna.jm50;
import xsna.jw00;
import xsna.kkl0;

/* compiled from: StorefrontTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class gpl0 extends evg0<ukl0, on50, cll0, cll0, kkl0, xjl0> {
    public final fkl0 f;
    public final mzp0 g;
    public final wjl0 h;

    public gpl0(fkl0 fkl0Var, mzp0 mzp0Var, wjl0 wjl0Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = fkl0Var;
        this.g = mzp0Var;
        this.h = wjl0Var;
    }

    @Override // xsna.dl50, xsna.uic
    public final void clear() {
        ((kw00) this.h.c.getValue()).b(qjg.a(this));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        cll0 cll0Var = (cll0) hn50Var;
        if (cll0Var instanceof cll0.a) {
            return s();
        }
        if (cll0Var instanceof cll0.c) {
            e(kkl0.f.a);
            return s();
        }
        if (!(cll0Var instanceof cll0.b)) {
            return null;
        }
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        List<GoodAlbum> list = ((ukl0) nn50Var.getCurrentState()).c;
        int i = ((ukl0) nn50Var.getCurrentState()).d;
        fkl0 fkl0Var = this.f;
        return g(new io.reactivex.rxjava3.internal.operators.single.n(fkl0Var.b.a(i, fkl0Var.a, 20).l(new osk0(new fu10(i, list), 1)), new m1r(new svk0(this, 5), 29)), new uu60(this, 20), new n1r(this, 23));
    }

    @Override // xsna.dl50, xsna.mn50
    public final void init() {
        ((kw00) this.h.c.getValue()).a(qjg.a(this), new jw00.d[]{jw00.c.c, jw00.a.c}, new j6l0(this, 1));
    }

    public final zvg0 s() {
        fkl0 fkl0Var = this.f;
        mkl0 mkl0Var = fkl0Var.b;
        UserId userId = fkl0Var.a;
        return g(new io.reactivex.rxjava3.internal.operators.single.n(io.reactivex.rxjava3.core.x.B(mkl0Var.a(0, userId, 19), rsg0.w0(yfb.x(mkl0Var.a.i(userId, mkl0.c))).l(new nlf0(new fa00(mkl0Var, 25), 3)), new uf20(new f07((byte) 0, 12), 12)), new m330(new z8l0(this, 2), 26)), new afs(this, 25), new gl30(this, 26));
    }
}
