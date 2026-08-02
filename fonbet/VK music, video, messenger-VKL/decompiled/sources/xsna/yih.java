package xsna;

import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.e;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wih;

/* compiled from: CommunityProfileContentInfoItem.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class yih implements e.d, g0t {
    public final /* synthetic */ wih.a b;

    public yih(wih.a aVar) {
        this.b = aVar;
    }

    @Override // com.vk.core.view.components.tabs.e.d
    public final void a(VkTabs.c cVar, int i) {
        this.b.t6(cVar, i);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e.d) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.b, wih.a.class, "tabConfigurationStrategy", "tabConfigurationStrategy(Lcom/vk/core/view/components/tabs/VkTabs$Tab;I)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
