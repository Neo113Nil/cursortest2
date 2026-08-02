package yads;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class cm3 implements View.OnClickListener {
    public final View a;

    public cm3(TextView textView) {
        this.a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}
