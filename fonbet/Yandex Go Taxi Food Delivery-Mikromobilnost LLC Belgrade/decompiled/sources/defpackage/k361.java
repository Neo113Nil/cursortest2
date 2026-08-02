package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes4.dex */
public final class k361 implements zo31 {
    public final LinearLayout a;
    public final YbButtonView b;
    public final m2y c;
    public final YbButtonView d;

    public k361(LinearLayout linearLayout, YbButtonView ybButtonView, LinearLayout linearLayout2, m2y m2yVar, YbButtonView ybButtonView2) {
        this.a = linearLayout;
        this.b = ybButtonView;
        this.c = m2yVar;
        this.d = ybButtonView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
