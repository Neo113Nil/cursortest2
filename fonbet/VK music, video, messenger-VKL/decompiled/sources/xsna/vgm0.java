package xsna;

import com.vk.dto.common.id.UserId;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vgm0 implements izs {
    public final /* synthetic */ zgm0 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ vgm0(zgm0 zgm0Var, UserId userId, int i, int i2) {
        this.b = zgm0Var;
        this.c = userId;
        this.d = i;
        this.e = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        final h0b h0bVar = this.b.b.g;
        yfm0 yfm0Var = (yfm0) h0bVar.b;
        final int i = this.d;
        final UserId userId = this.c;
        yfm0Var.c(i, userId, this.e).c(new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.xfm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                h0b h0bVar2 = h0b.this;
                h0bVar2.getClass();
                bpn0 bpn0Var = i0q0.a;
                egm0 egm0Var = (egm0) h0bVar2.c;
                hgm0 e = egm0Var.e(i, userId);
                if (e != null) {
                    egm0Var.d(new hgm0(e.a, e.b, e.c - 1));
                }
                return s3q0.a;
            }
        })).subscribe();
        return s3q0.a;
    }
}
