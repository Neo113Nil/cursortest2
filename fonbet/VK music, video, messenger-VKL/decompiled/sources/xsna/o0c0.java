package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: PostBadgeCommentViewHolder.kt */
/* loaded from: classes4.dex */
public final class o0c0 extends ry5 {
    public static final int f0 = iah0.a(8.0f);
    public static final int g0 = iah0.a(12.0f);
    public final View c0;
    public final View d0;
    public final xb5 e0;

    public o0c0(ViewGroup viewGroup, afg afgVar, g3f0 g3f0Var, String str) {
        super(R.layout.post_comment_badge, viewGroup, str, afgVar, g3f0Var);
        View findViewById = this.itemView.findViewById(R.id.container);
        this.c0 = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.comment_author_liked);
        this.d0 = findViewById2;
        this.e0 = new xb5(findViewById2, this, afgVar);
        new os9(6).e(findViewById, this.H, findViewById2);
    }

    @Override // xsna.ib6
    public final String A6(iag iagVar) {
        return pvo0.i(true, iagVar.C(), false, false);
    }

    @Override // xsna.ry5, xsna.jlr, xsna.ib6, xsna.vif0
    /* renamed from: B6 */
    public final void i6(iag iagVar) {
        super.i6(iagVar);
        this.e0.a(iagVar);
    }

    @Override // xsna.ib6
    public final void E6(iag iagVar) {
        super.E6(iagVar);
        this.e0.a(iagVar);
    }

    @Override // xsna.ib6
    public final void v6() {
        f4m.q(getLayoutPosition() == 0 ? f0 : g0, this.y);
    }
}
