package defpackage;

import com.yandex.go.payments.plus.navigation.a;
import com.yandex.go.plus.api.purchase.AddCardResolution;
import java.util.Calendar;

/* loaded from: classes13.dex */
public final class djd0 implements fj8 {
    public final /* synthetic */ a a;
    public final /* synthetic */ bjd0 b;

    public djd0(a aVar, bjd0 bjd0Var) {
        this.a = aVar;
        this.b = bjd0Var;
    }

    @Override // defpackage.fj8
    public final void P0(Calendar calendar) {
        a aVar = this.a;
        aVar.A((m950) aVar.O.get(), new asz0(calendar), sy60.Q2);
    }

    @Override // defpackage.fj8
    public final void W0(wqw wqwVar) {
        if (((z80) wqwVar).b) {
            a aVar = this.a;
            aVar.M.a();
            AddCardResolution addCardResolution = ((z80) wqwVar).b ? AddCardResolution.SUCCESS : AddCardResolution.FAILED;
            k29 k29Var = aVar.L;
            bjd0 bjd0Var = this.b;
            k29Var.a(addCardResolution, bjd0Var.a);
            aVar.r(new cjd0(bjd0Var, 0));
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.L.a(AddCardResolution.CANCEL, this.b.a);
    }
}
