package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class h451 extends n451 {
    public final tls b;
    public final AppCompatImageView c;

    public h451(Context context, tls tlsVar) {
        this.b = tlsVar;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.c = appCompatImageView;
        appCompatImageView.setTransitionName("plaque_icon_widget_transition_name");
        appCompatImageView.setAdjustViewBounds(true);
    }

    @Override // defpackage.drd0
    public final View a() {
        return this.c;
    }

    @Override // defpackage.n451
    public final void c(eg20 eg20Var) {
        this.c.setImageDrawable(((of20) eg20Var).e.a);
    }

    @Override // defpackage.n451
    public final tls d() {
        return this.b;
    }

    public final String toString() {
        return "Icon";
    }
}
