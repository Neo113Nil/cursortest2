package defpackage;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.route.interactor.b;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.clarification.impl.interactor.a;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.v;

/* loaded from: classes5.dex */
public final class gq0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ gq0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                gp0 gp0Var = (gp0) obj;
                if (gp0Var instanceof fp0) {
                    aVar.b.showBlockedZones();
                    m mVar = aVar.f;
                    ((pep0) ((oep0) mVar.h)).f(new rwo0(7, (op0) ((yvf0) mVar.f).get(), new e3o0(18, mVar)), new mp0(((wb1) mVar.d).a.d, ((fp0) gp0Var).a), hxx.a);
                    ((r) ((svw) mVar.g)).g();
                    return zy11Var;
                }
                if (!(gp0Var instanceof ep0)) {
                    w511.b();
                    return null;
                }
                j4n j4nVar = aVar.d;
                ep0 ep0Var = (ep0) gp0Var;
                ac1 ac1Var = ep0Var.a;
                zzs zzsVar = ac1Var.b;
                PlainAddress plainAddress = ac1Var.a;
                ((ru.yandex.taxi.preorder.source.pickup.a) j4nVar.a).j = "multiexit_select";
                Zone c = ((dqe0) j4nVar.b).c();
                ZoneAddress zoneAddress = jl40.l(plainAddress.getZoneName(), c != null ? c.a : null) ? new ZoneAddress(plainAddress, c) : new ZoneAddress(plainAddress, ((o) j4nVar.c).f(plainAddress.getZoneName()));
                ((com.yandex.go.clarify_address.a) ((kr0) j4nVar.w)).c(true, AddressClarificationReason.Map);
                ((b) j4nVar.x).m(zoneAddress, null);
                v vVar = (v) j4nVar.y;
                Zone zone = zoneAddress.b;
                if (zone != null) {
                    vVar.e.a(zone, null);
                } else {
                    vVar.getClass();
                }
                r rVar = (r) j4nVar.z;
                rVar.d(rVar.j(zzsVar, false));
                if (!ep0Var.b) {
                    return zy11Var;
                }
                ((gh00) aVar.a).D(ru.yandex.taxi.map.utils.a.F(zzsVar), 17.0f, 200.0f, null);
                return zy11Var;
            default:
                ((Boolean) obj).getClass();
                aVar.e.a();
                return zy11Var;
        }
    }
}
