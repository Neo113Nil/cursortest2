package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes4.dex */
public final class h161 implements zo31 {
    public final ErrorView a;
    public final CloseButtonView b;
    public final ImageView c;
    public final YbButtonView d;
    public final YbButtonView e;
    public final YbButtonView f;
    public final TextView g;
    public final TextView h;
    public final TraceIdErrorView i;
    public final TextView j;
    public final ImageView k;

    public h161(ErrorView errorView, CloseButtonView closeButtonView, ImageView imageView, YbButtonView ybButtonView, YbButtonView ybButtonView2, YbButtonView ybButtonView3, TextView textView, TextView textView2, TraceIdErrorView traceIdErrorView, TextView textView3, ImageView imageView2) {
        this.a = errorView;
        this.b = closeButtonView;
        this.c = imageView;
        this.d = ybButtonView;
        this.e = ybButtonView2;
        this.f = ybButtonView3;
        this.g = textView;
        this.h = textView2;
        this.i = traceIdErrorView;
        this.j = textView3;
        this.k = imageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
