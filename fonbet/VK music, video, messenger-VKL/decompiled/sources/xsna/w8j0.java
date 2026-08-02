package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.VkPaginationList;

/* compiled from: ShareStoryRenderView.kt */
/* loaded from: classes16.dex */
public final class w8j0 implements gm50 {
    public final e8j0 b;
    public final r8j0 c;
    public final y7j0 d;

    public w8j0(e8j0 e8j0Var, r8j0 r8j0Var, RecyclerView recyclerView, n8j0 n8j0Var, d9j0 d9j0Var, gpj0 gpj0Var, n8 n8Var, VkPaginationList vkPaginationList) {
        this.b = e8j0Var;
        this.c = r8j0Var;
        int i = vkPaginationList.e;
        int i2 = vkPaginationList.c;
        boolean z = vkPaginationList.d;
        y7j0 y7j0Var = new y7j0();
        uk ukVar = new uk(20, y7j0Var, gpj0Var);
        y7j0Var.y0(new z8j0(n8Var));
        y7j0Var.y0(new b9j0());
        y7j0Var.y0(new y8j0(n8Var));
        y7j0Var.y0(new i8j0(n8Var, new n8j0(ukVar, n8j0Var.c, n8j0Var.d, n8j0Var.e, n8j0Var.f)));
        y7j0Var.y0(new g8j0(n8Var, d9j0Var, i, i2, z));
        y7j0Var.y0(new p8j0(n8Var));
        this.d = y7j0Var;
        gpu0 gpu0Var = new gpu0(recyclerView.getContext());
        gpu0Var.j = new v8j0(this);
        gpu0Var.e = 0;
        gpu0Var.h = iah0.a(16);
        gpu0Var.i = iah0.a(12);
        recyclerView.setAdapter(y7j0Var);
        recyclerView.addItemDecoration(gpu0Var);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
