package xsna;

import android.view.ViewGroup;
import com.vk.comments.core.BoardComment;
import com.vk.core.view.ExpandableTextViewGroup;
import com.vkontakte.android.R;

/* compiled from: ExpandableCommentViewHolder.kt */
/* loaded from: classes17.dex */
public final class d8q extends jlr {
    public final gzs<s3q0> Y;
    public final boolean Z;
    public final ExpandableTextViewGroup a0;

    public d8q(ViewGroup viewGroup, yeg yegVar, g3f0 g3f0Var, gzs gzsVar, boolean z) {
        super(R.layout.expandable_comment_view_holder, viewGroup, yegVar, g3f0Var, null);
        this.Y = gzsVar;
        this.Z = z;
        ExpandableTextViewGroup expandableTextViewGroup = (ExpandableTextViewGroup) this.itemView.findViewById(R.id.expandable_tv);
        this.a0 = expandableTextViewGroup;
        g7 g7Var = new g7(this, 17);
        this.H.setOnTouchListener(this);
        this.H.setOnClickListener(this);
        D6(this.H);
        expandableTextViewGroup.setMaxLines(3);
        expandableTextViewGroup.setExpandText(this.itemView.getContext().getString(R.string.show_more));
        expandableTextViewGroup.setOnExpandClickListener(g7Var);
        yeg yegVar2 = yegVar != null ? yegVar : null;
        Q4(yegVar2 != null ? yegVar2.c : null);
    }

    @Override // xsna.jlr, xsna.ib6, xsna.vif0
    /* renamed from: B6, reason: merged with bridge method [inline-methods] */
    public final void i6(iag iagVar) {
        super.i6(iagVar);
        bwt0.p0(this.itemView.findViewById(R.id.post_view), false);
        bwt0.p0(this.A, false);
        BoardComment boardComment = (BoardComment) iagVar;
        CharSequence charSequence = boardComment.e;
        ExpandableTextViewGroup expandableTextViewGroup = this.a0;
        expandableTextViewGroup.setText(charSequence);
        bwt0.p0(expandableTextViewGroup, !drm0.N(boardComment.e));
        if (boardComment.d) {
            expandableTextViewGroup.b();
        } else {
            expandableTextViewGroup.a();
            ViewGroup.LayoutParams layoutParams = expandableTextViewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            expandableTextViewGroup.requestLayout();
        }
        this.Y.invoke();
        P3(this.Z ? false : boardComment.y);
        ((c0n) this.itemView).setTouchEnabled(boardComment.t);
        if (boardComment.t) {
            this.itemView.setAlpha(1.0f);
        } else {
            this.itemView.setAlpha(0.4f);
        }
    }
}
