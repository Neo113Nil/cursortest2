package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.paymentmethod.WidgetSbpView;

/* loaded from: classes4.dex */
public final class l361 implements zo31 {
    public final LinearLayout a;
    public final ToolbarView b;
    public final WidgetSbpView c;
    public final FrameLayout d;

    public l361(LinearLayout linearLayout, RecyclerView recyclerView, ToolbarView toolbarView, WidgetSbpView widgetSbpView, FrameLayout frameLayout) {
        this.a = linearLayout;
        this.b = toolbarView;
        this.c = widgetSbpView;
        this.d = frameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
