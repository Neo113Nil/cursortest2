package com.yandex.go.taxi.order.feedback.tag;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.view.b;
import defpackage.qg;
import defpackage.qje;
import defpackage.tje;
import defpackage.w0d;
import defpackage.wug0;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/tag/TagRatingItemView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "invalidateInternal", "()V", "", "getBaseColor", "()I", "getOutlineWidth", "", "isSelected", "setSelectedItem", "(Z)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lqg;", "accessibilityDelegate", "Lqg;", "isSelectedItem", "Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TagRatingItemView extends ListItemComponent {
    public static final int $stable = 8;
    private final qg accessibilityDelegate;
    private boolean isSelectedItem;

    public TagRatingItemView(Context context) {
        super(context, null, 0, 6, null);
        qg qgVar = new qg();
        this.accessibilityDelegate = qgVar;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setMinHeight((int) tje.x(context, 40.0f));
        setTitleTextSizePx((int) tje.b0(context, 14.0f));
        setLeadImageSize((int) tje.x(context, 30.0f), (int) tje.x(context, 40.0f));
        setLeadImageStartEndPadding((int) tje.x(getContext(), 8.0f), (int) tje.x(getContext(), 10.0f), (int) tje.x(getContext(), 2.0f), (int) tje.x(getContext(), 10.0f));
        setUseAutoAccessibilityDelegate(false);
        b.p(this, qgVar);
        invalidateInternal();
    }

    private final int getBaseColor() {
        return qje.t(this.isSelectedItem ? xng0.bgInvert : xng0.bgMain, getContext());
    }

    private final int getOutlineWidth() {
        if (this.isSelectedItem) {
            return 0;
        }
        return (int) tje.x(getContext(), 0.5f);
    }

    private final void invalidateInternal() {
        this.accessibilityDelegate.a = this.isSelectedItem;
        w0d w0dVar = new w0d();
        w0dVar.a = getBaseColor();
        w0dVar.i = getOutlineWidth();
        w0dVar.h = tje.r(wug0.tag_feedback_rounded_corners_radius, getContext());
        w0dVar.b = qje.t(xng0.line, getContext());
        setBackground(w0dVar.a());
        setTitleColorAttr(this.isSelectedItem ? xng0.textInvert : xng0.textMain);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        invalidateInternal();
    }

    public final void setSelectedItem(boolean isSelected) {
        this.isSelectedItem = isSelected;
        invalidateInternal();
    }
}
