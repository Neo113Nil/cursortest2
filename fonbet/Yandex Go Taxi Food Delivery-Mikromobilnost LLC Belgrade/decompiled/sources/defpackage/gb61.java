package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes4.dex */
public final class gb61 implements zo31 {
    public final YbButtonView a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;

    public gb61(YbButtonView ybButtonView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.a = ybButtonView;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
