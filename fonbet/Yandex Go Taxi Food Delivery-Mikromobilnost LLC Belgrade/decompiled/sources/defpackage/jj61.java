package defpackage;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public final class jj61 extends ia71 {
    public final no6 c;

    public jj61(ImageView imageView, no6 no6Var) {
        super(imageView);
        this.c = no6Var;
    }

    @Override // defpackage.ia71
    public final /* bridge */ /* synthetic */ boolean c(View view, Object obj) {
        return true;
    }

    @Override // defpackage.ia71
    public final void e(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        cu81 cu81Var = ((gt81) obj).a;
        if (cu81Var == null) {
            return;
        }
        imageView.setForeground(null);
        imageView.setBackground(null);
        this.c.a(cu81Var, new gp51(4, this));
    }
}
