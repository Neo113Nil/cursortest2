package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.Subscription;
import com.vk.subscription.api.SubscribeStatus;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class eus0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserId c;

    public /* synthetic */ eus0(UserId userId, int i) {
        this.b = i;
        this.c = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new Pair(this.c, (Subscription) obj);
            default:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                xwk.e().T().m().b(new kym0(SubscribeStatus.MEMBER_STATUS_NOT_MEMBER, this.c, null, null, 12));
                return s3q0.a;
        }
    }
}
