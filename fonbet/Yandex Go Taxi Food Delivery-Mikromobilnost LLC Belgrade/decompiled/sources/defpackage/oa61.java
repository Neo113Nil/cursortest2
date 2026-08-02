package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.WidgetView;

/* loaded from: classes4.dex */
public final class oa61 implements zo31 {
    public final WidgetView a;
    public final WidgetView b;

    public oa61(WidgetView widgetView, WidgetView widgetView2) {
        this.a = widgetView;
        this.b = widgetView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
