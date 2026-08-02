package defpackage;

import android.view.View;
import android.widget.TextView;
import com.ybsdk.feature.main.internal.widgets.SbpYbsCustomErrorView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class e861 implements zo31 {
    public final SbpYbsCustomErrorView a;
    public final TextView b;
    public final YbButtonView c;

    public e861(SbpYbsCustomErrorView sbpYbsCustomErrorView, TextView textView, YbButtonView ybButtonView) {
        this.a = sbpYbsCustomErrorView;
        this.b = textView;
        this.c = ybButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
