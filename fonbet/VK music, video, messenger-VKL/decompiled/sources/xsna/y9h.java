package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.vkontakte.android.R;

/* compiled from: CommunityMarksStatisticParticularViewHolder.kt */
/* loaded from: classes18.dex */
public final class y9h extends vfz<x9h> {
    public final ConstraintLayout l;
    public final TextView m;
    public final LinearProgressIndicator n;
    public final TextView o;

    public y9h(ViewGroup viewGroup) {
        super(R.layout.community_marks_statistic_particular_item, viewGroup);
        this.l = (ConstraintLayout) this.itemView.findViewById(R.id.marks_stat_cl);
        this.m = (TextView) this.itemView.findViewById(R.id.mark_tv);
        this.n = (LinearProgressIndicator) this.itemView.findViewById(R.id.progress_bar);
        this.o = (TextView) this.itemView.findViewById(R.id.marks_count_tv);
    }

    @Override // xsna.vfz
    public final void W5(x9h x9hVar) {
        x9h x9hVar2 = x9hVar;
        this.m.setText(String.valueOf(x9hVar2.b));
        this.o.setText(String.valueOf(x9hVar2.c));
        this.n.setProgress(x9hVar2.d);
        this.l.setContentDescription(x9hVar2.e);
    }
}
