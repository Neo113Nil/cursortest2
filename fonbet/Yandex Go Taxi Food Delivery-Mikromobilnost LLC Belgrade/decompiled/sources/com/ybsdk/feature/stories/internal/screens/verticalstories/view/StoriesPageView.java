package com.ybsdk.feature.stories.internal.screens.verticalstories.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.PromoStoriesEvents$PromoStoriesStoryScreenBigButtonClickType;
import com.ybsdk.core.analytics.generated.delegates.PromoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen;
import com.ybsdk.core.stories.ChangeStoryReason;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.stories.internal.domain.VerticalStoriesAnalyticsInteractor$RefererScreenState;
import com.ybsdk.feature.stories.internal.screens.verticalstories.VerticalStoriesFragment;
import com.ybsdk.feature.stories.internal.screens.verticalstories.b;
import com.ybsdk.feature.stories.internal.screens.verticalstories.c;
import com.ybsdk.feature.stories.internal.screens.verticalstories.view.StoriesPageView;
import defpackage.aqg0;
import defpackage.but0;
import defpackage.cma1;
import defpackage.dzh0;
import defpackage.eg01;
import defpackage.g8e;
import defpackage.gob1;
import defpackage.joh0;
import defpackage.kcz0;
import defpackage.lia1;
import defpackage.n751;
import defpackage.ng31;
import defpackage.ny61;
import defpackage.oe1;
import defpackage.pz40;
import defpackage.rm31;
import defpackage.rmu0;
import defpackage.rt1;
import defpackage.sls;
import defpackage.tg31;
import defpackage.tls;
import defpackage.ug31;
import defpackage.vg31;
import defpackage.vmu0;
import defpackage.vou0;
import defpackage.vz6;
import defpackage.w511;
import defpackage.wa61;
import defpackage.wmu0;
import defpackage.x4e;
import defpackage.xmu0;
import defpackage.ybh0;
import defpackage.zy11;
import defpackage.zz6;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'¨\u0006("}, d2 = {"Lcom/ybsdk/feature/stories/internal/screens/verticalstories/view/StoriesPageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "Ln751;", "windowInsets", "setInsets", "(Ln751;)V", "Lrmu0;", "storiesPageCallbacks", "setCallbacks", "(Lrmu0;)V", "Lrm31;", "videoPlayerFactory", "setVideoPlayerFactory", "(Lrm31;)V", "Lwmu0;", ClidProvider.STATE, "render", "(Lwmu0;)V", "resumeStory", "pauseStory", "onRecycled", "Lwa61;", "binding", "Lwa61;", "Lrmu0;", "Lcom/ybsdk/feature/stories/internal/screens/verticalstories/view/PagePreviewType;", "pagePreviewType", "Lcom/ybsdk/feature/stories/internal/screens/verticalstories/view/PagePreviewType;", "Ln751;", "feature-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoriesPageView extends ConstraintLayout {
    private final wa61 binding;
    private PagePreviewType pagePreviewType;
    private rmu0 storiesPageCallbacks;
    private n751 windowInsets;

    public StoriesPageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        LayoutInflater.from(context).inflate(joh0.ybsdk_view_stories_page, this);
        int i2 = ybh0.cardView;
        CardView cardView = (CardView) cma1.O(i2, this);
        if (cardView != null && (O = cma1.O((i2 = ybh0.pagePreview), this)) != null) {
            i2 = ybh0.storiesView;
            StoriesComponentView storiesComponentView = (StoriesComponentView) cma1.O(i2, this);
            if (storiesComponentView != null) {
                this.binding = new wa61(this, cardView, O, storiesComponentView);
                this.pagePreviewType = PagePreviewType.CURRENT;
                setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                final int i3 = 0;
                storiesComponentView.setPrimaryButtonClickListener(new sls(this) { // from class: tmu0
                    public final /* synthetic */ StoriesPageView b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        zy11 lambda$7$lambda$0;
                        zy11 lambda$7$lambda$1;
                        int i4 = i3;
                        StoriesPageView storiesPageView = this.b;
                        switch (i4) {
                            case 0:
                                lambda$7$lambda$0 = StoriesPageView.lambda$7$lambda$0(storiesPageView);
                                return lambda$7$lambda$0;
                            default:
                                lambda$7$lambda$1 = StoriesPageView.lambda$7$lambda$1(storiesPageView);
                                return lambda$7$lambda$1;
                        }
                    }
                });
                final int i4 = 1;
                storiesComponentView.setSecondaryButtonClickListener(new sls(this) { // from class: tmu0
                    public final /* synthetic */ StoriesPageView b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        zy11 lambda$7$lambda$0;
                        zy11 lambda$7$lambda$1;
                        int i42 = i4;
                        StoriesPageView storiesPageView = this.b;
                        switch (i42) {
                            case 0:
                                lambda$7$lambda$0 = StoriesPageView.lambda$7$lambda$0(storiesPageView);
                                return lambda$7$lambda$0;
                            default:
                                lambda$7$lambda$1 = StoriesPageView.lambda$7$lambda$1(storiesPageView);
                                return lambda$7$lambda$1;
                        }
                    }
                });
                storiesComponentView.setOnLinkClickListener(new tls(this) { // from class: umu0
                    public final /* synthetic */ StoriesPageView b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        zy11 lambda$7$lambda$2;
                        boolean lambda$7$lambda$4;
                        zy11 lambda$7$lambda$5;
                        int i5 = i3;
                        StoriesPageView storiesPageView = this.b;
                        switch (i5) {
                            case 0:
                                lambda$7$lambda$2 = StoriesPageView.lambda$7$lambda$2(storiesPageView, (String) obj);
                                return lambda$7$lambda$2;
                            case 1:
                                lambda$7$lambda$4 = StoriesPageView.lambda$7$lambda$4(storiesPageView, (Uri) obj);
                                return Boolean.valueOf(lambda$7$lambda$4);
                            default:
                                lambda$7$lambda$5 = StoriesPageView.lambda$7$lambda$5(storiesPageView, (String) obj);
                                return lambda$7$lambda$5;
                        }
                    }
                });
                storiesComponentView.setChangedStoryListener(new but0(3, this));
                storiesComponentView.setDivkitActionHandler(new tls(this) { // from class: umu0
                    public final /* synthetic */ StoriesPageView b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        zy11 lambda$7$lambda$2;
                        boolean lambda$7$lambda$4;
                        zy11 lambda$7$lambda$5;
                        int i5 = i4;
                        StoriesPageView storiesPageView = this.b;
                        switch (i5) {
                            case 0:
                                lambda$7$lambda$2 = StoriesPageView.lambda$7$lambda$2(storiesPageView, (String) obj);
                                return lambda$7$lambda$2;
                            case 1:
                                lambda$7$lambda$4 = StoriesPageView.lambda$7$lambda$4(storiesPageView, (Uri) obj);
                                return Boolean.valueOf(lambda$7$lambda$4);
                            default:
                                lambda$7$lambda$5 = StoriesPageView.lambda$7$lambda$5(storiesPageView, (String) obj);
                                return lambda$7$lambda$5;
                        }
                    }
                });
                final int i5 = 2;
                storiesComponentView.setOnAdLabelClickListener(new tls(this) { // from class: umu0
                    public final /* synthetic */ StoriesPageView b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        zy11 lambda$7$lambda$2;
                        boolean lambda$7$lambda$4;
                        zy11 lambda$7$lambda$5;
                        int i52 = i5;
                        StoriesPageView storiesPageView = this.b;
                        switch (i52) {
                            case 0:
                                lambda$7$lambda$2 = StoriesPageView.lambda$7$lambda$2(storiesPageView, (String) obj);
                                return lambda$7$lambda$2;
                            case 1:
                                lambda$7$lambda$4 = StoriesPageView.lambda$7$lambda$4(storiesPageView, (Uri) obj);
                                return Boolean.valueOf(lambda$7$lambda$4);
                            default:
                                lambda$7$lambda$5 = StoriesPageView.lambda$7$lambda$5(storiesPageView, (String) obj);
                                return lambda$7$lambda$5;
                        }
                    }
                });
                O.setOnClickListener(new vmu0(i3, this));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$7$lambda$0(StoriesPageView storiesPageView) {
        c access$getViewModel;
        vou0 c0;
        zz6 zz6Var;
        rmu0 rmu0Var = storiesPageView.storiesPageCallbacks;
        if (rmu0Var != null && (c0 = (access$getViewModel = VerticalStoriesFragment.access$getViewModel((VerticalStoriesFragment) ((eg01) rmu0Var).a)).c0()) != null && (zz6Var = c0.j) != null) {
            String str = zz6Var.a.c;
            kcz0 kcz0Var = access$getViewModel.G;
            String d0 = access$getViewModel.d0(((b) access$getViewModel.X()).b);
            if (d0 == null) {
                d0 = "";
            }
            kcz0Var.s(d0, ((b) access$getViewModel.X()).e, PromoStoriesEvents$PromoStoriesStoryScreenBigButtonClickType.MAIN, str);
            access$getViewModel.e0(str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$7$lambda$1(StoriesPageView storiesPageView) {
        c access$getViewModel;
        vou0 c0;
        zz6 zz6Var;
        vz6 vz6Var;
        rmu0 rmu0Var = storiesPageView.storiesPageCallbacks;
        if (rmu0Var != null && (c0 = (access$getViewModel = VerticalStoriesFragment.access$getViewModel((VerticalStoriesFragment) ((eg01) rmu0Var).a)).c0()) != null && (zz6Var = c0.j) != null && (vz6Var = zz6Var.b) != null) {
            String str = vz6Var.c;
            kcz0 kcz0Var = access$getViewModel.G;
            String d0 = access$getViewModel.d0(((b) access$getViewModel.X()).b);
            if (d0 == null) {
                d0 = "";
            }
            kcz0Var.s(d0, ((b) access$getViewModel.X()).e, PromoStoriesEvents$PromoStoriesStoryScreenBigButtonClickType.MINOR, str);
            access$getViewModel.e0(str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$7$lambda$2(StoriesPageView storiesPageView, String str) {
        rmu0 rmu0Var = storiesPageView.storiesPageCallbacks;
        if (rmu0Var != null) {
            c access$getViewModel = VerticalStoriesFragment.access$getViewModel((VerticalStoriesFragment) ((eg01) rmu0Var).a);
            kcz0 kcz0Var = access$getViewModel.G;
            String d0 = access$getViewModel.d0(((b) access$getViewModel.X()).b);
            if (d0 == null) {
                d0 = "";
            }
            int i = ((b) access$getViewModel.X()).e;
            rt1 rt1Var = ((AppAnalyticsReporter) kcz0Var.a).U;
            LinkedHashMap w = g8e.w(3, "story_id", d0);
            w.put("page_index", Integer.valueOf(i + 1));
            w.put("url", str);
            rt1Var.a.a("promo_stories.story_screen.agreement.click", w);
            access$getViewModel.e0(str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$7$lambda$3(StoriesPageView storiesPageView, int i, ChangeStoryReason changeStoryReason) {
        oe1 oe1Var;
        String str;
        rmu0 rmu0Var = storiesPageView.storiesPageCallbacks;
        if (rmu0Var != null) {
            c access$getViewModel = VerticalStoriesFragment.access$getViewModel((VerticalStoriesFragment) ((eg01) rmu0Var).a);
            kcz0 kcz0Var = access$getViewModel.G;
            String d0 = access$getViewModel.d0(((b) access$getViewModel.X()).b);
            if (d0 == null) {
                d0 = "";
            }
            VerticalStoriesAnalyticsInteractor$RefererScreenState verticalStoriesAnalyticsInteractor$RefererScreenState = (VerticalStoriesAnalyticsInteractor$RefererScreenState) kcz0Var.b;
            AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) kcz0Var.a;
            int i2 = ng31.a[verticalStoriesAnalyticsInteractor$RefererScreenState.ordinal()];
            PromoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen promoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen = null;
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    promoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen = PromoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen.PRODUCTS_SCREEN;
                } else if (i2 == 4) {
                    promoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen = PromoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen.STORY_SCREEN;
                } else {
                    if (i2 != 5) {
                        w511.b();
                        return null;
                    }
                    promoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen = PromoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen.GOAL_SCREEN;
                }
            }
            if (promoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen != null) {
                rt1 rt1Var = appAnalyticsReporter.U;
                LinkedHashMap w = g8e.w(3, "story_id", d0);
                w.put("page_index", Integer.valueOf(i + 1));
                w.put("referer_screen", promoStoriesEvents$PromoStoriesStoryScreenShownRefererScreen.getOriginalValue());
                rt1Var.a.a("promo_stories.story_screen.shown", w);
            }
            kcz0Var.b = VerticalStoriesAnalyticsInteractor$RefererScreenState.STORY_SELECTED;
            vou0 c0 = access$getViewModel.c0();
            if (c0 != null && (oe1Var = c0.n) != null && (str = oe1Var.a) != null) {
                String str2 = c0.c;
                appAnalyticsReporter.x.a.a("erid_badge.shown", x4e.t(2, "view_id", str2, "text", str));
            }
            pz40 Y = access$getViewModel.Y();
            while (true) {
                r0 r0Var = (r0) Y;
                Object value = r0Var.getValue();
                int i3 = i;
                if (r0Var.k(value, b.a((b) value, null, 0, 0, 0, i3, null, 47))) {
                    break;
                }
                i = i3;
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$7$lambda$4(StoriesPageView storiesPageView, Uri uri) {
        rmu0 rmu0Var = storiesPageView.storiesPageCallbacks;
        if (rmu0Var != null) {
            return VerticalStoriesFragment.access$getViewModel((VerticalStoriesFragment) ((eg01) rmu0Var).a).e0(uri.toString());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$7$lambda$5(StoriesPageView storiesPageView, String str) {
        oe1 oe1Var;
        String str2;
        rmu0 rmu0Var = storiesPageView.storiesPageCallbacks;
        if (rmu0Var != null) {
            c access$getViewModel = VerticalStoriesFragment.access$getViewModel((VerticalStoriesFragment) ((eg01) rmu0Var).a);
            vou0 c0 = access$getViewModel.c0();
            if (c0 != null && (oe1Var = c0.n) != null && (str2 = oe1Var.a) != null) {
                kcz0 kcz0Var = access$getViewModel.G;
                String str3 = c0.c;
                ((AppAnalyticsReporter) kcz0Var.a).x.a.a("erid_badge.click", x4e.t(2, "view_id", str3, "text", str2));
            }
            access$getViewModel.e0(str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$7$lambda$6(StoriesPageView storiesPageView, View view) {
        rmu0 rmu0Var = storiesPageView.storiesPageCallbacks;
        if (rmu0Var != null) {
            PagePreviewType pagePreviewType = storiesPageView.pagePreviewType;
            c access$getViewModel = VerticalStoriesFragment.access$getViewModel((VerticalStoriesFragment) ((eg01) rmu0Var).a);
            access$getViewModel.getClass();
            int i = vg31.a[pagePreviewType.ordinal()];
            if (i == 1) {
                access$getViewModel.Z(ug31.a);
            } else if (i == 2) {
                access$getViewModel.Z(tg31.a);
            } else {
                w511.b();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ybsdk.feature.stories.internal.screens.verticalstories.view.StoriesPageView$onAttachedToWindow$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    n751 n751Var = StoriesPageView.this.windowInsets;
                    if (n751Var != null) {
                        androidx.core.view.b.d(StoriesPageView.this, n751Var);
                    }
                }
            });
            return;
        }
        n751 n751Var = this.windowInsets;
        if (n751Var != null) {
            androidx.core.view.b.d(this, n751Var);
        }
    }

    public final void onRecycled() {
        this.storiesPageCallbacks = null;
        this.binding.d.onDestroy();
    }

    public final void pauseStory() {
        this.binding.d.onStop();
    }

    public final void render(wmu0 state) {
        String string;
        wa61 wa61Var = this.binding;
        StoriesComponentView storiesComponentView = wa61Var.d;
        View view = wa61Var.c;
        storiesComponentView.render(state.c);
        StoriesComponentView storiesComponentView2 = wa61Var.d;
        boolean z = state.e;
        storiesComponentView2.setEnabled(z);
        CardView cardView = wa61Var.b;
        gob1.c(cardView, state.d, new ColorModel.Raw(getContext().getColor(aqg0.yb_dark_other_skeleton)), Float.valueOf(cardView.getRadius()));
        this.pagePreviewType = z ? PagePreviewType.CURRENT : PagePreviewType.NEXT;
        view.setVisibility((!z || lia1.g(getContext())) ? 0 : 8);
        int i = xmu0.a[this.pagePreviewType.ordinal()];
        if (i == 1) {
            string = getContext().getString(dzh0.ybsdk_stories_accessibility_prev_stories_page);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            string = getContext().getString(dzh0.ybsdk_stories_accessibility_next_stories_page);
        }
        view.setContentDescription(string);
    }

    public final void resumeStory() {
        this.binding.d.onResume();
    }

    public final void setCallbacks(rmu0 storiesPageCallbacks) {
        this.storiesPageCallbacks = storiesPageCallbacks;
    }

    public final void setInsets(n751 windowInsets) {
        this.windowInsets = windowInsets;
    }

    public final void setVideoPlayerFactory(rm31 videoPlayerFactory) {
        this.binding.d.setVideoPlayerFactory(videoPlayerFactory);
    }

    public StoriesPageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StoriesPageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public StoriesPageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
