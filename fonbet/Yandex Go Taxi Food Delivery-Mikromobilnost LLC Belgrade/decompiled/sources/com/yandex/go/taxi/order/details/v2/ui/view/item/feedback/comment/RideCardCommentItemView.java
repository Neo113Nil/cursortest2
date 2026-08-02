package com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.comment;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bdc;
import defpackage.cdc;
import defpackage.i3y;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.mg;
import defpackage.mrg0;
import defpackage.mzh0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tje;
import defpackage.usg0;
import defpackage.w0d;
import defpackage.xng0;
import defpackage.zfj0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\nJ\u001d\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/comment/RideCardCommentItemView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "hint", "Lzy11;", "renderHint", "(Ljava/lang/String;)V", "title", "renderTitle", "Lkdc;", "color", "renderBackground", "(Lkdc;)V", "comment", "renderCommentText", "Lkotlin/Function0;", "listener", "setClickListener", "(Lsls;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lkdc;", "Lbdc;", "titleColor$delegate", "Li3y;", "getTitleColor", "()Lbdc;", "titleColor", "Lw0d;", "backgroundBuilder", "Lw0d;", "Lru/yandex/taxi/design/ListTitleComponent;", "titleView", "Lru/yandex/taxi/design/ListTitleComponent;", "hintTextColor", "Lru/yandex/taxi/widget/RobotoTextView;", "commentView", "Lru/yandex/taxi/widget/RobotoTextView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "frameView", "Lcom/yandex/go/design/view/GoFrameLayout;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardCommentItemView extends GoLinearLayout {
    public static final int $stable = 8;
    private final w0d backgroundBuilder;
    private kdc backgroundColor;
    private final RobotoTextView commentView;
    private final GoFrameLayout frameView;
    private final kdc hintTextColor;

    /* renamed from: titleColor$delegate, reason: from kotlin metadata */
    private final i3y titleColor;
    private final ListTitleComponent titleView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RideCardCommentItemView(Context context) {
        super(context, null, 0, r4, 14, r6);
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 0;
        this.backgroundColor = new cdc(xng0.controlMinor);
        this.titleColor = a.b(LazyThreadSafetyMode.NONE, new zfj0(25));
        w0d w0dVar = new w0d();
        w0dVar.h = tje.r(usg0.ride_card_comment_corner_radius, getContext());
        this.backgroundBuilder = w0dVar;
        ListTitleComponent listTitleComponent = new ListTitleComponent(context, null, 0, 6, null);
        listTitleComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        listTitleComponent.setPadding(tje.u(16, listTitleComponent.getContext()), 0, tje.u(16, listTitleComponent.getContext()), 0);
        listTitleComponent.setMinHeight(tje.u(41, listTitleComponent.getContext()));
        listTitleComponent.setLeadFrameMinimumWidth(0);
        listTitleComponent.setTitle(listTitleComponent.getContext().getString(kyh0.rate_comment_title));
        listTitleComponent.setTitleAlignment(1);
        listTitleComponent.setTitleTextSizePx((int) tje.b0(listTitleComponent.getContext(), 16.0f));
        listTitleComponent.setTitleTypeface(0);
        listTitleComponent.setTitleLineSpacing(tje.r(mrg0.component_list_item_line_spacing, listTitleComponent.getContext()), 1.0f);
        listTitleComponent.setTitleColorAttr(xng0.textMain);
        listTitleComponent.setTitleFontFeatureSettings(listTitleComponent.getContext().getString(mzh0.go_default_font_settings));
        this.titleView = listTitleComponent;
        bdc bdcVar = new bdc(xng0.textMinor);
        this.hintTextColor = bdcVar;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, i, 6, defaultConstructorMarker);
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        robotoTextView.setGravity(16);
        robotoTextView.setPadding(tje.u(16, robotoTextView.getContext()), tje.u(12, robotoTextView.getContext()), tje.u(16, robotoTextView.getContext()), tje.u(12, robotoTextView.getContext()));
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        robotoTextView.setHint(context.getString(kyh0.comment_hint));
        robotoTextView.setMaxLines(3);
        robotoTextView.setMinHeight(tje.u(56, robotoTextView.getContext()));
        robotoTextView.setHintTextColor(s8o.m(bdcVar, context));
        robotoTextView.setTextSize(0, context.getResources().getDimensionPixelSize(usg0.order_screens_cancel_button_text_size));
        b.p(robotoTextView, new mg(29, robotoTextView));
        this.commentView = robotoTextView;
        GoFrameLayout goFrameLayout = new GoFrameLayout(context, null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        goFrameLayout.setPadding(tje.u(16, goFrameLayout.getContext()), goFrameLayout.getPaddingTop(), tje.u(16, goFrameLayout.getContext()), tje.u(16, goFrameLayout.getContext()));
        goFrameLayout.addView(robotoTextView);
        this.frameView = goFrameLayout;
        addView(listTitleComponent);
        addView(goFrameLayout);
    }

    private final bdc getTitleColor() {
        return (bdc) this.titleColor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bdc titleColor_delegate$lambda$0() {
        return new bdc(xng0.textMinor);
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.commentView.applyTheme(themeType);
        this.commentView.setHintTextColor(s8o.m(this.hintTextColor, getContext()));
        renderBackground(this.backgroundColor);
    }

    public final void renderBackground(kdc color) {
        this.backgroundColor = color;
        w0d w0dVar = this.backgroundBuilder;
        w0dVar.a = s8o.m(color, getContext());
        w0dVar.e = Integer.valueOf(qje.t(xng0.bgMinor, getContext()));
        w0dVar.g = true;
        this.commentView.setBackgroundDrawable(w0dVar.a());
    }

    public final void renderCommentText(String comment) {
        this.commentView.setText(comment);
    }

    public final void renderHint(String hint) {
        this.commentView.setHint(hint);
    }

    public final void renderTitle(String title) {
        boolean z = title == null || title.length() == 0;
        this.titleView.setVisibility(!z ? 0 : 8);
        GoFrameLayout goFrameLayout = this.frameView;
        goFrameLayout.setPadding(goFrameLayout.getPaddingLeft(), tje.u(z ? 12 : 0, getContext()), goFrameLayout.getPaddingRight(), goFrameLayout.getPaddingBottom());
        if (z) {
            return;
        }
        this.titleView.setTitle(title);
        this.titleView.setTitleTextColor(getTitleColor());
    }

    public final void setClickListener(sls listener) {
        RobotoTextView robotoTextView = this.commentView;
        if (listener != null) {
            c.z(listener, robotoTextView);
        } else {
            robotoTextView.setOnClickListener(null);
        }
    }
}
