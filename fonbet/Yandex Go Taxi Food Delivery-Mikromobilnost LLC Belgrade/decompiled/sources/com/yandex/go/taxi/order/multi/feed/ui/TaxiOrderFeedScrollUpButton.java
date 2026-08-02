package com.yandex.go.taxi.order.multi.feed.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import com.yandex.go.taxi.order.multi.feed.analytics.TaxiOrderFeedAnalytics$Source;
import defpackage.b1y0;
import defpackage.c1y0;
import defpackage.dzg0;
import defpackage.k4o;
import defpackage.kgx;
import defpackage.kyh0;
import defpackage.sls;
import defpackage.w0y0;
import defpackage.w511;
import defpackage.xbi0;
import defpackage.xng0;
import defpackage.y7x0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.yandex.taxi.design.FloatButtonIconComponent;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R1\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\n\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010$\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderFeedScrollUpButton;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Landroid/content/Context;", "context", "Lw0y0;", "analytics", "<init>", "(Landroid/content/Context;Lw0y0;)V", "Lzy11;", "tryToInvalidateIcon", "()V", "invalidateIcon", "Lkotlin/Function0;", "onClick", "addOnClickListener", "(Lsls;)V", "Lw0y0;", "Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderFeedScrollUpButton$ScrollState;", "bottomSheetState", "Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderFeedScrollUpButton$ScrollState;", "", "<set-?>", "currentBehaviorState$delegate", "Lxbi0;", "getCurrentBehaviorState", "()I", "setCurrentBehaviorState", "(I)V", "getCurrentBehaviorState$annotations", "currentBehaviorState", "", "feedIsScrolled$delegate", "getFeedIsScrolled", "()Z", "setFeedIsScrolled", "(Z)V", "feedIsScrolled", "Companion", "ScrollState", "b1y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderFeedScrollUpButton extends FloatButtonIconComponent {
    private static final float BUTTON_ELEVATION = 0.3f;
    private final w0y0 analytics;
    private ScrollState bottomSheetState;

    /* renamed from: currentBehaviorState$delegate, reason: from kotlin metadata */
    private final xbi0 currentBehaviorState;

    /* renamed from: feedIsScrolled$delegate, reason: from kotlin metadata */
    private final xbi0 feedIsScrolled;
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("currentBehaviorState", 0, "getCurrentBehaviorState()I", TaxiOrderFeedScrollUpButton.class), new MutablePropertyReference1Impl("feedIsScrolled", 0, "getFeedIsScrolled()Z", TaxiOrderFeedScrollUpButton.class)};
    private static final b1y0 Companion = new b1y0();
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderFeedScrollUpButton$ScrollState;", "", "ANCHORED", "COLLAPSED", "ANCHORED_SCROLLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ScrollState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ScrollState[] $VALUES;
        public static final ScrollState ANCHORED;
        public static final ScrollState ANCHORED_SCROLLED;
        public static final ScrollState COLLAPSED;

        static {
            ScrollState scrollState = new ScrollState("ANCHORED", 0);
            ANCHORED = scrollState;
            ScrollState scrollState2 = new ScrollState("COLLAPSED", 1);
            COLLAPSED = scrollState2;
            ScrollState scrollState3 = new ScrollState("ANCHORED_SCROLLED", 2);
            ANCHORED_SCROLLED = scrollState3;
            ScrollState[] scrollStateArr = {scrollState, scrollState2, scrollState3};
            $VALUES = scrollStateArr;
            $ENTRIES = kotlin.enums.a.a(scrollStateArr);
        }

        public static ScrollState valueOf(String str) {
            return (ScrollState) Enum.valueOf(ScrollState.class, str);
        }

        public static ScrollState[] values() {
            return (ScrollState[]) $VALUES.clone();
        }
    }

    public TaxiOrderFeedScrollUpButton(Context context, w0y0 w0y0Var) {
        super(context, null, 0, 0, 14, null);
        this.analytics = w0y0Var;
        this.bottomSheetState = ScrollState.COLLAPSED;
        this.currentBehaviorState = new c1y0(this, 0);
        this.feedIsScrolled = new c1y0(this, 1);
        setElevation(0.3f);
        setIcon(dzg0.arrow_up);
        getIcon().setImageTintList(ColorStateList.valueOf(ru.yandex.taxi.design.utils.c.c(xng0.textMain, getIcon())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnClickListener$lambda$0(TaxiOrderFeedScrollUpButton taxiOrderFeedScrollUpButton, sls slsVar) {
        ScrollState scrollState = taxiOrderFeedScrollUpButton.bottomSheetState;
        ScrollState scrollState2 = ScrollState.ANCHORED;
        w0y0 w0y0Var = taxiOrderFeedScrollUpButton.analytics;
        if (scrollState == scrollState2) {
            w0y0.b(w0y0Var, w0y0Var.a, "FeedSDK.Merchant.UpToCollapseTapped", TaxiOrderFeedAnalytics$Source.FEED_ORDER_DETAILS, null, 12);
        } else {
            w0y0.b(w0y0Var, w0y0Var.a, "FeedSDK.Merchant.UpToStartTapped", TaxiOrderFeedAnalytics$Source.FEED_ORDER_DETAILS, null, 12);
        }
        slsVar.invoke();
    }

    public static /* synthetic */ void getCurrentBehaviorState$annotations() {
    }

    private final void invalidateIcon() {
        Pair pair;
        int i = d.a[this.bottomSheetState.ordinal()];
        if (i == 1 || i == 2) {
            pair = new Pair(Integer.valueOf(dzg0.ic_cross_close), getContext().getString(kyh0.order_details_with_feed_scroll_up_button_content_description_title));
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            pair = new Pair(Integer.valueOf(dzg0.ic_scroll_up), getContext().getString(kyh0.order_details_with_feed_collapse_button_content_description_title));
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        setContentDescription((String) pair.getSecond());
        setIcon(intValue);
        getIcon().setImageTintList(ColorStateList.valueOf(ru.yandex.taxi.design.utils.c.c(xng0.textMain, getIcon())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryToInvalidateIcon() {
        ScrollState scrollState = getCurrentBehaviorState() == 4 ? ScrollState.COLLAPSED : getFeedIsScrolled() ? ScrollState.ANCHORED_SCROLLED : ScrollState.ANCHORED;
        if (scrollState != this.bottomSheetState) {
            this.bottomSheetState = scrollState;
            invalidateIcon();
        }
    }

    public final void addOnClickListener(sls onClick) {
        setDebounceClickListener(new y7x0(12, this, onClick));
    }

    public final int getCurrentBehaviorState() {
        return ((Number) this.currentBehaviorState.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final boolean getFeedIsScrolled() {
        return ((Boolean) this.feedIsScrolled.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final void setCurrentBehaviorState(int i) {
        this.currentBehaviorState.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setFeedIsScrolled(boolean z) {
        this.feedIsScrolled.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }
}
