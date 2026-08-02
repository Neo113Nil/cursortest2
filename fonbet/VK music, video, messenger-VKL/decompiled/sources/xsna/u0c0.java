package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: PostCommentMilkshakeViewHolder.kt */
/* loaded from: classes4.dex */
public final class u0c0 extends jlr {
    public static final int b0 = iah0.a(8.0f);
    public static final int c0 = iah0.a(12.0f);
    public final View Y;
    public final View Z;
    public final xb5 a0;

    public u0c0(ViewGroup viewGroup, afg afgVar, g3f0 g3f0Var, String str) {
        super(R.layout.post_comment_milkshake, viewGroup, afgVar, g3f0Var, str);
        View findViewById = this.itemView.findViewById(R.id.container);
        this.Y = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.comment_author_liked);
        this.Z = findViewById2;
        this.a0 = new xb5(findViewById2, this, afgVar);
        this.H.setOnTouchListener(this);
        this.H.setOnClickListener(this);
        D6(this.H);
        new os9(6).e(findViewById, this.H, findViewById2);
    }

    @Override // xsna.ib6
    public final String A6(iag iagVar) {
        return pvo0.i(true, iagVar.C(), false, false);
    }

    @Override // xsna.jlr, xsna.ib6, xsna.vif0
    /* renamed from: B6 */
    public final void i6(iag iagVar) {
        super.i6(iagVar);
        this.a0.a(iagVar);
    }

    @Override // xsna.ib6
    public final void E6(iag iagVar) {
        super.E6(iagVar);
        this.a0.a(iagVar);
    }

    @Override // xsna.ib6
    public final void v6() {
        f4m.q(getLayoutPosition() == 0 ? b0 : c0, this.y);
    }
}
