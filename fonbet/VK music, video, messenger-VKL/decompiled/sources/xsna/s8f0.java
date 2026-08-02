package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.assessment.BadAssessmentReason;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ReasonAdapter.kt */
/* loaded from: classes7.dex */
public final class s8f0 extends RecyclerView.Adapter<a> {
    public final List<BadAssessmentReason> c;
    public final com.vk.im.ui.fragments.b d;
    public final a8 e;

    /* compiled from: ReasonAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final TextView l;
        public final View m;

        public a(View view) {
            super(view);
            this.l = (TextView) view.findViewById(R.id.text_view);
            this.m = view.findViewById(R.id.check_view);
        }
    }

    public s8f0(List list, com.vk.im.ui.fragments.b bVar, a8 a8Var) {
        this.c = list;
        this.d = bVar;
        this.e = a8Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        BadAssessmentReason badAssessmentReason = this.c.get(i);
        aVar2.l.setText(badAssessmentReason.i());
        bwt0.p0(aVar2.m, ((Boolean) this.e.invoke(badAssessmentReason)).booleanValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, R.layout.voip_call_qality_bad_assessment_reason_item, viewGroup, false);
        a aVar = new a(b);
        b.setOnClickListener(new r8f0(0, aVar, this));
        return aVar;
    }
}
