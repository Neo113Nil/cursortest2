package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view.GuidelinesWidgetView;

/* loaded from: classes3.dex */
public final class la61 implements zo31 {
    public final GuidelinesWidgetView a;
    public final LinearLayout b;
    public final TextView c;

    public la61(GuidelinesWidgetView guidelinesWidgetView, LinearLayout linearLayout, TextView textView) {
        this.a = guidelinesWidgetView;
        this.b = linearLayout;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
