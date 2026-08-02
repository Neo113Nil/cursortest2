package com.yandex.go.superapp.orders.card.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.ei;
import defpackage.evu0;
import defpackage.lbm;
import defpackage.m301;
import defpackage.nac;
import defpackage.pav;
import defpackage.tje;
import defpackage.tn70;
import defpackage.wn70;
import defpackage.zgz0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SpannableTextStrategyInteractor;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/superapp/orders/card/actions/TrackingCardButtonView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lwn70;", "style", "Lpav;", "imageLoader", "Lzy11;", "init", "(Lwn70;Lpav;)V", "Lm301;", "uiState", "render", "(Lm301;)V", "Lwn70;", "Lpav;", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrackingCardButtonView extends ListItemComponent {
    private pav imageLoader;
    private wn70 style;

    public TrackingCardButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.style = tn70.a;
        setVerticalPadding(0);
        int u = tje.u(8, getContext());
        setLeadImagePadding(0, u, 0, u);
        TextView title = title();
        title.setTextAlignment(4);
        title.setLetterSpacing(0.0f);
        title.setLineHeight((int) tje.b0(title.getContext(), 14.0f));
        setTitleTextSizePx((int) tje.b0(getContext(), 13.0f));
        setTitleEllipsizeMode(1);
        subtitle().setTextAlignment(4);
        setSubTitleEllipsizeMode(1);
        setSubtitleMaxLines(1);
        setAccessibilityMode(2);
        b.p(this, new ei(29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$1(TrackingCardButtonView trackingCardButtonView) {
        trackingCardButtonView.clearLeadView();
        return zy11.a;
    }

    public final void init(wn70 style, pav imageLoader) {
        this.style = style;
        this.imageLoader = imageLoader;
    }

    public final void render(m301 uiState) {
        lbm a;
        setVisibility(uiState != null ? 0 : 8);
        if (uiState == null) {
            return;
        }
        CharSequence charSequence = uiState.a;
        CharSequence charSequence2 = uiState.b;
        setTitle(charSequence);
        setTitleSpannableTextStrategy(SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_100_TEXT_SIZE);
        setSubtitle(charSequence2);
        setTitleMaxLines((charSequence2 == null || evu0.J(charSequence2)) ? 2 : 1);
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        setContentDescription(((Object) charSequence) + " " + ((Object) charSequence2));
        pav pavVar = this.imageLoader;
        if (pavVar == null || (a = pavVar.a(getLeadImageView())) == null) {
            return;
        }
        nac nacVar = (nac) a;
        nacVar.i = new zgz0(12, this);
        nacVar.c("");
    }

    public TrackingCardButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrackingCardButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TrackingCardButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
