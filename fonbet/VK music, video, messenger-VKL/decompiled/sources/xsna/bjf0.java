package xsna;

import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.ui.widgets.miniwidgets.SuperAppMiniWidget;
import com.vkontakte.android.R;

/* compiled from: RecyclerMiniWidgetItem.kt */
/* loaded from: classes6.dex */
public final class bjf0 extends zif0 {
    public final MiniWidgetItem a;
    public final SuperAppMiniWidget.WidgetSize b;

    public bjf0(MiniWidgetItem miniWidgetItem, SuperAppMiniWidget.WidgetSize widgetSize) {
        this.a = miniWidgetItem;
        this.b = widgetSize;
    }

    @Override // xsna.zif0
    public final int b() {
        String type = this.a.getType();
        return epx.f(type, "mw_exchange") ? R.layout.vk_super_app_exchange_mini_widget_element : epx.f(type, "mw_settings") ? R.layout.vk_super_app_mini_widgets_settings_element : R.layout.vk_super_app_mini_widgets_scroll_element;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjf0)) {
            return false;
        }
        bjf0 bjf0Var = (bjf0) obj;
        return epx.f(this.a, bjf0Var.a) && this.b == bjf0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecyclerMiniWidgetItem(data=" + this.a + ", widgetSize=" + this.b + ')';
    }
}
