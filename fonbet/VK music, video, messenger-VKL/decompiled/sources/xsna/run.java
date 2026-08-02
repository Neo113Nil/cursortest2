package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;

/* compiled from: AttachDocumentsFragment.kt */
/* loaded from: classes18.dex */
public final class run {
    public final int a;
    public final UserId b;
    public VkPaginationList<Document> c;
    public final AttachDocumentsFragment.d d;
    public final com.vk.documents.impl.ui.fragments.a e;
    public final VkRecyclerPaginatedView f;

    public run(int i, UserId userId, VkPaginationList vkPaginationList, zom0 zom0Var, fux fuxVar, u3d0 u3d0Var, AttachDocumentsFragment.d dVar, BaseFragment baseFragment, boolean z) {
        this.a = i;
        this.b = userId;
        this.c = vkPaginationList;
        this.d = dVar;
        com.vk.documents.impl.ui.fragments.a aVar = new com.vk.documents.impl.ui.fragments.a(fuxVar, u3d0Var, zom0Var, z);
        this.e = aVar;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = new VkRecyclerPaginatedView(baseFragment.requireContext(), null, 6, 0);
        RecyclerView recyclerView = vkRecyclerPaginatedView.getRecyclerView();
        baseFragment.mo2getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        int a = iah0.a(8);
        vkRecyclerPaginatedView.setItemDecoration(new v98(0, a, a, false));
        vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        if (z) {
            vkRecyclerPaginatedView.getRecyclerView().setNestedScrollingEnabled(true);
            vkRecyclerPaginatedView.setSwipeRefreshLayoutNestedScrollEnabled(false);
        }
        vkRecyclerPaginatedView.setAdapter(aVar);
        this.f = vkRecyclerPaginatedView;
        c.h hVar = new c.h(new qun(this));
        hVar.c = 10;
        hVar.i = 30;
        com.vk.lists.f.a(hVar, vkRecyclerPaginatedView);
    }
}
