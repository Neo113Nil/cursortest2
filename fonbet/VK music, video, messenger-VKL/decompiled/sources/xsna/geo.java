package xsna;

import android.content.Context;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.dto.common.id.UserId;

/* compiled from: DraftsListRouterImpl.kt */
/* loaded from: classes18.dex */
public final class geo implements feo {
    @Override // xsna.feo
    public final void a(Context context, UserId userId) {
        DraftsListFragment.a aVar = new DraftsListFragment.a(DraftsListFragment.class, null, null);
        aVar.s(true);
        aVar.j.putParcelable("owner_id", userId);
        aVar.k(context);
    }
}
