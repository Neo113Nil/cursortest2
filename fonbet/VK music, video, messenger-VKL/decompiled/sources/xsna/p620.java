package xsna;

import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh;
import com.vk.core.view.components.search.VkSearchView;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: MenuIntegrationSearchDelegateImpl.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class p620 extends MutablePropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p620(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((n620) this.receiver).i;
            default:
                return ((vth0) this.receiver).f;
        }
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                ((n620) this.receiver).i = (SearchFeatureCatalogRootVh) obj;
                break;
            default:
                ((vth0) this.receiver).f = (VkSearchView) obj;
                break;
        }
    }
}
