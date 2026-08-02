package com.ybsdk.feature.stories.internal.screens.stories;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.stories.ChangeStoryReason;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.stories.api.StoriesScreensParams;
import com.ybsdk.feature.stories.internal.screens.stories.StoriesFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import defpackage.anp0;
import defpackage.but0;
import defpackage.ce4;
import defpackage.cjm0;
import defpackage.cvu0;
import defpackage.dcs;
import defpackage.i3y;
import defpackage.jmu0;
import defpackage.jwg0;
import defpackage.k4o;
import defpackage.kao;
import defpackage.lfx;
import defpackage.n161;
import defpackage.n751;
import defpackage.ny61;
import defpackage.p7b1;
import defpackage.pg6;
import defpackage.qas0;
import defpackage.qg6;
import defpackage.rm31;
import defpackage.rnu0;
import defpackage.snu0;
import defpackage.t661;
import defpackage.tdr;
import defpackage.tls;
import defpackage.ung0;
import defpackage.unu0;
import defpackage.vnu0;
import defpackage.vvg0;
import defpackage.w511;
import defpackage.wa8;
import defpackage.wnu0;
import defpackage.xnu0;
import defpackage.y8f;
import defpackage.ynu0;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0001@B)\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J!\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020&2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020&H\u0016¢\u0006\u0004\b3\u0010*J\u000f\u00104\u001a\u00020&H\u0016¢\u0006\u0004\b4\u0010*J\u0017\u00105\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b5\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00109R\u001d\u0010?\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/ybsdk/feature/stories/internal/screens/stories/StoriesFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Ln161;", "Lynu0;", "Lcom/ybsdk/feature/stories/internal/screens/stories/d;", "Ltdr;", "Lce4;", "Lpg6;", "Lrm31;", "videoPlayerFactory", "Lrnu0;", "storiesViewModelProvider", "Lanp0;", "sdkBottomSheetInsetsProvider", "Lqg6;", "bottomSheetShownAware", "<init>", "(Lrm31;Lrnu0;Lanp0;Lqg6;)V", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lcom/ybsdk/feature/stories/internal/screens/stories/d;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ln161;", "onBackPressed", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "()V", "onDestroyView", "viewState", "render", "(Lynu0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onBottomSheetShown", "onBottomSheetClosed", "setViewsVisibility", "Lrm31;", "Lrnu0;", "Lanp0;", "Lqg6;", "Lcom/ybsdk/feature/stories/internal/screens/stories/StoriesFragment$ProgressType;", "progressType$delegate", "Li3y;", "getProgressType", "()Lcom/ybsdk/feature/stories/internal/screens/stories/StoriesFragment$ProgressType;", "progressType", "ProgressType", "feature-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StoriesFragment extends BaseDivContextMvvmFragment<n161, ynu0, d> implements tdr, ce4, pg6 {
    private final qg6 bottomSheetShownAware;

    /* renamed from: progressType$delegate, reason: from kotlin metadata */
    private final i3y progressType;
    private final anp0 sdkBottomSheetInsetsProvider;
    private final rnu0 storiesViewModelProvider;
    private final rm31 videoPlayerFactory;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/stories/internal/screens/stories/StoriesFragment$ProgressType;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "SKEL_45", "SKEL_100", "feature-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ProgressType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ProgressType[] $VALUES;
        public static final ProgressType CIRCLE = new ProgressType("CIRCLE", 0);
        public static final ProgressType SKEL_45 = new ProgressType("SKEL_45", 1);
        public static final ProgressType SKEL_100 = new ProgressType("SKEL_100", 2);

        private static final /* synthetic */ ProgressType[] $values() {
            return new ProgressType[]{CIRCLE, SKEL_45, SKEL_100};
        }

        static {
            ProgressType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ProgressType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ProgressType valueOf(String str) {
            return (ProgressType) Enum.valueOf(ProgressType.class, str);
        }

        public static ProgressType[] values() {
            return (ProgressType[]) $VALUES.clone();
        }
    }

    public StoriesFragment(rm31 rm31Var, rnu0 rnu0Var, anp0 anp0Var, qg6 qg6Var) {
        super(Boolean.FALSE, null, null, null, d.class, 14, null);
        this.videoPlayerFactory = rm31Var;
        this.storiesViewModelProvider = rnu0Var;
        this.sdkBottomSheetInsetsProvider = anp0Var;
        this.bottomSheetShownAware = qg6Var;
        this.progressType = kotlin.a.b(LazyThreadSafetyMode.NONE, new jmu0(this, 0));
    }

    private final ProgressType getProgressType() {
        return (ProgressType) this.progressType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$10(StoriesFragment storiesFragment, String str) {
        ((d) storiesFragment.getViewModel()).o0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$11(StoriesFragment storiesFragment, String str) {
        ((d) storiesFragment.getViewModel()).f0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$12(StoriesFragment storiesFragment, int i, ChangeStoryReason changeStoryReason) {
        ((d) storiesFragment.getViewModel()).n0(i, changeStoryReason);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$17$lambda$13(StoriesFragment storiesFragment, Uri uri) {
        return ((d) storiesFragment.getViewModel()).e0(uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$14(StoriesFragment storiesFragment) {
        ((d) storiesFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$15(StoriesFragment storiesFragment) {
        ((d) storiesFragment.getViewModel()).i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$16(StoriesFragment storiesFragment) {
        ((d) storiesFragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$6(StoriesFragment storiesFragment) {
        ((d) storiesFragment.getViewModel()).k0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$7(StoriesFragment storiesFragment) {
        ((d) storiesFragment.getViewModel()).m0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$8(StoriesFragment storiesFragment) {
        ((d) storiesFragment.getViewModel()).j0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$9(StoriesFragment storiesFragment) {
        ((d) storiesFragment.getViewModel()).l0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressType progressType_delegate$lambda$1(StoriesFragment storiesFragment) {
        Object obj;
        StoriesScreensParams storiesScreensParams = (StoriesScreensParams) dcs.a(storiesFragment);
        Iterator<E> it = ProgressType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ProgressType) obj).name(), storiesScreensParams.getProgressType(), true)) {
                break;
            }
        }
        return (ProgressType) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setViewsVisibility(ynu0 viewState) {
        setBackButtonVisible(viewState.a());
        n161 n161Var = (n161) getBinding();
        ErrorView errorView = n161Var.b;
        View view = n161Var.c;
        errorView.setVisibility(viewState instanceof wnu0 ? 0 : 8);
        n161Var.f.setVisibility(viewState instanceof vnu0 ? 0 : 8);
        ProgressType progressType = getProgressType();
        int i = progressType == null ? -1 : a.a[progressType.ordinal()];
        if (i != -1 && i != 1) {
            if (i == 2) {
                view = n161Var.e.p();
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                view = n161Var.d.o();
            }
        }
        view.setVisibility(viewState instanceof xnu0 ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof snu0) {
            ((n161) getBinding()).f.setNextStory(ChangeStoryReason.STORIES_NEXT_DEEPLINK, ((snu0) sideEffect).a());
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public d getFactoryOfViewModel() {
        return ((unu0) this.storiesViewModelProvider).a((StoriesScreensParams) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        n161 n161Var = (n161) getBinding();
        int i = p7b1.f(insets).b;
        int i2 = p7b1.f(insets).d;
        ((d) getViewModel()).p0(i, i2);
        ErrorView errorView = n161Var.b;
        t661 t661Var = n161Var.d;
        errorView.setPadding(errorView.getPaddingLeft(), i, errorView.getPaddingRight(), com.ybsdk.core.utils.ext.view.b.h(vvg0.ybsdk_screen_footer_space_error_view, n161Var.o()) + i2);
        SkeletonView skeletonView = (SkeletonView) n161Var.e.c;
        ViewGroup.LayoutParams layoutParams = skeletonView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, com.ybsdk.core.utils.ext.view.b.h(jwg0.ybsdk_stories_shimmer_button_margin_bottom, n161Var.o()) + i2);
        skeletonView.setLayoutParams(marginLayoutParams);
        SkeletonView skeletonView2 = t661Var.d;
        ViewGroup.LayoutParams layoutParams2 = skeletonView2.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, com.ybsdk.core.utils.ext.view.b.h(jwg0.ybsdk_stories_shimmer_100_title_margin_top, n161Var.o()) + i, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        skeletonView2.setLayoutParams(marginLayoutParams2);
        SkeletonView skeletonView3 = t661Var.c;
        ViewGroup.LayoutParams layoutParams3 = skeletonView3.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, com.ybsdk.core.utils.ext.view.b.h(jwg0.ybsdk_stories_shimmer_button_margin_bottom, n161Var.o()) + i2);
        skeletonView3.setLayoutParams(marginLayoutParams3);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((d) getViewModel()).g0();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pg6
    public void onBottomSheetClosed() {
        ((n161) getBinding()).f.onResume();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pg6
    public void onBottomSheetShown() {
        ((n161) getBinding()).f.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.bottomSheetShownAware.b(this);
        ((n161) getBinding()).f.onDestroy();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        ((n161) getBinding()).f.onStop();
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ((n161) getBinding()).f.setVideoPlayerFactory(this.videoPlayerFactory);
        super.onViewCreated(view, savedInstanceState);
        setStatusBarColorModel(new z1x0(new ColorModel.Attr(ung0.ybColor_internal_transparent)));
        setNavigationBarColorModel(new z1x0(new ColorModel.Attr(ung0.ybColor_internal_transparent)));
        n161 n161Var = (n161) getBinding();
        n161Var.b.setPrimaryButtonOnClickListener(new jmu0(this, 3));
        ErrorView errorView = n161Var.b;
        errorView.setSecondaryButtonClickListener(new jmu0(this, 5));
        StoriesComponentView storiesComponentView = n161Var.f;
        storiesComponentView.setPrimaryButtonClickListener(new jmu0(this, 6));
        storiesComponentView.setSecondaryButtonClickListener(new jmu0(this, 7));
        final int i = 0;
        storiesComponentView.setOnLinkClickListener(new tls(this) { // from class: kmu0
            public final /* synthetic */ StoriesFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 onViewCreated$lambda$17$lambda$10;
                zy11 onViewCreated$lambda$17$lambda$11;
                boolean onViewCreated$lambda$17$lambda$13;
                int i2 = i;
                StoriesFragment storiesFragment = this.b;
                switch (i2) {
                    case 0:
                        onViewCreated$lambda$17$lambda$10 = StoriesFragment.onViewCreated$lambda$17$lambda$10(storiesFragment, (String) obj);
                        return onViewCreated$lambda$17$lambda$10;
                    case 1:
                        onViewCreated$lambda$17$lambda$11 = StoriesFragment.onViewCreated$lambda$17$lambda$11(storiesFragment, (String) obj);
                        return onViewCreated$lambda$17$lambda$11;
                    default:
                        onViewCreated$lambda$17$lambda$13 = StoriesFragment.onViewCreated$lambda$17$lambda$13(storiesFragment, (Uri) obj);
                        return Boolean.valueOf(onViewCreated$lambda$17$lambda$13);
                }
            }
        });
        final int i2 = 1;
        storiesComponentView.setOnAdLabelClickListener(new tls(this) { // from class: kmu0
            public final /* synthetic */ StoriesFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 onViewCreated$lambda$17$lambda$10;
                zy11 onViewCreated$lambda$17$lambda$11;
                boolean onViewCreated$lambda$17$lambda$13;
                int i22 = i2;
                StoriesFragment storiesFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$17$lambda$10 = StoriesFragment.onViewCreated$lambda$17$lambda$10(storiesFragment, (String) obj);
                        return onViewCreated$lambda$17$lambda$10;
                    case 1:
                        onViewCreated$lambda$17$lambda$11 = StoriesFragment.onViewCreated$lambda$17$lambda$11(storiesFragment, (String) obj);
                        return onViewCreated$lambda$17$lambda$11;
                    default:
                        onViewCreated$lambda$17$lambda$13 = StoriesFragment.onViewCreated$lambda$17$lambda$13(storiesFragment, (Uri) obj);
                        return Boolean.valueOf(onViewCreated$lambda$17$lambda$13);
                }
            }
        });
        final int i3 = 2;
        storiesComponentView.setChangedStoryListener(new but0(i3, this));
        storiesComponentView.setDivkitActionHandler(new tls(this) { // from class: kmu0
            public final /* synthetic */ StoriesFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 onViewCreated$lambda$17$lambda$10;
                zy11 onViewCreated$lambda$17$lambda$11;
                boolean onViewCreated$lambda$17$lambda$13;
                int i22 = i3;
                StoriesFragment storiesFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$17$lambda$10 = StoriesFragment.onViewCreated$lambda$17$lambda$10(storiesFragment, (String) obj);
                        return onViewCreated$lambda$17$lambda$10;
                    case 1:
                        onViewCreated$lambda$17$lambda$11 = StoriesFragment.onViewCreated$lambda$17$lambda$11(storiesFragment, (String) obj);
                        return onViewCreated$lambda$17$lambda$11;
                    default:
                        onViewCreated$lambda$17$lambda$13 = StoriesFragment.onViewCreated$lambda$17$lambda$13(storiesFragment, (Uri) obj);
                        return Boolean.valueOf(onViewCreated$lambda$17$lambda$13);
                }
            }
        });
        storiesComponentView.setCloseButtonClickListener(new jmu0(this, i2));
        storiesComponentView.setOnLastStoryFinish(new jmu0(this, i3));
        errorView.setCloseButtonClickListener(new jmu0(this, 4));
        if (!isNewInsetsHandlingEnabled() && getCustomHandlingInsetsBehaviourProvider().isShownAsSlidableView()) {
            ((d) getViewModel()).p0(((cjm0) this.sdkBottomSheetInsetsProvider).b(), 0);
        }
        this.bottomSheetShownAware.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ynu0 viewState) {
        if (viewState instanceof vnu0) {
            vnu0 vnu0Var = (vnu0) viewState;
            ((n161) getBinding()).f.render(vnu0Var.c());
            setSdkBackground(new wa8(vnu0Var.b().get(requireContext())));
        } else if (!viewState.equals(xnu0.a)) {
            if (!(viewState instanceof wnu0)) {
                w511.b();
                return;
            } else {
                kao b = ((wnu0) viewState).b();
                if (b != null) {
                    ((n161) getBinding()).b.render(b);
                }
            }
        }
        setViewsVisibility(viewState);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public n161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return n161.p(inflater, container);
    }
}
