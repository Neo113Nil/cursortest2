package xsna;

import xsna.qs80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class hgd0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ yp80 c;

    public /* synthetic */ hgd0(yp80 yp80Var, int i) {
        this.b = i;
        this.c = yp80Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qs80 qs80Var = (qs80) obj;
                boolean z = qs80Var instanceof qs80.c;
                yp80 yp80Var = this.c;
                if (z) {
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                    }
                } else if (qs80Var instanceof qs80.a) {
                    if (yp80Var != null) {
                        yp80Var.onError(((qs80.a) qs80Var).a);
                    }
                } else if (yp80Var != null) {
                    yp80Var.U();
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                yp80 yp80Var2 = this.c;
                if (yp80Var2 != null) {
                    yp80Var2.onError(th);
                }
                break;
        }
        return s3q0.a;
    }
}
