package xsna;

import com.vk.api.generated.video.dto.VideoGetLongPollServerResponseDto;
import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g500 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserId c;

    public /* synthetic */ g500(tci tciVar, int i, UserId userId) {
        this.b = i;
        this.c = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.internal.operators.observable.c2 c2Var = new io.reactivex.rxjava3.internal.operators.observable.c2(new io.reactivex.rxjava3.internal.operators.observable.z1(new io.reactivex.rxjava3.internal.operators.observable.q(new i500(this.b, this.c, ((VideoGetLongPollServerResponseDto) obj).getUrl())), new n0g0(300)), new io.reactivex.rxjava3.internal.operators.mixed.k(20));
        asu0 asu0Var = asu0.a;
        return c2Var.r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F0(asu0Var.c());
    }
}
