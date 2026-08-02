package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.ecomm.checklist.impl.presentation.model.CommunityCheckListArgs;

/* compiled from: MarketChecklistRouterImpl.kt */
/* loaded from: classes18.dex */
public final class yv00 implements xv00 {
    @Override // xsna.xv00
    public final void a(Context context, UserId userId, String str) {
        CommunityCheckListFragment.a aVar = new CommunityCheckListFragment.a(CommunityCheckListFragment.class, null, null);
        CommunityCheckListArgs communityCheckListArgs = new CommunityCheckListArgs(userId, str);
        aVar.j.putParcelable(fpf0.a(CommunityCheckListArgs.class).l(), communityCheckListArgs);
        aVar.k(context);
    }
}
