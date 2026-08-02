package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: VkUiContextMenu.kt */
/* loaded from: classes17.dex */
public final class qvv0 extends RecyclerView.i {
    public final /* synthetic */ com.vk.core.view.components.context.menu.e a;
    public final /* synthetic */ int b;

    public qvv0(com.vk.core.view.components.context.menu.e eVar, int i) {
        this.a = eVar;
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b() {
        com.vk.core.view.components.context.menu.e eVar = this.a;
        View view = eVar.n;
        if (view == null) {
            view = null;
        }
        view.post(new kjp0(eVar, this.b, 1));
    }
}
