package com.yandex.messaging.ui.calls.feedback;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.drb1;
import defpackage.jng0;
import defpackage.t5w;
import defpackage.tls;
import defpackage.wtn;
import defpackage.wwg0;
import defpackage.y6i0;
import java.util.Iterator;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R6\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/messaging/ui/calls/feedback/RatingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "fillStars", "()V", "rating", "Landroid/widget/ImageView;", "createStarView", "(I)Landroid/widget/ImageView;", "Lkotlin/Function1;", "Lcom/yandex/messaging/ui/calls/feedback/OnRatingChangeListener;", "onRatingChangeListener", "Ltls;", "getOnRatingChangeListener", "()Ltls;", "setOnRatingChangeListener", "(Ltls;)V", "value", "selectedRating", CA20Status.STATUS_USER_I, "setSelectedRating", "(I)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RatingView extends LinearLayout {
    public static final int $stable = 8;
    private tls onRatingChangeListener;
    private int selectedRating;

    public RatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 0;
        while (i2 < 5) {
            i2++;
            addView(createStarView(i2));
        }
    }

    private final ImageView createStarView(int rating) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        ImageView imageView = new ImageView(getContext());
        int i = (int) (48.0f * imageView.getContext().getResources().getDisplayMetrics().density);
        int i2 = (int) (12.0f * imageView.getContext().getResources().getDisplayMetrics().density);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        imageView.setPadding(i2, i2, i2, i2);
        imageView.setImageResource(wwg0.msg_calls_feedback_star);
        imageView.setImageTintList(ColorStateList.valueOf(drb1.c(jng0.messagingTelemostIconPrimaryColor, imageView.getContext())));
        imageView.setBackgroundResource(typedValue.resourceId);
        imageView.setOnClickListener(new wtn(this, rating, 5));
        return imageView;
    }

    private final void fillStars() {
        Iterator it = y6i0.n(0, this.selectedRating).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View childAt = getChildAt(((t5w) it).nextInt());
            ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
            if (imageView != null) {
                imageView.setImageResource(wwg0.msg_calls_feedback_star_filled);
            }
        }
        Iterator it2 = y6i0.n(this.selectedRating, 5).iterator();
        while (it2.hasNext()) {
            View childAt2 = getChildAt(((t5w) it2).nextInt());
            ImageView imageView2 = childAt2 instanceof ImageView ? (ImageView) childAt2 : null;
            if (imageView2 != null) {
                imageView2.setImageResource(wwg0.msg_calls_feedback_star);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedRating(int i) {
        this.selectedRating = i;
        fillStars();
        tls tlsVar = this.onRatingChangeListener;
        if (tlsVar != null) {
            tlsVar.invoke(Integer.valueOf(this.selectedRating));
        }
    }

    public final tls getOnRatingChangeListener() {
        return this.onRatingChangeListener;
    }

    public final void setOnRatingChangeListener(tls tlsVar) {
        this.onRatingChangeListener = tlsVar;
    }

    public RatingView(Context context) {
        this(context, null);
    }

    public RatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
