package xsna;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;

/* compiled from: RecommendedChannelHeaderItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class icf0 extends vfz<fcf0> {
    public final AppCompatTextView l;
    public fcf0 m;

    public icf0(View view, com.vk.channels.impl.list.f fVar) {
        super(view);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.collapse_button);
        bwt0.i0(appCompatTextView, new hcf0(0, this, fVar));
        this.l = appCompatTextView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(fcf0 fcf0Var) {
        fcf0 fcf0Var2 = fcf0Var;
        this.m = fcf0Var2;
        CharSequence charSequence = fcf0Var2.b;
        int i = charSequence != null ? 0 : 8;
        AppCompatTextView appCompatTextView = this.l;
        appCompatTextView.setVisibility(i);
        appCompatTextView.setText(charSequence);
    }
}
