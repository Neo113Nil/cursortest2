package xsna;

import com.vk.log.L;
import xsna.nrw0;
import xsna.svq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fsq0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fsq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                isq0 isq0Var = (isq0) this.c;
                Throwable th = (Throwable) obj;
                if (((dwq0) isq0Var.b.getCurrentState()).q.b.a.isEmpty()) {
                    isq0Var.c(svq0.b.n.a);
                }
                isq0Var.t();
                L.e(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
            case 1:
                ((qyi0) this.c).invoke(obj);
                break;
            case 2:
                ((n9) this.c).invoke(obj);
                break;
            case 3:
                ((eci0) this.c).invoke(obj);
                break;
            case 4:
                ((qyi0) this.c).invoke(obj);
                break;
            case 5:
                ((mdk0) this.c).invoke(obj);
                break;
            case 6:
                ((nrw0.e) this.c).invoke(obj);
                break;
            default:
                ((vkb) this.c).invoke(obj);
                break;
        }
    }
}
