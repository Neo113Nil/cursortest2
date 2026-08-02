package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: DescriptionHolder.kt */
/* loaded from: classes3.dex */
public final class x1m extends xr6 {
    public final TextView l;

    public x1m(View view) {
        super(view);
        this.l = view instanceof TextView ? (TextView) view : null;
    }

    @Override // xsna.xr6
    public final void V5(htx htxVar) {
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(R.string.report_screen_description);
        }
    }
}
