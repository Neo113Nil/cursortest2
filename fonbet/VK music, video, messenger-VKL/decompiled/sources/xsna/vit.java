package xsna;

import com.ironsource.O6;
import com.vk.api.generated.ecosystem.dto.EcosystemAddLibverifyEventEventTypeDto;
import com.vk.api.generated.stats.dto.StatsTrackVisitorTypeDto;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class vit implements pfn0 {
    @Override // xsna.pfn0
    public final io.reactivex.rxjava3.internal.operators.single.y a(String str, String str2) {
        EcosystemAddLibverifyEventEventTypeDto ecosystemAddLibverifyEventEventTypeDto = EcosystemAddLibverifyEventEventTypeDto.AUTH_PHONE_REQUESTED;
        ufx ufxVar = new ufx("ecosystem.addLibverifyEvent", new jq(16), new kq(15));
        ufx.n(ufxVar, "event_type", ecosystemAddLibverifyEventEventTypeDto.i(), 0, 12);
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "validate_session", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e).l(new rq(new gzn(6)));
    }

    @Override // xsna.pfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(long j, String str, Integer num, StatsTrackVisitorTypeDto statsTrackVisitorTypeDto) {
        ufx ufxVar = new ufx("stats.trackVisitor", new azk0(0), new bzk0(0));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        if (str != null) {
            ufx.n(ufxVar, "session_uuid", str, 0, 12);
        }
        if (num != null) {
            ufx.k(ufxVar, "session_duration", num.intValue(), 0, 8);
        }
        if (statsTrackVisitorTypeDto != null) {
            ufx.n(ufxVar, "type", statsTrackVisitorTypeDto.i(), 0, 12);
        }
        bx2 e = e370.e(ufxVar);
        e.s = true;
        return rdx0.u(e).U(new ps2(new vsq(4), 22));
    }
}
