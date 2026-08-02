package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.yandex.messaging.internal.urlpreview.reporter.UrlPreviewReporter$Element;

/* loaded from: classes15.dex */
public final /* synthetic */ class bnh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ enh b;

    public /* synthetic */ bnh(enh enhVar, int i) {
        this.a = i;
        this.b = enhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        enh enhVar = this.b;
        switch (i) {
            case 0:
                sh21 sh21Var = enhVar.z;
                ye0 ye0Var = (ye0) enhVar.b;
                sh21Var.a(ye0Var, UrlPreviewReporter$Element.TurboButton);
                enhVar.x.C(Uri.parse(((lh21) ye0Var).w));
                break;
            case 1:
                sh21 sh21Var2 = enhVar.z;
                ye0 ye0Var2 = (ye0) enhVar.b;
                sh21Var2.a(ye0Var2, UrlPreviewReporter$Element.Image);
                enhVar.x.C(if90.c(((lh21) ye0Var2).a));
                break;
            default:
                r1s r1sVar = enhVar.H;
                if (!((AnimatedVectorDrawableCompat) r1sVar.c).isRunning()) {
                    r1sVar.s();
                    enhVar.Ug();
                    break;
                } else {
                    ((AnimatedVectorDrawableCompat) r1sVar.c).stop();
                    ImageButton imageButton = (ImageButton) r1sVar.b;
                    imageButton.setImageDrawable((VectorDrawableCompat) r1sVar.w);
                    imageButton.setVisibility(0);
                    break;
                }
        }
    }
}
