package xsna;

import androidx.recyclerview.widget.RecyclerView;
import xsna.ajh;

/* compiled from: UserProfileWithTabsView.kt */
/* loaded from: classes5.dex */
public final class byq0 extends RecyclerView.t {
    public final /* synthetic */ com.vk.profile.user.impl.ui.i b;

    public byq0(com.vk.profile.user.impl.ui.i iVar) {
        this.b = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        com.vk.profile.user.impl.ui.i iVar = this.b;
        iVar.j.a(new ajh.b(i2));
        iVar.h.getClass();
    }
}
