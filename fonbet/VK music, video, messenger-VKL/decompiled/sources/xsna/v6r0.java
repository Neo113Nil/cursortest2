package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VKAdsViewDelegate.kt */
/* loaded from: classes6.dex */
public final class v6r0 implements VkUiView.BannerAd, VkUiView.b {
    public final qxv0 b;
    public final mfu0 c;
    public final ggu0 d;
    public final tdr0 e;
    public final cqr0 f;
    public ViewGroup g;
    public ViewGroup h;
    public ViewGroup i;
    public ViewGroup j;
    public ViewGroup k;
    public FrameLayout l;
    public u6r0 m;
    public final bpn0 n = new bpn0(new x1e0(this, 19));

    /* compiled from: VKAdsViewDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkUiView.BannerAd.UiData.BannerLocation.values().length];
            try {
                iArr[VkUiView.BannerAd.UiData.BannerLocation.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkUiView.BannerAd.UiData.BannerLocation.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkUiView.BannerAd.UiData.BannerAlign.values().length];
            try {
                iArr2[VkUiView.BannerAd.UiData.BannerAlign.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VkUiView.BannerAd.UiData.BannerAlign.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public v6r0(qxv0 qxv0Var, mfu0 mfu0Var, ggu0 ggu0Var, tdr0 tdr0Var, cqr0 cqr0Var) {
        this.b = qxv0Var;
        this.c = mfu0Var;
        this.d = ggu0Var;
        this.e = tdr0Var;
        this.f = cqr0Var;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final void K2() {
        qxv0 qxv0Var = this.b;
        b(qxv0Var.a());
        a();
        ViewGroup a2 = qxv0Var.a();
        if (a2 != null) {
            a2.requestLayout();
        }
        this.c.getState().d(false);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final boolean Oe() {
        List<ViewGroup> c = c();
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            if (f4m.h((ViewGroup) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [androidx.constraintlayout.widget.ConstraintLayout$b] */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r12v14, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.u6r0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.ViewTreeObserver] */
    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final void Q4(final View view, VkUiView.BannerAd.UiData uiData, final wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        ViewGroup viewGroup;
        View findViewById;
        float f;
        AccessibilityManager accessibilityManager;
        int i = -1;
        for (ViewGroup viewGroup2 : c()) {
            if (i == -1) {
                i = (viewGroup2 == null || (accessibilityManager = (AccessibilityManager) this.n.getValue()) == null || !accessibilityManager.isEnabled()) ? -1 : r1u0.a(viewGroup2);
            }
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
        }
        qxv0 qxv0Var = this.b;
        b(qxv0Var.a());
        ?? r6 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.u6r0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                View view2 = view;
                wzsVar.invoke(Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()));
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(r6);
        this.m = r6;
        view.addOnAttachStateChangeListener(new q1u0(new ape0(this, 21)));
        for (ViewGroup viewGroup3 : c()) {
            if (viewGroup3 != null) {
                f4m.j(viewGroup3);
            }
        }
        VkUiView.BannerAd.UiData.LayoutType layoutType = uiData.a;
        VkUiView.BannerAd.UiData.LayoutType layoutType2 = uiData.b;
        VkUiView.BannerAd.UiData.BannerLocation bannerLocation = uiData.c;
        VkUiView.BannerAd.UiData.BannerAlign bannerAlign = uiData.d;
        VkUiView.BannerAd.UiData.Orientation orientation = uiData.f;
        ggu0 ggu0Var = this.d;
        boolean z = ggu0Var.bh() && !(uiData.e == VkUiView.BannerAd.UiData.HeightType.COMPACT && bannerAlign == VkUiView.BannerAd.UiData.BannerAlign.UNSPECIFIED) && layoutType2 == VkUiView.BannerAd.UiData.LayoutType.OVERLAY;
        boolean z2 = ggu0Var.bh() && orientation == VkUiView.BannerAd.UiData.Orientation.VERTICAL;
        if (z) {
            FrameLayout frameLayout = this.l;
            float f2 = 0.5f;
            ?? r2 = frameLayout;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(((ggu0) this.f.c).b);
                frameLayout2.setId(R.id.vk_browser_landscape_banner_ad_container);
                f4m.j(frameLayout2);
                frameLayout2.setElevation(iah0.b(2.0f));
                frameLayout2.setClipToOutline(true);
                frameLayout2.setOutlineProvider(new t0w0(6, iah0.b(12.0f), false, false));
                ConstraintLayout.b bVar = new ConstraintLayout.b(iah0.a(320), iah0.a(60));
                int a2 = iah0.a(8);
                bVar.setMargins(a2, a2, a2, a2);
                bVar.e = 0;
                bVar.h = 0;
                bVar.i = 0;
                bVar.l = 0;
                bVar.F = 1.0f;
                bVar.E = 0.5f;
                ViewGroup a3 = qxv0Var.a();
                if (a3 != null) {
                    a3.addView(frameLayout2, bVar);
                }
                this.l = frameLayout2;
                r2 = frameLayout2;
            }
            int i2 = a.$EnumSwitchMapping$0[bannerLocation.ordinal()];
            if (i2 == 1) {
                f = 0.0f;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            }
            int i3 = a.$EnumSwitchMapping$1[bannerAlign.ordinal()];
            if (i3 == 1) {
                f2 = 0.0f;
            } else if (i3 == 2) {
                f2 = 1.0f;
            }
            ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
            ?? r12 = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : 0;
            if (r12 != 0) {
                r12.F = f;
                r12.E = f2;
            }
            if (r12 == 0) {
                r12 = r2.getLayoutParams();
            }
            r2.setLayoutParams(r12);
            viewGroup = r2;
        } else if (z2) {
            int i4 = a.$EnumSwitchMapping$1[bannerAlign.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    viewGroup = this.k;
                }
                viewGroup = null;
            } else {
                viewGroup = this.j;
            }
        } else if (bannerLocation == VkUiView.BannerAd.UiData.BannerLocation.TOP) {
            viewGroup = this.h;
        } else if (layoutType == VkUiView.BannerAd.UiData.LayoutType.RESIZE && bannerLocation == VkUiView.BannerAd.UiData.BannerLocation.BOTTOM) {
            viewGroup = this.g;
        } else {
            if (layoutType == VkUiView.BannerAd.UiData.LayoutType.OVERLAY && bannerLocation == VkUiView.BannerAd.UiData.BannerLocation.BOTTOM) {
                viewGroup = this.i;
            }
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.addView(view, -1, -1);
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (viewGroup != null && i != -1 && (findViewById = viewGroup.findViewById(i)) != null) {
            awt0.q(findViewById);
        }
        ViewGroup a4 = qxv0Var.a();
        if (a4 != null) {
            a4.requestLayout();
        }
        this.c.getState().d(true);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final boolean Y6(VkUiView.BannerAd.UiData.BannerAlign bannerAlign) {
        VkUiView.BannerAd.UiData.BannerAlign.Companion.getClass();
        VkUiView.BannerAd.UiData.BannerAlign bannerAlign2 = VkUiView.BannerAd.UiData.BannerAlign.LEFT;
        VkUiView.BannerAd.UiData.BannerAlign bannerAlign3 = VkUiView.BannerAd.UiData.BannerAlign.RIGHT;
        if (!e43.l(bannerAlign2, bannerAlign3).contains(bannerAlign)) {
            return false;
        }
        if (this.e.c().d()) {
            ViewGroup a2 = this.b.a();
            Integer valueOf = a2 != null ? Integer.valueOf(a2.getLayoutDirection()) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                if (bannerAlign != bannerAlign2) {
                    return false;
                }
            } else if (bannerAlign != bannerAlign3) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        for (ViewGroup viewGroup : c()) {
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            if (viewGroup != null) {
                f4m.j(viewGroup);
            }
        }
    }

    public final void b(View view) {
        ViewTreeObserver viewTreeObserver;
        u6r0 u6r0Var = this.m;
        if (u6r0Var != null && view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(u6r0Var);
        }
        this.m = null;
    }

    public final List<ViewGroup> c() {
        return e43.l(this.g, this.h, this.i, this.j, this.k, this.l);
    }
}
