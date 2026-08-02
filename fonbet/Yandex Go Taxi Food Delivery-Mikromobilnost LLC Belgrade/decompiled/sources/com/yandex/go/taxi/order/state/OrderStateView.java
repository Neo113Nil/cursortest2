package com.yandex.go.taxi.order.state;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.g18;
import defpackage.hyh0;
import defpackage.k4o;
import defpackage.kyh0;
import defpackage.pwf0;
import defpackage.w791;
import defpackage.zxf0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH$¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0004¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\fR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/yandex/go/taxi/order/state/OrderStateView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "peekHeight", "()I", "anchorHeight", "Lzy11;", "resetScroll", "()V", "Landroid/view/View;", "getPeekView", "()Landroid/view/View;", "getAnchorView", "view", "getPeekHeight", "(Landroid/view/View;)I", "getAnchorHeight", "Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;", "mode", "handleOrderViewMode", "(Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;)V", "Lcom/yandex/go/taxi/order/state/OrderStateView$a;", "listener", "Lg18;", "addListener", "(Lcom/yandex/go/taxi/order/state/OrderStateView$a;)Lg18;", "canBeExpandedFromAnchoredChanged", "", "isCanBeExpandedFromAnchored", "()Z", "onBackPressed", "onContainerViewTransitionFinished", "", "peekTag", "Ljava/lang/String;", "Lru/yandex/taxi/utils/f;", "expandStateListeners", "Lru/yandex/taxi/utils/f;", "a", "Mode", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class OrderStateView extends FrameLayout {
    public static final int $stable = 8;
    private final ru.yandex.taxi.utils.f expandStateListeners;
    private final String peekTag;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;", "", "", "rateSubtitleId", CA20Status.STATUS_USER_I, "b", "()I", "completeStateTitleId", "a", "SINGLE", "PART_OF_LIST", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Mode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode PART_OF_LIST;
        public static final Mode SINGLE;
        private final int completeStateTitleId;
        private final int rateSubtitleId;

        static {
            Mode mode = new Mode("SINGLE", 0, kyh0.order_screens_rate_subtitle_your, kyh0.order_screens_complete_title_your);
            SINGLE = mode;
            Mode mode2 = new Mode("PART_OF_LIST", 1, kyh0.order_screens_rate_subtitle_other, kyh0.order_screens_complete_title_other);
            PART_OF_LIST = mode2;
            Mode[] modeArr = {mode, mode2};
            $VALUES = modeArr;
            $ENTRIES = kotlin.enums.a.a(modeArr);
        }

        public Mode(String str, int i, int i2, int i3) {
            this.rateSubtitleId = i2;
            this.completeStateTitleId = i3;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final int getCompleteStateTitleId() {
            return this.completeStateTitleId;
        }

        /* renamed from: b, reason: from getter */
        public final int getRateSubtitleId() {
            return this.rateSubtitleId;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/state/OrderStateView$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void canBeExpandedFromAnchoredChanged();
    }

    public OrderStateView(Context context) {
        super(context);
        this.peekTag = getResources().getString(hyh0.bottom_sheet_peek_tag);
        ConcurrentHashMap concurrentHashMap = pwf0.a;
        this.expandStateListeners = new ru.yandex.taxi.utils.f(a.class);
    }

    public final g18 addListener(a listener) {
        return this.expandStateListeners.h(listener);
    }

    public final int anchorHeight() {
        return getAnchorHeight(getAnchorTarget());
    }

    public final void canBeExpandedFromAnchoredChanged() {
        ((a) this.expandStateListeners.c).canBeExpandedFromAnchoredChanged();
    }

    public final int getAnchorHeight(View view) {
        return view.getHeight() + w791.c(this, view);
    }

    /* renamed from: getAnchorView */
    public abstract View getAnchorTarget();

    public final int getPeekHeight(View view) {
        return view.getHeight() + w791.c(this, view);
    }

    /* renamed from: getPeekView */
    public View getTitlesContainer() {
        return findViewWithTag(this.peekTag);
    }

    public void handleOrderViewMode(Mode mode) {
    }

    public boolean isCanBeExpandedFromAnchored() {
        return true;
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onContainerViewTransitionFinished() {
    }

    public final int peekHeight() {
        return getPeekHeight(getTitlesContainer());
    }

    public abstract void resetScroll();
}
