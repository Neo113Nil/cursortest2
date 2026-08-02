package xsna;

import com.vk.core.exceptions.DisposableException;
import com.vk.voip.OKVoipEngine;
import xsna.qv40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class g66 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g66(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                p66 p66Var = (p66) this.c;
                p66Var.s0(p66Var.u - 1);
                p66Var.t0(p66Var.v - 1);
                break;
            case 1:
                ((ktb) this.c).i.m4();
                break;
            case 2:
                io.reactivex.rxjava3.subjects.d<kgg> dVar = ((xeg) this.c).i;
                dVar.onNext(dVar.P0() != null ? new kgg(Boolean.FALSE) : null);
                break;
            case 3:
                ((pcl) this.c).j = false;
                break;
            case 4:
                ((w920) this.c).p.compareAndSet(true, false);
                break;
            case 5:
                ov40 ov40Var = (ov40) this.c;
                ov40Var.U();
                ov40Var.T(qv40.b.b);
                break;
            case 6:
                ((yp80) this.c).onError(new DisposableException());
                break;
            case 7:
                ((gzs) this.c).invoke();
                break;
            case 8:
                ((q21) this.c).invoke();
                break;
            default:
                t3x0 t3x0Var = (t3x0) this.c;
                com.vk.voip.ui.c.r.getClass();
                OKVoipEngine.k.k(t3x0Var);
                break;
        }
    }
}
