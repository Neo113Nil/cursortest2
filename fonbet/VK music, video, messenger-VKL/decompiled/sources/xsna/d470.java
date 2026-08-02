package xsna;

import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: NoResultsVh.kt */
/* loaded from: classes2.dex */
public final class d470 extends vfz<c470> {
    public final TextView l;

    public d470(View view) {
        super(view);
        this.l = (TextView) view.findViewById(R.id.vkim_content);
    }

    @Override // xsna.vfz
    public final void W5(c470 c470Var) {
        String str = c470Var.b;
        TextView textView = this.l;
        if (str == null) {
            str = textView.getContext().getString(R.string.vkim_picker_no_results);
        }
        textView.setText(str);
        d3m.c(this.l, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 100L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.vfz
    public final void a6() {
        this.l.animate().cancel();
    }
}
