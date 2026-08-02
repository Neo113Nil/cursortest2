package xsna;

import com.vk.api.generated.market.dto.MarketSearchRevDto;
import com.vk.api.generated.market.dto.MarketSearchSortDto;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MarketPickerRepository.kt */
/* loaded from: classes18.dex */
public final class ma10 {
    public final yd10 a;
    public final zqu b;

    public ma10() {
        this(0);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.f0 a(int i, UserId userId, boolean z) {
        UserId a = userId != null ? fkq0.a(userId) : null;
        UserId userId2 = !epx.f(a, UserId.d) ? a : null;
        Boolean valueOf = Boolean.valueOf(z);
        Integer valueOf2 = Integer.valueOf(i);
        this.a.getClass();
        tfx tfxVar = new tfx("market.getFavesForAttach", new ao(20), new bo(22));
        if (userId2 != null) {
            tfx.n(tfxVar, "current_group_id", userId2, 1L, 0L, 8);
        }
        tfxVar.j("public_only", valueOf.booleanValue());
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf2.intValue(), 0, 0, 8);
        tfxVar.f(20, 1, 100, "count");
        return rsg0.w0(yfb.x(tfxVar));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.f0 b(int i, UserId userId, String str) {
        return rsg0.w0(yfb.x(xd10.p(this.a, fkq0.e(userId), str, MarketSearchSortDto.DATE, MarketSearchRevDto.REVERSE, Integer.valueOf(i), 7706)));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.f0 c(UserId userId, boolean z) {
        UserId a = userId != null ? fkq0.a(userId) : null;
        UserId userId2 = !epx.f(a, UserId.d) ? a : null;
        Boolean valueOf = Boolean.valueOf(z);
        this.a.getClass();
        tfx tfxVar = new tfx("market.getCommunitiesForAttach", new jr(19), new kr(24));
        if (userId2 != null) {
            tfx.n(tfxVar, "current_group_id", userId2, 1L, 0L, 8);
        }
        tfxVar.j("public_only", valueOf.booleanValue());
        tfxVar.j("is_business", true);
        return rsg0.w0(yfb.x(tfxVar));
    }

    public ma10(int i) {
        yd10 yd10Var = new yd10();
        zqu zquVar = new zqu();
        this.a = yd10Var;
        this.b = zquVar;
    }
}
