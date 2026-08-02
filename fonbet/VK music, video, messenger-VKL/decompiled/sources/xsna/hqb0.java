package xsna;

import android.widget.ProgressBar;
import com.vk.dto.polls.PhotoPoll;
import com.vkontakte.android.R;

/* compiled from: PollBackgroundSmallViewHolders.kt */
/* loaded from: classes4.dex */
public final class hqb0 extends bnb0<inb0> {
    public hqb0() {
        throw null;
    }

    @Override // xsna.bnb0, xsna.vif0
    public final void i6(Object obj) {
        inb0 inb0Var = (inb0) obj;
        super.i6(inb0Var);
        boolean z = inb0Var.b == null;
        ProgressBar progressBar = this.s;
        bwt0.p0(progressBar, z);
        if (inb0Var.b == null) {
            progressBar.setMax(inb0Var.d);
            progressBar.setProgress(inb0Var.c);
        } else {
            t8m0 t8m0Var = (t8m0) this.r.getBackground();
            PhotoPoll photoPoll = inb0Var.b;
            Float[] fArr = t8m0.k;
            t8m0Var.b(photoPoll, null);
        }
    }

    @Override // xsna.bnb0
    public final String s6(inb0 inb0Var) {
        return this.itemView.getContext().getString(R.string.poll_accessibility_custom_background);
    }
}
