package xsna;

import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.lists.c;

/* compiled from: SendStoryUsersRenderExtension.kt */
/* loaded from: classes16.dex */
public final class aji0 implements gm50 {
    public final pii0 b;
    public final oii0 c;
    public final com.vk.lists.c d;

    public aji0(pii0 pii0Var, VkRecyclerPaginatedView vkRecyclerPaginatedView, xii0 xii0Var, msj0 msj0Var, q99 q99Var) {
        this.b = pii0Var;
        oii0 oii0Var = new oii0();
        oii0Var.y0(new sii0(q99Var, msj0Var));
        oii0Var.y0(new bji0(q99Var));
        oii0Var.y0(new cji0());
        oii0Var.y0(new rii0(q99Var));
        this.c = oii0Var;
        vkRecyclerPaginatedView.setAdapter(oii0Var);
        this.d = com.vk.lists.f.a(new c.h(xii0Var), vkRecyclerPaginatedView);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
