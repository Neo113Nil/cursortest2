package xsna;

import android.database.DataSetObserver;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;

/* compiled from: FirstPinnedTabLayoutVh.kt */
/* loaded from: classes16.dex */
public final class ylr extends DataSetObserver {
    public final /* synthetic */ FirstPinnedTabLayoutVh a;

    public ylr(FirstPinnedTabLayoutVh firstPinnedTabLayoutVh) {
        this.a = firstPinnedTabLayoutVh;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        jjt0 jjt0Var;
        super.onChanged();
        FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = this.a;
        UIBlockCatalog uIBlockCatalog = firstPinnedTabLayoutVh.z;
        if (uIBlockCatalog == null || (jjt0Var = firstPinnedTabLayoutVh.f) == null) {
            return;
        }
        FirstPinnedTabLayout firstPinnedTabLayout = firstPinnedTabLayoutVh.p;
        if (firstPinnedTabLayout == null) {
            firstPinnedTabLayout = null;
        }
        jjt0Var.a(uIBlockCatalog, firstPinnedTabLayout);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        jjt0 jjt0Var;
        super.onInvalidated();
        FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = this.a;
        UIBlockCatalog uIBlockCatalog = firstPinnedTabLayoutVh.z;
        if (uIBlockCatalog == null || (jjt0Var = firstPinnedTabLayoutVh.f) == null) {
            return;
        }
        FirstPinnedTabLayout firstPinnedTabLayout = firstPinnedTabLayoutVh.p;
        if (firstPinnedTabLayout == null) {
            firstPinnedTabLayout = null;
        }
        jjt0Var.a(uIBlockCatalog, firstPinnedTabLayout);
    }
}
