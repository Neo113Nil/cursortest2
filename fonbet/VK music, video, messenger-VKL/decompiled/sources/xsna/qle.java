package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockEmbeddedTabs;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogEmbeddedTabsVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogFullHeightListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class qle implements izs {
    public final /* synthetic */ UIBlockEmbeddedTabs b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ClipsMusicSelectorCatalogEmbeddedTabsVh d;

    public /* synthetic */ qle(UIBlockEmbeddedTabs uIBlockEmbeddedTabs, int i, ClipsMusicSelectorCatalogEmbeddedTabsVh clipsMusicSelectorCatalogEmbeddedTabsVh) {
        this.b = uIBlockEmbeddedTabs;
        this.c = i;
        this.d = clipsMusicSelectorCatalogEmbeddedTabsVh;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList<UIBlock> arrayList;
        ClipsMusicSelectorCatalogFullHeightListVh viewHolder;
        UIBlockList uIBlockList = (UIBlockList) obj;
        qcy<Object>[] qcyVarArr = ClipsMusicSelectorCatalogEmbeddedTabsVh.p;
        ArrayList<UIBlock> arrayList2 = this.b.y.A;
        int i = this.c;
        UIBlock uIBlock = arrayList2.get(i);
        UIBlockList uIBlockList2 = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList2 == null || (arrayList = uIBlockList2.y) == null) {
            return s3q0.a;
        }
        arrayList.clear();
        ArrayList<UIBlock> arrayList3 = uIBlockList.y;
        ClipsMusicSelectorCatalogEmbeddedTabsVh clipsMusicSelectorCatalogEmbeddedTabsVh = this.d;
        ViewPagerVh viewPagerVh = clipsMusicSelectorCatalogEmbeddedTabsVh.e;
        arrayList.addAll(j5g.H0(arrayList3, 6));
        int size = uIBlockList.y.size();
        UIBlockEmbeddedTabs.End.State state = size == 0 ? UIBlockEmbeddedTabs.End.State.EMPTY_BANNER : (1 > size || size > 6) ? UIBlockEmbeddedTabs.End.State.SHOW_MORE : UIBlockEmbeddedTabs.End.State.HIDDEN;
        if (state == UIBlockEmbeddedTabs.End.State.SHOW_MORE) {
            CatalogViewType catalogViewType = CatalogViewType.SEPARATOR;
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_CURATOR;
            UserId userId = UserId.d;
            EmptyList emptyList = EmptyList.b;
            EmptySet emptySet = EmptySet.b;
            CatalogLaunchOrigin catalogLaunchOrigin = CatalogLaunchOrigin.UNKNOWN;
            if ((3840 & 4096) != 0) {
                catalogLaunchOrigin = CatalogLaunchOrigin.UNKNOWN;
            }
            arrayList.add(new UIBlockSeparator(new com.vk.catalog2.common.dto.api.ui.a((8183 & 1) != 0 ? "" : null, (8183 & 2) != 0 ? "" : null, (8183 & 4) != 0 ? catalogViewType : null, (8183 & 8) != 0 ? catalogDataType : CatalogDataType.DATA_TYPE_NONE, "", (8183 & 32) != 0 ? userId : null, emptyList, emptySet, (UIBlockHint) null, (CatalogViewStyle) null, (String) null, (CatalogOnboardingInfo) null, catalogLaunchOrigin), null, 2, null));
        }
        CatalogViewType catalogViewType2 = CatalogViewType.EMPTY;
        CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_CURATOR;
        UserId userId2 = UserId.d;
        EmptyList emptyList2 = EmptyList.b;
        EmptySet emptySet2 = EmptySet.b;
        CatalogLaunchOrigin catalogLaunchOrigin2 = CatalogLaunchOrigin.UNKNOWN;
        if ((3840 & 4096) != 0) {
            catalogLaunchOrigin2 = CatalogLaunchOrigin.UNKNOWN;
        }
        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a((8183 & 1) != 0 ? "" : null, (8183 & 2) != 0 ? "" : null, (8183 & 4) != 0 ? catalogViewType2 : null, (8183 & 8) != 0 ? catalogDataType2 : CatalogDataType.DATA_SYNTHETIC_CATALOG, "", (8183 & 32) != 0 ? userId2 : null, emptyList2, emptySet2, (UIBlockHint) null, (CatalogViewStyle) null, (String) null, (CatalogOnboardingInfo) null, catalogLaunchOrigin2);
        String str = uIBlockList.b;
        String str2 = uIBlockList.z;
        arrayList.add(new UIBlockEmbeddedTabs.End(aVar, state, str, str2 != null ? str2 : ""));
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        int i2 = 0;
        while (i2 < disableableViewPager.getChildCount()) {
            int i3 = i2 + 1;
            View childAt = disableableViewPager.getChildAt(i2);
            if (childAt instanceof ClipsMusicSelectorCatalogFullHeightListVh.FullHeightList) {
                ClipsMusicSelectorCatalogFullHeightListVh.FullHeightList fullHeightList = (ClipsMusicSelectorCatalogFullHeightListVh.FullHeightList) childAt;
                if (epx.f(fullHeightList.getSectionId(), arrayList2.get(i).b) && (viewHolder = fullHeightList.getViewHolder()) != null) {
                    viewHolder.N6(arrayList2.get(i));
                }
            }
            i2 = i3;
        }
        DisableableViewPager disableableViewPager2 = viewPagerVh.o;
        (disableableViewPager2 != null ? disableableViewPager2 : null).post(new qb3(clipsMusicSelectorCatalogEmbeddedTabsVh, 4));
        return s3q0.a;
    }
}
