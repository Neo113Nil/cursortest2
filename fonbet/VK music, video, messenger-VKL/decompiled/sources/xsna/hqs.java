package xsna;

import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.friends.api.presentation.FriendsSelectionType;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import java.util.List;

/* compiled from: FriendsListFragmentFactoryImpl.kt */
/* loaded from: classes15.dex */
public final class hqs implements gqs {
    @Override // xsna.gqs
    public final FragmentImpl a(iqs iqsVar) {
        PaginatedFriendsListFragment.a aVar = new PaginatedFriendsListFragment.a(PaginatedFriendsListFragment.class, null, null);
        aVar.y(iqsVar);
        return aVar.f();
    }

    @Override // xsna.gqs
    public final FragmentImpl b(iqs iqsVar, FriendsSelectionType friendsSelectionType, List<UserId> list) {
        FriendsSelectionFragment.a aVar = new FriendsSelectionFragment.a(FriendsSelectionFragment.class, null, null);
        String name = friendsSelectionType.name();
        Bundle bundle = aVar.j;
        bundle.putString("selection_type", name);
        bundle.putParcelableArrayList("preselected_user_ids", p4g.q(list));
        bundle.putInt("initially_selected_users_count", list.size());
        aVar.y(iqsVar);
        return aVar.f();
    }
}
