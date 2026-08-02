package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: Type3CommentVideoViewHolder.kt */
/* loaded from: classes4.dex */
public final class otp0 extends klr {
    public final afg b0;

    public otp0(ViewGroup viewGroup, afg afgVar, g3f0 g3f0Var, String str) {
        super(R.layout.type3_video_comment, viewGroup, str, afgVar, g3f0Var);
        this.b0 = afgVar;
        F6(R.color.type3_video_counters);
        View view = this.s;
        if (view != null) {
            awt0.j(cn70.b(8), view);
        }
        this.itemView.findViewById(R.id.show_more).setOnClickListener(this);
    }

    @Override // xsna.ib6, xsna.vif0
    /* renamed from: B6 */
    public final void i6(iag iagVar) {
        super.i6(iagVar);
        I6(iagVar);
        M6();
        this.A.setTextSize(14.0f);
        G6(iagVar, 436, new com.vk.movika.sdk.base.ui.m(27, this, iagVar));
        O6();
    }

    @Override // xsna.ib6
    public final void v6() {
        f4m.y(iah0.a(getAbsoluteAdapterPosition() == 1 ? 12 : 10), this.C);
    }
}
