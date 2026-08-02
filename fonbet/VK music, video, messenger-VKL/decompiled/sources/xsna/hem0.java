package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.tabs.VkSecondaryTabLayout;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.stats.carousel.PreviewSnapRecyclerView;
import com.vk.stories.design.view.stats.tabs.StoryStatisticsTab;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.tzp0;

/* compiled from: StoryStatisticsBottomSheet.kt */
/* loaded from: classes6.dex */
public final class hem0 extends tl50<vem0, khm0, aem0> implements ahm0, w8i, too0 {
    public static final /* synthetic */ int y1 = 0;
    public pfm0 k1;
    public mfm0 l1;
    public eem0 m1;
    public int n1;
    public int o1;
    public vfm0 q1;
    public int t1;
    public uov u1;
    public n7b0 v1;
    public su80 w1;
    public int x1;
    public final bpn0 i1 = new bpn0(new mll0(this, 2));
    public final bpn0 j1 = new bpn0(new fem0(this, 0));
    public final b p1 = new b();
    public final bpn0 r1 = new bpn0(new odc0(this, 18));
    public List<? extends StoryEntry> s1 = EmptyList.b;

    /* compiled from: StoryStatisticsBottomSheet.kt */
    public static final class a extends dw20.b {
        public static final tzp0.c.a l = new tzp0.c.a(new C2991a(), true);
        public final uov e;
        public final n7b0 f;
        public final su80 g;
        public final ArrayList h;
        public final int i;
        public final boolean j;
        public final int k;

        /* compiled from: StoryStatisticsBottomSheet.kt */
        /* renamed from: xsna.hem0$a$a, reason: collision with other inner class name */
        public static final class C2991a implements m0q0 {
            @Override // xsna.m0q0
            public final void y(UiTrackingScreen uiTrackingScreen) {
                uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(uov uovVar, n7b0 n7b0Var, su80 su80Var, ArrayList arrayList, int i, boolean z, int i2) {
            super(new l7s(r1, dhr0.u().c), l);
            Context context = uovVar.getView().getContext();
            dhr0.a.getClass();
            this.e = uovVar;
            this.f = n7b0Var;
            this.g = su80Var;
            this.h = arrayList;
            this.i = i;
            this.j = z;
            this.k = i2;
            E0(true);
            r();
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            this.d.C1 = true;
            K0(32);
            l(e3m.f(R.attr.vk_ui_background_content, this.c));
            if (iah0.o(this.c)) {
                return;
            }
            this.d.B1 = true;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            hem0 hem0Var = new hem0();
            hem0Var.setArguments(yfb.b(new Pair("IS_GROUP", Boolean.valueOf(this.j))));
            hem0Var.u1 = this.e;
            hem0Var.v1 = this.f;
            hem0Var.w1 = this.g;
            hem0Var.s1 = this.h;
            hem0Var.t1 = this.i;
            hem0Var.x1 = this.k;
            return hem0Var;
        }
    }

    /* compiled from: StoryStatisticsBottomSheet.kt */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            PreviewSnapRecyclerView previewRecycler;
            pfm0 pfm0Var = hem0.this.k1;
            if (pfm0Var != null && (previewRecycler = pfm0Var.getPreviewRecycler()) != null) {
                for (int i = 0; i < previewRecycler.getChildCount(); i++) {
                    View childAt = previewRecycler.getChildAt(i);
                    if (bwt0.C(childAt).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        childAt.performClick();
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        int p = iah0.p(requireContext()) + (iah0.o(requireContext()) ? fnj.a(requireContext()) : 0);
        float f = p;
        this.e0 = new ofm0(requireContext(), (f - (((((iah0.o(requireContext()) ? 0 : fnj.a(requireContext())) + getResources().getDimension(R.dimen.story_statistics_preview_top_margin)) + getResources().getDimension(R.dimen.story_statistics_preview_item_height)) + getResources().getDimension(R.dimen.story_statistics_preview_bottom_margin)) + (((Boolean) this.r1.getValue()).booleanValue() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((int) getResources().getDimension(R.dimen.story_statistics_privacy_bottom_margin)) + getResources().getDimension(R.dimen.story_statistics_privacy_height)))) / f);
        return new mk50.b(R.layout.fragment_story_statistics);
    }

    @Override // xsna.ahm0
    public final StoryEntry Id() {
        StoryEntry storyEntry;
        mfm0 mfm0Var = this.l1;
        return (mfm0Var == null || (storyEntry = mfm0Var.j) == null) ? new StoryEntry() : storyEntry;
    }

    @Override // xsna.ahm0
    public final void Jf(VkButton vkButton) {
        eem0 eem0Var = this.m1;
        if (eem0Var != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            float f = 12;
            layoutParams.setMargins(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(30));
            FrameLayout frameLayout = eem0Var.c;
            frameLayout.removeAllViews();
            frameLayout.addView(vkButton, layoutParams);
        }
        View view = this.v0;
        if (view != null) {
            d3m.c(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        StoriesContainer storiesContainer;
        Bitmap currentBitmap;
        iz8 cadreSize;
        khm0 khm0Var = (khm0) ao50Var;
        Context bo = bo();
        pfm0 pfm0Var = new pfm0(bo);
        pfm0Var.setCallback(new jem0(this));
        pfm0Var.setIsGroup(((Boolean) this.r1.getValue()).booleanValue());
        uov uovVar = this.u1;
        if (uovVar != null && (cadreSize = uovVar.getCadreSize()) != null) {
            pfm0Var.setCadreSize(cadreSize);
        }
        uov uovVar2 = this.u1;
        if (uovVar2 != null && (currentBitmap = uovVar2.getCurrentBitmap()) != null) {
            pfm0Var.getPreviewCollapsible().setImageBitmap(currentBitmap);
        }
        new GestureDetector(bo, this.p1);
        getFeature().i.a(new p5e(1, this, hem0.class, "observeSideEffect", "observeSideEffect(Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsSideEffect;)V", 0, 8), this);
        StoryEntry storyEntry = this.s1.get(this.t1);
        uov uovVar3 = this.u1;
        mfm0 mfm0Var = new mfm0(view, bo, this, this, pfm0Var, storyEntry, (uovVar3 == null || (storiesContainer = uovVar3.getStoriesContainer()) == null) ? null : storiesContainer.b, this.x1, new ym1(1, this, hem0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 12));
        gm50.a.b(mfm0Var, khm0Var.a, new rzl0(mfm0Var, 2));
        gm50.a.b(mfm0Var, khm0Var.b, new b8e0(mfm0Var, 10));
        this.l1 = mfm0Var;
        this.q1 = new vfm0(view, new wrl0(this, 3));
        this.i0 = new iem0(this);
        this.c0 = new DialogInterface.OnDismissListener() { // from class: xsna.gem0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                su80 su80Var = hem0.this.w1;
                if (su80Var != null) {
                    su80Var.invoke();
                }
            }
        };
        this.b0 = new d69((byte) 0, 6);
        this.k1 = pfm0Var;
    }

    @Override // xsna.tl50
    public final void Yn(khm0 khm0Var, View view) {
        this.m1 = new eem0(view, this);
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        View inflate = LayoutInflater.from(bo()).inflate(R.layout.fragment_story_statistics_bottom, (ViewGroup) null, false);
        inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new mk50.c(inflate);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        mfm0 mfm0Var = this.l1;
        if (mfm0Var != null) {
            ihm0 b2 = mfm0Var.b(mfm0Var.g.getCurrentItem());
            Boolean valueOf = b2 != null ? Boolean.valueOf(b2.f3()) : null;
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return super.a0();
    }

    @Override // xsna.ahm0
    public final void bc() {
        List list;
        mfm0 mfm0Var = this.l1;
        if (mfm0Var != null) {
            Rect b2 = f4m.b(mfm0Var.g);
            int i = b2.bottom - b2.top;
            StoryStatisticsTab.Companion.getClass();
            list = StoryStatisticsTab.ALL_POSITIONS;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ihm0 b3 = mfm0Var.b(((Number) it.next()).intValue());
                if (b3 != null) {
                    b3.ha(i);
                }
            }
        }
    }

    public final Context bo() {
        Context requireContext = requireContext();
        lpj lpjVar = requireContext instanceof lpj ? (lpj) requireContext : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        return (valueOf != null && valueOf.intValue() == dhr0.u().c) ? requireContext : new l7s(requireContext, dhr0.u().c);
    }

    @Override // xsna.ahm0
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint getViewEntryPoint() {
        MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint;
        uov uovVar = this.u1;
        return (uovVar == null || (viewEntryPoint = uovVar.getViewEntryPoint()) == null) ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST : viewEntryPoint;
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        mfm0 mfm0Var = this.l1;
        if (mfm0Var != null) {
            mfm0Var.i.b();
        }
        this.l1 = null;
        super.onDestroyView();
    }

    @Override // xsna.ahm0
    public final void rj() {
        View view = this.v0;
        if (view != null) {
            d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        int i = this.t1;
        this.n1 = i;
        this.o1 = i;
        uov uovVar = this.u1;
        return new vem0(i, uovVar != null ? uovVar.getCurrentBitmap() : null, ((Boolean) this.r1.getValue()).booleanValue(), this.s1, (jfm0) this.i1.getValue(), this.x1, (anm0) this.j1.getValue(), getViewEntryPoint());
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        mfm0 mfm0Var = this.l1;
        if (mfm0Var != null) {
            VkSecondaryTabLayout vkSecondaryTabLayout = mfm0Var.f;
            FrameLayout frameLayout = (FrameLayout) yn.findViewById(R.id.toolbar);
            if (frameLayout != null) {
                frameLayout.setPadding(0, 0, 0, 0);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (vkSecondaryTabLayout.getLayoutDirection() == 1) {
                    layoutParams.setMarginEnd(cn70.b(16));
                } else {
                    layoutParams.setMarginStart(cn70.b(16));
                }
                s3q0 s3q0Var = s3q0.a;
                frameLayout.addView(vkSecondaryTabLayout, layoutParams);
            }
        }
        return yn;
    }
}
