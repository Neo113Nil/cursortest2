package xsna;

import xsna.h8z0;
import xsna.hjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class aox0 implements io.reactivex.rxjava3.functions.l, h8z0.b, yads.xy0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aox0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        hjz0.a aVar;
        switch (this.b) {
            case 1:
                xyy0 xyy0Var = (xyy0) this.c;
                aVar = xyy0Var.a;
                String str = xyy0Var.k.F;
                break;
            default:
                igz0 igz0Var = (igz0) this.c;
                aVar = igz0Var.a;
                String str2 = igz0Var.o.F;
                break;
        }
        yil0.d(aVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (uu1) ((u5u0) this.c).invoke(obj);
            default:
                return ((yads.tx0) this.c).a((yads.i83) obj);
        }
    }
}
