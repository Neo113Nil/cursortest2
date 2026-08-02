package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;

/* compiled from: ShittyDisclaimerHolder.kt */
/* loaded from: classes4.dex */
public final class cej0 extends wf0 {
    public final TextView E;

    public cej0(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.news_shitty_disclaimer, viewGroup);
        this.E = (TextView) this.itemView.findViewById(R.id.shitty_disclaimer);
    }

    @Override // xsna.qi6
    public final void E6(ShitAttachment shitAttachment) {
        this.E.setText(shitAttachment.B);
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        ShitAttachment q6 = q6();
        if (q6 == null || !q6.O) {
            return;
        }
        R6(AdClickContext.TEXT);
    }
}
