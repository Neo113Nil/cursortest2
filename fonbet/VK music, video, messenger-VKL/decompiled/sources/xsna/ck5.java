package xsna;

import android.R;
import android.graphics.drawable.GradientDrawable;

/* compiled from: AutoSuggestStickersHolder.kt */
/* loaded from: classes5.dex */
public final class ck5 implements b780 {
    public final /* synthetic */ GradientDrawable b;
    public final /* synthetic */ bk5 c;

    public ck5(GradientDrawable gradientDrawable, bk5 bk5Var) {
        this.b = gradientDrawable;
        this.c = bk5Var;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        GradientDrawable gradientDrawable = this.b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(this.c.itemView.getContext().getColor(R.color.transparent));
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}
