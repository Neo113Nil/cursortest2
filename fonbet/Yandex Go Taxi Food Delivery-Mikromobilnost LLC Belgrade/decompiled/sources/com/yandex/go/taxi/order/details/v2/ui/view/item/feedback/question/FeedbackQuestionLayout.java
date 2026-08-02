package com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.question;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.feedback.ui.FeedbackQuestionView;
import defpackage.tje;
import defpackage.xtq;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/question/FeedbackQuestionLayout;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lxtq;", ClidProvider.STATE, "update", "(Lxtq;)V", "Lcom/yandex/go/taxi/order/feedback/ui/FeedbackQuestionView;", "feedbackQuestionView", "Lcom/yandex/go/taxi/order/feedback/ui/FeedbackQuestionView;", "getFeedbackQuestionView", "()Lcom/yandex/go/taxi/order/feedback/ui/FeedbackQuestionView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeedbackQuestionLayout extends GoFrameLayout {
    public static final int $stable = 8;
    private final FeedbackQuestionView feedbackQuestionView;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackQuestionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        FeedbackQuestionView feedbackQuestionView = new FeedbackQuestionView(context, null, 2, 0 == true ? 1 : 0);
        feedbackQuestionView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        xw31.A((int) tje.w(16, feedbackQuestionView.getContext()), feedbackQuestionView);
        xw31.E(feedbackQuestionView, null, Integer.valueOf((int) tje.w(8, feedbackQuestionView.getContext())), null, null);
        xw31.E(feedbackQuestionView, null, null, null, Integer.valueOf((int) tje.w(16, feedbackQuestionView.getContext())));
        this.feedbackQuestionView = feedbackQuestionView;
    }

    public final FeedbackQuestionView getFeedbackQuestionView() {
        return this.feedbackQuestionView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addView(this.feedbackQuestionView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeAllViews();
        super.onDetachedFromWindow();
    }

    public final void update(xtq state) {
        this.feedbackQuestionView.update(state);
    }

    public FeedbackQuestionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public FeedbackQuestionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public FeedbackQuestionLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ FeedbackQuestionLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
