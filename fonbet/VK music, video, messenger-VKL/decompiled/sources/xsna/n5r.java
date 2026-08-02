package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.feed.core.models.feedback.FeedbackPoll;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;

/* compiled from: FeedbackBlockHolder.kt */
/* loaded from: classes4.dex */
public final class n5r extends qi6<FeedbackPoll> implements View.OnClickListener {
    public final p870 C;
    public final NewsfeedRouter D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final View H;

    public n5r(ViewGroup viewGroup, p870 p870Var, NewsfeedRouter newsfeedRouter) {
        super(R.layout.news_feedback_poll, viewGroup);
        this.C = p870Var;
        this.D = newsfeedRouter;
        this.E = (TextView) this.itemView.findViewById(R.id.title);
        this.F = (TextView) this.itemView.findViewById(R.id.subtitle);
        TextView textView = (TextView) this.itemView.findViewById(R.id.button);
        this.G = textView;
        View findViewById = this.itemView.findViewById(R.id.menu);
        this.H = findViewById;
        textView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(FeedbackPoll feedbackPoll) {
        FeedbackPoll.Banner banner = feedbackPoll.i;
        this.E.setText(banner.b);
        this.F.setText(banner.c);
        this.G.setText(banner.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        if (epx.f(view, this.G)) {
            FeedbackPoll q6 = q6();
            if (q6 != null) {
                this.D.A(this.itemView.getContext(), q6);
                return;
            }
            return;
        }
        View view2 = this.H;
        if (epx.f(view, view2)) {
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view2.getContext();
            e.b bVar = new e.b(view2, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            VkContextMenu.c.c(bVar, R.string.hide, null, false, null, new fbh(this, 13), 30);
            bVar.j();
        }
    }
}
