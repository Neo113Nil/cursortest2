package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.text.NumberFormat;

/* compiled from: ActionLinkStatViewController.kt */
/* loaded from: classes2.dex */
public final class o20 {
    public NumberFormat a;
    public io.reactivex.rxjava3.disposables.c b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public ViewGroup g;

    public final void a(float f, int i, int i2) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        TextView textView3 = this.e;
        if (textView3 != null) {
            textView3.setText(this.a.format(Float.valueOf(f)));
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                bwt0.p0(childAt, R.id.progress != childAt.getId());
            }
        }
    }
}
