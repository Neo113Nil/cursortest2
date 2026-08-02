package xsna;

import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nwh0 implements z960 {
    public final /* synthetic */ NewsEntry b;
    public final /* synthetic */ NewsEntry c;
    public final /* synthetic */ int d;
    public final /* synthetic */ owh0 e;

    public /* synthetic */ nwh0(NewsEntry newsEntry, NewsEntry newsEntry2, int i, owh0 owh0Var) {
        this.b = newsEntry;
        this.c = newsEntry2;
        this.d = i;
        this.e = owh0Var;
    }

    @Override // xsna.z960
    public final void g(VkContextMenu vkContextMenu, int i) {
        jc60 jc60Var = new jc60(i, this.b, this.c, this.d, false, null);
        owh0 owh0Var = this.e;
        owh0Var.d.f(owh0Var.b, jc60Var);
    }
}
