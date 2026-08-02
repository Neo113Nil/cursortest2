package com.yandex.urbanads.internal.navigation;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.urbanads.internal.flex.UrbanAdsTheme;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bvf0;
import defpackage.dle;
import defpackage.eja1;
import defpackage.hf21;
import defpackage.i3y;
import defpackage.ivg;
import defpackage.je4;
import defpackage.leh0;
import defpackage.o751;
import defpackage.p751;
import defpackage.pey;
import defpackage.q751;
import defpackage.rzo;
import defpackage.sls;
import defpackage.t601;
import defpackage.tje;
import defpackage.ue21;
import defpackage.va90;
import defpackage.ve21;
import defpackage.w511;
import defpackage.we21;
import defpackage.wx11;
import defpackage.yta1;
import defpackage.yvf0;
import defpackage.zy11;
import flex.feature.document.fragment.DocumentBottomSheetFragment;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0003R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%¨\u0006-"}, d2 = {"Lcom/yandex/urbanads/internal/navigation/UrbanAdsBottomSheetFragment;", "Lflex/feature/document/fragment/DocumentBottomSheetFragment;", "<init>", "()V", "Landroid/view/View;", "view", "Lzy11;", "applyRoundedCorners", "(Landroid/view/View;)V", "Landroid/content/DialogInterface;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getBottomSheetBehavior", "(Landroid/content/DialogInterface;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "rootView", "setupGrabberInRootView", "(Landroid/widget/FrameLayout;)V", "Landroid/view/Window;", "Lcom/yandex/urbanads/internal/flex/UrbanAdsTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "", "updateStatusBarBackgroundColor", "updateNavigationBarBackgroundColor", "updateSystemBars", "(Landroid/view/Window;Lcom/yandex/urbanads/internal/flex/UrbanAdsTheme;ZZ)V", "Lflex/engine/a;", "createDocumentEngine", "()Lflex/engine/a;", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Li3y;", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Li3y;", "", UrbanAdsBottomSheetFragment.THEME_ID, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, UrbanAdsBottomSheetFragment.SHOW_GRABBER, UrbanAdsBottomSheetFragment.CALLBACKS_ID, "Companion", "ve21", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UrbanAdsBottomSheetFragment extends DocumentBottomSheetFragment {
    public static final String BACKGROUND_COLOR = "backgroundColor";
    public static final String CALLBACKS_ID = "callbacksId";
    public static final String CORNER_RADIUS = "cornerRadius";
    public static final String SHOW_GRABBER = "showGrabber";
    public static final String THEME_ID = "themeId";
    private final i3y backgroundColor;
    private final i3y callbacksId;
    private final i3y cornerRadius;
    private final i3y showGrabber;
    private final i3y themeId;
    public static final ve21 Companion = new ve21();
    private static final ConcurrentHashMap<String, ue21> callbacksStorage = new ConcurrentHashMap<>();

    public UrbanAdsBottomSheetFragment() {
        final int i = 0;
        this.cornerRadius = a.a(new sls(this) { // from class: te21
            public final /* synthetic */ UrbanAdsBottomSheetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int cornerRadius$lambda$0;
                String themeId$lambda$1;
                int backgroundColor$lambda$2;
                boolean showGrabber$lambda$3;
                String callbacksId$lambda$4;
                int i2 = i;
                UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment = this.b;
                switch (i2) {
                    case 0:
                        cornerRadius$lambda$0 = UrbanAdsBottomSheetFragment.cornerRadius$lambda$0(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(cornerRadius$lambda$0);
                    case 1:
                        themeId$lambda$1 = UrbanAdsBottomSheetFragment.themeId$lambda$1(urbanAdsBottomSheetFragment);
                        return themeId$lambda$1;
                    case 2:
                        backgroundColor$lambda$2 = UrbanAdsBottomSheetFragment.backgroundColor$lambda$2(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(backgroundColor$lambda$2);
                    case 3:
                        showGrabber$lambda$3 = UrbanAdsBottomSheetFragment.showGrabber$lambda$3(urbanAdsBottomSheetFragment);
                        return Boolean.valueOf(showGrabber$lambda$3);
                    default:
                        callbacksId$lambda$4 = UrbanAdsBottomSheetFragment.callbacksId$lambda$4(urbanAdsBottomSheetFragment);
                        return callbacksId$lambda$4;
                }
            }
        });
        final int i2 = 1;
        this.themeId = a.a(new sls(this) { // from class: te21
            public final /* synthetic */ UrbanAdsBottomSheetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int cornerRadius$lambda$0;
                String themeId$lambda$1;
                int backgroundColor$lambda$2;
                boolean showGrabber$lambda$3;
                String callbacksId$lambda$4;
                int i22 = i2;
                UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment = this.b;
                switch (i22) {
                    case 0:
                        cornerRadius$lambda$0 = UrbanAdsBottomSheetFragment.cornerRadius$lambda$0(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(cornerRadius$lambda$0);
                    case 1:
                        themeId$lambda$1 = UrbanAdsBottomSheetFragment.themeId$lambda$1(urbanAdsBottomSheetFragment);
                        return themeId$lambda$1;
                    case 2:
                        backgroundColor$lambda$2 = UrbanAdsBottomSheetFragment.backgroundColor$lambda$2(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(backgroundColor$lambda$2);
                    case 3:
                        showGrabber$lambda$3 = UrbanAdsBottomSheetFragment.showGrabber$lambda$3(urbanAdsBottomSheetFragment);
                        return Boolean.valueOf(showGrabber$lambda$3);
                    default:
                        callbacksId$lambda$4 = UrbanAdsBottomSheetFragment.callbacksId$lambda$4(urbanAdsBottomSheetFragment);
                        return callbacksId$lambda$4;
                }
            }
        });
        final int i3 = 2;
        this.backgroundColor = a.a(new sls(this) { // from class: te21
            public final /* synthetic */ UrbanAdsBottomSheetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int cornerRadius$lambda$0;
                String themeId$lambda$1;
                int backgroundColor$lambda$2;
                boolean showGrabber$lambda$3;
                String callbacksId$lambda$4;
                int i22 = i3;
                UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment = this.b;
                switch (i22) {
                    case 0:
                        cornerRadius$lambda$0 = UrbanAdsBottomSheetFragment.cornerRadius$lambda$0(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(cornerRadius$lambda$0);
                    case 1:
                        themeId$lambda$1 = UrbanAdsBottomSheetFragment.themeId$lambda$1(urbanAdsBottomSheetFragment);
                        return themeId$lambda$1;
                    case 2:
                        backgroundColor$lambda$2 = UrbanAdsBottomSheetFragment.backgroundColor$lambda$2(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(backgroundColor$lambda$2);
                    case 3:
                        showGrabber$lambda$3 = UrbanAdsBottomSheetFragment.showGrabber$lambda$3(urbanAdsBottomSheetFragment);
                        return Boolean.valueOf(showGrabber$lambda$3);
                    default:
                        callbacksId$lambda$4 = UrbanAdsBottomSheetFragment.callbacksId$lambda$4(urbanAdsBottomSheetFragment);
                        return callbacksId$lambda$4;
                }
            }
        });
        final int i4 = 3;
        this.showGrabber = a.a(new sls(this) { // from class: te21
            public final /* synthetic */ UrbanAdsBottomSheetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int cornerRadius$lambda$0;
                String themeId$lambda$1;
                int backgroundColor$lambda$2;
                boolean showGrabber$lambda$3;
                String callbacksId$lambda$4;
                int i22 = i4;
                UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment = this.b;
                switch (i22) {
                    case 0:
                        cornerRadius$lambda$0 = UrbanAdsBottomSheetFragment.cornerRadius$lambda$0(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(cornerRadius$lambda$0);
                    case 1:
                        themeId$lambda$1 = UrbanAdsBottomSheetFragment.themeId$lambda$1(urbanAdsBottomSheetFragment);
                        return themeId$lambda$1;
                    case 2:
                        backgroundColor$lambda$2 = UrbanAdsBottomSheetFragment.backgroundColor$lambda$2(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(backgroundColor$lambda$2);
                    case 3:
                        showGrabber$lambda$3 = UrbanAdsBottomSheetFragment.showGrabber$lambda$3(urbanAdsBottomSheetFragment);
                        return Boolean.valueOf(showGrabber$lambda$3);
                    default:
                        callbacksId$lambda$4 = UrbanAdsBottomSheetFragment.callbacksId$lambda$4(urbanAdsBottomSheetFragment);
                        return callbacksId$lambda$4;
                }
            }
        });
        final int i5 = 4;
        this.callbacksId = a.a(new sls(this) { // from class: te21
            public final /* synthetic */ UrbanAdsBottomSheetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int cornerRadius$lambda$0;
                String themeId$lambda$1;
                int backgroundColor$lambda$2;
                boolean showGrabber$lambda$3;
                String callbacksId$lambda$4;
                int i22 = i5;
                UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment = this.b;
                switch (i22) {
                    case 0:
                        cornerRadius$lambda$0 = UrbanAdsBottomSheetFragment.cornerRadius$lambda$0(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(cornerRadius$lambda$0);
                    case 1:
                        themeId$lambda$1 = UrbanAdsBottomSheetFragment.themeId$lambda$1(urbanAdsBottomSheetFragment);
                        return themeId$lambda$1;
                    case 2:
                        backgroundColor$lambda$2 = UrbanAdsBottomSheetFragment.backgroundColor$lambda$2(urbanAdsBottomSheetFragment);
                        return Integer.valueOf(backgroundColor$lambda$2);
                    case 3:
                        showGrabber$lambda$3 = UrbanAdsBottomSheetFragment.showGrabber$lambda$3(urbanAdsBottomSheetFragment);
                        return Boolean.valueOf(showGrabber$lambda$3);
                    default:
                        callbacksId$lambda$4 = UrbanAdsBottomSheetFragment.callbacksId$lambda$4(urbanAdsBottomSheetFragment);
                        return callbacksId$lambda$4;
                }
            }
        });
    }

    private final void applyRoundedCorners(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment$applyRoundedCorners$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                i3y i3yVar;
                i3yVar = UrbanAdsBottomSheetFragment.this.cornerRadius;
                float f = rzo.r(((Number) i3yVar.getValue()).intValue()).c;
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight() + ((int) f), f);
            }
        });
        view.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundColor$lambda$2(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment) {
        Bundle arguments = urbanAdsBottomSheetFragment.getArguments();
        if (arguments != null) {
            return arguments.getInt(BACKGROUND_COLOR, 0);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String callbacksId$lambda$4(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment) {
        Bundle arguments = urbanAdsBottomSheetFragment.getArguments();
        if (arguments != null) {
            return arguments.getString(CALLBACKS_ID);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cornerRadius$lambda$0(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment) {
        Bundle arguments = urbanAdsBottomSheetFragment.getArguments();
        if (arguments != null) {
            return arguments.getInt(CORNER_RADIUS, 0);
        }
        return 0;
    }

    private final BottomSheetBehavior<View> getBottomSheetBehavior(DialogInterface dialog) {
        View findViewById = ((BottomSheetDialog) dialog).findViewById(leh0.design_bottom_sheet);
        if (findViewById != null) {
            return BottomSheetBehavior.D(findViewById);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment, View view) {
        urbanAdsBottomSheetFragment.setupGrabberInRootView((FrameLayout) view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment, DialogInterface dialogInterface) {
        sls slsVar;
        BottomSheetBehavior<View> bottomSheetBehavior;
        if (urbanAdsBottomSheetFragment.isFullscreen() && (bottomSheetBehavior = urbanAdsBottomSheetFragment.getBottomSheetBehavior(dialogInterface)) != null) {
            bottomSheetBehavior.W(3);
        }
        String str = (String) urbanAdsBottomSheetFragment.callbacksId.getValue();
        if (str != null) {
            Companion.getClass();
            ue21 ue21Var = (ue21) callbacksStorage.get(str);
            if (ue21Var == null || (slsVar = ue21Var.a) == null) {
                return;
            }
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$8(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment, pey peyVar) {
        tje.N(eja1.s(peyVar), null, null, new UrbanAdsBottomSheetFragment$onViewCreated$3$1(peyVar, urbanAdsBottomSheetFragment, null), 3);
        return zy11.a;
    }

    private final void setupGrabberInRootView(FrameLayout rootView) {
        View view = new View(rootView.getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(((Number) this.backgroundColor.getValue()).intValue());
        gradientDrawable.setCornerRadius(rzo.r(4.0f).c);
        view.setBackground(gradientDrawable);
        int i = rzo.r(48.0f).w;
        int i2 = rzo.r(4.0f).w;
        int i3 = rzo.r(12.0f).w;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = i3;
        view.setLayoutParams(layoutParams);
        view.setElevation(4.0f);
        rootView.addView(view);
        rootView.bringChildToFront(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showGrabber$lambda$3(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment) {
        Bundle arguments = urbanAdsBottomSheetFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean(SHOW_GRABBER, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String themeId$lambda$1(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment) {
        Bundle arguments = urbanAdsBottomSheetFragment.getArguments();
        if (arguments != null) {
            return arguments.getString(THEME_ID);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSystemBars(Window window, UrbanAdsTheme urbanAdsTheme, boolean z, boolean z2) {
        va90 va90Var = new va90(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
        int intValue = ((Number) this.backgroundColor.getValue()).intValue();
        if (z) {
            window.setStatusBarColor(intValue);
        }
        if (z2) {
            window.setNavigationBarColor(intValue);
        }
        int i2 = we21.a[urbanAdsTheme.ordinal()];
        if (i2 == 1) {
            q751Var.U(true);
            q751Var.T(true);
        } else if (i2 != 2) {
            w511.b();
        } else {
            q751Var.U(false);
            q751Var.T(false);
        }
    }

    public static /* synthetic */ void updateSystemBars$default(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment, Window window, UrbanAdsTheme urbanAdsTheme, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        urbanAdsBottomSheetFragment.updateSystemBars(window, urbanAdsTheme, z, z2);
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment
    public flex.engine.a createDocumentEngine() {
        Bundle arguments = getArguments();
        LinkedHashMap linkedHashMap = hf21.a;
        String string = arguments != null ? arguments.getString("urbanads_engine_label") : null;
        yvf0 yvf0Var = string != null ? (yvf0) hf21.a.get(string) : null;
        if (yvf0Var != null) {
            return (flex.engine.a) yvf0Var.get();
        }
        return null;
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(je4 je4Var) {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        sls slsVar;
        String str = (String) this.callbacksId.getValue();
        if (str != null) {
            Companion.getClass();
            ue21 ue21Var = (ue21) callbacksStorage.get(str);
            if (ue21Var != null && (slsVar = ue21Var.b) != null) {
                slsVar.invoke();
            }
            callbacksStorage.remove(str);
        }
        super.onDestroy();
        if (yta1.b(this)) {
            Bundle arguments = getArguments();
            LinkedHashMap linkedHashMap = hf21.a;
            String string = arguments != null ? arguments.getString("urbanads_engine_label") : null;
            if (string != null) {
            }
        }
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (((Boolean) this.showGrabber.getValue()).booleanValue() && (view instanceof FrameLayout)) {
            view.post(new t601(17, this, (FrameLayout) view));
        }
        applyRoundedCorners(view);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new ivg(this, 2));
        }
        getViewLifecycleOwnerLiveData().f(this, new dle(5, new wx11(10, this)));
    }
}
