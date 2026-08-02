package com.yandex.go.safety.center.main;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$SafetyCenterNavigationSource;
import com.yandex.go.safety.center.base.BaseSafetyCenterView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.main.SafetyCenterMainMvpView;
import com.yandex.go.zone.model.Zone;
import defpackage.ajl0;
import defpackage.amp0;
import defpackage.as21;
import defpackage.atl0;
import defpackage.bdc;
import defpackage.bqc;
import defpackage.btl0;
import defpackage.c21;
import defpackage.chr0;
import defpackage.clh;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.dtl0;
import defpackage.f1h0;
import defpackage.gvz0;
import defpackage.hrl0;
import defpackage.hxj0;
import defpackage.hxx;
import defpackage.i7h0;
import defpackage.itl0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.kyh0;
import defpackage.lpu0;
import defpackage.m7x0;
import defpackage.mr31;
import defpackage.nac;
import defpackage.npu0;
import defpackage.o8g0;
import defpackage.o8k0;
import defpackage.oep0;
import defpackage.ohk0;
import defpackage.pav;
import defpackage.pep0;
import defpackage.pnu0;
import defpackage.pph0;
import defpackage.ppl0;
import defpackage.q3h0;
import defpackage.q5z;
import defpackage.qnu0;
import defpackage.qr31;
import defpackage.rp31;
import defpackage.rpu0;
import defpackage.sy60;
import defpackage.tai0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tjh0;
import defpackage.tlu0;
import defpackage.tpu0;
import defpackage.tse0;
import defpackage.vfc0;
import defpackage.vjr0;
import defpackage.w511;
import defpackage.wpc;
import defpackage.x3;
import defpackage.xng0;
import defpackage.xsl0;
import defpackage.yn5;
import defpackage.yvf0;
import defpackage.z0l0;
import defpackage.zsl0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.stories.data.StoriesState;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListView;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListViewType;
import ru.yandex.taxi.widget.FlowLayout;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001^Bc\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010#\u001a\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u001c*\u00020%2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\u001c2\f\u00105\u001a\b\u0012\u0004\u0012\u0002040 H\u0016¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001cH\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u001c2\u0006\u00109\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010AR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010BR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R0\u0010`\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020^0]j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020^`_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020b0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u0002018TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bh\u00103¨\u0006j"}, d2 = {"Lcom/yandex/go/safety/center/main/SafetyCenterMainView;", "Lcom/yandex/go/safety/center/base/BaseSafetyCenterView;", "Lcom/yandex/go/safety/center/main/SafetyCenterMainMvpView;", "Landroid/content/Context;", "context", "Lcom/yandex/go/safety/center/main/a;", "presenter", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "experiment", "Lqnu0;", "storiesUiHolderFactory", "Lyvf0;", "Lru/yandex/taxi/communications/stories/domain/a;", "storyRouterProvider", "Loep0;", "screenStackNavigator", "Lgvz0;", "tooltipPlacementRepository", "Ltlu0;", "storiesComponent", "Lpav;", "imageLoader", "Lk7x0;", "iconTagUrlFormatter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/safety/center/main/a;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;Lqnu0;Lyvf0;Loep0;Lgvz0;Ltlu0;Lpav;Lk7x0;)V", "", "isVisible", "Lzy11;", "addShakeToggleTopDivider", "(Z)V", "addShakeToggleBottomDivider", "", "Lrpu0;", "storiesPreview", "isNeedOverdrawStories", "(Ljava/util/List;)Z", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$ButtonType;", "type", "setDisabledStateAccessibility", "(Lru/yandex/taxi/widget/buttons/IconCircleButton;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$ButtonType;)V", "Landroid/widget/FrameLayout;", "tooltipContainer", "clearTooltip", "(Landroid/widget/FrameLayout;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "", "getTopPadding", "()I", "Lru/yandex/taxi/communications/api/dto/Story;", "stories", "setStories", "(Ljava/util/List;)V", "Lcom/yandex/go/safety/center/main/SafetyCenterMainMvpView$ButtonState;", ClidProvider.STATE, "setButtonState", "(Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$ButtonType;Lcom/yandex/go/safety/center/main/SafetyCenterMainMvpView$ButtonState;)V", "showShareDisabledTooltip", "()V", "Lchr0;", "setShakeToggleEnabled", "(Lchr0;)V", "Lcom/yandex/go/safety/center/main/a;", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "Lyvf0;", "Loep0;", "Lgvz0;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "title", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/widget/FlowLayout;", "buttonsContainer", "Lru/yandex/taxi/widget/FlowLayout;", "Landroid/view/ViewGroup;", "storiesContainer", "Landroid/view/ViewGroup;", "storiesLoading", "Landroid/view/View;", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "shakeToggle", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "Landroid/widget/LinearLayout;", "shakeToggleContentLayout", "Landroid/widget/LinearLayout;", "Lpnu0;", "storiesUiHolder", "Lpnu0;", "Ljava/util/HashMap;", "Ldtl0;", "Lkotlin/collections/HashMap;", "buttons", "Ljava/util/HashMap;", "", "currentStoryIds", "Ljava/util/List;", "Lqr31;", "viewGroupBubbleContainer", "Lqr31;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterMainView extends BaseSafetyCenterView implements SafetyCenterMainMvpView {
    private final HashMap<SafetyCenterExperiment.ButtonType, dtl0> buttons;
    private final FlowLayout buttonsContainer;
    private List<String> currentStoryIds;
    private final SafetyCenterExperiment experiment;
    private final a presenter;
    private final oep0 screenStackNavigator;
    private final ListItemSwitchComponent shakeToggle;
    private final LinearLayout shakeToggleContentLayout;
    private final ViewGroup storiesContainer;
    private final View storiesLoading;
    private final pnu0 storiesUiHolder;
    private final yvf0 storyRouterProvider;
    private final ListItemComponent title;
    private final ToolbarComponent toolbar;
    private final gvz0 tooltipPlacementRepository;
    private qr31 viewGroupBubbleContainer;

    public SafetyCenterMainView(Context context, a aVar, SafetyCenterExperiment safetyCenterExperiment, qnu0 qnu0Var, yvf0 yvf0Var, oep0 oep0Var, gvz0 gvz0Var, tlu0 tlu0Var, pav pavVar, k7x0 k7x0Var) {
        super(context, aVar);
        int i;
        this.presenter = aVar;
        this.experiment = safetyCenterExperiment;
        this.storyRouterProvider = yvf0Var;
        this.screenStackNavigator = oep0Var;
        this.tooltipPlacementRepository = gvz0Var;
        int i2 = i7h0.safety_center_toolbar;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.toolbar = (ToolbarComponent) ((View) rp31.d(this, i2));
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, i7h0.safety_center_title));
        this.title = listItemComponent;
        FlowLayout flowLayout = (FlowLayout) ((View) rp31.d(this, i7h0.safety_center_buttons));
        this.buttonsContainer = flowLayout;
        this.storiesContainer = (ViewGroup) ((View) rp31.d(this, i7h0.stories_container));
        this.storiesLoading = (View) rp31.d(this, i7h0.stories_loading);
        this.shakeToggle = (ListItemSwitchComponent) ((View) rp31.d(this, i7h0.safety_center_shake_toggle));
        this.shakeToggleContentLayout = (LinearLayout) ((View) rp31.d(this, i7h0.shake_content_layout));
        this.buttons = new HashMap<>();
        this.currentStoryIds = EmptyList.a;
        listItemComponent.setTitleAlignment(0);
        listItemComponent.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.MAIN_SCREEN_TITLE));
        androidx.core.view.b.q(listItemComponent, true);
        List<SafetyCenterExperiment.SafetyCenterButton> list = safetyCenterExperiment.n;
        if (list.size() < 4) {
            flowLayout.setMaxColumns(3);
        }
        for (SafetyCenterExperiment.SafetyCenterButton safetyCenterButton : list) {
            SafetyCenterExperiment.ButtonType buttonType = safetyCenterButton.a;
            String str = safetyCenterButton.b;
            if (buttonType != null) {
                ru.yandex.taxi.design.utils.c.q(this.buttonsContainer, tjh0.safety_center_main_button, true);
                FlowLayout flowLayout2 = this.buttonsContainer;
                dtl0 dtl0Var = new dtl0(flowLayout2.getChildAt(flowLayout2.getChildCount() - 1));
                SafetyCenterExperiment.ButtonType buttonType2 = safetyCenterButton.a;
                this.buttons.put(buttonType2, dtl0Var);
                String a = this.experiment.a(buttonType2.getTitleKey());
                IconCircleButton iconCircleButton = dtl0Var.a;
                iconCircleButton.setTitle(a);
                iconCircleButton.setIconTintEnable(false);
                this.presenter.getClass();
                int i3 = xsl0.a[buttonType2.ordinal()];
                if (i3 == 1) {
                    i = q3h0.ic_contacts_32;
                } else if (i3 == 2) {
                    i = q3h0.ic_headphones_32;
                } else if (i3 == 3) {
                    i = f1h0.order_share;
                } else {
                    if (i3 != 4) {
                        w511.b();
                        throw null;
                    }
                    i = q3h0.ic_emergency;
                }
                if (str == null || str.length() == 0) {
                    iconCircleButton.getIcon().setImageResource(i);
                } else {
                    nac nacVar = (nac) pavVar.a(iconCircleButton.getIcon());
                    nacVar.h = new ohk0(18, iconCircleButton);
                    nacVar.e(i);
                    nacVar.c(((m7x0) k7x0Var).a(str));
                }
                iconCircleButton.setDebounceClickListener(new ajl0(6, this, buttonType2));
            }
        }
        this.toolbar.setOnNavigationClickListener(new hxj0(17, this));
        addShakeToggleTopDivider(!this.experiment.n.isEmpty());
        int i4 = pph0.taxi_communications_story_landscape_preview;
        StoriesPreviewsListViewType storiesPreviewsListViewType = StoriesPreviewsListViewType.GRID_TWO_COLUMN;
        ((clh) qnu0Var).getClass();
        amp0 amp0Var = new amp0(this, tlu0Var, i4, storiesPreviewsListViewType);
        this.storiesUiHolder = amp0Var;
        amp0Var.P(StoriesState.AT_TOP);
        StoriesPreviewsListView storiesPreviewsListView = (StoriesPreviewsListView) amp0Var.b;
        if (storiesPreviewsListView != null) {
            storiesPreviewsListView.setUiDelegate(new vfc0(23, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SafetyCenterMainView safetyCenterMainView) {
        safetyCenterMainView.presenter.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(SafetyCenterMainView safetyCenterMainView, List list, String str) {
        ((pep0) safetyCenterMainView.screenStackNavigator).f(new yn5(9, (ru.yandex.taxi.communications.stories.domain.a) safetyCenterMainView.storyRouterProvider.get(), new SafetyCenterMainView$3$1(0, safetyCenterMainView, SafetyCenterMainView.class, "requestFocus", "requestFocus()Z", 8)), new npu0((x3) new lpu0(list, str), "safety_center", (Float) null, false, HProv.PP_SAME_MEDIA), hxx.a);
    }

    private final void addShakeToggleBottomDivider(boolean isVisible) {
        int childCount = this.shakeToggleContentLayout.getChildCount() - 1;
        LinearLayout linearLayout = this.shakeToggleContentLayout;
        if (isVisible) {
            View childAt = linearLayout.getChildAt(childCount);
            if ((childAt instanceof CardDivider ? (CardDivider) childAt : null) == null) {
                this.shakeToggleContentLayout.addView(new CardDivider(getContext(), null, 0, 6, null));
                return;
            }
            return;
        }
        View childAt2 = linearLayout.getChildAt(childCount);
        if ((childAt2 instanceof CardDivider ? (CardDivider) childAt2 : null) != null) {
            this.shakeToggleContentLayout.removeViewAt(childCount);
        }
    }

    private final void addShakeToggleTopDivider(boolean isVisible) {
        LinearLayout linearLayout = this.shakeToggleContentLayout;
        if (isVisible) {
            View childAt = linearLayout.getChildAt(0);
            if ((childAt instanceof CardDivider ? (CardDivider) childAt : null) == null) {
                this.shakeToggleContentLayout.addView(new CardDivider(getContext(), null, 0, 6, null), 0);
                return;
            }
            return;
        }
        View childAt2 = linearLayout.getChildAt(0);
        if ((childAt2 instanceof CardDivider ? (CardDivider) childAt2 : null) != null) {
            this.shakeToggleContentLayout.removeViewAt(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearTooltip(FrameLayout tooltipContainer) {
        qr31 qr31Var = this.viewGroupBubbleContainer;
        if (qr31Var != null) {
            if (qr31Var != null) {
                qr31Var.a();
            }
            this.viewGroupBubbleContainer = null;
            tooltipContainer.setVisibility(8);
        }
    }

    private final boolean isNeedOverdrawStories(List<rpu0> storiesPreview) {
        List<rpu0> list = storiesPreview;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rpu0) it.next()).a);
        }
        if (jl40.l(this.currentStoryIds, arrayList)) {
            return false;
        }
        this.currentStoryIds = arrayList;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$0$0(IconCircleButton iconCircleButton, Drawable drawable) {
        iconCircleButton.setIconPadding(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$1(SafetyCenterMainView safetyCenterMainView, SafetyCenterExperiment.ButtonType buttonType) {
        String str;
        a aVar = safetyCenterMainView.presenter;
        SafetyCenterExperiment safetyCenterExperiment = aVar.y;
        o8g0 o8g0Var = aVar.G;
        int i = xsl0.a[buttonType.ordinal()];
        zy11 zy11Var = zy11.a;
        int i2 = 2;
        String str2 = null;
        if (i == 1) {
            Zone g = aVar.D.g();
            String str3 = g != null ? g.B : null;
            if (str3 != null && str3.length() != 0) {
                str2 = str3;
            }
            if (str2 != null) {
                str = cvu0.v(cvu0.v(safetyCenterExperiment.k.a, "$LANGUAGE$", aVar.E.b(), false), "$COUNTRY$", str2, false);
            } else {
                str = "";
            }
            if (str.length() > 0) {
                btl0 btl0Var = (btl0) o8g0Var.b;
                btl0Var.A(btl0Var.O, new wpc(bqc.c, i2), new zsl0(btl0Var, str, o8g0Var));
            } else {
                btl0 btl0Var2 = (btl0) o8g0Var.b;
                btl0Var2.A(btl0Var2.M.a(new hrl0()), zy11Var, new atl0());
            }
            com.yandex.go.safety.center.analytics.a aVar2 = aVar.H;
            SafetyCenterParams$Source safetyCenterParams$Source = aVar.A.a;
            ppl0 ppl0Var = aVar2.a;
            SafetyCenterAnalytics$SafetyCenterNavigationSource h = com.yandex.go.safety.center.analytics.a.h(safetyCenterParams$Source);
            HashMap o = tse0.o(ppl0Var);
            o.put("source", h.getEventValue());
            ppl0Var.a.a("SafetyCenter.EmergencySituationButton.Tapped", o, 1, new HashMap());
            return;
        }
        if (i == 2) {
            tje.N(aVar.Jg(), null, null, new SafetyCenterMainPresenter$onButtonClick$1(aVar, null), 3);
            return;
        }
        c21 c21Var = sy60.Q2;
        if (i != 3) {
            if (i != 4) {
                w511.b();
                return;
            } else {
                btl0 btl0Var3 = (btl0) o8g0Var.b;
                btl0Var3.A(btl0Var3.J.a(new hrl0()), (itl0) o8g0Var.a, c21Var);
                return;
            }
        }
        as21 as21Var = aVar.z;
        j jVar = aVar.x;
        String str4 = jVar.d.b;
        if (str4 == null || str4.length() == 0) {
            ((SafetyCenterMainMvpView) aVar.Dg()).showShareDisabledTooltip();
            return;
        }
        int b = as21.b(as21Var, "SAFETY_CENTER_SHARE_CALL_COUNT");
        as21Var.f(b + 1, "SAFETY_CENTER_SHARE_CALL_COUNT");
        if (!jVar.f().isEmpty()) {
            btl0 btl0Var4 = (btl0) o8g0Var.b;
            btl0Var4.A(btl0Var4.L.a(new hrl0()), zy11Var, c21Var);
        } else {
            if (b % safetyCenterExperiment.m == 0) {
                ((btl0) o8g0Var.b).r(new z0l0(20));
                return;
            }
            String e = jVar.e();
            if (e != null) {
                vjr0 vjr0Var = jVar.h;
                int i3 = kyh0.bottom_sheet_share_route;
                Activity activity = vjr0Var.a;
                q5z.c0(e, activity.getString(i3), activity, 0);
            }
        }
    }

    private final void setDisabledStateAccessibility(IconCircleButton iconCircleButton, SafetyCenterExperiment.ButtonType buttonType) {
        if (buttonType == SafetyCenterExperiment.ButtonType.SHARE_ROUTE) {
            iconCircleButton.setEnabled(!tje.J(iconCircleButton.getContext()));
            String a = this.experiment.a(buttonType.getTitleKey());
            SafetyCenterExperiment safetyCenterExperiment = this.experiment;
            iconCircleButton.setContentDescription(j73.L(new String[]{a, d6z.Y(safetyCenterExperiment, safetyCenterExperiment.o)}, Extension.FIX_SPACE, null, null, 62));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setShakeToggleEnabled$lambda$0$0(SafetyCenterMainView safetyCenterMainView, chr0 chr0Var, View view) {
        a aVar = safetyCenterMainView.presenter;
        tje.N(aVar.Jg(), null, null, new SafetyCenterMainPresenter$setShakeState$1(aVar, !chr0Var.b, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showShareDisabledTooltip$lambda$1(SafetyCenterMainView safetyCenterMainView, FrameLayout frameLayout) {
        safetyCenterMainView.clearTooltip(frameLayout);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        int i = i7h0.root;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        return (View) rp31.d(this, i);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return tjh0.safety_center_main_view;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return tje.u(76, getContext());
    }

    @Override // com.yandex.go.safety.center.main.SafetyCenterMainMvpView
    public void setButtonState(SafetyCenterExperiment.ButtonType type, SafetyCenterMainMvpView.ButtonState state) {
        dtl0 dtl0Var = this.buttons.get(type);
        if (dtl0Var == null) {
            return;
        }
        IconCircleButton iconCircleButton = dtl0Var.a;
        ViewAnimator viewAnimator = dtl0Var.b;
        int i = b.a[state.ordinal()];
        if (i == 1) {
            viewAnimator.setDisplayedChild(0);
            viewAnimator.setVisibility(0);
            iconCircleButton.setTitle(this.experiment.a(type.getTitleKey()));
            iconCircleButton.setAlpha(1.0f);
            return;
        }
        if (i == 2) {
            viewAnimator.setVisibility(8);
            this.buttonsContainer.setMaxColumns(3);
            iconCircleButton.setAlpha(1.0f);
        } else if (i == 3) {
            viewAnimator.setVisibility(0);
            viewAnimator.setDisplayedChild(1);
            iconCircleButton.setAlpha(1.0f);
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            viewAnimator.setVisibility(0);
            viewAnimator.setDisplayedChild(0);
            iconCircleButton.setTitle(this.experiment.a(type.getTitleKey()));
            iconCircleButton.setAlpha(0.5f);
            setDisabledStateAccessibility(iconCircleButton, type);
        }
    }

    @Override // com.yandex.go.safety.center.main.SafetyCenterMainMvpView
    public void setShakeToggleEnabled(chr0 state) {
        boolean z = state.a;
        LinearLayout linearLayout = this.shakeToggleContentLayout;
        if (!z) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ListItemSwitchComponent listItemSwitchComponent = this.shakeToggle;
        listItemSwitchComponent.setChecked(state.b);
        listItemSwitchComponent.setTitle(state.c);
        listItemSwitchComponent.setSubtitle(state.d);
        listItemSwitchComponent.setLeadImage(f1h0.ic_shake_phone_24);
        listItemSwitchComponent.setOnClickListener(new tai0(4, this, state));
    }

    @Override // com.yandex.go.safety.center.main.SafetyCenterMainMvpView
    public void setStories(List<Story> stories) {
        addShakeToggleBottomDivider(!stories.isEmpty());
        boolean isEmpty = stories.isEmpty();
        ViewGroup viewGroup = this.storiesContainer;
        if (isEmpty) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        List<Story> list = stories;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tpu0.a((Story) it.next()));
        }
        if (isNeedOverdrawStories(arrayList)) {
            amp0 amp0Var = (amp0) this.storiesUiHolder;
            ((StoriesPreviewsListView) amp0Var.b).setStories(arrayList);
            if (arrayList.isEmpty()) {
                ViewGroup viewGroup2 = (ViewGroup) amp0Var.a;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
            } else {
                amp0Var.P((StoriesState) amp0Var.c);
            }
            cma1.L(this.storiesLoading);
        }
    }

    @Override // com.yandex.go.safety.center.main.SafetyCenterMainMvpView
    public void showShareDisabledTooltip() {
        dtl0 dtl0Var = this.buttons.get(SafetyCenterExperiment.ButtonType.SHARE_ROUTE);
        if (dtl0Var == null) {
            return;
        }
        SafetyCenterExperiment safetyCenterExperiment = this.experiment;
        String Y = d6z.Y(safetyCenterExperiment, safetyCenterExperiment.o);
        if (Y.length() == 0) {
            return;
        }
        int i = i7h0.tooltip_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        FrameLayout frameLayout = (FrameLayout) ((View) rp31.d(this, i));
        clearTooltip(frameLayout);
        frameLayout.setOnClickListener(new tai0(5, this, frameLayout));
        this.viewGroupBubbleContainer = new qr31(frameLayout, this.tooltipPlacementRepository);
        frameLayout.setVisibility(0);
        qr31 qr31Var = this.viewGroupBubbleContainer;
        if (qr31Var != null) {
            qr31Var.f = new o8k0(16, this, frameLayout);
        }
        mr31 mr31Var = new mr31(Y, "safety_center_share_route_tooltip", true, 100, 0, new bdc(xng0.bgInvert), null, null, 8096);
        qr31 qr31Var2 = this.viewGroupBubbleContainer;
        if (qr31Var2 != null) {
            qr31Var2.d(dtl0Var.a, mr31Var, null);
        }
    }
}
