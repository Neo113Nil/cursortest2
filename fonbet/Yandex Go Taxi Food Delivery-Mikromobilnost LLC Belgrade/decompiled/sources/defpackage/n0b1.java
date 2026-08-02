package defpackage;

import com.google.android.gms.measurement.internal.g;

/* loaded from: classes.dex */
public final class n0b1 extends u791 {
    public final /* synthetic */ int e;
    public final /* synthetic */ j5b1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0b1(j5b1 j5b1Var, g gVar, int i) {
        super(gVar);
        this.e = i;
        this.f = j5b1Var;
    }

    @Override // defpackage.u791
    public final void a() {
        int i = this.e;
        j5b1 j5b1Var = this.f;
        switch (i) {
            case 0:
                j5b1Var.Gg();
                if (j5b1Var.Xg()) {
                    y1a1 y1a1Var = ((g) j5b1Var.b).y;
                    g.g(y1a1Var);
                    y1a1Var.H.a("Inactivity, disconnecting from the service");
                    j5b1Var.Og();
                    break;
                }
                break;
            default:
                y1a1 y1a1Var2 = ((g) j5b1Var.b).y;
                g.g(y1a1Var2);
                y1a1Var2.C.a("Tasks have been queued for a long time");
                break;
        }
    }
}
