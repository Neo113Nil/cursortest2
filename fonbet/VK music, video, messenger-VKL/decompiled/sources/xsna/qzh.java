package xsna;

import com.ironsource.Z3;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: CommunityReviewsRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class qzh implements pzh {
    public final yd10 a = new yd10();
    public final k0x b = new k0x(4);

    @Override // xsna.pzh
    public final io.reactivex.rxjava3.core.x<BaseOkResponseDto> a(int i) {
        return rsg0.w0(yfb.x(this.a.B(i)));
    }

    @Override // xsna.pzh
    public final io.reactivex.rxjava3.core.x b(UserId userId, Integer num, String str) {
        UserId a = fkq0.a(userId);
        tfx tfxVar = new tfx("market.getCommunityReviews", new sr(16), new tr(14));
        tfx.n(tfxVar, "community_id", a, 0L, 0L, 12);
        tfxVar.f(20, 0, 100, SignalingProtocol.KEY_LIMIT);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "sort", str, 0, 24, 4);
        }
        return io.reactivex.rxjava3.core.x.B(rsg0.w0(yfb.x(tfxVar)), io.reactivex.rxjava3.core.x.t(1L, TimeUnit.SECONDS), new ql2(new kxa((byte) 0, 1), 13));
    }

    @Override // xsna.pzh
    public final io.reactivex.rxjava3.core.x<LikesDeleteResponseDto> c(int i, UserId userId) {
        return rsg0.w0(yfb.x(k0x.e(this.b, "community_review", i, userId, null, null, null, 248)));
    }

    @Override // xsna.pzh
    public final io.reactivex.rxjava3.core.x<LikesAddResponseDto> d(int i, UserId userId) {
        return rsg0.w0(yfb.x(k0x.d(this.b, "community_review", i, userId, null, null, null, null, null, Z3.l)));
    }

    @Override // xsna.pzh
    public final io.reactivex.rxjava3.core.x e(int i, ArrayList arrayList) {
        return rsg0.w0(yfb.x(this.a.b(i, arrayList, 20)));
    }

    @Override // xsna.pzh
    public final io.reactivex.rxjava3.core.x f(UserId userId) {
        tfx tfxVar = new tfx("services.ycVKReviewsPublishSet", new gsi0(0), new hsi0(0));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfxVar.j("is_import_enabled", true);
        return rsg0.w0(yfb.x(tfxVar)).l(new xl0(new rl2(14), 14));
    }

    @Override // xsna.pzh
    public final io.reactivex.rxjava3.core.x<BaseOkResponseDto> g(int i) {
        return rsg0.w0(yfb.x(this.a.v(i)));
    }
}
