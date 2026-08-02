package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: PollBackgroundSmallViewHolders.kt */
/* loaded from: classes4.dex */
public final class qtb0 extends bnb0<s3q0> {
    public qtb0() {
        throw null;
    }

    @Override // xsna.bnb0, xsna.vif0
    public final void i6(Object obj) {
        mcy<Object> mcyVar = this.n;
        q6((mcyVar != null ? mcyVar.get() : null) == null);
        View view = this.itemView;
        view.setContentDescription(view.getContext().getString(R.string.poll_accessibility_default_background));
    }

    @Override // xsna.bnb0
    public final String s6(s3q0 s3q0Var) {
        return this.itemView.getContext().getString(R.string.poll_accessibility_default_background);
    }
}
