package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class g261 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final TextView c;
    public final TextView d;
    public final TraceIdErrorView e;

    public g261(ConstraintLayout constraintLayout, YbButtonView ybButtonView, TextView textView, TextView textView2, TraceIdErrorView traceIdErrorView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = textView;
        this.d = textView2;
        this.e = traceIdErrorView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
