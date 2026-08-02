package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.rating.VkStaticRatingBar;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.tlo0;
import xsna.xy80;

/* compiled from: CommunityMarksStatisticItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class w9h extends vfz<u9h> {
    public final ConstraintLayout l;
    public final TextView m;
    public final VkStaticRatingBar n;
    public final TextView o;
    public final Guideline p;
    public final t9h q;

    public w9h(ViewGroup viewGroup, boolean z, rj1 rj1Var, int i) {
        super(e0n.a(R.layout.community_sorted_rating_marks_header, viewGroup, z));
        this.l = (ConstraintLayout) this.itemView.findViewById(R.id.constraint_layout);
        TextView textView = (TextView) this.itemView.findViewById(R.id.mark_tv);
        this.m = textView;
        this.n = (VkStaticRatingBar) this.itemView.findViewById(R.id.rating_view);
        this.o = (TextView) this.itemView.findViewById(R.id.mark_description_tv);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.mark_list_r_v);
        this.p = (Guideline) this.itemView.findViewById(R.id.dividing_marks_list_line);
        t9h t9hVar = new t9h();
        t9hVar.x0(x9h.class, new wh6(17));
        this.q = t9hVar;
        xy80.c cVar = new xy80.c() { // from class: xsna.v9h
            @Override // xsna.xy80.c
            public final void a(int i2) {
                w9h.this.h6(i2);
            }
        };
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
        textView.setTextSize(58.0f);
        recyclerView.setAdapter(t9hVar);
        xy80 xy80Var = ((CommunityReviewsView) rj1Var.c).f;
        if (xy80Var != null) {
            xy80Var.a(cVar);
        }
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(u9h u9hVar) {
        u9h u9hVar2 = u9hVar;
        e0n.b(this.itemView, u9hVar2.g);
        Resources resources = this.itemView.getResources();
        float f = u9hVar2.c;
        Float valueOf = Float.valueOf(f);
        tlo0.d dVar = u9hVar2.b;
        this.l.setContentDescription(resources.getString(R.string.marks_statistic_content_description, valueOf, tlo0.b.a(dVar, this.itemView.getContext())));
        this.m.setText(u9hVar2.d);
        this.n.setRating(f);
        this.o.setText(tlo0.b.a(dVar, this.itemView.getContext()));
        this.q.setItems(u9hVar2.f);
        h6(this.itemView.getContext().getResources().getConfiguration().orientation);
    }

    public final void h6(int i) {
        Context context = this.itemView.getContext();
        HashSet hashSet = iah0.a;
        boolean c = fnj.c(context);
        Guideline guideline = this.p;
        if (c && i == 1) {
            guideline.setGuidelinePercent(1.0f);
        } else {
            guideline.setGuidelinePercent(0.5f);
        }
    }
}
