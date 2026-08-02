package com.yandex.go.transfer_requirement.ui.date_selector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cma1;
import defpackage.eja1;
import defpackage.flh0;
import defpackage.ny61;
import defpackage.q4h0;
import defpackage.qje;
import defpackage.up11;
import defpackage.v8h0;
import defpackage.vh01;
import defpackage.wh01;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/transfer_requirement/ui/date_selector/TransferDateSelectorItemView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setRootBackground", "()V", "setTitleColorText", "setTypeface", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lwh01;", "uiState", "render", "(Lwh01;)V", "Lvh01;", "binding", "Lvh01;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransferDateSelectorItemView extends GoFrameLayout {
    private final vh01 binding;

    public TransferDateSelectorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(flh0.transfer_date_selector_item_layout, this);
        int i2 = v8h0.title;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
        if (robotoTextView != null) {
            this.binding = new vh01(this, robotoTextView);
        } else {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
            throw null;
        }
    }

    private final void setRootBackground() {
        setBackgroundResource(isSelected() ? q4h0.bg_transfer_date_selector_item_selected : q4h0.bg_transfer_date_selector_item_unselected);
    }

    private final void setTitleColorText() {
        this.binding.b.setTextColor(isSelected() ? qje.t(xng0.textOnControl, getContext()) : qje.t(xng0.textOnControlMinor, getContext()));
    }

    private final void setTypeface() {
        int i = isSelected() ? 3 : 0;
        RobotoTextView robotoTextView = this.binding.b;
        int[] iArr = up11.a;
        robotoTextView.setTypeface(eja1.w(i, 0));
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setTitleColorText();
    }

    public final void render(wh01 uiState) {
        setSelected(uiState.b);
        this.binding.b.setText(uiState.a);
        setRootBackground();
        setTitleColorText();
        setTypeface();
    }

    public TransferDateSelectorItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TransferDateSelectorItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TransferDateSelectorItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
