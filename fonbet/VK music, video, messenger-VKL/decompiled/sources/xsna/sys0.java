package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.data.FriendsUtils;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sys0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserId c;

    public /* synthetic */ sys0(UserId userId, int i) {
        this.b = i;
        this.c = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(epx.f((UserId) ((Pair) obj).d(), this.c));
            default:
                FriendsUtils.d(0, this.c);
                return s3q0.a;
        }
    }
}
