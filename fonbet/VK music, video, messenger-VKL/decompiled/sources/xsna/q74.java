package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;

/* compiled from: AttachmentPollV3Holder.kt */
/* loaded from: classes4.dex */
public final class q74 extends rp6<xmb0, NewsEntry> implements View.OnClickListener {
    public final TextView E;

    public q74(ViewGroup viewGroup) {
        super(R.layout.attach_poll_view_v3, viewGroup);
        TextView textView = (TextView) this.itemView.findViewById(R.id.attach_poll_title);
        textView.setOnClickListener(this);
        this.E = textView;
    }

    @Override // xsna.rp6
    public final void R6(xmb0 xmb0Var) {
        this.E.setText(xmb0Var.k);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u1c0 J0 = J0();
        T t = this.C;
        if (J0 == null || t == 0) {
            return;
        }
        this.D.sa(new NewsfeedExternalAction.Navigation.p(J0, ((xmb0) t).j));
    }
}
