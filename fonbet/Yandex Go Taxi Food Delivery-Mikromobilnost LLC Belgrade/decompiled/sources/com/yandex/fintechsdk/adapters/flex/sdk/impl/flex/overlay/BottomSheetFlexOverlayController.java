package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay;

import android.content.Context;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay.BottomSheetFlexOverlayController;
import com.yandex.fintechsdk.entities.ui.BottomSheetMode;
import defpackage.c190;
import defpackage.gfe;
import defpackage.hh5;
import defpackage.iib;
import defpackage.j0g;
import defpackage.j190;
import defpackage.js4;
import defpackage.kv5;
import defpackage.m6;
import defpackage.n751;
import defpackage.np31;
import defpackage.ny61;
import defpackage.pey;
import defpackage.sls;
import defpackage.tkr;
import defpackage.tls;
import defpackage.u1w;
import defpackage.wls;
import defpackage.x651;
import defpackage.xyg;
import defpackage.y651;
import defpackage.ywl;
import defpackage.zy11;
import flex.engine.a;
import flex.feature.flexoverlaycontroller.decorviewprovider.DecorViewLifecycle;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R*\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00130:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/overlay/BottomSheetFlexOverlayController;", "Ltkr;", "Lpey;", "activityLifecycleOwner", "Lxyg;", "decorViewProvider", "Lkotlin/Function0;", "Lflex/engine/a;", "engineFactory", "Lj190;", "overlayListener", "Lc190;", "overlayConfigProvider", "<init>", "(Lpey;Lxyg;Lsls;Lj190;Lc190;)V", "Landroid/view/ViewGroup;", "decorView", "", "withAnimation", "Lzy11;", "detachView", "(Landroid/view/ViewGroup;Z)V", "Ln751;", "insets", "", "topMarginPx", "createModifiedInsets", "(Ln751;I)Ln751;", "beginTransition", "(Landroid/view/ViewGroup;)V", "detachEngine", "()V", "container", "getOrCreateOverlay", "(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;", "Lywl;", "document", "showOverlay", "(Lywl;)V", "hideOverlay", "(Z)V", "Lpey;", "Lxyg;", "Lj190;", "Lc190;", "overlayView", "Landroid/view/ViewGroup;", "documentEngine", "Lflex/engine/a;", "isOverlayVisible", "Z", "Lkotlin/Function2;", "Landroid/view/View;", "insetsListener", "Lwls;", "Ljava/lang/ref/WeakReference;", "decorViewRef", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "Lflex/feature/flexoverlaycontroller/decorviewprovider/DecorViewLifecycle;", "decorViewLifecycleListener", "Ltls;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BottomSheetFlexOverlayController implements tkr {
    private static final int ADD_VIEW_AT_END_INDEX = -1;
    private static final long DEFAULT_FADE_DURATION_MS = 150;
    private final pey activityLifecycleOwner;
    private final tls decorViewLifecycleListener;
    private final xyg decorViewProvider;
    private WeakReference<ViewGroup> decorViewRef;
    private final a documentEngine;
    private wls insetsListener;
    private boolean isOverlayVisible;
    private final c190 overlayConfigProvider;
    private final j190 overlayListener;
    private ViewGroup overlayView;

    public BottomSheetFlexOverlayController(pey peyVar, xyg xygVar, sls slsVar, j190 j190Var, c190 c190Var) {
        this.activityLifecycleOwner = peyVar;
        this.decorViewProvider = xygVar;
        this.overlayListener = j190Var;
        this.overlayConfigProvider = c190Var;
        this.documentEngine = (a) slsVar.invoke();
        kv5 kv5Var = new kv5(16, this);
        this.decorViewLifecycleListener = kv5Var;
        ((j0g) xygVar).b(kv5Var);
    }

    private final void beginTransition(ViewGroup decorView) {
        TransitionManager.beginDelayedTransition(decorView, new Fade().setDuration(150L));
    }

    private final n751 createModifiedInsets(n751 insets, int topMarginPx) {
        u1w g = insets.a.g(519);
        u1w g2 = insets.a.g(16);
        x651 x651Var = new x651(insets);
        u1w c = u1w.c(g.a, topMarginPx, g.c, g.d);
        y651 y651Var = x651Var.a;
        y651Var.b(519, c);
        y651Var.b(16, u1w.c(g2.a, topMarginPx, g2.c, g2.d));
        return y651Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 decorViewLifecycleListener$lambda$0(BottomSheetFlexOverlayController bottomSheetFlexOverlayController, DecorViewLifecycle decorViewLifecycle) {
        if (decorViewLifecycle == DecorViewLifecycle.DETACH) {
            bottomSheetFlexOverlayController.hideOverlay(false);
        }
        return zy11.a;
    }

    private final void detachEngine() {
        gfe gfeVar = this.documentEngine.f0;
        if (gfeVar != null) {
            gfeVar.c();
        }
        this.documentEngine.i();
    }

    private final void detachView(ViewGroup decorView, boolean withAnimation) {
        if (withAnimation) {
            beginTransition(decorView);
            ViewGroup viewGroup = this.overlayView;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
        decorView.removeView(this.overlayView);
        detachEngine();
        this.overlayView = null;
        this.isOverlayVisible = false;
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(decorView, null);
        this.insetsListener = null;
        this.decorViewRef = null;
        xyg xygVar = this.decorViewProvider;
        tls tlsVar = this.decorViewLifecycleListener;
        j0g j0gVar = (j0g) xygVar;
        LinkedHashMap linkedHashMap = (LinkedHashMap) j0gVar.a;
        ViewGroup m = j0gVar.m();
        List list = (List) linkedHashMap.get(m != null ? Integer.valueOf(m.getId()) : null);
        if (list != null) {
            list.remove(tlsVar);
        }
    }

    private final ViewGroup getOrCreateOverlay(ViewGroup container) {
        int identifier;
        if (this.overlayView == null) {
            FrameLayout frameLayout = new FrameLayout(container.getContext());
            frameLayout.setId(View.generateViewId());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
            Context context = container.getContext();
            int identifier2 = context.getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
            int i = 0;
            marginLayoutParams.topMargin = identifier2 > 0 ? context.getResources().getDimensionPixelSize(identifier2) : 0;
            Context context2 = container.getContext();
            if (!ViewConfiguration.get(context2).hasPermanentMenuKey() && (identifier = context2.getResources().getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM)) > 0) {
                i = context2.getResources().getDimensionPixelSize(identifier);
            }
            marginLayoutParams.bottomMargin = i;
            container.addView(frameLayout, -1, marginLayoutParams);
            this.overlayView = frameLayout;
        }
        ViewGroup viewGroup = this.overlayView;
        if (viewGroup != null) {
            return viewGroup;
        }
        ny61.g("Required value was null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 showOverlay$lambda$3(BottomSheetFlexOverlayController bottomSheetFlexOverlayController, ywl ywlVar, View view, n751 n751Var) {
        iib i = ((hh5) bottomSheetFlexOverlayController.overlayConfigProvider).i();
        if (((BottomSheetMode) i.b) != BottomSheetMode.FULLSCREEN) {
            n751Var = bottomSheetFlexOverlayController.createModifiedInsets(n751Var, (int) (i.a * view.getContext().getResources().getDisplayMetrics().density));
        }
        if (!bottomSheetFlexOverlayController.isOverlayVisible) {
            bottomSheetFlexOverlayController.isOverlayVisible = true;
            ViewGroup orCreateOverlay = bottomSheetFlexOverlayController.getOrCreateOverlay((ViewGroup) view);
            j190 j190Var = bottomSheetFlexOverlayController.overlayListener;
            if (j190Var != null) {
                j190Var.onShow();
            }
            bottomSheetFlexOverlayController.documentEngine.g(orCreateOverlay, bottomSheetFlexOverlayController.activityLifecycleOwner);
            if (ywlVar != null) {
                bottomSheetFlexOverlayController.documentEngine.B(ywlVar, null);
            }
        }
        return n751Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 showOverlay$lambda$4(wls wlsVar, View view, n751 n751Var) {
        return (n751) wlsVar.invoke(view, n751Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOverlay$lambda$5(ViewGroup viewGroup) {
        WeakHashMap weakHashMap = b.a;
        np31.c(viewGroup);
    }

    @Override // defpackage.tkr
    public void hideOverlay(boolean withAnimation) {
        ViewGroup viewGroup;
        if (this.isOverlayVisible) {
            j190 j190Var = this.overlayListener;
            if (j190Var != null) {
                j190Var.onHide();
            }
            WeakReference<ViewGroup> weakReference = this.decorViewRef;
            if (weakReference == null || (viewGroup = weakReference.get()) == null) {
                return;
            }
            detachView(viewGroup, withAnimation);
        }
    }

    @Override // defpackage.tkr
    public void showOverlay(final ywl document) {
        ViewGroup m;
        if (this.isOverlayVisible || (m = ((j0g) this.decorViewProvider).m()) == null) {
            return;
        }
        this.decorViewRef = new WeakReference<>(m);
        wls wlsVar = new wls() { // from class: qf6
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                n751 showOverlay$lambda$3;
                showOverlay$lambda$3 = BottomSheetFlexOverlayController.showOverlay$lambda$3(BottomSheetFlexOverlayController.this, document, (View) obj, (n751) obj2);
                return showOverlay$lambda$3;
            }
        };
        this.insetsListener = wlsVar;
        m6 m6Var = new m6(22, wlsVar);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(m, m6Var);
        m.post(new js4(17, m));
    }
}
