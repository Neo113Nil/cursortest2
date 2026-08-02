package com.yandex.go.due_timetable.presentation.widget.day_selector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.bzm;
import defpackage.cma1;
import defpackage.d2h0;
import defpackage.eja1;
import defpackage.eth0;
import defpackage.gih0;
import defpackage.nsg;
import defpackage.ny61;
import defpackage.osg;
import defpackage.qje;
import defpackage.tje;
import defpackage.up11;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/yandex/go/due_timetable/presentation/widget/day_selector/DaySelectorItemView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "subtitle", "Lzy11;", "setSubtitle", "(Ljava/lang/String;)V", "setRootBackground", "()V", "setTitleColorText", "setSubtitleColorText", "setTypeface", "", "visible", "setLightningIconVisible", "(Z)V", "setLightningIconDrawable", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lnsg;", "uiState", "render", "(Lnsg;)V", "Lbzm;", "binding", "Lbzm;", "Companion", "osg", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DaySelectorItemView extends GoLinearLayout {
    public static final osg Companion = new osg();
    private static final int END_PADDING = 14;
    private static final int START_PADDING_WITHOUT_ICON = 14;
    private static final int START_PADDING_WITH_ICON = 12;
    private final bzm binding;

    public DaySelectorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        View inflate = LayoutInflater.from(context).inflate(eth0.due_timetable_day_selector_item_view_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = gih0.lightning_icon;
        ImageView imageView = (ImageView) cma1.O(i2, inflate);
        if (imageView != null) {
            i2 = gih0.subtitle;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                i2 = gih0.title;
                TextView textView2 = (TextView) cma1.O(i2, inflate);
                if (textView2 != null) {
                    this.binding = new bzm((GoLinearLayout) inflate, imageView, textView, textView2);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void setLightningIconDrawable() {
        if (this.binding.b.getVisibility() == 0) {
            this.binding.b.setImageDrawable(vng.t(isSelected() ? d2h0.ic_due_timetable_lightning_selected : d2h0.ic_due_timetable_lightning_unselected, getContext()));
        }
    }

    private final void setLightningIconVisible(boolean visible) {
        if ((this.binding.b.getVisibility() == 0) != visible) {
            this.binding.b.setVisibility(visible ? 0 : 8);
            bzm bzmVar = this.binding;
            if (visible) {
                bzmVar.a.setPadding(tje.u(12, getContext()), 0, tje.u(14, getContext()), 0);
            } else {
                bzmVar.a.setPadding(tje.u(14, getContext()), 0, tje.u(14, getContext()), 0);
            }
        }
    }

    private final void setRootBackground() {
        this.binding.a.setBackgroundResource(isSelected() ? d2h0.bg_due_timetable_day_selector_item_selected : d2h0.bg_due_timetable_day_selector_item_unselected);
    }

    private final void setSubtitle(String subtitle) {
        this.binding.c.setVisibility(subtitle.length() > 0 ? 0 : 8);
        this.binding.c.setText(subtitle);
    }

    private final void setSubtitleColorText() {
        this.binding.c.setTextColor(isSelected() ? qje.t(xng0.textOnControl, getContext()) : qje.t(xng0.textOnControlMinor, getContext()));
    }

    private final void setTitleColorText() {
        this.binding.d.setTextColor(isSelected() ? qje.t(xng0.textOnControl, getContext()) : qje.t(xng0.textOnControlMinor, getContext()));
    }

    private final void setTypeface() {
        int i = isSelected() ? 3 : 0;
        TextView textView = this.binding.d;
        int[] iArr = up11.a;
        textView.setTypeface(eja1.w(i, 0));
        this.binding.c.setTypeface(eja1.w(i, 0));
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setTitleColorText();
        setSubtitleColorText();
        setLightningIconDrawable();
    }

    public final void render(nsg uiState) {
        setSelected(uiState.e);
        this.binding.d.setText(uiState.a);
        this.binding.d.setContentDescription(uiState.b);
        setSubtitle(uiState.c);
        setRootBackground();
        setTitleColorText();
        setSubtitleColorText();
        setTypeface();
        setLightningIconVisible(false);
        setLightningIconDrawable();
    }

    public DaySelectorItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DaySelectorItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DaySelectorItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
