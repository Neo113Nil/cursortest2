package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.SmbFeatures;
import java.util.Map;

/* compiled from: CommunityReviewsInteractor.kt */
/* loaded from: classes18.dex */
public final class gzh {
    public final pzh a;
    public final xhg0 b;
    public final fh9 c;
    public final fy2 d;
    public final nt8 e;
    public final UserId f;
    public final boolean g;

    public gzh(pzh pzhVar, xhg0 xhg0Var, fh9 fh9Var, fy2 fy2Var, nt8 nt8Var, UserId userId) {
        this.a = pzhVar;
        this.b = xhg0Var;
        this.c = fh9Var;
        this.d = fy2Var;
        this.e = nt8Var;
        this.f = userId;
        SmbFeatures smbFeatures = SmbFeatures.REPLY_VIDEO_ATTACH;
        smbFeatures.getClass();
        this.g = com.vk.toggle.b.A.a(smbFeatures);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(Integer num, UserId userId, String str, Integer num2, Map map) {
        return this.a.b(userId, num2, str).l(new do3(new il7(3, this, map), 10));
    }
}
