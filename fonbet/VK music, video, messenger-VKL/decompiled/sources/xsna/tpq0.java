package xsna;

import com.vk.profile.design.compose.user.FriendsAndFollowersBlockData;
import com.vk.profile.user.impl.ui.UserProfileAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.rpq0;

/* compiled from: UserProfileFriendsAndFollowersInfoViewHolder.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class tpq0 extends FunctionReferenceImpl implements izs<FriendsAndFollowersBlockData.BlockType, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(FriendsAndFollowersBlockData.BlockType blockType) {
        slq0 slq0Var = ((rpq0) this.receiver).n;
        int i = rpq0.b.$EnumSwitchMapping$0[blockType.ordinal()];
        if (i == 1) {
            slq0Var.a(UserProfileAction.c.b);
        } else if (i == 2) {
            slq0Var.a(UserProfileAction.t.b);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            slq0Var.a(UserProfileAction.j.b);
        }
        return s3q0.a;
    }
}
