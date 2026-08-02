package defpackage;

import android.view.View;
import android.widget.ImageButton;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.yandex.messaging.internal.urlpreview.reporter.UrlPreviewReporter$Element;

/* loaded from: classes15.dex */
public final /* synthetic */ class jo31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo31 b;

    public /* synthetic */ jo31(lo31 lo31Var, int i) {
        this.a = i;
        this.b = lo31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        lo31 lo31Var = this.b;
        switch (i) {
            case 0:
                jcz0 jcz0Var = lo31Var.z;
                ye0 ye0Var = (ye0) lo31Var.b;
                jcz0Var.f(lo31Var.w, ((qh21) ye0Var).z, lo31Var.c);
                lo31Var.B.a(ye0Var, UrlPreviewReporter$Element.OpenVideo);
                break;
            case 1:
                r1s r1sVar = lo31Var.J;
                if (!((AnimatedVectorDrawableCompat) r1sVar.c).isRunning()) {
                    r1sVar.s();
                    lo31Var.Vg();
                    break;
                } else {
                    lo31Var.y.c(lo31Var.D);
                    ((AnimatedVectorDrawableCompat) r1sVar.c).stop();
                    ImageButton imageButton = (ImageButton) r1sVar.b;
                    imageButton.setImageDrawable((VectorDrawableCompat) r1sVar.w);
                    imageButton.setVisibility(0);
                    break;
                }
            default:
                jcz0 jcz0Var2 = lo31Var.z;
                ye0 ye0Var2 = (ye0) lo31Var.b;
                jcz0Var2.f(lo31Var.w, ((qh21) ye0Var2).z, lo31Var.c);
                lo31Var.B.a(ye0Var2, UrlPreviewReporter$Element.OpenVideo);
                break;
        }
    }
}
