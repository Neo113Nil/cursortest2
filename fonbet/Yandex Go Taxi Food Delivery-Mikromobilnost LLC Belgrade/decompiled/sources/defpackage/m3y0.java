package defpackage;

import com.yandex.go.messenger_native.d;
import com.yandex.go.taxi.order.chat.domain.model.MessengerType;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;

/* loaded from: classes14.dex */
public final class m3y0 extends ad5 {
    public final d A;
    public final r350 B;
    public final nh41 C;
    public final n3y0 D;
    public final p3y0 E;
    public final MessengerType F;
    public final a3y0 G;
    public final ike H;
    public final pg7 x;
    public final zuj0 y;
    public final zhm z;

    public m3y0(pg7 pg7Var, zuj0 zuj0Var, zhm zhmVar, d dVar, r350 r350Var, nh41 nh41Var, tt2 tt2Var, n3y0 n3y0Var, p3y0 p3y0Var, MessengerType messengerType) {
        super(k3y0.class);
        this.x = pg7Var;
        this.y = zuj0Var;
        this.z = zhmVar;
        this.A = dVar;
        this.B = r350Var;
        this.C = nh41Var;
        this.D = n3y0Var;
        this.E = p3y0Var;
        this.F = messengerType;
        this.G = new a3y0(TaxiOrderLogGroup.ORDER_MESSENGER.getTag(), "TaxiOrderMessengerPresenter");
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.H = g8e.f(o400.a);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        bvf0.j(this.H, null);
    }
}
