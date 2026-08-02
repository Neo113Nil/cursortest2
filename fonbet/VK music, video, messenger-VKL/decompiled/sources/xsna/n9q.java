package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.actions.Action;
import com.vk.feed.core.models.news.ExpertCard;
import com.vkontakte.android.R;

/* compiled from: ExpertCardHolder.kt */
/* loaded from: classes4.dex */
public final class n9q extends qi6<ExpertCard> implements View.OnClickListener {
    public final View C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public n9q(ViewGroup viewGroup) {
        super(R.layout.newsfeed_expert_card, viewGroup);
        this.C = this.itemView.findViewById(R.id.star_view);
        this.D = (TextView) this.itemView.findViewById(R.id.value);
        this.E = (TextView) this.itemView.findViewById(R.id.title);
        this.F = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(ExpertCard expertCard) {
        ExpertCard expertCard2 = expertCard;
        this.E.setText(expertCard2.i);
        this.F.setText(expertCard2.j);
        double d = expertCard2.k;
        this.D.setText(d < 1000.0d ? uqm0.b.format(d) : uqm0.f((long) d));
        this.C.setBackgroundTintList(ColorStateList.valueOf(dhr0.t.c(expertCard2.l ? R.attr.vk_ui_accent_orange : R.attr.vk_ui_accent_gray)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        ExpertCard q6 = q6();
        Action action = q6 != null ? q6.m : null;
        if (action == null) {
            hd60.a().u(this.itemView.getContext());
        } else {
            hd60.a().v(action, this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
            hd60.a().y();
        }
    }
}
