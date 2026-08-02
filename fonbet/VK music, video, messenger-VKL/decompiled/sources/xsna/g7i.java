package xsna;

import xsna.h7i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g7i implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ g7i(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(epx.f(((h7i.a) obj).b(), this.c));
            default:
                rh90 rh90Var = (rh90) obj;
                String str = rh90Var.b;
                rh90Var.getClass();
                return new rh90(this.c, str);
        }
    }
}
