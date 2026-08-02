package xsna;

import com.vk.api.generated.donut.dto.DonutSetSettingsPayoutTypeDto;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.b8b;
import xsna.e8b;
import xsna.n7b;
import xsna.x7b;

/* compiled from: ChannelPayoutFeature.kt */
/* loaded from: classes16.dex */
public final class s7b extends wk50<g8b, e8b, n7b, b8b> {
    public final UserId f;
    public final dy2 g;
    public final b25 h;
    public final f4z i;
    public final f4z j;

    public s7b(UserId userId, dy2 dy2Var, b25 b25Var) {
        super(n7b.b.b, new d8b());
        this.f = userId;
        this.g = dy2Var;
        this.h = b25Var;
        this.i = new f4z();
        this.j = new f4z();
    }

    @Override // xsna.wk50
    public final void N(e8b e8bVar, n7b n7bVar) {
        e8b e8bVar2 = e8bVar;
        n7b n7bVar2 = n7bVar;
        if (n7bVar2 instanceof n7b.b) {
            T(b8b.c.b);
            return;
        }
        if (n7bVar2 instanceof n7b.a) {
            U();
            return;
        }
        if (n7bVar2 instanceof n7b.h) {
            U();
            return;
        }
        if (n7bVar2 instanceof n7b.g) {
            T(new b8b.b(((n7b.g) n7bVar2).b));
            return;
        }
        boolean z = n7bVar2 instanceof n7b.f;
        f4z f4zVar = this.i;
        if (z) {
            f4zVar.b(x7b.c.a);
            f4zVar.b(x7b.b.a);
            return;
        }
        boolean z2 = n7bVar2 instanceof n7b.d;
        UserId userId = this.f;
        if (z2) {
            f4zVar.b(new x7b.a(userId));
            f4zVar.b(x7b.b.a);
            return;
        }
        if (!(n7bVar2 instanceof n7b.c)) {
            if (!(n7bVar2 instanceof n7b.e)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(x7b.b.a);
            return;
        }
        if (e8bVar2 instanceof e8b.a) {
            e8b.a.InterfaceC2785a interfaceC2785a = ((e8b.a) e8bVar2).b;
            if (interfaceC2785a instanceof e8b.a.InterfaceC2785a.b) {
                UserId userId2 = ((e8b.a.InterfaceC2785a.b) interfaceC2785a).c;
                UserId e = fkq0.e(userId);
                DonutSetSettingsPayoutTypeDto donutSetSettingsPayoutTypeDto = DonutSetSettingsPayoutTypeDto.VK_PAY;
                this.g.getClass();
                tfx tfxVar = new tfx("donut.setSettings", new ir(17), new jr(12));
                tfx.n(tfxVar, "owner_id", e, 0L, 0L, 12);
                if (donutSetSettingsPayoutTypeDto != null) {
                    tfx.o(tfxVar, "payout_type", donutSetSettingsPayoutTypeDto.i(), 0, 0, 12);
                }
                if (userId2 != null) {
                    tfx.n(tfxVar, "vkpay_recipient", userId2, 0L, 0L, 12);
                }
                a7f0.a.f(this, rsg0.W(yfb.x(tfxVar), 7), new on(this, 13), new k00(this, 18), 1);
                return;
            }
        }
        f4zVar.b(x7b.b.a);
    }

    public final void U() {
        a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(rsg0.W(yfb.x(this.g.d(fkq0.e(this.f))), 7), new f40(new e1(this, 17), 5)), new v5(this, 14), new w5(this, 14), 1);
    }
}
