package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.PollOption;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: StickersPollOptionViewHolder.kt */
/* loaded from: classes6.dex */
public final class ibl0 extends vif0<PollOption> {
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final rqb0 q;

    public ibl0(View view, ebl0 ebl0Var) {
        super(view);
        this.n = (TextView) view.findViewById(R.id.text);
        this.o = (TextView) view.findViewById(R.id.count);
        this.p = (TextView) view.findViewById(R.id.rate);
        rqb0 rqb0Var = new rqb0();
        this.q = rqb0Var;
        rqb0Var.a = dhr0.Y(R.attr.vk_ui_background_accent_themed_alpha, view.getContext());
        rqb0Var.b = dhr0.Y(R.attr.vk_ui_background_secondary, view.getContext());
        rqb0Var.c = cn70.a() * 8.0f;
        this.itemView.setBackground(rqb0Var);
        bwt0.i0(this.itemView, new csk0(1, ebl0Var, this));
    }

    @Override // xsna.vif0
    public final void i6(PollOption pollOption) {
        PollOption pollOption2 = pollOption;
        this.n.setText(pollOption2.c);
        int i = pollOption2.d;
        this.o.setText(a6(R.plurals.story_statistics_stickers_poll_option_count, i, Integer.valueOf(i)));
        Serializer.c<PollOption> cVar = PollOption.CREATOR;
        float f = pollOption2.e;
        this.p.setText(String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(an10.b(f))}, 1)));
        this.q.a(Math.round((f / 100) * 10000), false);
    }
}
