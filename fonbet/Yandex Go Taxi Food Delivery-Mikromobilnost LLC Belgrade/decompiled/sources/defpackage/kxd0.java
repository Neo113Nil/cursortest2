package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.views.AnimatedProgressView;

/* loaded from: classes15.dex */
public final class kxd0 extends x0 {
    public final Context N;
    public final Resources O;
    public final ProgressBar P;
    public final AnimatedProgressView Q;
    public final TextView R;
    public final TextView S;
    public final TextView T;
    public final CheckBox U;

    public kxd0(View view, lbb0 lbb0Var) {
        super(view);
        this.N = view.getContext();
        this.O = view.getResources();
        this.P = (ProgressBar) view.findViewById(e9h0.poll_message_vote_progress);
        this.Q = (AnimatedProgressView) view.findViewById(e9h0.poll_message_vote_percent);
        this.R = (TextView) view.findViewById(e9h0.poll_answer_option_text);
        this.S = (TextView) view.findViewById(e9h0.poll_message_vote_stat_percent);
        this.T = (TextView) view.findViewById(e9h0.poll_message_vote_stat_amount);
        this.U = (CheckBox) view.findViewById(e9h0.poll_message_select_option);
        view.setOnClickListener(new fx00(24, this, lbb0Var));
    }
}
