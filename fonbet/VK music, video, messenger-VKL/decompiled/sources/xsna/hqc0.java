package xsna;

import android.content.Context;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.PostingType;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.cqc0;

/* compiled from: PostingVisibilityDialogDelegate.kt */
/* loaded from: classes4.dex */
public final class hqc0 implements w8i {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new lva0(this, 6));

    public final void a(Context context, gqc0 gqc0Var, izs<? super PostingVisibilityMode, s3q0> izsVar) {
        cqc0 cqc0Var = new cqc0(context, gqc0Var.a, PostingType.POST, new lse(izsVar, 4), new kk1(24), new j3(23, context, this), null, tzp0.a(null, 3));
        List<ProfileFriendItem> list = gqc0Var.b;
        List<ListFriends> list2 = gqc0Var.c;
        List<ProfileFriendItem> list3 = gqc0Var.d;
        List<UserProfile> list4 = gqc0Var.e;
        boolean z = false;
        cqc0Var.Z0(new cpo(false, 0, 7), false);
        int i = cqc0.d.$EnumSwitchMapping$0[cqc0Var.g.ordinal()];
        if (i == 1) {
            cqc0Var.S0(new aj50(cqc0Var, 10));
            s3q0 s3q0Var = s3q0.a;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cqc0Var.S0(new pf40(cqc0Var, 8));
            s3q0 s3q0Var2 = s3q0.a;
        }
        List<ProfileFriendItem> list5 = list;
        if (list5 == null || list5.isEmpty()) {
            List<UserProfile> list6 = list4;
            if (list6 != null && !list6.isEmpty()) {
                cqc0Var.S0(new mi10(list4, 16));
            }
        } else {
            cqc0Var.S0(new h57(21, cqc0Var, list));
        }
        List<ListFriends> list7 = list2;
        if (list7 != null && !list7.isEmpty() && !cqc0Var.q.isEmpty()) {
            z = true;
        }
        List<ProfileFriendItem> list8 = list3;
        if ((list8 == null || list8.isEmpty() || cqc0Var.p.isEmpty()) && !z) {
            return;
        }
        cqc0Var.S0(new bqc0(cqc0Var.q, cqc0Var.p, list3, list2, cqc0Var));
    }
}
