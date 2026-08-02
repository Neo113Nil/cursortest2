package com.yandex.fintechsdk.core.ui.impl.api.shimmers;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.core.ui.impl.api.view.button.back.BackButtonView;
import com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivity;
import defpackage.brg0;
import defpackage.dmh0;
import defpackage.eaj0;
import defpackage.n751;
import defpackage.np31;
import defpackage.ny61;
import defpackage.ovr0;
import defpackage.tgh0;
import defpackage.u1w;
import defpackage.vno;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/yandex/fintechsdk/core/ui/impl/api/shimmers/ShimmersFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lzy11;", "initBottomBar", "Landroid/widget/LinearLayout;", "bottomBar", "applyInsetsToBottomBar", "(Landroid/widget/LinearLayout;)V", "initBackButton", "Lcom/yandex/fintechsdk/core/ui/impl/api/view/button/back/BackButtonView;", "backButton", "applyInsetsToBackButton", "(Lcom/yandex/fintechsdk/core/ui/impl/api/view/button/back/BackButtonView;)V", "initDefaultLoading", "", "isBottomSheetMode", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/yandex/fintechsdk/core/ui/impl/api/shimmers/ShimmersLayoutIdentifiers;", "getShimmersLayoutIdentifiers", "()Lcom/yandex/fintechsdk/core/ui/impl/api/shimmers/ShimmersLayoutIdentifiers;", "getShimmersLayoutIdentifiers$annotations", "shimmersLayoutIdentifiers", "getForcedNightMode", "()Ljava/lang/Boolean;", "forcedNightMode", "Companion", "ovr0", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShimmersFragment extends Fragment {
    public static final ovr0 Companion = new ovr0();
    private static final ShimmersLayoutIdentifiers DEFAULT_SHIMMERS_LAYOUT_IDS = new ShimmersLayoutIdentifiers(tgh0.finsdkBackButton, dmh0.finsdk_fragment_shimmers_default, null);
    private static final float ELEVATION = 80.0f;
    private static final long ROTATION_DURATION = 1000;
    private static final String ROTATION_NAME = "rotation";
    private static final float ROTATION_VALUE_END = 360.0f;
    private static final float ROTATION_VALUE_START = 0.0f;
    private static final int SHADOW_HEIGHT = -30;
    private static final float SHADOW_RADIUS = 70.0f;
    private static final String SHIMMERS_FRAGMENT_FORCED_NIGHT_MODE_KEY = "shimmers_fragment_forced_night_mode";
    private static final String SHIMMERS_FRAGMENT_LAYOUT_IDS_KEY = "shimmers_fragment_layout_ids";
    private static final String SHIMMERS_FRAGMENT_RESULT_ID = "shimmers_fragment_result_id";
    private static final String SHIMMERS_FRAGMENT_TAG = "shimmers_fragment_tag";

    private final void applyInsetsToBackButton(BackButtonView backButton) {
        ViewGroup.LayoutParams layoutParams = backButton.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        vno vnoVar = new vno(marginLayoutParams != null ? marginLayoutParams.topMargin : 0, 5);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(backButton, vnoVar);
        np31.c(backButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 applyInsetsToBackButton$lambda$6(int i, View view, n751 n751Var) {
        u1w g = n751Var.a.g(519);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = g.b + i;
        view.setLayoutParams(marginLayoutParams);
        return n751Var;
    }

    private final void applyInsetsToBottomBar(LinearLayout bottomBar) {
        ViewGroup.LayoutParams layoutParams = bottomBar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        vno vnoVar = new vno(marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0, 6);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(bottomBar, vnoVar);
        np31.c(bottomBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 applyInsetsToBottomBar$lambda$3(int i, View view, n751 n751Var) {
        u1w g = n751Var.a.g(519);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = g.d + i;
        view.setLayoutParams(marginLayoutParams);
        return n751Var;
    }

    private final Boolean getForcedNightMode() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!arguments.containsKey(SHIMMERS_FRAGMENT_FORCED_NIGHT_MODE_KEY)) {
                arguments = null;
            }
            if (arguments != null) {
                return Boolean.valueOf(arguments.getBoolean(SHIMMERS_FRAGMENT_FORCED_NIGHT_MODE_KEY));
            }
        }
        return null;
    }

    private final ShimmersLayoutIdentifiers getShimmersLayoutIdentifiers() {
        Object parcelable;
        ShimmersLayoutIdentifiers shimmersLayoutIdentifiers = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                parcelable = arguments.getParcelable("shimmers_fragment_layout_ids", ShimmersLayoutIdentifiers.class);
                shimmersLayoutIdentifiers = (ShimmersLayoutIdentifiers) parcelable;
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                shimmersLayoutIdentifiers = (ShimmersLayoutIdentifiers) arguments2.getParcelable(SHIMMERS_FRAGMENT_LAYOUT_IDS_KEY);
            }
        }
        return shimmersLayoutIdentifiers == null ? DEFAULT_SHIMMERS_LAYOUT_IDS : shimmersLayoutIdentifiers;
    }

    private static /* synthetic */ void getShimmersLayoutIdentifiers$annotations() {
    }

    private final void initBackButton() {
        BackButtonView backButtonView;
        View view = getView();
        if (view == null || (backButtonView = (BackButtonView) view.findViewById(getShimmersLayoutIdentifiers().getBackbuttonId())) == null) {
            return;
        }
        backButtonView.setVisibility(0);
        backButtonView.setOnClickListener(new eaj0(18, this));
        if (isBottomSheetMode()) {
            return;
        }
        applyInsetsToBackButton(backButtonView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBackButton$lambda$4(ShimmersFragment shimmersFragment, View view) {
        shimmersFragment.getParentFragmentManager().l0(new Bundle(0), SHIMMERS_FRAGMENT_RESULT_ID);
    }

    private final void initBottomBar() {
        LinearLayout linearLayout;
        Integer bottomBarId = getShimmersLayoutIdentifiers().getBottomBarId();
        if (bottomBarId != null) {
            int intValue = bottomBarId.intValue();
            View view = getView();
            if (view == null || (linearLayout = (LinearLayout) view.findViewById(intValue)) == null) {
                return;
            }
            applyInsetsToBottomBar(linearLayout);
            linearLayout.setElevation(80.0f);
            linearLayout.setOutlineSpotShadowColor(linearLayout.getResources().getColor(brg0.finsdk_border_icon, null));
            linearLayout.setOutlineAmbientShadowColor(linearLayout.getResources().getColor(brg0.finsdk_border_icon, null));
            linearLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersFragment$initBottomBar$1$1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    outline.setRoundRect(0, -30, view2.getWidth(), view2.getHeight(), 70.0f);
                }
            });
        }
    }

    private final void initDefaultLoading() {
        View findViewById;
        View view = getView();
        if (view == null || (findViewById = view.findViewById(tgh0.finsdkLoadingCircle)) == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, ROTATION_NAME, 0.0f, 360.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    private final boolean isBottomSheetMode() {
        FragmentActivity activity = getActivity();
        PaymentKitActivity paymentKitActivity = activity instanceof PaymentKitActivity ? (PaymentKitActivity) activity : null;
        if (paymentKitActivity != null) {
            return paymentKitActivity.isBottomSheetMode();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int contentId = getShimmersLayoutIdentifiers().getContentId();
        Boolean forcedNightMode = getForcedNightMode();
        if (forcedNightMode != null) {
            Context context = inflater.getContext();
            int i = forcedNightMode.booleanValue() ? 32 : 16;
            if ((context.getResources().getConfiguration().uiMode & 48) != i) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.uiMode = i | (configuration.uiMode & (-49));
                context = context.createConfigurationContext(configuration);
            }
            inflater = inflater.cloneInContext(context);
        }
        return inflater.inflate(contentId, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initBackButton();
        initBottomBar();
        if (getShimmersLayoutIdentifiers().getContentId() == DEFAULT_SHIMMERS_LAYOUT_IDS.getContentId()) {
            initDefaultLoading();
        }
    }
}
