package xsna;

import java.util.concurrent.TimeUnit;
import xsna.h5h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g5h implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g5h(long j, wh50 wh50Var) {
        this.c = j;
        this.d = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                h5h h5hVar = (h5h) this.d;
                aoj aojVar = (aoj) obj;
                long j = this.c;
                aojVar.a(new h5h.b(h5hVar, j));
                aojVar.a(new h5h.c(h5hVar, j));
                aojVar.b();
                aojVar.a(new h5h.d(h5hVar));
                return s3q0.a;
            default:
                io.reactivex.rxjava3.schedulers.b bVar = (io.reactivex.rxjava3.schedulers.b) obj;
                if (((Number) ((wh50) this.d).getValue()).intValue() == 1) {
                    return io.reactivex.rxjava3.core.q.T(bVar.a);
                }
                return io.reactivex.rxjava3.core.q.T(bVar.a).A(Math.max(0L, this.c - bVar.a()), TimeUnit.MILLISECONDS);
        }
    }

    public /* synthetic */ g5h(h5h h5hVar, long j) {
        this.d = h5hVar;
        this.c = j;
    }
}
