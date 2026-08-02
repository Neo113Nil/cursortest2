package com.yandex.go.taxi.order.quality_question.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.cma1;
import defpackage.g8e;
import defpackage.kyh0;
import defpackage.mgg0;
import defpackage.n4h0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.zkh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/go/taxi/order/quality_question/ui/QualityQuestionButton;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateContentDescription", "()V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "allowTraverse", "()Z", "Lmgg0;", "binding", "Lmgg0;", "Lru/yandex/taxi/design/ClickableImageView;", "leadImageView", "Lru/yandex/taxi/design/ClickableImageView;", "getLeadImageView", "()Lru/yandex/taxi/design/ClickableImageView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QualityQuestionButton extends FrameLayout implements nwy0 {
    public static final int $stable = 8;
    private final mgg0 binding;
    private final ClickableImageView leadImageView;

    public QualityQuestionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(zkh0.quality_question_button, this);
        int i2 = p8h0.content;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, this);
        if (listItemComponent == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
            throw null;
        }
        this.binding = new mgg0(this, listItemComponent);
        this.leadImageView = listItemComponent.getLeadImageView();
        listItemComponent.inflateTrailView(zkh0.quality_question_trail_action);
        ListItemComponent listItemComponent2 = (ListItemComponent) listItemComponent.getTrailViewAs(ListItemComponent.class);
        if (listItemComponent2 != null) {
            listItemComponent2.disableAccessibility();
        }
        updateContentDescription();
    }

    private final void updateContentDescription() {
        this.binding.b.setContentDescription(g8e.p(this.binding.b.getTitleText(), " ", getContext().getString(kyh0.order_progress_quality_question_action)));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return false;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.b.applyTheme(themeType);
        this.binding.b.setLeadImage(getContext().getDrawable(n4h0.ic_secret_shopper));
        this.binding.b.setBackground(getContext().getDrawable(n4h0.selector_promoblock_bg));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final ClickableImageView getLeadImageView() {
        return this.leadImageView;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        this.binding.b.setOnClickListener(l);
    }

    public final void setTitle(CharSequence title) {
        this.binding.b.setTitle(title);
        updateContentDescription();
    }

    public QualityQuestionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public QualityQuestionButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ QualityQuestionButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
