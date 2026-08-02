package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class dog<T> implements Comparator {
    public final /* synthetic */ CommunitiesCatalogRootVh b;

    public dog(CommunitiesCatalogRootVh communitiesCatalogRootVh) {
        this.b = communitiesCatalogRootVh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        CommunitiesCatalogRootVh communitiesCatalogRootVh = this.b;
        return jw5.b(Integer.valueOf(CommunitiesCatalogRootVh.i0(communitiesCatalogRootVh, (UIBlock) t)), Integer.valueOf(CommunitiesCatalogRootVh.i0(communitiesCatalogRootVh, (UIBlock) t2)));
    }
}
