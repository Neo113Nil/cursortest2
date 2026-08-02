package xsna;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lnq implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lnq(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Context context = (Context) this.d;
                ikv0 ikv0Var = (ikv0) obj;
                if (!this.c) {
                    tmq.a().m(context);
                    ikv0Var.a();
                }
                break;
            default:
                qtl0 qtl0Var = (qtl0) this.d;
                if (this.c) {
                    qtl0Var.b.d().subscribe(new bqs(new skj0(qtl0Var, 5), 29));
                }
                break;
        }
        return s3q0.a;
    }
}
