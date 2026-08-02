package xsna;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.StickersRecyclerView;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.log.L;
import com.vk.stickers.bridge.GiftData;
import com.vk.stories.design.view.stickers.StickersTabsAndIndicatorFrameLayout;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PhotoEditorSelectionStickerView.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class x6a0 extends CoordinatorLayout {
    public boolean A;
    public final int B;
    public final int C;
    public int D;
    public boolean E;
    public final ArrayList<StickerItem> F;
    public final ArrayList<StickerItem> G;
    public final ArrayList<StickerStockItem> H;
    public final ArrayList<StickerStockItem> I;
    public final ArrayList<ig10> J;
    public final VkBottomSheetBehavior<ViewGroup> K;
    public final ViewGroup L;
    public final View M;
    public final ycp N;
    public final gdl0 O;
    public final x8l0 P;
    public final ViewPager Q;
    public final FrameLayout R;
    public final uei0 S;
    public final b T;
    public boolean U;
    public Set<WebStickerType> V;

    @Nullable
    public kim0 W;

    @Nullable
    public io.reactivex.rxjava3.disposables.c a0;

    @Nullable
    public io.reactivex.rxjava3.disposables.c b0;

    @Nullable
    public final afi0 c0;
    public final RecyclerView.t d0;

    @NonNull
    public final kcl0 e0;
    public final io.reactivex.rxjava3.subjects.f<Boolean> f0;
    public final float g0;
    public final a z;

    /* compiled from: PhotoEditorSelectionStickerView.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            x6a0.this.y0();
        }
    }

    /* compiled from: PhotoEditorSelectionStickerView.java */
    public class b implements i7l0 {
        public b() {
        }

        @Override // xsna.i7l0
        public final void a(@NonNull Context context, @NonNull StickerStockItem stickerStockItem) {
            x6a0.this.P.a().s(context, stickerStockItem, GiftData.d, null, "story_style_selector", null, new wf40(this, 9));
        }
    }

    /* compiled from: PhotoEditorSelectionStickerView.java */
    public class c extends RecyclerView.t {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            afi0 afi0Var = x6a0.this.c0;
            if (afi0Var == null || i != 1) {
                return;
            }
            afi0Var.c();
        }
    }

    /* compiled from: PhotoEditorSelectionStickerView.java */
    public static class d extends ViewOutlineProvider {
        public final float a;

        public d(float f) {
            this.a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
            view.setClipToOutline(true);
        }
    }

    /* compiled from: PhotoEditorSelectionStickerView.java */
    public class e extends VkBottomSheetBehavior.a {
        public boolean a = false;
        public final int[] b = new int[2];
        public final ilq c = new ilq();

        public e() {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void i(@NonNull View view, float f) {
            afi0 afi0Var;
            float abs = 1.0f - Math.abs(f);
            x6a0 x6a0Var = x6a0.this;
            int i = (int) (x6a0Var.g0 * abs);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x6a0Var.R.getLayoutParams();
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            x6a0Var.R.setLayoutParams(marginLayoutParams);
            FrameLayout frameLayout = x6a0Var.R;
            int[] iArr = this.b;
            frameLayout.getLocationOnScreen(iArr);
            int i2 = iArr[1];
            x6a0Var.L.getLocationOnScreen(iArr);
            x6a0Var.M.setAlpha(this.c.getInterpolation((i2 - iArr[1]) / (view.getHeight() - x6a0Var.K.c)));
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (afi0Var = x6a0Var.c0) == null || this.a) {
                return;
            }
            afi0Var.c();
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void j(int i, @NonNull View view) {
            x6a0 x6a0Var = x6a0.this;
            View view2 = x6a0Var.M;
            x6a0Var.requestLayout();
            this.a = i == 2;
            if (i != 4) {
                view2.setVisibility(0);
                return;
            }
            afi0 afi0Var = x6a0Var.c0;
            if (afi0Var != null) {
                afi0Var.c();
            }
            view2.setVisibility(8);
        }
    }

    /* compiled from: PhotoEditorSelectionStickerView.java */
    public class f extends izt0 {

        @Nullable
        public Object b;

        /* compiled from: PhotoEditorSelectionStickerView.java */
        public class a extends GridLayoutManager.c {
            public final /* synthetic */ w1l0 d;
            public final /* synthetic */ int e;

            public a(w1l0 w1l0Var, int i) {
                this.d = w1l0Var;
                this.e = i;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int c(int i) {
                this.d.getClass();
                if (i == 0) {
                    return this.e;
                }
                return 1;
            }
        }

        public f() {
        }

        @Override // xsna.izt0
        public final View b(int i, ViewPager viewPager) {
            x6a0 x6a0Var = x6a0.this;
            ArrayList<StickerStockItem> arrayList = x6a0Var.H;
            ArrayList<StickerItem> arrayList2 = x6a0Var.F;
            ArrayList<StickerItem> arrayList3 = x6a0Var.G;
            if (i == 0) {
                return x6a0Var.N;
            }
            if (i == 1) {
                x6a0Var.W = new kim0(new lo10(this, 13), ((StoriesComponent) ((k7m) m7m.c(x6a0Var)).a(fpf0.a(StoriesComponent.class))).t7(), x6a0Var.S, SelectionStickerView.OpenFrom.STORY);
                return new ifi0(x6a0Var, new eqq(x6a0Var, 28), x6a0Var.W, new io.reactivex.rxjava3.internal.operators.observable.t(new sei0()).U(new mvc0(new tei0(x6a0Var.V, false), 2)));
            }
            if (x6a0Var.E && i == 2) {
                return new j8w0(viewPager.getContext(), x6a0Var.S);
            }
            StickersRecyclerView stickersRecyclerView = new StickersRecyclerView(viewPager.getContext());
            GridLayoutManager w0 = x6a0Var.w0(stickersRecyclerView);
            int i2 = x6a0Var.E ? 3 : 2;
            if (!arrayList3.isEmpty()) {
                i2++;
            }
            if (i == i2 && arrayList2.size() > 0) {
                e9f0 e9f0Var = new e9f0(x6a0Var.S);
                e9f0Var.submitList(new ArrayList(arrayList2));
                stickersRecyclerView.setAdapter(e9f0Var);
                return stickersRecyclerView;
            }
            if (i == (x6a0Var.E ? 3 : 2) && arrayList3.size() > 0) {
                ctq ctqVar = new ctq(x6a0Var.S);
                ctqVar.submitList(new ArrayList(arrayList3));
                stickersRecyclerView.setAdapter(ctqVar);
                return stickersRecyclerView;
            }
            int i3 = (((i - 2) - (arrayList2.size() > 0 ? 1 : 0)) - (arrayList3.size() > 0 ? 1 : 0)) - (x6a0Var.E ? 1 : 0);
            w1l0 w1l0Var = new w1l0(x6a0Var.S, x6a0Var.T, i3 < arrayList.size() ? arrayList.get(i3) : x6a0Var.I.get(i3 - arrayList.size()));
            stickersRecyclerView.setAdapter(w1l0Var);
            w0.x = new a(w1l0Var, w0.s);
            return stickersRecyclerView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            x6a0 x6a0Var = x6a0.this;
            return x6a0Var.I.size() + x6a0Var.H.size() + (x6a0Var.F.size() > 0 ? 1 : 0) + 2 + (x6a0Var.E ? 1 : 0) + (x6a0Var.G.size() > 0 ? 1 : 0);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(@NonNull Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            super.setPrimaryItem(viewGroup, i, obj);
            this.b = obj;
        }
    }

    public x6a0(l7s l7sVar, uei0 uei0Var) {
        super(l7sVar, null);
        this.z = new a();
        this.A = true;
        int a2 = iah0.a(13);
        this.B = a2;
        this.C = Math.round(e43.a.getResources().getDimension(R.dimen.story_editor_stickers_recycler_left_right_space));
        this.E = false;
        this.F = new ArrayList<>();
        this.G = new ArrayList<>();
        this.H = new ArrayList<>();
        this.I = new ArrayList<>();
        this.J = new ArrayList<>();
        this.P = g2v.d();
        this.T = new b();
        this.V = Collections.EMPTY_SET;
        this.d0 = getScrollListener();
        t6g0 t6g0Var = t6g0.b;
        this.e0 = t6g0.d();
        this.f0 = new io.reactivex.rxjava3.subjects.f<>();
        LayoutInflater.from(l7sVar).inflate(R.layout.layout_photo_editor_sticker_selection, this);
        setOutlineProvider(new d(getResources().getDimension(R.dimen.editor_selection_corner_radius)));
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_pager);
        this.Q = viewPager;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_tabs_container);
        this.R = frameLayout;
        frameLayout.setClipToOutline(true);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_container);
        this.L = viewGroup;
        this.M = findViewById(R.id.main_content);
        this.S = uei0Var;
        VkBottomSheetBehavior<ViewGroup> F = VkBottomSheetBehavior.F(viewGroup);
        this.K = F;
        F.q = new e();
        F.I((int) getResources().getDimension(R.dimen.editor_selection_peek_height));
        F.h = false;
        afi0 afi0Var = new afi0(this, new View(l7sVar), viewPager, SelectionStickerView.OpenFrom.EDIT, uei0Var, new h630(this, 13));
        this.c0 = afi0Var;
        ycp ycpVar = new ycp(l7sVar);
        this.N = ycpVar;
        ycpVar.setClipToPadding(false);
        ycpVar.setLayoutManager(new GridLayoutManager(5));
        ycpVar.setAdapter(new xcp(uei0Var));
        float f2 = 8;
        ycpVar.setPadding(iah0.a(f2), a2, iah0.a(f2), 0);
        gdl0 gdl0Var = new gdl0(l7sVar, true);
        this.O = gdl0Var;
        this.g0 = getResources().getDimension(R.dimen.editor_selection_tabs_horizontal_margin);
        gdl0Var.setPadding(0, 0, 0, 0);
        gdl0Var.setDelegate(new nm3(this, 24));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, iah0.a(48));
        layoutParams.gravity = 1;
        frameLayout.addView(gdl0Var, layoutParams);
        viewPager.setAdapter(new f());
        viewPager.addOnPageChangeListener(new y6a0(this));
        afi0Var.m = false;
        afi0Var.d();
        int i = ify.a;
        ify.a(new z6a0(this));
    }

    @NonNull
    private RecyclerView.t getScrollListener() {
        return new c();
    }

    public Set<WebStickerType> getPermittedStickers() {
        return this.V;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.STICKERS_UPDATED");
        intentFilter.addAction("com.vkontakte.android.STICKERS_RELOADED");
        intentFilter.addAction("com.vkontakte.android.STICKERS_NUM_NEW_ITEMS");
        anj.d(getContext(), this.z, intentFilter, hf8.a, 4);
        kcl0 kcl0Var = this.e0;
        this.a0 = kcl0Var.x0().subscribe(new m1r(this, 13));
        this.b0 = kcl0Var.G().subscribe(new fsq(this, 15));
        if (!this.U) {
            y0();
            this.U = true;
        }
        afi0 afi0Var = this.c0;
        if (afi0Var != null) {
            afi0Var.h();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            getContext().unregisterReceiver(this.z);
        } catch (Throwable th) {
            L.g("Can't unregister sticker reveiver", th);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.a0;
        if (cVar != null) {
            cVar.dispose();
            this.a0 = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.b0;
        if (cVar2 != null) {
            cVar2.dispose();
            this.b0 = null;
        }
        afi0 afi0Var = this.c0;
        if (afi0Var != null) {
            afi0Var.i();
        }
    }

    public void setPermittedClickableStickers(Set<WebStickerType> set) {
        Set<WebStickerType> set2 = this.V;
        this.V = set;
        if (getParent() == null || set2.equals(this.V)) {
            return;
        }
        this.Q.getAdapter().notifyDataSetChanged();
    }

    public void setTopPadding(int i) {
        int i2 = i + this.B;
        ycp ycpVar = this.N;
        int i3 = this.C;
        ycpVar.setPadding(i3, i2, i3, 0);
        int i4 = 0;
        while (true) {
            ViewPager viewPager = this.Q;
            if (i4 >= viewPager.getChildCount()) {
                return;
            }
            View childAt = viewPager.getChildAt(i4);
            if (childAt instanceof RecyclerView) {
                childAt.setPadding(i3, i2, i3, 0);
            }
            i4++;
        }
    }

    public final GridLayoutManager w0(StickersRecyclerView stickersRecyclerView) {
        if (stickersRecyclerView == null) {
            return null;
        }
        stickersRecyclerView.setHasFixedSize(true);
        stickersRecyclerView.setVerticalScrollBarEnabled(true);
        stickersRecyclerView.setClipToPadding(false);
        int i = this.C;
        stickersRecyclerView.setPadding(i, 0, i, 0);
        this.Q.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        stickersRecyclerView.setLayoutManager(gridLayoutManager);
        stickersRecyclerView.addOnScrollListener(this.d0);
        return gridLayoutManager;
    }

    public final void y0() {
        int i;
        VmojiAvatar vmojiAvatar;
        ArrayList<StickerStockItem> arrayList = this.I;
        arrayList.clear();
        gdl0 gdl0Var = this.O;
        StickersTabsAndIndicatorFrameLayout stickersTabsAndIndicatorFrameLayout = gdl0Var.b;
        for (int tabsCount = stickersTabsAndIndicatorFrameLayout.getTabsCount() - 1; -1 < tabsCount; tabsCount--) {
            stickersTabsAndIndicatorFrameLayout.b.removeViewAt(tabsCount);
        }
        gdl0Var.g = 0;
        gdl0Var.b(R.drawable.vk_icon_storefront_outline_28, 0);
        gdl0Var.b(R.drawable.vk_icon_smile_outline_28, 1);
        StickerItem[] stickerItemArr = tia0.s;
        if (stickerItemArr == null || stickerItemArr.length <= 0) {
            i = 1;
        } else {
            ArrayList<ig10> arrayList2 = this.J;
            arrayList2.clear();
            for (StickerItem stickerItem : stickerItemArr) {
                arrayList2.add(new ig10(stickerItem));
            }
            i = 2;
            gdl0Var.b(R.drawable.vk_icon_sticker_outline_28, 2);
        }
        kcl0 kcl0Var = this.e0;
        CopyOnWriteArrayList f0 = kcl0Var.f0();
        ArrayList U = kcl0Var.U();
        VmojiAvatarModel p = kcl0Var.p();
        this.E = p == null && kcl0Var.Y0();
        ArrayList<StickerStockItem> arrayList3 = this.H;
        arrayList3.clear();
        if (p != null && p.b.Cb()) {
            Iterator it = U.iterator();
            while (it.hasNext()) {
                StickerStockItem stickerStockItem = (StickerStockItem) it.next();
                if (stickerStockItem.Q && (vmojiAvatar = stickerStockItem.H) != null && vmojiAvatar.Cb()) {
                    arrayList3.add(stickerStockItem);
                }
            }
        }
        if (this.E) {
            gdl0Var.b(R.drawable.vk_icon_vmoji_outline_28, 5);
            i++;
        }
        List<StickerItem> c0 = kcl0Var.c0();
        ArrayList<StickerItem> arrayList4 = this.G;
        arrayList4.clear();
        arrayList4.addAll(c0);
        if (!c0.isEmpty()) {
            gdl0Var.b(R.drawable.vk_icon_favorite_outline_28, 3);
            i++;
        }
        List<StickerItem> i2 = kcl0Var.i();
        ArrayList<StickerItem> arrayList5 = this.F;
        arrayList5.clear();
        arrayList5.addAll(i2);
        if (i2.size() > 0) {
            gdl0Var.b(R.drawable.vk_icon_clock_outline_28, 4);
            i++;
        }
        if (!arrayList3.isEmpty()) {
            gdl0Var.d(arrayList3);
            i += arrayList3.size();
        }
        arrayList.clear();
        arrayList.addAll(f0);
        Iterator it2 = f0.iterator();
        while (it2.hasNext()) {
            StickerStockItem stickerStockItem2 = (StickerStockItem) it2.next();
            if (!stickerStockItem2.Q) {
                gdl0Var.c(stickerStockItem2);
                i++;
            }
        }
        this.D = i;
        if (o25.a().b()) {
            gdl0Var.b(R.drawable.vk_icon_settings_28, 6);
        }
        ViewPager viewPager = this.Q;
        viewPager.getAdapter().notifyDataSetChanged();
        gdl0Var.e(this.Q.getCurrentItem());
        if (this.A) {
            viewPager.setCurrentItem(1, false);
        }
        this.A = false;
    }
}
