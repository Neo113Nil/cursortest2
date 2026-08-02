package defpackage;

import android.view.View;
import android.widget.TextView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes4.dex */
public final class l061 implements zo31 {
    public final YbButtonViewGroup a;
    public final TextView b;
    public final YbButtonView c;
    public final YbButtonView d;

    public l061(YbButtonViewGroup ybButtonViewGroup, TextView textView, YbButtonView ybButtonView, YbButtonView ybButtonView2) {
        this.a = ybButtonViewGroup;
        this.b = textView;
        this.c = ybButtonView;
        this.d = ybButtonView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
