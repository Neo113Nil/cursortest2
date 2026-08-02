package com.ybsdk.feature.stories.internal.screens.verticalstories;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.j;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.stories.api.VerticalStoriesScreenParams;
import com.ybsdk.feature.stories.internal.screens.verticalstories.VerticalStoriesFragment;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.ah31;
import defpackage.dcs;
import defpackage.dvb;
import defpackage.eg01;
import defpackage.i3y;
import defpackage.j8p;
import defpackage.jwg0;
import defpackage.k751;
import defpackage.kao;
import defpackage.kw00;
import defpackage.lfx;
import defpackage.n751;
import defpackage.ny61;
import defpackage.o161;
import defpackage.pg31;
import defpackage.pg6;
import defpackage.qas0;
import defpackage.qg6;
import defpackage.rg31;
import defpackage.rm31;
import defpackage.sg31;
import defpackage.tg31;
import defpackage.tqd;
import defpackage.ug31;
import defpackage.ung0;
import defpackage.w511;
import defpackage.wg31;
import defpackage.wmu0;
import defpackage.xg31;
import defpackage.y8f;
import defpackage.yg31;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zg31;
import defpackage.zy11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004*\u0001H\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010 J!\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0003H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u0010J\u000f\u0010=\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010\u0010J\u000f\u0010>\u001a\u00020\u000eH\u0016¢\u0006\u0004\b>\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/ybsdk/feature/stories/internal/screens/verticalstories/VerticalStoriesFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lo161;", "Lah31;", "Lcom/ybsdk/feature/stories/internal/screens/verticalstories/c;", "Lpg6;", "Lrm31;", "videoPlayerFactory", "Lsg31;", "verticalStoriesViewModelProvider", "Lqg6;", "bottomSheetShownAware", "<init>", "(Lrm31;Lsg31;Lqg6;)V", "Lzy11;", "setupPager", "()V", "Lcom/ybsdk/core/utils/ColorModel;", "colorModel", "setCloseIconColor", "(Lcom/ybsdk/core/utils/ColorModel;)V", "", "Lwmu0;", "storiesPageStates", "updatePagerData", "(Ljava/util/List;)V", "resumeCurrentStory", "pauseCurrentStory", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lcom/ybsdk/feature/stories/internal/screens/verticalstories/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lo161;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "viewState", "render", "(Lah31;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onDestroyView", "onBottomSheetShown", "onBottomSheetClosed", "Lrm31;", "Lsg31;", "Lqg6;", "Ldvb;", "storiesPagerAdapter$delegate", "Li3y;", "getStoriesPagerAdapter", "()Ldvb;", "storiesPagerAdapter", "rg31", "storyChangedCallback", "Lrg31;", "feature-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerticalStoriesFragment extends BaseDivContextMvvmFragment<o161, ah31, c> implements pg6 {
    private final qg6 bottomSheetShownAware;

    /* renamed from: storiesPagerAdapter$delegate, reason: from kotlin metadata */
    private final i3y storiesPagerAdapter;
    private final rg31 storyChangedCallback;
    private final sg31 verticalStoriesViewModelProvider;
    private final rm31 videoPlayerFactory;

    public VerticalStoriesFragment(rm31 rm31Var, sg31 sg31Var, qg6 qg6Var) {
        super(Boolean.FALSE, 3, null, null, c.class, 12, null);
        this.videoPlayerFactory = rm31Var;
        this.verticalStoriesViewModelProvider = sg31Var;
        this.bottomSheetShownAware = qg6Var;
        this.storiesPagerAdapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new pg31(this, 0));
        this.storyChangedCallback = new rg31(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ c access$getViewModel(VerticalStoriesFragment verticalStoriesFragment) {
        return (c) verticalStoriesFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dvb getStoriesPagerAdapter() {
        return (dvb) this.storiesPagerAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$5$lambda$1(VerticalStoriesFragment verticalStoriesFragment, View view) {
        ((c) verticalStoriesFragment.getViewModel()).g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$5$lambda$2(VerticalStoriesFragment verticalStoriesFragment) {
        ((c) verticalStoriesFragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$5$lambda$3(VerticalStoriesFragment verticalStoriesFragment) {
        ((c) verticalStoriesFragment.getViewModel()).i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$5$lambda$4(VerticalStoriesFragment verticalStoriesFragment, View view) {
        ((c) verticalStoriesFragment.getViewModel()).g0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pauseCurrentStory() {
        dvb storiesPagerAdapter = getStoriesPagerAdapter();
        ViewPager2 viewPager2 = ((o161) getBinding()).e;
        int b = ((b) ((c) getViewModel()).X()).b();
        storiesPagerAdapter.getClass();
        dvb.g(viewPager2, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void resumeCurrentStory() {
        dvb storiesPagerAdapter = getStoriesPagerAdapter();
        ViewPager2 viewPager2 = ((o161) getBinding()).e;
        int b = ((b) ((c) getViewModel()).X()).b();
        storiesPagerAdapter.getClass();
        dvb.h(viewPager2, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCloseIconColor(ColorModel colorModel) {
        com.ybsdk.core.utils.ext.view.b.z(((o161) getBinding()).b, colorModel.get(requireContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupPager() {
        ViewPager2 viewPager2 = ((o161) getBinding()).e;
        j.a(viewPager2);
        viewPager2.setAdapter(getStoriesPagerAdapter());
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.registerOnPageChangeCallback(this.storyChangedCallback);
        tqd tqdVar = new tqd();
        tqdVar.a(new kw00(com.ybsdk.core.utils.ext.view.b.h(jwg0.ybsdk_next_story_preview_height, viewPager2), 1));
        tqdVar.a(new j8p());
        viewPager2.setPageTransformer(tqdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dvb storiesPagerAdapter_delegate$lambda$0(VerticalStoriesFragment verticalStoriesFragment) {
        return new dvb(new eg01(verticalStoriesFragment), verticalStoriesFragment.videoPlayerFactory);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updatePagerData(List<wmu0> storiesPageStates) {
        boolean z = getStoriesPagerAdapter().getItemCount() == 0;
        getStoriesPagerAdapter().j(storiesPageStates);
        if (!z || storiesPageStates.isEmpty()) {
            return;
        }
        ((o161) getBinding()).e.setCurrentItem(getStoriesPagerAdapter().f(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof ug31) {
            ((o161) getBinding()).e.setCurrentItem(r1.getCurrentItem() - 1);
        } else if (!(sideEffect instanceof tg31)) {
            super.consumeSideEffect(sideEffect);
        } else {
            ViewPager2 viewPager2 = ((o161) getBinding()).e;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c getFactoryOfViewModel() {
        return ((wg31) this.verticalStoriesViewModelProvider).a((VerticalStoriesScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        getStoriesPagerAdapter().i(insets);
        o161 o161Var = (o161) getBinding();
        ConstraintLayout o = o161Var.o();
        ErrorView errorView = o161Var.c;
        int h = com.ybsdk.core.utils.ext.view.b.h(jwg0.ybsdk_top_buttons_margin_top, o);
        k751 k751Var = insets.a;
        int i = k751Var.h(519).b;
        int i2 = k751Var.h(519).d;
        ((c) getViewModel()).k0(i, com.ybsdk.core.utils.ext.view.b.h(jwg0.ybsdk_bottom_buttons_margin_bottom, o161Var.o()));
        CloseButtonView closeButtonView = o161Var.b;
        ViewGroup.LayoutParams layoutParams = closeButtonView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = h + i;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i3, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        closeButtonView.setLayoutParams(marginLayoutParams);
        errorView.setPadding(errorView.getPaddingLeft(), errorView.getPaddingTop() + i, errorView.getPaddingRight(), errorView.getPaddingBottom() + i2);
        ImageView imageView = (ImageView) o161Var.d.b;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, i3, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        imageView.setLayoutParams(marginLayoutParams2);
        return insets;
    }

    @Override // defpackage.pg6
    public void onBottomSheetClosed() {
        resumeCurrentStory();
    }

    @Override // defpackage.pg6
    public void onBottomSheetShown() {
        pauseCurrentStory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        ((c) getViewModel()).b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.bottomSheetShownAware.b(this);
        o161 o161Var = (o161) getBinding();
        o161Var.e.unregisterOnPageChangeCallback(this.storyChangedCallback);
        o161Var.e.setAdapter(null);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((c) getViewModel()).j0();
        setStatusBarColorModel(new z1x0(new ColorModel.Attr(ung0.ybColor_internal_transparent)));
        setNavigationBarColorModel(new z1x0(new ColorModel.Attr(ung0.ybColor_internal_transparent)));
        o161 o161Var = (o161) getBinding();
        final int i = 0;
        o161Var.b.setOnClickListener(new View.OnClickListener(this) { // from class: qg31
            public final /* synthetic */ VerticalStoriesFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                VerticalStoriesFragment verticalStoriesFragment = this.b;
                switch (i2) {
                    case 0:
                        VerticalStoriesFragment.onViewCreated$lambda$5$lambda$1(verticalStoriesFragment, view2);
                        break;
                    default:
                        VerticalStoriesFragment.onViewCreated$lambda$5$lambda$4(verticalStoriesFragment, view2);
                        break;
                }
            }
        });
        ErrorView errorView = o161Var.c;
        final int i2 = 1;
        errorView.setPrimaryButtonOnClickListener(new pg31(this, i2));
        errorView.setSecondaryButtonClickListener(new pg31(this, 2));
        ((ImageView) o161Var.d.b).setOnClickListener(new View.OnClickListener(this) { // from class: qg31
            public final /* synthetic */ VerticalStoriesFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                VerticalStoriesFragment verticalStoriesFragment = this.b;
                switch (i22) {
                    case 0:
                        VerticalStoriesFragment.onViewCreated$lambda$5$lambda$1(verticalStoriesFragment, view2);
                        break;
                    default:
                        VerticalStoriesFragment.onViewCreated$lambda$5$lambda$4(verticalStoriesFragment, view2);
                        break;
                }
            }
        });
        setupPager();
        this.bottomSheetShownAware.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ah31 viewState) {
        boolean z = viewState instanceof xg31;
        if (z) {
            xg31 xg31Var = (xg31) viewState;
            updatePagerData(xg31Var.b());
            ColorModel a = xg31Var.a();
            if (a == null) {
                a = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
            }
            setCloseIconColor(a);
        } else if (!(viewState instanceof zg31)) {
            if (!(viewState instanceof yg31)) {
                w511.b();
                return;
            }
            kao a2 = ((yg31) viewState).a();
            if (a2 != null) {
                ((o161) getBinding()).c.render(a2);
            }
            setCloseIconColor(new ColorModel.Attr(ung0.ybColor_textIcon_primary));
        }
        o161 o161Var = (o161) getBinding();
        o161Var.e.setVisibility(z ? 0 : 8);
        o161Var.d.r().setVisibility(viewState instanceof zg31 ? 0 : 8);
        o161Var.c.setVisibility(viewState instanceof yg31 ? 0 : 8);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public o161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return o161.p(inflater, container);
    }
}
