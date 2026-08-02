package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.friends.recommendations.impl.presentation.Item;
import com.vkontakte.android.R;

/* compiled from: SearchFriendsListHolder.kt */
/* loaded from: classes16.dex */
public final class yth0 extends vif0<Item> {
    public final com.vk.friends.recommendations.impl.presentation.c n;

    public yth0(BaseFragment baseFragment, ViewGroup viewGroup) {
        super(viewGroup, R.layout.search_friends_list, 0);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.search_friends_list);
        com.vk.friends.recommendations.impl.presentation.c cVar = new com.vk.friends.recommendations.impl.presentation.c(baseFragment);
        this.n = cVar;
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(cVar);
    }

    @Override // xsna.vif0
    public final void i6(Item item) {
        this.n.setItems(item.d);
    }
}
