package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: Type1CommentVideoViewHolder.kt */
/* loaded from: classes4.dex */
public final class mtp0 extends klr {
    public final afg b0;

    public mtp0(ViewGroup viewGroup, afg afgVar, g3f0 g3f0Var, String str) {
        super(R.layout.type1_video_comment, viewGroup, str, afgVar, g3f0Var);
        this.b0 = afgVar;
        F6(R.color.type1_video_counters);
    }

    @Override // xsna.ib6, xsna.vif0
    /* renamed from: B6 */
    public final void i6(iag iagVar) {
        super.i6(iagVar);
        I6(iagVar);
        M6();
        this.A.setTextSize(14.0f);
        G6(iagVar, 434, new dp0(22, this, iagVar));
        O6();
    }

    @Override // xsna.ib6
    public final void v6() {
        f4m.y(iah0.a((getAbsoluteAdapterPosition() == 1 || (getAbsoluteAdapterPosition() == 0 && getItemViewType() == 435)) ? 12 : 10), this.C);
    }
}
