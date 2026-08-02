package com.yandex.go.taxi.order.details.v2.ui.view.item.timeline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineView;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline;
import defpackage.a2i0;
import defpackage.bts0;
import defpackage.cma1;
import defpackage.i3y;
import defpackage.is8;
import defpackage.kqe0;
import defpackage.mhq0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.qcq0;
import defpackage.r2y;
import defpackage.sls;
import defpackage.sok0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tok0;
import defpackage.vok0;
import defpackage.wok0;
import defpackage.wug0;
import defpackage.xbz0;
import defpackage.xss0;
import defpackage.ytz;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.timeline.TimelineView;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"J1\u0010'\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0004\u0012\u00020\u00120#H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J'\u00105\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010F\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010@\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/timeline/RideCardTimelineView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Lbts0;", "slotItemViewFactory", "Lpav;", "imageLoader", "Lytz;", "lottieLoader", "<init>", "(Landroid/content/Context;Lbts0;Lpav;Lytz;)V", "Lxss0;", "bubble", "Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Timeline$TimelineType;", "timelineType", "", "currentItemIndex", "Lzy11;", "renderBubble", "(Lxss0;Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Timeline$TimelineType;I)V", "newTimelineType", "reRenderTimelineIfNeed", "(Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Timeline$TimelineType;)V", "Landroid/view/ViewStub;", "removeViewStub", "Landroid/view/View;", "removeTimelineView", "viewStubForNewTimeline", "newTimeLineView", "renderTimeline", "(Landroid/view/ViewStub;Landroid/view/View;Landroid/view/ViewStub;Landroid/view/View;)V", "view", "hideAndRemoveTimeline", "(Landroid/view/View;)V", "Lkotlin/Function1;", "", "Landroid/graphics/Point;", "pointsBlock", "consumeCurrentTimelineItemsPointsForRenderTail", "(Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Timeline$TimelineType;Ltls;)V", "addTimelineBannerViewIfNeed", "()V", "Ltok0;", "uiState", "render", "(Ltok0;)V", "Lsok0;", "optionsData", "Lmhq0;", "selectedOptionChangeListener", "Lqcq0;", "selectOptionListener", "renderTimelineOptions", "(Lsok0;Lmhq0;Lqcq0;)V", "Lpav;", "Lytz;", "Lr2y;", "binding", "Lr2y;", "currentTimelineType", "Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Timeline$TimelineType;", "Lru/yandex/taxi/widget/timeline/TimelineView;", "regularTimelineView$delegate", "Li3y;", "getRegularTimelineView", "()Lru/yandex/taxi/widget/timeline/TimelineView;", "regularTimelineView", "compactTimelineView$delegate", "getCompactTimelineView", "compactTimelineView", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/timeline/RideCardTimelineBannerView;", "rideCardTimelineBannerView$delegate", "getRideCardTimelineBannerView", "()Lcom/yandex/go/taxi/order/details/v2/ui/view/item/timeline/RideCardTimelineBannerView;", "rideCardTimelineBannerView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardTimelineView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final r2y binding;

    /* renamed from: compactTimelineView$delegate, reason: from kotlin metadata */
    private final i3y compactTimelineView;
    private RideCardItemDto$Timeline.TimelineType currentTimelineType;
    private final pav imageLoader;
    private final ytz lottieLoader;

    /* renamed from: regularTimelineView$delegate, reason: from kotlin metadata */
    private final i3y regularTimelineView;

    /* renamed from: rideCardTimelineBannerView$delegate, reason: from kotlin metadata */
    private final i3y rideCardTimelineBannerView;

    public RideCardTimelineView(final Context context, bts0 bts0Var, pav pavVar, ytz ytzVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.lottieLoader = ytzVar;
        LayoutInflater.from(context).inflate(zkh0.layout_timeline_container, this);
        int i = p8h0.compact_timeline_stub;
        ViewStub viewStub = (ViewStub) cma1.O(i, this);
        if (viewStub != null) {
            i = p8h0.regular_timeline_stub;
            ViewStub viewStub2 = (ViewStub) cma1.O(i, this);
            if (viewStub2 != null) {
                i = p8h0.timeline_bubble_stub;
                ViewStub viewStub3 = (ViewStub) cma1.O(i, this);
                if (viewStub3 != null) {
                    i = p8h0.timeline_space;
                    if (((Space) cma1.O(i, this)) != null) {
                        this.binding = new r2y(this, viewStub, viewStub2, viewStub3);
                        final int i2 = 0;
                        sls slsVar = new sls() { // from class: uok0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                TimelineView regularTimelineView_delegate$lambda$0;
                                TimelineView compactTimelineView_delegate$lambda$0;
                                int i3 = i2;
                                RideCardTimelineView rideCardTimelineView = this;
                                Context context2 = context;
                                switch (i3) {
                                    case 0:
                                        regularTimelineView_delegate$lambda$0 = RideCardTimelineView.regularTimelineView_delegate$lambda$0(context2, rideCardTimelineView);
                                        return regularTimelineView_delegate$lambda$0;
                                    default:
                                        compactTimelineView_delegate$lambda$0 = RideCardTimelineView.compactTimelineView_delegate$lambda$0(context2, rideCardTimelineView);
                                        return compactTimelineView_delegate$lambda$0;
                                }
                            }
                        };
                        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                        this.regularTimelineView = a.b(lazyThreadSafetyMode, slsVar);
                        final int i3 = 1;
                        this.compactTimelineView = a.b(lazyThreadSafetyMode, new sls() { // from class: uok0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                TimelineView regularTimelineView_delegate$lambda$0;
                                TimelineView compactTimelineView_delegate$lambda$0;
                                int i32 = i3;
                                RideCardTimelineView rideCardTimelineView = this;
                                Context context2 = context;
                                switch (i32) {
                                    case 0:
                                        regularTimelineView_delegate$lambda$0 = RideCardTimelineView.regularTimelineView_delegate$lambda$0(context2, rideCardTimelineView);
                                        return regularTimelineView_delegate$lambda$0;
                                    default:
                                        compactTimelineView_delegate$lambda$0 = RideCardTimelineView.compactTimelineView_delegate$lambda$0(context2, rideCardTimelineView);
                                        return compactTimelineView_delegate$lambda$0;
                                }
                            }
                        });
                        this.rideCardTimelineBannerView = a.b(lazyThreadSafetyMode, new kqe0(17, context, bts0Var, this));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void addTimelineBannerViewIfNeed() {
        if (this.binding.d.getParent() == null) {
            cma1.J(getRideCardTimelineBannerView());
        } else {
            c.w(this.binding.d, getRideCardTimelineBannerView());
            cma1.J(getRideCardTimelineBannerView());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimelineView compactTimelineView_delegate$lambda$0(Context context, RideCardTimelineView rideCardTimelineView) {
        TimelineView timelineView = new TimelineView(context, null, 0, a2i0.CompactTimelineStyle1, 6, null);
        timelineView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, tje.r(wug0.timeline_item_height, timelineView.getContext())));
        timelineView.setImageLoader(rideCardTimelineView.imageLoader);
        timelineView.setLottieLoader(rideCardTimelineView.lottieLoader);
        return timelineView;
    }

    private final void consumeCurrentTimelineItemsPointsForRenderTail(RideCardItemDto$Timeline.TimelineType timelineType, tls pointsBlock) {
        int i = vok0.a[timelineType.ordinal()];
        if (i == 1) {
            TimelineView regularTimelineView = getRegularTimelineView();
            OneShotPreDrawListener.add(regularTimelineView, new wok0(regularTimelineView, pointsBlock, this, 0));
        } else {
            if (i != 2) {
                return;
            }
            TimelineView compactTimelineView = getCompactTimelineView();
            OneShotPreDrawListener.add(compactTimelineView, new wok0(compactTimelineView, pointsBlock, this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimelineView getCompactTimelineView() {
        return (TimelineView) this.compactTimelineView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimelineView getRegularTimelineView() {
        return (TimelineView) this.regularTimelineView.getValue();
    }

    private final RideCardTimelineBannerView getRideCardTimelineBannerView() {
        return (RideCardTimelineBannerView) this.rideCardTimelineBannerView.getValue();
    }

    private final void hideAndRemoveTimeline(View view) {
        if (view.getParent() != null) {
            cma1.L(view);
            removeView(view);
        }
    }

    private final void reRenderTimelineIfNeed(RideCardItemDto$Timeline.TimelineType newTimelineType) {
        if (this.currentTimelineType == newTimelineType) {
            return;
        }
        int i = vok0.a[newTimelineType.ordinal()];
        if (i == 1) {
            renderTimeline(this.binding.b, getCompactTimelineView(), this.binding.c, getRegularTimelineView());
        } else if (i == 2) {
            renderTimeline(this.binding.c, getRegularTimelineView(), this.binding.b, getCompactTimelineView());
        }
        this.currentTimelineType = newTimelineType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimelineView regularTimelineView_delegate$lambda$0(Context context, RideCardTimelineView rideCardTimelineView) {
        TimelineView timelineView = new TimelineView(context, null, 0, a2i0.RegularTimelineStyle1, 6, null);
        timelineView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, tje.r(wug0.timeline_item_height, timelineView.getContext())));
        timelineView.setImageLoader(rideCardTimelineView.imageLoader);
        timelineView.setLottieLoader(rideCardTimelineView.lottieLoader);
        return timelineView;
    }

    private final void renderBubble(xss0 bubble, RideCardItemDto$Timeline.TimelineType timelineType, int currentItemIndex) {
        getRideCardTimelineBannerView().render(bubble);
        consumeCurrentTimelineItemsPointsForRenderTail(timelineType, new is8(this, currentItemIndex, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderBubble$lambda$0(RideCardTimelineView rideCardTimelineView, int i, List list) {
        rideCardTimelineView.getRideCardTimelineBannerView().renderTail(list, i);
        return zy11.a;
    }

    private final void renderTimeline(ViewStub removeViewStub, View removeTimelineView, ViewStub viewStubForNewTimeline, View newTimeLineView) {
        if (removeViewStub.getParent() == null) {
            hideAndRemoveTimeline(removeTimelineView);
        }
        c.w(viewStubForNewTimeline, newTimeLineView);
        cma1.J(newTimeLineView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RideCardTimelineBannerView rideCardTimelineBannerView_delegate$lambda$0(Context context, bts0 bts0Var, RideCardTimelineView rideCardTimelineView) {
        return new RideCardTimelineBannerView(context, bts0Var, rideCardTimelineView.imageLoader);
    }

    public final void render(tok0 uiState) {
        RideCardItemDto$Timeline.TimelineType timelineType = uiState.c;
        xss0 xss0Var = uiState.f;
        List<xbz0> list = uiState.d;
        int i = uiState.e;
        reRenderTimelineIfNeed(timelineType);
        RideCardItemDto$Timeline.TimelineType timelineType2 = uiState.c;
        int i2 = vok0.a[timelineType2.ordinal()];
        if (i2 == 1) {
            getRegularTimelineView().setItems(list, i);
        } else if (i2 != 2) {
            return;
        } else {
            getCompactTimelineView().setItems(list, i);
        }
        if (xss0Var != null) {
            addTimelineBannerViewIfNeed();
            renderBubble(xss0Var, timelineType2, i);
        } else if (this.binding.d.getParent() == null) {
            cma1.L(getRideCardTimelineBannerView());
        }
    }

    public final void renderTimelineOptions(sok0 optionsData, mhq0 selectedOptionChangeListener, qcq0 selectOptionListener) {
        if (optionsData == null) {
            getRideCardTimelineBannerView().hideAdditionalOptionsSection();
            return;
        }
        getRideCardTimelineBannerView().showAdditionalOptionsSection();
        getRideCardTimelineBannerView().renderAdditionalOptions(optionsData);
        getRideCardTimelineBannerView().setSelectedOptionChangeListener(selectedOptionChangeListener);
        getRideCardTimelineBannerView().setSelectOptionListener(selectOptionListener);
    }
}
