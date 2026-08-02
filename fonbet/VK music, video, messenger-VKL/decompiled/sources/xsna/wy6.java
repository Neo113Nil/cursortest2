package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: BigArticleHolder.kt */
/* loaded from: classes4.dex */
public final class wy6 extends oo3 {
    public x64 Z;

    public wy6(ViewGroup viewGroup, u2b0 u2b0Var, h170 h170Var) {
        super(R.layout.attach_article, viewGroup);
    }

    @Override // xsna.oo3, xsna.blc0
    public final void Z1(x64 x64Var) {
        this.Z = x64Var;
    }

    @Override // xsna.oo3, xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.Z;
        if (x64Var != null) {
            x64Var.a(this.C);
        } else {
            super.onClick(view);
        }
    }
}
