package xsna;

import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.SocialButtonType;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mks;
import xsna.ols;
import xsna.qls;
import xsna.qtf0;
import xsna.rf90;

/* compiled from: FriendsAndFollowersTabReducer.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class lls extends FunctionReferenceImpl implements izs<ols.a, qls.d> {
    @Override // xsna.izs
    public final qls.d invoke(ols.a aVar) {
        ols.a aVar2 = aVar;
        ((iks) this.receiver).getClass();
        rf90 rf90Var = aVar2.d;
        ListBuilder e = e43.e();
        for (RequestUserProfile requestUserProfile : aVar2.b.a) {
            e.add(requestUserProfile.e0 == SocialButtonType.FOLLOW ? new mks.b(requestUserProfile) : new mks.a(requestUserProfile));
        }
        if (rf90Var instanceof rf90.c) {
            e.add(lks.b);
        }
        if (rf90Var instanceof rf90.a) {
            e.add(new kks(((rf90.a) rf90Var).a));
        }
        return new qls.d(e.g(), aVar2.c instanceof qtf0.b);
    }
}
