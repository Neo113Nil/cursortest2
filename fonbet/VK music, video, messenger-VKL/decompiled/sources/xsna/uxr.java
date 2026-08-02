package xsna;

import com.vk.folders.impl.configure.g;
import xsna.ds60;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uxr implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uxr(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.folders.impl.configure.d) this.c).q(new sop((g.b) this.d, 4));
                break;
            default:
                rq60 rq60Var = (rq60) this.c;
                ds60.c.l lVar = (ds60.c.l) this.d;
                rq60Var.c(new yo60.e.j(lVar.b, lVar.c));
                rq60Var.c(new yo60.g.a((Throwable) obj));
                break;
        }
    }
}
