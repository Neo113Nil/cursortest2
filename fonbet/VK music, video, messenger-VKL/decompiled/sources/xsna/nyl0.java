package xsna;

import com.vk.core.view.components.tabs.VkTabs;
import java.util.List;

/* compiled from: StoryBackgroundEditorView.kt */
/* loaded from: classes6.dex */
public final class nyl0 implements VkTabs.b {
    public final /* synthetic */ myl0 a;
    public final /* synthetic */ List<syl0> b;

    public nyl0(myl0 myl0Var, List<syl0> list) {
        this.a = myl0Var;
        this.b = list;
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void c(VkTabs.c cVar) {
        gyl0 presenter = this.a.getPresenter();
        if (presenter != null) {
            presenter.V1(this.b.get(cVar.b).a);
        }
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void b() {
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void a(VkTabs.c cVar) {
    }
}
