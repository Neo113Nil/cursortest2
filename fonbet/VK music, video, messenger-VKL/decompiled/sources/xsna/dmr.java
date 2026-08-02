package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import java.util.ArrayList;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class dmr implements Runnable {
    public final /* synthetic */ FirstPinnedTabLayoutVh b;

    public dmr(FirstPinnedTabLayoutVh firstPinnedTabLayoutVh) {
        this.b = firstPinnedTabLayoutVh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UIBlockCatalog uIBlockCatalog;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        UIBlockHint uIBlockHint;
        FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = this.b;
        FirstPinnedTabLayout firstPinnedTabLayout = firstPinnedTabLayoutVh.p;
        if (firstPinnedTabLayout == null) {
            firstPinnedTabLayout = null;
        }
        j9x it = swe0.q(0, firstPinnedTabLayout.getTabCount()).iterator();
        while (it.d) {
            int nextInt = it.nextInt();
            FirstPinnedTabLayout firstPinnedTabLayout2 = firstPinnedTabLayoutVh.p;
            if (firstPinnedTabLayout2 == null) {
                firstPinnedTabLayout2 = null;
            }
            TabLayout.g b = firstPinnedTabLayout2.b(nextInt);
            if (b != null && b.h != null && (uIBlockCatalog = firstPinnedTabLayoutVh.z) != null && (arrayList = uIBlockCatalog.A) != null && (uIBlock = (UIBlock) j5g.b0(nextInt, arrayList)) != null && (uIBlockHint = uIBlock.j) != null && uIBlockHint.B != CatalogHintType.HIGHLIGHT_TABS) {
                firstPinnedTabLayoutVh.e.getClass();
            }
        }
    }
}
