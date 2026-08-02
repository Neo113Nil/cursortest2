package xsna;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.core.util.CatalogOnOutsideTouchState;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.util.Iterator;
import java.util.List;
import xsna.u4a;

/* compiled from: CatalogPagerTabViewAdapter.kt */
/* loaded from: classes16.dex */
public final class sba extends s1q0 implements g380, uoa0 {
    public final u4a f;
    public final wzs<String, kea, s3q0> g;
    public final boolean h;
    public final boolean i;
    public final a j;
    public final mzt0 k;
    public final RecyclerView.t l;
    public final wzs<Integer, View, s3q0> m;
    public final wia n;
    public final t96 o;
    public final c7t0 p;
    public List<? extends UIBlock> q;
    public int u;
    public Integer v;
    public boolean w;
    public obt0 x;
    public final SparseArray<CatalogViewHolder> r = new SparseArray<>();
    public final SparseArray<View> s = new SparseArray<>();
    public final SparseArray<ayn0> t = new SparseArray<>();
    public izs<? super View, s3q0> y = new pf(7);
    public final das0 z = new das0();

    /* compiled from: CatalogPagerTabViewAdapter.kt */
    public interface a {
    }

    public sba(u4a u4aVar, List list, wzs wzsVar, boolean z, boolean z2, a aVar, mzt0 mzt0Var, RecyclerView.t tVar, wzs wzsVar2, wia wiaVar, d80 d80Var, c7t0 c7t0Var) {
        this.f = u4aVar;
        this.g = wzsVar;
        this.h = z;
        this.i = z2;
        this.j = aVar;
        this.k = mzt0Var;
        this.l = tVar;
        this.m = wzsVar2;
        this.n = wiaVar;
        this.o = d80Var;
        this.p = c7t0Var;
        this.q = list;
    }

    @Override // xsna.uoa0
    public final boolean a() {
        return this.i;
    }

    public final boolean b(int i) {
        String str;
        SparseArray<CatalogViewHolder> sparseArray = this.r;
        if (zik0.c(sparseArray)) {
            this.w = true;
            return false;
        }
        UIBlock uIBlock = (UIBlock) j5g.b0(i, this.q);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null || (str = uIBlockList.M) == null) {
            str = "Unknown section url";
        }
        das0 das0Var = this.z;
        gl6 gl6Var = new gl6(das0Var, 2);
        Integer num = this.v;
        if (num != null && num.intValue() != i) {
            gl6Var.invoke(str);
        }
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            CatalogViewHolder valueAt = sparseArray.valueAt(i2);
            ResumableViewHolder resumableViewHolder = valueAt instanceof ResumableViewHolder ? (ResumableViewHolder) valueAt : null;
            if (keyAt == i) {
                if (resumableViewHolder != null) {
                    resumableViewHolder.onResume();
                }
                wg1 wg1Var = new wg1(das0Var, 2);
                Integer num2 = this.v;
                if (num2 != null && num2.intValue() != i) {
                    wg1Var.invoke(str);
                }
                mzt0 mzt0Var = this.k;
                if (mzt0Var != null) {
                    mzt0Var.u((UIBlock) j5g.b0(i, this.q));
                }
                this.m.invoke(Integer.valueOf(i), this.s.get(keyAt));
                z = true;
            } else if (resumableViewHolder != null) {
                resumableViewHolder.onPause();
            }
        }
        if (z) {
            this.v = Integer.valueOf(i);
        }
        return z;
    }

    public final void c() {
        SparseArray<CatalogViewHolder> sparseArray = this.r;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            sparseArray.valueAt(i).L();
        }
        SparseArray<ayn0> sparseArray2 = this.t;
        int size2 = sparseArray2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sparseArray2.valueAt(i2).a();
        }
    }

    public final Integer d(String str) {
        Iterator<? extends UIBlock> it = this.q.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (epx.f(it.next().b, str)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.h) {
            View view = (View) obj;
            d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new w63(2, viewGroup, view), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        } else {
            viewGroup.removeView((View) obj);
        }
        CatalogViewHolder catalogViewHolder = this.r.get(i);
        if (catalogViewHolder != null) {
            catalogViewHolder.L();
        }
    }

    public final void e(CatalogOnOutsideTouchState catalogOnOutsideTouchState, int i) {
        CatalogOnOutsideTouchState catalogOnOutsideTouchState2 = CatalogOnOutsideTouchState.IDLE;
        SparseArray<CatalogViewHolder> sparseArray = this.r;
        if (catalogOnOutsideTouchState == catalogOnOutsideTouchState2) {
            u4q0 u4q0Var = zik0.a;
            CatalogViewHolder catalogViewHolder = sparseArray.get(i);
            nba nbaVar = catalogViewHolder instanceof nba ? (nba) catalogViewHolder : null;
            if (nbaVar != null) {
                nbaVar.c(catalogOnOutsideTouchState);
                return;
            }
            return;
        }
        Iterator it = zik0.g(sparseArray).iterator();
        while (it.hasNext()) {
            CatalogViewHolder catalogViewHolder2 = (CatalogViewHolder) it.next();
            nba nbaVar2 = catalogViewHolder2 instanceof nba ? (nba) catalogViewHolder2 : null;
            if (nbaVar2 != null) {
                nbaVar2.c(catalogOnOutsideTouchState);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.q.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        if (this.j != null) {
            return -2;
        }
        return super.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        String title;
        Parcelable parcelable = this.q.get(i);
        rwp0 rwp0Var = parcelable instanceof rwp0 ? (rwp0) parcelable : null;
        return (rwp0Var == null || (title = rwp0Var.getTitle()) == null) ? "" : title;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r5 == null) goto L8;
     */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        t96 t96Var;
        c7t0 c7t0Var;
        RecyclerView.t tVar;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        UIBlock uIBlock = this.q.get(i);
        SparseArray<CatalogViewHolder> sparseArray = this.r;
        CatalogViewHolder catalogViewHolder = sparseArray.get(i, null);
        if (catalogViewHolder == null) {
            u4a u4aVar = this.f;
            wia wiaVar = this.n;
            if (wiaVar != null) {
                CatalogDataType catalogDataType = uIBlock.e;
                CatalogViewType catalogViewType = uIBlock.d;
                CatalogViewStyle catalogViewStyle = uIBlock.l;
                u4a.a aVar = u4aVar.b;
                catalogViewHolder = wiaVar.a(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, new z4a(aVar.d, aVar.f));
            }
            catalogViewHolder = u4aVar.b.s.w(uIBlock.e, uIBlock.d, uIBlock.l, uIBlock, u4aVar);
        }
        wzs<String, kea, s3q0> wzsVar = this.g;
        if (wzsVar != null && (catalogViewHolder instanceof a3a)) {
            ((a3a) catalogViewHolder).h(uIBlock, wzsVar);
        }
        Bundle bundle = new Bundle();
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        String str = uIBlockList != null ? uIBlockList.M : null;
        bundle.putString("vk_video_scroll_perf_screen_type", (epx.f(str, "https://vkvideo.ru/for_kids") ? ScrollScreenType.VK_VIDEO_KIDS : epx.f(str, "https://vkvideo.ru/movies_serials") ? ScrollScreenType.VK_VIDEO_MOVIES_AND_SERIALS : ScrollScreenType.FEED).name());
        View k5 = catalogViewHolder.k5(from, viewGroup, bundle);
        this.y.invoke(k5);
        boolean z = k5 instanceof CatalogRecyclerPaginatedView;
        if (z && (tVar = this.l) != null) {
            ((CatalogRecyclerPaginatedView) k5).getRecyclerView().addOnScrollListener(tVar);
        }
        if (z && (c7t0Var = this.p) != null) {
            RecyclerView.Adapter adapter = ((CatalogRecyclerPaginatedView) k5).getRecyclerView().getAdapter();
            pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
            if (pd90Var != null) {
                pd90Var.i = c7t0Var;
            }
        }
        if (z && (t96Var = this.o) != null) {
            ((CatalogRecyclerPaginatedView) k5).setCatalogEventHandler(t96Var);
        }
        if (this.h) {
            k5.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            viewGroup.addView(k5);
            d3m.c(k5, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            viewGroup.addView(k5);
        }
        if (catalogViewHolder instanceof CatalogListViewHolder) {
            this.t.put(i, ((CatalogListViewHolder) catalogViewHolder).Pa());
        }
        sparseArray.put(i, catalogViewHolder);
        this.s.put(i, k5);
        obt0 obt0Var = this.x;
        if (obt0Var != null && ((Boolean) obt0Var.invoke(Integer.valueOf(i))).booleanValue()) {
            this.x = null;
        }
        return k5;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        SparseArray<ayn0> sparseArray = this.t;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).b();
        }
        SparseArray sparseArray2 = new SparseArray();
        SparseArray<CatalogViewHolder> sparseArray3 = this.r;
        int size2 = sparseArray3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            int keyAt = sparseArray3.keyAt(i2);
            CatalogViewHolder valueAt = sparseArray3.valueAt(i2);
            g380 g380Var = valueAt instanceof g380 ? (g380) valueAt : null;
            if (g380Var != null) {
                sparseArray2.put(keyAt, g380Var);
            }
        }
        int size3 = sparseArray2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((g380) sparseArray2.valueAt(i3)).onConfigurationChanged(configuration);
        }
    }

    public final void s() {
        CatalogViewHolder catalogViewHolder = this.r.get(this.u);
        CatalogListViewHolder catalogListViewHolder = catalogViewHolder instanceof CatalogListViewHolder ? (CatalogListViewHolder) catalogViewHolder : null;
        if (catalogListViewHolder != null) {
            catalogListViewHolder.s();
        }
    }

    @Override // xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        this.u = i;
        if (this.w) {
            b(i);
            this.w = false;
        }
    }

    @Override // xsna.s1q0, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        KeyEvent.Callback callback = (View) this.s.get(this.u);
        if (callback == null) {
            this.y = new yx0(this, uiTrackingScreen);
            uiTrackingScreen.h = false;
        } else if (callback instanceof m0q0) {
            ((m0q0) callback).y(uiTrackingScreen);
        }
    }
}
