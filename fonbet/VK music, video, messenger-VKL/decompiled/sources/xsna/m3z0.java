package xsna;

import xsna.h8z0;
import xsna.hjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class m3z0 implements yads.ng1, h8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m3z0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.h8z0.b
    public void a() {
        hjz0.a aVar;
        switch (this.b) {
            case 1:
                aVar = (hjz0.a) this.c;
                String str = ((s4z0) this.d).F;
                break;
            default:
                igz0 igz0Var = (igz0) this.c;
                tez0 tez0Var = (tez0) this.d;
                aVar = igz0Var.a;
                String str2 = tez0Var.F;
                break;
        }
        yil0.d(aVar);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        yads.kb0.a((yads.ye) this.c, (yads.sk3) this.d, (yads.af) obj);
    }
}
