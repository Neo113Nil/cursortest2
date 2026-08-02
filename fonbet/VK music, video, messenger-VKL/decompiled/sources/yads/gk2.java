package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class gk2 implements v31 {
    public static final /* synthetic */ qcy[] c = {wb.a(gk2.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), wb.a(gk2.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};
    public final mn2 a;
    public final mn2 b;

    public gk2(ImageView imageView, ProgressBar progressBar) {
        this.a = nn2.a(imageView);
        this.b = nn2.a(progressBar);
    }

    @Override // yads.v31
    public final void a(Drawable drawable) {
        if (drawable == null) {
            mn2 mn2Var = this.b;
            qcy qcyVar = c[1];
            ProgressBar progressBar = (ProgressBar) mn2Var.a.get();
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        mn2 mn2Var2 = this.a;
        qcy[] qcyVarArr = c;
        qcy qcyVar2 = qcyVarArr[0];
        ImageView imageView = (ImageView) mn2Var2.a.get();
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        mn2 mn2Var3 = this.b;
        qcy qcyVar3 = qcyVarArr[1];
        ProgressBar progressBar2 = (ProgressBar) mn2Var3.a.get();
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
    }
}
